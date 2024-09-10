
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Zinsanpassungstermine.
 *
 * <p>Java class for Zinsanpassungstermine complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Zinsanpassungstermine">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="zinsanpassungstermin" type="{http://www.gillardon.de/marzipan/integrationsservice}Zinsanpassungstermin" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zinsanpassungstermine", propOrder = {
        "zinsanpassungstermin"
})
public class Zinsanpassungstermine {

    protected List<Zinsanpassungstermin> zinsanpassungstermin;

    /**
     * Gets the value of the zinsanpassungstermin property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zinsanpassungstermin property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getZinsanpassungstermin().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zinsanpassungstermin }
     * </p>
     *
     * @return The value of the zinsanpassungstermin property.
     */
    public List<Zinsanpassungstermin> getZinsanpassungstermin() {
        if (zinsanpassungstermin == null) {
            zinsanpassungstermin = new ArrayList<>();
        }
        return this.zinsanpassungstermin;
    }

}
