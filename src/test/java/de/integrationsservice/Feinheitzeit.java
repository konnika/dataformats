
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Mögliche Arten für Feinheitzeit.
 *
 * <p>Java class for Feinheitzeit</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Feinheitzeit">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NICHTDEFFEINHEITZEIT"/>
 *     <enumeration value="RJAEHRLICH"/>
 *     <enumeration value="RHALBJAEHRLICH"/>
 *     <enumeration value="RVIERTELJAEHRLICH"/>
 *     <enumeration value="RMONATLICH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Feinheitzeit")
@XmlEnum
public enum Feinheitzeit {

    NICHTDEFFEINHEITZEIT,
    RJAEHRLICH,
    RHALBJAEHRLICH,
    RVIERTELJAEHRLICH,
    RMONATLICH;

    public String value() {
        return name();
    }

    public static Feinheitzeit fromValue(String v) {
        return valueOf(v);
    }

}
