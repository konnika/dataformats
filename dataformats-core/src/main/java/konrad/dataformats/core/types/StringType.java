package konrad.dataformats.core.types;

public class StringType extends AbstractType implements Type {
    public StringType() {
        super(new TypeId(String.class), String.class);
    }
}
