
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Sonderzahlung complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Sonderzahlung">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="art" type="{http://www.gillardon.de/marzipan/integrationsservice}Sonderzahlungsart" minOccurs="0"/>
 *         <element name="ausfuehrungsDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="zahlung" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="ve" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sonderzahlung", propOrder = {

})
public class Sonderzahlung {

    /**
     * Art der Sonderzahlung (Tilgung, Auszahlung)
     */
    @XmlSchemaType(name = "string")
    protected Sonderzahlungsart art;
    /**
     * Datum der Sonderzahlung
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ausfuehrungsDatum;
    /**
     * Höhe der Sonderzahlung
     */
    protected double zahlung;
    /**
     * Kennzeichen ob Vorfälligkeit berechnet werden soll
     */
    protected Boolean ve;

    /**
     * Art der Sonderzahlung (Tilgung, Auszahlung)
     *
     * @return possible object is
     * {@link Sonderzahlungsart }
     */
    public Sonderzahlungsart getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     *
     * @param value allowed object is
     *              {@link Sonderzahlungsart }
     * @see #getArt()
     */
    public void setArt(Sonderzahlungsart value) {
        this.art = value;
    }

    /**
     * Datum der Sonderzahlung
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
     * Höhe der Sonderzahlung
     */
    public double getZahlung() {
        return zahlung;
    }

    /**
     * Sets the value of the zahlung property.
     */
    public void setZahlung(double value) {
        this.zahlung = value;
    }

    /**
     * Kennzeichen ob Vorfälligkeit berechnet werden soll
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVe() {
        return ve;
    }

    /**
     * Sets the value of the ve property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isVe()
     */
    public void setVe(Boolean value) {
        this.ve = value;
    }

}
