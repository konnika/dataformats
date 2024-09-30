package konrad.dataformats.core.generators;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.TestDataFormats;
import konrad.dataformats.core.registries.TypeRegistry;
import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.testobjects.bigmirrortree.BigMirrorBranch;
import konrad.dataformats.testobjects.bigmirrortree.BigMirrorLeaf;
import konrad.dataformats.testobjects.bigmirrortree.BigMirrorTree;
import konrad.dataformats.testobjects.tree.Color;
import konrad.dataformats.testobjects.tree.Leaf;
import konrad.dataformats.testobjects.tree.Tree;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataFormatGeneratorTest {
    @Test
    void fromClassWorksOnTree() {
        var typeRegistry = new TypeRegistry();
        var enums = List.of(Color.class);
        enums.forEach(e -> typeRegistry.add(new EnumType(e)));

        var generator = new DataFormatGenerator(new TypeGeneratorRegistry(), typeRegistry);

        Map<Path, Class<?>> knownListTypes = Map.of(new Path("leaves"), Leaf.class);
        var dataFormat = generator.fromClass(new DataFormatId("tree"), Tree.class, knownListTypes);

        var expected = TestDataFormats.tree();
        assertEquals(expected.valueFormats().size(), dataFormat.valueFormats().size());
        assertTrue(dataFormat.valueFormats().containsAll(expected.valueFormats()));
    }

    @Test
    void fromClassWorksOnBigMirrorTree() {
        var generator = new DataFormatGenerator(new TypeGeneratorRegistry(), new TypeRegistry());

        Map<Path, Class<?>> knownListTypes = Map.of(
                new Path("mirrorBranches"), BigMirrorBranch.class,
                new Path("mirrorBranches.[].bigMirrorLeaves"), BigMirrorLeaf.class);
        var dataFormat = generator.fromClass(new DataFormatId("bigMirrorTree"), BigMirrorTree.class, knownListTypes);

        var expected = TestDataFormats.bigMirrorTree();
        showPaths(expected, "expected");
        showPaths(dataFormat, "actual");

        assertEquals(expected.valueFormats().size(), dataFormat.valueFormats().size());
        assertTrue(dataFormat.valueFormats().containsAll(expected.valueFormats()));
    }

    private void showPaths(DataFormat format, String message) {
        System.out.println(message);
        format.valueFormats().forEach(System.out::println);
    }
}