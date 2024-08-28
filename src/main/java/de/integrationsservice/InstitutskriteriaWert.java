
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstitutskriteriaWert complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="InstitutskriteriaWert">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="schluesselWert" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="wert" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="textDarstellung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="printFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitutskriteriaWert", propOrder = {

})
public class InstitutskriteriaWert {

    /**
     * Bezeichnung des Institutskriteriums
     */
    @XmlElement(required = true)
    protected String schluesselWert;
    /**
     * Aktueller Wert des Institutskriteriums
     */
    protected Double wert;
    /**
     * Text für ein Intitutskriteria.
     */
    protected String text;
    /**
     * Text Darstellung flag für ein Intitutskriteria.
     */
    protected Boolean textDarstellung;
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
     * {@link Double }
     */
    public Double getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getWert()
     */
    public void setWert(Double value) {
        this.wert = value;
    }

    /**
     * Text für ein Intitutskriteria.
     *
     * @return possible object is
     * {@link String }
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getText()
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Text Darstellung flag für ein Intitutskriteria.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTextDarstellung() {
        return textDarstellung;
    }

    /**
     * Sets the value of the textDarstellung property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isTextDarstellung()
     */
    public void setTextDarstellung(Boolean value) {
        this.textDarstellung = value;
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
