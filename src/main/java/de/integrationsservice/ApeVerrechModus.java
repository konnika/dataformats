
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Rückrechnungsmodus für die Verrechnung eines APE-Schadens in einem neuen Darlehen
 * (Ratenhöhe oder Tilgung festhalten)
 * TILGUNGSSATZ_FEST RESTSCHULD_FEST RATENHOEHE_FEST GESAMTLAUFZEIT_FEST
 *
 * <p>Java class for ApeVerrechModus</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ApeVerrechModus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TILGUNGSSATZ_FEST"/>
 *     <enumeration value="RESTSCHULD_FEST"/>
 *     <enumeration value="RATENHOEHE_FEST"/>
 *     <enumeration value="GESAMTLAUFZEIT_FEST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ApeVerrechModus")
@XmlEnum
public enum ApeVerrechModus {

    TILGUNGSSATZ_FEST,
    RESTSCHULD_FEST,
    RATENHOEHE_FEST,
    GESAMTLAUFZEIT_FEST;

    public String value() {
        return name();
    }

    public static ApeVerrechModus fromValue(String v) {
        return valueOf(v);
    }

}
