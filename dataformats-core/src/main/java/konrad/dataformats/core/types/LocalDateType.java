package konrad.dataformats.core.types;

import java.time.LocalDate;

public class LocalDateType extends AbstractType implements Type, TypeGenerator {
    public LocalDateType() {
        super(new TypeId(LocalDate.class), String.class);
    }

    @Override
    public Type fromCsv(String value) {
        if (LocalDate.class.getName().equals(value)) {
            return this;
        }

        throw new RuntimeException(getClass().getSimpleName() + " cannot be created from value: " + value);
    }

    @Override
    public boolean acceptsCsv(String value) {
        return hasId(value);
    }
}
