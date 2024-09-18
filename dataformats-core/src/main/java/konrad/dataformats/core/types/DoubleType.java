package konrad.dataformats.core.types;

public class DoubleType extends AbstractType implements Type {
    public DoubleType() {
        super(new TypeId(Double.class), Double.class);
    }
}
