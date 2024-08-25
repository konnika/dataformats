package de.konni.msg.dataformats.core;

import de.konni.msg.dataformats.core.mappings.FirstSimpleMapping;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MappingTest {
    @Test
    void firstSimpleMappingWorks() {
        var mapping = new FirstSimpleMapping();

        var values = List.of(new Value(new Path("benutzername"), Type.STRING, "xxx"));
        var before = new Data(DataFormatId.PROS_TRANSACTION_METADATA_UPDATE, values);
        var after = new Data(DataFormatId.MAP, Collections.emptyList());

        mapping.applyTo(before, after);

        var expected = new Value(new Path("xxxPath"), Type.STRING, "XXX");
        var result = after.get(new Path("xxxPath"));
        assertEquals(expected, result);
    }
}
