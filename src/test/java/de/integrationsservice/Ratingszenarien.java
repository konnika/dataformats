
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Eine Liste von Ratingszenarien.
 *
 * <p>Java class for Ratingszenarien complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Ratingszenarien">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ratingszenario" type="{http://www.gillardon.de/marzipan/integrationsservice}Ratingszenario" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ratingszenarien", propOrder = {
        "ratingszenario"
})
public class Ratingszenarien {

    protected List<Ratingszenario> ratingszenario;

    /**
     * Gets the value of the ratingszenario property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingszenario property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRatingszenario().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ratingszenario }
     * </p>
     *
     * @return The value of the ratingszenario property.
     */
    public List<Ratingszenario> getRatingszenario() {
        if (ratingszenario == null) {
            ratingszenario = new ArrayList<>();
        }
        return this.ratingszenario;
    }

}
