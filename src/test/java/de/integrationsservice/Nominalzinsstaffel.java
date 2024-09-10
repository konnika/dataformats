
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Nominalzinsstaffel
 *
 * <p>Java class for Nominalzinsstaffel complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Nominalzinsstaffel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="neuernominalzins" type="{http://www.gillardon.de/marzipan/integrationsservice}Neuernominalzins" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nominalzinsstaffel", propOrder = {
        "neuernominalzins"
})
public class Nominalzinsstaffel {

    protected List<Neuernominalzins> neuernominalzins;

    /**
     * Gets the value of the neuernominalzins property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neuernominalzins property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNeuernominalzins().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Neuernominalzins }
     * </p>
     *
     * @return The value of the neuernominalzins property.
     */
    public List<Neuernominalzins> getNeuernominalzins() {
        if (neuernominalzins == null) {
            neuernominalzins = new ArrayList<>();
        }
        return this.neuernominalzins;
    }

}
