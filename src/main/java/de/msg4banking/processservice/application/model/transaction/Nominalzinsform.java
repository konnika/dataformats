/*
 * Geschäfte
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 24.2.0-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.msg4banking.processservice.application.model.transaction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Art des Nominalzinses. Bei Staffel verschiedene Möglichkeiten: nach Zeit, nach Kontostand, nach Zeit und Kontostand mit 2 oder 4 Grenzen.
 */
public enum Nominalzinsform {

    KONSTANT("KONSTANT"),

    NACH_ZEIT("NACH_ZEIT"),

    NACH_KONTOSTAND("NACH_KONTOSTAND"),

    NACH_ZEIT_UND_KONTOSTAND("NACH_ZEIT_UND_KONTOSTAND"),

    NACH_ZEIT_UND_KONTOSTAND_5("NACH_ZEIT_UND_KONTOSTAND_5");

    private String value;

    Nominalzinsform(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static Nominalzinsform fromValue(String value) {
        for (Nominalzinsform b : Nominalzinsform.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

