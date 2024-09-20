package konrad.dataformats.light;

import konrad.dataformats.light.validation.DataWithoutFormatException;
import konrad.dataformats.light.validation.Validations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DataWithoutFormat<T> {
    private final Class<T> objectClass;
    private final Map<Path, Value> values;

    public DataWithoutFormat(Map<String, Object> objectMap, Class<T> objectClass) {
        Validations.validateNotNull(objectMap, "objectMap for DataWithoutFormat");
        Validations.validateNotNull(objectClass, "objectClass for DataWithoutFormat");

        this.objectClass = objectClass;
        values = new HashMap<>();

        collectValues(objectMap, null);
    }

    public void add(Value value) {
        if (values.containsKey(value.path()) && values.get(value.path()).hasObject()) {
            throw new DataWithoutFormatException("Path " + value.path() + " already has value " + values.get(value.path()).object() + ". Cannot add new value " + value);
        }

        this.values.put(value.path(), value);
    }

    public boolean is(Class<T> objectClass) {
        return this.objectClass.equals(objectClass);
    }

    public Value getValue(Path path) {
        if (path.isAbstractArrayPath()) {
            throw new DataWithoutFormatException("Path " + path + " must be a concrete array path");
        }

        return Optional.ofNullable(values.get(path))
                .orElseThrow(() -> new DataWithoutFormatException("Path " + path + " does not exist in DataWithoutFormat"));
    }

    private void collectValues(Map<String, Object> objectMap, Path previousPath) {
        for (var entry : objectMap.entrySet()) {
            var currentPathElement = new Path(entry.getKey());
            var currentPath = previousPath == null ? currentPathElement : previousPath.concat(currentPathElement);

            var object = entry.getValue();
            if (object instanceof Map) {
                @SuppressWarnings("unchecked")
                var nestedMap = (Map<String, Object>) object;
                collectValues(nestedMap, currentPath);
            } else if (object instanceof List<?> nestedList) {
                collectValues(nestedList, currentPath);
            } else {
                values.put(currentPath, new Value(currentPath, object));
            }
        }
    }

    private void collectValues(List<?> nestedList, Path currentPath) {
        if (!nestedList.isEmpty() && nestedList.get(0) instanceof Map) {
            @SuppressWarnings("unchecked")
            var listOfMaps = (List<Map<String, Object>>) nestedList;
            for (int i = 0; i < listOfMaps.size(); i++) {
                var map = listOfMaps.get(i);
                var currentPathWithListIndex = currentPath.concat(new Path("[" + i + "]"));
                collectValues(map, currentPathWithListIndex);
            }
        } else {
            for (int i = 0; i < nestedList.size(); i++) {
                var obj = nestedList.get(i);
                var currentPathWithListIndex = currentPath.concat(new Path("[" + i + "]"));
                values.put(currentPath, new Value(currentPathWithListIndex, obj));
            }
        }
    }

    public Map<String, Object> toMap() {
        var result = new HashMap<String, Object>();
        for (Value value : values.values()) {
            addValueToMap(result, value.path(), value.object().orElse(null));
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
                    @SuppressWarnings("unchecked")
                    var childList = (List<Map<String, Object>>) result.get(firstElement);
                    addValueToList(childList, path.afterFirstElement(), object);
                } catch (ClassCastException e) {
                    throw new DataWithoutFormatException("Expected a list at " + firstElement + " of " + path + " but got " + result.get(firstElement).getClass());
                }
            } else {
                result.putIfAbsent(firstElement, new HashMap<>());
                try {
                    @SuppressWarnings("unchecked")
                    var childMap = (Map<String, Object>) result.get(firstElement);
                    addValueToMap(childMap, path.afterFirstElement(), object);
                } catch (ClassCastException e) {
                    throw new DataWithoutFormatException("Expected a map at " + firstElement + " of " + path + " but got " + result.get(firstElement).getClass());
                }
            }
        }
    }

    private void addValueToList(List<Map<String, Object>> list, Path path, Object object) {
        if (path.length() == 1) {
            throw new DataWithoutFormatException("Expected Path of length > 1: " + path);
        }

        if (!path.isFirstElementAConcreteArray()) {
            throw new DataWithoutFormatException("Expected list index in the first element of: " + path);
        }

        var index = path.indexOfFirstConcreteArrayElement();
        while (list.size() <= index) {
            list.add(new HashMap<>());
        }
        addValueToMap(list.get(index), path.afterFirstElement(), object);
    }

    public Class<T> objectClass() {
        return objectClass;
    }
}
