package konrad.dataformats.core.registries;

import konrad.dataformats.core.Conversion;
import konrad.dataformats.core.DataFormat;

import java.util.ArrayList;
import java.util.List;

public class ConversionRegistry {
    private final List<Conversion> conversions;

    public ConversionRegistry() {
        this.conversions = new ArrayList<>();
    }

    public void add(Conversion conversion) {
        conversions.add(conversion);
    }

    public Conversion get(DataFormat from, DataFormat to) {
        var matchingConversions =
                conversions.stream().filter(c -> c.matches(from, to)).toList();
        if (matchingConversions.isEmpty()) {
            throw new RuntimeException("No conversion found for " + from.id() + " -> " + to.id());
        }
        if (matchingConversions.size() > 1) {
            throw new RuntimeException(
                    "Multiple conversions found for " + from.id() + " -> " + to.id());
        }
        return matchingConversions.get(0);
    }

}
