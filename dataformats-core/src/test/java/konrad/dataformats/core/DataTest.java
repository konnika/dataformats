package konrad.dataformats.core;

import konrad.dataformats.core.generators.DataFormatGenerator;
import konrad.dataformats.core.generators.TypeGeneratorRegistry;
import konrad.dataformats.core.registries.TypeRegistry;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.testobjects.tree.Color;
import konrad.dataformats.testobjects.tree.Tree;
import konrad.dataformats.testobjects.weirdtree.WeirdTree;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static konrad.dataformats.core.Assertions.assertNoValue;
import static konrad.dataformats.core.Assertions.assertValue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DataTest {
    @Test
    void enumValuesAreValidated() {
        var value = new Value(new Path("branch.leaf.color"), "this color does not exist");
        var format = TestDataFormats.tree();
        var values = List.of(value);
        assertThrows(RuntimeException.class, () -> new Data(format, values));
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
        var data = new Data(TestDataFormats.tree(), values);

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
        var data2 = new Data(TestDataFormats.tree(), values2);

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
        var data = new Data(TestDataFormats.tree(), values);

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
        var data2 = new Data(TestDataFormats.tree(), values2);

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

    @Test
    void createDataFromObject() {
        var tree = TestObjects.tree();

        var data = Data.from(TestObjectMapper.toMap(tree), TestDataFormats.tree());

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

    @Test
    void createDataFromObjectWithListOfStringsWithDataFormatFromScratch() {
        var weirdTree = TestObjects.weirdTree();
        var dataFormatFromScratch = new DataFormat(new DataFormatId(WeirdTree.class),
                List.of(new ValueFormat(new Path("weirdValues.[]"), new StringType())));

        var data = Data.from(TestObjectMapper.toMap(weirdTree), dataFormatFromScratch);

        assertValue(data, "weirdValues.[0]", "one");
        assertValue(data, "weirdValues.[1]", "two");
        assertValue(data, "weirdValues.[2]", "three");
        assertNoValue(data, "weirdValues.[3]");
    }

    @Test
    void createDataFromObjectWithListOfStringsWithDataFormatFromClass() {
        var weirdTree = TestObjects.weirdTree();
        Map<Path, Class<?>> knownListTypes = new HashMap<>();
        knownListTypes.put(new Path("weirdValues"), String.class);

        var dataFormatFromClass = new DataFormatGenerator(new TypeGeneratorRegistry(), new TypeRegistry())
                .fromClass(WeirdTree.class, knownListTypes);

        var data = Data.from(TestObjectMapper.toMap(weirdTree), dataFormatFromClass);

        assertValue(data, "weirdValues.[0]", "one");
        assertValue(data, "weirdValues.[1]", "two");
        assertValue(data, "weirdValues.[2]", "three");
        assertNoValue(data, "weirdValues.[3]");
    }

    @Test
    void toMapWithListOfStrings() {
        var weirdTree = TestObjects.weirdTree();
        Map<Path, Class<?>> knownListTypes = new HashMap<>();
        knownListTypes.put(new Path("weirdValues"), String.class);

        var dataFormatFromClass = new DataFormatGenerator(new TypeGeneratorRegistry(), new TypeRegistry())
                .fromClass(WeirdTree.class, knownListTypes);

        var data = Data.from(TestObjectMapper.toMap(weirdTree), dataFormatFromClass);

        var map = data.toMap();
        assertDoesNotThrow(() -> map);
        assertEquals(List.of("one", "two", "three"), map.get("weirdValues"));
    }

    @Test
    void createDataFromObjectWithListInList() {
        var bigTree = TestObjects.bigTree();

        var data = Data.from(TestObjectMapper.toMap(bigTree), TestDataFormats.bigTree());

        assertValue(data, "bigInteger", 11);
        assertValue(data, "branches.[0].bigDate", LocalDate.now());
        assertValue(data, "branches.[0].leaves.[0].bigNumber", BigDecimal.valueOf(12));
        assertValue(data, "branches.[0].leaves.[1].bigNumber", BigDecimal.valueOf(13));
        assertValue(data, "branches.[1].leaves.[0].bigNumber", BigDecimal.valueOf(14));
        assertValue(data, "branches.[1].leaves.[1].bigNumber", BigDecimal.valueOf(15));
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
        var data = new Data(TestDataFormats.tree(), values);

        var map = data.toMap();
        var tree = TestObjectMapper.toObject(map, Tree.class);

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
}
