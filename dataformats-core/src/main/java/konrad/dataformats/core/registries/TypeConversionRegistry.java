package konrad.dataformats.core.registries;

import konrad.dataformats.core.mappings.TypeConversion;
import konrad.dataformats.core.mappings.TypeConversionEnumEnum;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        var applicableConversions = conversions.stream().filter(c -> c.accepts(from, to)).toList();
        if (applicableConversions.isEmpty()) {
            throw new DataFormatsException("No TypeConversion found for types: " + from + " -> " + to);
        } else if (applicableConversions.size() > 1) {
            var typeConversions = applicableConversions.stream().map(c -> c.getClass().getName()).collect(Collectors.joining(", "));
            throw new DataFormatsException("Multiple TypeConversions found for types: " + from + " -> " + to + " : " + typeConversions);
        } else {
            return applicableConversions.get(0);
        }
    }
}
