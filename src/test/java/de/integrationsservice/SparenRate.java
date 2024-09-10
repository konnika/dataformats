
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * Der globale komplexe Typ Sparenrate enthält Ratenangaben für ein Sparengeschäft des Produkttyps
 * Bonussparplan, Sparbuch oder Auszahlplan.
 *
 * <p>Java class for SparenRate complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="SparenRate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ratenanzahl" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         <element name="ersteRate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ratenzahlungTag" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         <element name="ratenRhythmus" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *         <element name="dynBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="dynProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="dynStartdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="dynTag" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         <element name="dynRhythmus" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SparenRate", propOrder = {

})
public class SparenRate {

    /**
     * Ratenhöhe
     */
    protected Double rate;
    /**
     * Anzahl der Raten
     */
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ratenanzahl;
    /**
     * Datum der ersten Ratenzahlung
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ersteRate;
    /**
     * Tag an dem die Ratenzahlung stattfindet. Mögliche Auswahlen sind 1. des Monats, ..., 30. des
     * Monats und Ultimo.
     */
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ratenzahlungTag;
    /**
     * Ratenzahlungsrhythmus: monatlich, zweimonatlich, vierteljährlich, halbjährlich oder jährlich
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe ratenRhythmus;
    /**
     * Betrag für eine konstante Dynamisierung.
     */
    protected Double dynBetrag;
    /**
     * Prozentsatz für eine prozentuale Dynamisierung.
     */
    protected Double dynProzent;
    /**
     * Monat und Jahr der ersten Dynamisierung.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dynStartdatum;
    /**
     * Tag der ersten Dynamisierung
     */
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dynTag;
    /**
     * Anzahl Dynamisierungen pro Jahr.
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe dynRhythmus;

    /**
     * Ratenhöhe
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRate()
     */
    public void setRate(Double value) {
        this.rate = value;
    }

    /**
     * Anzahl der Raten
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getRatenanzahl() {
        return ratenanzahl;
    }

    /**
     * Sets the value of the ratenanzahl property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getRatenanzahl()
     */
    public void setRatenanzahl(BigInteger value) {
        this.ratenanzahl = value;
    }

    /**
     * Datum der ersten Ratenzahlung
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErsteRate() {
        return ersteRate;
    }

    /**
     * Sets the value of the ersteRate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErsteRate()
     */
    public void setErsteRate(XMLGregorianCalendar value) {
        this.ersteRate = value;
    }

    /**
     * Tag an dem die Ratenzahlung stattfindet. Mögliche Auswahlen sind 1. des Monats, ..., 30. des
     * Monats und Ultimo.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getRatenzahlungTag() {
        return ratenzahlungTag;
    }

    /**
     * Sets the value of the ratenzahlungTag property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getRatenzahlungTag()
     */
    public void setRatenzahlungTag(BigInteger value) {
        this.ratenzahlungTag = value;
    }

    /**
     * Ratenzahlungsrhythmus: monatlich, zweimonatlich, vierteljährlich, halbjährlich oder jährlich
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getRatenRhythmus() {
        return ratenRhythmus;
    }

    /**
     * Sets the value of the ratenRhythmus property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getRatenRhythmus()
     */
    public void setRatenRhythmus(Perannoangabe value) {
        this.ratenRhythmus = value;
    }

    /**
     * Betrag für eine konstante Dynamisierung.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDynBetrag() {
        return dynBetrag;
    }

    /**
     * Sets the value of the dynBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDynBetrag()
     */
    public void setDynBetrag(Double value) {
        this.dynBetrag = value;
    }

    /**
     * Prozentsatz für eine prozentuale Dynamisierung.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDynProzent() {
        return dynProzent;
    }

    /**
     * Sets the value of the dynProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDynProzent()
     */
    public void setDynProzent(Double value) {
        this.dynProzent = value;
    }

    /**
     * Monat und Jahr der ersten Dynamisierung.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDynStartdatum() {
        return dynStartdatum;
    }

    /**
     * Sets the value of the dynStartdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDynStartdatum()
     */
    public void setDynStartdatum(XMLGregorianCalendar value) {
        this.dynStartdatum = value;
    }

    /**
     * Tag der ersten Dynamisierung
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDynTag() {
        return dynTag;
    }

    /**
     * Sets the value of the dynTag property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getDynTag()
     */
    public void setDynTag(BigInteger value) {
        this.dynTag = value;
    }

    /**
     * Anzahl Dynamisierungen pro Jahr.
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getDynRhythmus() {
        return dynRhythmus;
    }

    /**
     * Sets the value of the dynRhythmus property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getDynRhythmus()
     */
    public void setDynRhythmus(Perannoangabe value) {
        this.dynRhythmus = value;
    }

}
