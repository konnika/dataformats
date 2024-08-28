
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * <p>Java class for BewegungsstufenTreppe complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="BewegungsstufenTreppe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="abstand" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         <element name="zeiteinheit" type="{http://www.gillardon.de/marzipan/integrationsservice}Zeiteinheit" minOccurs="0"/>
 *         <element name="anzahl" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="art" type="{http://www.gillardon.de/marzipan/integrationsservice}Treppenrechnerart"/>
 *         <element name="datum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="bewegungsstufeTag" type="{http://www.gillardon.de/marzipan/integrationsservice}UltimoTagEnum" minOccurs="0"/>
 *         <element name="hoehe" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="aktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BewegungsstufenTreppe", propOrder = {

})
public class BewegungsstufenTreppe {

    /**
     * Abstand der Bewegungen (bei einmaliger Bewegung irrelevant)
     */
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger abstand;
    /**
     * Der Abstand der Bewegungen kann in Tagen; Monaten; Jahren; angegeben werden.
     */
    @XmlSchemaType(name = "string")
    protected Zeiteinheit zeiteinheit;
    /**
     * Anzahl der Bewegungen dieser Höhe
     */
    protected double anzahl;
    /**
     * Mögliche Werte:
     * Rate;
     * Auszahlung;
     * Disagio/Damnum (als Betrag) = Nominalbetrag - Auszahlungsbetrag (wirkt nicht im nominalen aber
     * im effektiven Konto);
     * Sondertilgung (wird sofort verrechnet);
     * separate Gebühr Gebühren, die von einem anderen Konto bezahlt werden (wirkt nicht im nominalen
     * Konto);
     * Gebühr Gebühren, die verrechnet werden (wirken im nominalen Konto nicht im effektiven Konto, da
     * das nominale Konto belastet wird und die Gebühr über Raten aufgebraucht werden muss).
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Treppenrechnerart art;
    /**
     * Datum der ersten Bewegung dieser Stufe. Das Datum wird in Abhängigkeit zu den Einstellungen in
     * den Feldern Abstand und Einheit der vorangegangenen Eingabezeile ermittelt.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    /**
     * Periodentag der Bewegungsstufe
     */
    @XmlSchemaType(name = "string")
    protected UltimoTagEnum bewegungsstufeTag;
    /**
     * Höhe der Bewegung
     */
    protected double hoehe;
    /**
     * Steuert, ob die Bewegungsstufe bei der Berechnung berücksichtigt werden soll.
     */
    protected Boolean aktiv;

    /**
     * Abstand der Bewegungen (bei einmaliger Bewegung irrelevant)
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getAbstand() {
        return abstand;
    }

    /**
     * Sets the value of the abstand property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getAbstand()
     */
    public void setAbstand(BigInteger value) {
        this.abstand = value;
    }

    /**
     * Der Abstand der Bewegungen kann in Tagen; Monaten; Jahren; angegeben werden.
     *
     * @return possible object is
     * {@link Zeiteinheit }
     */
    public Zeiteinheit getZeiteinheit() {
        return zeiteinheit;
    }

    /**
     * Sets the value of the zeiteinheit property.
     *
     * @param value allowed object is
     *              {@link Zeiteinheit }
     * @see #getZeiteinheit()
     */
    public void setZeiteinheit(Zeiteinheit value) {
        this.zeiteinheit = value;
    }

    /**
     * Anzahl der Bewegungen dieser Höhe
     */
    public double getAnzahl() {
        return anzahl;
    }

    /**
     * Sets the value of the anzahl property.
     */
    public void setAnzahl(double value) {
        this.anzahl = value;
    }

    /**
     * Mögliche Werte:
     * Rate;
     * Auszahlung;
     * Disagio/Damnum (als Betrag) = Nominalbetrag - Auszahlungsbetrag (wirkt nicht im nominalen aber
     * im effektiven Konto);
     * Sondertilgung (wird sofort verrechnet);
     * separate Gebühr Gebühren, die von einem anderen Konto bezahlt werden (wirkt nicht im nominalen
     * Konto);
     * Gebühr Gebühren, die verrechnet werden (wirken im nominalen Konto nicht im effektiven Konto, da
     * das nominale Konto belastet wird und die Gebühr über Raten aufgebraucht werden muss).
     *
     * @return possible object is
     * {@link Treppenrechnerart }
     */
    public Treppenrechnerart getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     *
     * @param value allowed object is
     *              {@link Treppenrechnerart }
     * @see #getArt()
     */
    public void setArt(Treppenrechnerart value) {
        this.art = value;
    }

    /**
     * Datum der ersten Bewegung dieser Stufe. Das Datum wird in Abhängigkeit zu den Einstellungen in
     * den Feldern Abstand und Einheit der vorangegangenen Eingabezeile ermittelt.
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
     * Periodentag der Bewegungsstufe
     *
     * @return possible object is
     * {@link UltimoTagEnum }
     */
    public UltimoTagEnum getBewegungsstufeTag() {
        return bewegungsstufeTag;
    }

    /**
     * Sets the value of the bewegungsstufeTag property.
     *
     * @param value allowed object is
     *              {@link UltimoTagEnum }
     * @see #getBewegungsstufeTag()
     */
    public void setBewegungsstufeTag(UltimoTagEnum value) {
        this.bewegungsstufeTag = value;
    }

    /**
     * Höhe der Bewegung
     */
    public double getHoehe() {
        return hoehe;
    }

    /**
     * Sets the value of the hoehe property.
     */
    public void setHoehe(double value) {
        this.hoehe = value;
    }

    /**
     * Steuert, ob die Bewegungsstufe bei der Berechnung berücksichtigt werden soll.
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
