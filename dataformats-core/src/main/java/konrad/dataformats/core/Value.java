package konrad.dataformats.core;

import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;
import konrad.dataformats.core.validation.Validations;

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
            throw new DataFormatsException("Path to value should not be abstract");
        }
    }

    public Path path() {
        return path;
    }

    public Object object() {
        return object;
    }

    public boolean is(Type type) {
        Validations.validateNotNull(type, "Type");
        if (object == null) {
            return true;
        }
        if (type.hasClass(object.getClass())) {
            return type.accepts(object);
        }
        return false;
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
        return "Value " + path + (object == null ? " empty" : " " + object + " (" + object.getClass() + ")");
    }
}
