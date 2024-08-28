
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Modus der Sicherheitenberechnung.
 *
 * <p>Java class for BesicherungsArt</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BesicherungsArt">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NICHTDEFSICHMOD"/>
 *     <enumeration value="LGD"/>
 *     <enumeration value="STOCHSICH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "BesicherungsArt")
@XmlEnum
public enum BesicherungsArt {

    NICHTDEFSICHMOD,
    LGD,
    STOCHSICH;

    public String value() {
        return name();
    }

    public static BesicherungsArt fromValue(String v) {
        return valueOf(v);
    }

}
