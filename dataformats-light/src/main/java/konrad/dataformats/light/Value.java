package konrad.dataformats.light;

import konrad.dataformats.light.validation.DataWithoutFormatException;
import konrad.dataformats.light.validation.Validations;

import java.util.Objects;
import java.util.Optional;

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
            throw new DataWithoutFormatException("Path to value should not be abstract");
        }
    }

    public Path path() {
        return path;
    }

    public Optional<Object> object() {
        return Optional.ofNullable(object);
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
