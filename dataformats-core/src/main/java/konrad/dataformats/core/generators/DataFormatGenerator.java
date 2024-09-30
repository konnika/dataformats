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
import konrad.dataformats.core.validation.Validations;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public DataFormat fromClass(DataFormatId id, Class<?> aClass, Map<Path, Class<?>> knownListTypes) {
        Validations.validateNotEmpty(aClass, "class to analyze");

        List<ValueFormat> formats = new ArrayList<>();
        analyzeFields(aClass, "", formats, knownListTypes);
        return new DataFormat(id, formats);
    }

    private void analyzeFields(Class<?> aClass, String parentPath, List<ValueFormat> formats, Map<Path, Class<?>> knownListTypes) {
        Field[] fields = aClass.getDeclaredFields();

        if (List.class.isAssignableFrom(aClass)) {
            if (knownListTypes.containsKey(new Path(parentPath))) {
                analyzeFields(knownListTypes.get(new Path(parentPath)), parentPath + ".[]", formats, knownListTypes);
                return;
            }
            throw new DataFormatsException("Cannot determine list element type in list: " + parentPath + ". Please provide the class of this list via analyze method.");
        }

        for (Field field : fields) {
            field.setAccessible(true);
            String path = parentPath.isEmpty() ? field.getName() : parentPath + "." + field.getName();

            if (!isPrimitiveOrWrapper(field.getType()) && !field.getType().equals(String.class)) {
                analyzeFields(field.getType(), path, formats, knownListTypes);
            } else {
                Type type = determineType(field.getType());
                formats.add(new ValueFormat(new Path(path), type));
            }
        }
    }

    // TODO ask the type registry for the type with id class
    private Type determineType(Class<?> fieldType) {
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
