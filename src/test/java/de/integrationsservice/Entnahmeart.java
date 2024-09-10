
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Entnahmeart für die Margenrechnung (Sofortentnahme, Laufende Entnahme, Nominale Entnahme).
 *
 * <p>Java class for Entnahmeart</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Entnahmeart">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SOFORTENTNAHME"/>
 *     <enumeration value="LAUFENDE_ENTNAHME"/>
 *     <enumeration value="NOMINAL_ENTNAHME"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Entnahmeart")
@XmlEnum
public enum Entnahmeart {

    SOFORTENTNAHME,
    LAUFENDE_ENTNAHME,
    NOMINAL_ENTNAHME;

    public String value() {
        return name();
    }

    public static Entnahmeart fromValue(String v) {
        return valueOf(v);
    }

}
