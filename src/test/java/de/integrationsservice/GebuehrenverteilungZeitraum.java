
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Liquiditätsbindungsende: Zur Kalkulation der unverbrauchten Gebühr wird das Liquiditätsbindungsende
 * verwendet. Anderes Datum: Zur Kalkulation der unverbrauchten Gebühr wird das Datum Gebührenverteilung
 * bis verwendet. Die Gebühr wird zeitanteilig verteilt.
 * LIQUIDITAETSBINDUNGSENDE KEINE ANDERES_DATUM
 *
 * <p>Java class for GebuehrenverteilungZeitraum</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GebuehrenverteilungZeitraum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LIQUIDITAETSBINDUNGSENDE"/>
 *     <enumeration value="KEINE"/>
 *     <enumeration value="ANDERES_DATUM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "GebuehrenverteilungZeitraum")
@XmlEnum
public enum GebuehrenverteilungZeitraum {

    LIQUIDITAETSBINDUNGSENDE,
    KEINE,
    ANDERES_DATUM;

    public String value() {
        return name();
    }

    public static GebuehrenverteilungZeitraum fromValue(String v) {
        return valueOf(v);
    }

}
