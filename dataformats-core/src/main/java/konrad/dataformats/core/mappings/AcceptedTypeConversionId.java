package konrad.dataformats.core.mappings;

import konrad.dataformats.core.types.Type;

import java.util.Objects;

public class AcceptedTypeConversionId {
    private final String key;

    public AcceptedTypeConversionId(Type from, Type to) {
        key = from.id().asString() + " -> " + to.id().asString();
    }

    public String key() {
        return key;
    }

    public String toString() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcceptedTypeConversionId that = (AcceptedTypeConversionId) o;
        return Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(key);
    }
}
