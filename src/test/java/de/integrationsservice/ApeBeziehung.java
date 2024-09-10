
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Beziehung des Kreditgeschäfts zu einer APE-Berechnung
 * KEIN_APE_NEUGESCHAEFT APE_NEUGESCHAEFT_OHNE_SCHADENSVERRECHNUNG APE_NEUGESCHAEFT_MIT_SCHADENSVERRECHNUNG
 *
 * <p>Java class for ApeBeziehung</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ApeBeziehung">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KEIN_APE_NEUGESCHAEFT"/>
 *     <enumeration value="APE_NEUGESCHAEFT_OHNE_SCHADENSVERRECHNUNG"/>
 *     <enumeration value="APE_NEUGESCHAEFT_MIT_SCHADENSVERRECHNUNG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ApeBeziehung")
@XmlEnum
public enum ApeBeziehung {

    KEIN_APE_NEUGESCHAEFT,
    APE_NEUGESCHAEFT_OHNE_SCHADENSVERRECHNUNG,
    APE_NEUGESCHAEFT_MIT_SCHADENSVERRECHNUNG;

    public String value() {
        return name();
    }

    public static ApeBeziehung fromValue(String v) {
        return valueOf(v);
    }

}
