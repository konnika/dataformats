package konrad.dataformats.core.types;

import konrad.dataformats.core.TypeId;

public class StringType extends AbstractType implements IType, TypeGenerator {
    public StringType() {
        super(new TypeId(String.class), String.class);
    }

    @Override
    public IType fromCsv(String value) {
        if (String.class.getName().equals(value)) {
            return this;
        }

        throw new RuntimeException(getClass().getSimpleName() + " cannot be created from value: " + value);
    }

    @Override
    public boolean acceptsCsv(String value) {
        return hasId(value);
    }
}
