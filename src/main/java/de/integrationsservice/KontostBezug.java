
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Betragsabhängiger Zinsverlauf: betragsunabhängig, Zinssaldo, Summe der Einzahlungen, Mischzins
 * ZINS_NACH_KONTOSTAND_ZINSBERECHNUNGSSALDO ZINS_NACH_KONTOSTAND_SUMME_DER_EINZAHLUNGEN
 * ZINS_NACH_KONTOSTAND_MISCHZINS_AUS_ZINSSTUFEN ZINS_NACH_KONTOSTAND_BETRAGSUNABHAENGIG
 *
 * <p>Java class for KontostBezug</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="KontostBezug">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ZINS_NACH_KONTOSTAND_ZINSBERECHNUNGSSALDO"/>
 *     <enumeration value="ZINS_NACH_KONTOSTAND_SUMME_DER_EINZAHLUNGEN"/>
 *     <enumeration value="ZINS_NACH_KONTOSTAND_MISCHZINS_AUS_ZINSSTUFEN"/>
 *     <enumeration value="ZINS_NACH_KONTOSTAND_BETRAGSUNABHAENGIG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "KontostBezug")
@XmlEnum
public enum KontostBezug {

    ZINS_NACH_KONTOSTAND_ZINSBERECHNUNGSSALDO,
    ZINS_NACH_KONTOSTAND_SUMME_DER_EINZAHLUNGEN,
    ZINS_NACH_KONTOSTAND_MISCHZINS_AUS_ZINSSTUFEN,
    ZINS_NACH_KONTOSTAND_BETRAGSUNABHAENGIG;

    public String value() {
        return name();
    }

    public static KontostBezug fromValue(String v) {
        return valueOf(v);
    }

}
