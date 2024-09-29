package konrad.dataformats.core;

import konrad.dataformats.core.validation.DataFormatsException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

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
        if (this.valueFormats.stream().anyMatch(vf -> vf.path().equals(valueFormat.path()))) {
            throw new DataFormatsException("DataFormat " + id + " already contains a value format for path " + valueFormat.path());
        }

        this.valueFormats.add(valueFormat);
    }

    public boolean contains(Path path) {
        return valueFormats.stream().anyMatch(v -> v.has(path));
    }

    public ValueFormat get(Path path) {
        return valueFormats.stream().filter(p -> p.has(path)).findFirst().orElseThrow(() -> new DataFormatsException("Value path (from) " + path + " is not defined in DataFormat " + id));
    }

    public List<ValueFormat> valueFormats() {
        return Collections.unmodifiableList(valueFormats);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataFormat that = (DataFormat) o;
        if (id.equals(that.id) && valueFormats.size() == that.valueFormats.size()) {
            return new HashSet<>(that.valueFormats).containsAll(valueFormats);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public DataFormatId id() {
        return id;
    }

    @Override
    public String toString() {
        return "DataFormat " + id.toString();
    }
}
