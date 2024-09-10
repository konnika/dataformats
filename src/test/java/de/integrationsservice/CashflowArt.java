
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Art des Cash-Flows
 *
 * <p>Java class for CashflowArt</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CashflowArt">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RATE"/>
 *     <enumeration value="AUSZAHLUNG"/>
 *     <enumeration value="DISAGIO"/>
 *     <enumeration value="SONDERTILG"/>
 *     <enumeration value="GEBUEHRP"/>
 *     <enumeration value="GEBUEHRV"/>
 *     <enumeration value="ZINSZAHLG"/>
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
 *     <enumeration value="EINMALGEBUEHR"/>
 *     <enumeration value="GEBKREDUNABHSEP"/>
 *     <enumeration value="GEBKREDUNABHVER"/>
 *     <enumeration value="GEBNOTARSEP"/>
 *     <enumeration value="GEBNOTARVER"/>
 *     <enumeration value="GEBSONSTIGESEP"/>
 *     <enumeration value="GEBSONSTIGEVER"/>
 *     <enumeration value="GEBVERSICHSEP"/>
 *     <enumeration value="GEBVERSICHVER"/>
 *     <enumeration value="TILGUNGS_RATE"/>
 *     <enumeration value="GEBUEHR_VERRECHNET"/>
 *     <enumeration value="GEBUEHR_GEZAHLT"/>
 *     <enumeration value="GEBUEHR_EXTERN"/>
 *     <enumeration value="GEBUEHR_GEZAHLT_NICHT_EFFZINS"/>
 *     <enumeration value="MARGINZAHLUNG"/>
 *     <enumeration value="BEREIZINSAB"/>
 *     <enumeration value="RATENWECHSEL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "CashflowArt")
@XmlEnum
public enum CashflowArt {

    RATE,
    AUSZAHLUNG,
    DISAGIO,
    SONDERTILG,
    GEBUEHRP,
    GEBUEHRV,
    ZINSZAHLG,
    ZINSBEL,
    TILGANR,
    ZINSWECHSEL,
    BERZINSZAHLG,
    ZWSTAND,
    ABSCHLUSS,
    BONUSAUSZ,
    BONUSVERR,
    TILGWECHSEL,
    STEUER,
    RESTSCHULD,
    EKSTEUER,
    GEBKTOF,
    GEBLFD,
    GEBERSTATTUNG,
    STUECKZINS,
    ZULAGE,
    CAPPRAEMIE,
    RISIKOABSICHERUNG,
    BEARBEITUNGSGEBUEHR,
    EINMALGEBUEHR,

    /**
     * Kreditunabhängige Gebühr separat
     */
    GEBKREDUNABHSEP,

    /**
     * Kreditunabhängige Gebühr verrechnet
     */
    GEBKREDUNABHVER,

    /**
     * Notargebühr separat
     */
    GEBNOTARSEP,

    /**
     * Notargebühr verrechnet
     */
    GEBNOTARVER,

    /**
     * Sonstige Gebühren separat
     */
    GEBSONSTIGESEP,

    /**
     * Sonstige Gebühren verrechnet
     */
    GEBSONSTIGEVER,

    /**
     * Versicherungsgebühr separat
     */
    GEBVERSICHSEP,

    /**
     * Versicherungsgebühr verrechne
     */
    GEBVERSICHVER,

    /**
     * Tilgungsrate
     */
    TILGUNGS_RATE,

    /**
     * verrechnet Gebühre
     */
    GEBUEHR_VERRECHNET,

    /**
     * gezahlte Gebühr
     */
    GEBUEHR_GEZAHLT,
    GEBUEHR_EXTERN,

    /**
     * Gebühren gezahlt nicht Effektivzins relevant
     */
    GEBUEHR_GEZAHLT_NICHT_EFFZINS,
    MARGINZAHLUNG,
    BEREIZINSAB,
    RATENWECHSEL;

    public String value() {
        return name();
    }

    public static CashflowArt fromValue(String v) {
        return valueOf(v);
    }

}
