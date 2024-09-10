
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Berechnungsmodell für die impliziten Optionen.
 *
 * <p>Java class for ImplOptModell</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ImplOptModell">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BDT"/>
 *     <enumeration value="HO_LEE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ImplOptModell")
@XmlEnum
public enum ImplOptModell {

    BDT,
    HO_LEE;

    public String value() {
        return name();
    }

    public static ImplOptModell fromValue(String v) {
        return valueOf(v);
    }

}
