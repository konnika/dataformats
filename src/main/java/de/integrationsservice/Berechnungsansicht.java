
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Berechnungsbasis: Effektivzinsberechnung, Margen- oder Nettomargenrechnung
 *
 * <p>Java class for Berechnungsansicht</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Berechnungsansicht">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANSICHT_EFFEKTIV"/>
 *     <enumeration value="ANSICHT_MARGE"/>
 *     <enumeration value="ANSICHT_DECKUNGSBEITRAG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Berechnungsansicht")
@XmlEnum
public enum Berechnungsansicht {

    ANSICHT_EFFEKTIV,
    ANSICHT_MARGE,
    ANSICHT_DECKUNGSBEITRAG;

    public String value() {
        return name();
    }

    public static Berechnungsansicht fromValue(String v) {
        return valueOf(v);
    }

}
