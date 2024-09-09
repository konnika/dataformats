package konrad.dataformats.core;

import java.util.Objects;

public class Value {
    private final Path path;
    private final Object object;

    public Value(Path path, Object object) {
        this.path = path;
        this.object = object;

        validate();
    }

    private void validate() {
        Validations.validateNotNull(path, "Path");
        if (path.isAbstractArrayPath()) {
            throw new RuntimeException("Path to value should not be abstract");
        }
    }

    public Path path() {
        return path;
    }

    public Object object() {
        return object;
    }

    public boolean is(Type type) {
        return object == null || Objects.equals(object.getClass(), type.clazz());
    }

    public boolean hasObject() {
        return object != null;
    }

    public boolean isEmpty() {
        return object == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return Objects.equals(path, value.path()) && Objects.equals(object, value.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, object);
    }

    @Override
    public String toString() {
        return object == null ? "empty" : object.toString();
    }
}
