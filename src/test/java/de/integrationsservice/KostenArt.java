
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Kostenposition kann als Erlös- oder als Kostenart eingestellt werden, nur bei Kosten mit Vorhaltewert
 * relevant
 *
 * <p>Java class for KostenArt</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="KostenArt">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KOSTEN"/>
 *     <enumeration value="ERTRAG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "KostenArt")
@XmlEnum
public enum KostenArt {

    KOSTEN,
    ERTRAG;

    public String value() {
        return name();
    }

    public static KostenArt fromValue(String v) {
        return valueOf(v);
    }

}
