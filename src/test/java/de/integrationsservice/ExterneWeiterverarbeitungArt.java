
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Art für externe Weiterverarbeitung
 *
 * <p>Java class for ExterneWeiterverarbeitungArt</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ExterneWeiterverarbeitungArt">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ERWARTETER_VERLUST"/>
 *     <enumeration value="VAR_KOSTEN"/>
 *     <enumeration value="EIGENKAPITALKOSTEN"/>
 *     <enumeration value="VERMITTLUNGSPROVISION"/>
 *     <enumeration value="VERWALTUNGSKOSTEN"/>
 *     <enumeration value="OPTIONSKOSTEN"/>
 *     <enumeration value="CAP_PRAEMIE"/>
 *     <enumeration value="FLOOR_PRAEMIE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ExterneWeiterverarbeitungArt")
@XmlEnum
public enum ExterneWeiterverarbeitungArt {

    ERWARTETER_VERLUST,
    VAR_KOSTEN,
    EIGENKAPITALKOSTEN,
    VERMITTLUNGSPROVISION,
    VERWALTUNGSKOSTEN,
    OPTIONSKOSTEN,
    CAP_PRAEMIE,
    FLOOR_PRAEMIE;

    public String value() {
        return name();
    }

    public static ExterneWeiterverarbeitungArt fromValue(String v) {
        return valueOf(v);
    }

}
