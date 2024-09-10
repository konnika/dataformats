
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Art der Schadensberechnung: EXTERN; INTERN; EXTERN_INTERN
 *
 * <p>Java class for ApeBerechnungsart</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ApeBerechnungsart">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXTERN"/>
 *     <enumeration value="INTERN"/>
 *     <enumeration value="EXTERN_INTERN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ApeBerechnungsart")
@XmlEnum
public enum ApeBerechnungsart {

    EXTERN,
    INTERN,
    EXTERN_INTERN;

    public String value() {
        return name();
    }

    public static ApeBerechnungsart fromValue(String v) {
        return valueOf(v);
    }

}
