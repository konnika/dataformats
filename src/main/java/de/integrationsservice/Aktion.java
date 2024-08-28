
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Gibt die Aktion (d.h. den Statusübergang) an, welche durchgeführt werden soll.
 *
 * <p>Java class for aktion</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="aktion">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MELDEN"/>
 *     <enumeration value="FREIGEBEN"/>
 *     <enumeration value="SPERREN"/>
 *     <enumeration value="ANFRAGEN_TREASURY"/>
 *     <enumeration value="ANFRAGEN_FACHLICH"/>
 *     <enumeration value="PRUEFEN_TREASURY"/>
 *     <enumeration value="PRUEFEN_FACHLICH"/>
 *     <enumeration value="RUECKSETZEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "aktion")
@XmlEnum
public enum Aktion {

    MELDEN,
    FREIGEBEN,
    SPERREN,
    ANFRAGEN_TREASURY,
    ANFRAGEN_FACHLICH,
    PRUEFEN_TREASURY,
    PRUEFEN_FACHLICH,
    RUECKSETZEN;

    public String value() {
        return name();
    }

    public static Aktion fromValue(String v) {
        return valueOf(v);
    }

}
