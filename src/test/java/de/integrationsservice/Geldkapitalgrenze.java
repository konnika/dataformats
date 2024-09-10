
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Grenze zwischen Geldmarkt- und Kapitalmarkt-Papieren
 *
 * <p>Java class for Geldkapitalgrenze</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Geldkapitalgrenze">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ECHT_KLEINER_EIN_JAHR"/>
 *     <enumeration value="KLEINER_GLEICH_EIN_JAHR"/>
 *     <enumeration value="ECHT_KLEINER_ZWEI_JAHRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Geldkapitalgrenze")
@XmlEnum
public enum Geldkapitalgrenze {

    ECHT_KLEINER_EIN_JAHR,
    KLEINER_GLEICH_EIN_JAHR,
    ECHT_KLEINER_ZWEI_JAHRE;

    public String value() {
        return name();
    }

    public static Geldkapitalgrenze fromValue(String v) {
        return valueOf(v);
    }

}
