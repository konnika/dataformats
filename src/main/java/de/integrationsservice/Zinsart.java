
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Zinsart (fest oder variabel)
 *
 * <p>Java class for Zinsart</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Zinsart">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ZINSART_FEST"/>
 *     <enumeration value="ZINSART_VARIABEL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Zinsart")
@XmlEnum
public enum Zinsart {

    ZINSART_FEST,
    ZINSART_VARIABEL;

    public String value() {
        return name();
    }

    public static Zinsart fromValue(String v) {
        return valueOf(v);
    }

}
