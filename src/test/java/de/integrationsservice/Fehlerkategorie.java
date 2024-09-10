
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Zu welche Kategorie gehört die Fehlermeldung: Fehlermeldung, Warnmeldung oder reine Informationen?
 *
 * <p>Java class for Fehlerkategorie</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Fehlerkategorie">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Fehler"/>
 *     <enumeration value="Warn"/>
 *     <enumeration value="Info"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Fehlerkategorie")
@XmlEnum
public enum Fehlerkategorie {


    /**
     * Fehlermeldung
     */
    @XmlEnumValue("Fehler")
    FEHLER("Fehler"),

    /**
     * Warnmeldung
     */
    @XmlEnumValue("Warn")
    WARN("Warn"),

    /**
     * Informationen
     */
    @XmlEnumValue("Info")
    INFO("Info");
    private final String value;

    Fehlerkategorie(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     *
     * @return The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     *
     * @param v The value to get the enum from.
     * @return The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException If no value matches in the enum declaration.
     */
    public static Fehlerkategorie fromValue(String v) {
        for (Fehlerkategorie c : Fehlerkategorie.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
