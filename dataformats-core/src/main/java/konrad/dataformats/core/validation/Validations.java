package konrad.dataformats.core.validation;

import java.util.List;

public class Validations {

    public static final String INVALID_X_ENCOUNTERED = "Invalid %s encountered: %s";

    private Validations() {
        // hide the constructor
    }

    public static String validateNotEmpty(String string, String name) {
        if (string == null || string.isBlank()) {
            throw new DataFormatsException(String.format(INVALID_X_ENCOUNTERED, name, "null, empty or blank"));
        }
        return string;
    }

    public static <T> List<T> validateNotEmpty(List<T> list, String name) {
        if (list == null || list.isEmpty()) {
            throw new DataFormatsException(String.format(INVALID_X_ENCOUNTERED, name, "null or empty"));
        }
        return list;
    }

    public static <T> List<T> validateNotNull(List<T> list, String name) {
        if (list == null) {
            throw new DataFormatsException(String.format(INVALID_X_ENCOUNTERED, name, "null"));
        }
        return list;
    }

    public static <T> T validateNotNull(T obj, String name) {
        if (obj == null) {
            throw new DataFormatsException(String.format(INVALID_X_ENCOUNTERED, name, "null"));
        }
        return obj;
    }

    public static void validateNotEmpty(Object obj, String name) {
        if (obj == null) {
            throw new DataFormatsException(String.format(INVALID_X_ENCOUNTERED, name, "null"));
        }
    }
}
