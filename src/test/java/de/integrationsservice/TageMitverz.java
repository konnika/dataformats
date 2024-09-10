
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Legt fest, ob für jede Einzahlung der Anlagetag oder der Rückzahlungstag mitverzinst wird.
 * TAGE_MITVERZINSEN_EINZAHLUNGSTAGE TAGE_MITVERZINSEN_RUECKZAHLUNGSTAGE
 *
 * <p>Java class for TageMitverz</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TageMitverz">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TAGE_MITVERZINSEN_EINZAHLUNGSTAGE"/>
 *     <enumeration value="TAGE_MITVERZINSEN_RUECKZAHLUNGSTAGE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "TageMitverz")
@XmlEnum
public enum TageMitverz {

    TAGE_MITVERZINSEN_EINZAHLUNGSTAGE,
    TAGE_MITVERZINSEN_RUECKZAHLUNGSTAGE;

    public String value() {
        return name();
    }

    public static TageMitverz fromValue(String v) {
        return valueOf(v);
    }

}
