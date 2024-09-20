package konrad.dataformats.light;

import konrad.dataformats.testobjects.tree.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static konrad.dataformats.light.Assertions.assertEmptyValue;
import static konrad.dataformats.light.Assertions.assertValue;

class DataWithoutFormatTest {
    @Test
    void objectToDataWorks() {
        var tree = TestObjects.tree();

        var data = new DataWithoutFormat<>(TestObjectMapper.toMap(tree), tree.getClass());

        assertValue(data, "value", "tree");
        assertValue(data, "branch.value", true);
        assertEmptyValue(data, "branch.nullValue");
        assertValue(data, "branch.leaf.color", "GREEN");
        assertValue(data, "branch.leaf.value", "branch.leaf");
        assertValue(data, "leaves.[0].color", "RED");
        assertValue(data, "leaves.[0].value", "tree.leaf1");
        assertValue(data, "leaves.[1].color", "YELLOW");
        assertValue(data, "leaves.[1].value", "tree.leaf2");
    }

    @Test
    void dataToObjectWorks() {
        var data = new DataWithoutFormat<>(Collections.emptyMap(), Tree.class);
        data.add(new Value(new Path("value"), "tree"));
        data.add(new Value(new Path("branch.value"), true));
        data.add(new Value(new Path("branch.leaf.color"), "GREEN"));
        data.add(new Value(new Path("branch.leaf.value"), "branch.leaf"));
        data.add(new Value(new Path("leaves.[0].color"), "RED"));
        data.add(new Value(new Path("leaves.[0].value"), "tree.leaf1"));
        data.add(new Value(new Path("leaves.[1].color"), "YELLOW"));
        data.add(new Value(new Path("leaves.[1].value"), "tree.leaf2"));

        var object = TestObjectMapper.toObject(data.toMap(), data.objectClass());

        Assertions.assertEquals(TestObjects.tree(), object);
    }
}