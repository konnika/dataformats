package konrad.dataformats.core;

import konrad.dataformats.core.mappings.FirstSimpleMapping;
import konrad.dataformats.core.mappings.OneToOneArrayMapping;
import konrad.dataformats.core.mappings.OneToOneEnumMapping;
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
        List<Mapping> mappings = List.of(new FirstSimpleMapping());

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
        List<Mapping> mappings = List.of(new OneToOneArrayMapping(), new OneToOneEnumMapping());

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
