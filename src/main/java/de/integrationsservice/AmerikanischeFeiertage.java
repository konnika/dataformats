
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Amerikanische Feiertage
 *
 * <p>Java class for AmerikanischeFeiertage complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AmerikanischeFeiertage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="martin_luther_king_day" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="president_day" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="memorial_day" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="labor_day" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="columbus_day" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="thanksgiving_day" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmerikanischeFeiertage", propOrder = {

})
public class AmerikanischeFeiertage {

    @XmlElement(name = "martin_luther_king_day", defaultValue = "false")
    protected Boolean martinLutherKingDay;
    @XmlElement(name = "president_day", defaultValue = "false")
    protected Boolean presidentDay;
    @XmlElement(name = "memorial_day", defaultValue = "false")
    protected Boolean memorialDay;
    @XmlElement(name = "labor_day", defaultValue = "false")
    protected Boolean laborDay;
    @XmlElement(name = "columbus_day", defaultValue = "false")
    protected Boolean columbusDay;
    @XmlElement(name = "thanksgiving_day", defaultValue = "false")
    protected Boolean thanksgivingDay;

    /**
     * Gets the value of the martinLutherKingDay property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMartinLutherKingDay() {
        return martinLutherKingDay;
    }

    /**
     * Sets the value of the martinLutherKingDay property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMartinLutherKingDay(Boolean value) {
        this.martinLutherKingDay = value;
    }

    /**
     * Gets the value of the presidentDay property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPresidentDay() {
        return presidentDay;
    }

    /**
     * Sets the value of the presidentDay property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPresidentDay(Boolean value) {
        this.presidentDay = value;
    }

    /**
     * Gets the value of the memorialDay property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMemorialDay() {
        return memorialDay;
    }

    /**
     * Sets the value of the memorialDay property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMemorialDay(Boolean value) {
        this.memorialDay = value;
    }

    /**
     * Gets the value of the laborDay property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isLaborDay() {
        return laborDay;
    }

    /**
     * Sets the value of the laborDay property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setLaborDay(Boolean value) {
        this.laborDay = value;
    }

    /**
     * Gets the value of the columbusDay property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isColumbusDay() {
        return columbusDay;
    }

    /**
     * Sets the value of the columbusDay property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setColumbusDay(Boolean value) {
        this.columbusDay = value;
    }

    /**
     * Gets the value of the thanksgivingDay property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isThanksgivingDay() {
        return thanksgivingDay;
    }

    /**
     * Sets the value of the thanksgivingDay property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setThanksgivingDay(Boolean value) {
        this.thanksgivingDay = value;
    }

}
