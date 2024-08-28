
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Raten, die mit Vorgabe von Datum, Frequenz und Anzahl verarbeitet werden.
 * Wird für Tilgungsraten im Universaldarlehen und für Sondertilgungen benutzt.
 * TILGUNGSRATEN WERDEN AKTUELL NOCH NICHT IN MARZIPAN WEB UNTERSTÜTZT.
 *
 * <p>Java class for TilgungZeile complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="TilgungZeile">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="ausfuehrungsDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="frequenz" type="{http://www.gillardon.de/marzipan/integrationsservice}Rhythmus" minOccurs="0"/>
 *         <element name="frequenzAnzahl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="tilgungsBetrag" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="sondertilgungTag" type="{http://www.gillardon.de/marzipan/integrationsservice}UltimoTagEnum" minOccurs="0"/>
 *         <element name="aktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TilgungZeile", propOrder = {

})
public class TilgungZeile {

    /**
     * Datum der ersten Ausführung einer Tilgung
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ausfuehrungsDatum;
    /**
     * Anzahl Zahlungen pro Jahr.
     * siehe Struktur Perannoangabe
     */
    @XmlSchemaType(name = "string")
    protected Rhythmus frequenz;
    /**
     * Anzahl Ausführungen
     */
    protected Integer frequenzAnzahl;
    /**
     * Höhe der Tilgung
     */
    protected double tilgungsBetrag;
    /**
     * Periodentag der Tilgung
     */
    @XmlSchemaType(name = "string")
    protected UltimoTagEnum sondertilgungTag;
    /**
     * Steuert, ob die Sondertilgung bei der Berechnung berücksichtigt werden soll
     */
    protected Boolean aktiv;

    /**
     * Datum der ersten Ausführung einer Tilgung
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAusfuehrungsDatum() {
        return ausfuehrungsDatum;
    }

    /**
     * Sets the value of the ausfuehrungsDatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAusfuehrungsDatum()
     */
    public void setAusfuehrungsDatum(XMLGregorianCalendar value) {
        this.ausfuehrungsDatum = value;
    }

    /**
     * Anzahl Zahlungen pro Jahr.
     * siehe Struktur Perannoangabe
     *
     * @return possible object is
     * {@link Rhythmus }
     */
    public Rhythmus getFrequenz() {
        return frequenz;
    }

    /**
     * Sets the value of the frequenz property.
     *
     * @param value allowed object is
     *              {@link Rhythmus }
     * @see #getFrequenz()
     */
    public void setFrequenz(Rhythmus value) {
        this.frequenz = value;
    }

    /**
     * Anzahl Ausführungen
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getFrequenzAnzahl() {
        return frequenzAnzahl;
    }

    /**
     * Sets the value of the frequenzAnzahl property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getFrequenzAnzahl()
     */
    public void setFrequenzAnzahl(Integer value) {
        this.frequenzAnzahl = value;
    }

    /**
     * Höhe der Tilgung
     */
    public double getTilgungsBetrag() {
        return tilgungsBetrag;
    }

    /**
     * Sets the value of the tilgungsBetrag property.
     */
    public void setTilgungsBetrag(double value) {
        this.tilgungsBetrag = value;
    }

    /**
     * Periodentag der Tilgung
     *
     * @return possible object is
     * {@link UltimoTagEnum }
     */
    public UltimoTagEnum getSondertilgungTag() {
        return sondertilgungTag;
    }

    /**
     * Sets the value of the sondertilgungTag property.
     *
     * @param value allowed object is
     *              {@link UltimoTagEnum }
     * @see #getSondertilgungTag()
     */
    public void setSondertilgungTag(UltimoTagEnum value) {
        this.sondertilgungTag = value;
    }

    /**
     * Steuert, ob die Sondertilgung bei der Berechnung berücksichtigt werden soll
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAktiv() {
        return aktiv;
    }

    /**
     * Sets the value of the aktiv property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isAktiv()
     */
    public void setAktiv(Boolean value) {
        this.aktiv = value;
    }

}
