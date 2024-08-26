package de.konni.msg.dataformats.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    private final DataFormat dataFormat;
    private final Map<Path, Value> values = new HashMap<>();

    public Data(DataFormat dataFormat, List<Value> values) {
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
}
