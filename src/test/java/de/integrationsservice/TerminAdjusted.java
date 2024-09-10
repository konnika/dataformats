
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Gibt an, ob bei Verschiebung von Zinszahlungsterminen der zugehörige Zinsverrechnungstermin unverändert
 * bleiben (unadjusted) oder auf denselben Termin (adjusted) verschoben werden soll.
 *
 * <p>Java class for TerminAdjusted</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TerminAdjusted">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TERMIN_UNADJUSTED"/>
 *     <enumeration value="TERMIN_ADJUSTED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "TerminAdjusted")
@XmlEnum
public enum TerminAdjusted {

    TERMIN_UNADJUSTED,
    TERMIN_ADJUSTED;

    public String value() {
        return name();
    }

    public static TerminAdjusted fromValue(String v) {
        return valueOf(v);
    }

}
