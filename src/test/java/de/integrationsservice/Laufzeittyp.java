
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Laufzeittyp (Tagesgeld, TOM/NEXT, Tage, Monate, Jahre)
 * TAGESGELD TOM/NEXT TAGE MONATE JAHRE
 * <p>
 * Tagesgeld: für das Wertpapier "Tagesgeld"
 * TOM/NEXT: für das Wertpapier "TOM/NEXT"
 * Tage: für das Wertpapier "SPOT/NEXT" (Anzahl dann 1) und die Wertpapiere "1-Woche", "2-Wochen" und
 * "3-Wochen" (Anzahl 7, 14, 21)
 * Monate: für Wertpapiere mit ganzzahligen Monatsangaben durchgehend von 1 bis 12, ferner: 15, 18, 21
 * Jahre: für Wertpapiere mit ganzzahligen Jahresangaben von 1 bis 15, ferner: 17, 20, 25, 30, 50
 *
 * <p>Java class for Laufzeittyp</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Laufzeittyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Tagesgeld"/>
 *     <enumeration value="TOM/NEXT"/>
 *     <enumeration value="Tage"/>
 *     <enumeration value="Monate"/>
 *     <enumeration value="Jahre"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Laufzeittyp")
@XmlEnum
public enum Laufzeittyp {

    @XmlEnumValue("Tagesgeld")
    TAGESGELD("Tagesgeld"),
    @XmlEnumValue("TOM/NEXT")
    TOM_NEXT("TOM/NEXT"),
    @XmlEnumValue("Tage")
    TAGE("Tage"),
    @XmlEnumValue("Monate")
    MONATE("Monate"),
    @XmlEnumValue("Jahre")
    JAHRE("Jahre");
    private final String value;

    Laufzeittyp(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     *
     * @return The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     *
     * @param v The value to get the enum from.
     * @return The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException If no value matches in the enum declaration.
     */
    public static Laufzeittyp fromValue(String v) {
        for (Laufzeittyp c : Laufzeittyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
