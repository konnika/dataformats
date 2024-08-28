
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typ des Parameters
 *
 * <p>Java class for Parametertyp</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Parametertyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Zahlparameter"/>
 *     <enumeration value="Stringparameter"/>
 *     <enumeration value="Datumsparameter"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "Parametertyp")
@XmlEnum
public enum Parametertyp {


    /**
     * Zahlparameter mit oder ohne Nachkommastellen. Die Unterscheidung der Zahlparameter von den
     * Stringparametern ist für die länderspezifische Ausgabe der Fehlermeldung wichtig.
     */
    @XmlEnumValue("Zahlparameter")
    ZAHLPARAMETER("Zahlparameter"),

    /**
     * Stringparameter werden unverändert in die Fehlermeldung übernommen.
     */
    @XmlEnumValue("Stringparameter")
    STRINGPARAMETER("Stringparameter"),

    /**
     * Die Unterscheidung der Datumsparameter von den Stringparametern ist für die länderspeziefische
     * Ausgabe der Fehlermeldung wichtig.
     */
    @XmlEnumValue("Datumsparameter")
    DATUMSPARAMETER("Datumsparameter");
    private final String value;

    Parametertyp(String v) {
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
    public static Parametertyp fromValue(String v) {
        for (Parametertyp c : Parametertyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
