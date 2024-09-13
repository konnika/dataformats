package konrad.dataformats.core;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Assertions {
    public static void assertValue(DataFormat format, String path, Type type) {
        var value = format.get(new Path(path));
        assertTrue(value.isPresent());
        assertTrue(value.get().has(new Path(path)));
        assertTrue(value.get().has(type));
    }

    public static void assertValue(Data data, String path, Object expected) {
        var value = data.getValue(new Path(path));
        assertNotNull(value);
        assertTrue(value.hasObject());

        if (expected instanceof BigDecimal expectedBigDecimal) {
            assertEquals(0, expectedBigDecimal.compareTo((BigDecimal) value.object()));
        } else {
            assertEquals(expected, value.object());
        }
    }

    public static void assertValue(Data data, String path, Object expected, Type expectedType) {
        var value = data.getValue(new Path(path));
        assertNotNull(value);
        assertTrue(value.hasObject());
        assertTrue(value.is(expectedType));
        assertEquals(expected, value.object());
    }

    public static void assertNoValue(Data data, String path) {
        var value = data.getValue(new Path(path));
        if (value != null) {
            assertNotNull(value);
            assertTrue(value.isEmpty());
            assertNull(value.object());
        }
    }
}
