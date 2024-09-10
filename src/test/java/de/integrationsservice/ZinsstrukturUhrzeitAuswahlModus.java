
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Auswahl der Zinsstruktur gemäß Uhrzeit.
 * Das Element ist ein reines Ausgabefeld. Beim Import wird dieses Element ignoriert.
 *
 * <p>Java class for ZinsstrukturUhrzeitAuswahlModus</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ZinsstrukturUhrzeitAuswahlModus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KEINE"/>
 *     <enumeration value="BIS_EINSCHLIESSLICH"/>
 *     <enumeration value="GLEICH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ZinsstrukturUhrzeitAuswahlModus")
@XmlEnum
public enum ZinsstrukturUhrzeitAuswahlModus {

    KEINE,
    BIS_EINSCHLIESSLICH,
    GLEICH;

    public String value() {
        return name();
    }

    public static ZinsstrukturUhrzeitAuswahlModus fromValue(String v) {
        return valueOf(v);
    }

}
