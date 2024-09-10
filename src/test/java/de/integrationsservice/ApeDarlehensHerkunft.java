
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Herkunft bzw. Erfassungsart des Altdarlehens, das Basis für eine Geschäftsänderung ist (Bestand MARZIPAN
 * / Bestand nicht MARZIPAN / nach Kontostand)
 * BESTAND_MARZIPAN; BESTAND_NICHT_MARZIPAN; NACH_KONTOSTAND
 *
 * <p>Java class for ApeDarlehensHerkunft</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ApeDarlehensHerkunft">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BESTAND_MARZIPAN"/>
 *     <enumeration value="BESTAND_NICHT_MARZIPAN"/>
 *     <enumeration value="NACH_KONTOSTAND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ApeDarlehensHerkunft")
@XmlEnum
public enum ApeDarlehensHerkunft {

    BESTAND_MARZIPAN,
    BESTAND_NICHT_MARZIPAN,
    NACH_KONTOSTAND;

    public String value() {
        return name();
    }

    public static ApeDarlehensHerkunft fromValue(String v) {
        return valueOf(v);
    }

}
