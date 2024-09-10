
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Vertragliche Raten bei Tilgungsdarlehen oder Annuitätendarlehen.
 * Kundenspezifische Erweiterung für Universaldarlehen.
 *
 * <p>Java class for Ratenstufen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Ratenstufen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ratenstufe" type="{http://www.gillardon.de/marzipan/integrationsservice}Ratenstufe" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ratenstufen", propOrder = {
        "ratenstufe"
})
public class Ratenstufen {

    protected List<Ratenstufe> ratenstufe;

    /**
     * Gets the value of the ratenstufe property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratenstufe property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRatenstufe().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ratenstufe }
     * </p>
     *
     * @return The value of the ratenstufe property.
     */
    public List<Ratenstufe> getRatenstufe() {
        if (ratenstufe == null) {
            ratenstufe = new ArrayList<>();
        }
        return this.ratenstufe;
    }

}
