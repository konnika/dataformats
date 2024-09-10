
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Periodizität für Kündigungsrechte und jährliche Verfügungsrechte.
 *
 * <p>Java class for Periodizitaet</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Periodizitaet">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IOPERIODIZITAET_JEDERZEIT"/>
 *     <enumeration value="IOPERIODIZITAET_JHRL_KLDJAHR"/>
 *     <enumeration value="IOPERIODIZITAET_JHRL_LFZJAHR"/>
 *     <enumeration value="IOPERIODIZITAET_JHRL_AM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Periodizitaet")
@XmlEnum
public enum Periodizitaet {


    /**
     * Jährliches Verfügungsrecht: jederzeit
     */
    IOPERIODIZITAET_JEDERZEIT,

    /**
     * Jährliches Verfügungsrecht: pro Kalenderjahr
     */
    IOPERIODIZITAET_JHRL_KLDJAHR,

    /**
     * Jährliches Verfügungsrecht: pro Laufzeitjahr
     */
    IOPERIODIZITAET_JHRL_LFZJAHR,

    /**
     * Jährliches Verfügungsrecht: jährlich am
     */
    IOPERIODIZITAET_JHRL_AM;

    public String value() {
        return name();
    }

    public static Periodizitaet fromValue(String v) {
        return valueOf(v);
    }

}
