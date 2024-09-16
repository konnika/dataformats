package konrad.dataformats.core.generators;

import konrad.dataformats.core.Conversion;
import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.mappings.Mapping;
import konrad.dataformats.core.validation.DataFormatsException;
import konrad.dataformats.core.validation.Validations;

import java.util.List;

public class ConversionGenerator {
    private final MappingGeneratorRegistry mappingGeneratorRegistry;

    public ConversionGenerator(MappingGeneratorRegistry mappingGeneratorRegistry) {
        this.mappingGeneratorRegistry = mappingGeneratorRegistry;
    }

    public Conversion fromCsv(DataFormat from, DataFormat to, List<String> lines) {
        Validations.validateNotNull(from, "Conversion DataFormat from");
        Validations.validateNotNull(to, "Conversion DataFormat to");

        var mappings = lines.stream()
                .map(line -> mappingFromCsv(from, to, line))
                .toList();

        return new Conversion(from, to, mappings);
    }

    public Mapping mappingFromCsv(DataFormat from, DataFormat to, String line) {
        var parts = line.split(";");
        if (parts.length < 1) {
            throw new DataFormatsException("Conversion CSV is expected to have at least one value per line: <mapping id>. Got " + line);
        }

        var mappingGenerator = mappingGeneratorRegistry.get(parts[0]);
        return mappingGenerator.apply(from, to, line);
    }
}
