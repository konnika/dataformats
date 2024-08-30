package konrad.dataformats.core.mappings;

import konrad.dataformats.core.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OneToOneArrayMapping implements Mapping {
    private final DataFormatId fromFormatId;
    private final DataFormatId toFormatId;
    private final Map<Path, Path> paths;
    private final Type type = Type.STRING;

    public OneToOneArrayMapping() {
        this.fromFormatId = DataFormatId.PROS_TRANSACTION_METADATA_UPDATE;
        this.toFormatId = DataFormatId.PROS_TRANSACTION_METADATA_UPDATE_MARZIPAN;
        this.paths = new HashMap<>();
        paths.put(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].schluessel"), new Path("verwaltungsdaten.verwaltungsdatenwert.[].schluessel"));
        paths.put(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].text"), new Path("verwaltungsdaten.verwaltungsdatenwert.[].stringWert"));
        paths.put(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].checkbox"), new Path("verwaltungsdaten.verwaltungsdatenwert.[].checkbox"));
        paths.put(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].datum"), new Path("verwaltungsdaten.verwaltungsdatenwert.[].dateWert"));
    }

    @Override
    public void applyTo(Data in, Data out) {
        for (var entry : paths.entrySet()) {
            var from = entry.getKey();
            var to = entry.getValue();

            var beforeValuesInArray = in.getValuesIgnoringIndices(from);
            for (var value : beforeValuesInArray) {
                var before = in.getValue(value.path());
                if (before != null && before.hasObject()) {
                    // FIXME this assumes that there is only one array index in the path
                    var pathOfFirstArray = new Path(before.path().firstConcreteArrayElement());
                    var afterPath = to.untilFirstAbstractArray().concat(pathOfFirstArray).concat(to.afterFirstAbstractArray());
                    var after = mapValueTypeSafe(before, afterPath);
                    out.addOrFailIfHasObject(after);
                }

            }
        }
    }

    @Override
    public boolean matches(DataFormatId in, DataFormatId out) {
        return Objects.equals(in, fromFormatId) && Objects.equals(out, toFormatId);
    }

    private Value mapValueTypeSafe(Value value, Path to) {
        if (value.is(type)) {
            var beforeString = (String) value.object();
            var afterString = beforeString.toUpperCase();
            return new Value(to, type, afterString);
        }

        throw new RuntimeException("Unexpected Value type: " + value.type());
    }

    private static String mapValue(String fromValue) {
        return fromValue.toUpperCase();
    }
}
