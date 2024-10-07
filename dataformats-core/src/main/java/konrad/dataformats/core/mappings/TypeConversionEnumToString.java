package konrad.dataformats.core.mappings;

import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

public class TypeConversionEnumToString implements TypeConversion {
    @Override
    public boolean accepts(Type from, Type to) {
        return from instanceof EnumType && to instanceof StringType;
    }

    @Override
    public Object convert(Type from, Type to, Object value) {
        if (!accepts(from, to)) {
            throw new DataFormatsException(getClass().getName() + " does not accept Type conversion from " + from + " to " + to);
        }

        EnumType fromEnum = (EnumType) from;
        return fromEnum.enumValueIndex((String) value);
    }
}