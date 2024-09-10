
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Britische Feiertage
 *
 * <p>Java class for BritischeFeiertage complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="BritischeFeiertage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="early_may_bank" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="late_may_bank" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="summer_bank" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="christmas_boxing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BritischeFeiertage", propOrder = {

})
public class BritischeFeiertage {

    @XmlElement(name = "early_may_bank", defaultValue = "false")
    protected Boolean earlyMayBank;
    @XmlElement(name = "late_may_bank", defaultValue = "false")
    protected Boolean lateMayBank;
    @XmlElement(name = "summer_bank", defaultValue = "false")
    protected Boolean summerBank;
    @XmlElement(name = "christmas_boxing", defaultValue = "false")
    protected Boolean christmasBoxing;

    /**
     * Gets the value of the earlyMayBank property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isEarlyMayBank() {
        return earlyMayBank;
    }

    /**
     * Sets the value of the earlyMayBank property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setEarlyMayBank(Boolean value) {
        this.earlyMayBank = value;
    }

    /**
     * Gets the value of the lateMayBank property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isLateMayBank() {
        return lateMayBank;
    }

    /**
     * Sets the value of the lateMayBank property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setLateMayBank(Boolean value) {
        this.lateMayBank = value;
    }

    /**
     * Gets the value of the summerBank property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSummerBank() {
        return summerBank;
    }

    /**
     * Sets the value of the summerBank property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSummerBank(Boolean value) {
        this.summerBank = value;
    }

    /**
     * Gets the value of the christmasBoxing property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isChristmasBoxing() {
        return christmasBoxing;
    }

    /**
     * Sets the value of the christmasBoxing property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setChristmasBoxing(Boolean value) {
        this.christmasBoxing = value;
    }

}
