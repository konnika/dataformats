
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste mit Vorhaltewerten.
 *
 * <p>Java class for KostenVorhaltewerte complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="KostenVorhaltewerte">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="vorhaltewert" type="{http://www.gillardon.de/marzipan/integrationsservice}Vorhaltewert" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KostenVorhaltewerte", propOrder = {
        "vorhaltewert"
})
public class KostenVorhaltewerte {

    /**
     * Liste mit Vorhaltewerten, falls der Vorhaltewert in Abhängigkeit eines Kriteriums
     * (siehe Vorhaltewerttyp) gestaffelt ist
     */
    protected List<Vorhaltewert> vorhaltewert;

    /**
     * Liste mit Vorhaltewerten, falls der Vorhaltewert in Abhängigkeit eines Kriteriums
     * (siehe Vorhaltewerttyp) gestaffelt ist
     * <p>
     * Gets the value of the vorhaltewert property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vorhaltewert property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVorhaltewert().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vorhaltewert }
     * </p>
     *
     * @return The value of the vorhaltewert property.
     */
    public List<Vorhaltewert> getVorhaltewert() {
        if (vorhaltewert == null) {
            vorhaltewert = new ArrayList<>();
        }
        return this.vorhaltewert;
    }

}
