
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Methode nach der die Ermittlung der annuitätischen Tilgung durchgeführt wird
 *
 * <p>Java class for AnnuMethode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AnnuMethode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANNUITAETENMETHODE_TILGUNGSANTEIL"/>
 *     <enumeration value="ANNUITAETENMETHODE_ANNUITAET"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "AnnuMethode")
@XmlEnum
public enum AnnuMethode {

    ANNUITAETENMETHODE_TILGUNGSANTEIL,
    ANNUITAETENMETHODE_ANNUITAET;

    public String value() {
        return name();
    }

    public static AnnuMethode fromValue(String v) {
        return valueOf(v);
    }

}
