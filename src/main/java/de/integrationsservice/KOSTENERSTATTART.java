
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Auswahl der Berechnungsmethode zur Ermittlung des Erstattungsbetrages für das entfallende Risiko,
 * Kulanz- und Margenschaden
 *
 * <p>Java class for KOSTENERSTATTART</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="KOSTENERSTATTART">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOMINALZINSREDUZIERUNG"/>
 *     <enumeration value="RENDITEERHOEHUNG"/>
 *     <enumeration value="MARGENVORGABE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "KOSTENERSTATTART")
@XmlEnum
public enum KOSTENERSTATTART {

    NOMINALZINSREDUZIERUNG,
    RENDITEERHOEHUNG,
    MARGENVORGABE;

    public String value() {
        return name();
    }

    public static KOSTENERSTATTART fromValue(String v) {
        return valueOf(v);
    }

}
