
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste der Verwaltungsdaten
 *
 * <p>Java class for Verwaltungsdaten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Verwaltungsdaten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="verwaltungsdatenwert" type="{http://www.gillardon.de/marzipan/integrationsservice}Verwaltungsdatenwert" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verwaltungsdaten", propOrder = {
        "verwaltungsdatenwert"
})
public class Verwaltungsdaten {

    protected List<Verwaltungsdatenwert> verwaltungsdatenwert;

    /**
     * Gets the value of the verwaltungsdatenwert property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verwaltungsdatenwert property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVerwaltungsdatenwert().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Verwaltungsdatenwert }
     * </p>
     *
     * @return The value of the verwaltungsdatenwert property.
     */
    public List<Verwaltungsdatenwert> getVerwaltungsdatenwert() {
        if (verwaltungsdatenwert == null) {
            verwaltungsdatenwert = new ArrayList<>();
        }
        return this.verwaltungsdatenwert;
    }

}
