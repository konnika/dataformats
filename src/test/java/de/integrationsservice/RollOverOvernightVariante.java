
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Overnight-Variante
 * - Payment Delay
 * - Lockout
 * - Lookback (LB); bedeutet mit Observation Shift
 * - Last Reset
 * - Lookback (LN); bedeutet ohne Observation Shift
 *
 * <p>Java class for RollOverOvernightVariante</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RollOverOvernightVariante">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PAYMENT_DELAY"/>
 *     <enumeration value="LOCKOUT"/>
 *     <enumeration value="LOOKBACK_LB"/>
 *     <enumeration value="LAST_RESET"/>
 *     <enumeration value="LOOKBACK_LN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "RollOverOvernightVariante")
@XmlEnum
public enum RollOverOvernightVariante {

    PAYMENT_DELAY,
    LOCKOUT,
    LOOKBACK_LB,
    LAST_RESET,
    LOOKBACK_LN;

    public String value() {
        return name();
    }

    public static RollOverOvernightVariante fromValue(String v) {
        return valueOf(v);
    }

}
