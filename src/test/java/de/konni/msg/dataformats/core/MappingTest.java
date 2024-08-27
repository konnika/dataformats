package de.konni.msg.dataformats.core;

import de.konni.msg.dataformats.core.mappings.FirstSimpleMapping;
import de.konni.msg.dataformats.core.mappings.MultipleOneToOneMapping;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MappingTest {
    @Test
    void firstSimpleMappingWorks() {
        var mapping = new FirstSimpleMapping();

        var value = new Value(new Path("benutzername"), Type.STRING, "xxx");
        var before = new Data(TestDataFormats.transactionMetadataUpdate(), List.of(value));

        var otherValue = new Value(new Path("ignore me"), Type.STRING, "xxx");
        var after = new Data(TestDataFormats.transactionMetadataUpdateTarget(), List.of(otherValue));

        mapping.applyTo(before, after);

        assertEquals(new Value(new Path("benutzernamePath"), Type.STRING, "XXX"), after.get(new Path("benutzernamePath")));
    }

    @Test
    void multipleOneToOneMappingWorks() {
        var mapping = new MultipleOneToOneMapping();

        var values = List.of(
                new Value(new Path("benutzername"), Type.STRING, "xxx"),
                new Value(new Path("institutsname"), Type.STRING, "xxx")
        );
        var before = new Data(TestDataFormats.transactionMetadataUpdate(), values);

        var otherValue = new Value(new Path("ignore me"), Type.STRING, "xxx");
        var after = new Data(TestDataFormats.transactionMetadataUpdateTarget(), List.of(otherValue));

        mapping.applyTo(before, after);

        assertEquals(new Value(new Path("benutzernamePath"), Type.STRING, "XXX"), after.get(new Path("benutzernamePath")));
        assertEquals(new Value(new Path("institutsnamePath"), Type.STRING, "XXX"), after.get(new Path("institutsnamePath")));
    }
}
