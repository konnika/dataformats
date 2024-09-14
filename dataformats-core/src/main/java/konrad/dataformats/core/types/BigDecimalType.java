package konrad.dataformats.core.types;

import konrad.dataformats.core.DataFormatsException;

import java.math.BigDecimal;

public class BigDecimalType extends AbstractType implements Type, TypeGenerator {
    public BigDecimalType() {
        super(new TypeId(BigDecimal.class), BigDecimal.class);
    }

    @Override
    public Type fromCsv(String value) {
        if (BigDecimal.class.getName().equals(value)) {
            return this;
        }

        throw new DataFormatsException(getClass().getSimpleName() + " cannot be created from value: " + value);
    }

    @Override
    public boolean acceptsCsv(String value) {
        return hasId(value);
    }
}
