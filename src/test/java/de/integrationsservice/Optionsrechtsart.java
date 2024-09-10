
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Art des Optionsrechts (Kündigungsrecht, Verfügungsrecht, Sondertilgungsrecht)
 *
 * <p>Java class for Optionsrechtsart</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Optionsrechtsart">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IOART_KUENDIGUNGSRECHT"/>
 *     <enumeration value="IOART_VERFUEGUNGSRECHT"/>
 *     <enumeration value="IOART_SONDERTILGUNGSRECHT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Optionsrechtsart")
@XmlEnum
public enum Optionsrechtsart {

    IOART_KUENDIGUNGSRECHT,
    IOART_VERFUEGUNGSRECHT,
    IOART_SONDERTILGUNGSRECHT;

    public String value() {
        return name();
    }

    public static Optionsrechtsart fromValue(String v) {
        return valueOf(v);
    }

}
