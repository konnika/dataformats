package de.konni.msg.dataformats.core.mappings;

import de.konni.msg.dataformats.core.*;

import java.util.List;
import java.util.Objects;

public class MultipleOneToOneMapping implements Mapping {
    private final DataFormatId fromFormatId;
    private final DataFormatId toFormatId;
    private final List<Path> fromPaths;
    private final List<Path> toPaths;
    private final Type fromType;
    private final Type toType;

    public MultipleOneToOneMapping() {
        this.fromFormatId = DataFormatId.PROS_TRANSACTION_METADATA_UPDATE;
        this.fromPaths = List.of(
                new Path("benutzername"),
                new Path("institutsname")
        );
        this.fromType = Type.STRING;

        this.toFormatId = DataFormatId.PROS_TRANSACTION_METADATA_UPDATE_TARGET;
        this.toPaths = List.of(
                new Path("benutzernamePath"),
                new Path("institutsnamePath"));
        this.toType = Type.STRING;
    }

    @Override
    public void applyTo(Data in, Data out) {
        for (int i = 0; i < fromPaths.size(); i++) {
            var before = in.get(fromPaths.get(i));
            if (before != null && before.hasObject()) {
                var after = mapValueTypeSafe(before, toPaths.get(i));
                out.add(after);
            }
        }
    }

    @Override
    public boolean matches(DataFormatId in, DataFormatId out) {
        return Objects.equals(in, fromFormatId) && Objects.equals(out, toFormatId);
    }

    private Value mapValueTypeSafe(Value value, Path toPath) {
        if (value.has(fromType)) {
            var object = (String) value.object();
            var toValue = mapValue(object);
            return new Value(toPath, toType, toValue);
        }

        throw new RuntimeException("Unexpected Value type: " + value.type());
    }

    private static String mapValue(String fromValue) {
        return fromValue.toUpperCase();
    }
}
