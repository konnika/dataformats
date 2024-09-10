
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Vertragliche Tilgungssatzwechsel bei
 * Annuitätendarlehen.
 *
 * <p>Java class for Tilgungssatzwechsel complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Tilgungssatzwechsel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="neuertilgungssatz" type="{http://www.gillardon.de/marzipan/integrationsservice}Neuertilgungssatz" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tilgungssatzwechsel", propOrder = {
        "neuertilgungssatz"
})
public class Tilgungssatzwechsel {

    protected List<Neuertilgungssatz> neuertilgungssatz;

    /**
     * Gets the value of the neuertilgungssatz property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neuertilgungssatz property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNeuertilgungssatz().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Neuertilgungssatz }
     * </p>
     *
     * @return The value of the neuertilgungssatz property.
     */
    public List<Neuertilgungssatz> getNeuertilgungssatz() {
        if (neuertilgungssatz == null) {
            neuertilgungssatz = new ArrayList<>();
        }
        return this.neuertilgungssatz;
    }

}
