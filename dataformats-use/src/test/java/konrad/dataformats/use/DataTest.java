package konrad.dataformats.use;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import konrad.dataformats.core.Data;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.Value;
import konrad.dataformats.use.dataformats.DataFormats;
import konrad.dataformats.use.objects.one.Color;
import konrad.dataformats.use.objects.one.Tree;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataTest {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void createDataFromObject() {
        var tree = TestObjects.tree();

        var data = Data.from(toMap(tree), DataFormats.tree());

        assertValue(data, "value", "tree");
        assertValue(data, "branch.value", true);
        assertNoValue(data, "branch.nullValue");
        assertValue(data, "branch.leaf.color", "GREEN");
        assertValue(data, "branch.leaf.value", "branch.leaf");
        assertValue(data, "leaves.[0].color", "RED");
        assertValue(data, "leaves.[0].value", "tree.leaf1");
        assertValue(data, "leaves.[1].color", "YELLOW");
        assertValue(data, "leaves.[1].value", "tree.leaf2");
    }

    private static void assertValue(Data data, String path, Object expected) {
        var value = data.getValue(new Path(path));
        assertNotNull(value);
        assertTrue(value.hasObject());
        assertEquals(expected, value.object());
    }

    private static void assertNoValue(Data data, String path) {
        var value = data.getValue(new Path(path));
        assertNotNull(value);
        assertTrue(value.isEmpty());
        assertNull(value.object());
    }


    @Test
    void createObjectFromData() {
        var values = List.of(
                new Value(new Path("value"), "tree"),
                new Value(new Path("branch.value"), true),
                new Value(new Path("branch.nullValue"), null),
                new Value(new Path("branch.leaf.color"), "GREEN"),
                new Value(new Path("branch.leaf.value"), "branch.leaf"),
                new Value(new Path("leaves.[0].color"), "RED"),
                new Value(new Path("leaves.[0].value"), "tree.leaf1"),
                new Value(new Path("leaves.[1].color"), "YELLOW"),
                new Value(new Path("leaves.[1].value"), "tree.leaf2")
        );
        var data = new Data(DataFormats.tree(), values);

        var map = data.toMap();
        var tree = toObject(map, Tree.class);

        assertEquals("tree", tree.value());
        assertEquals(true, tree.branch().value());
        assertNull(tree.branch().nullValue());
        assertEquals(Color.GREEN, tree.branch().leaf().color());
        assertEquals("branch.leaf", tree.branch().leaf().value());
        assertEquals(Color.RED, tree.leaves().get(0).color());
        assertEquals("tree.leaf1", tree.leaves().get(0).value());
        assertEquals(Color.YELLOW, tree.leaves().get(1).color());
        assertEquals("tree.leaf2", tree.leaves().get(1).value());
    }

    @Test
    void addNonNullValues() {
        var values = List.of(
                new Value(new Path("value"), "tree"),
                new Value(new Path("branch.value"), true),
                new Value(new Path("branch.nullValue"), null),
                new Value(new Path("branch.leaf.color"), "GREEN"),
                new Value(new Path("branch.leaf.value"), "branch.leaf"),
                new Value(new Path("leaves.[0].color"), null),
                new Value(new Path("leaves.[0].value"), "tree.leaf1"),
                new Value(new Path("leaves.[1].color"), "YELLOW"),
                new Value(new Path("leaves.[1].value"), null)
        );
        var data = new Data(DataFormats.tree(), values);

        var values2 = List.of(
                new Value(new Path("value"), "2"),
                new Value(new Path("branch.value"), false),
                new Value(new Path("branch.nullValue"), "2"),
                new Value(new Path("branch.leaf.color"), "BROWN"),
                new Value(new Path("branch.leaf.value"), "2"),
                new Value(new Path("leaves.[0].color"), "BROWN"),
                new Value(new Path("leaves.[0].value"), "2"),
                new Value(new Path("leaves.[1].color"), "BROWN"),
                new Value(new Path("leaves.[1].value"), null)
        );
        var data2 = new Data(DataFormats.tree(), values2);

        data.addNonNullValuesFrom(data2);

        assertValue(data, "value", "tree");
        assertValue(data, "branch.value", true);
        assertValue(data, "branch.nullValue", "2");
        assertValue(data, "branch.leaf.color", "GREEN");
        assertValue(data, "branch.leaf.value", "branch.leaf");
        assertValue(data, "leaves.[0].color", "BROWN");
        assertValue(data, "leaves.[0].value", "tree.leaf1");
        assertValue(data, "leaves.[1].color", "YELLOW");
        assertNoValue(data, "leaves.[1].value");
    }

    @Test
    void overrideWithNonNullValues() {
        var values = List.of(
                new Value(new Path("value"), "tree"),
                new Value(new Path("branch.value"), true),
                new Value(new Path("branch.nullValue"), null),
                new Value(new Path("branch.leaf.color"), "GREEN"),
                new Value(new Path("branch.leaf.value"), "branch.leaf"),
                new Value(new Path("leaves.[0].color"), null),
                new Value(new Path("leaves.[0].value"), "tree.leaf1"),
                new Value(new Path("leaves.[1].color"), "YELLOW"),
                new Value(new Path("leaves.[1].value"), null)
        );
        var data = new Data(DataFormats.tree(), values);

        var values2 = List.of(
                new Value(new Path("value"), "2"),
                new Value(new Path("branch.value"), false),
                new Value(new Path("branch.nullValue"), "2"),
                new Value(new Path("branch.leaf.color"), null),
                new Value(new Path("branch.leaf.value"), "2"),
                new Value(new Path("leaves.[0].color"), "BROWN"),
                new Value(new Path("leaves.[0].value"), null),
                new Value(new Path("leaves.[1].color"), "BROWN"),
                new Value(new Path("leaves.[1].value"), null)
        );
        var data2 = new Data(DataFormats.tree(), values2);

        data.overrideWithNonNullValuesFrom(data2);

        assertValue(data, "value", "2");
        assertValue(data, "branch.value", false);
        assertValue(data, "branch.nullValue", "2");
        assertValue(data, "branch.leaf.color", "GREEN");
        assertValue(data, "branch.leaf.value", "2");
        assertValue(data, "leaves.[0].color", "BROWN");
        assertValue(data, "leaves.[0].value", "tree.leaf1");
        assertValue(data, "leaves.[1].color", "BROWN");
        assertNoValue(data, "leaves.[1].value");
    }

    private <T> T toObject(Map<String, Object> map, Class<T> aClass) {
        return objectMapper.convertValue(map, aClass);
    }

    private Map<String, Object> toMap(Object object) {
        return objectMapper.convertValue(object, new TypeReference<>() {
        });
    }
}
