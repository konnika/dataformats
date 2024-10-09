package konrad.dataformats.core.registries;

import konrad.dataformats.core.mappings.AcceptedTypeConversion;
import konrad.dataformats.core.mappings.TypeConversion;
import konrad.dataformats.core.mappings.TypeConversionBigDecimalToDouble;
import konrad.dataformats.core.mappings.TypeConversionBigIntegerToInteger;
import konrad.dataformats.core.mappings.TypeConversionDoubleToBigDecimal;
import konrad.dataformats.core.mappings.TypeConversionEnumEnum;
import konrad.dataformats.core.mappings.TypeConversionEnumToString;
import konrad.dataformats.core.mappings.TypeConversionIntegerToBigInteger;
import konrad.dataformats.core.mappings.TypeConversionStringToEnum;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TypeConversionRegistry {
    private final Set<TypeConversion> conversions;

    public TypeConversionRegistry() {
        this.conversions = new HashSet<>();
        add(new TypeConversionBigDecimalToDouble());
        add(new TypeConversionDoubleToBigDecimal());
        add(new TypeConversionBigIntegerToInteger());
        add(new TypeConversionIntegerToBigInteger());
        add(new TypeConversionEnumToString());
        add(new TypeConversionStringToEnum());
        add(new TypeConversionEnumEnum());
    }

    public void add(TypeConversion typeConversion) {
        conversions.add(typeConversion);
    }

    public void remove(TypeConversion typeConversion) {
        conversions.remove(typeConversion);
    }

    public void remove(Class<? extends TypeConversion> typeConversionClass) {
        conversions.stream().filter(c -> c.getClass().equals(typeConversionClass)).findFirst().ifPresent(conversions::remove);
    }

    public TypeConversion getOld(Type from, Type to) {
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

    public AcceptedTypeConversion get(Type from, Type to) {
        var applicableConversions = conversions.stream()
                .map(c -> c.acceptedTypeConversion(from, to))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();

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
