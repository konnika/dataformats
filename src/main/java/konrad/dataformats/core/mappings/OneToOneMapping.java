package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Data;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Mapping;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.Type;
import konrad.dataformats.core.Validations;
import konrad.dataformats.core.Value;

import java.util.Objects;

public class OneToOneMapping implements Mapping {
    private final DataFormatId fromFormatId;
    private final DataFormatId toFormatId;
    private final Path from;
    private final Path to;

    public OneToOneMapping(DataFormatId fromFormat, DataFormatId toFormat, Path fromPath, Path toPath) {
        this.fromFormatId = Validations.validateNotNull(fromFormat, "fromFormatId");
        this.toFormatId = Validations.validateNotNull(toFormat, "toFormatId");
        this.from = Validations.validateNotNull(fromPath, "from");
        this.to = Validations.validateNotNull(toPath, "to");

        validate();
    }

    private void validate() {
        if (from.isConcreteArrayPath()) {
            throw new RuntimeException("Path should be abstract: " + from);
        }

        if (to.isConcreteArrayPath()) {
            throw new RuntimeException("Path should be abstract: " + to);
        }
    }

    @Override
    public void applyTo(Data in, Data out) {
        if (from.isArrayPath()) {
            var beforeValuesInArray = in.getValuesIgnoringIndices(from);
            for (var value : beforeValuesInArray) {
                var before = in.getValue(value.path());
                if (before != null && before.hasObject()) {
                    // FIXME this assumes that there is only one array index in the path
                    var pathOfFirstArray = new Path(before.path().firstConcreteArrayElement());
                    var afterPath = to.untilFirstAbstractArray().concat(pathOfFirstArray).concat(to.afterFirstAbstractArray());
                    var afterObject = mapValue(before);
                    var afterValue = new Value(afterPath, afterObject);
                    out.addOrFailIfHasObject(afterValue);
                }
            }
        } else {
            var before = in.getValue(from);
            if (before != null && before.hasObject()) {
                var afterObject = mapValue(before);
                var afterValue = new Value(to, afterObject);
                out.addOrFailIfHasObject(afterValue);
            }
        }
    }

    @Override
    public boolean matches(DataFormatId in, DataFormatId out) {
        return Objects.equals(in, fromFormatId) && Objects.equals(out, toFormatId);
    }

    private Object mapValue(Value value) {
        // TODO consider from type and to type and apply the proper value conversion
        // TODO probably have to use the types from DataFormat

        if (value.is(Type.STRING)) {
            return Type.STRING.clazz().cast(value.object());
        }

        if (value.is(Type.BOOLEAN)) {
            return Type.BOOLEAN.clazz().cast(value.object());
        }

        throw new RuntimeException("Unexpected Value object in " + value.path() + ": " + value.object().getClass());
    }
}
