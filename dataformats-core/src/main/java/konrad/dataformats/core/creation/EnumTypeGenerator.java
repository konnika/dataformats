package konrad.dataformats.core.creation;

import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.types.TypeId;
import konrad.dataformats.core.validation.DataFormatsException;

import java.util.Arrays;

public class EnumTypeGenerator implements TypeGenerator {
    private static final String REGEX_ENUM_FROM_ID_VALUES = "ENUM(:[\\w.]+)(:[\\w,]+)";
    private static final String REGEX_ENUM_FROM_CLASS = "ENUM(:[\\w.]+)";
    private static final String REGEX_ENUM_FROM_VALUES = "ENUM(:[\\w,]+)";
    private final ClassLoader classLoader;

    public EnumTypeGenerator() {
        this(ClassLoader.getSystemClassLoader());
    }

    public EnumTypeGenerator(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public boolean acceptsCsv(String value) {
        return value.matches(REGEX_ENUM_FROM_ID_VALUES) || value.matches(REGEX_ENUM_FROM_CLASS) || value.matches(REGEX_ENUM_FROM_VALUES);
    }

    @Override
    public Type fromCsv(String value) {
        if (!acceptsCsv(value)) {
            throw new DataFormatsException("Enum Type cannot be created from value: " + value);
        }

        if (value.matches(REGEX_ENUM_FROM_ID_VALUES)) {
            return createEnumTypeFromIdAndValues(value);
        } else if (value.matches(REGEX_ENUM_FROM_CLASS)) {
            return createEnumTypeFromClass(value);
        } else {
            return createEnumTypeFromValues(value);
        }
    }

    private Type createEnumTypeFromIdAndValues(String value) {
        String[] parts = value.split(":");
        String id = parts[1];
        String[] values = parts[2].split(",");
        return new EnumType(new TypeId(id), Arrays.asList(values));
    }

    private Type createEnumTypeFromClass(String value) {
        String[] parts = value.split(":");
        String className = parts[1];
        try {
            return new EnumType((Class<? extends Enum>) classLoader.loadClass(className));
        } catch (ClassNotFoundException e) {
            throw new DataFormatsException("Cannot find ENUM class " + className, e);
        } catch (ClassCastException e) {
            throw new DataFormatsException("Class " + className + " is not an Enum", e);
        }
    }

    private Type createEnumTypeFromValues(String value) {
        String[] parts = value.split(":");
        String[] values = parts[1].split(",");
        return new EnumType(new TypeId(parts[1]), Arrays.asList(values));
    }
}
