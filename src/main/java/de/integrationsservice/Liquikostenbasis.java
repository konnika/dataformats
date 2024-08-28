
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Basis der Liquikostenberechnung.
 * Bei CASH-FLOW wird nur ZWEI_KURVEN_VERGLEICH unterstützt.
 *
 * <p>Java class for Liquikostenbasis</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Liquikostenbasis">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ZWEI_KURVEN_VERGLEICH"/>
 *     <enumeration value="VORGABE_LIQUISPREAD_LIQUIBARWERT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Liquikostenbasis")
@XmlEnum
public enum Liquikostenbasis {

    ZWEI_KURVEN_VERGLEICH,
    VORGABE_LIQUISPREAD_LIQUIBARWERT;

    public String value() {
        return name();
    }

    public static Liquikostenbasis fromValue(String v) {
        return valueOf(v);
    }

}
