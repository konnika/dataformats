
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Refinanzierungskondition für eine bestimmte Laufzeit.
 *
 * <p>Java class for Stuetzstelle complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Stuetzstelle">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="briefkurs" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="briefrendite" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="briefzins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="faelligkeit" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="geldkurs" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="geldrendite" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="geldzins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="laufzeit" type="{http://www.gillardon.de/marzipan/integrationsservice}StuetzstelleLaufzeit" minOccurs="0"/>
 *         <element name="usance" type="{http://www.gillardon.de/marzipan/integrationsservice}Usance"/>
 *         <element name="kpa" type="{http://www.gillardon.de/marzipan/integrationsservice}KPA"/>
 *         <element name="kupontyp" type="{http://www.gillardon.de/marzipan/integrationsservice}Kupontyp"/>
 *         <element name="stkmethode" type="{http://www.gillardon.de/marzipan/integrationsservice}Stueckzinsmethode"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stuetzstelle", propOrder = {

})
public class Stuetzstelle {

    protected Double briefkurs;
    protected Double briefrendite;
    protected Double briefzins;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar faelligkeit;
    protected Double geldkurs;
    protected Double geldrendite;
    protected Double geldzins;
    /**
     * Laufzeit der Stützstelle (aus der Laufzeit wird für ein konkretes
     * Kalkulationsdatum der Zinsstruktur
     * und dem Feiertagskalender, der sich aus dem Finanzplatz ergibt, die Fälligkeit der Stützstelle
     * berechnet).
     * Alternativ kann die Fälligkeit direkt definiert werden.
     */
    protected StuetzstelleLaufzeit laufzeit;
    /**
     * übliche Usancen wählbar
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Usance usance;
    /**
     * jährlich, halbjährlich, vierteljährlich, monatlich
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected KPA kpa;
    /**
     * Kupontyp der Stützstelle: normal, short, long
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Kupontyp kupontyp;
    /**
     * Stückzinsmethode der Stützstelle: positiv, ohne, flat, negativ
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Stueckzinsmethode stkmethode;

    /**
     * Gets the value of the briefkurs property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBriefkurs() {
        return briefkurs;
    }

    /**
     * Sets the value of the briefkurs property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setBriefkurs(Double value) {
        this.briefkurs = value;
    }

    /**
     * Gets the value of the briefrendite property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBriefrendite() {
        return briefrendite;
    }

    /**
     * Sets the value of the briefrendite property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setBriefrendite(Double value) {
        this.briefrendite = value;
    }

    /**
     * Gets the value of the briefzins property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBriefzins() {
        return briefzins;
    }

    /**
     * Sets the value of the briefzins property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setBriefzins(Double value) {
        this.briefzins = value;
    }

    /**
     * Gets the value of the faelligkeit property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFaelligkeit() {
        return faelligkeit;
    }

    /**
     * Sets the value of the faelligkeit property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFaelligkeit(XMLGregorianCalendar value) {
        this.faelligkeit = value;
    }

    /**
     * Gets the value of the geldkurs property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGeldkurs() {
        return geldkurs;
    }

    /**
     * Sets the value of the geldkurs property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setGeldkurs(Double value) {
        this.geldkurs = value;
    }

    /**
     * Gets the value of the geldrendite property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGeldrendite() {
        return geldrendite;
    }

    /**
     * Sets the value of the geldrendite property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setGeldrendite(Double value) {
        this.geldrendite = value;
    }

    /**
     * Gets the value of the geldzins property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGeldzins() {
        return geldzins;
    }

    /**
     * Sets the value of the geldzins property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setGeldzins(Double value) {
        this.geldzins = value;
    }

    /**
     * Laufzeit der Stützstelle (aus der Laufzeit wird für ein konkretes
     * Kalkulationsdatum der Zinsstruktur
     * und dem Feiertagskalender, der sich aus dem Finanzplatz ergibt, die Fälligkeit der Stützstelle
     * berechnet).
     * Alternativ kann die Fälligkeit direkt definiert werden.
     *
     * @return possible object is
     * {@link StuetzstelleLaufzeit }
     */
    public StuetzstelleLaufzeit getLaufzeit() {
        return laufzeit;
    }

    /**
     * Sets the value of the laufzeit property.
     *
     * @param value allowed object is
     *              {@link StuetzstelleLaufzeit }
     * @see #getLaufzeit()
     */
    public void setLaufzeit(StuetzstelleLaufzeit value) {
        this.laufzeit = value;
    }

    /**
     * übliche Usancen wählbar
     *
     * @return possible object is
     * {@link Usance }
     */
    public Usance getUsance() {
        return usance;
    }

    /**
     * Sets the value of the usance property.
     *
     * @param value allowed object is
     *              {@link Usance }
     * @see #getUsance()
     */
    public void setUsance(Usance value) {
        this.usance = value;
    }

    /**
     * jährlich, halbjährlich, vierteljährlich, monatlich
     *
     * @return possible object is
     * {@link KPA }
     */
    public KPA getKpa() {
        return kpa;
    }

    /**
     * Sets the value of the kpa property.
     *
     * @param value allowed object is
     *              {@link KPA }
     * @see #getKpa()
     */
    public void setKpa(KPA value) {
        this.kpa = value;
    }

    /**
     * Kupontyp der Stützstelle: normal, short, long
     *
     * @return possible object is
     * {@link Kupontyp }
     */
    public Kupontyp getKupontyp() {
        return kupontyp;
    }

    /**
     * Sets the value of the kupontyp property.
     *
     * @param value allowed object is
     *              {@link Kupontyp }
     * @see #getKupontyp()
     */
    public void setKupontyp(Kupontyp value) {
        this.kupontyp = value;
    }

    /**
     * Stückzinsmethode der Stützstelle: positiv, ohne, flat, negativ
     *
     * @return possible object is
     * {@link Stueckzinsmethode }
     */
    public Stueckzinsmethode getStkmethode() {
        return stkmethode;
    }

    /**
     * Sets the value of the stkmethode property.
     *
     * @param value allowed object is
     *              {@link Stueckzinsmethode }
     * @see #getStkmethode()
     */
    public void setStkmethode(Stueckzinsmethode value) {
        this.stkmethode = value;
    }

}
