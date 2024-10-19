package konrad.dataformats.core;

import konrad.dataformats.core.validation.DataFormatsException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class DataFormat {
    private final DataFormatId id;
    private final List<ValueFormat> valueFormats = new ArrayList<>();
    private final Map<Path, ValueFormat> pathToValueFormat = new HashMap<>();

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
        pathToValueFormat.put(valueFormat.path(), valueFormat);
    }

    public boolean contains(Path path) {
        return pathToValueFormat.containsKey(path);
    }

    public ValueFormat get(Path path) {
        return Optional.ofNullable(pathToValueFormat.get(path))
                .orElseThrow(() -> new DataFormatsException(path + " is not defined in DataFormat " + id));
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
