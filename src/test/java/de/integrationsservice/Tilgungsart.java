
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Über die Art der Kontoführung wird bestimmt, ob eine Ratentilgung mit gleichbleibend hohen Tilgungsraten
 * berücksichtigt werden soll, oder ob ein annuitätischer Tilgungsverlauf berechnet werden soll.
 *
 * <p>Java class for Tilgungsart</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Tilgungsart">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TILGEND"/>
 *     <enumeration value="ANNUITAETISCH"/>
 *     <enumeration value="ENDFAELLIG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Tilgungsart")
@XmlEnum
public enum Tilgungsart {

    TILGEND,
    ANNUITAETISCH,
    ENDFAELLIG;

    public String value() {
        return name();
    }

    public static Tilgungsart fromValue(String v) {
        return valueOf(v);
    }

}
