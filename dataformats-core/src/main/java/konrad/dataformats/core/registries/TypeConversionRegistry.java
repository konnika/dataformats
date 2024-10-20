package konrad.dataformats.core.registries;

import konrad.dataformats.core.mappings.AcceptedTypeConversion;
import konrad.dataformats.core.mappings.AcceptedTypeConversionId;
import konrad.dataformats.core.mappings.TypeConversion;
import konrad.dataformats.core.mappings.TypeConversionBigDecimalToDouble;
import konrad.dataformats.core.mappings.TypeConversionBigIntegerToInteger;
import konrad.dataformats.core.mappings.TypeConversionDoubleToBigDecimal;
import konrad.dataformats.core.mappings.TypeConversionEnumEnumByValue;
import konrad.dataformats.core.mappings.TypeConversionEnumToString;
import konrad.dataformats.core.mappings.TypeConversionIntegerToBigInteger;
import konrad.dataformats.core.mappings.TypeConversionStringToEnum;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TypeConversionRegistry {
    private final Set<TypeConversion> conversions;
    private final Map<AcceptedTypeConversionId, AcceptedTypeConversion> acceptedConversions;

    public TypeConversionRegistry() {
        this.conversions = new HashSet<>();
        acceptedConversions = new HashMap<>();

        add(new TypeConversionBigDecimalToDouble());
        add(new TypeConversionDoubleToBigDecimal());
        add(new TypeConversionBigIntegerToInteger());
        add(new TypeConversionIntegerToBigInteger());
        add(new TypeConversionEnumToString());
        add(new TypeConversionStringToEnum());
        add(new TypeConversionEnumEnumByValue());
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

    public AcceptedTypeConversion get(Type from, Type to, String... extraInfoForException) {
        var conversion = Optional.ofNullable(acceptedConversions.get(new AcceptedTypeConversionId(from, to)));

        if (conversion.isPresent()) {
            return conversion.get();
        }

        var applicableConversions = getAcceptedTypeConversions(from, to);

        if (applicableConversions.isEmpty()) {
            throw new DataFormatsException("No TypeConversion found for types: " + from + " -> " + to + ". " + String.join(" ", extraInfoForException));
        } else if (applicableConversions.size() > 1) {
            var typeConversions = applicableConversions.stream().map(c -> c.getClass().getName()).collect(Collectors.joining(", "));
            throw new DataFormatsException("Multiple TypeConversions found for types: " + from + " -> " + to + " : " + typeConversions + ". " + String.join(" ", extraInfoForException));
        } else {
            applicableConversions.forEach(c -> acceptedConversions.putIfAbsent(c.id(), c));

            return applicableConversions.get(0);
        }
    }

    public List<AcceptedTypeConversion> getAcceptedTypeConversions(Type from, Type to) {
        return conversions.stream()
                .map(c -> c.acceptedTypeConversion(from, to))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
    }
}
