
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Mögliche Kostentypen im Deckungsbeitragsschema
 *
 * <p>Java class for KostenTyp</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="KostenTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPTIONSPREIS"/>
 *     <enumeration value="RISIKOPRAEMIE"/>
 *     <enumeration value="ERWARTETER_VERLUST"/>
 *     <enumeration value="RISIKOUEBERNAHMEPRAEMIE"/>
 *     <enumeration value="EKKAUFSICHTSRECHTLICH"/>
 *     <enumeration value="EKKAUFSICHTSRECHTLICHVERZINSLICH"/>
 *     <enumeration value="EKKAUFSICHTSRECHTLICHBILANZIELL"/>
 *     <enumeration value="EKKAUFSICHTSRECHTLICH_KSA_OF"/>
 *     <enumeration value="EKKAUFSICHTSRECHTLICHVERZINSLICH_KSA_OF"/>
 *     <enumeration value="EKKAUFSICHTSRECHTLICHBILANZIELL_KSA_OF"/>
 *     <enumeration value="EINMALIGE_KOSTEN_AM_KALK"/>
 *     <enumeration value="EINMALIGE_KOSTEN_AM_AUSZ"/>
 *     <enumeration value="EINMALIGE_KOSTEN_AM_ENDE"/>
 *     <enumeration value="LFD_KOSTEN_PA_AB_KALK"/>
 *     <enumeration value="LFD_KOSTEN_PA_AB_AUSZ"/>
 *     <enumeration value="LFD_KOSTEN_PM_AB_KALK"/>
 *     <enumeration value="LFD_KOSTEN_PM_AB_AUSZ"/>
 *     <enumeration value="AUFSCHLAG_AUF_ZSTR"/>
 *     <enumeration value="KOSTENPROZENTSATZ"/>
 *     <enumeration value="KOSTENPROZENTSATZ_AUF_NOMBETRAG"/>
 *     <enumeration value="KOSTENPROZENTSATZ_AUF_AUSZBETRAG"/>
 *     <enumeration value="KOSTENPROZENTSATZ_JAEHRLICH_AUF_NOM_RESTSCHULD"/>
 *     <enumeration value="KOSTENPROZENTSATZ_AUF_RESTKAPITAL"/>
 *     <enumeration value="KOSTENPROZENTSATZ_AUF_RATEN"/>
 *     <enumeration value="KOSTENPROZENTSATZ_AUF_DBSTUFE"/>
 *     <enumeration value="KOSTENPROZENTSATZ_AUF_DBSTUFENDIFFERENZ"/>
 *     <enumeration value="GEDECKTER_ANTEIL_IN_PROZENT"/>
 *     <enumeration value="UNGEDECKTER_ANTEIL_IN_PROZENT"/>
 *     <enumeration value="SUMME_SICHERHEITEN_KATEGORIE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "KostenTyp")
@XmlEnum
public enum KostenTyp {

    OPTIONSPREIS,
    RISIKOPRAEMIE,
    ERWARTETER_VERLUST,
    RISIKOUEBERNAHMEPRAEMIE,
    EKKAUFSICHTSRECHTLICH,
    EKKAUFSICHTSRECHTLICHVERZINSLICH,
    EKKAUFSICHTSRECHTLICHBILANZIELL,
    EKKAUFSICHTSRECHTLICH_KSA_OF,
    EKKAUFSICHTSRECHTLICHVERZINSLICH_KSA_OF,
    EKKAUFSICHTSRECHTLICHBILANZIELL_KSA_OF,
    EINMALIGE_KOSTEN_AM_KALK,
    EINMALIGE_KOSTEN_AM_AUSZ,
    EINMALIGE_KOSTEN_AM_ENDE,
    LFD_KOSTEN_PA_AB_KALK,
    LFD_KOSTEN_PA_AB_AUSZ,
    LFD_KOSTEN_PM_AB_KALK,
    LFD_KOSTEN_PM_AB_AUSZ,
    AUFSCHLAG_AUF_ZSTR,
    KOSTENPROZENTSATZ,
    KOSTENPROZENTSATZ_AUF_NOMBETRAG,
    KOSTENPROZENTSATZ_AUF_AUSZBETRAG,
    KOSTENPROZENTSATZ_JAEHRLICH_AUF_NOM_RESTSCHULD,
    KOSTENPROZENTSATZ_AUF_RESTKAPITAL,
    KOSTENPROZENTSATZ_AUF_RATEN,
    KOSTENPROZENTSATZ_AUF_DBSTUFE,
    KOSTENPROZENTSATZ_AUF_DBSTUFENDIFFERENZ,
    GEDECKTER_ANTEIL_IN_PROZENT,
    UNGEDECKTER_ANTEIL_IN_PROZENT,
    SUMME_SICHERHEITEN_KATEGORIE;

    public String value() {
        return name();
    }

    public static KostenTyp fromValue(String v) {
        return valueOf(v);
    }

}
