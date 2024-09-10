package konrad.dataformats.core;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataFormatTest {
    private final DataFormat dataFormat = TestDataFormats.transactionMetadataUpdate();

    @Test
    void containsWorks() {
        assertTrue(dataFormat.contains(new Path("benutzername")));
        assertTrue(dataFormat.contains(new Path("institutsname")));
        assertTrue(dataFormat.contains(new Path("kopfdaten.kundendaten.kundennummer")));
        assertTrue(dataFormat.contains(new Path("kopfdaten.kundendaten.nameFrau.nachname")));
        assertFalse(dataFormat.contains(new Path("xxx")));
    }

    @Test
    void getValuePathAndTypeWorks() {
        assertTrue(dataFormat.get(new Path("benutzername")).map(vf -> vf.has(Type.STRING)).orElse(false));
        assertTrue(dataFormat.get(new Path("institutsname")).map(vf -> vf.has(Type.STRING)).orElse(false));
        assertTrue(dataFormat.get(new Path("kopfdaten.kundendaten.kundennummer")).map(vf -> vf.has(Type.STRING)).orElse(false));
        assertTrue(dataFormat.get(new Path("kopfdaten.kundendaten.nameFrau.nachname")).map(vf -> vf.has(Type.STRING)).orElse(false));
    }

    @Test
    void enumWorks() {
        assertTrue(dataFormat.get(new Path("kopfdaten.kundendaten.anrede")).map(vf -> vf.has(Type.enumType("FRAU", "HERR", "FIRMA", "EHELEUTE", "HERRUNDFRAU"))).orElse(false));
        assertFalse(dataFormat.get(new Path("kopfdaten.kundendaten.anrede")).map(vf -> vf.has(Type.enumType("HERR", "FIRMA", "EHELEUTE", "HERRUNDFRAU", "FRAU"))).orElse(false));
        assertFalse(dataFormat.get(new Path("kopfdaten.kundendaten.anrede")).map(vf -> vf.has(Type.enumType("HERR", "FIRMA", "EHELEUTE", "HERRUNDFRAU"))).orElse(true));
        assertFalse(dataFormat.get(new Path("kopfdaten.kundendaten.anrede")).map(vf -> vf.has(Type.enumType("xxx"))).orElse(true));
        assertFalse(dataFormat.get(new Path("kopfdaten.kundendaten.anrede")).map(vf -> vf.has(Type.enumType())).orElse(true));
    }

    @Test
    void generateWorks() {
        var csv = List.of(
                "benutzername;STRING;",
                "kopfdaten.kundendaten.anrede;ENUM:FRAU,HERR,FIRMA,EHELEUTE,HERRUNDFRAU",
                "kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].checkbox;BOOLEAN;");

        var dataFormat = DataFormat.fromCsv(DataFormatId.PROS_TRANSACTION_METADATA_UPDATE, csv);

        assertValue(dataFormat, new Path("benutzername"), Type.STRING);
        assertValue(dataFormat, new Path("kopfdaten.kundendaten.anrede"), Type.enumType("FRAU", "HERR", "FIRMA", "EHELEUTE", "HERRUNDFRAU"));
        assertValue(dataFormat, new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].checkbox"), Type.BOOLEAN);

    }

    private static void assertValue(DataFormat dataFormat, Path path, Type type) {
        var value = dataFormat.get(path);
        assertTrue(value.isPresent());
        assertTrue(value.get().has(path));
        assertTrue(value.get().has(type));
    }
}