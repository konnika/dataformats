package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Data;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Mapping;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.TestDataFormats;
import konrad.dataformats.core.Type;
import konrad.dataformats.core.Value;

import java.util.Objects;

public class TestFirstSimpleMapping implements Mapping { // TODO remove
    private final DataFormatId fromFormatId;
    private final DataFormatId toFormatId;
    private final Path fromPath;
    private final Path toPath;
    private final Type fromType;
    private final Type toType;

    public TestFirstSimpleMapping() {
        this.fromFormatId = TestDataFormats.PROS_TRANSACTION_METADATA_UPDATE;
        this.fromPath = new Path("benutzername");
        this.fromType = Type.STRING;

        this.toFormatId = TestDataFormats.PROS_TRANSACTION_METADATA_UPDATE_ENGLISH;
        this.toPath = new Path("user");
        this.toType = Type.STRING;
    }

    @Override
    public void applyTo(Data in, Data out) {
        var before = in.getValue(fromPath);
        if (before != null && before.hasObject()) {
            var after = mapValueTypeSafe(before);
            out.addOrFailIfHasObject(after);
        }
    }

    @Override
    public boolean matches(DataFormatId in, DataFormatId out) {
        return Objects.equals(in, fromFormatId) && Objects.equals(out, toFormatId);
    }

    private Value mapValueTypeSafe(Value value) {
        if (value.is(fromType)) {
            var object = (String) value.object();
            var toValue = mapValue(object);
            return new Value(toPath, toValue);
        }

        throw new RuntimeException("Unexpected Value object " + value.object().getClass() + " for type " + fromType);
    }

    private static String mapValue(String fromValue) {
        return fromValue.toUpperCase();
    }
}
