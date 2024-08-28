
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Kupontyp</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Kupontyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KUP_NORM"/>
 *     <enumeration value="KUP_SHORT"/>
 *     <enumeration value="KUP_LONG"/>
 *     <enumeration value="KUP_VER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Kupontyp")
@XmlEnum
public enum Kupontyp {


    /**
     * normal
     */
    KUP_NORM,

    /**
     * der erste Kupon ist verkürzt
     */
    KUP_SHORT,

    /**
     * der erste Kupon ist verlängert
     */
    KUP_LONG,

    /**
     * Kupon verrechnet
     */
    KUP_VER;

    public String value() {
        return name();
    }

    public static Kupontyp fromValue(String v) {
        return valueOf(v);
    }

}
