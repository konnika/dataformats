package de.konni.msg.dataformats.core;

import java.util.*;

public class Data {
    private final DataFormat dataFormat;
    private final DataFormatId dataFormatId;
    private final Map<Path, Value> values = new HashMap<>();

    Data(DataFormat dataFormat, List<Value> values) {
        this.dataFormat = dataFormat;
        this.dataFormatId = dataFormat.id();
        Validations.validateNotNull(values, "Data Values").forEach(this::addOrFailIfHasObject);
    }

    public void addOrOverrideIfHasObject(Value value) {
        validatePath(value.path());
        this.values.put(value.path(), value);
    }

    public void addOrFailIfHasObject(Value value) {
        if (values.containsKey(value.path()) && values.get(value.path()).hasObject()) {
            throw new RuntimeException("Path already exists: " + value.path());
        }

        validatePath(value.path());
        this.values.put(value.path(), value);
    }

    public void addNonNullValuesFrom(Data other) {
        validateForOverride(other);

        var nonNullValues = other.values.values().stream().filter(Value::hasObject).toList();
        for (Value otherValue : nonNullValues) {
            var path = otherValue.path();
            var thisValue = values.get(path);
            if (thisValue == null || thisValue.isEmpty()) {
                values.put(path, otherValue);
            }
        }
    }

    public void overrideWithNonNullValuesFrom(Data other) {
        validateForOverride(other);

        other.values.values().stream()
                .filter(Value::hasObject)
                .forEach(otherValue -> values.put(otherValue.path(), otherValue));
    }

    private void validatePath(Path path) {
        if (dataFormat.valueFormats().stream().map(ValueFormat::path).noneMatch(path::equalsIgnoringIndices)) {
            throw new RuntimeException("Path does not exist: " + path);
        }
    }

    private void validateForOverride(Data other) {
        if (other == null) {
            throw new RuntimeException("Data is null");
        }

        if (!Objects.equals(dataFormatId, other.dataFormatId)) {
            throw new RuntimeException("Data format does not match");
        }
    }

    public Value get(Path path) {
        return values.get(path);
    }

    public static Data from(Map<String, Object> objectMap, DataFormat dataFormat) {
        var values = new ArrayList<>(
                dataFormat.valueFormats().stream()
                        .filter(vf -> vf.path().isSingleValue())
                        .map(vf -> singleValue(objectMap, vf))
                        .toList());

        values.addAll(
                dataFormat.valueFormats().stream()
                        .filter(vf -> vf.path().isListValue())
                        .map(vf -> listValues(objectMap, vf))
                        .flatMap(List::stream)
                        .toList());

        return new Data(dataFormat, values);
    }

    private static Value singleValue(Map<String, Object> objectMap, ValueFormat valueFormat) {
        var object = valueFormat.path().singleValue(objectMap);
        return new Value(valueFormat.path(), valueFormat.type(), object);
    }

    private static List<Value> listValues(Map<String, Object> objectMap, ValueFormat valueFormat) {
        var pathToFirstArray = valueFormat.path().untilFirstArray();
        var pathAfterFirstArray = valueFormat.path().afterFirstArray();

        var result = new ArrayList<Value>();
        var list = pathToFirstArray.listOfValues(objectMap);
        for (int index = 0; index < list.size(); index++) {
            var map = list.get(index);
            // FIXME this assumes that the pathAfterFirstArray is a singleValue. It should instead recurse here
            var object = pathAfterFirstArray.singleValue(map);

            var pathOfFirstArray = new Path("[" + index + "]");
            var completePath = pathToFirstArray.concat(pathOfFirstArray).concat(pathAfterFirstArray);
            result.add(new Value(completePath, valueFormat.type(), object));
        }
        return result;
    }

    public Map<String, Object> toMap() {
        var result = new HashMap<String, Object>();
        for (Value value : values.values()) {
            addValueToMap(result, value.path(), value.object());
        }
        return result;
    }

    private void addValueToMap(Map<String, Object> result, Path path, Object object) {
        if (path.length() == 1) {
            result.put(path.asString(), object);
        } else {
            var firstElement = path.firstElement();
            if (path.afterFirstElement().isFirstElementAListIndex()) {
                result.putIfAbsent(firstElement, new ArrayList<>());
                var childList = (List<Map<String, Object>>) result.get(firstElement);
                addValueToList(childList, path.afterFirstElement(), object);
            } else {
                result.putIfAbsent(firstElement, new HashMap<>());
                var childMap = (Map<String, Object>) result.get(firstElement);
                addValueToMap(childMap, path.afterFirstElement(), object);
            }
        }
    }

    private void addValueToList(List<Map<String, Object>> list, Path path, Object object) {
        if (path.length() == 1) {
            throw new RuntimeException("Expected Path of length > 1: " + path);
        }

        if (!path.isFirstElementAListIndex()) {
            throw new RuntimeException("Expected list index in the first element of: " + path);
        }

        var index = Integer.parseInt(path.firstElement().replaceAll("[\\[\\]]", ""));
        while (list.size() <= index) {
            list.add(new HashMap<>());
        }
        addValueToMap(list.get(index), path.afterFirstElement(), object);
    }

    public boolean has(DataFormat dataFormat) {
        return Objects.equals(dataFormat, this.dataFormat);
    }

    public DataFormatId dataFormatId() {
        return dataFormatId;
    }
}
