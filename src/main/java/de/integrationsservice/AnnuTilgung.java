
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AnnuTilgung complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AnnuTilgung">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="tilgung" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnuTilgung", propOrder = {

})
public class AnnuTilgung {

    /**
     * Datum der Tilgung
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    /**
     * Höhe der Tilgung
     */
    protected double tilgung;

    /**
     * Datum der Tilgung
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
     * Höhe der Tilgung
     */
    public double getTilgung() {
        return tilgung;
    }

    /**
     * Sets the value of the tilgung property.
     */
    public void setTilgung(double value) {
        this.tilgung = value;
    }

}
