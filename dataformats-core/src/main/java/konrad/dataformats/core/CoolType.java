package konrad.dataformats.core;

import java.util.Objects;

public class CoolType {
    private final TypeId id;

    public CoolType(TypeId id) {
        this.id = id;
    }

    public boolean is(Class<?> aClass) {
        return id.is(aClass);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CoolType coolType = (CoolType) object;
        return Objects.equals(id, coolType.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "CoolType " + id;
    }
}
