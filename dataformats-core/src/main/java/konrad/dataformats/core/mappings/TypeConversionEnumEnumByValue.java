package konrad.dataformats.core.mappings;

import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

import java.util.Optional;

public class TypeConversionEnumEnumByValue implements TypeConversion {
    @Override
    public boolean accepts(Type from, Type to) {
        if (from instanceof EnumType fromEnum && to instanceof EnumType toEnum) {
            return fromEnum.enumValueCount() == toEnum.enumValueCount();
        }

        return false;
    }

    @Override
    public Optional<AcceptedTypeConversion> acceptedTypeConversion(Type from, Type to) {
        if (from instanceof EnumType fromEnum && to instanceof EnumType toEnum && fromEnum.enumValueCount() == toEnum.enumValueCount()) {
            return Optional.of(new AcceptedTypeConversion(from, to, this));
        }

        return Optional.empty();
    }

    @Override
    public Object convert(Type from, Type to, Object object) {
        if (!accepts(from, to)) {
            throw new DataFormatsException(getClass().getName() + " does not accept Type conversion from " + from + " to " + to);
        }

        if (from instanceof EnumType && to instanceof EnumType toEnum) {
            var index = toEnum.enumValueIndex((String) object);
            if (index != -1) {
                return toEnum.enumValueAt(index);
            }
            throw new DataFormatsException("Type conversion from enum " + from + " to enum " + to + " is not possible because the target enum does not contain " + object);
        }

        throw new DataFormatsException(getClass().getName() + " does not accept Type conversion from " + from + " to " + to);
    }
}
