
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ausübungsvariante des Kündigungsrechts.
 *
 * <p>Java class for AusuebungKuendigungsrechte</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AusuebungKuendigungsrechte">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUSUEB_KUENDIGUNGSRECHT_ZAHLUNGSTERMIN"/>
 *     <enumeration value="AUSUEB_KUENDIGUNGSRECHT_FREIWAEHLBAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "AusuebungKuendigungsrechte")
@XmlEnum
public enum AusuebungKuendigungsrechte {

    AUSUEB_KUENDIGUNGSRECHT_ZAHLUNGSTERMIN,
    AUSUEB_KUENDIGUNGSRECHT_FREIWAEHLBAR;

    public String value() {
        return name();
    }

    public static AusuebungKuendigungsrechte fromValue(String v) {
        return valueOf(v);
    }

}
