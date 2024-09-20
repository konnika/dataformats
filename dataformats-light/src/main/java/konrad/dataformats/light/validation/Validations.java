package konrad.dataformats.light.validation;

import java.util.List;

public class Validations {

    public static final String INVALID_VALUE = "Invalid value for %s: %s";

    private Validations() {
        // hide the constructor
    }

    public static String validateNotBlank(String string, String name) {
        if (string == null || string.isBlank()) {
            throw new DataWithoutFormatException(String.format(INVALID_VALUE, name, "null, empty or blank"));
        }
        return string;
    }

    public static <T> T validateNotNull(T obj, String name) {
        if (obj == null) {
            throw new DataWithoutFormatException(String.format(INVALID_VALUE, name, "null"));
        }
        return obj;
    }

    public static <T> List<T> validateNotEmpty(List<T> list, String name) {
        if (list == null || list.isEmpty()) {
            throw new DataWithoutFormatException(String.format(INVALID_VALUE, name, "null or empty"));
        }
        return list;
    }
}
