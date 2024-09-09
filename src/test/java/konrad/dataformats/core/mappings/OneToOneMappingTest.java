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
    void oneToOneMappingWorksOnString() {
        var mapping = new OneToOneMapping(TestDataFormats.transactionMetadataUpdate().id(), TestDataFormats.transactionMetadataUpdateMarzipan().id(),
                new Path("benutzername"), new Path("username"));

        var values = List.of(new Value(new Path("benutzername"), "xxx"));
        var before = new Data(TestDataFormats.transactionMetadataUpdate(), values);
        var after = new Data(TestDataFormats.transactionMetadataUpdateMarzipan(), Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(1, after.toMap().size());
        assertValue(after, "username");
    }

    @Test
    void oneToOneMappingWorksOnStringInArray() {
        var mapping = new OneToOneMapping(TestDataFormats.transactionMetadataUpdate().id(), TestDataFormats.transactionMetadataUpdateMarzipan().id(),
                new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].schluessel"), new Path("verwaltungsdaten.verwaltungsdatenwert.[].schluessel"));

        var values = List.of(new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), "xxx"));
        var before = new Data(TestDataFormats.transactionMetadataUpdate(), values);
        var after = new Data(TestDataFormats.transactionMetadataUpdateMarzipan(), Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(1, after.toMap().size());
        assertValue(after, "verwaltungsdaten.verwaltungsdatenwert.[0].schluessel");
    }

    private static void assertValue(Data data, String path) {
        var expected = new Value(new Path(path), "xxx");
        var actual = data.getValue(new Path(path));
        assertNotNull(actual);
        assertTrue(actual.hasObject());
        assertEquals(expected, actual);
    }
}
