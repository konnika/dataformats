package konrad.dataformats.core;

import konrad.dataformats.core.validation.DataFormatsException;
import konrad.dataformats.core.validation.Validations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

public class Path {
    public static final String ARRAY_BRACKETS_WITHOUT_INDEX = "[]";
    public static final Pattern REGEX_ARRAY_BRACKETS_WITH_INDEX = Pattern.compile("\\[\\d+]");
    public static final Pattern REGEX_ARRAY_BRACKETS_WITH_OR_WITHOUT_INDEX = Pattern.compile("\\[\\d*]");
    public static final String REGEX_ALLOWED_CHARACTERS_FOR_PATH_ELEMENT = "[a-zA-Z0-9_-]+";
    public static final String REGEX_PATH_ELEMENT = "(" + REGEX_ALLOWED_CHARACTERS_FOR_PATH_ELEMENT + "|" + REGEX_ARRAY_BRACKETS_WITH_OR_WITHOUT_INDEX + ")";
    public static final Pattern REGEX_PATH = Pattern.compile(REGEX_PATH_ELEMENT + "(." + REGEX_PATH_ELEMENT + ")*");
    public static final String SEPARATOR = ".";
    public static final String REGEX_SEPARATOR = "\\.";

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
            throw new DataFormatsException("Cannot join null paths");
        }
        if (paths.isEmpty()) {
            throw new DataFormatsException("Cannot join empty paths");
        }

        var iterator = paths.iterator();
        var path = iterator.next();
        while (iterator.hasNext()) {
            path = path.concat(iterator.next());
        }
        return path;
    }

    protected void validate() {
        if (!REGEX_PATH.matcher(asString).matches()) {
            throw new DataFormatsException("Unexpected Path. Allowed is " + REGEX_PATH.pattern() + ": " + asString);
        }

        if (isConcreteArrayPath() && isAbstractArrayPath()) {
            throw new DataFormatsException("Unexpected Path with abstract and concrete array values at the same time: " + asString);
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

    @Override
    public int hashCode() {
        return Objects.hashCode(asString);
    }

    public int length() {
        return asList.size();
    }

    public boolean isAbstractArrayPath() {
        return asString.contains(ARRAY_BRACKETS_WITHOUT_INDEX);
    }

    public boolean isConcreteArrayPath() {
        return REGEX_ARRAY_BRACKETS_WITH_INDEX.matcher(asString).find();
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
            @SuppressWarnings("unchecked")
            var map = (Map<String, Object>) object;
            return afterFirstElement().getValueFrom(map);
        }
        if (object instanceof List) {
            if (isAbstractArrayPath()) {
                throw new DataFormatsException("Cannot get a concrete value from an abstract Path: " + asString);
            }
            @SuppressWarnings("unchecked")
            var list = (List<Map<String, Object>>) object;
            var index = indexOfFirstConcreteArrayElement();
            if (endsAfterFirstConcreteArray()) {
                return list.get(index);
            } else {
                return afterFirstConcreteArray().getValueFrom(list.get(index));
            }
        }
        throw new DataFormatsException("Unexpected object in objectMap: " + object.getClass() + " at " + asString);
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

        throw new DataFormatsException("Path does not contain array, as expected: " + asString);
    }

    public String firstConcreteArrayElement() {
        return asList.stream()
                .filter(element -> REGEX_ARRAY_BRACKETS_WITH_INDEX.matcher(element).matches())
                .findFirst()
                .orElseThrow(() -> new DataFormatsException("Path does not contain array, as expected: " + asString));
    }

    public Path afterFirstAbstractArray() {
        var index = asList.indexOf(ARRAY_BRACKETS_WITHOUT_INDEX);
        if (index > -1) {
            return new Path(asList.subList(index + 1, asList.size()));
        }

        throw new DataFormatsException("Path does not contain an abstract array, as expected: " + asString);
    }

    public Path afterFirstConcreteArray() {
        int index = firstConcreteArrayPosition();
        if (index > -1) {
            return new Path(asList.subList(index + 1, asList.size()));
        }

        throw new DataFormatsException("Path does not contain a concrete array, as expected: " + asString);
    }

    private int firstConcreteArrayPosition() {
        for (int i = 0; i < asList.size(); i++) {
            if (REGEX_ARRAY_BRACKETS_WITH_INDEX.matcher(asList.get(i)).matches()) {
                return i;
            }
        }
        return -1;
    }

    public List<Path> allConcretePaths(Map<String, Object> map) {
        return allConcretePaths(map, null, this);
    }

    private List<Path> allConcretePaths(Map<String, Object> map, Path previous, Path remaining) {
        if (!remaining.isAbstractArrayPath()) {
            return List.of(previous == null ? remaining : previous.concat(remaining));
        }

        var nextListPath = remaining.untilFirstAbstractArray();
        var list = nextListPath.getListFrom(map);

        var result = new ArrayList<Path>();

        if (remaining.endsAfterFirstAbstractArray()) {
            for (int i = 0; i < list.size(); i++) {
                var pathToAppend = nextListPath.concat(new Path("[" + i + "]"));
                var previousPath = previous == null ? pathToAppend : previous.concat(pathToAppend);
                result.add(previousPath);
            }
        } else {
            var remainingPath = remaining.afterFirstAbstractArray();
            for (int i = 0; i < list.size(); i++) {
                var pathToAppend = nextListPath.concat(new Path("[" + i + "]"));
                var previousPath = previous == null ? pathToAppend : previous.concat(pathToAppend);
                var mapOrObject = list.get(i);
                @SuppressWarnings("unchecked")
                var mapInList = (Map<String, Object>) mapOrObject;
                result.addAll(allConcretePaths(mapInList, previousPath, remainingPath));
            }
        }

        return result;
    }

    public boolean endsAfterFirstAbstractArray() {
        var index = asList.indexOf(ARRAY_BRACKETS_WITHOUT_INDEX);
        return index == asList.size() - 1;
    }

    private boolean endsAfterFirstConcreteArray() {
        var index = firstConcreteArrayPosition();
        return index == asList.size() - 1;
    }

    public List<?> getListFrom(Map<String, Object> objectMap) {
        var object = getValueFrom(objectMap);
        if (object == null) {
            return Collections.emptyList();
        }
        if (object instanceof List<?> list) {
            return list;
        }

        throw new DataFormatsException("ObjectMap does not contain a list, as expected: " + object.getClass() + " at " + asString);
    }

    public boolean isFirstElementAConcreteArray() {
        return REGEX_ARRAY_BRACKETS_WITH_INDEX.matcher(asList.get(0)).matches();
    }

    public int indexOfFirstConcreteArrayElement() {
        return Integer.parseInt(firstConcreteArrayElement().replaceAll("[\\[\\]]", ""));
    }

    public boolean startsWith(Path path) {
        return asString.startsWith(path.asString);
    }

    public Path asAbstractPath() {
        var list = asList.stream().map(element -> REGEX_ARRAY_BRACKETS_WITH_INDEX.matcher(element).replaceAll(ARRAY_BRACKETS_WITHOUT_INDEX)).toList();
        return new Path(list);
    }

    public List<Integer> arrayIndices() {
        return asList.stream().filter(element -> REGEX_ARRAY_BRACKETS_WITH_INDEX.matcher(element).matches())
                .map(Path::new)
                .map(Path::indexOfFirstConcreteArrayElement)
                .toList();
    }

    public int arrayCount() {
        return (int) asList.stream().filter(element -> REGEX_ARRAY_BRACKETS_WITH_OR_WITHOUT_INDEX.matcher(element).matches())
                .count();
    }

    public Path copyArrayIndicesTo(Path to) {
        if (!this.isConcreteArrayPath()) {
            if (!to.isAbstractArrayPath()) {
                return to;
            }
            throw new DataFormatsException("Path is not concrete: " + this);
        }
        if (!to.isAbstractArrayPath()) {
            throw new DataFormatsException("Path is not abstract: " + to);
        }
        var arrayIndices = this.arrayIndices();
        if (arrayIndices.size() != to.arrayCount()) {
            throw new DataFormatsException("Paths have different number of arrays: " + this + ", " + to);
        }

        var parts = new ArrayList<Path>();
        var remaining = to;
        for (var index : arrayIndices) {
            var part = remaining.untilFirstAbstractArray();
            parts.add(part);
            parts.add(new Path("[" + index + "]"));
            if (remaining.endsAfterFirstAbstractArray()) {
                return Path.join(parts);
            } else {
                remaining = remaining.afterFirstAbstractArray();
            }
        }
        parts.add(remaining);

        return Path.join(parts);
    }
}