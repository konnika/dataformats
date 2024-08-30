package konrad.dataformats.core;

import java.util.Objects;

public class Value {
    private final ValueFormat format;
    private final Object object;

    public Value(Path path, Type type) {
        this(path, type, null);
    }

    public Value(ValueFormat format) {
        this(format, null);
    }

    public Value(ValueFormat format, Object object) {
        this(format.path(), format.type(), object);
    }

    public Value(Path path, Type type, Object object) {
        format = new ValueFormat(path, type);
        this.object = object;

        validate();
    }

    private void validate() {
        if (object != null && !format.type().clazz().equals(object.getClass())) {
            throw new RuntimeException("Value type mismatch: " + format.type() + " != " + object.getClass());
        }
    }

    public Path path() {
        return format.path();
    }

    public Object object() {
        return object;
    }

    public boolean is(Type type) {
        return Objects.equals(format.type(), type);
    }

    public boolean hasObject() {
        return object != null;
    }

    public boolean isEmpty() {
        return object == null;
    }

    public Type type() {
        return format.type();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return Objects.equals(format.path(), value.format.path()) && Objects.equals(format.type(), value.format.type()) && Objects.equals(object, value.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format.path(), format.type(), object);
    }

    @Override
    public String toString() {
        return format.path() + "=" + object;
    }
}
