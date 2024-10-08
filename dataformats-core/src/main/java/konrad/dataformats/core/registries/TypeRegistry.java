package konrad.dataformats.core.registries;

import konrad.dataformats.core.types.BigDecimalType;
import konrad.dataformats.core.types.BigIntegerType;
import konrad.dataformats.core.types.BooleanType;
import konrad.dataformats.core.types.ByteType;
import konrad.dataformats.core.types.CharacterType;
import konrad.dataformats.core.types.DoubleType;
import konrad.dataformats.core.types.FloatType;
import konrad.dataformats.core.types.IntegerType;
import konrad.dataformats.core.types.LocalDateTimeType;
import konrad.dataformats.core.types.LocalDateType;
import konrad.dataformats.core.types.LongType;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.types.TypeId;
import konrad.dataformats.core.types.ZonedDateTimeType;
import konrad.dataformats.core.validation.DataFormatsException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TypeRegistry {
    private Map<TypeId, Type> types = new HashMap<>();

    public TypeRegistry() {
        add(new ByteType());
        add(new CharacterType());
        add(new StringType());
        add(new BooleanType());
        add(new DoubleType());
        add(new IntegerType());
        add(new LongType());
        add(new BigDecimalType());
        add(new BigIntegerType());
        add(new LocalDateType());
        add(new LocalDateTimeType());
        add(new ZonedDateTimeType());
        types.put(new TypeId(boolean.class), new BooleanType());
        types.put(new TypeId(int.class), new IntegerType());
        types.put(new TypeId(double.class), new DoubleType());
        types.put(new TypeId(float.class), new FloatType());
        types.put(new TypeId(long.class), new LongType());
        types.put(new TypeId(char.class), new LongType());
        types.put(new TypeId(byte.class), new LongType());
    }

    public void add(Type type) {
        types.put(type.id(), type);
    }

    public Type getForObjectClass(Class<?> aClass) {
        return Optional.ofNullable(types.get(new TypeId(aClass)))
                .orElseThrow(() -> new DataFormatsException("No Type found for class " + aClass.getName()));
    }

    public boolean contains(TypeId typeId) {
        return types.containsKey(typeId);
    }

    public Type getForId(TypeId typeId) {
        return Optional.ofNullable(types.get(typeId))
                .orElseThrow(() -> new DataFormatsException("No Type found for id " + typeId));
    }
}
