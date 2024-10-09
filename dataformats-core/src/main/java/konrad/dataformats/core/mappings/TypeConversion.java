package konrad.dataformats.core.mappings;

import konrad.dataformats.core.types.Type;

import java.util.Optional;

public interface TypeConversion {
    boolean accepts(Type from, Type to);

    default Optional<AcceptedTypeConversion> acceptedTypeConversion(Type from, Type to) {
        if (accepts(from, to)) {
            return Optional.of(new AcceptedTypeConversion(from, to, this));
        }

        return Optional.empty();
    }

    Object convert(Type from, Type to, Object object);
}
