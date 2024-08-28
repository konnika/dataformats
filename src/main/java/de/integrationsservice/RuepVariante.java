
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Berechnungsvariante für die Risikoübernahmeprämie.
 *
 * <p>Java class for RuepVariante</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RuepVariante">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NICHTDEFRUEPVARIANTE"/>
 *     <enumeration value="EINGABE"/>
 *     <enumeration value="BENCHMARK"/>
 *     <enumeration value="INSTITUT"/>
 *     <enumeration value="BENCHMARKPERIOD"/>
 *     <enumeration value="CVAREINGABE"/>
 *     <enumeration value="ANSATZDGHYP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "RuepVariante")
@XmlEnum
public enum RuepVariante {


    /**
     * keine Berechnung der Risikoübernahmeprämie
     */
    NICHTDEFRUEPVARIANTE,

    /**
     * Eingabe eines Anteils aus einem Managemententscheid
     */
    EINGABE,

    /**
     * Eingabe der Parameter für ein Benchmarkportfolio
     */
    BENCHMARK,

    /**
     * Eingabe der Parameter für das Institutsportfolio
     */
    INSTITUT,
    BENCHMARKPERIOD,

    /**
     * Eingabe der marginalen Credit-Value-at-Risk
     */
    CVAREINGABE,

    /**
     * Dieser Ansatz ist nur mit kundenspezifischer Lizenz möglich. Erfordert die Eingabe
     * des Überverzinsungsanspruchs, den Anpassungsfaktor für Limitpuffer, eine q-Faktor Tabelle und
     * eine Dynamisierungstabelle.
     */
    ANSATZDGHYP;

    public String value() {
        return name();
    }

    public static RuepVariante fromValue(String v) {
        return valueOf(v);
    }

}
