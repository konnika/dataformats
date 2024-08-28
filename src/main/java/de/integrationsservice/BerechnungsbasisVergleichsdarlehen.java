
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Berechnungsbasis für das zur Forward-Berechnung herangezogene Darlehen. Die Befüllung ist abhängig von
 * der Auswahl der Berechnungsbasis in der Grunddatenmaske.
 * Im Einzelnen: Nominalzins (angeboten bei Effektiv, Marge, Deckungsbeitrag); Margenbarwert (angeboten bei
 * Marge, Deckungsbeitrag); Marge in Prozent (angeboten bei Marge, Deckungsbeitrag);
 * BASIS_VGLDARLEHEN_NOMINAL BASIS_VGLDARLEHEN_MARGE_BARWERT BASIS_VGLDARLEHEN_MARGE_PROZENT
 * BASIS_VGLDARLEHEN_NETTOMARGE_BARWERT BASIS_VGLDARLEHEN_NETTOMARGE_PROZENT
 *
 * <p>Java class for BerechnungsbasisVergleichsdarlehen</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BerechnungsbasisVergleichsdarlehen">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BASIS_VGLDARLEHEN_NOMINAL"/>
 *     <enumeration value="BASIS_VGLDARLEHEN_MARGE_BARWERT"/>
 *     <enumeration value="BASIS_VGLDARLEHEN_MARGE_PROZENT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "BerechnungsbasisVergleichsdarlehen")
@XmlEnum
public enum BerechnungsbasisVergleichsdarlehen {

    BASIS_VGLDARLEHEN_NOMINAL,
    BASIS_VGLDARLEHEN_MARGE_BARWERT,
    BASIS_VGLDARLEHEN_MARGE_PROZENT;

    public String value() {
        return name();
    }

    public static BerechnungsbasisVergleichsdarlehen fromValue(String v) {
        return valueOf(v);
    }

}
