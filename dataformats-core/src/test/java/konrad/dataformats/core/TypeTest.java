package konrad.dataformats.core;

import konrad.dataformats.core.Path;
import konrad.dataformats.core.Type;
import konrad.dataformats.core.Value;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TypeTest {
    @Test
    void enumTypeWorks() {
        var enumType = Type.enumType("a", "b", "c");

        var path = new Path("x");
        var values = List.of(new Value(path, "a"), new Value(path, "b"), new Value(path, "c"));
        var nonValues = List.of(new Value(path, "A"), new Value(path, ""), new Value(path, "3"));

        assertTrue(values.stream().allMatch(v -> v.is(enumType)));
        assertTrue(nonValues.stream().noneMatch(v -> v.is(enumType)));
    }
}
