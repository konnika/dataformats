package konrad.dataformats.core.generators;

import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.TestDataFormats;
import konrad.dataformats.testobjects.tree.Leaf;
import konrad.dataformats.testobjects.tree.Tree;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataFormatGeneratorTest {
    @Test
    void fromClassWorksOnSimpleObject() {
        var generator = new DataFormatGenerator(new TypeGeneratorRegistry());

        Map<Path, Class<?>> knownListTypes = Map.of(new Path("leaves"), Leaf.class);
        var dataFormat = generator.fromClass(new DataFormatId("tree"), Tree.class, knownListTypes);

        var expected = TestDataFormats.tree();
        assertEquals(expected.valueFormats().size(), dataFormat.valueFormats().size());
        assertTrue(dataFormat.valueFormats().containsAll(expected.valueFormats()));
    }
}