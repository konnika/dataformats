package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Assertions;
import konrad.dataformats.core.Data;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.TestDataFormats;
import konrad.dataformats.core.Value;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumToEnumMappingTest {
    @Test
    void enumWorks() {
        var enumMappings = new HashMap<String, String>();
        enumMappings.put("GREEN", "MIRROR_GREEN");
        enumMappings.put("YELLOW", "MIRROR_YELLOW");
        enumMappings.put("RED", "MIRROR_RED");
        enumMappings.put("BROWN", "MIRROR_BROWN");

        var mapping = new EnumToEnumMapping(TestDataFormats.tree(), TestDataFormats.mirrorTree(),
                new Path("branch.leaf.color"), new Path("mirrorBranch.mirrorLeaf.mirrorColor"),
                enumMappings);

        var values = List.of(new Value(new Path("branch.leaf.color"), "RED"));
        var before = new Data(TestDataFormats.tree(), values);
        var after = new Data(TestDataFormats.mirrorTree(), Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(1, after.toMap().size());
        Assertions.assertValue(after, "mirrorBranch.mirrorLeaf.mirrorColor", "MIRROR_RED");
    }
}
