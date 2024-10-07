package konrad.dataformats.core.registries;

import konrad.dataformats.core.mappings.TypeConversion;
import konrad.dataformats.core.mappings.TypeConversionEnumEnum;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

import java.util.ArrayList;
import java.util.List;

public class TypeConversionRegistry {
    private final List<TypeConversion> conversions;

    public TypeConversionRegistry() {
        this.conversions = new ArrayList<>();

        add(new TypeConversionEnumEnum());
    }

    public void add(TypeConversion typeConversion) {
        conversions.add(typeConversion);
    }

    public TypeConversion get(Type from, Type to) {
        // TODO maybe check for multiple possible conversions?
        return conversions.stream().filter(c -> c.accepts(from, to)).findFirst()
                .orElseThrow(() -> new DataFormatsException("No TypeConversion found for types: " + from + " -> " + to));
    }
}
