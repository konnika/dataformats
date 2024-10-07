package konrad.dataformats.core.mappings;

import konrad.dataformats.core.types.Type;

public interface TypeConversion {
    boolean accepts(Type fromType, Type toType);

    Object convert(Type fromType, Type toType, Object object);
}
