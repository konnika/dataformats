package konrad.dataformats.core;

import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.StringType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TypeTest {
    @Test
    void typeWorks() {
        var type = new StringType();
        var value = new Value(new Path("x"), "a");

        assertTrue(type.hasId(String.class));
        assertTrue(value.is(type));
    }

    @Test
    void enumTypeWorks() {
        var enumType = new EnumType(AbcEnum.class);

        var path = new Path("x");
        var values = List.of(new Value(path, "A"), new Value(path, "B"), new Value(path, "C"));
        var nonValues = List.of(new Value(path, "a"), new Value(path, ""), new Value(path, "3"));

        assertTrue(values.stream().allMatch(v -> v.is(enumType)));
        assertTrue(nonValues.stream().noneMatch(v -> v.is(enumType)));
    }

    enum AbcEnum {
        A, B, C
    }
}
