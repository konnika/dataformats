package konrad.dataformats.core.generators;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.ValueFormat;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;

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
}
