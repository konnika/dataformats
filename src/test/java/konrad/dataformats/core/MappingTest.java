package konrad.dataformats.core;

import konrad.dataformats.core.mappings.FirstSimpleMapping;
import konrad.dataformats.core.mappings.MultipleOneToOneMapping;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MappingTest {
    @Test
    void firstSimpleMappingWorks() {
        var mapping = new FirstSimpleMapping();

        var value = new Value(new Path("benutzername"), "xxx");
        var before = new Data(TestDataFormats.transactionMetadataUpdate(), List.of(value));
        var after = new Data(TestDataFormats.transactionMetadataUpdateEnglish(), Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(new Value(new Path("user"), "XXX"), after.getValue(new Path("user")));
    }

    @Test
    void multipleOneToOneMappingWorks() {
        var mapping = new MultipleOneToOneMapping();

        var values = List.of(
                new Value(new Path("benutzername"), "xxx"),
                new Value(new Path("institutsname"), "xxx")
        );
        var before = new Data(TestDataFormats.transactionMetadataUpdate(), values);
        var after = new Data(TestDataFormats.transactionMetadataUpdateEnglish(), Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(new Value(new Path("user"), "XXX"), after.getValue(new Path("user")));
        assertEquals(new Value(new Path("tenant"), "XXX"), after.getValue(new Path("tenant")));
    }
}
