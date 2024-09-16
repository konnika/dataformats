package konrad.dataformats.core.types;

import java.math.BigDecimal;

public class BigDecimalType extends AbstractType implements Type {
    public BigDecimalType() {
        super(new TypeId(BigDecimal.class), BigDecimal.class);
    }
}
