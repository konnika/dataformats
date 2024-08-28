
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OvernightReferenzzins complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="OvernightReferenzzins">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="referenzzinsDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="referenzzinsHoehe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="referenzzinsID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvernightReferenzzins", propOrder = {

})
public class OvernightReferenzzins {

    /**
     * Referenzzinsdatum.
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referenzzinsDatum;
    /**
     * Referenzzins in %
     */
    protected Double referenzzinsHoehe;
    /**
     * Aktueller Referenzzins
     */
    protected Integer referenzzinsID;

    /**
     * Referenzzinsdatum.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getReferenzzinsDatum() {
        return referenzzinsDatum;
    }

    /**
     * Sets the value of the referenzzinsDatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getReferenzzinsDatum()
     */
    public void setReferenzzinsDatum(XMLGregorianCalendar value) {
        this.referenzzinsDatum = value;
    }

    /**
     * Referenzzins in %
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getReferenzzinsHoehe() {
        return referenzzinsHoehe;
    }

    /**
     * Sets the value of the referenzzinsHoehe property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getReferenzzinsHoehe()
     */
    public void setReferenzzinsHoehe(Double value) {
        this.referenzzinsHoehe = value;
    }

    /**
     * Aktueller Referenzzins
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getReferenzzinsID() {
        return referenzzinsID;
    }

    /**
     * Sets the value of the referenzzinsID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getReferenzzinsID()
     */
    public void setReferenzzinsID(Integer value) {
        this.referenzzinsID = value;
    }

}
