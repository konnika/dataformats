
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Rhythmus für außerplanmäßige Ereignisse und Sondertilgungen.
 *
 * <p>Java class for Rhythmus</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Rhythmus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EINMALIG"/>
 *     <enumeration value="JAEHRLICH"/>
 *     <enumeration value="HALBJAEHRLICH"/>
 *     <enumeration value="VIERMONATLICH"/>
 *     <enumeration value="VIERTELJAEHRLICH"/>
 *     <enumeration value="ZWEIMONATLICH"/>
 *     <enumeration value="MONATLICH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Rhythmus")
@XmlEnum
public enum Rhythmus {

    EINMALIG,
    JAEHRLICH,
    HALBJAEHRLICH,
    VIERMONATLICH,
    VIERTELJAEHRLICH,
    ZWEIMONATLICH,
    MONATLICH;

    public String value() {
        return name();
    }

    public static Rhythmus fromValue(String v) {
        return valueOf(v);
    }

}
