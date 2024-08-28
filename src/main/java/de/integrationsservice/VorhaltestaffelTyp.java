
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Vorhaltestaffeltyp einer Kostengröße im Deckungsbeitragsschema. Zur Zeit wird beim Kalkulationsservice
 * nur TYP_KEIN unterstützt.
 *
 * <p>Java class for VorhaltestaffelTyp</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VorhaltestaffelTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TYP_KEIN"/>
 *     <enumeration value="TYP_LAUFZEIT"/>
 *     <enumeration value="TYP_NOMINALBETRAG"/>
 *     <enumeration value="TYP_AUSZAHLUNGSBETRAG"/>
 *     <enumeration value="TYP_BESICHERUNGSQUOTE"/>
 *     <enumeration value="TYP_KOSTENTABLEAU"/>
 *     <enumeration value="TYP_BELEIHUNGSAUSLAUF"/>
 *     <enumeration value="TYP_WERTEKRITERIUM"/>
 *     <enumeration value="TYP_AUSWAHLKRITERIUM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "VorhaltestaffelTyp")
@XmlEnum
public enum VorhaltestaffelTyp {

    TYP_KEIN,
    TYP_LAUFZEIT,
    TYP_NOMINALBETRAG,
    TYP_AUSZAHLUNGSBETRAG,
    TYP_BESICHERUNGSQUOTE,
    TYP_KOSTENTABLEAU,
    TYP_BELEIHUNGSAUSLAUF,
    TYP_WERTEKRITERIUM,
    TYP_AUSWAHLKRITERIUM;

    public String value() {
        return name();
    }

    public static VorhaltestaffelTyp fromValue(String v) {
        return valueOf(v);
    }

}
