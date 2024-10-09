package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Data;
import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.Value;
import konrad.dataformats.core.registries.TypeConversionRegistry;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;
import konrad.dataformats.core.validation.Validations;

import java.util.Objects;

public class OneToOneMapping implements Mapping {
    private final DataFormat fromFormat;
    private final DataFormat toFormat;
    private final Path fromPath;
    private final Path toPath;
    private final Type fromType;
    private final Type toType;
    private final TypeConversionRegistry typeConversionRegistry;

    public OneToOneMapping(DataFormat fromFormat, DataFormat toFormat, Path fromPath, Path toPath, TypeConversionRegistry typeConversionRegistry) {
        this.fromFormat = Validations.validateNotNull(fromFormat, "fromFormat");
        this.toFormat = Validations.validateNotNull(toFormat, "toFormat");
        this.fromPath = Validations.validateNotNull(fromPath, "from");
        this.toPath = Validations.validateNotNull(toPath, "to");
        this.fromType = fromFormat.get(fromPath).type();
        this.toType = toFormat.get(toPath).type();

        this.typeConversionRegistry = typeConversionRegistry;
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

    protected Object convertValue(Object object, Type fromType, Type toType) {
        if (fromType.equals(toType)) {
            return object;
        }

        return typeConversionRegistry.get(fromType, toType).convert(fromType, toType, object);
    }
}