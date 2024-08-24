package de.konni.msg.dataformats.core;

import java.util.Objects;

public class Path {
    private final String asString;

    public Path(String asString) {
        this.asString = asString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Path path = (Path) o;
        return Objects.equals(asString, path.asString);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(asString);
    }
}
