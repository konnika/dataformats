package de.konni.msg.dataformats.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    private final DataFormat dataFormat;
    private final Map<Path, Value> values = new HashMap<>();

    Data(DataFormat dataFormat, List<Value> values) {
        this.dataFormat = dataFormat;
        if (values != null) {
            values.forEach(this::add);
        }
    }

    public void add(Value value) {
        this.values.put(value.path(), value);
    }

    public Value get(Path path) {
        return values.get(path);
    }

    public static Data from(Map<String, Object> objectMap, DataFormat dataFormat) {
        var values = dataFormat.valueFormats().stream().map(valueFormat -> value(objectMap, valueFormat)).toList();
        return new Data(dataFormat, values);
    }

    private static Value value(Map<String, Object> objectMap, ValueFormat valueFormat) {
        var object = valueFormat.path().value(objectMap);
        return new Value(valueFormat.path(), valueFormat.type(), object);
    }
}
