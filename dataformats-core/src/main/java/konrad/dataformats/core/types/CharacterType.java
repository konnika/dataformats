package konrad.dataformats.core.types;

public class CharacterType extends AbstractType implements Type {
    public CharacterType() {
        super(new TypeId(Character.class), Character.class);
    }
}
