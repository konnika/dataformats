package konrad.dataformats.core.generators;

import konrad.dataformats.core.Path;
import konrad.dataformats.core.Value;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CsvGenerator {
    private static final String REGEX_LOCAL_DATE = "\\d{4}-\\d{2}-\\d{2}";
    private static final String REGEX_ZONED_DATE_TIME = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[+-]\\d{2}:\\d{2}";

    private final List<Value> values;

    public CsvGenerator() {
        values = new ArrayList<>();
    }

    public void analyze(Map<String, Object> objectMap) {
        analyze(objectMap, null);
    }

    private void analyze(Map<String, Object> objectMap, Path previousPath) {
        for (var entry : objectMap.entrySet()) {
            var currentPathElement = new Path(entry.getKey());
            var currentPath = previousPath == null ? currentPathElement : previousPath.concat(currentPathElement);

            var object = entry.getValue();
            if (object instanceof Map) {
                @SuppressWarnings("unchecked")
                var nestedMap = (Map<String, Object>) object;
                analyze(nestedMap, currentPath);
            } else if (object instanceof List<?> nestedList) {
                analyzeList(nestedList, currentPath);
            } else {
                values.add(new Value(currentPath, object));
            }
        }
    }

    private void analyzeList(List<?> nestedList, Path currentPath) {
        if (!nestedList.isEmpty() && nestedList.get(0) instanceof Map) {
            @SuppressWarnings("unchecked")
            var listOfMaps = (List<Map<String, Object>>) nestedList;
            for (int i = 0; i < listOfMaps.size(); i++) {
                var map = listOfMaps.get(i);
                var currentPathWithListIndex = currentPath.concat(new Path("[" + i + "]"));
                analyze(map, currentPathWithListIndex);
            }
        } else {
            for (int i = 0; i < nestedList.size(); i++) {
                var obj = nestedList.get(i);
                var currentPathWithListIndex = currentPath.concat(new Path("[" + i + "]"));
                values.add(new Value(currentPathWithListIndex, obj));
            }
        }
    }

    public List<Value> values() {
        return values;
    }

    public List<String> csvLines() {
        return values.stream()
                .map(v -> v.path().asAbstractPath().asString() + ";" + guessTheTypeFor(v))
                .distinct()
                .sorted()
                .toList();
    }

    private String guessTheTypeFor(Value value) {
        if (!value.hasObject()) {
            return "UNKNOWN.please.set.manually";
        }

        var object = value.object();
        if (object instanceof String string) {
            if (string.matches(REGEX_LOCAL_DATE)) {
                return LocalDate.class.getName();
            } else if (string.matches(REGEX_ZONED_DATE_TIME)) {
                return ZonedDateTime.class.getName();
            }
            return String.class.getName();
        }
        return object.getClass().getName();
    }
}
