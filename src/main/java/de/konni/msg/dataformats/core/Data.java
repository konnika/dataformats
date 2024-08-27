package de.konni.msg.dataformats.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    private final DataFormat dataFormat;
    private final Map<Path, Value> values = new HashMap<>();

    Data(DataFormat dataFormat, List<Value> values) {
        this.dataFormat = dataFormat;
        Validations.validateNotEmpty(values, "Data Values").forEach(this::add);
    }

    public void add(Value value) {
        this.values.put(value.path(), value);
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
            var object = pathAfterFirstArray.singleValue(map);

            var pathOfFirstArray = new Path("[" + index + "]");
            var completePath = pathToFirstArray.concat(pathOfFirstArray).concat(pathAfterFirstArray);
            result.add(new Value(completePath, valueFormat.type(), object));
        }
        return result;
    }
}
