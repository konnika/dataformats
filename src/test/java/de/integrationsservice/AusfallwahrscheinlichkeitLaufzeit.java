
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Laufzeit als Text
 *
 * <p>Java class for AusfallwahrscheinlichkeitLaufzeit complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AusfallwahrscheinlichkeitLaufzeit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="anzMonatePlusEins" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="anzQuartPlusEins" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="anzHJahrePlusEins" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="anzJahrePlusEins" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AusfallwahrscheinlichkeitLaufzeit", propOrder = {

})
public class AusfallwahrscheinlichkeitLaufzeit {

    /**
     * Die Laufzeit in Monaten plus ein Monat
     */
    protected int anzMonatePlusEins;
    /**
     * Die Laufzeit in Quartalen plus ein Quartal
     */
    protected int anzQuartPlusEins;
    /**
     * Die Laufzeit in Halbjahren plus ein Halbjahr
     */
    protected int anzHJahrePlusEins;
    /**
     * Die Laufzeit in Jahren plus ein Jahr
     */
    protected int anzJahrePlusEins;
    /**
     * Die Laufzeit als Text.
     */
    @XmlElement(required = true)
    protected String name;

    /**
     * Die Laufzeit in Monaten plus ein Monat
     */
    public int getAnzMonatePlusEins() {
        return anzMonatePlusEins;
    }

    /**
     * Sets the value of the anzMonatePlusEins property.
     */
    public void setAnzMonatePlusEins(int value) {
        this.anzMonatePlusEins = value;
    }

    /**
     * Die Laufzeit in Quartalen plus ein Quartal
     */
    public int getAnzQuartPlusEins() {
        return anzQuartPlusEins;
    }

    /**
     * Sets the value of the anzQuartPlusEins property.
     */
    public void setAnzQuartPlusEins(int value) {
        this.anzQuartPlusEins = value;
    }

    /**
     * Die Laufzeit in Halbjahren plus ein Halbjahr
     */
    public int getAnzHJahrePlusEins() {
        return anzHJahrePlusEins;
    }

    /**
     * Sets the value of the anzHJahrePlusEins property.
     */
    public void setAnzHJahrePlusEins(int value) {
        this.anzHJahrePlusEins = value;
    }

    /**
     * Die Laufzeit in Jahren plus ein Jahr
     */
    public int getAnzJahrePlusEins() {
        return anzJahrePlusEins;
    }

    /**
     * Sets the value of the anzJahrePlusEins property.
     */
    public void setAnzJahrePlusEins(int value) {
        this.anzJahrePlusEins = value;
    }

    /**
     * Die Laufzeit als Text.
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

}
