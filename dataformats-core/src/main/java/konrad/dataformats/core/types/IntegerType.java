package konrad.dataformats.core.types;

public class IntegerType extends AbstractType implements Type, TypeGenerator {
    public IntegerType() {
        super(new TypeId(Integer.class), Integer.class);
    }

    @Override
    public Type fromCsv(String value) {
        if (Integer.class.getName().equals(value)) {
            return this;
        }

        throw new RuntimeException(getClass().getSimpleName() + " cannot be created from value: " + value);
    }

    @Override
    public boolean acceptsCsv(String value) {
        return hasId(value);
    }
}
