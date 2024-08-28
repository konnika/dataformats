
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Herkunft oder Art des Cashflows
 *
 * <p>Java class for Herkunft</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Herkunft">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="M"/>
 *     <enumeration value="N"/>
 *     <enumeration value="Z"/>
 *     <enumeration value="L"/>
 *     <enumeration value="G"/>
 *     <enumeration value="V"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Herkunft")
@XmlEnum
public enum Herkunft {


    /**
     * Margen-Cash-Flow
     */
    M,

    /**
     * Margenbereinigter Cash-Flow
     */
    N,

    /**
     * Zinsänderungs-Cash-Flow
     */
    Z,

    /**
     * Liquiditäts-Cash-Flow
     */
    L,

    /**
     * Sowohl Zinsänderungs- als auch Liquiditäts-Cash-Flow
     */
    G,

    /**
     * Vergleichskonto
     */
    V;

    public String value() {
        return name();
    }

    public static Herkunft fromValue(String v) {
        return valueOf(v);
    }

}
