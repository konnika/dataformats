
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InstitutskriteriaDatum complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="InstitutskriteriaDatum">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="schluesselWert" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="printFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitutskriteriaDatum", propOrder = {

})
public class InstitutskriteriaDatum {

    /**
     * Bezeichnung des Institutskriteriums
     */
    @XmlElement(required = true)
    protected String schluesselWert;
    /**
     * Aktueller Wert des Institutskriteriums
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    /**
     * Markierung, ob das Institutskriterium auf Angebot und Berechnungsprotokoll mit ausgedruckt
     * werden soll.
     */
    protected Boolean printFlag;

    /**
     * Bezeichnung des Institutskriteriums
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchluesselWert() {
        return schluesselWert;
    }

    /**
     * Sets the value of the schluesselWert property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getSchluesselWert()
     */
    public void setSchluesselWert(String value) {
        this.schluesselWert = value;
    }

    /**
     * Aktueller Wert des Institutskriteriums
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
     * Markierung, ob das Institutskriterium auf Angebot und Berechnungsprotokoll mit ausgedruckt
     * werden soll.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPrintFlag() {
        return printFlag;
    }

    /**
     * Sets the value of the printFlag property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isPrintFlag()
     */
    public void setPrintFlag(Boolean value) {
        this.printFlag = value;
    }

}
