
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Tilgungsvereinbarung: Tilgungsstruktur fest oder Rate fest
 *
 * <p>Java class for Tilgungsvereinbarung</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Tilgungsvereinbarung">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FESTE_TILGUNG"/>
 *     <enumeration value="FESTE_RATE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Tilgungsvereinbarung")
@XmlEnum
public enum Tilgungsvereinbarung {

    FESTE_TILGUNG,
    FESTE_RATE;

    public String value() {
        return name();
    }

    public static Tilgungsvereinbarung fromValue(String v) {
        return valueOf(v);
    }

}
