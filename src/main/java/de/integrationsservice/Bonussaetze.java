
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Bonusstaffel für Bonus nach Laufzeit oder Datum.
 *
 * <p>Java class for Bonussaetze complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Bonussaetze">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="bonussatz" type="{http://www.gillardon.de/marzipan/integrationsservice}Bonussatz" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bonussaetze", propOrder = {
        "bonussatz"
})
public class Bonussaetze {

    protected List<Bonussatz> bonussatz;

    /**
     * Gets the value of the bonussatz property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bonussatz property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBonussatz().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bonussatz }
     * </p>
     *
     * @return The value of the bonussatz property.
     */
    public List<Bonussatz> getBonussatz() {
        if (bonussatz == null) {
            bonussatz = new ArrayList<>();
        }
        return this.bonussatz;
    }

}
