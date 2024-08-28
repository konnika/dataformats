
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Verwaltungsdatenwert complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Verwaltungsdatenwert">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="schluessel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="stringWert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateWert" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="checkbox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verwaltungsdatenwert", propOrder = {

})
public class Verwaltungsdatenwert {

    /**
     * Schlüssel
     */
    @XmlElement(required = true)
    protected String schluessel;
    /**
     * Aktueller Wert (Text)
     */
    protected String stringWert;
    /**
     * Aktueller Wert (Datum)
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateWert;
    /**
     * Aktueller Wert (Auswahl)
     */
    protected Boolean checkbox;

    /**
     * Schlüssel
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchluessel() {
        return schluessel;
    }

    /**
     * Sets the value of the schluessel property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getSchluessel()
     */
    public void setSchluessel(String value) {
        this.schluessel = value;
    }

    /**
     * Aktueller Wert (Text)
     *
     * @return possible object is
     * {@link String }
     */
    public String getStringWert() {
        return stringWert;
    }

    /**
     * Sets the value of the stringWert property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getStringWert()
     */
    public void setStringWert(String value) {
        this.stringWert = value;
    }

    /**
     * Aktueller Wert (Datum)
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDateWert() {
        return dateWert;
    }

    /**
     * Sets the value of the dateWert property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDateWert()
     */
    public void setDateWert(XMLGregorianCalendar value) {
        this.dateWert = value;
    }

    /**
     * Aktueller Wert (Auswahl)
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isCheckbox() {
        return checkbox;
    }

    /**
     * Sets the value of the checkbox property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isCheckbox()
     */
    public void setCheckbox(Boolean value) {
        this.checkbox = value;
    }

}
