
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Neuerzinssatz complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Neuerzinssatz">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="ausfuehrungsDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="zinssatz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="marginProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margeNominal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="aktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Neuerzinssatz", propOrder = {

})
public class Neuerzinssatz {

    /**
     * Datum des Zinswechsels
     * Tabelle des Zinswechsels
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ausfuehrungsDatum;
    /**
     * Angabe des neuen Zinssatzes in Prozent
     * Tabelle des Zinswechsels
     */
    protected Double zinssatz;
    /**
     * Aufschlag in %
     */
    protected Double marginProzent;
    /**
     * Marge Nominal in %
     */
    protected Double margeNominal;
    /**
     * Steuert, ob der Zinssatzwechsel oder der Konditionswechsel bei der Berechnung
     * berücksichtigt werden soll
     */
    protected Boolean aktiv;

    /**
     * Datum des Zinswechsels
     * Tabelle des Zinswechsels
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAusfuehrungsDatum() {
        return ausfuehrungsDatum;
    }

    /**
     * Sets the value of the ausfuehrungsDatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAusfuehrungsDatum()
     */
    public void setAusfuehrungsDatum(XMLGregorianCalendar value) {
        this.ausfuehrungsDatum = value;
    }

    /**
     * Angabe des neuen Zinssatzes in Prozent
     * Tabelle des Zinswechsels
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinssatz() {
        return zinssatz;
    }

    /**
     * Sets the value of the zinssatz property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinssatz()
     */
    public void setZinssatz(Double value) {
        this.zinssatz = value;
    }

    /**
     * Aufschlag in %
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
     * Marge Nominal in %
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargeNominal() {
        return margeNominal;
    }

    /**
     * Sets the value of the margeNominal property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargeNominal()
     */
    public void setMargeNominal(Double value) {
        this.margeNominal = value;
    }

    /**
     * Steuert, ob der Zinssatzwechsel oder der Konditionswechsel bei der Berechnung
     * berücksichtigt werden soll
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
