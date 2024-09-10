
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Zinsen, die bis zur ersten Zinszahlung anfallen, können verrechnet/kumuliert werden.
 *
 * <p>Java class for ZinsBisTilgungsbeginn</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ZinsBisTilgungsbeginn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ZINSENZAHLEN"/>
 *     <enumeration value="ZINSENKUMULIEREN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ZinsBisTilgungsbeginn")
@XmlEnum
public enum ZinsBisTilgungsbeginn {

    ZINSENZAHLEN,
    ZINSENKUMULIEREN;

    public String value() {
        return name();
    }

    public static ZinsBisTilgungsbeginn fromValue(String v) {
        return valueOf(v);
    }

}
