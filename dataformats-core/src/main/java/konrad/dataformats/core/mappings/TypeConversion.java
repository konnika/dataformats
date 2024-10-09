package konrad.dataformats.core.mappings;

import konrad.dataformats.core.types.Type;

public interface TypeConversion {
    boolean accepts(Type from, Type to);

    Object convert(Type from, Type to, Object object);
}
