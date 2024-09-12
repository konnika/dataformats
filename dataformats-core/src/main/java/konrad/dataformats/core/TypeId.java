package konrad.dataformats.core;

import java.util.Objects;

public class TypeId {
    private final String id;

    public TypeId(Class<?> aClass) {
        this(aClass.getName());
    }

    public TypeId(String id) {
        this.id = id;
    }

    public boolean is(Class<?> aClass) {
        return aClass.getName().equals(id);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        TypeId typeId = (TypeId) object;
        return Objects.equals(id, typeId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "TypeId " + id;
    }
}
