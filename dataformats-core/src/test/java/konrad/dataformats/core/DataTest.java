package konrad.dataformats.core;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataTest {
    @Test
    void enumValuesAreValidated() {
        var value = new Value(new Path("kopfdaten.kundendaten.anrede"), "this enum value does not exist");
        assertThrows(RuntimeException.class, () -> new Data(TestDataFormats.transactionMetadataUpdate(), List.of(value)));
    }

    @Test
    void addNonNullValues() {
        var values = List.of(
                new Value(new Path("benutzername"), "1"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), "1")
        );
        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);

        var values2 = List.of(
                new Value(new Path("benutzername"), "2"),
                new Value(new Path("institutsname"), "2"),
                new Value(new Path("kopfdaten.kundendaten.kundennummer"), "2"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), "2"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"), "2")
        );
        var data2 = new Data(TestDataFormats.transactionMetadataUpdate(), values2);

        data.addNonNullValuesFrom(data2);

        var value1 = data.getValue(new Path("benutzername"));
        assertNotNull(value1);
        assertTrue(value1.is(Type.STRING));
        assertTrue(value1.hasObject());
        assertEquals("1", value1.object());

        var value2 = data.getValue(new Path("institutsname"));
        assertNotNull(value2);
        assertTrue(value2.is(Type.STRING));
        assertTrue(value2.hasObject());
        assertEquals("2", value2.object());

        var nestedValue = data.getValue(new Path("kopfdaten.kundendaten.kundennummer"));
        assertNotNull(nestedValue);
        assertTrue(nestedValue.is(Type.STRING));
        assertTrue(nestedValue.hasObject());
        assertEquals("2", nestedValue.object());

        var listValue0 = data.getValue(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"));
        assertNotNull(listValue0);
        assertTrue(listValue0.is(Type.STRING));
        assertTrue(listValue0.hasObject());
        assertEquals("1", listValue0.object());

        var listValue1 = data.getValue(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"));
        assertNotNull(listValue1);
        assertTrue(listValue1.is(Type.STRING));
        assertTrue(listValue1.hasObject());
        assertEquals("2", listValue1.object());
    }

    @Test
    void overrideWithNonNullValues() {
        var values = List.of(
                new Value(new Path("benutzername"), "1"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), "1")
        );
        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);

        var values2 = List.of(
                new Value(new Path("benutzername"), "2"),
                new Value(new Path("institutsname"), "2"),
                new Value(new Path("kopfdaten.kundendaten.kundennummer"), "2"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), "2"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"), "2")
        );
        var data2 = new Data(TestDataFormats.transactionMetadataUpdate(), values2);

        data.overrideWithNonNullValuesFrom(data2);

        var value1 = data.getValue(new Path("benutzername"));
        assertNotNull(value1);
        assertTrue(value1.is(Type.STRING));
        assertTrue(value1.hasObject());
        assertEquals("2", value1.object());

        var value2 = data.getValue(new Path("institutsname"));
        assertNotNull(value2);
        assertTrue(value2.is(Type.STRING));
        assertTrue(value2.hasObject());
        assertEquals("2", value2.object());

        var nestedValue = data.getValue(new Path("kopfdaten.kundendaten.kundennummer"));
        assertNotNull(nestedValue);
        assertTrue(nestedValue.is(Type.STRING));
        assertTrue(nestedValue.hasObject());
        assertEquals("2", nestedValue.object());

        var listValue0 = data.getValue(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"));
        assertNotNull(listValue0);
        assertTrue(listValue0.is(Type.STRING));
        assertTrue(listValue0.hasObject());
        assertEquals("2", listValue0.object());

        var listValue1 = data.getValue(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"));
        assertNotNull(listValue1);
        assertTrue(listValue1.is(Type.STRING));
        assertTrue(listValue1.hasObject());
        assertEquals("2", listValue1.object());
    }
}
