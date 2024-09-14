package konrad.dataformats.core.mappings;

import konrad.dataformats.core.DataFormat;

@FunctionalInterface
public interface MappingGenerator {
    Mapping apply(DataFormat from, DataFormat to, String line);
}
