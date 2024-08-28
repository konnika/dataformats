
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der Abstand der Bewegungen kann in Tagen; Monaten; Jahren; angegeben werden.
 *
 * <p>Java class for Zeiteinheit</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Zeiteinheit">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Tage"/>
 *     <enumeration value="Monate"/>
 *     <enumeration value="Jahre"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Zeiteinheit")
@XmlEnum
public enum Zeiteinheit {

    @XmlEnumValue("Tage")
    TAGE("Tage"),
    @XmlEnumValue("Monate")
    MONATE("Monate"),
    @XmlEnumValue("Jahre")
    JAHRE("Jahre");
    private final String value;

    Zeiteinheit(String v) {
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
    public static Zeiteinheit fromValue(String v) {
        for (Zeiteinheit c : Zeiteinheit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
