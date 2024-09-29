package konrad.dataformats.core;

import konrad.dataformats.core.generators.DataFormatGenerator;
import konrad.dataformats.core.generators.TypeGeneratorRegistry;
import konrad.dataformats.core.types.BooleanType;
import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.types.TypeId;
import konrad.dataformats.testobjects.mirrortree.MirrorColor;
import konrad.dataformats.testobjects.tree.Color;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataFormatTest {
    private final DataFormat treeFormat = TestDataFormats.tree();

    @Test
    void containsWorks() {
        assertContains(treeFormat, "value");
        assertContains(treeFormat, "branch.value");
        assertContains(treeFormat, "branch.nullValue");
        assertContains(treeFormat, "branch.leaf.color");
        assertContains(treeFormat, "branch.leaf.value");
        assertContains(treeFormat, "leaves.[].color");
        assertContains(treeFormat, "leaves.[].value");
    }

    @Test
    void getValuePathAndTypeWorks() {
        assertHasType(treeFormat, "value", new StringType());
        assertHasType(treeFormat, "branch.value", new BooleanType());
        assertHasType(treeFormat, "branch.nullValue", new StringType());
        assertHasType(treeFormat, "branch.leaf.color", new EnumType(Color.class));
        assertHasType(treeFormat, "branch.leaf.value", new StringType());
        assertHasType(treeFormat, "leaves.[].color", new EnumType(Color.class));
        assertHasType(treeFormat, "leaves.[].value", new StringType());
    }


    @Test
    void enumWorks() {
        assertHasType(treeFormat, "branch.leaf.color", new EnumType(Color.class));
        assertHasType(treeFormat, "branch.leaf.color", new EnumType(new TypeId(Color.class), List.of("GREEN", "YELLOW", "RED", "BROWN")));
        assertHasNotType(treeFormat, "branch.leaf.color", new EnumType(List.of("GREEN", "YELLOW", "RED", "BROWN")));
        assertHasNotType(treeFormat, "branch.leaf.color", new EnumType(MirrorColor.class));
        assertHasNotType(treeFormat, "branch.leaf.color", new EnumType(List.of("YELLOW", "RED", "BROWN", "GREEN")));
        assertHasNotType(treeFormat, "branch.leaf.color", new EnumType(List.of("GREEN", "YELLOW", "RED")));
        assertHasNotType(treeFormat, "branch.leaf.color", new EnumType(List.of("xxx")));
        assertHasNotType(treeFormat, "branch.leaf.color", new EnumType(Collections.emptyList()));
    }

    @Test
    void fromCsvWorks() {
        var csv = List.of(
                "value;java.lang.String",
                "branch.value;java.lang.Boolean",
                "branch.leaf.color;ENUM:GREEN,YELLOW,RED,BROWN",
                "leaves.[].value;java.lang.String");

        var dataFormatGenerator = new DataFormatGenerator(new TypeGeneratorRegistry());
        var format = dataFormatGenerator.fromCsv(TestDataFormats.tree().id(), csv);

        Assertions.assertValue(format, "value", new StringType());
        Assertions.assertValue(format, "branch.value", new BooleanType());
        Assertions.assertValue(format, "branch.leaf.color", new EnumType(List.of("GREEN", "YELLOW", "RED", "BROWN")));
        Assertions.assertValue(format, "leaves.[].value", new StringType());
    }

    private void assertContains(DataFormat dataFormat, String path) {
        assertTrue(dataFormat.contains(new Path(path)));
    }

    private void assertHasType(DataFormat dataFormat, String path, Type type) {
        assertTrue(dataFormat.get(new Path(path)).has(type));
    }

    private void assertHasNotType(DataFormat dataFormat, String path, Type type) {
        assertFalse(dataFormat.get(new Path(path)).has(type));
    }
}
