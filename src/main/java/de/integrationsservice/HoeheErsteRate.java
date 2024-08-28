
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die erste Rate kann voll, anteilig der Zinsen, anteilig der Zinsen und der Tilgung bezahlt werden.
 *
 * <p>Java class for HoeheErsteRate</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HoeheErsteRate">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ERSTE_RATE_VOLL"/>
 *     <enumeration value="ERSTE_RATE_ZINS_ANTEILIG"/>
 *     <enumeration value="ERSTE_RATE_ZINS_TILGUNG_ANTEILIG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "HoeheErsteRate")
@XmlEnum
public enum HoeheErsteRate {

    ERSTE_RATE_VOLL,
    ERSTE_RATE_ZINS_ANTEILIG,
    ERSTE_RATE_ZINS_TILGUNG_ANTEILIG;

    public String value() {
        return name();
    }

    public static HoeheErsteRate fromValue(String v) {
        return valueOf(v);
    }

}
