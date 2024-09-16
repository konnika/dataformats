package konrad.dataformats.core.types;

public class IntegerType extends AbstractType implements Type {
    public IntegerType() {
        super(new TypeId(Integer.class), Integer.class);
    }
}
