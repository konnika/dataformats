
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KontoSicherheit complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="KontoSicherheit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="wert" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="prozentsatzRestschuld" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="wachstum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="befristung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="nominalwert" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="vorlasten" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bewertungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="sicherheitenart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="startdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="sicherungsrecht" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="verwertungserloes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="typObjektsicht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deckungsstockfaehig" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="realanteil" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="beleihungswert" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="wertNachAnderemWertansatz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KontoSicherheit", propOrder = {

})
public class KontoSicherheit {

    /**
     * Name der Sicherheit
     * Tabelle der Sicherheiten
     */
    protected String name;
    /**
     * Der aktuelle Wert der SicherheitWert der Sicherheit
     * Tabelle der Sicherheiten
     */
    protected Double wert;
    /**
     * Prozentsatz auf die Restschuld
     */
    protected Double prozentsatzRestschuld;
    /**
     * Die Eingabe eines Wertes > 0 bewirkt eine Erhöhung des Wertes der Sicherheit um den hier
     * angegebenen Prozentsatz mit der Folge, dass die Risikoprämie sinkt. Wird ein negativer Wert
     * eingegeben, sinkt der Wert der Sicherheit und die Risikoprämie steigt.
     * Tabelle der Sicherheiten
     */
    protected Double wachstum;
    /**
     * Termin, ab dem die Sicherheit nicht mehr zur Verfügung steht, z.B. wegen Wertverlust, Verkauf
     * Tabelle der Sicherheiten
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar befristung;
    /**
     * Nominaler Wert der Sicherheit
     */
    protected Double nominalwert;
    /**
     * Betrag der Vorlasten
     */
    protected Double vorlasten;
    /**
     * Bewertungsdatum der Sicherheit
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bewertungsdatum;
    /**
     * Kategorie der Sicherheit
     * Tabelle der Sicherheiten
     */
    protected String sicherheitenart;
    /**
     * Termin, ab dem die Sicherheit zur Verfügung steht (frühester Termin ist das Kalkulationsdatum
     * des Geschäfts)
     * Tabelle der Sicherheiten
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startdatum;
    /**
     * Sicherungsrecht
     */
    protected Double sicherungsrecht;
    /**
     * Verwertungserloes
     */
    protected Double verwertungserloes;
    /**
     * Typ der Objektsicht
     */
    protected String typObjektsicht;
    /**
     * Deckungsstockfaehigkeit
     */
    protected Boolean deckungsstockfaehig;
    /**
     * Realanteil
     */
    protected Double realanteil;
    /**
     * Beleihungwert
     */
    protected Double beleihungswert;
    /**
     * Wert nach anderem Wertansatz
     */
    protected Double wertNachAnderemWertansatz;

    /**
     * Name der Sicherheit
     * Tabelle der Sicherheiten
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
     * Der aktuelle Wert der SicherheitWert der Sicherheit
     * Tabelle der Sicherheiten
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getWert()
     */
    public void setWert(Double value) {
        this.wert = value;
    }

    /**
     * Prozentsatz auf die Restschuld
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getProzentsatzRestschuld() {
        return prozentsatzRestschuld;
    }

    /**
     * Sets the value of the prozentsatzRestschuld property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getProzentsatzRestschuld()
     */
    public void setProzentsatzRestschuld(Double value) {
        this.prozentsatzRestschuld = value;
    }

    /**
     * Die Eingabe eines Wertes > 0 bewirkt eine Erhöhung des Wertes der Sicherheit um den hier
     * angegebenen Prozentsatz mit der Folge, dass die Risikoprämie sinkt. Wird ein negativer Wert
     * eingegeben, sinkt der Wert der Sicherheit und die Risikoprämie steigt.
     * Tabelle der Sicherheiten
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getWachstum() {
        return wachstum;
    }

    /**
     * Sets the value of the wachstum property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getWachstum()
     */
    public void setWachstum(Double value) {
        this.wachstum = value;
    }

    /**
     * Termin, ab dem die Sicherheit nicht mehr zur Verfügung steht, z.B. wegen Wertverlust, Verkauf
     * Tabelle der Sicherheiten
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getBefristung() {
        return befristung;
    }

    /**
     * Sets the value of the befristung property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getBefristung()
     */
    public void setBefristung(XMLGregorianCalendar value) {
        this.befristung = value;
    }

    /**
     * Nominaler Wert der Sicherheit
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNominalwert() {
        return nominalwert;
    }

    /**
     * Sets the value of the nominalwert property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNominalwert()
     */
    public void setNominalwert(Double value) {
        this.nominalwert = value;
    }

    /**
     * Betrag der Vorlasten
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVorlasten() {
        return vorlasten;
    }

    /**
     * Sets the value of the vorlasten property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVorlasten()
     */
    public void setVorlasten(Double value) {
        this.vorlasten = value;
    }

    /**
     * Bewertungsdatum der Sicherheit
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getBewertungsdatum() {
        return bewertungsdatum;
    }

    /**
     * Sets the value of the bewertungsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getBewertungsdatum()
     */
    public void setBewertungsdatum(XMLGregorianCalendar value) {
        this.bewertungsdatum = value;
    }

    /**
     * Kategorie der Sicherheit
     * Tabelle der Sicherheiten
     *
     * @return possible object is
     * {@link String }
     */
    public String getSicherheitenart() {
        return sicherheitenart;
    }

    /**
     * Sets the value of the sicherheitenart property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getSicherheitenart()
     */
    public void setSicherheitenart(String value) {
        this.sicherheitenart = value;
    }

    /**
     * Termin, ab dem die Sicherheit zur Verfügung steht (frühester Termin ist das Kalkulationsdatum
     * des Geschäfts)
     * Tabelle der Sicherheiten
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStartdatum() {
        return startdatum;
    }

    /**
     * Sets the value of the startdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getStartdatum()
     */
    public void setStartdatum(XMLGregorianCalendar value) {
        this.startdatum = value;
    }

    /**
     * Sicherungsrecht
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSicherungsrecht() {
        return sicherungsrecht;
    }

    /**
     * Sets the value of the sicherungsrecht property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSicherungsrecht()
     */
    public void setSicherungsrecht(Double value) {
        this.sicherungsrecht = value;
    }

    /**
     * Verwertungserloes
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVerwertungserloes() {
        return verwertungserloes;
    }

    /**
     * Sets the value of the verwertungserloes property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVerwertungserloes()
     */
    public void setVerwertungserloes(Double value) {
        this.verwertungserloes = value;
    }

    /**
     * Typ der Objektsicht
     *
     * @return possible object is
     * {@link String }
     */
    public String getTypObjektsicht() {
        return typObjektsicht;
    }

    /**
     * Sets the value of the typObjektsicht property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTypObjektsicht()
     */
    public void setTypObjektsicht(String value) {
        this.typObjektsicht = value;
    }

    /**
     * Deckungsstockfaehigkeit
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDeckungsstockfaehig() {
        return deckungsstockfaehig;
    }

    /**
     * Sets the value of the deckungsstockfaehig property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isDeckungsstockfaehig()
     */
    public void setDeckungsstockfaehig(Boolean value) {
        this.deckungsstockfaehig = value;
    }

    /**
     * Realanteil
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRealanteil() {
        return realanteil;
    }

    /**
     * Sets the value of the realanteil property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRealanteil()
     */
    public void setRealanteil(Double value) {
        this.realanteil = value;
    }

    /**
     * Beleihungwert
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBeleihungswert() {
        return beleihungswert;
    }

    /**
     * Sets the value of the beleihungswert property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBeleihungswert()
     */
    public void setBeleihungswert(Double value) {
        this.beleihungswert = value;
    }

    /**
     * Wert nach anderem Wertansatz
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getWertNachAnderemWertansatz() {
        return wertNachAnderemWertansatz;
    }

    /**
     * Sets the value of the wertNachAnderemWertansatz property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getWertNachAnderemWertansatz()
     */
    public void setWertNachAnderemWertansatz(Double value) {
        this.wertNachAnderemWertansatz = value;
    }

}
