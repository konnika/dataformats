package de.konni.msg.dataformats.core;

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
}
