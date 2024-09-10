
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Verrechnungsart der CAP-Prämie (auf den Reiter Nebenkosten): Aufschlag / Abschlag.
 * VERRECHNUNGSART_AUFSCHLAG VERRECHNUNGSART_ABSCHLAG
 *
 * <p>Java class for VerrechnungsartCap</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VerrechnungsartCap">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VERRECHNUNGSART_AUFSCHLAG"/>
 *     <enumeration value="VERRECHNUNGSART_ABSCHLAG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "VerrechnungsartCap")
@XmlEnum
public enum VerrechnungsartCap {

    VERRECHNUNGSART_AUFSCHLAG,
    VERRECHNUNGSART_ABSCHLAG;

    public String value() {
        return name();
    }

    public static VerrechnungsartCap fromValue(String v) {
        return valueOf(v);
    }

}
