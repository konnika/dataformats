
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ausübungsverhalten (optional, eingeschränkt optional, statistisch)
 *
 * <p>Java class for Ausuebungsverhalten</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Ausuebungsverhalten">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUSUEB_VERHALTEN_OPTIONAL"/>
 *     <enumeration value="AUSUEB_VERHALTEN_EINGESCHRAENKT_OPTIONAL"/>
 *     <enumeration value="AUSUEB_VERHALTEN_STATISTISCH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Ausuebungsverhalten")
@XmlEnum
public enum Ausuebungsverhalten {

    AUSUEB_VERHALTEN_OPTIONAL,
    AUSUEB_VERHALTEN_EINGESCHRAENKT_OPTIONAL,
    AUSUEB_VERHALTEN_STATISTISCH;

    public String value() {
        return name();
    }

    public static Ausuebungsverhalten fromValue(String v) {
        return valueOf(v);
    }

}
