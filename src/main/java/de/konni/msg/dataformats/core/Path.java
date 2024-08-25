package de.konni.msg.dataformats.core;

import java.util.Objects;

public class Path {
    private final String stringRepresentation;

    public Path(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Path path = (Path) o;
        return Objects.equals(stringRepresentation, path.stringRepresentation);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(stringRepresentation);
    }
}
