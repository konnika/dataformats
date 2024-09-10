
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Aufsichtsrechtliche 1-Jahres-Ausfallwahrscheinlichkeiten der Ratingklassen.
 *
 * <p>Java class for SzenarioWktenPds complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="SzenarioWktenPds">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="aufsichtsrechtlicheausfallwkt" type="{http://www.gillardon.de/marzipan/integrationsservice}SzenarioWktenPd" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SzenarioWktenPds", propOrder = {
        "aufsichtsrechtlicheausfallwkt"
})
public class SzenarioWktenPds {

    /**
     * Liste mit aufsichtsrechtlichen 1-Jahres-Ausfallwahrscheinlichkeiten der Ratingklassen.
     */
    @XmlElement(required = true)
    protected List<SzenarioWktenPd> aufsichtsrechtlicheausfallwkt;

    /**
     * Liste mit aufsichtsrechtlichen 1-Jahres-Ausfallwahrscheinlichkeiten der Ratingklassen.
     * <p>
     * Gets the value of the aufsichtsrechtlicheausfallwkt property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aufsichtsrechtlicheausfallwkt property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAufsichtsrechtlicheausfallwkt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SzenarioWktenPd }
     * </p>
     *
     * @return The value of the aufsichtsrechtlicheausfallwkt property.
     */
    public List<SzenarioWktenPd> getAufsichtsrechtlicheausfallwkt() {
        if (aufsichtsrechtlicheausfallwkt == null) {
            aufsichtsrechtlicheausfallwkt = new ArrayList<>();
        }
        return this.aufsichtsrechtlicheausfallwkt;
    }

}
