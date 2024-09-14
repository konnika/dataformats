package konrad.dataformats.core.registries;


import konrad.dataformats.core.types.BooleanType;
import konrad.dataformats.core.types.EnumTypeGenerator;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.core.types.TypeGenerator;

import java.util.ArrayList;
import java.util.List;

public class TypeGeneratorRegistry {
    private final List<TypeGenerator> generators;

    public TypeGeneratorRegistry() {
        this.generators = new ArrayList<>();
        add(new StringType());
        add(new BooleanType());
        add(new EnumTypeGenerator());
    }

    public void add(TypeGenerator typeGenerator) {
        generators.add(typeGenerator);
    }

    public TypeGenerator get(String id) {
        return generators.stream().filter(g -> g.acceptsCsv(id)).findFirst().orElseThrow(() -> new RuntimeException("No TypeGenerator found for id: " + id));
    }
}
