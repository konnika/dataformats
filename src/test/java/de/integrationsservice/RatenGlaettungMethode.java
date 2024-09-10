
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Wenn eine Ratenglättung gewünscht ist, muss festgelegt werden, ob die letzte Rate niedriger oder höher
 * als die restlichen Raten sein soll.
 *
 * <p>Java class for RatenGlaettungMethode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RatenGlaettungMethode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GL_KEINE"/>
 *     <enumeration value="GL_ETIEF"/>
 *     <enumeration value="GL_EHOCH"/>
 *     <enumeration value="GL_LTIEF"/>
 *     <enumeration value="GL_LHOCH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "RatenGlaettungMethode")
@XmlEnum
public enum RatenGlaettungMethode {

    GL_KEINE,
    GL_ETIEF,
    GL_EHOCH,
    GL_LTIEF,
    GL_LHOCH;

    public String value() {
        return name();
    }

    public static RatenGlaettungMethode fromValue(String v) {
        return valueOf(v);
    }

}
