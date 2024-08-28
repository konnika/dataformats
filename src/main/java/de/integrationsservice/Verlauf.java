
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enthält die Basis des Verlaufs (konstant, nach Laufzeit, nach Datum), welche zur Berechnung der Zinsrate
 * und Bonusrate bei Sparen-Geschäften benötigt wird.
 *
 * <p>Java class for Verlauf</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Verlauf">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VERLAUF_KONSTANT"/>
 *     <enumeration value="VERLAUF_NACHLAUFZEIT"/>
 *     <enumeration value="VERLAUF_NACHDATUM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Verlauf")
@XmlEnum
public enum Verlauf {

    VERLAUF_KONSTANT,
    VERLAUF_NACHLAUFZEIT,
    VERLAUF_NACHDATUM;

    public String value() {
        return name();
    }

    public static Verlauf fromValue(String v) {
        return valueOf(v);
    }

}
