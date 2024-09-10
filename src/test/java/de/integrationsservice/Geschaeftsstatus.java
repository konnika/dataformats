
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Geschäftsstatus definiert die möglichen Status in denen sich ein Geschäft befinden kann.
 *
 * <p>Java class for Geschaeftsstatus</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Geschaeftsstatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ERSTELLT"/>
 *     <enumeration value="ANGEFRAGT_TREASURY"/>
 *     <enumeration value="ANGEFRAGT_FACHLICH"/>
 *     <enumeration value="GEMELDET"/>
 *     <enumeration value="FREIGEGEBEN"/>
 *     <enumeration value="GEPRUEFT_TREASURY"/>
 *     <enumeration value="GEPRUEFT_FACHLICH"/>
 *     <enumeration value="GESPERRT"/>
 *     <enumeration value="ABGELOEST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Geschaeftsstatus")
@XmlEnum
public enum Geschaeftsstatus {

    ERSTELLT,
    ANGEFRAGT_TREASURY,
    ANGEFRAGT_FACHLICH,
    GEMELDET,
    FREIGEGEBEN,
    GEPRUEFT_TREASURY,
    GEPRUEFT_FACHLICH,
    GESPERRT,
    ABGELOEST;

    public String value() {
        return name();
    }

    public static Geschaeftsstatus fromValue(String v) {
        return valueOf(v);
    }

}
