
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Welche Verschieberegel soll verwendet werden, wenn ein Termin nicht auf einen Bankarbeitstag fällt.
 *
 * <p>Java class for Verschieberegel</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Verschieberegel">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VERSCH_FIX"/>
 *     <enumeration value="VERSCH_FOLLOW"/>
 *     <enumeration value="VERSCH_PRECED"/>
 *     <enumeration value="VERSCH_MFOLLOW"/>
 *     <enumeration value="VERSCH_MPRECED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Verschieberegel")
@XmlEnum
public enum Verschieberegel {

    VERSCH_FIX,
    VERSCH_FOLLOW,
    VERSCH_PRECED,
    VERSCH_MFOLLOW,
    VERSCH_MPRECED;

    public String value() {
        return name();
    }

    public static Verschieberegel fromValue(String v) {
        return valueOf(v);
    }

}
