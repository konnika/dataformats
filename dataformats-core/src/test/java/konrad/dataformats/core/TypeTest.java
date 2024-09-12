package konrad.dataformats.core;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TypeTest {
    @Test
    void typeWorks() {
        var type = Type.forClass(String.class);
        var value = new Value(new Path("x"), "a");

        assertTrue(type.is(String.class));
        assertTrue(value.is(type));
    }

    @Test
    void enumTypeWorks() {
        var enumType = Type.forEnum("a", "b", "c");

        var path = new Path("x");
        var values = List.of(new Value(path, "a"), new Value(path, "b"), new Value(path, "c"));
        var nonValues = List.of(new Value(path, "A"), new Value(path, ""), new Value(path, "3"));

        assertTrue(values.stream().allMatch(v -> v.is(enumType)));
        assertTrue(nonValues.stream().noneMatch(v -> v.is(enumType)));
    }
}
