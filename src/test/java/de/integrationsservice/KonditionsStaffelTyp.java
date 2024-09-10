
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der Staffeltyp definiert, was der Anwender ändern möchte: Nominalzins, nominale Marge oder externen
 * Aufschlag.
 *
 * <p>Java class for KonditionsStaffelTyp</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="KonditionsStaffelTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOMINALZINS"/>
 *     <enumeration value="MARGE_NOMINAL"/>
 *     <enumeration value="AUFSCHLAG_EXTERN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "KonditionsStaffelTyp")
@XmlEnum
public enum KonditionsStaffelTyp {

    NOMINALZINS,
    MARGE_NOMINAL,
    AUFSCHLAG_EXTERN;

    public String value() {
        return name();
    }

    public static KonditionsStaffelTyp fromValue(String v) {
        return valueOf(v);
    }

}
