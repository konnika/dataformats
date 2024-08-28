
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Eine Liste von Risikokonfigurationen.
 *
 * <p>Java class for Risikokonfigurationen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Risikokonfigurationen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="risikokonfiguration" type="{http://www.gillardon.de/marzipan/integrationsservice}Risikokonfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Risikokonfigurationen", propOrder = {
        "risikokonfiguration"
})
public class Risikokonfigurationen {

    protected List<Risikokonfiguration> risikokonfiguration;

    /**
     * Gets the value of the risikokonfiguration property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the risikokonfiguration property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRisikokonfiguration().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Risikokonfiguration }
     * </p>
     *
     * @return The value of the risikokonfiguration property.
     */
    public List<Risikokonfiguration> getRisikokonfiguration() {
        if (risikokonfiguration == null) {
            risikokonfiguration = new ArrayList<>();
        }
        return this.risikokonfiguration;
    }

}
