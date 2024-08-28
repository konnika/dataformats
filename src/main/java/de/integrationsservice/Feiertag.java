
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Fester Feiertag
 *
 * <p>Java class for Feiertag complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Feiertag">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="typ" type="{http://www.gillardon.de/marzipan/integrationsservice}Feiertagstyp"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Feiertag", propOrder = {

})
public class Feiertag {

    /**
     * Name des Feiertags
     */
    protected String name;
    /**
     * Datum des Feiertags
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    /**
     * Typ des Feiertags
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Feiertagstyp typ;

    /**
     * Name des Feiertags
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Datum des Feiertags
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
     * Typ des Feiertags
     *
     * @return possible object is
     * {@link Feiertagstyp }
     */
    public Feiertagstyp getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     *
     * @param value allowed object is
     *              {@link Feiertagstyp }
     * @see #getTyp()
     */
    public void setTyp(Feiertagstyp value) {
        this.typ = value;
    }

}
