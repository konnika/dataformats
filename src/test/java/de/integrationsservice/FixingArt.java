
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der Dropdown-Liste steuert, ob der Nominalzins für die erste Zinsperiode fest vereinbart ist (sofort
 * fixieren), oder ob er lediglich für eine erste Prognose herangezogen wird (später fixieren). In diesem
 * Fall muss vor der Auszahlung noch ein Fixing stattfinden.
 *
 * <p>Java class for FixingArt</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FixingArt">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIXING_SOFORT"/>
 *     <enumeration value="FIXING_SPAETER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "FixingArt")
@XmlEnum
public enum FixingArt {

    FIXING_SOFORT,
    FIXING_SPAETER;

    public String value() {
        return name();
    }

    public static FixingArt fromValue(String v) {
        return valueOf(v);
    }

}
