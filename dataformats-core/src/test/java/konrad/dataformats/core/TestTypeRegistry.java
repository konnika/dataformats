package konrad.dataformats.core;

import konrad.dataformats.core.registries.TypeRegistry;

public class TestTypeRegistry {
    public static TypeRegistry get() {
        var typeRegistry = new TypeRegistry();
        typeRegistry.add(Type.BOOLEAN);
        typeRegistry.add(Type.INTEGER);
        typeRegistry.add(Type.NUMBER);
        typeRegistry.add(Type.DATE);
        typeRegistry.add(Type.STRING);
        typeRegistry.add(Type.DATE);
        return typeRegistry;
    }
}
