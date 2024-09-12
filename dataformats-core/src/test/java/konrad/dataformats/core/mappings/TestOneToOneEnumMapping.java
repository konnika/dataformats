package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Data;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Mapping;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.TestDataFormats;
import konrad.dataformats.core.Type;
import konrad.dataformats.core.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TestOneToOneEnumMapping implements Mapping { // TODO remove
    private final DataFormatId fromFormatId;
    private final DataFormatId toFormatId;
    private final Map<Path, Path> paths;
    private final Type typeFrom = Type.enumType("FRAU", "HERR", "FIRMA", "EHELEUTE", "HERRUNDFRAU");
    private final Type typeTo = Type.enumType("ANREDE_FRAU", "ANREDE_HERR", "ANREDE_FIRMA", "ANREDE_EHELEUTE", "ANREDE_HERRUNDFRAU");

    public TestOneToOneEnumMapping() {
        this.fromFormatId = TestDataFormats.PROS_TRANSACTION_METADATA_UPDATE;
        this.toFormatId = TestDataFormats.PROS_TRANSACTION_METADATA_UPDATE_MARZIPAN;
        this.paths = new HashMap<>();
        paths.put(new Path("kopfdaten.kundendaten.anrede"), new Path("kundendaten.anrede"));
    }

    @Override
    public void applyTo(Data in, Data out) {
        for (var entry : paths.entrySet()) {
            var from = entry.getKey();
            var to = entry.getValue();

            var before = in.getValue(from);
            if (before != null && before.hasObject()) {
                var after = mapValueTypeSafe(before, to);
                out.addOrFailIfHasObject(after);
            }
        }
    }

    @Override
    public boolean matches(DataFormatId in, DataFormatId out) {
        return Objects.equals(in, fromFormatId) && Objects.equals(out, toFormatId);
    }

    private Value mapValueTypeSafe(Value value, Path to) {
        if (value.is(typeFrom)) {
            var beforeString = (String) value.object();
            var afterString = typeTo.enumValueAt(typeFrom.enumValueIndex(beforeString));
            return new Value(to, afterString);
        }

        throw new RuntimeException("Unexpected Value object " + value.object().getClass() + " for type " + typeFrom);
    }

    private static String mapValue(String fromValue) {
        return fromValue.toUpperCase();
    }
}
