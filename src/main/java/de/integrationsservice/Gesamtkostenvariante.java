
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Laufzeit eines Geschäfts kann auf drei verschiedenen Arten bestimmt werden: bis Zinsbindungsende,
 * bis zur vollständigen Tilgung oder bis zu einem vorgegebenen Ablaufdatum.
 *
 * <p>Java class for Gesamtkostenvariante</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Gesamtkostenvariante">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ZINSBINDUNGSENDE"/>
 *     <enumeration value="GESAMTLAUFZEIT"/>
 *     <enumeration value="EXTERNES_ABLAUFDATUM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Gesamtkostenvariante")
@XmlEnum
public enum Gesamtkostenvariante {

    ZINSBINDUNGSENDE,
    GESAMTLAUFZEIT,
    EXTERNES_ABLAUFDATUM;

    public String value() {
        return name();
    }

    public static Gesamtkostenvariante fromValue(String v) {
        return valueOf(v);
    }

}
