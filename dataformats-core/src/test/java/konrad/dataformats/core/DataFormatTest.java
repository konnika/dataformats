package konrad.dataformats.core;

import konrad.dataformats.testobjects.mirrortree.MirrorColor;
import konrad.dataformats.testobjects.tree.Color;
import org.junit.jupiter.api.Test;

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
        assertHasType(treeFormat, "value", Type.STRING);
        assertHasType(treeFormat, "branch.value", Type.BOOLEAN);
        assertHasType(treeFormat, "branch.nullValue", Type.STRING);
        assertHasType(treeFormat, "branch.leaf.color", Type.enumType(Color.class));
        assertHasType(treeFormat, "branch.leaf.value", Type.STRING);
        assertHasType(treeFormat, "leaves.[].color", Type.enumType(Color.class));
        assertHasType(treeFormat, "leaves.[].value", Type.STRING);
    }


    @Test
    void enumWorks() {
        assertHasType(treeFormat, "branch.leaf.color", Type.enumType(Color.class));
        assertHasType(treeFormat, "branch.leaf.color", Type.enumType("GREEN", "YELLOW", "RED", "BROWN"));
        assertHasNotType(treeFormat, "branch.leaf.color", Type.enumType(MirrorColor.class));
        assertHasNotType(treeFormat, "branch.leaf.color", Type.enumType("YELLOW", "RED", "BROWN", "GREEN"));
        assertHasNotType(treeFormat, "branch.leaf.color", Type.enumType("GREEN", "YELLOW", "RED"));
        assertHasNotType(treeFormat, "branch.leaf.color", Type.enumType("xxx"));
        assertHasNotType(treeFormat, "branch.leaf.color", Type.enumType());
    }

    @Test
    void fromCsvWorks() {
        var csv = List.of(
                "value;STRING",
                "branch.value;BOOLEAN",
                "branch.leaf.color;ENUM:GREEN,YELLOW,RED,BROWN",
                "leaves.[].value;STRING");

        var format = DataFormat.fromCsv(TestDataFormats.tree().id(), csv);

        Assertions.assertValue(format, "value", Type.STRING);
        Assertions.assertValue(format, "branch.value", Type.BOOLEAN);
        Assertions.assertValue(format, "branch.leaf.color", Type.enumType(Color.class));
        Assertions.assertValue(format, "leaves.[].value", Type.STRING);
    }

    private void assertContains(DataFormat dataFormat, String path) {
        assertTrue(dataFormat.contains(new Path(path)));
    }

    private void assertHasType(DataFormat dataFormat, String path, Type type) {
        assertTrue(dataFormat.get(new Path(path)).map(vf -> vf.has(type)).orElse(false));
    }

    private void assertHasNotType(DataFormat dataFormat, String path, Type type) {
        assertFalse(dataFormat.get(new Path(path)).map(vf -> vf.has(type)).orElse(false));
    }
}
