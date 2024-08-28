
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Die q-Faktor Tabelle.
 *
 * <p>Java class for RisikokonfigurationQFaktoren complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RisikokonfigurationQFaktoren">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="risikokonfigurationQFaktor" type="{http://www.gillardon.de/marzipan/integrationsservice}RisikokonfigurationQFaktor" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisikokonfigurationQFaktoren", propOrder = {
        "risikokonfigurationQFaktor"
})
public class RisikokonfigurationQFaktoren {

    /**
     * q-Faktor Tabelle
     */
    protected List<RisikokonfigurationQFaktor> risikokonfigurationQFaktor;

    /**
     * q-Faktor Tabelle
     * <p>
     * Gets the value of the risikokonfigurationQFaktor property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the risikokonfigurationQFaktor property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRisikokonfigurationQFaktor().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RisikokonfigurationQFaktor }
     * </p>
     *
     * @return The value of the risikokonfigurationQFaktor property.
     */
    public List<RisikokonfigurationQFaktor> getRisikokonfigurationQFaktor() {
        if (risikokonfigurationQFaktor == null) {
            risikokonfigurationQFaktor = new ArrayList<>();
        }
        return this.risikokonfigurationQFaktor;
    }

}
