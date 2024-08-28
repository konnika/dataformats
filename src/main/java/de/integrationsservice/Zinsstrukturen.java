
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Eine Liste von Zinsstrukturen.
 *
 * <p>Java class for Zinsstrukturen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Zinsstrukturen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="zinsstruktur" type="{http://www.gillardon.de/marzipan/integrationsservice}Zinsstruktur" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zinsstrukturen", propOrder = {
        "zinsstruktur"
})
public class Zinsstrukturen {

    protected List<Zinsstruktur> zinsstruktur;

    /**
     * Gets the value of the zinsstruktur property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zinsstruktur property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getZinsstruktur().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zinsstruktur }
     * </p>
     *
     * @return The value of the zinsstruktur property.
     */
    public List<Zinsstruktur> getZinsstruktur() {
        if (zinsstruktur == null) {
            zinsstruktur = new ArrayList<>();
        }
        return this.zinsstruktur;
    }

}
