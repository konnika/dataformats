package konrad.dataformats.core;

import konrad.dataformats.core.mappings.OneToOneMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conversion {
    private final DataFormat from;
    private final DataFormat to;
    private final List<Mapping> mappings = new ArrayList<>();

    public Conversion(final DataFormat from, final DataFormat to, final List<Mapping> mappings) {
        this.from = from;
        this.to = to;
        if (mappings != null) {
            this.mappings.addAll(mappings);
        }
    }

    public Data applyTo(final Data data) {
        if (!data.has(from)) {
            throw new RuntimeException("Data has the wrong format. Expected " + from + " but got " + data.dataFormatId());
        }

        var result = new Data(to, Collections.emptyList());
        mappings.forEach(mapping -> mapping.applyTo(data, result));
        return result;
    }

    public static Conversion fromCsv(DataFormat from, DataFormat to, List<String> lines) {
        var mappings = lines.stream()
                .map(line -> OneToOneMapping.fromCsv(from, to, line)) // TODO replace OneToOneMapping with a multiplexer that decides the mapping to use
                .map(Mapping.class::cast)
                .toList();
        return new Conversion(from, to, mappings);
    }
}
