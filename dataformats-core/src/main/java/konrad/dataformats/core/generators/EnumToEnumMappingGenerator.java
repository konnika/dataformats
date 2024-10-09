package konrad.dataformats.core.generators;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.mappings.EnumToEnumMapping;
import konrad.dataformats.core.mappings.Mapping;
import konrad.dataformats.core.validation.DataFormatsException;

import java.util.Arrays;
import java.util.HashMap;

public class EnumToEnumMappingGenerator implements MappingGenerator {
    @Override
    public String id() {
        return "1:1:ENUM";
    }

    @Override
    public Mapping apply(DataFormat from, DataFormat to, String line) {
        var parts = line.split(";");
        if (parts.length == 4) {
            var enumMappings = new HashMap<String, String>();
            var pairs = parts[3].split(",");
            Arrays.stream(pairs).forEach(pair -> {
                var values = pair.split(":");
                if (values.length == 2) {
                    enumMappings.put(values[0], values[1]);
                } else {
                    throw new DataFormatsException(id() + " mapping is expected to have these values per line: 1:1;<path from>;<path to>;<enum mappings>. Got " + line);
                }
            });

            return new EnumToEnumMapping(from, to, new Path(parts[1]), new Path(parts[2]), enumMappings);
        }

        throw new DataFormatsException(id() + " mapping is expected to have these values per line: 1:1;<path from>;<path to>;<enum mappings>. Got " + line);
    }
}
