package de.konni.msg.dataformats.core;

import de.konni.msg.dataformats.core.mappings.FirstSimpleMapping;
import de.konni.msg.dataformats.core.mappings.MultipleOneToOneMapping;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MappingTest {
    @Test
    void firstSimpleMappingWorks() {
        var mapping = new FirstSimpleMapping();

        var value = new Value(new Path("benutzername"), Type.STRING, "xxx");
        var before = new Data(DataFormatId.PROS_TRANSACTION_METADATA_UPDATE, List.of(value));
        var after = new Data(DataFormatId.MAP, Collections.emptyList());

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
        var before = new Data(DataFormatId.PROS_TRANSACTION_METADATA_UPDATE, values);
        var after = new Data(DataFormatId.MAP, Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(new Value(new Path("benutzernamePath"), Type.STRING, "XXX"), after.get(new Path("benutzernamePath")));
        assertEquals(new Value(new Path("institutsnamePath"), Type.STRING, "XXX"), after.get(new Path("institutsnamePath")));
    }
}
