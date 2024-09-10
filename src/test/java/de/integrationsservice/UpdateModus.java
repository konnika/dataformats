
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * UpdateModus definiert die möglichen Modi für den Cashver-Update.
 *
 * <p>Java class for UpdateModus</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="UpdateModus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KOMPLETT"/>
 *     <enumeration value="NUR_KOPFDATEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "UpdateModus")
@XmlEnum
public enum UpdateModus {


    /**
     * komplett
     */
    KOMPLETT,

    /**
     * nur Kopfdaten
     */
    NUR_KOPFDATEN;

    public String value() {
        return name();
    }

    public static UpdateModus fromValue(String v) {
        return valueOf(v);
    }

}
