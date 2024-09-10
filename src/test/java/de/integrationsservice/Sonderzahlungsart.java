
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Art der Sonderzahlung (Tilgung, Auszahlung)
 *
 * <p>Java class for Sonderzahlungsart</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Sonderzahlungsart">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SONDERZAHLUNGSART_TILGUNG"/>
 *     <enumeration value="SONDERZAHLUNGSART_AUSZAHLUNG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Sonderzahlungsart")
@XmlEnum
public enum Sonderzahlungsart {

    SONDERZAHLUNGSART_TILGUNG,
    SONDERZAHLUNGSART_AUSZAHLUNG;

    public String value() {
        return name();
    }

    public static Sonderzahlungsart fromValue(String v) {
        return valueOf(v);
    }

}
