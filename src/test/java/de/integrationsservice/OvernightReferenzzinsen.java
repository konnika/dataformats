
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Referenzzinsen für Roll-Over Overnight.
 *
 * <p>Java class for OvernightReferenzzinsen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="OvernightReferenzzinsen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="overnightReferenzzins" type="{http://www.gillardon.de/marzipan/integrationsservice}OvernightReferenzzins" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvernightReferenzzinsen", propOrder = {
        "overnightReferenzzins"
})
public class OvernightReferenzzinsen {

    protected List<OvernightReferenzzins> overnightReferenzzins;

    /**
     * Gets the value of the overnightReferenzzins property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overnightReferenzzins property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOvernightReferenzzins().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvernightReferenzzins }
     * </p>
     *
     * @return The value of the overnightReferenzzins property.
     */
    public List<OvernightReferenzzins> getOvernightReferenzzins() {
        if (overnightReferenzzins == null) {
            overnightReferenzzins = new ArrayList<>();
        }
        return this.overnightReferenzzins;
    }

}
