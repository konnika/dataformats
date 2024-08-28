
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Informationen über die zu erzeugenden Teilgeschäfte.
 *
 * <p>Java class for Teilgeschaefte complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Teilgeschaefte">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="teilgeschaeft" type="{http://www.gillardon.de/marzipan/integrationsservice}Teilgeschaeft" maxOccurs="unbounded" minOccurs="2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Teilgeschaefte", propOrder = {
        "teilgeschaeft"
})
public class Teilgeschaefte {

    @XmlElement(required = true)
    protected List<Teilgeschaeft> teilgeschaeft;

    /**
     * Gets the value of the teilgeschaeft property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teilgeschaeft property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeilgeschaeft().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Teilgeschaeft }
     * </p>
     *
     * @return The value of the teilgeschaeft property.
     */
    public List<Teilgeschaeft> getTeilgeschaeft() {
        if (teilgeschaeft == null) {
            teilgeschaeft = new ArrayList<>();
        }
        return this.teilgeschaeft;
    }

}
