
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Anzahl Ereignisse pro Jahr
 *
 * <p>Java class for Perannoangabe</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Perannoangabe">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PA_JAEHRLICH"/>
 *     <enumeration value="PA_HALBJAEHRLICH"/>
 *     <enumeration value="PA_VIERMONATLICH"/>
 *     <enumeration value="PA_VIERTELJAEHRLICH"/>
 *     <enumeration value="PA_ZWEIMONATLICH"/>
 *     <enumeration value="PA_MONATLICH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Perannoangabe")
@XmlEnum
public enum Perannoangabe {

    PA_JAEHRLICH,
    PA_HALBJAEHRLICH,
    PA_VIERMONATLICH,
    PA_VIERTELJAEHRLICH,
    PA_ZWEIMONATLICH,
    PA_MONATLICH;

    public String value() {
        return name();
    }

    public static Perannoangabe fromValue(String v) {
        return valueOf(v);
    }

}
