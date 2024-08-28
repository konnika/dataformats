
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Duration kann wahlweise auf Basis der Zinsstruktur, auf Basis des Effektivzinssatzes oder auf Basis
 * des Einstandssatzes des Geschäfts ermittelt werden.
 *
 * <p>Java class for Durationberechnungsart</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Durationberechnungsart">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DURATION_KEINE"/>
 *     <enumeration value="DURATION_BASIS_EINSTAND"/>
 *     <enumeration value="DURATION_BASIS_EFFEKTIVZINS"/>
 *     <enumeration value="DURATION_BASIS_ZINSSTRUKTUR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Durationberechnungsart")
@XmlEnum
public enum Durationberechnungsart {


    /**
     * Keine Durationsberechnung
     */
    DURATION_KEINE,

    /**
     * Die Duration wird auf Basis des Einstandssatzes ermittelt
     */
    DURATION_BASIS_EINSTAND,

    /**
     * Die Duration wird auf Basis des Effektivzinssatzes ermittelt
     */
    DURATION_BASIS_EFFEKTIVZINS,

    /**
     * Die Duration wird auf Basis der Zinsstruktur ermittelt
     */
    DURATION_BASIS_ZINSSTRUKTUR;

    public String value() {
        return name();
    }

    public static Durationberechnungsart fromValue(String v) {
        return valueOf(v);
    }

}
