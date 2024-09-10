
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Die Ratingkonfiguration/Ratingsystem besteht aus einigen Kopfdaten und einer Liste von
 * Bonitaeten(Ratingklassen).
 * Aktuell nur für Kalkulationsservice-Aufrufe.
 *
 * <p>Java class for Ratingkonfiguration complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Ratingkonfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="anzahlKlassen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="feinheitKlassen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="dezimalnoten" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ratingkonfigurationArt" type="{http://www.gillardon.de/marzipan/integrationsservice}RatingkonfigurationArt" minOccurs="0"/>
 *         <element name="freigabestatus" type="{http://www.gillardon.de/marzipan/integrationsservice}Freigabestatus" minOccurs="0"/>
 *         <element name="bonitaeten" type="{http://www.gillardon.de/marzipan/integrationsservice}Bonitaeten"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ratingkonfiguration", propOrder = {

})
public class Ratingkonfiguration {

    /**
     * Name der Ratingkonfiguration, die aus einigen Kopfdaten und einer Liste von
     * Bonitaeten(Ratingklassen) besteht.
     */
    protected String name;
    /**
     * Kommentar der Ratingkonfiguration.
     */
    protected String kommentar;
    /**
     * Erstellungsdatum der Ratingkonfiguration
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erstellungsdatum;
    /**
     * Erstellungsdatum der Ratingkonfiguration
     */
    protected String ersteller;
    /**
     * Die Anzahl der Klassen der Ratingkonfiguration.
     */
    protected Integer anzahlKlassen;
    /**
     * Interpolationsraster: ganzzahlige Zahl, die angibt, wie viele Zwischenintervalle zwischen ganzen
     * Zahlen der Ratingklassen gebildet werden sollen. Mit dem Wert 1 wird nicht interpoliert.
     */
    protected Integer feinheitKlassen;
    /**
     * Dezimale Noten: Wird dieses Feld aktiviert, wird die Interpolation zwischen Ratingklassen
     * freigeschaltet. In diesem Fall werden so viele Zwischenintervalle eingeführt, wie im Feld
     * Interpolationsraster angegeben sind.
     * Ist das Feld dezimale Noten nicht aktiviert, wird eine von 1 abweicende Eingabe in
     * Interpolationsraster ignoriert.
     * Feld soll entfallen!
     */
    protected Integer dezimalnoten;
    /**
     * Art: Die Art der Ratingkonfiguration, vor allem für Basel III Klassifizierung: 0=nicht
     * klassifiziert, 1= intern, 2= extern kurzfristig, 3=extern langfristig
     */
    @XmlSchemaType(name = "string")
    protected RatingkonfigurationArt ratingkonfigurationArt;
    /**
     * Der Freigabestatus der Ratingkonfiguration
     */
    @XmlSchemaType(name = "string")
    protected Freigabestatus freigabestatus;
    /**
     * Liste mit Bonitaeten(=Ratingklassen).
     * siehe globalen komplexen Typ Bonitaet
     */
    @XmlElement(required = true)
    protected Bonitaeten bonitaeten;

    /**
     * Name der Ratingkonfiguration, die aus einigen Kopfdaten und einer Liste von
     * Bonitaeten(Ratingklassen) besteht.
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
     * Kommentar der Ratingkonfiguration.
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
     * Erstellungsdatum der Ratingkonfiguration
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
     * Erstellungsdatum der Ratingkonfiguration
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
     * Die Anzahl der Klassen der Ratingkonfiguration.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getAnzahlKlassen() {
        return anzahlKlassen;
    }

    /**
     * Sets the value of the anzahlKlassen property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getAnzahlKlassen()
     */
    public void setAnzahlKlassen(Integer value) {
        this.anzahlKlassen = value;
    }

    /**
     * Interpolationsraster: ganzzahlige Zahl, die angibt, wie viele Zwischenintervalle zwischen ganzen
     * Zahlen der Ratingklassen gebildet werden sollen. Mit dem Wert 1 wird nicht interpoliert.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getFeinheitKlassen() {
        return feinheitKlassen;
    }

    /**
     * Sets the value of the feinheitKlassen property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getFeinheitKlassen()
     */
    public void setFeinheitKlassen(Integer value) {
        this.feinheitKlassen = value;
    }

    /**
     * Dezimale Noten: Wird dieses Feld aktiviert, wird die Interpolation zwischen Ratingklassen
     * freigeschaltet. In diesem Fall werden so viele Zwischenintervalle eingeführt, wie im Feld
     * Interpolationsraster angegeben sind.
     * Ist das Feld dezimale Noten nicht aktiviert, wird eine von 1 abweicende Eingabe in
     * Interpolationsraster ignoriert.
     * Feld soll entfallen!
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDezimalnoten() {
        return dezimalnoten;
    }

    /**
     * Sets the value of the dezimalnoten property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getDezimalnoten()
     */
    public void setDezimalnoten(Integer value) {
        this.dezimalnoten = value;
    }

    /**
     * Art: Die Art der Ratingkonfiguration, vor allem für Basel III Klassifizierung: 0=nicht
     * klassifiziert, 1= intern, 2= extern kurzfristig, 3=extern langfristig
     *
     * @return possible object is
     * {@link RatingkonfigurationArt }
     */
    public RatingkonfigurationArt getRatingkonfigurationArt() {
        return ratingkonfigurationArt;
    }

    /**
     * Sets the value of the ratingkonfigurationArt property.
     *
     * @param value allowed object is
     *              {@link RatingkonfigurationArt }
     * @see #getRatingkonfigurationArt()
     */
    public void setRatingkonfigurationArt(RatingkonfigurationArt value) {
        this.ratingkonfigurationArt = value;
    }

    /**
     * Der Freigabestatus der Ratingkonfiguration
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
     * Liste mit Bonitaeten(=Ratingklassen).
     * siehe globalen komplexen Typ Bonitaet
     *
     * @return possible object is
     * {@link Bonitaeten }
     */
    public Bonitaeten getBonitaeten() {
        return bonitaeten;
    }

    /**
     * Sets the value of the bonitaeten property.
     *
     * @param value allowed object is
     *              {@link Bonitaeten }
     * @see #getBonitaeten()
     */
    public void setBonitaeten(Bonitaeten value) {
        this.bonitaeten = value;
    }

}
