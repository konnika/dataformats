package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Data;
import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.Validations;
import konrad.dataformats.core.Value;
import konrad.dataformats.core.ValueFormat;
import konrad.dataformats.core.types.EnumType;

import java.util.Objects;

public class OneToOneMapping implements Mapping {
    private final DataFormat fromFormat;
    private final DataFormat toFormat;
    private final Path fromPath;
    private final Path toPath;

    public OneToOneMapping(DataFormat fromFormat, DataFormat toFormat, Path fromPath, Path toPath) {
        this.fromFormat = Validations.validateNotNull(fromFormat, "fromFormat");
        this.toFormat = Validations.validateNotNull(toFormat, "toFormat");
        this.fromPath = Validations.validateNotNull(fromPath, "from");
        this.toPath = Validations.validateNotNull(toPath, "to");

        validate();
    }

    private void validate() {
        if (fromPath.isConcreteArrayPath()) {
            throw new RuntimeException("Path should be abstract: " + fromPath);
        }

        if (toPath.isConcreteArrayPath()) {
            throw new RuntimeException("Path should be abstract: " + toPath);
        }
    }

    @Override
    public void applyTo(Data in, Data out) {
        if (fromPath.isArrayPath()) {
            var beforeValuesInArray = in.getValuesIgnoringIndices(fromPath);
            for (var value : beforeValuesInArray) {
                var before = in.getValue(value.path());
                if (before != null && before.hasObject()) {
                    // FIXME this assumes that there is only one array index in the path
                    var pathOfFirstArray = new Path(before.path().firstConcreteArrayElement());
                    var afterPath = toPath.untilFirstAbstractArray().concat(pathOfFirstArray).concat(toPath.afterFirstAbstractArray());
                    var afterObject = mapValue(before, afterPath);
                    var afterValue = new Value(afterPath, afterObject);
                    out.addOrFailIfHasObject(afterValue);
                }
            }
        } else {
            var before = in.getValue(fromPath);
            if (before != null && before.hasObject()) {
                var afterObject = mapValue(before, toPath);
                var afterValue = new Value(toPath, afterObject);
                out.addOrFailIfHasObject(afterValue);
            }
        }
    }

    @Override
    public boolean matches(DataFormatId in, DataFormatId out) {
        return Objects.equals(in, fromFormat.id()) && Objects.equals(out, toFormat.id());
    }

    private Object mapValue(Value value, Path toPath) {
        var fromType = fromFormat.get(value.path().asAbstractPath()).map(ValueFormat::type)
                .orElseThrow(() -> new RuntimeException("Value path (from) " + value.path() + " is not defined in DataFormat " + fromFormat.id()));
        var toType = toFormat.get(toPath.asAbstractPath()).map(ValueFormat::type)
                .orElseThrow(() -> new RuntimeException("Value path (to) " + value.path() + " is not defined in DataFormat " + fromFormat.id()));

        if (fromType.equals(toType)) {
            return value.object();
        }
        if (fromType instanceof EnumType fromEnum && toType instanceof EnumType toEnum) {
            if (fromEnum.enumValueCount() == toEnum.enumValueCount()) {
                var index = fromEnum.enumValueIndex((String) value.object());
                return toEnum.enumValueAt(index);
            }
            throw new RuntimeException("Type conversion from enum " + fromType + " to enum " + toType + " is not possible because of a different number of values");
        }

        // TODO continue here: implement more conversions
        throw new RuntimeException("Type conversion from " + fromType + " to " + toType + " is not yet supported. Paths: " + fromPath + ", " + toPath);
    }

    public static OneToOneMapping fromCsv(DataFormat from, DataFormat to, String line) {
        var parts = line.split(";");
        if (parts.length == 3) {
            return new OneToOneMapping(from, to, new Path(parts[1]), new Path(parts[2]));
        }
        throw new RuntimeException("Conversion CSV is expected to have these values per line: mapping id;path from;path to. Got " + line);
    }
}
