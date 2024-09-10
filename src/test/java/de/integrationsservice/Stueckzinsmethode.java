
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Methode für den Stückzins
 *
 * <p>Java class for Stueckzinsmethode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Stueckzinsmethode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STK_POS"/>
 *     <enumeration value="STK_OHNE"/>
 *     <enumeration value="STK_FLAT"/>
 *     <enumeration value="STK_NEG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Stueckzinsmethode")
@XmlEnum
public enum Stueckzinsmethode {

    STK_POS,
    STK_OHNE,
    STK_FLAT,
    STK_NEG;

    public String value() {
        return name();
    }

    public static Stueckzinsmethode fromValue(String v) {
        return valueOf(v);
    }

}
