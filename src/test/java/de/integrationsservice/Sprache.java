
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sprache</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Sprache">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="de_DE"/>
 *     <enumeration value="en_US"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Sprache")
@XmlEnum
public enum Sprache {

    @XmlEnumValue("de_DE")
    DE_DE("de_DE"),
    @XmlEnumValue("en_US")
    EN_US("en_US");
    private final String value;

    Sprache(String v) {
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
    public static Sprache fromValue(String v) {
        for (Sprache c : Sprache.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
