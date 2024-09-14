package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Data;
import konrad.dataformats.core.DataFormatId;

public interface Mapping {
    void applyTo(Data in, Data out);
    boolean matches(DataFormatId in, DataFormatId out);
}
