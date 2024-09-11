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

//    @Test
//    void addNonNullValues() {
//        var values = List.of(
//                new Value(new Path("benutzername"), "1"),
//                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), "1")
//        );
//        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);
//
//        var values2 = List.of(
//                new Value(new Path("benutzername"), "2"),
//                new Value(new Path("institutsname"), "2"),
//                new Value(new Path("kopfdaten.kundendaten.kundennummer"), "2"),
//                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), "2"),
//                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"), "2")
//        );
//        var data2 = new Data(TestDataFormats.transactionMetadataUpdate(), values2);
//
//        data.addNonNullValuesFrom(data2);
//
//        var value1 = data.getValue(new Path("benutzername"));
//        assertNotNull(value1);
//        assertTrue(value1.is(Type.STRING));
//        assertTrue(value1.hasObject());
//        assertEquals("1", value1.object());
//
//        var value2 = data.getValue(new Path("institutsname"));
//        assertNotNull(value2);
//        assertTrue(value2.is(Type.STRING));
//        assertTrue(value2.hasObject());
//        assertEquals("2", value2.object());
//
//        var nestedValue = data.getValue(new Path("kopfdaten.kundendaten.kundennummer"));
//        assertNotNull(nestedValue);
//        assertTrue(nestedValue.is(Type.STRING));
//        assertTrue(nestedValue.hasObject());
//        assertEquals("2", nestedValue.object());
//
//        var listValue0 = data.getValue(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"));
//        assertNotNull(listValue0);
//        assertTrue(listValue0.is(Type.STRING));
//        assertTrue(listValue0.hasObject());
//        assertEquals("1", listValue0.object());
//
//        var listValue1 = data.getValue(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"));
//        assertNotNull(listValue1);
//        assertTrue(listValue1.is(Type.STRING));
//        assertTrue(listValue1.hasObject());
//        assertEquals("2", listValue1.object());
//    }
//
//    @Test
//    void overrideWithNonNullValues() {
//        var values = List.of(
//                new Value(new Path("benutzername"), "1"),
//                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), "1")
//        );
//        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);
//
//        var values2 = List.of(
//                new Value(new Path("benutzername"), "2"),
//                new Value(new Path("institutsname"), "2"),
//                new Value(new Path("kopfdaten.kundendaten.kundennummer"), "2"),
//                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), "2"),
//                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"), "2")
//        );
//        var data2 = new Data(TestDataFormats.transactionMetadataUpdate(), values2);
//
//        data.overrideWithNonNullValuesFrom(data2);
//
//        var value1 = data.getValue(new Path("benutzername"));
//        assertNotNull(value1);
//        assertTrue(value1.is(Type.STRING));
//        assertTrue(value1.hasObject());
//        assertEquals("2", value1.object());
//
//        var value2 = data.getValue(new Path("institutsname"));
//        assertNotNull(value2);
//        assertTrue(value2.is(Type.STRING));
//        assertTrue(value2.hasObject());
//        assertEquals("2", value2.object());
//
//        var nestedValue = data.getValue(new Path("kopfdaten.kundendaten.kundennummer"));
//        assertNotNull(nestedValue);
//        assertTrue(nestedValue.is(Type.STRING));
//        assertTrue(nestedValue.hasObject());
//        assertEquals("2", nestedValue.object());
//
//        var listValue0 = data.getValue(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"));
//        assertNotNull(listValue0);
//        assertTrue(listValue0.is(Type.STRING));
//        assertTrue(listValue0.hasObject());
//        assertEquals("2", listValue0.object());
//
//        var listValue1 = data.getValue(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"));
//        assertNotNull(listValue1);
//        assertTrue(listValue1.is(Type.STRING));
//        assertTrue(listValue1.hasObject());
//        assertEquals("2", listValue1.object());
//    }

    private <T> T toObject(Map<String, Object> map, Class<T> aClass) {
        return objectMapper.convertValue(map, aClass);
    }

    private Map<String, Object> toMap(Object object) {
        return objectMapper.convertValue(object, new TypeReference<>() {
        });
    }
}
