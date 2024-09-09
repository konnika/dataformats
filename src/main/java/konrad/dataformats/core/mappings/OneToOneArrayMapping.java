package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Data;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Mapping;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.Type;
import konrad.dataformats.core.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OneToOneArrayMapping implements Mapping {
    private final DataFormatId fromFormatId;
    private final DataFormatId toFormatId;
    private final Map<Path, Path> paths;

    public OneToOneArrayMapping() {
        this.fromFormatId = DataFormatId.PROS_TRANSACTION_METADATA_UPDATE;
        this.toFormatId = DataFormatId.PROS_TRANSACTION_METADATA_UPDATE_MARZIPAN;
        this.paths = new HashMap<>();
        paths.put(new Path("benutzername"), new Path("username"));
        paths.put(new Path("institutsname"), new Path("institutsname"));
        paths.put(new Path("kopfdaten.kundendaten.kundennummer"), new Path("kundendaten.kundennummer"));
        paths.put(new Path("kopfdaten.kundendaten.name.vorname"), new Path("kundendaten.vorname"));
        paths.put(new Path("kopfdaten.kundendaten.name.nachname"), new Path("kundendaten.nachname"));
        paths.put(new Path("kopfdaten.kundendaten.name.titel"), new Path("kundendaten.titel"));
        paths.put(new Path("kopfdaten.kundendaten.nameFrau.vorname"), new Path("kundendaten.vornameFrau"));
        paths.put(new Path("kopfdaten.kundendaten.nameFrau.nachname"), new Path("kundendaten.nachnameFrau"));
        paths.put(new Path("kopfdaten.kundendaten.nameFrau.titel"), new Path("kundendaten.titelFrau"));
        paths.put(new Path("kopfdaten.kundendaten.adresse.strasse"), new Path("kundendaten.strasse"));
        paths.put(new Path("kopfdaten.kundendaten.adresse.plz"), new Path("kundendaten.plz"));
        paths.put(new Path("kopfdaten.kundendaten.adresse.ort"), new Path("kundendaten.ort"));
        paths.put(new Path("kopfdaten.kundendaten.adresse.land"), new Path("kundendaten.land"));
        paths.put(new Path("kopfdaten.verwaltungsdaten.iban"), new Path("institutsdaten.iban"));
        paths.put(new Path("kopfdaten.verwaltungsdaten.bic"), new Path("institutsdaten.bic"));
        paths.put(new Path("kopfdaten.verwaltungsdaten.kontonummer"), new Path("institutsdaten.kontonummer"));
        paths.put(new Path("kopfdaten.verwaltungsdaten.betriebsstelle"), new Path("institutsdaten.betriebsstelle"));
        paths.put(new Path("kopfdaten.verwaltungsdaten.kundenansprechpartner"), new Path("institutsdaten.berater"));

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

            if (from.isArrayPath()) {
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
            } else {
                var before = in.getValue(from);
                if (before != null && before.hasObject()) {
                    var after = mapValueTypeSafe(before, to);
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
        if (value.is(Type.STRING)) {
            var beforeString = (String) value.object();
            var afterString = beforeString.toUpperCase();
            return new Value(to, afterString);
        }

        if (value.is(Type.BOOLEAN)) {
            var before = (Boolean) value.object();
            var after = before;
            return new Value(to, after);
        }

        throw new RuntimeException("Unexpected Value object in " + value.path() + ": " + value.object().getClass());
    }
}
