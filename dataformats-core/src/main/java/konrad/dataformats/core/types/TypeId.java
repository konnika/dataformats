package konrad.dataformats.core.types;

import konrad.dataformats.core.Validations;

import java.util.Objects;

public class TypeId {
    private final String id;

    public TypeId(Class<?> aClass) {
        this(Validations.validateNotNull(aClass, "Type id class").getName());
    }

    public TypeId(String id) {
        Validations.validateNotNull(id, "Type id");
        this.id = id;
    }

    public boolean is(Class<?> aClass) {
        return aClass.getName().equals(id);
    }

    public boolean is(String string) {
        return id.equals(string);
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
