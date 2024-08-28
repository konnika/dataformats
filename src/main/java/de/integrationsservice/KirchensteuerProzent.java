
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Auswahl, welcher prozentuale Kirchensteuersatz bei der Berechnung der Abgeltungssteuersatz zugrunde
 * gelegt werden soll: keine, 8%, 9%.
 * KIRCHENSTEUER_KEINE KIRCHENSTEUER_ACHTPROZENT KIRCHENSTEUER_NEUNPROZENT
 *
 * <p>Java class for KirchensteuerProzent</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="KirchensteuerProzent">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KIRCHENSTEUER_KEINE"/>
 *     <enumeration value="KIRCHENSTEUER_ACHTPROZENT"/>
 *     <enumeration value="KIRCHENSTEUER_NEUNPROZENT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "KirchensteuerProzent")
@XmlEnum
public enum KirchensteuerProzent {

    KIRCHENSTEUER_KEINE,
    KIRCHENSTEUER_ACHTPROZENT,
    KIRCHENSTEUER_NEUNPROZENT;

    public String value() {
        return name();
    }

    public static KirchensteuerProzent fromValue(String v) {
        return valueOf(v);
    }

}
