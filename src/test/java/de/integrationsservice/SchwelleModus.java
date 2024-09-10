
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Art der Schwelle (Auswahl, Manuell, keine)
 *
 * <p>Java class for SchwelleModus</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SchwelleModus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SCHWELLE_AUSWAHL"/>
 *     <enumeration value="SCHWELLE_MANUELL"/>
 *     <enumeration value="SCHWELLE_KEINE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "SchwelleModus")
@XmlEnum
public enum SchwelleModus {

    SCHWELLE_AUSWAHL,
    SCHWELLE_MANUELL,
    SCHWELLE_KEINE;

    public String value() {
        return name();
    }

    public static SchwelleModus fromValue(String v) {
        return valueOf(v);
    }

}
