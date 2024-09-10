
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Berechnung mit oder ohne Liquiditätskosten
 *
 * <p>Java class for MitLiquikosten</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MitLiquikosten">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OHNE_LIQUIKOSTEN"/>
 *     <enumeration value="MIT_LIQUIKOSTEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "MitLiquikosten")
@XmlEnum
public enum MitLiquikosten {

    OHNE_LIQUIKOSTEN,
    MIT_LIQUIKOSTEN;

    public String value() {
        return name();
    }

    public static MitLiquikosten fromValue(String v) {
        return valueOf(v);
    }

}
