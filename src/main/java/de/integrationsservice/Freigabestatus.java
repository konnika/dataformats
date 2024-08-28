
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Freigabestatus</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Freigabestatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FREIGSTAT_BEARBEITUNG"/>
 *     <enumeration value="FREIGSTAT_FREIGEGEBEN"/>
 *     <enumeration value="FREIGSTAT_GESPERRT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Freigabestatus")
@XmlEnum
public enum Freigabestatus {

    FREIGSTAT_BEARBEITUNG,
    FREIGSTAT_FREIGEGEBEN,
    FREIGSTAT_GESPERRT;

    public String value() {
        return name();
    }

    public static Freigabestatus fromValue(String v) {
        return valueOf(v);
    }

}
