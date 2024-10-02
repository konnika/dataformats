package konrad.dataformats.core.types;

public class LongType extends AbstractType implements Type {
    public LongType() {
        super(new TypeId(Long.class), Long.class);
    }
}
