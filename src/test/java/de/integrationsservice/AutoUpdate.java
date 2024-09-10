
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Das AutoUpdate-Tag wird vom externen System verwendet (nur per Webservice),
 * um ein bestehendes Kreditgeschäft in der MARZIPAN-Datenbank, im Status Erstellt, zu aktualisieren.
 * Als Antwort wird ein Ergebnis-Element geliefert, welches das gespeicherte Geschäft enthält,
 * oder, falls ein Fehler aufgetreten ist, eine entsprechende Fehlermeldung.
 *
 * <p>Java class for AutoUpdate complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AutoUpdate">
 *   <complexContent>
 *     <extension base="{http://www.gillardon.de/marzipan/integrationsservice}Logindaten">
 *       <sequence>
 *         <element name="berechnungsrichtung" type="{http://www.gillardon.de/marzipan/integrationsservice}Berechnungsrichtung" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Kreditgeschaeft"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}ZusaetzlicheErgebnisse" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoUpdate", propOrder = {
        "berechnungsrichtung",
        "kreditgeschaeft",
        "zusaetzlicheErgebnisse"
})
public class AutoUpdate
        extends Logindaten {

    /**
     * Gewünschte Art der Berechnung ("Vorwärtsrechnung", "Berechnung auf Nominalzins" usw.).
     * Falls nichts übergeben wird, wird eine Vorwärtsrechnung entsprechend der eingestellten Berechnungsbasis durchgeführt.
     */
    @XmlSchemaType(name = "string")
    protected Berechnungsrichtung berechnungsrichtung;
    @XmlElement(name = "Kreditgeschaeft", required = true)
    protected Kreditgeschaeft kreditgeschaeft;
    /**
     * Gibt an, welche zusätzlichen Ergebnisse im Ergebnis mitgeliefert werden sollen.
     */
    @XmlElement(name = "ZusaetzlicheErgebnisse")
    protected ZusaetzlicheErgebnisse zusaetzlicheErgebnisse;

    /**
     * Gewünschte Art der Berechnung ("Vorwärtsrechnung", "Berechnung auf Nominalzins" usw.).
     * Falls nichts übergeben wird, wird eine Vorwärtsrechnung entsprechend der eingestellten Berechnungsbasis durchgeführt.
     *
     * @return possible object is
     * {@link Berechnungsrichtung }
     */
    public Berechnungsrichtung getBerechnungsrichtung() {
        return berechnungsrichtung;
    }

    /**
     * Sets the value of the berechnungsrichtung property.
     *
     * @param value allowed object is
     *              {@link Berechnungsrichtung }
     * @see #getBerechnungsrichtung()
     */
    public void setBerechnungsrichtung(Berechnungsrichtung value) {
        this.berechnungsrichtung = value;
    }

    /**
     * Gets the value of the kreditgeschaeft property.
     *
     * @return possible object is
     * {@link Kreditgeschaeft }
     */
    public Kreditgeschaeft getKreditgeschaeft() {
        return kreditgeschaeft;
    }

    /**
     * Sets the value of the kreditgeschaeft property.
     *
     * @param value allowed object is
     *              {@link Kreditgeschaeft }
     */
    public void setKreditgeschaeft(Kreditgeschaeft value) {
        this.kreditgeschaeft = value;
    }

    /**
     * Gibt an, welche zusätzlichen Ergebnisse im Ergebnis mitgeliefert werden sollen.
     *
     * @return possible object is
     * {@link ZusaetzlicheErgebnisse }
     */
    public ZusaetzlicheErgebnisse getZusaetzlicheErgebnisse() {
        return zusaetzlicheErgebnisse;
    }

    /**
     * Sets the value of the zusaetzlicheErgebnisse property.
     *
     * @param value allowed object is
     *              {@link ZusaetzlicheErgebnisse }
     * @see #getZusaetzlicheErgebnisse()
     */
    public void setZusaetzlicheErgebnisse(ZusaetzlicheErgebnisse value) {
        this.zusaetzlicheErgebnisse = value;
    }

}
