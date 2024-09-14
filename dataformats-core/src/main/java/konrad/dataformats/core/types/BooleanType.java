package konrad.dataformats.core.types;

public class BooleanType extends AbstractType implements Type, TypeGenerator {
    public BooleanType() {
        super(new TypeId(Boolean.class), Boolean.class);
    }

    @Override
    public Type fromCsv(String value) {
        if (Boolean.class.getName().equals(value)) {
            return this;
        }

        throw new RuntimeException(getClass().getSimpleName() + " cannot be created from value: " + value);
    }

    @Override
    public boolean acceptsCsv(String value) {
        return hasId(value);
    }
}
