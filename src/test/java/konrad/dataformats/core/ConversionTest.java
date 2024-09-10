package konrad.dataformats.core;

import konrad.dataformats.core.mappings.TestFirstSimpleMapping;
import konrad.dataformats.core.mappings.TestOneToOneArrayMapping;
import konrad.dataformats.core.mappings.TestOneToOneEnumMapping;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConversionTest {
    @Test
    void convertObject() {
        var values = List.of(
                new Value(new Path("benutzername"), "benutzername"),
                new Value(new Path("institutsname"), "institutsname"),
                new Value(new Path("kopfdaten.kundendaten.kundennummer"), "kopfdaten.kundendaten.kundennummer")
        );
        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);
        List<Mapping> mappings = List.of(new TestFirstSimpleMapping());

        var conversion = new Conversion(TestDataFormats.transactionMetadataUpdate(), TestDataFormats.transactionMetadataUpdateEnglish(), mappings);
        var converted = conversion.applyTo(data);

        assertValue(converted, "user", Type.STRING, "BENUTZERNAME");
    }

    @Test
    void convertTransactionMetadataUpdate() {
        var values = List.of(
                new Value(new Path("benutzername"), "aaa"),
                new Value(new Path("institutsname"), "bbb"),
                new Value(new Path("kopfdaten.kundendaten.kundennummer"), "ccc"),
                // FIXME make it possible to create a value of type enum without passing all values. Also the validation of the value against the possible enum values should be done via DataFormat
                new Value(new Path("kopfdaten.kundendaten.anrede"), "EHELEUTE"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), "xxx0"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].text"), "yyy0"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"), "xxx1"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[2].checkbox"), true)
        );
        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);
        List<Mapping> mappings = List.of(new TestOneToOneArrayMapping(), new TestOneToOneEnumMapping());

        var conversion = new Conversion(TestDataFormats.transactionMetadataUpdate(), TestDataFormats.transactionMetadataUpdateMarzipan(), mappings);
        var converted = conversion.applyTo(data);

        assertValue(converted, "username", Type.STRING, "AAA");
        assertValue(converted, "institutsname", Type.STRING, "BBB");
        assertValue(converted, "kundendaten.kundennummer", Type.STRING, "CCC");
        assertValue(converted, "verwaltungsdaten.verwaltungsdatenwert.[0].schluessel", Type.STRING, "XXX0");
        assertValue(converted, "verwaltungsdaten.verwaltungsdatenwert.[0].stringWert", Type.STRING, "YYY0");
        assertValue(converted, "verwaltungsdaten.verwaltungsdatenwert.[1].schluessel", Type.STRING, "XXX1");
//        assertValue(converted, "verwaltungsdaten.verwaltungsdatenwert.[2].checkbox", Type.STRING, (Boolean) true); // TODO add again once the boolean mapping is implemented
        assertValue(converted, "kundendaten.anrede", Type.enumType("ANREDE_FRAU", "ANREDE_HERR", "ANREDE_FIRMA", "ANREDE_EHELEUTE", "ANREDE_HERRUNDFRAU"), "ANREDE_EHELEUTE");
    }

    @Test
    void fromCsvWorks() {
        var csv = List.of(
                "benutzername;username",
                "kopfdaten.kundendaten.anrede;kundendaten.anrede",
                "kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].checkbox;verwaltungsdaten.verwaltungsdatenwert.[].checkbox");

        var conversion = Conversion.fromCsv(TestDataFormats.transactionMetadataUpdate(), TestDataFormats.transactionMetadataUpdateMarzipan(), csv);

        var values = List.of(
                new Value(new Path("benutzername"), "aaa"),
                new Value(new Path("kopfdaten.kundendaten.anrede"), "EHELEUTE"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].checkbox"), true)
        );
        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);

        var result = conversion.applyTo(data);

        assertValue(result, new Path("username"), "aaa");
        assertValue(result, new Path("kundendaten.anrede"), "ANREDE_EHELEUTE");
        assertValue(result, new Path("verwaltungsdaten.verwaltungsdatenwert.[0].checkbox"), true);
    }

    private static void assertValue(Data result, Path path, String expectedValue) {
        var value = result.getValue(path);
        assertNotNull(value);
        assertTrue(value.hasObject());
        assertEquals(expectedValue, value.object());
    }

    private static void assertValue(Data result, Path path, boolean value) {
        assertTrue(result.getValue(path).hasObject());
        assertEquals(value, result.getValue(path).object());
    }

    private void assertValue(Data data, String path, Type type, Boolean object) {
        var value = data.getValue(new Path(path));
        assertNotNull(value);
        assertTrue(value.is(type));
        assertTrue(value.hasObject());
        assertEquals(object, value.object());
    }

    private static void assertValue(Data data, String path, Type type, String object) {
        var value = data.getValue(new Path(path));
        assertNotNull(value);
        assertTrue(value.is(type));
        assertTrue(value.hasObject());
        assertEquals(object, value.object());
    }
}
