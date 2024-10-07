package konrad.dataformats.core.mappings;

import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

public class TypeConversionStringToEnum implements TypeConversion {
    @Override
    public boolean accepts(Type from, Type to) {
        return from instanceof StringType && to instanceof EnumType;
    }

    @Override
    public Object convert(Type from, Type to, Object value) {
        if (!accepts(from, to)) {
            throw new DataFormatsException(getClass().getName() + " does not accept Type conversion from " + from + " to " + to);
        }

        EnumType toEnum = (EnumType) to;
        if (toEnum.accepts(value)) {
            return value;
        } else {
            throw new DataFormatsException("Type conversion from " + from + " to " + to + " is not possible because the value is not in the target enum: " + value);
        }
    }
}