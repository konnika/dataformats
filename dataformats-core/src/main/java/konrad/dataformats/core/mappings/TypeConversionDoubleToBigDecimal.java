package konrad.dataformats.core.mappings;

import konrad.dataformats.core.types.BigDecimalType;
import konrad.dataformats.core.types.DoubleType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

import java.math.BigDecimal;

public class TypeConversionDoubleToBigDecimal implements TypeConversion {
    @Override
    public boolean accepts(Type from, Type to) {
        return from instanceof DoubleType && to instanceof BigDecimalType;
    }

    @Override
    public Object convert(Type from, Type to, Object value) {
        if (!accepts(from, to)) {
            throw new DataFormatsException(getClass().getName() + " does not accept Type conversion from " + from + " to " + to);
        }

        return BigDecimal.valueOf((Double) value);
    }
}