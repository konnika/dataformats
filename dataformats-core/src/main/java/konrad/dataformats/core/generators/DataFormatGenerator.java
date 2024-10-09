package konrad.dataformats.core.generators;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.ValueFormat;
import konrad.dataformats.core.registries.TypeRegistry;
import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.types.TypeId;
import konrad.dataformats.core.validation.DataFormatsException;
import konrad.dataformats.core.validation.Validations;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DataFormatGenerator {
    private final TypeGeneratorRegistry typeGeneratorRegistry;
    private final TypeRegistry typeRegistry;
    private final List<DataFormatsException> errors = new ArrayList<>();

    public DataFormatGenerator(TypeGeneratorRegistry typeGeneratorRegistry, TypeRegistry typeRegistry) {
        this.typeGeneratorRegistry = typeGeneratorRegistry;
        this.typeRegistry = typeRegistry;
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
        Validations.validateNotNull(aClass, "class to analyze");
        Validations.validateNotNull(knownListTypes, "known list types");

        errors.clear();
        List<ValueFormat> formats = new ArrayList<>();
        analyzeFields(aClass, "", formats, knownListTypes);
        if (errors.isEmpty()) {
            return new DataFormat(id, formats);
        }
        throw new DataFormatsException("Errors during class analysis:\n" + errors.stream().map(DataFormatsException::toString).collect(Collectors.joining("\n")));
    }

    private void analyzeFields(Class<?> aClass, String parentPath, List<ValueFormat> formats, Map<Path, Class<?>> knownListTypes) {
        Field[] fields = aClass.getDeclaredFields();

        if (List.class.isAssignableFrom(aClass)) {
            if (knownListTypes.containsKey(new Path(parentPath))) {
                analyzeFields(knownListTypes.get(new Path(parentPath)), parentPath + ".[]", formats, knownListTypes);
            } else {
                errors.add(new DataFormatsException("Cannot determine list element type in list: " + parentPath +
                        ". Please provide the class of this list via analyze method. " +
                        "E.g. knownListTypes.put(new Path(\"" + parentPath + "\"), XXX.class);"));
            }
            return;
        }

        var nonStaticFields = Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).toList();
        for (Field field : nonStaticFields) {
//            field.setAccessible(true); // leave this here in case I need it at some point, as a reminder
            String path = parentPath.isEmpty() ? field.getName() : parentPath + "." + field.getName();

            var type = determineType(field.getType());
            if (type.isEmpty()) {
                if (isPrimitiveOrWrapper(field.getType())) {
                    errors.add(new DataFormatsException("No Type found for class " + field.getType().getName()));
                } else {
                    analyzeFields(field.getType(), path, formats, knownListTypes);
                }
            } else {
                formats.add(new ValueFormat(new Path(path), type.orElseThrow(() -> new DataFormatsException("No Type found for class " + field.getType().getName()))));
            }
        }
    }

    private Optional<Type> determineType(Class<?> fieldType) {
        var typeId = new TypeId(fieldType.getName());
        if (!typeRegistry.contains(typeId)) {
            return Optional.empty();
        }
        return Optional.of(typeRegistry.getForId(typeId));
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

    public List<String> toCsv(DataFormat dataFormat) {
        return dataFormat.valueFormats().stream()
                .map(this::valueFormatToCsv)
                .toList();
    }

    private String valueFormatToCsv(ValueFormat valueFormat) {
        if (valueFormat.type() instanceof EnumType) {
            return valueFormat.path().asString() + ";ENUM:" + valueFormat.type().id().asString();
        }
        return valueFormat.path().asString() + ";" + valueFormat.type().id().asString();
    }
}
