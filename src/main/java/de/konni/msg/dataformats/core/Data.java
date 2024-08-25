package de.konni.msg.dataformats.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    private final DataFormatId id;
    private final Map<Path, Value> values = new HashMap<>();

    public Data(DataFormatId id, List<Value> values) {
        this.id = id;
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
