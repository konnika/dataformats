
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Die Tabelle für die Dynamisierung der Parameter für das gezeichnete Kapital.
 *
 * <p>Java class for RisikokonfigurationParameterDynamisierungstabelle complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RisikokonfigurationParameterDynamisierungstabelle">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="gezeichnetesKapital" type="{http://www.gillardon.de/marzipan/integrationsservice}GezeichnetesKapital" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisikokonfigurationParameterDynamisierungstabelle", propOrder = {
        "gezeichnetesKapital"
})
public class RisikokonfigurationParameterDynamisierungstabelle {

    /**
     * Enthält Informationen zu einem Jahr.
     */
    @XmlElement(required = true)
    protected List<GezeichnetesKapital> gezeichnetesKapital;

    /**
     * Enthält Informationen zu einem Jahr.
     * <p>
     * Gets the value of the gezeichnetesKapital property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gezeichnetesKapital property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGezeichnetesKapital().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GezeichnetesKapital }
     * </p>
     *
     * @return The value of the gezeichnetesKapital property.
     */
    public List<GezeichnetesKapital> getGezeichnetesKapital() {
        if (gezeichnetesKapital == null) {
            gezeichnetesKapital = new ArrayList<>();
        }
        return this.gezeichnetesKapital;
    }

}
