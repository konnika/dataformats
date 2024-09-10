
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Konditionen eines Folgegeschäfts nach einem außerplanmäßigem Ereignis
 *
 * <p>Java class for FOLGEGESCHKOND</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FOLGEGESCHKOND">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LAUT_NEUGESCHAEFT"/>
 *     <enumeration value="SCHADEN_NOMZINS_VERR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "FOLGEGESCHKOND")
@XmlEnum
public enum FOLGEGESCHKOND {

    LAUT_NEUGESCHAEFT,
    SCHADEN_NOMZINS_VERR;

    public String value() {
        return name();
    }

    public static FOLGEGESCHKOND fromValue(String v) {
        return valueOf(v);
    }

}
