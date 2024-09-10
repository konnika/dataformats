
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste mit Ausfallwahrscheinlichkeiten der Ratingklassen in Prozent je Laufzeit.
 *
 * <p>Java class for Ausfallwahrscheinlichkeiten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Ausfallwahrscheinlichkeiten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ausfallwahrscheinlichkeit" type="{http://www.gillardon.de/marzipan/integrationsservice}Ausfallwahrscheinlichkeit" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ausfallwahrscheinlichkeiten", propOrder = {
        "ausfallwahrscheinlichkeit"
})
public class Ausfallwahrscheinlichkeiten {

    /**
     * Liste mit Ausfallwahrscheinlichkeiten der Ratingklassen in Prozent je Laufzeit.
     */
    @XmlElement(required = true)
    protected List<Ausfallwahrscheinlichkeit> ausfallwahrscheinlichkeit;

    /**
     * Liste mit Ausfallwahrscheinlichkeiten der Ratingklassen in Prozent je Laufzeit.
     * <p>
     * Gets the value of the ausfallwahrscheinlichkeit property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ausfallwahrscheinlichkeit property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAusfallwahrscheinlichkeit().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ausfallwahrscheinlichkeit }
     * </p>
     *
     * @return The value of the ausfallwahrscheinlichkeit property.
     */
    public List<Ausfallwahrscheinlichkeit> getAusfallwahrscheinlichkeit() {
        if (ausfallwahrscheinlichkeit == null) {
            ausfallwahrscheinlichkeit = new ArrayList<>();
        }
        return this.ausfallwahrscheinlichkeit;
    }

}
