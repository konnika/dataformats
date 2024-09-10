
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typ für Berechnungsvorschrift der Wertberichtigung für Eigenkapitalkosten
 *
 * <p>Java class for LGDDifferenz</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LGDDifferenz">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WERTBERICHTIGUNG_KEINE"/>
 *     <enumeration value="WERTBERICHTIGUNG_BERECHNUNG"/>
 *     <enumeration value="WERTBERICHTIGUNG_AUSREICHEND"/>
 *     <enumeration value="KEINE_ERWARTETEN_VERLUSTRATEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "LGDDifferenz")
@XmlEnum
public enum LGDDifferenz {


    /**
     * keine Wertberichtigung
     */
    WERTBERICHTIGUNG_KEINE,

    /**
     * Berechnung der Wertberichtigung
     */
    WERTBERICHTIGUNG_BERECHNUNG,

    /**
     * aufsichtsrechtlich ausreichende Wertberichtigung
     */
    WERTBERICHTIGUNG_AUSREICHEND,

    /**
     * keine erwarteten Verlustraten
     */
    KEINE_ERWARTETEN_VERLUSTRATEN;

    public String value() {
        return name();
    }

    public static LGDDifferenz fromValue(String v) {
        return valueOf(v);
    }

}
