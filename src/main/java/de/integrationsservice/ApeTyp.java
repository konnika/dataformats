
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der APE-Typ gibt die Art des ausserplanmäßigen Ereignisses an:
 * (Abloesung, Sondertilgung, Nichtabnahme, Teilnichtabnahme)
 * APE_ABLOESUNG; APE_SONDERTILGUNG; APE_NICHTABNAHME; APE_TEILNICHTABNAHME
 *
 * <p>Java class for ApeTyp</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ApeTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APE_ABLOESUNG"/>
 *     <enumeration value="APE_SONDERTILGUNG"/>
 *     <enumeration value="APE_NICHTABNAHME"/>
 *     <enumeration value="APE_TEILNICHTABNAHME"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ApeTyp")
@XmlEnum
public enum ApeTyp {

    APE_ABLOESUNG,
    APE_SONDERTILGUNG,
    APE_NICHTABNAHME,
    APE_TEILNICHTABNAHME;

    public String value() {
        return name();
    }

    public static ApeTyp fromValue(String v) {
        return valueOf(v);
    }

}
