package konrad.dataformats.core.mappings;

import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

public class TypeConversionEnumEnum implements TypeConversion {
    @Override
    public boolean accepts(Type fromType, Type toType) {
        return fromType instanceof EnumType && toType instanceof EnumType;
    }

    @Override
    public Object convert(Type from, Type to, Object object) {
        if (!accepts(from, to)) {
            throw new DataFormatsException(getClass().getName() + " does not accept Type conversion from " + from + " to " + to);
        }

        if (from instanceof EnumType fromEnum && to instanceof EnumType toEnum) {
            if (fromEnum.enumValueCount() == toEnum.enumValueCount()) {
                var index = fromEnum.enumValueIndex((String) object);
                return toEnum.enumValueAt(index);
            }
            throw new DataFormatsException("Type conversion from enum " + from + " to enum " + to + " is not possible because of a different number of values");
        }

        throw new DataFormatsException(getClass().getName() + " does not accept Type conversion from " + from + " to " + to);
    }
}
