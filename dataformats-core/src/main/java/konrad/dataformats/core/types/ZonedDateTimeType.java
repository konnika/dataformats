package konrad.dataformats.core.types;

import java.time.ZonedDateTime;

public class ZonedDateTimeType extends AbstractType implements Type {
    public ZonedDateTimeType() {
        super(new TypeId(ZonedDateTime.class), ZonedDateTime.class);
    }
}
