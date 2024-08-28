
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AbzinsungskontoRow complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AbzinsungskontoRow">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="valuta" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ausfallendeZahlung" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="diskontfaktor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="abgezinsteAusfallendeZahlung" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbzinsungskontoRow", propOrder = {

})
public class AbzinsungskontoRow {

    /**
     * Datum
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valuta;
    /**
     * Barwert der ausfallenden Zahlungen
     */
    protected double ausfallendeZahlung;
    /**
     * Diskontfaktor
     */
    protected double diskontfaktor;
    /**
     * Barwert der ausfallenden Zahlungen abgezinst
     */
    protected double abgezinsteAusfallendeZahlung;

    /**
     * Datum
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
     * Barwert der ausfallenden Zahlungen
     */
    public double getAusfallendeZahlung() {
        return ausfallendeZahlung;
    }

    /**
     * Sets the value of the ausfallendeZahlung property.
     */
    public void setAusfallendeZahlung(double value) {
        this.ausfallendeZahlung = value;
    }

    /**
     * Diskontfaktor
     */
    public double getDiskontfaktor() {
        return diskontfaktor;
    }

    /**
     * Sets the value of the diskontfaktor property.
     */
    public void setDiskontfaktor(double value) {
        this.diskontfaktor = value;
    }

    /**
     * Barwert der ausfallenden Zahlungen abgezinst
     */
    public double getAbgezinsteAusfallendeZahlung() {
        return abgezinsteAusfallendeZahlung;
    }

    /**
     * Sets the value of the abgezinsteAusfallendeZahlung property.
     */
    public void setAbgezinsteAusfallendeZahlung(double value) {
        this.abgezinsteAusfallendeZahlung = value;
    }

}
