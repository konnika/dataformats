package konrad.dataformats.core.types;

import konrad.dataformats.core.Validations;

import java.util.Objects;

public class AbstractType implements Type {
    protected final TypeId id;
    protected final Class<?> internalClass;

    public AbstractType(TypeId id, Class<?> internalClass) {
        this.id = id;
        this.internalClass = Validations.validateNotNull(internalClass, "internal class");
    }

    @Override
    public boolean hasId(Class<?> aClass) {
        return id.is(aClass);
    }

    @Override
    public boolean hasId(String string) {
        return id.is(string);
    }

    @Override
    public boolean hasClass(Class<?> aClass) {
        return internalClass.equals(aClass);
    }

    @Override
    public boolean accepts(Object object) {
        return Objects.equals(internalClass, object.getClass());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        AbstractType that = (AbstractType) object;
        return Objects.equals(id, that.id) && Objects.equals(internalClass, that.internalClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, internalClass);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{id=" + id + ", internalClass=" + internalClass + '}';
    }
}
