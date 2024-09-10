
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Ratenstufe complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Ratenstufe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="aktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ausfuehrungsDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="frequenz" type="{http://www.gillardon.de/marzipan/integrationsservice}Rhythmus" minOccurs="0"/>
 *         <element name="frequenzAnzahl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ratenHoehe" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="rateTag" type="{http://www.gillardon.de/marzipan/integrationsservice}UltimoTagEnum" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ratenstufe", propOrder = {

})
public class Ratenstufe {

    /**
     * Steuert, ob die Rate bei der Berechnung berücksichtigt werden soll
     */
    protected Boolean aktiv;
    /**
     * Datum der ersten Ausführung einer Rate
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ausfuehrungsDatum;
    /**
     * Häufigkeit, im welchem die Rate ausgeübt werden dürfen
     * siehe Struktur Rhythmus
     */
    @XmlSchemaType(name = "string")
    protected Rhythmus frequenz;
    /**
     * Anzahl der Raten
     */
    protected Integer frequenzAnzahl;
    /**
     * Hoehe der Rate
     */
    protected double ratenHoehe;
    /**
     * Periodentag der Rate
     * siehe Struktur UltimoTagEnum
     */
    @XmlSchemaType(name = "string")
    protected UltimoTagEnum rateTag;

    /**
     * Steuert, ob die Rate bei der Berechnung berücksichtigt werden soll
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

    /**
     * Datum der ersten Ausführung einer Rate
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
     * Häufigkeit, im welchem die Rate ausgeübt werden dürfen
     * siehe Struktur Rhythmus
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
     * Anzahl der Raten
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
     * Hoehe der Rate
     */
    public double getRatenHoehe() {
        return ratenHoehe;
    }

    /**
     * Sets the value of the ratenHoehe property.
     */
    public void setRatenHoehe(double value) {
        this.ratenHoehe = value;
    }

    /**
     * Periodentag der Rate
     * siehe Struktur UltimoTagEnum
     *
     * @return possible object is
     * {@link UltimoTagEnum }
     */
    public UltimoTagEnum getRateTag() {
        return rateTag;
    }

    /**
     * Sets the value of the rateTag property.
     *
     * @param value allowed object is
     *              {@link UltimoTagEnum }
     * @see #getRateTag()
     */
    public void setRateTag(UltimoTagEnum value) {
        this.rateTag = value;
    }

}
