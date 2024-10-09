package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Data;
import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.Value;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;
import konrad.dataformats.core.validation.Validations;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class EnumToEnumMapping implements Mapping {
    private final DataFormat fromFormat;
    private final DataFormat toFormat;
    private final Path fromPath;
    private final Path toPath;
    private final Type fromType;
    private final Type toType;
    private final Map<String, String> enumMappings;

    public EnumToEnumMapping(DataFormat fromFormat, DataFormat toFormat, Path fromPath, Path toPath, Map<String, String> enumMappings) {
        this.fromFormat = Validations.validateNotNull(fromFormat, "fromFormat");
        this.toFormat = Validations.validateNotNull(toFormat, "toFormat");
        this.fromPath = Validations.validateNotNull(fromPath, "from");
        this.toPath = Validations.validateNotNull(toPath, "to");
        this.fromType = fromFormat.get(fromPath).type();
        this.toType = toFormat.get(toPath).type();
        this.enumMappings = Validations.validateNotEmpty(enumMappings, "enumMappings");

        validate();
    }

    private void validate() {
        if (fromPath.isConcreteArrayPath()) {
            throw new DataFormatsException("Path should be abstract: " + fromPath);
        }

        if (toPath.isConcreteArrayPath()) {
            throw new DataFormatsException("Path should be abstract: " + toPath);
        }
    }

    @Override
    public void applyTo(Data in, Data out) {
        var paths = fromPath.allConcretePaths(in.toMap());

        for (var path : paths) {
            var before = in.getValue(path);
            if (before.hasObject()) {
                var afterPath = path.copyArrayIndicesTo(toPath);
                var afterObject = convertValue(before.object(), fromType, toType);
                var afterValue = new Value(afterPath, afterObject);
                out.addOrFailIfHasObject(afterValue);
            }
        }
    }

    @Override
    public boolean matches(DataFormatId in, DataFormatId out) {
        return Objects.equals(in, fromFormat.id()) && Objects.equals(out, toFormat.id());
    }

    protected Object convertValue(Object object, Type from, Type to) {
        if (from.equals(to)) {
            return object;
        }

        return Optional.ofNullable(enumMappings.get((String) object))
                .orElseThrow(() -> new DataFormatsException("Enum value " + object + " not mapped for " + from + " to " + to));
    }
}