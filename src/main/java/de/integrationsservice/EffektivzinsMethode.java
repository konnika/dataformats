
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Methode, nach der die Effektivzinsberechnung durchgeführt wird.
 *
 * <p>Java class for EffektivzinsMethode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EffektivzinsMethode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PANGV"/>
 *     <enumeration value="AIBD"/>
 *     <enumeration value="USLEASING"/>
 *     <enumeration value="PANGV85"/>
 *     <enumeration value="EFFZINS_30T"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "EffektivzinsMethode")
@XmlEnum
public enum EffektivzinsMethode {


    /**
     * Nach Preisangabenverordnung
     */
    PANGV("PANGV"),

    /**
     * Zinsmethode der International Capital Market Association
     */
    AIBD("AIBD"),
    USLEASING("USLEASING"),
    @XmlEnumValue("PANGV85")
    PANGV_85("PANGV85"),
    @XmlEnumValue("EFFZINS_30T")
    EFFZINS_30_T("EFFZINS_30T");
    private final String value;

    EffektivzinsMethode(String v) {
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
    public static EffektivzinsMethode fromValue(String v) {
        for (EffektivzinsMethode c : EffektivzinsMethode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
