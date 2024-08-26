package de.konni.msg.dataformats.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

class DataFormat {
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

    boolean contains(Path path) {
        return valueFormats.stream().anyMatch(v -> v.has(path));
    }

    Optional<ValueFormat> get(Path path) {
        return valueFormats.stream().filter(p -> p.has(path)).findFirst();
    }

    List<ValueFormat> valueFormats() {
        return Collections.unmodifiableList(valueFormats);
    }
}
