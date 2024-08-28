
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Daten für optionale Tilgungsrechte (Darlehen) bzw. Verfügungsrechte/Kündigungsrechte (Sparen).
 *
 * <p>Java class for Optionsrechte complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Optionsrechte">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="optionsrecht" type="{http://www.gillardon.de/marzipan/integrationsservice}Optionsrecht" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Optionsrechte", propOrder = {
        "optionsrecht"
})
public class Optionsrechte {

    protected List<Optionsrecht> optionsrecht;

    /**
     * Gets the value of the optionsrecht property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionsrecht property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOptionsrecht().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Optionsrecht }
     * </p>
     *
     * @return The value of the optionsrecht property.
     */
    public List<Optionsrecht> getOptionsrecht() {
        if (optionsrecht == null) {
            optionsrecht = new ArrayList<>();
        }
        return this.optionsrecht;
    }

}
