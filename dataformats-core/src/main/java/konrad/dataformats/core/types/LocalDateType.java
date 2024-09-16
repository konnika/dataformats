package konrad.dataformats.core.types;

import java.time.LocalDate;

public class LocalDateType extends AbstractType implements Type {
    public LocalDateType() {
        super(new TypeId(LocalDate.class), String.class);
    }
}
