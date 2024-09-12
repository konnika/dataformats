package konrad.dataformats.core;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Type {
    public static final Type STRING = new Type(String.class);
    public static final Type BOOLEAN = new Type(Boolean.class);
    public static final Type DATE = new Type(LocalDate.class);
    public static final Type INTEGER = new Type(Integer.class);
    public static final Type NUMBER = new Type(BigDecimal.class);

    public static final String ERROR_MESSAGE_CSV_FORMAT = "DataFormat CSV is expected to have a type value of: ENUM:value1,value2,value3. Got ";

    private final Class<?> clazz;
    private final List<String> enumValues = new ArrayList<>();

    private Type(Class<?> clazz, String... values) {
        this.clazz = clazz;
        this.enumValues.addAll(Arrays.asList(values));
    }

    public static Type enumType(String... values) {
        return new Type(String.class, values);
    }

    public static Type enumType(Class<? extends Enum> enumClass) {
        return new Type(String.class, Arrays.stream(enumClass.getEnumConstants()).map(Enum::name).toArray(String[]::new));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(clazz, type.clazz) && enumValuesEqual(enumValues, type.enumValues);
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
        return Objects.hash(clazz, enumValues);
    }

    public Class<?> clazz() {
        return clazz;
    }

    public int enumValueIndex(String value) {
        var i = enumValues.indexOf(value);
        if (i > -1) {
            return i;
        }

        throw new RuntimeException("Unexcepted enum value " + value + " for type " + clazz + " with values " + String.join(",", enumValues));
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
        return "Type class=" + clazz + ", enumValues=" + enumValues;
    }

    public static Type fromCsv(String typeString) {
        if (typeString.startsWith("ENUM")) {
            var enumValuesIndex = typeString.indexOf(":");
            if (enumValuesIndex == -1) {
                throw new RuntimeException(ERROR_MESSAGE_CSV_FORMAT + typeString);
            }
            var enumValuesString = typeString.substring(enumValuesIndex + 1).trim();
            if (enumValuesString.isBlank()) {
                throw new RuntimeException(ERROR_MESSAGE_CSV_FORMAT + typeString);
            }
            var values = enumValuesString.split(",");
            if (values.length < 1) {
                throw new RuntimeException(ERROR_MESSAGE_CSV_FORMAT + typeString);
            }
            return Type.enumType(values);
        }

        return switch (typeString) {
            case "STRING" -> Type.STRING;
            case "BOOLEAN" -> Type.BOOLEAN;
            case "DATE" -> Type.DATE;
            case "INTEGER" -> Type.INTEGER;
            case "NUMBER" -> Type.NUMBER;
            default -> throw new RuntimeException("");
        };
    }
}
