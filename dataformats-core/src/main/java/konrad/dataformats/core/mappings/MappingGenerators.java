package konrad.dataformats.core.mappings;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MappingGenerators {
    private final Map<String, MappingGenerator> generators;

    public MappingGenerators() {
        this.generators = new HashMap<>();
        add("1:1", OneToOneMapping::fromCsv);
    }

    public void add(String id, MappingGenerator mappingGenerator) {
        generators.put(id, mappingGenerator);
    }

    public Optional<MappingGenerator> fromId(String id) {
        return Optional.ofNullable(generators.get(id));
    }

    public MappingGenerator fromIdOrFail(String id) {
        return Optional.ofNullable(generators.get(id)).orElseThrow(() -> new RuntimeException("No MappingGenerator found for id: " + id));
    }
}
