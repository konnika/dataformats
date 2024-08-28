
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Cashflow complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Cashflow">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="cash" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="art" type="{http://www.gillardon.de/marzipan/integrationsservice}CashflowZahlungsart" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cashflow", propOrder = {

})
public class Cashflow {

    /**
     * Fälligkeitstag
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    /**
     * Bewegungshöhe mit Vorzeichen: Auszahlung negativ, Tilgung positiv, Zins positiv oder negativ
     */
    protected double cash;
    /**
     * Art der Zahlung
     * A (für Auszahlung) D (für Disagio) T (für Tilgung) Z (für Zins) - Alle weiteren Arten sind reine
     * Ausgabefelder und werden nicht unterstützt
     */
    protected String art;

    /**
     * Fälligkeitstag
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
     * Bewegungshöhe mit Vorzeichen: Auszahlung negativ, Tilgung positiv, Zins positiv oder negativ
     */
    public double getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     */
    public void setCash(double value) {
        this.cash = value;
    }

    /**
     * Art der Zahlung
     * A (für Auszahlung) D (für Disagio) T (für Tilgung) Z (für Zins) - Alle weiteren Arten sind reine
     * Ausgabefelder und werden nicht unterstützt
     *
     * @return possible object is
     * {@link String }
     */
    public String getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getArt()
     */
    public void setArt(String value) {
        this.art = value;
    }

}
