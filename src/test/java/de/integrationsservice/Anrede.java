
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Anrede (Herr, Frau, Firma usw.)
 *
 * <p>Java class for Anrede</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Anrede">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANREDE_FRAU"/>
 *     <enumeration value="ANREDE_HERR"/>
 *     <enumeration value="ANREDE_FIRMA"/>
 *     <enumeration value="ANREDE_EHELEUTE"/>
 *     <enumeration value="ANREDE_HERRUNDFRAU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Anrede")
@XmlEnum
public enum Anrede {

    ANREDE_FRAU,
    ANREDE_HERR,
    ANREDE_FIRMA,
    ANREDE_EHELEUTE,
    ANREDE_HERRUNDFRAU;

    public String value() {
        return name();
    }

    public static Anrede fromValue(String v) {
        return valueOf(v);
    }

}
