package konrad.dataformats.core.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class EnumType extends AbstractType implements Type {
    private final List<String> enumValues = new ArrayList<>();

    public EnumType(Class<? extends Enum> enumClass) {
        this(new TypeId(enumClass.getName()), Arrays.stream(enumClass.getEnumConstants()).map(Enum::name).toList());
    }

    public EnumType(List<String> values) {
        this(new TypeId(String.join(",", values)), values);
    }

    public EnumType(TypeId id, List<String> enumValues) {
        super(id, String.class);
        this.enumValues.addAll(enumValues);
    }

    public int enumValueCount() {
        return enumValues.size();
    }

    public int enumValueIndex(String value) {
        var i = enumValues.indexOf(value);
        if (i > -1) {
            return i;
        }

        throw new RuntimeException("Unexpected enum value " + value + " for type " + this + " with values " + String.join(",", enumValues));
    }

    public String enumValueAt(int index) {
        if (index < enumValues.size()) {
            return enumValues.get(index);
        }

        throw new RuntimeException("Enum value index too big " + index + " > " + enumValues.size() + " for type " + this);
    }

    @Override
    public boolean accepts(Object object) {
        return super.accepts(object) && enumValues.contains(object);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        EnumType enumType = (EnumType) object;
        return enumValuesEqual(enumValues, enumType.enumValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), enumValues);
    }

    private boolean enumValuesEqual(List<String> list1, List<String> list2) {
        if (list1 == null && list2 == null) return true;
        if (list1 == null || list2 == null) return false;
        if (list1.size() != list2.size()) return false;
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) return false;
        }
        return true;
    }
}
