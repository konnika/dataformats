
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Eine Liste von Geschäften eventuell mit zusätzlichen Ergebnissen.
 *
 * <p>Java class for Geschaefte complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Geschaefte">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Geschaeft" type="{http://www.gillardon.de/marzipan/integrationsservice}Geschaeft" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geschaefte", propOrder = {
        "geschaeft"
})
public class Geschaefte {

    @XmlElement(name = "Geschaeft")
    protected List<Geschaeft> geschaeft;

    /**
     * Gets the value of the geschaeft property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geschaeft property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGeschaeft().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Geschaeft }
     * </p>
     *
     * @return The value of the geschaeft property.
     */
    public List<Geschaeft> getGeschaeft() {
        if (geschaeft == null) {
            geschaeft = new ArrayList<>();
        }
        return this.geschaeft;
    }

}
