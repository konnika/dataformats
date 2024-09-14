package konrad.dataformats.core.registries;

import konrad.dataformats.core.types.BooleanType;
import konrad.dataformats.core.types.IType;
import konrad.dataformats.core.types.StringType;

import java.util.ArrayList;
import java.util.List;

public class TypeRegistry {
    private List<IType> types = new ArrayList<>();

    public TypeRegistry() {
        add(new StringType());
        add(new BooleanType());
    }

    public void add(IType type) {
        types.add(type);
    }

    public IType getForObjectClass(Class<?> aClass) {
        var type = types.stream().filter(t -> t.hasId(aClass)).findFirst();
        if (type.isEmpty()) {
            throw new RuntimeException("No Type found for class " + aClass.getName());
        }
        return type.get();
    }
}
