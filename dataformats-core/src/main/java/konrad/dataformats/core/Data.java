package konrad.dataformats.core;


import konrad.dataformats.core.validation.DataFormatsException;
import konrad.dataformats.core.validation.Validations;

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
            throw new DataFormatsException("Path " + value.path() + " already has value " + values.get(value.path()).object() + ". Cannot add new value " + value);
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
                .orElseThrow(() -> new DataFormatsException("Path " + path + " does not exist in Dataformat " + dataFormat.id()));
    }

    private void validateType(ValueFormat valueFormat, Value value) {
        if (!value.is(valueFormat.type())) {
            throw new DataFormatsException("Value object has wrong format in Data with DataFormat " + dataFormat.id() + ". Expected " + valueFormat + ", but got " + value);
        }
    }

    private void validateForOverride(Data other) {
        if (other == null) {
            throw new DataFormatsException("Data is null");
        }

        if (!has(other.dataFormat.id())) {
            throw new DataFormatsException("Data format does not match");
        }
    }

    public Value getValue(Path path) {
        if (path.isAbstractArrayPath()) {
            throw new DataFormatsException("Path " + path + " must be a concrete array path");
        }

        if (dataFormat.contains(path.asAbstractPath())) {
            return values.get(path);
        }
        throw new DataFormatsException("%s does not exist in Dataformat %s".formatted(path, dataFormat.id()));
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
        return path.allConcretePaths(objectMap).stream()
                .map(p -> new Value(p, p.getValueFrom(objectMap)))
                .toList();
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
            if (path.afterFirstElement().isFirstElementAConcreteArray()) {
                result.putIfAbsent(firstElement, new ArrayList<>());
                try {
                    if (path.afterFirstElement().length() == 1) {
                        @SuppressWarnings("unchecked")
                        var childList = (List<Object>) result.get(firstElement);
                        addSimpleValueToList(childList, path.afterFirstElement(), object);
                    } else {
                        @SuppressWarnings("unchecked")
                        var childList = (List<Map<String, Object>>) result.get(firstElement);
                        addValueToList(childList, path.afterFirstElement(), object);
                    }
                } catch (ClassCastException e) {
                    throw new DataFormatsException("Expected a list at " + firstElement + " of " + path + " but got " + result.get(firstElement).getClass());
                }
            } else {
                result.putIfAbsent(firstElement, new HashMap<>());
                try {
                    @SuppressWarnings("unchecked")
                    var childMap = (Map<String, Object>) result.get(firstElement);
                    addValueToMap(childMap, path.afterFirstElement(), object);
                } catch (ClassCastException e) {
                    throw new DataFormatsException("Expected a map at " + firstElement + " of " + path + " but got " + result.get(firstElement).getClass());
                }
            }
        }
    }

    private void addValueToList(List<Map<String, Object>> list, Path path, Object object) {
        if (path.length() == 1) {
            throw new DataFormatsException("Expected Path of length > 1: " + path);
        }

        if (!path.isFirstElementAConcreteArray()) {
            throw new DataFormatsException("Expected list index in the first element of: " + path);
        }

        var index = Integer.parseInt(path.firstElement().replaceAll("[\\[\\]]", ""));
        while (list.size() <= index) {
            list.add(new HashMap<>());
        }
        addValueToMap(list.get(index), path.afterFirstElement(), object);
    }

    private void addSimpleValueToList(List<Object> list, Path path, Object object) {
        if (path.length() != 1) {
            throw new DataFormatsException("Expected Path of length 1: " + path);
        }

        if (!path.isFirstElementAConcreteArray()) {
            throw new DataFormatsException("Expected list index in the first element of: " + path);
        }

        var index = Integer.parseInt(path.firstElement().replaceAll("[\\[\\]]", ""));
        while (list.size() < index) {
            list.add("null");
        }
        if (index < list.size()) {
            list.remove(index);
        }
        list.add(index, object);
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
