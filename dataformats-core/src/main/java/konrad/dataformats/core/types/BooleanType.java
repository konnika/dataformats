package konrad.dataformats.core.types;

public class BooleanType extends AbstractType implements Type {
    public BooleanType() {
        super(new TypeId(Boolean.class), Boolean.class);
    }
}
