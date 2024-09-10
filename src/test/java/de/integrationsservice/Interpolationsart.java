
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Berechnungsvorschrift für die Ermittlung von Zinsen/Renditen zwischen Stützstellen.
 *
 * <p>Java class for Interpolationsart</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Interpolationsart">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RK_ILINEAR"/>
 *     <enumeration value="RK_ILINEAR_KONF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Interpolationsart")
@XmlEnum
public enum Interpolationsart {


    /**
     * linear: Bei dieser Interpolationsart werden die zu interpolierenden Wertpapiere in die Usance
     * act/360 umgerechnet, das interpolierte Papier berechnet und danach in die für die Laufzeit des
     * interpolierten Papiers gültige Usance zurückgerechnet.
     */
    RK_ILINEAR,

    /**
     * usancenkonform: Bei dieser Interpolationsart werden bei der Interpolation die Usancen der zu
     * interpolierenden Wertpapiere beibehalten, es sei denn, sie sind unterschiedlich. In letzterem
     * Fall wird wie bei der linearen Interpolationsart RK_LINEAR verfahren.
     */
    RK_ILINEAR_KONF;

    public String value() {
        return name();
    }

    public static Interpolationsart fromValue(String v) {
        return valueOf(v);
    }

}
