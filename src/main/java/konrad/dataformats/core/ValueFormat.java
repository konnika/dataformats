package konrad.dataformats.core;

import java.util.Objects;

public class ValueFormat {
    private final Path path;
    private final Type type;

    public ValueFormat(Path path, Type type) {
        this.path = path;
        this.type = type;
    }

    boolean has(Path path) {
        return Objects.equals(this.path, path);
    }

    boolean has(Type type) {
        return Objects.equals(this.type, type);
    }

    Path path() {
        return path;
    }

    Type type() {
        return type;
    }

    @Override
    public String toString() {
        return path.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValueFormat that = (ValueFormat) o;
        return Objects.equals(path, that.path) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, type);
    }
}
