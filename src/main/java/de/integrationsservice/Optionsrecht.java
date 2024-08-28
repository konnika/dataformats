
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Optionsrecht complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Optionsrecht">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="kuendFrist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="rechtAb" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="rechtBis" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="mindestBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="hoechstBetrag" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="optionTeilbar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="art" type="{http://www.gillardon.de/marzipan/integrationsservice}Optionsrechtsart" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Optionsrecht", propOrder = {

})
public class Optionsrecht {

    /**
     * Einzuhaltende Frist zwischen Ankündigung der Ausübung und tatsächlicher Ausübung der Option (in
     * Monaten)
     */
    protected int kuendFrist;
    /**
     * Datum, ab dem das Tilgungsrecht (Darlehen) bzw. Verfügungsrecht/Kündigungsrecht (Sparen) gilt
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rechtAb;
    /**
     * Datum, bis zu dem das Tilgungsrecht (Darlehen) bzw. Verfügungsrecht/Kündigungsrecht (Sparen)
     * gilt
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rechtBis;
    /**
     * Minimal möglicher Sondertilgungsbetrag
     */
    protected Double mindestBetrag;
    /**
     * Maximal möglicher Sondertilgungsbetrag
     */
    protected double hoechstBetrag;
    /**
     * Gibt an, ob das Recht in mehreren Teilbeträgen ausgeübt werden (Häkchen gesetzt) oder nur in
     * einem Betrag im Gültigkeitszeitraum ausgeübt werden kann (Häkchen nicht gesetzt).
     */
    protected boolean optionTeilbar;
    /**
     * Art des Optionsrechts (Kündigungsrecht, Verfügungsrecht, Sondertilgungsrecht)
     */
    @XmlSchemaType(name = "string")
    protected Optionsrechtsart art;

    /**
     * Einzuhaltende Frist zwischen Ankündigung der Ausübung und tatsächlicher Ausübung der Option (in
     * Monaten)
     */
    public int getKuendFrist() {
        return kuendFrist;
    }

    /**
     * Sets the value of the kuendFrist property.
     */
    public void setKuendFrist(int value) {
        this.kuendFrist = value;
    }

    /**
     * Datum, ab dem das Tilgungsrecht (Darlehen) bzw. Verfügungsrecht/Kündigungsrecht (Sparen) gilt
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getRechtAb() {
        return rechtAb;
    }

    /**
     * Sets the value of the rechtAb property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getRechtAb()
     */
    public void setRechtAb(XMLGregorianCalendar value) {
        this.rechtAb = value;
    }

    /**
     * Datum, bis zu dem das Tilgungsrecht (Darlehen) bzw. Verfügungsrecht/Kündigungsrecht (Sparen)
     * gilt
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getRechtBis() {
        return rechtBis;
    }

    /**
     * Sets the value of the rechtBis property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getRechtBis()
     */
    public void setRechtBis(XMLGregorianCalendar value) {
        this.rechtBis = value;
    }

    /**
     * Minimal möglicher Sondertilgungsbetrag
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMindestBetrag() {
        return mindestBetrag;
    }

    /**
     * Sets the value of the mindestBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMindestBetrag()
     */
    public void setMindestBetrag(Double value) {
        this.mindestBetrag = value;
    }

    /**
     * Maximal möglicher Sondertilgungsbetrag
     */
    public double getHoechstBetrag() {
        return hoechstBetrag;
    }

    /**
     * Sets the value of the hoechstBetrag property.
     */
    public void setHoechstBetrag(double value) {
        this.hoechstBetrag = value;
    }

    /**
     * Gibt an, ob das Recht in mehreren Teilbeträgen ausgeübt werden (Häkchen gesetzt) oder nur in
     * einem Betrag im Gültigkeitszeitraum ausgeübt werden kann (Häkchen nicht gesetzt).
     */
    public boolean isOptionTeilbar() {
        return optionTeilbar;
    }

    /**
     * Sets the value of the optionTeilbar property.
     */
    public void setOptionTeilbar(boolean value) {
        this.optionTeilbar = value;
    }

    /**
     * Art des Optionsrechts (Kündigungsrecht, Verfügungsrecht, Sondertilgungsrecht)
     *
     * @return possible object is
     * {@link Optionsrechtsart }
     */
    public Optionsrechtsart getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     *
     * @param value allowed object is
     *              {@link Optionsrechtsart }
     * @see #getArt()
     */
    public void setArt(Optionsrechtsart value) {
        this.art = value;
    }

}
