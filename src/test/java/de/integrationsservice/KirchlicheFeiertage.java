
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Liste der kirchlichen Feiertage des Finanzplatzes
 *
 * <p>Java class for KirchlicheFeiertage complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="KirchlicheFeiertage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="karfreitag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ostermontag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="himmelfahrt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="pfingstmontag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="fronleichnam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="busstag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KirchlicheFeiertage", propOrder = {

})
public class KirchlicheFeiertage {

    @XmlElement(defaultValue = "false")
    protected Boolean karfreitag;
    @XmlElement(defaultValue = "false")
    protected Boolean ostermontag;
    @XmlElement(defaultValue = "false")
    protected Boolean himmelfahrt;
    @XmlElement(defaultValue = "false")
    protected Boolean pfingstmontag;
    @XmlElement(defaultValue = "false")
    protected Boolean fronleichnam;
    @XmlElement(defaultValue = "false")
    protected Boolean busstag;

    /**
     * Gets the value of the karfreitag property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isKarfreitag() {
        return karfreitag;
    }

    /**
     * Sets the value of the karfreitag property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setKarfreitag(Boolean value) {
        this.karfreitag = value;
    }

    /**
     * Gets the value of the ostermontag property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isOstermontag() {
        return ostermontag;
    }

    /**
     * Sets the value of the ostermontag property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setOstermontag(Boolean value) {
        this.ostermontag = value;
    }

    /**
     * Gets the value of the himmelfahrt property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isHimmelfahrt() {
        return himmelfahrt;
    }

    /**
     * Sets the value of the himmelfahrt property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setHimmelfahrt(Boolean value) {
        this.himmelfahrt = value;
    }

    /**
     * Gets the value of the pfingstmontag property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPfingstmontag() {
        return pfingstmontag;
    }

    /**
     * Sets the value of the pfingstmontag property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPfingstmontag(Boolean value) {
        this.pfingstmontag = value;
    }

    /**
     * Gets the value of the fronleichnam property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isFronleichnam() {
        return fronleichnam;
    }

    /**
     * Sets the value of the fronleichnam property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setFronleichnam(Boolean value) {
        this.fronleichnam = value;
    }

    /**
     * Gets the value of the busstag property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBusstag() {
        return busstag;
    }

    /**
     * Sets the value of the busstag property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setBusstag(Boolean value) {
        this.busstag = value;
    }

}
