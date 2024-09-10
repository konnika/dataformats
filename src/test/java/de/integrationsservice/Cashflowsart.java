
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Art des Cash-Flows beziehungsweise der Buchung
 *
 * <p>Java class for Cashflowsart</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Cashflowsart">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RATE"/>
 *     <enumeration value="AUSZAHLUNG"/>
 *     <enumeration value="DISAGIO"/>
 *     <enumeration value="SONDERTILG"/>
 *     <enumeration value="GEBUEHRP"/>
 *     <enumeration value="GEBUEHRV"/>
 *     <enumeration value="ZINSZAHLG"/>
 *     <enumeration value="TILGUNG"/>
 *     <enumeration value="ZINSBEL"/>
 *     <enumeration value="TILGANR"/>
 *     <enumeration value="ZINSWECHSEL"/>
 *     <enumeration value="BERZINSZAHLG"/>
 *     <enumeration value="ZWSTAND"/>
 *     <enumeration value="ABSCHLUSS"/>
 *     <enumeration value="BONUSAUSZ"/>
 *     <enumeration value="BONUSVERR"/>
 *     <enumeration value="TILGWECHSEL"/>
 *     <enumeration value="STEUER"/>
 *     <enumeration value="RESTSCHULD"/>
 *     <enumeration value="EKSTEUER"/>
 *     <enumeration value="GEBKTOF"/>
 *     <enumeration value="GEBLFD"/>
 *     <enumeration value="GEBERSTATTUNG"/>
 *     <enumeration value="STUECKZINS"/>
 *     <enumeration value="ZULAGE"/>
 *     <enumeration value="CAPPRAEMIE"/>
 *     <enumeration value="RISIKOABSICHERUNG"/>
 *     <enumeration value="BEARBEITUNGSGEBUEHR"/>
 *     <enumeration value="BEREIZINSAB"/>
 *     <enumeration value="EINMALGEBUEHR"/>
 *     <enumeration value="GEBKREDUNABHSEP"/>
 *     <enumeration value="GEBKREDUNABHVER"/>
 *     <enumeration value="GEBNOTARSEP"/>
 *     <enumeration value="GEBNOTARVER"/>
 *     <enumeration value="GEBSONSTIGESEP"/>
 *     <enumeration value="GEBSONSTIGEVER"/>
 *     <enumeration value="GEBVERSICHSEP"/>
 *     <enumeration value="GEBVERSICHVER"/>
 *     <enumeration value="GEBUEHR_DARLEHENSPREIS"/>
 *     <enumeration value="BEARBEITUNGSGEBUEHR_SEPARAT"/>
 *     <enumeration value="ZWSTAND_TAGESAGGREGIERT"/>
 *     <enumeration value="KTOPLAN_ZINSWECHSELAT"/>
 *     <enumeration value="KTOPLAN_PANGV_FREMDGEBUEHR"/>
 *     <enumeration value="TILGUNGS_RATE"/>
 *     <enumeration value="GEBUEHR_VERRECHNET"/>
 *     <enumeration value="GEBUEHR_GEZAHLT"/>
 *     <enumeration value="GEBUEHR_EXTERN"/>
 *     <enumeration value="GEBUEHR_GEZAHLT_NICHT_EFFZINS"/>
 *     <enumeration value="MARGINZAHLUNG"/>
 *     <enumeration value="LETZTER_KONTOABSCHLUSS_BEI_APE_NACH_KONTOSTAND"/>
 *     <enumeration value="ZINSANPASSUNG"/>
 *     <enumeration value="RATENWECHSEL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Cashflowsart")
@XmlEnum
public enum Cashflowsart {


    /**
     * Rate
     */
    RATE,

    /**
     * Auszahlung
     */
    AUSZAHLUNG,

    /**
     * Disagio
     */
    DISAGIO,

    /**
     * Sondertilgung
     */
    SONDERTILG,

    /**
     * Gebuehr + separat zu zahlen.
     */
    GEBUEHRP,

    /**
     * Gebuehr wird mit Konto verrechnet.
     */
    GEBUEHRV,

    /**
     * Zinszahlung
     */
    ZINSZAHLG,

    /**
     * Tilgungszahlung
     */
    TILGUNG,

    /**
     * Zinsbelastung bzw. bei Tilgungsdarlehen Zinsberechnungstermin.
     */
    ZINSBEL,

    /**
     * Tilgungsanrechnung
     */
    TILGANR,

    /**
     * ZinswechselL
     */
    ZINSWECHSEL,

    /**
     * Bereitstellungszinszahlung
     */
    BERZINSZAHLG,

    /**
     * Zwischenstand
     */
    ZWSTAND,

    /**
     * Kontoabschluss
     */
    ABSCHLUSS,

    /**
     * Bonus + separat ausgezahlt
     */
    BONUSAUSZ,

    /**
     * Bonus wird auf Konto gutgeschrieben
     */
    BONUSVERR,

    /**
     * Tilgungssatzwechsel
     */
    TILGWECHSEL,

    /**
     * Steuerzahlung
     */
    STEUER,

    /**
     * Restschuld bei Tilgungsdarlehen
     */
    RESTSCHULD,

    /**
     * Einkommensteuer
     */
    EKSTEUER,

    /**
     * Kontoführungsgebühr
     */
    GEBKTOF,

    /**
     * Laufende Gebühr
     */
    GEBLFD,

    /**
     * Gebührenerstattung bei Disagiosplitting
     */
    GEBERSTATTUNG,

    /**
     * Stückzins
     */
    STUECKZINS,

    /**
     * Zulage
     */
    ZULAGE,

    /**
     * CAP Praemie
     */
    CAPPRAEMIE,

    /**
     * Risikoabsicherung
     */
    RISIKOABSICHERUNG,

    /**
     * Bearbeitungsgebühr
     */
    BEARBEITUNGSGEBUEHR,

    /**
     * Bereitstellungszins ab
     */
    BEREIZINSAB,

    /**
     * Einmalgebühr
     */
    EINMALGEBUEHR,

    /**
     * Kreditunabhängige Kosten (separat zu zahlen).
     */
    GEBKREDUNABHSEP,

    /**
     * Kreditunabhängige Kosten (verrechnet).
     */
    GEBKREDUNABHVER,

    /**
     * Notarkosten (separat zu zahlen).
     */
    GEBNOTARSEP,

    /**
     * Notarkosten (verrechnet).
     */
    GEBNOTARVER,

    /**
     * Sonstige Kosten (separat zu zahlen).
     */
    GEBSONSTIGESEP,

    /**
     * Sonstige Kosten (verrechnet).
     */
    GEBSONSTIGEVER,

    /**
     * Versicherungskosten ohne Einfluss auf die Kreditvergabe (separat zu zahlen).
     */
    GEBVERSICHSEP,

    /**
     * Versicherungskosten ohne Einfluss auf die Kreditvergabe (verrechnet).
     */
    GEBVERSICHVER,

    /**
     * Darlehenspreis-Gebühr
     */
    GEBUEHR_DARLEHENSPREIS,

    /**
     * Separat bezahlte Bearbeitungsgebühr.
     */
    BEARBEITUNGSGEBUEHR_SEPARAT,

    /**
     * Zwischenstand tagesaggregiert.
     */
    ZWSTAND_TAGESAGGREGIERT,

    /**
     * Zinswechsel AT.
     */
    KTOPLAN_ZINSWECHSELAT,

    /**
     * PAngV-Fremdgebühren.
     */
    KTOPLAN_PANGV_FREMDGEBUEHR,

    /**
     * Tilgungsrate
     */
    TILGUNGS_RATE,

    /**
     * Verrechnete Gebühr, die effektivzinswirksam ist.
     */
    GEBUEHR_VERRECHNET,

    /**
     * Gezahlte Gebühr, die effektivzinswirksam ist.
     */
    GEBUEHR_GEZAHLT,

    /**
     * Gebuehr extern
     */
    GEBUEHR_EXTERN,

    /**
     * Gezahlte Gebühr, die nicht effektivzinswirksam ist.
     */
    GEBUEHR_GEZAHLT_NICHT_EFFZINS,

    /**
     * Aufschlag Zahlung.
     */
    MARGINZAHLUNG,

    /**
     * Bei APE nach Kontostand wird dieses Ereignis statt "Auszahlung" verwendet.
     */
    LETZTER_KONTOABSCHLUSS_BEI_APE_NACH_KONTOSTAND,

    /**
     * Beim Rollover wird statt Zinswechsel die Bezeichnung Zinsanpassung verwendet.
     */
    ZINSANPASSUNG,

    /**
     * Ratenwechsel.
     */
    RATENWECHSEL;

    public String value() {
        return name();
    }

    public static Cashflowsart fromValue(String v) {
        return valueOf(v);
    }

}
