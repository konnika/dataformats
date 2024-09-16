package konrad.dataformats.core.creation;


import konrad.dataformats.core.types.BigDecimalType;
import konrad.dataformats.core.types.BooleanType;
import konrad.dataformats.core.types.IntegerType;
import konrad.dataformats.core.types.LocalDateType;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.core.validation.DataFormatsException;

import java.util.ArrayList;
import java.util.List;

public class TypeGeneratorRegistry {
    private final List<TypeGenerator> generators;

    public TypeGeneratorRegistry() {
        this.generators = new ArrayList<>();
        add(new SimpleTypeGenerator(new StringType()));
        add(new SimpleTypeGenerator(new BooleanType()));
        add(new SimpleTypeGenerator(new IntegerType()));
        add(new SimpleTypeGenerator(new BigDecimalType()));
        add(new SimpleTypeGenerator(new LocalDateType()));
        add(new EnumTypeGenerator());
    }

    public void add(TypeGenerator typeGenerator) {
        generators.add(typeGenerator);
    }

    public TypeGenerator get(String value) {
        return generators.stream()
                .filter(g -> g.acceptsCsv(value)).findFirst()
                .orElseThrow(() -> new DataFormatsException("No TypeGenerator found for value: " + value));
    }
}
