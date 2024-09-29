package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Data;
import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.Value;
import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.validation.DataFormatsException;
import konrad.dataformats.core.validation.Validations;

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
            throw new DataFormatsException("Path should be abstract: " + fromPath);
        }

        if (toPath.isConcreteArrayPath()) {
            throw new DataFormatsException("Path should be abstract: " + toPath);
        }
    }

    @Override
    public void applyTo(Data in, Data out) {
        var paths = fromPath.allConcretePaths(in.toMap());

        for (var path : paths) {
            var before = in.getValue(path);
            if (before != null && before.hasObject()) {
                var afterObject = mapValue(before, toPath);
                var afterPath = path.copyArrayIndicesTo(toPath);
                var afterValue = new Value(afterPath, afterObject);
                out.addOrFailIfHasObject(afterValue);
            }
        }
    }

    @Override
    public boolean matches(DataFormatId in, DataFormatId out) {
        return Objects.equals(in, fromFormat.id()) && Objects.equals(out, toFormat.id());
    }

    private Object mapValue(Value value, Path toPath) {
        var fromType = fromFormat.get(value.path().asAbstractPath()).type();
        var toType = toFormat.get(toPath.asAbstractPath()).type();

        if (fromType.equals(toType)) {
            return value.object();
        }
        if (fromType instanceof EnumType fromEnum && toType instanceof EnumType toEnum) {
            if (fromEnum.enumValueCount() == toEnum.enumValueCount()) {
                var index = fromEnum.enumValueIndex((String) value.object());
                return toEnum.enumValueAt(index);
            }
            throw new DataFormatsException("Type conversion from enum " + fromType + " to enum " + toType + " is not possible because of a different number of values");
        }

        // TODO continue here: implement more conversions: Double<->BigDecimal, String<->Enum
        throw new DataFormatsException("Type conversion from " + fromType + " to " + toType + " is not yet supported. Paths: " + fromPath + ", " + toPath);
    }
}
