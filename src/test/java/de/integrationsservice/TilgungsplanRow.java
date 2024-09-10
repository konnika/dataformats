
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TilgungsplanRow complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="TilgungsplanRow">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="bewegung" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="bewegungbrutto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="zinssaldo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="restkapital" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="zinsanteil" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="zinssatzPA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="tilgungsanteil" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="art" type="{http://www.gillardon.de/marzipan/integrationsservice}Cashflowsart" minOccurs="0"/>
 *         <element name="valuta" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="steuer" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="gebuehrUnverbraucht" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="gebuehrSeparat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="gebuehrVerrechnet" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="mittlereRestschuld" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kontostand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TilgungsplanRow", propOrder = {

})
public class TilgungsplanRow {

    /**
     * Höhe des Cash-Flows
     */
    protected double bewegung;
    /**
     * Brutto Bewegung für den Monat
     */
    protected double bewegungbrutto;
    /**
     * Aktuelle Höhe des Zinssaldos nach dem Ereignis
     */
    protected double zinssaldo;
    /**
     * Restkapital für den Monat
     */
    protected double restkapital;
    /**
     * Zinsanteil eines Cash-Flows
     */
    protected double zinsanteil;
    /**
     * Zinssatz PerAnnum für den Monat
     */
    protected Double zinssatzPA;
    /**
     * Tilgungsanteil eines Cash-Flows
     */
    protected double tilgungsanteil;
    /**
     * Art des Cash-Flows beziehungsweise der Buchung
     */
    @XmlSchemaType(name = "string")
    protected Cashflowsart art;
    /**
     * Datum an dem ein Cash-Flow stattfindet
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valuta;
    /**
     * Steuer
     */
    protected double steuer;
    /**
     * Unverbrauchte Gebühr bei Disagiosplitting
     * aktuell kein Disagio bei Roll-Over
     */
    protected Double gebuehrUnverbraucht;
    /**
     * Separat gezahlte Gebühr, die auf das Konto gebucht wurde.
     */
    protected double gebuehrSeparat;
    /**
     * Auf dem Kontostand verrechnete Gebühr, die auf das Konto gebucht wurde.
     */
    protected double gebuehrVerrechnet;
    /**
     * Mittlere Restschuld.
     */
    protected Double mittlereRestschuld;
    /**
     * Kontostand.
     */
    protected Double kontostand;

    /**
     * Höhe des Cash-Flows
     */
    public double getBewegung() {
        return bewegung;
    }

    /**
     * Sets the value of the bewegung property.
     */
    public void setBewegung(double value) {
        this.bewegung = value;
    }

    /**
     * Brutto Bewegung für den Monat
     */
    public double getBewegungbrutto() {
        return bewegungbrutto;
    }

    /**
     * Sets the value of the bewegungbrutto property.
     */
    public void setBewegungbrutto(double value) {
        this.bewegungbrutto = value;
    }

    /**
     * Aktuelle Höhe des Zinssaldos nach dem Ereignis
     */
    public double getZinssaldo() {
        return zinssaldo;
    }

    /**
     * Sets the value of the zinssaldo property.
     */
    public void setZinssaldo(double value) {
        this.zinssaldo = value;
    }

    /**
     * Restkapital für den Monat
     */
    public double getRestkapital() {
        return restkapital;
    }

    /**
     * Sets the value of the restkapital property.
     */
    public void setRestkapital(double value) {
        this.restkapital = value;
    }

    /**
     * Zinsanteil eines Cash-Flows
     */
    public double getZinsanteil() {
        return zinsanteil;
    }

    /**
     * Sets the value of the zinsanteil property.
     */
    public void setZinsanteil(double value) {
        this.zinsanteil = value;
    }

    /**
     * Zinssatz PerAnnum für den Monat
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinssatzPA() {
        return zinssatzPA;
    }

    /**
     * Sets the value of the zinssatzPA property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinssatzPA()
     */
    public void setZinssatzPA(Double value) {
        this.zinssatzPA = value;
    }

    /**
     * Tilgungsanteil eines Cash-Flows
     */
    public double getTilgungsanteil() {
        return tilgungsanteil;
    }

    /**
     * Sets the value of the tilgungsanteil property.
     */
    public void setTilgungsanteil(double value) {
        this.tilgungsanteil = value;
    }

    /**
     * Art des Cash-Flows beziehungsweise der Buchung
     *
     * @return possible object is
     * {@link Cashflowsart }
     */
    public Cashflowsart getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     *
     * @param value allowed object is
     *              {@link Cashflowsart }
     * @see #getArt()
     */
    public void setArt(Cashflowsart value) {
        this.art = value;
    }

    /**
     * Datum an dem ein Cash-Flow stattfindet
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getValuta() {
        return valuta;
    }

    /**
     * Sets the value of the valuta property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getValuta()
     */
    public void setValuta(XMLGregorianCalendar value) {
        this.valuta = value;
    }

    /**
     * Steuer
     */
    public double getSteuer() {
        return steuer;
    }

    /**
     * Sets the value of the steuer property.
     */
    public void setSteuer(double value) {
        this.steuer = value;
    }

    /**
     * Unverbrauchte Gebühr bei Disagiosplitting
     * aktuell kein Disagio bei Roll-Over
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGebuehrUnverbraucht() {
        return gebuehrUnverbraucht;
    }

    /**
     * Sets the value of the gebuehrUnverbraucht property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getGebuehrUnverbraucht()
     */
    public void setGebuehrUnverbraucht(Double value) {
        this.gebuehrUnverbraucht = value;
    }

    /**
     * Separat gezahlte Gebühr, die auf das Konto gebucht wurde.
     */
    public double getGebuehrSeparat() {
        return gebuehrSeparat;
    }

    /**
     * Sets the value of the gebuehrSeparat property.
     */
    public void setGebuehrSeparat(double value) {
        this.gebuehrSeparat = value;
    }

    /**
     * Auf dem Kontostand verrechnete Gebühr, die auf das Konto gebucht wurde.
     */
    public double getGebuehrVerrechnet() {
        return gebuehrVerrechnet;
    }

    /**
     * Sets the value of the gebuehrVerrechnet property.
     */
    public void setGebuehrVerrechnet(double value) {
        this.gebuehrVerrechnet = value;
    }

    /**
     * Mittlere Restschuld.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMittlereRestschuld() {
        return mittlereRestschuld;
    }

    /**
     * Sets the value of the mittlereRestschuld property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMittlereRestschuld()
     */
    public void setMittlereRestschuld(Double value) {
        this.mittlereRestschuld = value;
    }

    /**
     * Kontostand.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKontostand() {
        return kontostand;
    }

    /**
     * Sets the value of the kontostand property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKontostand()
     */
    public void setKontostand(Double value) {
        this.kontostand = value;
    }

}
