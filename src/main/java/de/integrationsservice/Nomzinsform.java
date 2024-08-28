
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Art des Nominalzinses. Bei Staffel verschiedene Eingabemöglichkeiten: nach Zeit, nach Kontostand, nach
 * Zeit und Kontostand mit 2 oder 4 Grenzen.
 *
 * <p>Java class for Nomzinsform</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Nomzinsform">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOMZINS_KONSTANT"/>
 *     <enumeration value="NOMZINS_NACHZEIT"/>
 *     <enumeration value="NOMZINS_NACHKONTOSTAND"/>
 *     <enumeration value="NOMZINS_NACHZEITUNDKONTOSTAND"/>
 *     <enumeration value="NOMZINS_NACHZEITUNDKONTOSTAND5"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Nomzinsform")
@XmlEnum
public enum Nomzinsform {

    NOMZINS_KONSTANT("NOMZINS_KONSTANT"),
    NOMZINS_NACHZEIT("NOMZINS_NACHZEIT"),
    NOMZINS_NACHKONTOSTAND("NOMZINS_NACHKONTOSTAND"),
    NOMZINS_NACHZEITUNDKONTOSTAND("NOMZINS_NACHZEITUNDKONTOSTAND"),
    @XmlEnumValue("NOMZINS_NACHZEITUNDKONTOSTAND5")
    NOMZINS_NACHZEITUNDKONTOSTAND_5("NOMZINS_NACHZEITUNDKONTOSTAND5");
    private final String value;

    Nomzinsform(String v) {
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
    public static Nomzinsform fromValue(String v) {
        for (Nomzinsform c : Nomzinsform.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
