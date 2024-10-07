package konrad.dataformats.core.mappings;

import konrad.dataformats.core.types.BigIntegerType;
import konrad.dataformats.core.types.IntegerType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

import java.math.BigInteger;

public class TypeConversionBigIntegerToInteger implements TypeConversion {
    @Override
    public boolean accepts(Type from, Type to) {
        return from instanceof BigIntegerType && to instanceof IntegerType;
    }

    @Override
    public Object convert(Type from, Type to, Object value) {
        if (!accepts(from, to)) {
            throw new DataFormatsException(getClass().getName() + " does not accept Type conversion from " + from + " to " + to);
        }

        return ((BigInteger) value).intValueExact();
    }
}