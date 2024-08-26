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
 * Der Rhythmus in dem die laufenden Verwaltungskosten gezahlt werden.
 */
public enum LaufendeVerwaltungskostenRhythmus {

    EINMALIG("EINMALIG"),

    JAEHRLICH("JAEHRLICH"),

    HALBJAEHRLICH("HALBJAEHRLICH"),

    VIERMONATLICH("VIERMONATLICH"),

    VIERTELJAEHRLICH("VIERTELJAEHRLICH"),

    ZWEIMONATLICH("ZWEIMONATLICH"),

    MONATLICH("MONATLICH");

    private String value;

    LaufendeVerwaltungskostenRhythmus(String value) {
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
    public static LaufendeVerwaltungskostenRhythmus fromValue(String value) {
        for (LaufendeVerwaltungskostenRhythmus b : LaufendeVerwaltungskostenRhythmus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

