package konrad.dataformats.core.types;

public class ByteType extends AbstractType implements Type {
    public ByteType() {
        super(new TypeId(Byte.class), Byte.class);
    }
}
