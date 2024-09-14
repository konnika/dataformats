package konrad.dataformats.core;

import konrad.dataformats.core.registries.TypeGeneratorRegistry;
import konrad.dataformats.core.types.Type;

import java.util.Objects;

public class ValueFormat {
    private final Path path;
    private final Type type;

    public ValueFormat(Path path, Type type) {
        this.path = path;
        this.type = type;
        validate();
    }

    private void validate() {
        if (path.isConcreteArrayPath()) {
            throw new RuntimeException("A ValueFormat is an abstract Path with no array indices");
        }
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

    public Type type() {
        return type;
    }

    @Override
    public String toString() {
        return "ValueFormat " + path.toString() + " " + type.toString();
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

    public static ValueFormat fromCsv(String line, TypeGeneratorRegistry typeGeneratorRegistry) {
        var parts = line.split(";");
        if (parts.length == 2) {
            return new ValueFormat(new Path(parts[0]), typeGeneratorRegistry.get(idFromCsv(line)).fromCsv(parts[1]));
        }
        throw new RuntimeException("ValueFormat CSV is expected to have these values per line: path;type. Got " + line);
    }

    private static String idFromCsv(String line) {
        var parts = line.split(";");
        if (parts.length < 2) {
            throw new RuntimeException("ValueFormat CSV is expected to have these values per line: path;type. Got " + line);
        }
        return parts[1];
    }
}
