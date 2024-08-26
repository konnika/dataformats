package de.konni.msg.dataformats.core;

import java.time.LocalDate;
import java.util.*;

public class Type {
    public static final Type STRING = new Type(String.class);
    public static final Type OBJECT = new Type(Object.class);
    public static final Type BOOLEAN = new Type(Boolean.class);
    public static final Type DATE = new Type(LocalDate.class);

    private static final Map<Class<?>, Type> types = Map.of(String.class, STRING, Boolean.class, BOOLEAN, LocalDate.class, DATE, Object.class, OBJECT);

    private final Class<?> clazz;
    private final List<String> enumValues = new ArrayList<>();

    private Type(Class<?> clazz, String... values) {
        this.clazz = clazz;
        this.enumValues.addAll(Arrays.asList(values));
    }

    public static Type ENUM(String... values) {
        return new Type(Enum.class, values);
    }

    public static Type from(Class<?> aClass) {
        var type = types.get(aClass);
        if (type == null) {
            throw new RuntimeException("Unexcepted Class type: " + aClass.getName());
        }
        return type;
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
        for (var elem : list1) {
            if (!list2.contains(elem)) return false;
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

    public Object cast(Object object) {
        return clazz.cast(object);
    }
}
