
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Gibt an, ob bei Verschiebung von Zinszahlungsterminen der zugehörige Zinsverrechnungstermin unverändert
 * bleiben (unadjusted) oder auf denselben Termin (adjusted) verschoben werden soll.
 *
 * <p>Java class for Restschuldart</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Restschuldart">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RESTSCHULD_AUSWEISEN"/>
 *     <enumeration value="VOLLTILGUNG_LETZTE_RATE_HOCH"/>
 *     <enumeration value="VOLLTILGUNG_LETZTE_RATE_TIEF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Restschuldart")
@XmlEnum
public enum Restschuldart {

    RESTSCHULD_AUSWEISEN,
    VOLLTILGUNG_LETZTE_RATE_HOCH,
    VOLLTILGUNG_LETZTE_RATE_TIEF;

    public String value() {
        return name();
    }

    public static Restschuldart fromValue(String v) {
        return valueOf(v);
    }

}
