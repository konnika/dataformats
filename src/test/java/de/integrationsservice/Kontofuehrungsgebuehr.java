
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Regelungen für die Zahlung von
 * Kontoauszugspreisen
 *
 * <p>Java class for Kontofuehrungsgebuehr complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Kontofuehrungsgebuehr">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="anfangBerechnung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="effektivWirksam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ktoEffektivWirksamIcma" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ktoGebTag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="hoehe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="verrechnungSeparat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="zahlVerechnungenPA" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *         <element name="zahlungSeparatInFreiperiode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="dpErsteGebuehr" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="dpFolgend" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="darlehenspreis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="dpZahlungSeparatVor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="dpZahlungSeparatAb" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="dpEffektivWirksam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="dpEffektivWirksamIcma" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="dpZahlungsweise" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kontofuehrungsgebuehr", propOrder = {

})
public class Kontofuehrungsgebuehr {

    /**
     * Datum, an dem zum ersten Mal der Kontoauszugspreis fällig wird.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar anfangBerechnung;
    /**
     * Mittels dieses Schalters wird angegeben, ob der Kontoauszugspreis auch zur Ermittlung des
     * Effektivzinses gemäß PAngV mit herangezogen wird.
     */
    protected Boolean effektivWirksam;
    /**
     * Mittels dieses Schalters wird angegeben, ob der Darlehenspreis auch zur Ermittlung des
     * Effektivzinses gemäß ICMA mit herangezogen wird. Das hat insbesondere auch zur Folge, dass der
     * Kontoauszugspreis auch nicht in der Marge berücksichtigt wird.
     */
    protected Boolean ktoEffektivWirksamIcma;
    /**
     * Der Tag im Monat, an welchem der Kontoauszugspreis gezahlt wird.
     */
    protected Integer ktoGebTag;
    /**
     * Höhe des Kontoauszugspreises
     */
    protected Double hoehe;
    /**
     * Der Kontoauszugspreis ab Tilgungsbeginn wird wahlweise separat bezahlt oder mit Tilgungsraten
     * verrechnet, erscheint im Tilgungsplan und verändert nicht den Zinssaldo.
     */
    protected Boolean verrechnungSeparat;
    /**
     * Angabe, in welchen Abständen der Kontoauszugspreis fällig wird. Im Einzelnen: monatlich;
     * zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe zahlVerechnungenPA;
    /**
     * Der Kontoauszugspreis vor Tilgungsbeginn wird immer separat bezahlt, erscheint im Tilgungsplan
     * und verändert nicht den Zinssaldo.
     */
    protected Boolean zahlungSeparatInFreiperiode;
    /**
     * Datum, an dem zum ersten Mal der Darlehenspreis fällig wird.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dpErsteGebuehr;
    /**
     * Der Tag im Monat, an welchem der Darlehenspreis gezahlt wird.
     */
    protected Integer dpFolgend;
    /**
     * Höhe des Darlehenspreises
     */
    protected Double darlehenspreis;
    /**
     * Der Darlehenspreis vor Tilgungsbeginn wird immer separat bezahlt, erscheint im Tilgungsplan und
     * verändert nicht den Zinssaldo.
     */
    protected Boolean dpZahlungSeparatVor;
    /**
     * Der Darlehenspreis ab Tilgungsbeginn wird wahlweise separat bezahlt oder mit Tilgungsraten
     * verrechnet, erscheint im Tilgungsplan und verändert nicht den Zinssaldo.
     */
    protected Boolean dpZahlungSeparatAb;
    /**
     * Mittels dieses Schalters wird angegeben, ob der Darlehenspreis auch zur Ermittlung des
     * Effektivzinses gemäß PAngV mit herangezogen wird.
     */
    protected Boolean dpEffektivWirksam;
    /**
     * Mittels dieses Schalters wird angegeben, ob der Darlehenspreis auch zur Ermittlung des
     * Effektivzinses gemäß ICMA mit herangezogen wird. Das hat insbesondere auch zur Folge, dass der
     * Darlehenspreis auch nicht in der Marge berücksichtigt wird.
     */
    protected Boolean dpEffektivWirksamIcma;
    /**
     * Angabe, in welchen Abständen der Darlehenspreis fällig wird. Im Einzelnen: monatlich;
     * zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe dpZahlungsweise;

    /**
     * Datum, an dem zum ersten Mal der Kontoauszugspreis fällig wird.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAnfangBerechnung() {
        return anfangBerechnung;
    }

    /**
     * Sets the value of the anfangBerechnung property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAnfangBerechnung()
     */
    public void setAnfangBerechnung(XMLGregorianCalendar value) {
        this.anfangBerechnung = value;
    }

    /**
     * Mittels dieses Schalters wird angegeben, ob der Kontoauszugspreis auch zur Ermittlung des
     * Effektivzinses gemäß PAngV mit herangezogen wird.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isEffektivWirksam() {
        return effektivWirksam;
    }

    /**
     * Sets the value of the effektivWirksam property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isEffektivWirksam()
     */
    public void setEffektivWirksam(Boolean value) {
        this.effektivWirksam = value;
    }

    /**
     * Mittels dieses Schalters wird angegeben, ob der Darlehenspreis auch zur Ermittlung des
     * Effektivzinses gemäß ICMA mit herangezogen wird. Das hat insbesondere auch zur Folge, dass der
     * Kontoauszugspreis auch nicht in der Marge berücksichtigt wird.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isKtoEffektivWirksamIcma() {
        return ktoEffektivWirksamIcma;
    }

    /**
     * Sets the value of the ktoEffektivWirksamIcma property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isKtoEffektivWirksamIcma()
     */
    public void setKtoEffektivWirksamIcma(Boolean value) {
        this.ktoEffektivWirksamIcma = value;
    }

    /**
     * Der Tag im Monat, an welchem der Kontoauszugspreis gezahlt wird.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getKtoGebTag() {
        return ktoGebTag;
    }

    /**
     * Sets the value of the ktoGebTag property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getKtoGebTag()
     */
    public void setKtoGebTag(Integer value) {
        this.ktoGebTag = value;
    }

    /**
     * Höhe des Kontoauszugspreises
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getHoehe() {
        return hoehe;
    }

    /**
     * Sets the value of the hoehe property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getHoehe()
     */
    public void setHoehe(Double value) {
        this.hoehe = value;
    }

    /**
     * Der Kontoauszugspreis ab Tilgungsbeginn wird wahlweise separat bezahlt oder mit Tilgungsraten
     * verrechnet, erscheint im Tilgungsplan und verändert nicht den Zinssaldo.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVerrechnungSeparat() {
        return verrechnungSeparat;
    }

    /**
     * Sets the value of the verrechnungSeparat property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isVerrechnungSeparat()
     */
    public void setVerrechnungSeparat(Boolean value) {
        this.verrechnungSeparat = value;
    }

    /**
     * Angabe, in welchen Abständen der Kontoauszugspreis fällig wird. Im Einzelnen: monatlich;
     * zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getZahlVerechnungenPA() {
        return zahlVerechnungenPA;
    }

    /**
     * Sets the value of the zahlVerechnungenPA property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getZahlVerechnungenPA()
     */
    public void setZahlVerechnungenPA(Perannoangabe value) {
        this.zahlVerechnungenPA = value;
    }

    /**
     * Der Kontoauszugspreis vor Tilgungsbeginn wird immer separat bezahlt, erscheint im Tilgungsplan
     * und verändert nicht den Zinssaldo.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isZahlungSeparatInFreiperiode() {
        return zahlungSeparatInFreiperiode;
    }

    /**
     * Sets the value of the zahlungSeparatInFreiperiode property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isZahlungSeparatInFreiperiode()
     */
    public void setZahlungSeparatInFreiperiode(Boolean value) {
        this.zahlungSeparatInFreiperiode = value;
    }

    /**
     * Datum, an dem zum ersten Mal der Darlehenspreis fällig wird.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDpErsteGebuehr() {
        return dpErsteGebuehr;
    }

    /**
     * Sets the value of the dpErsteGebuehr property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDpErsteGebuehr()
     */
    public void setDpErsteGebuehr(XMLGregorianCalendar value) {
        this.dpErsteGebuehr = value;
    }

    /**
     * Der Tag im Monat, an welchem der Darlehenspreis gezahlt wird.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDpFolgend() {
        return dpFolgend;
    }

    /**
     * Sets the value of the dpFolgend property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getDpFolgend()
     */
    public void setDpFolgend(Integer value) {
        this.dpFolgend = value;
    }

    /**
     * Höhe des Darlehenspreises
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDarlehenspreis() {
        return darlehenspreis;
    }

    /**
     * Sets the value of the darlehenspreis property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDarlehenspreis()
     */
    public void setDarlehenspreis(Double value) {
        this.darlehenspreis = value;
    }

    /**
     * Der Darlehenspreis vor Tilgungsbeginn wird immer separat bezahlt, erscheint im Tilgungsplan und
     * verändert nicht den Zinssaldo.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDpZahlungSeparatVor() {
        return dpZahlungSeparatVor;
    }

    /**
     * Sets the value of the dpZahlungSeparatVor property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isDpZahlungSeparatVor()
     */
    public void setDpZahlungSeparatVor(Boolean value) {
        this.dpZahlungSeparatVor = value;
    }

    /**
     * Der Darlehenspreis ab Tilgungsbeginn wird wahlweise separat bezahlt oder mit Tilgungsraten
     * verrechnet, erscheint im Tilgungsplan und verändert nicht den Zinssaldo.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDpZahlungSeparatAb() {
        return dpZahlungSeparatAb;
    }

    /**
     * Sets the value of the dpZahlungSeparatAb property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isDpZahlungSeparatAb()
     */
    public void setDpZahlungSeparatAb(Boolean value) {
        this.dpZahlungSeparatAb = value;
    }

    /**
     * Mittels dieses Schalters wird angegeben, ob der Darlehenspreis auch zur Ermittlung des
     * Effektivzinses gemäß PAngV mit herangezogen wird.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDpEffektivWirksam() {
        return dpEffektivWirksam;
    }

    /**
     * Sets the value of the dpEffektivWirksam property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isDpEffektivWirksam()
     */
    public void setDpEffektivWirksam(Boolean value) {
        this.dpEffektivWirksam = value;
    }

    /**
     * Mittels dieses Schalters wird angegeben, ob der Darlehenspreis auch zur Ermittlung des
     * Effektivzinses gemäß ICMA mit herangezogen wird. Das hat insbesondere auch zur Folge, dass der
     * Darlehenspreis auch nicht in der Marge berücksichtigt wird.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDpEffektivWirksamIcma() {
        return dpEffektivWirksamIcma;
    }

    /**
     * Sets the value of the dpEffektivWirksamIcma property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isDpEffektivWirksamIcma()
     */
    public void setDpEffektivWirksamIcma(Boolean value) {
        this.dpEffektivWirksamIcma = value;
    }

    /**
     * Angabe, in welchen Abständen der Darlehenspreis fällig wird. Im Einzelnen: monatlich;
     * zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getDpZahlungsweise() {
        return dpZahlungsweise;
    }

    /**
     * Sets the value of the dpZahlungsweise property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getDpZahlungsweise()
     */
    public void setDpZahlungsweise(Perannoangabe value) {
        this.dpZahlungsweise = value;
    }

}
