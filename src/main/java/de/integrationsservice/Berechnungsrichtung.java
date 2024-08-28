
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Gewünschte Art der Berechnung ("Vorwärtsrechnung", "Berechnung auf Nominalzins" usw.)
 * bei verschiedenen Use-Cases (z.B. automatischer Import von Geschäften).
 *
 * <p>Java class for Berechnungsrichtung</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Berechnungsrichtung">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VORWAERTSRECHNUNG"/>
 *     <enumeration value="NOMINALZINS"/>
 *     <enumeration value="MARGIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Berechnungsrichtung")
@XmlEnum
public enum Berechnungsrichtung {


    /**
     * Vorwärtsrechnung entsprechend der eingestellten Berechnungsbasis
     * (d.h. Berechnung des Effektivzinses, der Marge oder der Nettomarge).
     * Unterstützte Produkt-Typen: Annuitätendarlehen, Tilgungsdarlehen, Endfällige Darlehen, Annuitätentilgungen, Roll-Over-Darlehen.
     */
    VORWAERTSRECHNUNG,

    /**
     * Rechnung auf den Nominalzins.
     * Unterstützte Produkt-Typen: Annuitätendarlehen, Tilgungsdarlehen, Endfällige Darlehen, Annuitätentilgungen.
     */
    NOMINALZINS,

    /**
     * Rechnung auf die Margin.
     * Unterstützter Produkt-Typ: Roll-Over-Darlehen.
     */
    MARGIN;

    public String value() {
        return name();
    }

    public static Berechnungsrichtung fromValue(String v) {
        return valueOf(v);
    }

}
