package konrad.dataformats.core.mappings;

import konrad.dataformats.core.types.Type;

public class AcceptedTypeConversion {
    private final Type from;
    private final Type to;
    private final TypeConversion typeConversion;

    public AcceptedTypeConversion(Type from, Type to, TypeConversion typeConversion) {
        this.from = from;
        this.to = to;
        this.typeConversion = typeConversion;
    }

    public Object convert(Object object) {
        return typeConversion.convert(from, to, object);
    }

    public AcceptedTypeConversionId id() {
        return new AcceptedTypeConversionId(from, to);
    }
}
