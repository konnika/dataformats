package konrad.dataformats.core.registries;

import konrad.dataformats.core.Type;
import konrad.dataformats.core.TypeId;

import java.util.HashMap;
import java.util.Map;

public class TypeRegistry {
    private Map<TypeId, Type> types = new HashMap<>();

    public TypeRegistry() {
        add(Type.BOOLEAN);
        add(Type.INTEGER);
        add(Type.NUMBER);
        add(Type.DATE);
        add(Type.STRING);
    }

    public void add(Type type) {
        types.put(type.id(), type);
    }

    public Type get(Class<?> aClass) {
        var type = types.get(new TypeId(aClass));
        if (type == null) {
            throw new RuntimeException("No Type found for class " + aClass.getName());
        }
        return type;
    }

    public Type get(String id) {
        var type = types.get(new TypeId(id));
        if (type == null) {
            new RuntimeException("No Type found for id " + id);
        }
        return type;
    }
}
