
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Vertraglich festgelegter Zinssatzwechsel
 *
 * <p>Java class for Zinswechsel complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Zinswechsel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="neuerzinssatz" type="{http://www.gillardon.de/marzipan/integrationsservice}Neuerzinssatz" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zinswechsel", propOrder = {
        "neuerzinssatz"
})
public class Zinswechsel {

    protected List<Neuerzinssatz> neuerzinssatz;

    /**
     * Gets the value of the neuerzinssatz property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neuerzinssatz property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNeuerzinssatz().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Neuerzinssatz }
     * </p>
     *
     * @return The value of the neuerzinssatz property.
     */
    public List<Neuerzinssatz> getNeuerzinssatz() {
        if (neuerzinssatz == null) {
            neuerzinssatz = new ArrayList<>();
        }
        return this.neuerzinssatz;
    }

}
