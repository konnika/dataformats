package de.konni.msg.dataformats.core;

import de.konni.msg.dataformats.core.mappings.FirstSimpleMapping;
import de.konni.msg.dataformats.core.mappings.OneToOneArrayMapping;
import de.konni.msg.dataformats.core.mappings.OneToOneStringMapping;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    @Test
    void convertObject() {
        var values = List.of(
                new Value(new Path("benutzername"), Type.STRING, "benutzername"),
                new Value(new Path("institutsname"), Type.STRING, "institutsname"),
                new Value(new Path("kopfdaten.kundendaten.kundennummer"), Type.STRING, "kopfdaten.kundendaten.kundennummer")
        );
        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);
        List<Mapping> mappings = List.of(new FirstSimpleMapping());

        var conversion = new Conversion(TestDataFormats.transactionMetadataUpdate(), TestDataFormats.transactionMetadataUpdateEnglish(), mappings);
        var converted = conversion.applyTo(data);

        assertValue(converted, "user", "BENUTZERNAME");
    }

    @Test
    void convertTransactionMetadataUpdate() {
        var values = List.of(
                new Value(new Path("benutzername"), Type.STRING, "aaa"),
                new Value(new Path("institutsname"), Type.STRING, "bbb"),
                new Value(new Path("kopfdaten.kundendaten.kundennummer"), Type.STRING, "ccc"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), Type.STRING, "xxx0"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].text"), Type.STRING, "yyy0"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"), Type.STRING, "xxx1"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[2].checkbox"), Type.STRING, "zzz2")
        );
        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);
        List<Mapping> mappings = List.of(new OneToOneStringMapping(), new OneToOneArrayMapping());

        var conversion = new Conversion(TestDataFormats.transactionMetadataUpdate(), TestDataFormats.transactionMetadataUpdateMarzipan(), mappings);
        var converted = conversion.applyTo(data);

        assertValue(converted, "username", "AAA");
        assertValue(converted, "institutsname", "BBB");
        assertValue(converted, "kundendaten.kundennummer", "CCC");
        // TODO un-comment as soon as array mapping is implemented
        assertValue(converted, "verwaltungsdaten.verwaltungsdatenwert.[0].schluessel", "XXX0");
        assertValue(converted, "verwaltungsdaten.verwaltungsdatenwert.[0].stringWert", "YYY0");
        assertValue(converted, "verwaltungsdaten.verwaltungsdatenwert.[1].schluessel", "XXX1");
        assertValue(converted, "verwaltungsdaten.verwaltungsdatenwert.[2].checkbox", "ZZZ2");
    }

    private static void assertValue(Data data, String path, String object) {
        var value = data.getValue(new Path(path));
        assertNotNull(value);
        assertTrue(value.is(Type.STRING));
        assertTrue(value.hasObject());
        assertEquals(object, value.object());
    }
}
