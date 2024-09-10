
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste mit Migrationswahrscheinlichkeiten der Ratingklassen.
 *
 * <p>Java class for Migrationswahrscheinlichkeiten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Migrationswahrscheinlichkeiten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="migrationswahrscheinlichkeit" type="{http://www.gillardon.de/marzipan/integrationsservice}Migrationswahrscheinlichkeit" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Migrationswahrscheinlichkeiten", propOrder = {
        "migrationswahrscheinlichkeit"
})
public class Migrationswahrscheinlichkeiten {

    /**
     * Enthält Informationen zu einer Migrationswahrscheinlichkeit.
     */
    @XmlElement(required = true)
    protected List<Migrationswahrscheinlichkeit> migrationswahrscheinlichkeit;

    /**
     * Enthält Informationen zu einer Migrationswahrscheinlichkeit.
     * <p>
     * Gets the value of the migrationswahrscheinlichkeit property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the migrationswahrscheinlichkeit property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMigrationswahrscheinlichkeit().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Migrationswahrscheinlichkeit }
     * </p>
     *
     * @return The value of the migrationswahrscheinlichkeit property.
     */
    public List<Migrationswahrscheinlichkeit> getMigrationswahrscheinlichkeit() {
        if (migrationswahrscheinlichkeit == null) {
            migrationswahrscheinlichkeit = new ArrayList<>();
        }
        return this.migrationswahrscheinlichkeit;
    }

}
