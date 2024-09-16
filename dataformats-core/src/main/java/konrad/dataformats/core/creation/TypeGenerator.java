package konrad.dataformats.core.creation;

import konrad.dataformats.core.types.Type;

public interface TypeGenerator {
    Type fromCsv(String value);

    boolean acceptsCsv(String value);
}
