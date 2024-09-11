package konrad.dataformats.core.registries;

import konrad.dataformats.core.mappings.MappingGenerator;
import konrad.dataformats.core.mappings.OneToOneMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MappingGeneratorRegistry {
    private final Map<String, MappingGenerator> generators;

    public MappingGeneratorRegistry() {
        this.generators = new HashMap<>();
        add("1:1", OneToOneMapping::fromCsv);
    }

    public void add(String id, MappingGenerator mappingGenerator) {
        generators.put(id, mappingGenerator);
    }

    public MappingGenerator fromId(String id) {
        return Optional.ofNullable(generators.get(id)).orElseThrow(() -> new RuntimeException("No MappingGenerator found for id: " + id));
    }
}
