package konrad.dataformats.core.generators;

import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

public class SimpleTypeGenerator implements TypeGenerator {
    private final Type type;

    public SimpleTypeGenerator(Type type) {
        this.type = type;
    }

    @Override
    public boolean acceptsCsv(String value) {
        return type.hasId(value);
    }

    @Override
    public Type fromCsv(String value) {
        if (type.hasId(value)) {
            return type;
        }

        throw new DataFormatsException(type + " cannot be created from value: " + value);
    }
}
