package konrad.dataformats.core;

import java.util.List;

public class Validations {
    private Validations() {
        // hide the constructor
    }

    static String validateNotEmpty(String string, String name) {
        if (string == null || string.isBlank()) {
            throw new RuntimeException("Invalid " + name + " encountered: null, empty or blank");
        }
        return string;
    }

    static <T> List<T> validateNotEmpty(List<T> list, String name) {
        if (list == null || list.isEmpty()) {
            throw new RuntimeException("Invalid " + name + " encountered: null or empty");
        }
        return list;
    }

    static <T> List<T> validateNotNull(List<T> list, String name) {
        if (list == null) {
            throw new RuntimeException("Invalid " + name + " encountered: null");
        }
        return list;
    }

    static <T> T validateNotNull(T obj, String name) {
        if (obj == null) {
            throw new RuntimeException("Invalid " + name + " encountered: null");
        }
        return obj;
    }
}
