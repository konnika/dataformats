package de.konni.msg.dataformats.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataFormat {
    private final DataFormatId id;
    private final List<ValueFormat> valueFormats = new ArrayList<>();

    public DataFormat(DataFormatId id, List<ValueFormat> valueFormats) {
        this.id = id;
        if (valueFormats != null) {
            valueFormats.forEach(this::add);
        }
    }

    private void add(ValueFormat valueFormat) {
        this.valueFormats.add(valueFormat);
    }

    public boolean contains(Path path) {
        return valueFormats.stream().anyMatch(v -> v.has(path));
    }

    public Optional<ValueFormat> get(Path path) {
        return valueFormats.stream().filter(p -> p.has(path)).findFirst();
    }
}
