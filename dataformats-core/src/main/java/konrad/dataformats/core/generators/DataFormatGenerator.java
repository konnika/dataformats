package konrad.dataformats.core.generators;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.ValueFormat;
import konrad.dataformats.core.types.BooleanType;
import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class DataFormatGenerator {
    private final TypeGeneratorRegistry typeGeneratorRegistry;

    public DataFormatGenerator(TypeGeneratorRegistry typeGeneratorRegistry) {
        this.typeGeneratorRegistry = typeGeneratorRegistry;
    }

    public DataFormat fromCsv(DataFormatId id, List<String> lines) {
        var formats = lines.stream().map(this::valueFormatfromCsv).toList();
        return new DataFormat(id, formats);
    }

    public ValueFormat valueFormatfromCsv(String line) {
        var parts = line.split(";");
        if (parts.length == 2) {
            var path = new Path(parts[0]);
            var type = typeFromCsv(parts[1]);
            return new ValueFormat(path, type);
        }
        throw new DataFormatsException("ValueFormat CSV is expected to have these values per line: <path>;<type>. Got " + line);
    }

    public Type typeFromCsv(String value) {
        var typeGenerator = typeGeneratorRegistry.get(value);
        return typeGenerator.fromCsv(value);
    }

    /**
     * This method has <b>limitations</b> inherently in Java:
     * It cannot generate ValueFormats for Objects in lists <b>when there is no actual object in the list</b> (determining the generics type from a list is not possible at runtime)
     */
    public DataFormat fromObject(DataFormatId id, Object obj) {
        List<ValueFormat> formats = new ArrayList<>();
        analyzeFields(obj, "", formats);
        return new DataFormat(id, formats);
    }

    private void analyzeFields(Object obj, String parentPath, List<ValueFormat> formats) {
        if (obj == null) {
            return;
        }

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        if (List.class.isAssignableFrom(clazz)) {
            List<?> list = (List<?>) obj;
            analyzeFields(list.get(0), parentPath + ".[]", formats);
            return;
        }

        for (Field field : fields) {
            field.setAccessible(true);
            String path = parentPath.isEmpty() ? field.getName() : parentPath + "." + field.getName();
            try {
                Object value = field.get(obj);
                Type type = determineType(field.getType(), value);

                if (!isPrimitiveOrWrapper(field.getType()) && !field.getType().equals(String.class)) {
                    analyzeFields(value, path, formats);
                } else {
                    formats.add(new ValueFormat(new Path(path), type));
                }
            } catch (IllegalAccessException e) {
                throw new DataFormatsException("Failed to access field: " + field.getName(), e);
            }
        }
    }

    // TODO fix me: either ask all known types to accept the class or guess the type or require manual post processing
    private Type determineType(Class<?> fieldType, Object value) {
        if (fieldType.equals(String.class)) {
            return new StringType();
        } else if (fieldType.equals(Boolean.class) || fieldType.equals(boolean.class)) {
            return new BooleanType();
        } else if (fieldType.isEnum()) {
            @SuppressWarnings("unchecked")
            var enumClass = (Class<? extends Enum<?>>) fieldType;
            return new EnumType(enumClass);
        } else {
            // Add more type determinations as needed
            return new StringType(); // Default to StringType for unknown types
        }
    }

    private boolean isPrimitiveOrWrapper(Class<?> type) {
        return type.isPrimitive() || type.isEnum() ||
                type.equals(Boolean.class) ||
                type.equals(Integer.class) ||
                type.equals(Character.class) ||
                type.equals(Byte.class) ||
                type.equals(Short.class) ||
                type.equals(Double.class) ||
                type.equals(Long.class) ||
                type.equals(Float.class);
    }

    // TODO add method toCsv() to generate the CSV from DataFormat (or better add this method in DataFormat)
}
