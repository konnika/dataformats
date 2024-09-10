package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Data;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.TestDataFormats;
import konrad.dataformats.core.Value;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OneToOneMappingTest {
    @Test
    void stringWorks() {
        var mapping = new OneToOneMapping(TestDataFormats.transactionMetadataUpdate(), TestDataFormats.transactionMetadataUpdateMarzipan(),
                new Path("benutzername"), new Path("username"));

        var values = List.of(new Value(new Path("benutzername"), "xxx"));
        var before = new Data(TestDataFormats.transactionMetadataUpdate(), values);
        var after = new Data(TestDataFormats.transactionMetadataUpdateMarzipan(), Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(1, after.toMap().size());
        assertValue(after, "username");
    }

    @Test
    void stringInArrayWorks() {
        var mapping = new OneToOneMapping(TestDataFormats.transactionMetadataUpdate(), TestDataFormats.transactionMetadataUpdateMarzipan(),
                new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].schluessel"), new Path("verwaltungsdaten.verwaltungsdatenwert.[].schluessel"));

        var values = List.of(new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), "xxx"));
        var before = new Data(TestDataFormats.transactionMetadataUpdate(), values);
        var after = new Data(TestDataFormats.transactionMetadataUpdateMarzipan(), Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(1, after.toMap().size());
        assertValue(after, "verwaltungsdaten.verwaltungsdatenwert.[0].schluessel");
    }

    @Test
    void enumWorks() {
        var mapping = new OneToOneMapping(TestDataFormats.transactionMetadataUpdate(), TestDataFormats.transactionMetadataUpdateMarzipan(),
                new Path("kopfdaten.kundendaten.anrede"), new Path("kundendaten.anrede"));

        var values = List.of(new Value(new Path("kopfdaten.kundendaten.anrede"), "HERR"));
        var before = new Data(TestDataFormats.transactionMetadataUpdate(), values);
        var after = new Data(TestDataFormats.transactionMetadataUpdateMarzipan(), Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(1, after.toMap().size());
        assertValue(after, "kundendaten.anrede", "ANREDE_HERR");
    }


    private static void assertValue(Data data, String path, String value) {
        var expected = new Value(new Path(path), value);
        var actual = data.getValue(new Path(path));
        assertNotNull(actual);
        assertTrue(actual.hasObject());
        assertEquals(expected, actual);
    }

    private static void assertValue(Data data, String path) {
        assertValue(data, path, "xxx");
    }
}
