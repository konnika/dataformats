package de.konni.msg.dataformats.core;

import java.util.Objects;

public class ValueFormat {
    private final Path path;
    private final Type type;

    public ValueFormat(Path path, Type type) {
        this.path = path;
        this.type = type;
    }

    public boolean has(Path path) {
        return Objects.equals(this.path, path);
    }

    public boolean has(Type type) {
        return Objects.equals(this.type, type);
    }
}
