
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die ReferenzzinsLaufzeit enthält die Laufzeit in Monaten eines Referenzzins.
 * Die 0 ist fuer Laufzeit 1 Tag, nur bei Roll-Over im Overnight-Verfahren.
 *
 * <p>Java class for ReferenzzinsLaufzeit</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ReferenzzinsLaufzeit">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LAUFZEIT_1_TAG"/>
 *     <enumeration value="LAUFZEIT_1_MONAT"/>
 *     <enumeration value="LAUFZEIT_2_MONATE"/>
 *     <enumeration value="LAUFZEIT_3_MONATE"/>
 *     <enumeration value="LAUFZEIT_4_MONATE"/>
 *     <enumeration value="LAUFZEIT_6_MONATE"/>
 *     <enumeration value="LAUFZEIT_1_JAHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ReferenzzinsLaufzeit")
@XmlEnum
public enum ReferenzzinsLaufzeit {

    LAUFZEIT_1_TAG,
    LAUFZEIT_1_MONAT,
    LAUFZEIT_2_MONATE,
    LAUFZEIT_3_MONATE,
    LAUFZEIT_4_MONATE,
    LAUFZEIT_6_MONATE,
    LAUFZEIT_1_JAHR;

    public String value() {
        return name();
    }

    public static ReferenzzinsLaufzeit fromValue(String v) {
        return valueOf(v);
    }

}
