package konrad.dataformats.core.generators;

import konrad.dataformats.core.registries.TypeConversionRegistry;
import konrad.dataformats.core.validation.DataFormatsException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MappingGeneratorRegistry {
    private final Map<String, MappingGenerator> generators;

    public MappingGeneratorRegistry(TypeConversionRegistry typeConversionRegistry) {
        this.generators = new HashMap<>();
        add(new OneToOneMappingGenerator(typeConversionRegistry));
        add(new EnumToEnumMappingGenerator());
    }

    public void add(MappingGenerator mappingGenerator) {
        generators.put(mappingGenerator.id(), mappingGenerator);
    }

    public MappingGenerator get(String value) {
        return Optional.ofNullable(generators.get(value))
                .orElseThrow(() -> new DataFormatsException("No MappingGenerator found for value: " + value));
    }
}
