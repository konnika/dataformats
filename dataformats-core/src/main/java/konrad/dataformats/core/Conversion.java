package konrad.dataformats.core;

import konrad.dataformats.core.mappings.Mapping;
import konrad.dataformats.core.validation.DataFormatsException;

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

    public boolean matches(DataFormat from, DataFormat to) {
        return this.from.equals(from) && this.to.equals(to);
    }

    public Data applyTo(final Data data) {
        if (!data.has(from)) {
            throw new DataFormatsException("Data has the wrong format. Expected " + from + " but got " + data.dataFormatId());
        }

        var result = new Data(to, Collections.emptyList());
        mappings.forEach(mapping -> mapping.applyTo(data, result));
        return result;
    }
}
