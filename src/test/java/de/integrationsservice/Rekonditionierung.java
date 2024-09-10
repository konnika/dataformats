
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Das Rekonditionierung-Tag wird vom externen System verwendet, um neue Konditionen eines Kreditgeschäfts einzustellen.
 * Die Identifikation des neu zu konditionierenden Geschäfts erfolgt über seine Geschäfts-ID.
 * Dabei wird das in der Anforderung enthaltene Geschäft im Status "Erstellt" in die Datenbank geschrieben.
 * Das bisher vorhandene Geschäft wird als Vorgänger des aktuellen Geschäfts eingetragen.
 * Das neue Geschäft wird als Nachfolger des bisher vorhandenen Geschäfts eingetragen.
 * Eine Rekonditionierung ist nur für freigegebene Darlehen möglich.
 *
 * <p>Java class for Rekonditionierung complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Rekonditionierung">
 *   <complexContent>
 *     <extension base="{http://www.gillardon.de/marzipan/integrationsservice}Logindaten">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Rekonditionierung", propOrder = {
        "name",
        "berechnungsrichtung",
        "kreditgeschaeft",
        "zusaetzlicheErgebnisse"
})
public class Rekonditionierung
        extends Logindaten {

    /**
     * Name des Darlehens (Geschäfts-ID), für das die Rekonditionierung durchgeführt werden soll.
     */
    @XmlElement(required = true)
    protected String name;
    /**
     * Gewünschte Art der Berechnung ("Vorwärtsrechnung", "Berechnung auf Nominalzins" usw.) für das neue Geschäft.
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
     * Name des Darlehens (Geschäfts-ID), für das die Rekonditionierung durchgeführt werden soll.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gewünschte Art der Berechnung ("Vorwärtsrechnung", "Berechnung auf Nominalzins" usw.) für das neue Geschäft.
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
