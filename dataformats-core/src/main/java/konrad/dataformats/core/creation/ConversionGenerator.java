package konrad.dataformats.core.creation;

import konrad.dataformats.core.Conversion;
import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.mappings.Mapping;
import konrad.dataformats.core.validation.DataFormatsException;
import konrad.dataformats.core.validation.Validations;

import java.util.List;

public class ConversionGenerator {
    private final DataFormat from;
    private final DataFormat to;
    private final MappingGeneratorRegistry mappingGeneratorRegistry;

    public ConversionGenerator(DataFormat from, DataFormat to, MappingGeneratorRegistry mappingGeneratorRegistry) {
        this.from = Validations.validateNotNull(from, "Conversion DataFormat from");
        this.to = Validations.validateNotNull(to, "Conversion DataFormat to");
        this.mappingGeneratorRegistry = mappingGeneratorRegistry;
    }

    public Conversion fromCsv(List<String> lines) {
        var mappings = lines.stream()
                .map(this::mappingfromCsv)
                .toList();

        return new Conversion(from, to, mappings);
    }

    private Mapping mappingfromCsv(String line) {
        var parts = line.split(";");
        if (parts.length < 1) {
            throw new DataFormatsException("Conversion CSV is expected to have at least one value per line: <mapping id>. Got " + line);
        }

        var mappingGenerator = mappingGeneratorRegistry.get(parts[0]);
        return mappingGenerator.apply(from, to, line);
    }
}
