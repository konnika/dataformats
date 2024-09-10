
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Zinsanpassungstermin complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Zinsanpassungstermin">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="terminUnverschoben" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="fixingdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="zinsProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="marginProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margeProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nominalzins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="referenzzinsID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="referenzzinsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="referenzzinsLaufzeit" type="{http://www.gillardon.de/marzipan/integrationsservice}ReferenzzinsLaufzeit" minOccurs="0"/>
 *         <element name="referenzzinsProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="referenzzinsManuell" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="marginAnpassen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="effektivzinsProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="restkapital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zinsanpassungstermin", propOrder = {

})
public class Zinsanpassungstermin {

    /**
     * Auszahlungsdatum bzw. letztes Zinsanpassungsdatum
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    /**
     * Unverschobenes Termin ab dem der Zins gilt.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminUnverschoben;
    /**
     * Termine, an denen ein Fixing durchzuführen ist beziehungsweise durchgeführt wurde
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fixingdatum;
    /**
     * Referenzzins in %
     */
    protected Double zinsProzent;
    /**
     * Aufschlag auf den Referenzzinssatz
     */
    protected Double marginProzent;
    /**
     * Marge bis Zinsbindungsende in %
     */
    protected Double margeProzent;
    /**
     * Nominalzins = Referrenzzins + Aufschlag extern
     */
    protected Double nominalzins;
    /**
     * Aktueller Referenzzins
     */
    protected Integer referenzzinsID;
    /**
     * Zugrunde gelegter Referenzzins
     */
    protected String referenzzinsName;
    /**
     * Laufzeit des verwendeten Referenzzinses.
     * siehe Struktur ReferenzzinsLaufzeit
     */
    @XmlSchemaType(name = "string")
    protected ReferenzzinsLaufzeit referenzzinsLaufzeit;
    /**
     * Am Fixingtermin gültiger Referenzzinssatz zum Referenzzins
     */
    protected Double referenzzinsProzent;
    /**
     * Wurde der Referenzzins in der Zinsanpassungstabelle manuell vorgegeben?
     * Erweiterung für DEZIMA
     */
    protected Boolean referenzzinsManuell;
    /**
     * Flag, ob der Aufschlag bei der Rückrechnung angepasst werden darf
     * Fixing von Roll-Over wurde ausgebaut, Feld kann entfallen
     */
    protected Boolean marginAnpassen;
    /**
     * Effektivzins in %
     * Feld soll entfallen!
     */
    protected Double effektivzinsProzent;
    /**
     * Restkapital
     * Feld soll entfallen!
     */
    protected Double restkapital;

    /**
     * Auszahlungsdatum bzw. letztes Zinsanpassungsdatum
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatum()
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Unverschobenes Termin ab dem der Zins gilt.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTerminUnverschoben() {
        return terminUnverschoben;
    }

    /**
     * Sets the value of the terminUnverschoben property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getTerminUnverschoben()
     */
    public void setTerminUnverschoben(XMLGregorianCalendar value) {
        this.terminUnverschoben = value;
    }

    /**
     * Termine, an denen ein Fixing durchzuführen ist beziehungsweise durchgeführt wurde
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFixingdatum() {
        return fixingdatum;
    }

    /**
     * Sets the value of the fixingdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getFixingdatum()
     */
    public void setFixingdatum(XMLGregorianCalendar value) {
        this.fixingdatum = value;
    }

    /**
     * Referenzzins in %
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinsProzent() {
        return zinsProzent;
    }

    /**
     * Sets the value of the zinsProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinsProzent()
     */
    public void setZinsProzent(Double value) {
        this.zinsProzent = value;
    }

    /**
     * Aufschlag auf den Referenzzinssatz
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMarginProzent() {
        return marginProzent;
    }

    /**
     * Sets the value of the marginProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMarginProzent()
     */
    public void setMarginProzent(Double value) {
        this.marginProzent = value;
    }

    /**
     * Marge bis Zinsbindungsende in %
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargeProzent() {
        return margeProzent;
    }

    /**
     * Sets the value of the margeProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargeProzent()
     */
    public void setMargeProzent(Double value) {
        this.margeProzent = value;
    }

    /**
     * Nominalzins = Referrenzzins + Aufschlag extern
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNominalzins() {
        return nominalzins;
    }

    /**
     * Sets the value of the nominalzins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNominalzins()
     */
    public void setNominalzins(Double value) {
        this.nominalzins = value;
    }

    /**
     * Aktueller Referenzzins
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getReferenzzinsID() {
        return referenzzinsID;
    }

    /**
     * Sets the value of the referenzzinsID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getReferenzzinsID()
     */
    public void setReferenzzinsID(Integer value) {
        this.referenzzinsID = value;
    }

    /**
     * Zugrunde gelegter Referenzzins
     *
     * @return possible object is
     * {@link String }
     */
    public String getReferenzzinsName() {
        return referenzzinsName;
    }

    /**
     * Sets the value of the referenzzinsName property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getReferenzzinsName()
     */
    public void setReferenzzinsName(String value) {
        this.referenzzinsName = value;
    }

    /**
     * Laufzeit des verwendeten Referenzzinses.
     * siehe Struktur ReferenzzinsLaufzeit
     *
     * @return possible object is
     * {@link ReferenzzinsLaufzeit }
     */
    public ReferenzzinsLaufzeit getReferenzzinsLaufzeit() {
        return referenzzinsLaufzeit;
    }

    /**
     * Sets the value of the referenzzinsLaufzeit property.
     *
     * @param value allowed object is
     *              {@link ReferenzzinsLaufzeit }
     * @see #getReferenzzinsLaufzeit()
     */
    public void setReferenzzinsLaufzeit(ReferenzzinsLaufzeit value) {
        this.referenzzinsLaufzeit = value;
    }

    /**
     * Am Fixingtermin gültiger Referenzzinssatz zum Referenzzins
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getReferenzzinsProzent() {
        return referenzzinsProzent;
    }

    /**
     * Sets the value of the referenzzinsProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getReferenzzinsProzent()
     */
    public void setReferenzzinsProzent(Double value) {
        this.referenzzinsProzent = value;
    }

    /**
     * Wurde der Referenzzins in der Zinsanpassungstabelle manuell vorgegeben?
     * Erweiterung für DEZIMA
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReferenzzinsManuell() {
        return referenzzinsManuell;
    }

    /**
     * Sets the value of the referenzzinsManuell property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isReferenzzinsManuell()
     */
    public void setReferenzzinsManuell(Boolean value) {
        this.referenzzinsManuell = value;
    }

    /**
     * Flag, ob der Aufschlag bei der Rückrechnung angepasst werden darf
     * Fixing von Roll-Over wurde ausgebaut, Feld kann entfallen
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMarginAnpassen() {
        return marginAnpassen;
    }

    /**
     * Sets the value of the marginAnpassen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMarginAnpassen()
     */
    public void setMarginAnpassen(Boolean value) {
        this.marginAnpassen = value;
    }

    /**
     * Effektivzins in %
     * Feld soll entfallen!
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEffektivzinsProzent() {
        return effektivzinsProzent;
    }

    /**
     * Sets the value of the effektivzinsProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEffektivzinsProzent()
     */
    public void setEffektivzinsProzent(Double value) {
        this.effektivzinsProzent = value;
    }

    /**
     * Restkapital
     * Feld soll entfallen!
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRestkapital() {
        return restkapital;
    }

    /**
     * Sets the value of the restkapital property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRestkapital()
     */
    public void setRestkapital(Double value) {
        this.restkapital = value;
    }

}
