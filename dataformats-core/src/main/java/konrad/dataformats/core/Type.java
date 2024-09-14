package konrad.dataformats.core;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Type {
    public static final Type STRING = Type.forClass(String.class);
    public static final Type BOOLEAN = Type.forClass(Boolean.class);
    public static final Type DATE = Type.forClass(LocalDate.class);
    public static final Type INTEGER = Type.forClass(Integer.class);
    public static final Type NUMBER = Type.forClass(BigDecimal.class);

    public static final String ERROR_MESSAGE_CSV_FORMAT = "DataFormat CSV is expected to have a type value of: ENUM:value1,value2,value3. Got ";

    private final TypeId id;
    private final List<String> enumValues = new ArrayList<>();

    public static Type forClass(Class<?> clazz) {
        return new Type(clazz, new ArrayList<>());
    }

    public static Type forEnum(String... values) {
        return new Type(String.class, Arrays.stream(values).toList());
    }

    public static Type forEnum(List<String> values) {
        return new Type(String.class, values.stream().toList());
    }

    public static Type forEnum(Class<? extends Enum> enumClass) {
        return new Type(String.class, Arrays.stream(enumClass.getEnumConstants()).map(Enum::name).toList());
    }

    private Type(Class<?> aClass, List<String> enumValues) {
        this.id = new TypeId(aClass);
        this.enumValues.addAll(enumValues);
    }

    public TypeId id() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(id, type.id) && enumValuesEqual(enumValues, type.enumValues);
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

    @Override
    public int hashCode() {
        return Objects.hash(id, enumValues);
    }

    public int enumValueIndex(String value) {
        var i = enumValues.indexOf(value);
        if (i > -1) {
            return i;
        }

        throw new RuntimeException("Unexpected enum value " + value + " for type " + id + " with values " + String.join(",", enumValues));
    }

    public String enumValueAt(int index) {
        if (index < enumValues.size()) {
            return enumValues.get(index);
        }

        throw new RuntimeException("Enum value index too big " + index + " > " + enumValues.size());
    }

    public boolean hasEnumValue(String value) {
        return enumValues.contains(value);
    }

    public boolean isEnum() {
        return !enumValues.isEmpty();
    }

    public int enumValueCount() {
        return enumValues.size();
    }

    @Override
    public String toString() {
        return "Type " + id + ", enumValues=" + enumValues;
    }

//    public static Type fromCsv(String typeString, TypeRegistry typeRegistry) {
//        if (typeString.startsWith("ENUM")) {
//            var enumValuesIndex = typeString.indexOf(":");
//            if (enumValuesIndex == -1) {
//                throw new RuntimeException(ERROR_MESSAGE_CSV_FORMAT + typeString);
//            }
//            var enumValuesString = typeString.substring(enumValuesIndex + 1).trim();
//            if (enumValuesString.isBlank()) {
//                throw new RuntimeException(ERROR_MESSAGE_CSV_FORMAT + typeString);
//            }
//            var values = enumValuesString.split(",");
//            if (values.length < 1) {
//                throw new RuntimeException(ERROR_MESSAGE_CSV_FORMAT + typeString);
//            }
//            return Type.forEnum(values);
//        }
//
//        return typeRegistry.getForObjectClass(typeString);
//    }

    public boolean is(Class<?> aClass) {
        return id.is(aClass);
    }
}
