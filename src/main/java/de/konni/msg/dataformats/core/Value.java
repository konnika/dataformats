package de.konni.msg.dataformats.core;

import java.util.Objects;

public class Value {
    private final Path path;
    private final Type type;
    private final Object object;

    public Value(Path path, Type type, Object object) {
        this.path = path;
        this.type = type;
        this.object = object;
    }

    public Path path() {
        return path;
    }

    public Object object() {
        return object;
    }

    public boolean has(Type type) {
        return Objects.equals(this.type, type);
    }

    public boolean hasValue() {
        return object != null;
    }

    public boolean isEmpty() {
        return object == null;
    }

    public Type type() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return Objects.equals(path, value.path) && Objects.equals(type, value.type) && Objects.equals(object, value.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, type, object);
    }
}
