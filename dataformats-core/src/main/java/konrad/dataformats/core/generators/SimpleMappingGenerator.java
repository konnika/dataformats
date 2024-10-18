package konrad.dataformats.core.generators;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.mappings.Mapping;
import konrad.dataformats.core.validation.DataFormatsException;

import java.lang.reflect.InvocationTargetException;

public class SimpleMappingGenerator implements MappingGenerator {
    private final String id;
    private final Class<? extends Mapping> mappingClass;

    public SimpleMappingGenerator(String id, Class<? extends Mapping> mappingClass) {
        this.id = id;
        this.mappingClass = mappingClass;
    }

    public String id() {
        return id;
    }

    @Override
    public Mapping apply(DataFormat from, DataFormat to, String line) {
        var parts = line.split(";");
        if (parts.length == 1) {
            try {
                return mappingClass.getDeclaredConstructor(DataFormat.class, DataFormat.class).newInstance(from, to);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                throw new DataFormatsException("Could not instantiate mapping class " + mappingClass.getName(), e);
            }
        }
        throw new DataFormatsException(
                id() + " CSV is expected to have at least one value: mapping id. Got " + line);
    }
}
