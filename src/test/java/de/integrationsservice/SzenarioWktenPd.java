
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufsichtsrechtliche 1-Jahres-Ausfallwahrscheinlichkeit je Ratingklasse.
 *
 * <p>Java class for SzenarioWktenPd complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="SzenarioWktenPd">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="pd" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="bonitaet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SzenarioWktenPd", propOrder = {

})
public class SzenarioWktenPd {

    /**
     * Die Höhe der aufsichtsrechtlichen 1-Jahres-Ausfallwahrscheinlichkeit in Prozent.
     */
    protected double pd;
    /**
     * Name der Bonität/Ratingklasse (Bonitaet::bnote).
     */
    @XmlElement(required = true)
    protected String bonitaet;

    /**
     * Die Höhe der aufsichtsrechtlichen 1-Jahres-Ausfallwahrscheinlichkeit in Prozent.
     */
    public double getPd() {
        return pd;
    }

    /**
     * Sets the value of the pd property.
     */
    public void setPd(double value) {
        this.pd = value;
    }

    /**
     * Name der Bonität/Ratingklasse (Bonitaet::bnote).
     *
     * @return possible object is
     * {@link String }
     */
    public String getBonitaet() {
        return bonitaet;
    }

    /**
     * Sets the value of the bonitaet property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getBonitaet()
     */
    public void setBonitaet(String value) {
        this.bonitaet = value;
    }

}
