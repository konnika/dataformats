package de.konni.msg.dataformats.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Path {
    private final String asString;
    private final List<String> asList;

    public Path(String string) {
        this.asString = Validations.validateNotEmpty(string);
        this.asList = List.of(string.split("\\."));
    }

    Path(List<String> list) {
        this.asString = String.join(".", list);
        this.asList = new ArrayList<>(Validations.validateNotEmpty(list));
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

    private int length() {
        return asList.size();
    }

    public Object value(Map<String, Object> objectMap) {
        if (length() == 0) {
            throw new RuntimeException("Unexpected empty Path");
        }
        if (length() == 1) {
            return objectMap.get(asString);
        }

        var object = objectMap.get(firstElement());
        if (object == null) {
            return null;
        }
        if (object instanceof Map) {
            var map = (Map<String, Object>) object;
            return withoutFirstElement().value(map);
        }
        if (object instanceof List) {
            var list = (List<Object>) object;
            // TODO implement

        }
        throw new RuntimeException("Unexpected object in objectMap: " + object.getClass());
    }

    private String firstElement() {
        return asList.get(0);
    }

    private Path withoutFirstElement() {
        return new Path(asList.stream().skip(1).toList());
    }
}
