
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Zinsstaffel eines Sparengeschäfts für Zins nach Laufzeit, Datum, Kontostand oder Kombinationen.
 *
 * <p>Java class for Zinssaetze complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Zinssaetze">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="zinssatz" type="{http://www.gillardon.de/marzipan/integrationsservice}Zinssatz" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zinssaetze", propOrder = {
        "zinssatz"
})
public class Zinssaetze {

    protected List<Zinssatz> zinssatz;

    /**
     * Gets the value of the zinssatz property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zinssatz property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getZinssatz().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zinssatz }
     * </p>
     *
     * @return The value of the zinssatz property.
     */
    public List<Zinssatz> getZinssatz() {
        if (zinssatz == null) {
            zinssatz = new ArrayList<>();
        }
        return this.zinssatz;
    }

}
