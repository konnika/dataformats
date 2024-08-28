
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * MARZIPAN Web kann die Bereitstellungszinsen entweder mit jeder Auszahlung oder jeweils am Zinstermin
 * berechnen. Bereitstellungszinsen werden immer separat gezahlt.
 * BEREIT_PRO_AUSZAHLUNG BEREIT_PRO_ZINSTERMIN
 *
 * <p>Java class for ModusBereitstellungszins</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ModusBereitstellungszins">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BEREIT_PRO_AUSZAHLUNG"/>
 *     <enumeration value="BEREIT_PRO_ZINSTERMIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ModusBereitstellungszins")
@XmlEnum
public enum ModusBereitstellungszins {

    BEREIT_PRO_AUSZAHLUNG,
    BEREIT_PRO_ZINSTERMIN;

    public String value() {
        return name();
    }

    public static ModusBereitstellungszins fromValue(String v) {
        return valueOf(v);
    }

}
