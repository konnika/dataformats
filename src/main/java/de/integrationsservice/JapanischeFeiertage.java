
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Japanische Feiertage
 *
 * <p>Java class for JapanischeFeiertage complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="JapanischeFeiertage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="vernal_equinox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JapanischeFeiertage", propOrder = {

})
public class JapanischeFeiertage {

    @XmlElement(name = "vernal_equinox", defaultValue = "false")
    protected Boolean vernalEquinox;

    /**
     * Gets the value of the vernalEquinox property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVernalEquinox() {
        return vernalEquinox;
    }

    /**
     * Sets the value of the vernalEquinox property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setVernalEquinox(Boolean value) {
        this.vernalEquinox = value;
    }

}
