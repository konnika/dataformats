
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ausübungsfunktion (standard, individuell)
 *
 * <p>Java class for Ausuebungsfunktion</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Ausuebungsfunktion">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUSUEB_FUNKTION_STANDARD"/>
 *     <enumeration value="AUSUEB_FUNKTION_INDIVIDUELL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Ausuebungsfunktion")
@XmlEnum
public enum Ausuebungsfunktion {

    AUSUEB_FUNKTION_STANDARD,
    AUSUEB_FUNKTION_INDIVIDUELL;

    public String value() {
        return name();
    }

    public static Ausuebungsfunktion fromValue(String v) {
        return valueOf(v);
    }

}
