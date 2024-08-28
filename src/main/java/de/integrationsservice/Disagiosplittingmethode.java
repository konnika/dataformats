
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Laufzeitproportional:
 * Zum Ende der Zinsbindung wird eine Gebührenerstattung ausbezahlt, die sich nach der Laufzeit im
 * Verhältnis zum Verrechnungszeitraum richtet. Soll der Effektivzins bis zum Ende der Gesamtlaufzeit bzw.
 * zum vereinbarten Laufzeitende berechnet werden, werden die am Ende der Zinsbindung erstatteten Gebühren
 * als separate Kosten in den Kreditzahlungsstrom eingestellt.
 * Restschuldproportional
 * Zum Ende der Zinsbindung wird eine Gebührenerstattung ausbezahlt, die sich nach der Höhe der Restschuld
 * im Verhältnis zum anfänglichen Zinssaldo richtet.
 * Soll der Effektivzins bis zum Ende der Gesamtlaufzeit bzw. zum vereinbarten Laufzeitende berechnet
 * werden, werden die am Ende der Zinsbindung erstatteten Gebühren als separate Kosten in den
 * Kreditzahlungsstrom eingestellt.
 *
 * <p>Java class for Disagiosplittingmethode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Disagiosplittingmethode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DSPLITTING_LAUFZEITPROPORTIONAL"/>
 *     <enumeration value="DSPLITTING_RESTSCHULDPROPORTIONAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Disagiosplittingmethode")
@XmlEnum
public enum Disagiosplittingmethode {

    DSPLITTING_LAUFZEITPROPORTIONAL,
    DSPLITTING_RESTSCHULDPROPORTIONAL;

    public String value() {
        return name();
    }

    public static Disagiosplittingmethode fromValue(String v) {
        return valueOf(v);
    }

}
