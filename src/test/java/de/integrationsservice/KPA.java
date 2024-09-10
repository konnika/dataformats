
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Kupons p.a. - Anzahl Kupons pro Jahr einer Zinsstruktur-Stützstelle.
 *
 * <p>Java class for KPA</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="KPA">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="JAEHRLICH"/>
 *     <enumeration value="HALBJAEHRLICH"/>
 *     <enumeration value="VIERTELJAEHRLICH"/>
 *     <enumeration value="MONATLICH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "KPA")
@XmlEnum
public enum KPA {

    JAEHRLICH,
    HALBJAEHRLICH,
    VIERTELJAEHRLICH,
    MONATLICH;

    public String value() {
        return name();
    }

    public static KPA fromValue(String v) {
        return valueOf(v);
    }

}
