
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Steuert, wann die Steuer berechnet wird: am Zinstermin, am Ende
 * Steuerfaelligkeitstyp_ZINSTERMIN Steuerfaelligkeitstyp_ENDE
 *
 * <p>Java class for Steuerfaellig</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Steuerfaellig">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Steuerfaelligkeitstyp_ZINSTERMIN"/>
 *     <enumeration value="Steuerfaelligkeitstyp_ENDE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Steuerfaellig")
@XmlEnum
public enum Steuerfaellig {

    @XmlEnumValue("Steuerfaelligkeitstyp_ZINSTERMIN")
    STEUERFAELLIGKEITSTYP_ZINSTERMIN("Steuerfaelligkeitstyp_ZINSTERMIN"),
    @XmlEnumValue("Steuerfaelligkeitstyp_ENDE")
    STEUERFAELLIGKEITSTYP_ENDE("Steuerfaelligkeitstyp_ENDE");
    private final String value;

    Steuerfaellig(String v) {
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
    public static Steuerfaellig fromValue(String v) {
        for (Steuerfaellig c : Steuerfaellig.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
