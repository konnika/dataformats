package konrad.dataformats.core.generators;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.mappings.Mapping;
import konrad.dataformats.core.mappings.OneToOneMapping;
import konrad.dataformats.core.registries.TypeConversionRegistry;
import konrad.dataformats.core.validation.DataFormatsException;

public class OneToOneMappingGenerator implements MappingGenerator {
    private final TypeConversionRegistry typeConversionRegistry;

    public OneToOneMappingGenerator(TypeConversionRegistry typeConversionRegistry) {
        this.typeConversionRegistry = typeConversionRegistry;
    }

    public String id() {
        return "1:1";
    }

    @Override
    public Mapping apply(DataFormat from, DataFormat to, String line) {
        var parts = line.split(";");
        if (parts.length == 3) {
            return new OneToOneMapping(from, to, new Path(parts[1]), new Path(parts[2]), typeConversionRegistry);
        }
        throw new DataFormatsException(id() + " mapping is expected to have these values per line: 1:1;<path from>;<path to>. Got " + line);
    }
}
