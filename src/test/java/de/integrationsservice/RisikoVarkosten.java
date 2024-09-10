
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Eine Liste von Risiko variablen Kosten.
 *
 * <p>Java class for RisikoVarkosten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RisikoVarkosten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="risikoVarkost" type="{http://www.gillardon.de/marzipan/integrationsservice}RisikoVarkost" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisikoVarkosten", propOrder = {
        "risikoVarkost"
})
public class RisikoVarkosten {

    protected List<RisikoVarkost> risikoVarkost;

    /**
     * Gets the value of the risikoVarkost property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the risikoVarkost property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRisikoVarkost().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RisikoVarkost }
     * </p>
     *
     * @return The value of the risikoVarkost property.
     */
    public List<RisikoVarkost> getRisikoVarkost() {
        if (risikoVarkost == null) {
            risikoVarkost = new ArrayList<>();
        }
        return this.risikoVarkost;
    }

}
