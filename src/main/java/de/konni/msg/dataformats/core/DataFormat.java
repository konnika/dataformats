package de.konni.msg.dataformats.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataFormat {
    private final String name;
    private final List<ValueFormat> valueFormats = new ArrayList<>();

    public DataFormat(String name, List<ValueFormat> valueFormats) {
        this.name = name;
        if (valueFormats != null) {
            this.valueFormats.addAll(valueFormats);
        }
    }

    public boolean contains(Path path) {
        return valueFormats.stream().anyMatch(v -> v.has(path));
    }

    public Optional<ValueFormat> get(Path path) {
        return valueFormats.stream().filter(p -> p.has(path)).findFirst();
    }
}
