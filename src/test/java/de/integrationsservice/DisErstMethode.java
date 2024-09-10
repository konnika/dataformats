
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Disagioerstattung für das außerplanmäßige Ereignis kann nominalzinsproportional oder
 * effektivzinskonstant berechnet werden. Das -nicht verbrauchte Disagio- kann über Eingabe auch direkt
 * eingegeben werden.
 *
 * <p>Java class for DisErstMethode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DisErstMethode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APE_NOMINALZINSPROPORTIONAL"/>
 *     <enumeration value="APE_EFFEKTIVZINSKONSTANT"/>
 *     <enumeration value="APE_GEMAESS_EINGABE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "DisErstMethode")
@XmlEnum
public enum DisErstMethode {

    APE_NOMINALZINSPROPORTIONAL,
    APE_EFFEKTIVZINSKONSTANT,
    APE_GEMAESS_EINGABE;

    public String value() {
        return name();
    }

    public static DisErstMethode fromValue(String v) {
        return valueOf(v);
    }

}
