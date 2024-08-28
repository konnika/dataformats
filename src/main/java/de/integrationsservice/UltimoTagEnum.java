
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Folgetage-Drop-Down
 *
 * <p>Java class for UltimoTagEnum</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="UltimoTagEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEIN"/>
 *     <enumeration value="Tag-28"/>
 *     <enumeration value="Tag-29"/>
 *     <enumeration value="Tag-30"/>
 *     <enumeration value="ULTIMO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "UltimoTagEnum")
@XmlEnum
public enum UltimoTagEnum {

    NEIN("NEIN"),
    @XmlEnumValue("Tag-28")
    TAG_28("Tag-28"),
    @XmlEnumValue("Tag-29")
    TAG_29("Tag-29"),
    @XmlEnumValue("Tag-30")
    TAG_30("Tag-30"),
    ULTIMO("ULTIMO");
    private final String value;

    UltimoTagEnum(String v) {
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
    public static UltimoTagEnum fromValue(String v) {
        for (UltimoTagEnum c : UltimoTagEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
