
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ApeSondertilgung complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ApeSondertilgung">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="frequenz" type="{http://www.gillardon.de/marzipan/integrationsservice}Rhythmus" minOccurs="0"/>
 *         <element name="frequenzAnzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="monatJahrErsteSoTi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="tagErsteSoTi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="tilgungsBetrag" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApeSondertilgung", propOrder = {

})
public class ApeSondertilgung {

    /**
     * Rhythmus, in dem weitere Sondertilgungen der gleichen Höhe vorgenommen werden sollen: einmalig;
     * monatlich; vierteljährlich; halbjährlich; jährlich;
     */
    @XmlSchemaType(name = "string")
    protected Rhythmus frequenz;
    /**
     * Anzahl der Sondertilgungen in der angegebenen Höhe und im entsprechenden Rhythmus.
     */
    protected int frequenzAnzahl;
    /**
     * Monat.Jahr des ersten Sondertilgungsrechts.
     * Das Feld wird als Datum abgespeichert, wobei der Tag ignoriert wird.
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar monatJahrErsteSoTi;
    /**
     * Tag, an dem das Sondertilgungsrecht ausgeuebt werden darf (1 - 31, Ultimo)
     */
    protected int tagErsteSoTi;
    /**
     * Höhe des Sondertilgungsrecht
     */
    protected double tilgungsBetrag;

    /**
     * Rhythmus, in dem weitere Sondertilgungen der gleichen Höhe vorgenommen werden sollen: einmalig;
     * monatlich; vierteljährlich; halbjährlich; jährlich;
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
     * Anzahl der Sondertilgungen in der angegebenen Höhe und im entsprechenden Rhythmus.
     */
    public int getFrequenzAnzahl() {
        return frequenzAnzahl;
    }

    /**
     * Sets the value of the frequenzAnzahl property.
     */
    public void setFrequenzAnzahl(int value) {
        this.frequenzAnzahl = value;
    }

    /**
     * Monat.Jahr des ersten Sondertilgungsrechts.
     * Das Feld wird als Datum abgespeichert, wobei der Tag ignoriert wird.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getMonatJahrErsteSoTi() {
        return monatJahrErsteSoTi;
    }

    /**
     * Sets the value of the monatJahrErsteSoTi property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getMonatJahrErsteSoTi()
     */
    public void setMonatJahrErsteSoTi(XMLGregorianCalendar value) {
        this.monatJahrErsteSoTi = value;
    }

    /**
     * Tag, an dem das Sondertilgungsrecht ausgeuebt werden darf (1 - 31, Ultimo)
     */
    public int getTagErsteSoTi() {
        return tagErsteSoTi;
    }

    /**
     * Sets the value of the tagErsteSoTi property.
     */
    public void setTagErsteSoTi(int value) {
        this.tagErsteSoTi = value;
    }

    /**
     * Höhe des Sondertilgungsrecht
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

}
