
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Das Ratingszenario bzw. der Ratingsystemparameter-Satz besteht aus einigen Kopfdaten, zugehöriger
 * Ratingkonfiguration/Ratingsystem und einer Liste von Ausfallwahrscheinlichkeiten bzw. einer
 * Migrationsmatrix.
 *
 * <p>Java class for Ratingszenario complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Ratingszenario">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gueltigkeitsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="feinheitZeit" type="{http://www.gillardon.de/marzipan/integrationsservice}Feinheitzeit" minOccurs="0"/>
 *         <element name="freigabestatus" type="{http://www.gillardon.de/marzipan/integrationsservice}Freigabestatus" minOccurs="0"/>
 *         <element name="ratingkonfiguration" type="{http://www.gillardon.de/marzipan/integrationsservice}Ratingkonfiguration"/>
 *         <element name="migrationswahrscheinlichkeiten" type="{http://www.gillardon.de/marzipan/integrationsservice}Migrationswahrscheinlichkeiten" minOccurs="0"/>
 *         <element name="ausfallwahrscheinlichkeiten" type="{http://www.gillardon.de/marzipan/integrationsservice}Ausfallwahrscheinlichkeiten" minOccurs="0"/>
 *         <element name="aufsichtsrechtlicheausfallwkten" type="{http://www.gillardon.de/marzipan/integrationsservice}SzenarioWktenPds" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ratingszenario", propOrder = {

})
public class Ratingszenario {

    /**
     * Name des Ratingszenarios
     */
    protected String name;
    /**
     * Kommentar des Ratingszenarios
     */
    protected String kommentar;
    /**
     * Erstellungsdatum des Ratingszenarios
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erstellungsdatum;
    /**
     * Ersteller des Ratingszenarios
     */
    protected String ersteller;
    /**
     * Gueltigkeitsdatum des Ratingszenarios.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gueltigkeitsdatum;
    /**
     * Der Feinheit des Zeitrasters des Ratingszenarios.
     */
    @XmlSchemaType(name = "string")
    protected Feinheitzeit feinheitZeit;
    /**
     * Freigabestatus des Ratingszenarios
     */
    @XmlSchemaType(name = "string")
    protected Freigabestatus freigabestatus;
    /**
     * Die zugrundliegende Ratingkonfiguration des Ratingszenarios; die Basis eines Ratingszenarios ist
     * immer eine Ratingkonfiguration mit Ratingklassen
     */
    @XmlElement(required = true)
    protected Ratingkonfiguration ratingkonfiguration;
    /**
     * Liste mit Migrationswahrscheinlichkeiten der Ratingklassen.
     */
    protected Migrationswahrscheinlichkeiten migrationswahrscheinlichkeiten;
    /**
     * Liste mit Ausfallwahrscheinlichkeiten der Ratingklassen in Prozent je Laufzeit.
     */
    protected Ausfallwahrscheinlichkeiten ausfallwahrscheinlichkeiten;
    /**
     * Aufsichtsrechtliche 1-Jahres-Ausfallwahrscheinlichkeiten der Ratingklassen
     */
    protected SzenarioWktenPds aufsichtsrechtlicheausfallwkten;

    /**
     * Name des Ratingszenarios
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
     * Kommentar des Ratingszenarios
     *
     * @return possible object is
     * {@link String }
     */
    public String getKommentar() {
        return kommentar;
    }

    /**
     * Sets the value of the kommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKommentar()
     */
    public void setKommentar(String value) {
        this.kommentar = value;
    }

    /**
     * Erstellungsdatum des Ratingszenarios
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErstellungsdatum() {
        return erstellungsdatum;
    }

    /**
     * Sets the value of the erstellungsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErstellungsdatum()
     */
    public void setErstellungsdatum(XMLGregorianCalendar value) {
        this.erstellungsdatum = value;
    }

    /**
     * Ersteller des Ratingszenarios
     *
     * @return possible object is
     * {@link String }
     */
    public String getErsteller() {
        return ersteller;
    }

    /**
     * Sets the value of the ersteller property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getErsteller()
     */
    public void setErsteller(String value) {
        this.ersteller = value;
    }

    /**
     * Gueltigkeitsdatum des Ratingszenarios.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getGueltigkeitsdatum() {
        return gueltigkeitsdatum;
    }

    /**
     * Sets the value of the gueltigkeitsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getGueltigkeitsdatum()
     */
    public void setGueltigkeitsdatum(XMLGregorianCalendar value) {
        this.gueltigkeitsdatum = value;
    }

    /**
     * Der Feinheit des Zeitrasters des Ratingszenarios.
     *
     * @return possible object is
     * {@link Feinheitzeit }
     */
    public Feinheitzeit getFeinheitZeit() {
        return feinheitZeit;
    }

    /**
     * Sets the value of the feinheitZeit property.
     *
     * @param value allowed object is
     *              {@link Feinheitzeit }
     * @see #getFeinheitZeit()
     */
    public void setFeinheitZeit(Feinheitzeit value) {
        this.feinheitZeit = value;
    }

    /**
     * Freigabestatus des Ratingszenarios
     *
     * @return possible object is
     * {@link Freigabestatus }
     */
    public Freigabestatus getFreigabestatus() {
        return freigabestatus;
    }

    /**
     * Sets the value of the freigabestatus property.
     *
     * @param value allowed object is
     *              {@link Freigabestatus }
     * @see #getFreigabestatus()
     */
    public void setFreigabestatus(Freigabestatus value) {
        this.freigabestatus = value;
    }

    /**
     * Die zugrundliegende Ratingkonfiguration des Ratingszenarios; die Basis eines Ratingszenarios ist
     * immer eine Ratingkonfiguration mit Ratingklassen
     *
     * @return possible object is
     * {@link Ratingkonfiguration }
     */
    public Ratingkonfiguration getRatingkonfiguration() {
        return ratingkonfiguration;
    }

    /**
     * Sets the value of the ratingkonfiguration property.
     *
     * @param value allowed object is
     *              {@link Ratingkonfiguration }
     * @see #getRatingkonfiguration()
     */
    public void setRatingkonfiguration(Ratingkonfiguration value) {
        this.ratingkonfiguration = value;
    }

    /**
     * Liste mit Migrationswahrscheinlichkeiten der Ratingklassen.
     *
     * @return possible object is
     * {@link Migrationswahrscheinlichkeiten }
     */
    public Migrationswahrscheinlichkeiten getMigrationswahrscheinlichkeiten() {
        return migrationswahrscheinlichkeiten;
    }

    /**
     * Sets the value of the migrationswahrscheinlichkeiten property.
     *
     * @param value allowed object is
     *              {@link Migrationswahrscheinlichkeiten }
     * @see #getMigrationswahrscheinlichkeiten()
     */
    public void setMigrationswahrscheinlichkeiten(Migrationswahrscheinlichkeiten value) {
        this.migrationswahrscheinlichkeiten = value;
    }

    /**
     * Liste mit Ausfallwahrscheinlichkeiten der Ratingklassen in Prozent je Laufzeit.
     *
     * @return possible object is
     * {@link Ausfallwahrscheinlichkeiten }
     */
    public Ausfallwahrscheinlichkeiten getAusfallwahrscheinlichkeiten() {
        return ausfallwahrscheinlichkeiten;
    }

    /**
     * Sets the value of the ausfallwahrscheinlichkeiten property.
     *
     * @param value allowed object is
     *              {@link Ausfallwahrscheinlichkeiten }
     * @see #getAusfallwahrscheinlichkeiten()
     */
    public void setAusfallwahrscheinlichkeiten(Ausfallwahrscheinlichkeiten value) {
        this.ausfallwahrscheinlichkeiten = value;
    }

    /**
     * Aufsichtsrechtliche 1-Jahres-Ausfallwahrscheinlichkeiten der Ratingklassen
     *
     * @return possible object is
     * {@link SzenarioWktenPds }
     */
    public SzenarioWktenPds getAufsichtsrechtlicheausfallwkten() {
        return aufsichtsrechtlicheausfallwkten;
    }

    /**
     * Sets the value of the aufsichtsrechtlicheausfallwkten property.
     *
     * @param value allowed object is
     *              {@link SzenarioWktenPds }
     * @see #getAufsichtsrechtlicheausfallwkten()
     */
    public void setAufsichtsrechtlicheausfallwkten(SzenarioWktenPds value) {
        this.aufsichtsrechtlicheausfallwkten = value;
    }

}
