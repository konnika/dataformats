
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Vertraglich festgelegte Ratenwechsel bei Tilgungsdarlehen.
 *
 * <p>Java class for Ratenwechsel complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Ratenwechsel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="neuerate" type="{http://www.gillardon.de/marzipan/integrationsservice}Neuerate" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ratenwechsel", propOrder = {
        "neuerate"
})
public class Ratenwechsel {

    protected List<Neuerate> neuerate;

    /**
     * Gets the value of the neuerate property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neuerate property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNeuerate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Neuerate }
     * </p>
     *
     * @return The value of the neuerate property.
     */
    public List<Neuerate> getNeuerate() {
        if (neuerate == null) {
            neuerate = new ArrayList<>();
        }
        return this.neuerate;
    }

}
