package konrad.dataformats.core.types;

import java.time.LocalDateTime;

public class LocalDateTimeType extends AbstractType implements Type {
    public LocalDateTimeType() {
        super(new TypeId(LocalDateTime.class), String.class);
    }
}
