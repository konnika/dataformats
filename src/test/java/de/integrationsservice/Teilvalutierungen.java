
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Teilauszahlungen des Darlehens.
 *
 * <p>Java class for Teilvalutierungen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Teilvalutierungen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="teilvalutierung" type="{http://www.gillardon.de/marzipan/integrationsservice}Teilvalutierung" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Teilvalutierungen", propOrder = {
        "teilvalutierung"
})
public class Teilvalutierungen {

    protected List<Teilvalutierung> teilvalutierung;

    /**
     * Gets the value of the teilvalutierung property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teilvalutierung property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeilvalutierung().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Teilvalutierung }
     * </p>
     *
     * @return The value of the teilvalutierung property.
     */
    public List<Teilvalutierung> getTeilvalutierung() {
        if (teilvalutierung == null) {
            teilvalutierung = new ArrayList<>();
        }
        return this.teilvalutierung;
    }

}
