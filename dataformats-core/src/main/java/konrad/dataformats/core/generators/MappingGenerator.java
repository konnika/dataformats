package konrad.dataformats.core.generators;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.mappings.Mapping;

public interface MappingGenerator {
    Mapping apply(DataFormat from, DataFormat to, String line);

    String id();
}
