
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Mögliche Methoden für die Berechnung des Effektivzinses PAngV (PANGV_2000, PANGV_2016).
 *
 * <p>Java class for PAngVMethode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PAngVMethode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PANGV_2000"/>
 *     <enumeration value="PANGV_2016"/>
 *     <enumeration value="PANGV_2016_MONATLICH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "PAngVMethode")
@XmlEnum
public enum PAngVMethode {

    PANGV_2000,
    PANGV_2016,
    PANGV_2016_MONATLICH;

    public String value() {
        return name();
    }

    public static PAngVMethode fromValue(String v) {
        return valueOf(v);
    }

}
