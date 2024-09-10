
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Kontosicherheiten
 *
 * <p>Java class for KontoSicherheiten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="KontoSicherheiten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kontoSicherheit" type="{http://www.gillardon.de/marzipan/integrationsservice}KontoSicherheit" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KontoSicherheiten", propOrder = {
        "kontoSicherheit"
})
public class KontoSicherheiten {

    protected List<KontoSicherheit> kontoSicherheit;

    /**
     * Gets the value of the kontoSicherheit property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kontoSicherheit property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKontoSicherheit().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KontoSicherheit }
     * </p>
     *
     * @return The value of the kontoSicherheit property.
     */
    public List<KontoSicherheit> getKontoSicherheit() {
        if (kontoSicherheit == null) {
            kontoSicherheit = new ArrayList<>();
        }
        return this.kontoSicherheit;
    }

}
