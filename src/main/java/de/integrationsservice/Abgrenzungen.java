
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Zins-, Gebühren- und Disagioabgrenzungen.
 *
 * <p>Java class for Abgrenzungen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Abgrenzungen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="abgrenzung" type="{http://www.gillardon.de/marzipan/integrationsservice}Abgrenzung" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Abgrenzungen", propOrder = {
        "abgrenzung"
})
public class Abgrenzungen {

    protected List<Abgrenzung> abgrenzung;

    /**
     * Gets the value of the abgrenzung property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abgrenzung property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAbgrenzung().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Abgrenzung }
     * </p>
     *
     * @return The value of the abgrenzung property.
     */
    public List<Abgrenzung> getAbgrenzung() {
        if (abgrenzung == null) {
            abgrenzung = new ArrayList<>();
        }
        return this.abgrenzung;
    }

}
