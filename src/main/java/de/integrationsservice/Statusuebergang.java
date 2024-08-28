
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;


/**
 * Das Statusuebergang-Tag wird vom externen System verwendet, um ein Geschäft in einen anderen Freigabestatus zu versetzen.
 *
 * <p>Java class for Statusuebergang complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Statusuebergang">
 *   <complexContent>
 *     <extension base="{http://www.gillardon.de/marzipan/integrationsservice}Logindaten">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="aktion" type="{http://www.gillardon.de/marzipan/integrationsservice}aktion"/>
 *         <element name="meldenMoeglichBis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}ZusaetzlicheErgebnisse" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statusuebergang", propOrder = {
        "name",
        "aktion",
        "meldenMoeglichBis",
        "zusaetzlicheErgebnisse"
})
public class Statusuebergang
        extends Logindaten {

    /**
     * Name des Geschäfts (Geschäfts-ID), für das der Statusübergang durchgeführt werden soll.
     */
    @XmlElement(required = true)
    protected String name;
    /**
     * Gibt die Aktion (d.h. den Statusübergang) an, welche durchgeführt werden soll.
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Aktion aktion;
    /**
     * Dauer in Minuten, bis ein geprüftes Geschäft gemeldet werden muss.
     * Dieses Element wird nur beim Prüfen von Kredit-Geschäften benötigt (in allen anderen Fällen ignoriert).
     */
    protected Integer meldenMoeglichBis;
    /**
     * Gibt an, welche zusätzlichen Ergebnisse im Ergebnis mitgeliefert werden sollen.
     * Beim Statusübergang von Sparen-Geschäften wird dieses Element ignoriert.
     * Hier können keine Cashflows, Abgrenzungspläne und Kontopläne mitgeliefert werden.
     */
    @XmlElement(name = "ZusaetzlicheErgebnisse")
    protected ZusaetzlicheErgebnisse zusaetzlicheErgebnisse;

    /**
     * Name des Geschäfts (Geschäfts-ID), für das der Statusübergang durchgeführt werden soll.
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
     * Gibt die Aktion (d.h. den Statusübergang) an, welche durchgeführt werden soll.
     *
     * @return possible object is
     * {@link Aktion }
     */
    public Aktion getAktion() {
        return aktion;
    }

    /**
     * Sets the value of the aktion property.
     *
     * @param value allowed object is
     *              {@link Aktion }
     * @see #getAktion()
     */
    public void setAktion(Aktion value) {
        this.aktion = value;
    }

    /**
     * Dauer in Minuten, bis ein geprüftes Geschäft gemeldet werden muss.
     * Dieses Element wird nur beim Prüfen von Kredit-Geschäften benötigt (in allen anderen Fällen ignoriert).
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getMeldenMoeglichBis() {
        return meldenMoeglichBis;
    }

    /**
     * Sets the value of the meldenMoeglichBis property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getMeldenMoeglichBis()
     */
    public void setMeldenMoeglichBis(Integer value) {
        this.meldenMoeglichBis = value;
    }

    /**
     * Gibt an, welche zusätzlichen Ergebnisse im Ergebnis mitgeliefert werden sollen.
     * Beim Statusübergang von Sparen-Geschäften wird dieses Element ignoriert.
     * Hier können keine Cashflows, Abgrenzungspläne und Kontopläne mitgeliefert werden.
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
