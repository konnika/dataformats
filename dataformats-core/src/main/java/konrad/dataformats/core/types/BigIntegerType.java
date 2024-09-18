package konrad.dataformats.core.types;

import java.math.BigInteger;

public class BigIntegerType extends AbstractType implements Type {
    public BigIntegerType() {
        super(new TypeId(BigInteger.class), BigInteger.class);
    }
}
