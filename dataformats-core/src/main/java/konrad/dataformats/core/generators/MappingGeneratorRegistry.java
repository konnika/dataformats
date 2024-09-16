package konrad.dataformats.core.generators;

import konrad.dataformats.core.validation.DataFormatsException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MappingGeneratorRegistry {
    private final Map<String, MappingGenerator> generators;

    public MappingGeneratorRegistry() {
        this.generators = new HashMap<>();
        add("1:1", new OneToOneMappingGenerator());
    }

    public void add(String id, MappingGenerator mappingGenerator) {
        generators.put(id, mappingGenerator);
    }

    public MappingGenerator get(String value) {
        return Optional.ofNullable(generators.get(value))
                .orElseThrow(() -> new DataFormatsException("No MappingGenerator found for value: " + value));
    }
}
