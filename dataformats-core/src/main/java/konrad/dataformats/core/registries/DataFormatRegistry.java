package konrad.dataformats.core.registries;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;

import java.util.HashMap;
import java.util.Map;

public class DataFormatRegistry {
    private final Map<Class<?>, DataFormat> dataFormatsByClass;
    private final Map<DataFormatId, DataFormat> dataFormatsById;

    public DataFormatRegistry() {
        this.dataFormatsByClass = new HashMap<>();
        this.dataFormatsById = new HashMap<>();
    }

    public <T> void put(Class<T> aClass, DataFormat dataFormat) {
        dataFormatsByClass.put(aClass, dataFormat);
        dataFormatsById.put(dataFormat.id(), dataFormat);
    }

    public DataFormat get(Class<?> aClass) {
        var dataFormat = dataFormatsByClass.get(aClass);
        if (dataFormat == null) {
            throw new RuntimeException("No DataFormat found for " + aClass);
        }
        return dataFormat;
    }

    public DataFormat get(DataFormatId id) {
        var dataFormat = dataFormatsById.get(id);
        if (dataFormat == null) {
            throw new RuntimeException("No DataFormat found with id " + id);
        }
        return dataFormat;
    }
}
