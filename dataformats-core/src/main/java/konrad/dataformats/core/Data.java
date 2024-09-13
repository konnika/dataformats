package konrad.dataformats.core;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Data {
    private final DataFormat dataFormat;
    private final Map<Path, Value> values = new HashMap<>();

    public Data(DataFormat dataFormat, List<Value> values) {
        this.dataFormat = dataFormat;

        var listOfValues = Validations.validateNotNull(values, "Data Values");
        listOfValues.forEach(this::addOrFailIfHasObject);
    }

    public void addOrOverrideIfHasObject(Value value) {
        var valueFormat = validatePath(value.path());
        validateType(valueFormat, value);

        this.values.put(value.path(), value);
    }

    public void addOrFailIfHasObject(Value value) {
        if (values.containsKey(value.path()) && values.get(value.path()).hasObject()) {
            throw new RuntimeException("Path " + value.path() + " already has value " + values.get(value.path()).object() + ". Cannot add new value " + value);
        }

        var valueFormat = validatePath(value.path());
        validateType(valueFormat, value);

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

    private ValueFormat validatePath(Path path) {
        return dataFormat.valueFormats().stream()
                .filter(vf -> vf.path().equalsIgnoringIndices(path))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Path " + path + " does not exist in Dataformat " + dataFormat.id()));
    }

    private void validateType(ValueFormat valueFormat, Value value) {
        if (!value.is(valueFormat.type())) {
            throw new RuntimeException("Unexpected Value object in Data with DataFormat " + dataFormat.id() + ": " + value);
        }
    }

    private void validateForOverride(Data other) {
        if (other == null) {
            throw new RuntimeException("Data is null");
        }

        if (!has(other.dataFormat.id())) {
            throw new RuntimeException("Data format does not match");
        }
    }

    public Value getValue(Path path) {
        if (path.isAbstractArrayPath()) {
            throw new RuntimeException("Path " + path + " must be a concrete array path");
        }

        if (dataFormat.contains(path.withoutArrayIndices())) {
            return values.get(path);
        }

        throw new RuntimeException("Path " + path + " does not exist in Dataformat " + dataFormat.id());
    }

    public List<Value> getValuesIgnoringIndices(Path path) {
        return values.values().stream().filter(value -> value.path().equalsIgnoringIndices(path)).toList();
    }

    public static Data from(Map<String, Object> objectMap, DataFormat dataFormat) {
        var values = dataFormat.valueFormats().stream()
                .map(ValueFormat::path)
                .map(path -> getValuesFromMap(objectMap, path))
                .flatMap(List::stream)
                .toList();

        return new Data(dataFormat, values);
    }

    private static List<Value> getValuesFromMap(Map<String, Object> objectMap, Path path) {
        return path.withArrayIndices(objectMap).stream()
                .map(p -> new Value(p, p.getValueFrom(objectMap)))
                .toList();
    }

//    private static Value singleValue(Map<String, Object> objectMap, Path path) {
//        var object = path.getValueFrom(objectMap);
//        return new Value(path, object);
//    }

//    private static List<Value> listValues(Map<String, Object> objectMap, Path path) {
//        var pathToFirstArray = path.untilFirstAbstractArray();
//        var pathAfterFirstArray = path.afterFirstAbstractArray();
//
//        var result = new ArrayList<Value>();
//        var list = pathToFirstArray.getArrayValuesFrom(objectMap);
//        for (int index = 0; index < list.size(); index++) {
//            var map = list.get(index);
//            // FIXME this assumes that the pathAfterFirstArray is a singleValue. It should instead recurse here
//            var object = pathAfterFirstArray.getValueFrom(map);
//
//            var pathOfFirstArray = new Path("[" + index + "]");
//            var completePath = pathToFirstArray.concat(pathOfFirstArray).concat(pathAfterFirstArray);
//            result.add(new Value(completePath, object));
//        }
//        return result;
//    }

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
            if (path.afterFirstElement().isFirstElementAConcreteArray()) {
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

        if (!path.isFirstElementAConcreteArray()) {
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

    public boolean has(DataFormatId id) {
        return Objects.equals(dataFormat.id(), id);
    }

    public DataFormatId dataFormatId() {
        return dataFormat.id();
    }
}
