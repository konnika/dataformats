
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste mit Bonitaeten(=Ratingklassen).
 * siehe globalen komplexen Typ Bonitaet
 *
 * <p>Java class for Bonitaeten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Bonitaeten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="bonitaet" type="{http://www.gillardon.de/marzipan/integrationsservice}Bonitaet" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bonitaeten", propOrder = {
        "bonitaet"
})
public class Bonitaeten {

    @XmlElement(required = true)
    protected List<Bonitaet> bonitaet;

    /**
     * Gets the value of the bonitaet property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bonitaet property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBonitaet().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bonitaet }
     * </p>
     *
     * @return The value of the bonitaet property.
     */
    public List<Bonitaet> getBonitaet() {
        if (bonitaet == null) {
            bonitaet = new ArrayList<>();
        }
        return this.bonitaet;
    }

}
