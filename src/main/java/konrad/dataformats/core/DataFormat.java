package konrad.dataformats.core;

import java.util.*;

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

    boolean contains(Path path) {
        return valueFormats.stream().anyMatch(v -> v.has(path));
    }

    Optional<ValueFormat> get(Path path) {
        return valueFormats.stream().filter(p -> p.has(path)).findFirst();
    }

    List<ValueFormat> valueFormats() {
        return Collections.unmodifiableList(valueFormats);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataFormat that = (DataFormat) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public DataFormatId id() {
        return id;
    }
}
