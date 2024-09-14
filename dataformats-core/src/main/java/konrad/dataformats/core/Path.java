package konrad.dataformats.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Path {
    public static final String ARRAY_BRACKETS_WITHOUT_INDEX = "[]";
    public static final String REGEX_ARRAY_BRACKETS_WITHOUT_INDEX = "\\[]";
    public static final String REGEX_ARRAY_BRACKETS_WITH_INDEX = "\\[\\d+]";
    public static final String REGEX_ARRAY_BRACKETS_WITH_OR_WITHOUT_INDEX = "\\[\\d*]";
    public static final String SEPARATOR = ".";
    public static final String REGEX_SEPARATOR = "\\.";
    public static final String REGEX_ALLOWED_CHARACTERS_FOR_PATH_ELEMENT = "[a-zA-Z0-9_-]+";

    protected final String asString;
    protected final List<String> asList;

    public Path(String string) {
        this(List.of(string.split(REGEX_SEPARATOR)));
    }

    public Path(List<String> list) {
        this.asString = String.join(SEPARATOR, list);
        this.asList = new ArrayList<>(Validations.validateNotEmpty(list, "Path list"));

        validate();
    }

    public static Path join(List<Path> paths) {
        if (paths == null) {
            throw new RuntimeException("Cannot join null paths");
        }
        if (paths.isEmpty()) {
            throw new RuntimeException("Cannot join empty paths");
        }

        var iterator = paths.iterator();
        var path = iterator.next();
        while (iterator.hasNext()) {
            path = path.concat(iterator.next());
        }
        return path;
    }

    protected void validate() {
        if (!asList.stream().allMatch(element -> element.matches(REGEX_ALLOWED_CHARACTERS_FOR_PATH_ELEMENT) || element.matches(REGEX_ARRAY_BRACKETS_WITH_OR_WITHOUT_INDEX))) {
            throw new RuntimeException("Unexpected character in Path (allowed are [a-zA-Z0-9_-]): " + asString);
        }

        if (isConcreteArrayPath() && isAbstractArrayPath()) {
            throw new RuntimeException("Unexpected Path with abstract and concrete array values at the same time: " + asString);
        }
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

    public boolean equalsIgnoringIndices(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Path path = (Path) o;
        if (Objects.equals(asString, path.asString)) {
            return true;
        }

        var thisPathIndexesRemoved = asString.replaceAll(REGEX_ARRAY_BRACKETS_WITH_INDEX, ARRAY_BRACKETS_WITHOUT_INDEX);
        var otherPathIndexesRemoved = path.asString.replaceAll(REGEX_ARRAY_BRACKETS_WITH_INDEX, ARRAY_BRACKETS_WITHOUT_INDEX);
        return Objects.equals(thisPathIndexesRemoved, otherPathIndexesRemoved);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(asString);
    }

    int length() {
        return asList.size();
    }

    public boolean isArrayPath() {
        return asList.stream().anyMatch(element -> element.matches(REGEX_ARRAY_BRACKETS_WITH_OR_WITHOUT_INDEX));
    }

    public boolean isAbstractArrayPath() {
        return asList.stream().anyMatch(element -> element.matches(REGEX_ARRAY_BRACKETS_WITHOUT_INDEX));
    }

    public boolean isConcreteArrayPath() {
        return asList.stream().anyMatch(element -> element.matches(REGEX_ARRAY_BRACKETS_WITH_INDEX));
    }

    public Object getValueFrom(Map<String, Object> objectMap) {
        if (length() == 1) {
            return objectMap.get(asString);
        }

        var object = objectMap.get(firstElement());
        if (object == null) {
            return null;
        }
        if (object instanceof Map) {
            var map = (Map<String, Object>) object;
            return afterFirstElement().getValueFrom(map);
        }
        if (object instanceof List) {
            if (isAbstractArrayPath()) {
                throw new RuntimeException("Cannot get a concrete value from an abstract Path: " + asString);
            }
            var list = (List<Map<String, Object>>) object;
            var index = Integer.parseInt(firstConcreteArrayElement().replaceAll("[\\[\\]]", ""));
            return afterFirstConcreteArray().getValueFrom(list.get(index));
        }
        throw new RuntimeException("Unexpected object in objectMap: " + object.getClass() + " at " + asString);
    }

    public String firstElement() {
        return asList.get(0);
    }

    public Path afterFirstElement() {
        return new Path(asList.stream().skip(1).toList());
    }

    @Override
    public String toString() {
        return "Path " + asString;
    }

    public String asString() {
        return asString;
    }

    public Path untilFirstAbstractArray() {
        var index = asList.indexOf(ARRAY_BRACKETS_WITHOUT_INDEX);
        if (index > -1) {
            return new Path(asList.subList(0, index));
        }

        throw new RuntimeException("Path does not contain array, as expected: " + asString);
    }

    public String firstConcreteArrayElement() {
        return asList.stream()
                .filter(element -> element.matches(REGEX_ARRAY_BRACKETS_WITH_INDEX))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Path does not contain array, as expected: " + asString));
    }

    public Path afterFirstAbstractArray() {
        var index = asList.indexOf(ARRAY_BRACKETS_WITHOUT_INDEX);
        if (index > -1) {
            return new Path(asList.subList(index + 1, asList.size()));
        }

        throw new RuntimeException("Path does not contain an abstract array, as expected: " + asString);
    }

    public Path afterFirstConcreteArray() {
        int index = asList.stream().filter(element -> element.matches(REGEX_ARRAY_BRACKETS_WITH_INDEX)).findFirst().map(asList::indexOf).orElse(-1);
        if (index > -1) {
            return new Path(asList.subList(index + 1, asList.size()));
        }

        throw new RuntimeException("Path does not contain a concrete array, as expected: " + asString);
    }

    public List<Path> allConcretePaths(Map<String, Object> map) {
        return allConcretePaths(map, null, this);
    }

    private List<Path> allConcretePaths(Map<String, Object> map, Path previous, Path remaining) {
        if (!remaining.isAbstractArrayPath()) {
            return List.of(previous == null ? remaining : previous.concat(remaining));
        }

        var nextListPath = remaining.untilFirstAbstractArray();
        var remainingPath = remaining.afterFirstAbstractArray();

        var result = new ArrayList<Path>();

        var list = nextListPath.getListFrom(map);
        for (int i = 0; i < list.size(); i++) {
            var pathToAppend = nextListPath.concat(new Path("[" + i + "]"));
            var previousPath = previous == null ? pathToAppend : previous.concat(pathToAppend);
            result.addAll(allConcretePaths(list.get(i), previousPath, remainingPath));
        }

        return result;
    }

    public List<Map<String, Object>> getListFrom(Map<String, Object> objectMap) {
        var object = getValueFrom(objectMap);
        if (object == null) {
            return Collections.emptyList();
        }
        if (object instanceof List<?> list) {
            return (List<Map<String, Object>>) list;
        }

        throw new RuntimeException("ObjectMap does not contain a list, as expected: " + object.getClass() + " at " + asString);
    }

    public boolean isFirstElementAConcreteArray() {
        return asList.get(0).matches(REGEX_ARRAY_BRACKETS_WITH_INDEX);
    }

    public boolean startsWith(Path path) {
        return asString.startsWith(path.asString);
    }

    public Path asAbstractPath() {
        var list = asList.stream().map(element -> element.replaceAll(REGEX_ARRAY_BRACKETS_WITH_INDEX, ARRAY_BRACKETS_WITHOUT_INDEX)).toList();
        return new Path(list);
    }

    public List<Integer> arrayIndices() {
        return asList.stream().filter(element -> element.matches(REGEX_ARRAY_BRACKETS_WITH_INDEX))
                .map(element -> Integer.parseInt(element.replaceAll("[\\[\\]]", "")))
                .toList();
    }

    public int arrayCount() {
        return (int) asList.stream().filter(element -> element.matches(REGEX_ARRAY_BRACKETS_WITH_OR_WITHOUT_INDEX)).count();
    }

    public Path copyArrayIndicesTo(Path to) {
        if (!this.isConcreteArrayPath()) {
            if (!to.isAbstractArrayPath()) {
                return to;
            }
            throw new RuntimeException("Path is not concrete: " + this);
        }
        if (!to.isAbstractArrayPath()) {
            throw new RuntimeException("Path is not abstract: " + to);
        }
        var arrayIndices = this.arrayIndices();
        if (arrayIndices.size() != to.arrayCount()) {
            throw new RuntimeException("Paths have different number of arrays: " + this + ", " + to);
        }

        var parts = new ArrayList<Path>();
        var remaining = to;
        for (var index : arrayIndices) {
            var part = remaining.untilFirstAbstractArray();
            parts.add(part);
            parts.add(new Path("[" + index + "]"));
            remaining = remaining.afterFirstAbstractArray();
        }
        parts.add(remaining);

        return Path.join(parts);
    }
}