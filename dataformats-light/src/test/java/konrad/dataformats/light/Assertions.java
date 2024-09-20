package konrad.dataformats.light;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Assertions {
    public static void assertValue(DataWithoutFormat<?> data, String path, Object expected) {
        var value = data.getValue(new Path(path));
        assertNotNull(value);

        var object = value.object().orElseThrow();
        if (expected instanceof BigDecimal expectedBigDecimal) {
            assertEquals(0, expectedBigDecimal.compareTo((BigDecimal) object));
        } else if (expected instanceof LocalDate expectedDate) {
            assertEquals(expectedDate.toString(), object);
        } else {
            assertEquals(expected, object);
        }
    }

    public static void assertEmptyValue(DataWithoutFormat<?> data, String path) {
        var value = data.getValue(new Path(path));
        assertNotNull(value);
        assertTrue(value.isEmpty());
        assertTrue(value.object().isEmpty());
    }
}
