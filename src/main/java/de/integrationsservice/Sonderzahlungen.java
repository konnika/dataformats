
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Vertragliche Sonderzahlungen innerhalb der Laufzeit des Darlehens.
 *
 * <p>Java class for Sonderzahlungen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Sonderzahlungen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sonderzahlung" type="{http://www.gillardon.de/marzipan/integrationsservice}Sonderzahlung" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sonderzahlungen", propOrder = {
        "sonderzahlung"
})
public class Sonderzahlungen {

    protected List<Sonderzahlung> sonderzahlung;

    /**
     * Gets the value of the sonderzahlung property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sonderzahlung property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSonderzahlung().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sonderzahlung }
     * </p>
     *
     * @return The value of the sonderzahlung property.
     */
    public List<Sonderzahlung> getSonderzahlung() {
        if (sonderzahlung == null) {
            sonderzahlung = new ArrayList<>();
        }
        return this.sonderzahlung;
    }

}
