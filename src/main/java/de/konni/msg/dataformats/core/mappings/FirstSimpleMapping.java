package de.konni.msg.dataformats.core.mappings;

import de.konni.msg.dataformats.core.*;

import java.util.Objects;

public class FirstSimpleMapping implements Mapping {
    private final DataFormatId fromFormatId;
    private final DataFormatId toFormatId;
    private final Path fromPath;
    private final Path toPath;
    private final Type fromType;
    private final Type toType;

    public FirstSimpleMapping() {
        this.fromFormatId = DataFormatId.PROS_TRANSACTION_METADATA_UPDATE;
        this.fromPath = new Path("benutzername");
        this.fromType = Type.STRING;

        this.toFormatId = DataFormatId.PROS_TRANSACTION_METADATA_UPDATE_ENGLISH;
        this.toPath = new Path("user");
        this.toType = Type.STRING;
    }

    @Override
    public void applyTo(Data in, Data out) {
        var before = in.getValue(fromPath);
        if (before != null && before.hasObject()) {
            var after = mapValueTypeSafe(before);
            out.addOrFailIfHasObject(after);
        }
    }

    @Override
    public boolean matches(DataFormatId in, DataFormatId out) {
        return Objects.equals(in, fromFormatId) && Objects.equals(out, toFormatId);
    }

    private Value mapValueTypeSafe(Value value) {
        if (value.is(fromType)) {
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
