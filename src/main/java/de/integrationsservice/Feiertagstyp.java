
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typ des Feiertags
 *
 * <p>Java class for Feiertagstyp</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Feiertagstyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FEIERTAG_JAEHRLICH"/>
 *     <enumeration value="FEIERTAG_PRECED"/>
 *     <enumeration value="FEIERTAG_FOLLOW"/>
 *     <enumeration value="FEIERTAG_EINMALIG"/>
 *     <enumeration value="FEIERTAG_SO_FOLLOW"/>
 *     <enumeration value="FEIERTAG_PRECED_FOLLOW"/>
 *     <enumeration value="FEIERTAG_MODUS_UNGUELTIG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Feiertagstyp")
@XmlEnum
public enum Feiertagstyp {

    FEIERTAG_JAEHRLICH,
    FEIERTAG_PRECED,
    FEIERTAG_FOLLOW,
    FEIERTAG_EINMALIG,
    FEIERTAG_SO_FOLLOW,
    FEIERTAG_PRECED_FOLLOW,
    FEIERTAG_MODUS_UNGUELTIG;

    public String value() {
        return name();
    }

    public static Feiertagstyp fromValue(String v) {
        return valueOf(v);
    }

}
