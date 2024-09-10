
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Art der Gebührenverteilung (laufzeitproportional, nominalzinsproportional).
 * GEBUEHRENVERTEILUNG_LAUFZEITPROPORTIONAL GEBUEHRENVERTEILUNG_NOMINALZINSPROPORTIONAL
 *
 * <p>Java class for GebuehrenverteilungMethode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GebuehrenverteilungMethode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GEBUEHRENVERTEILUNG_LAUFZEITPROPORTIONAL"/>
 *     <enumeration value="GEBUEHRENVERTEILUNG_NOMINALZINSPROPORTIONAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "GebuehrenverteilungMethode")
@XmlEnum
public enum GebuehrenverteilungMethode {

    GEBUEHRENVERTEILUNG_LAUFZEITPROPORTIONAL,
    GEBUEHRENVERTEILUNG_NOMINALZINSPROPORTIONAL;

    public String value() {
        return name();
    }

    public static GebuehrenverteilungMethode fromValue(String v) {
        return valueOf(v);
    }

}
