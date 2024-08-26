package de.konni.msg.dataformats.core;

import java.util.List;

public class Validations {
    static String validateNotEmpty(String string) {
        if (string == null || string.isBlank()) {
            throw new RuntimeException("Invalid Path encountered: null, empty or blank");
        }
        return string;
    }

    static <T> List<T> validateNotEmpty(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new RuntimeException("Invalid Path encountered: null or empty");
        }
        return list;
    }
}
