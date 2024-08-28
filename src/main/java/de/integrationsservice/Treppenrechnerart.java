
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Mögliche Werte:
 * Rate;
 * Auszahlung;
 * Disagio/Damnum (als Betrag) = Nominalbetrag - Auszahlungsbetrag (wirkt nicht im nominalen aber im
 * effektiven Konto);
 * Sondertilgung (wird sofort verrechnet);
 * separate Gebühr Gebühren, die von einem anderen Konto bezahlt werden (wirkt nicht im nominalen Konto);
 * Gebühr Gebühren, die verrechnet werden (wirken im nominalen Konto nicht im effektiven Konto, da das
 * nominale Konto belastet wird und die Gebühr über Raten aufgebraucht werden muss).
 *
 * <p>Java class for Treppenrechnerart</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Treppenrechnerart">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RATE"/>
 *     <enumeration value="AUSZAHLUNG"/>
 *     <enumeration value="GEBUEHRP"/>
 *     <enumeration value="DISAGIO"/>
 *     <enumeration value="SONDERTILG"/>
 *     <enumeration value="GEBUEHRV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Treppenrechnerart")
@XmlEnum
public enum Treppenrechnerart {

    RATE,
    AUSZAHLUNG,
    GEBUEHRP,
    DISAGIO,
    SONDERTILG,
    GEBUEHRV;

    public String value() {
        return name();
    }

    public static Treppenrechnerart fromValue(String v) {
        return valueOf(v);
    }

}
