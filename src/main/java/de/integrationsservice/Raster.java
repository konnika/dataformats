
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Das Tag erlaubt die Auswahl des Rasters eines Tilgungsplans.
 *
 * <p>Java class for Raster</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Raster">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KTO_MONATLICH"/>
 *     <enumeration value="KTO_VIERTELJAEHRLICH"/>
 *     <enumeration value="KTO_HALBJAEHRLICH"/>
 *     <enumeration value="KTO_JAEHRLICH"/>
 *     <enumeration value="KTO_ALLES"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Raster")
@XmlEnum
public enum Raster {


    /**
     * Montalich
     */
    KTO_MONATLICH,

    /**
     * Vierteljährlich
     */
    KTO_VIERTELJAEHRLICH,

    /**
     * Halbjährlich
     */
    KTO_HALBJAEHRLICH,

    /**
     * Jährlich
     */
    KTO_JAEHRLICH,

    /**
     * Alles
     */
    KTO_ALLES;

    public String value() {
        return name();
    }

    public static Raster fromValue(String v) {
        return valueOf(v);
    }

}
