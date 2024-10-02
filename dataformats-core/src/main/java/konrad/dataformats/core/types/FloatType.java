package konrad.dataformats.core.types;

public class FloatType extends AbstractType implements Type {
    public FloatType() {
        super(new TypeId(Float.class), Float.class);
    }
}
