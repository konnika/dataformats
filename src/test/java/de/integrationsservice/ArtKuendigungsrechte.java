
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Art des Kündigungsrechts.
 *
 * <p>Java class for ArtKuendigungsrechte</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ArtKuendigungsrechte">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ART_KUENDIGUNGSRECHT_OHNE"/>
 *     <enumeration value="ART_KUENDIGUNGSRECHT_GLAUBIGER"/>
 *     <enumeration value="ART_KUENDIGUNGSRECHT_SCHULDNER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ArtKuendigungsrechte")
@XmlEnum
public enum ArtKuendigungsrechte {

    ART_KUENDIGUNGSRECHT_OHNE,
    ART_KUENDIGUNGSRECHT_GLAUBIGER,
    ART_KUENDIGUNGSRECHT_SCHULDNER;

    public String value() {
        return name();
    }

    public static ArtKuendigungsrechte fromValue(String v) {
        return valueOf(v);
    }

}
