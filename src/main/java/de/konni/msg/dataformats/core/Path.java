package de.konni.msg.dataformats.core;

import java.util.*;

public class Path {
    private final String asString;
    private final List<String> asList;

    public Path(String string) {
        this.asString = Validations.validateNotEmpty(string, "Path");
        this.asList = List.of(string.split("\\."));
    }

    Path(List<String> list) {
        this.asString = String.join(".", list);
        this.asList = new ArrayList<>(Validations.validateNotEmpty(list, "Path list"));
    }

    public Path concat(Path next) {
        var concatenated = new ArrayList<>(asList);
        concatenated.addAll(next.asList);
        return new Path(concatenated);
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

    int length() {
        return asList.size();
    }

    public Object singleValue(Map<String, Object> objectMap) {
        if (length() == 1) {
            return objectMap.get(asString);
        }

        var object = objectMap.get(firstElement());
        if (object == null) {
            return null;
        }
        if (object instanceof Map) {
            var map = (Map<String, Object>) object;
            return afterFirstElement().singleValue(map);
        }
        if (object instanceof List) {
            throw new RuntimeException("Unexpected list in objectMap at " + asString);
        }
        throw new RuntimeException("Unexpected object in objectMap: " + object.getClass() + " at " + asString);
    }

    boolean isSingleValue() {
        return asList.stream().noneMatch(str -> str.contains("[]"));
    }

    boolean isListValue() {
        return asList.stream().anyMatch(str -> str.contains("[]"));
    }

    String firstElement() {
        return asList.get(0);
    }

    Path afterFirstElement() {
        return new Path(asList.stream().skip(1).toList());
    }

    @Override
    public String toString() {
        return asString;
    }

    String asString() {
        return asString;
    }

    public Path untilFirstArray() {
        var index = asList.indexOf("[]");
        if (index > -1) {
            return new Path(asList.subList(0, index));
        }

        throw new RuntimeException("Path does not contain array, as expected: " + asString);
    }

    public Path afterFirstArray() {
        var index = asList.indexOf("[]");
        if (index > -1) {
            return new Path(asList.subList(index + 1, asList.size()));
        }

        throw new RuntimeException("Path does not contain array, as expected: " + asString);
    }

    public List<Map<String, Object>> listOfValues(Map<String, Object> objectMap) {
        var object = singleValue(objectMap);
        if (object == null) {
            return Collections.emptyList();
        }
        if (object instanceof List<?> list) {
            return (List<Map<String, Object>>) list;
        }

        throw new RuntimeException("ObjectMap does not contain a list, as expected: " + object.getClass() + " at " + asString);
    }

    public boolean isFirstElementAListIndex() {
        return asList.get(0).matches("\\[\\d+]");
    }
}
