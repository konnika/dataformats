
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Zinsusance festlegt wie Jahre und Jahresbruchteile zwischen zwei (Zins-) Terminen ermittelt werden,
 * die Anzahl der Zinstage.
 *
 * <p>Java class for Usance</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Usance">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="USANCE_30D360"/>
 *     <enumeration value="USANCE_30E360"/>
 *     <enumeration value="USANCE_30U360"/>
 *     <enumeration value="USANCE_ACT360"/>
 *     <enumeration value="USANCE_ACT365"/>
 *     <enumeration value="USANCE_ACTACTISDA"/>
 *     <enumeration value="USANCE_ACTACTISMA"/>
 *     <enumeration value="USANCE_30365"/>
 *     <enumeration value="USANCE_30D360_A"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Usance")
@XmlEnum
public enum Usance {

    @XmlEnumValue("USANCE_30D360")
    USANCE_30_D_360("USANCE_30D360"),
    @XmlEnumValue("USANCE_30E360")
    USANCE_30_E_360("USANCE_30E360"),
    @XmlEnumValue("USANCE_30U360")
    USANCE_30_U_360("USANCE_30U360"),
    @XmlEnumValue("USANCE_ACT360")
    USANCE_ACT_360("USANCE_ACT360"),
    @XmlEnumValue("USANCE_ACT365")
    USANCE_ACT_365("USANCE_ACT365"),
    USANCE_ACTACTISDA("USANCE_ACTACTISDA"),
    USANCE_ACTACTISMA("USANCE_ACTACTISMA"),
    USANCE_30365("USANCE_30365"),
    @XmlEnumValue("USANCE_30D360_A")
    USANCE_30_D_360_A("USANCE_30D360_A");
    private final String value;

    Usance(String v) {
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
    public static Usance fromValue(String v) {
        for (Usance c : Usance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
