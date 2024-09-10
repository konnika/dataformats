
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste der festen Feiertage des Finanzplatzes
 *
 * <p>Java class for FesteFeiertage complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FesteFeiertage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="feiertag" type="{http://www.gillardon.de/marzipan/integrationsservice}Feiertag" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FesteFeiertage", propOrder = {
        "feiertag"
})
public class FesteFeiertage {

    /**
     * Fester Feiertag
     */
    protected List<Feiertag> feiertag;

    /**
     * Fester Feiertag
     * <p>
     * Gets the value of the feiertag property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feiertag property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeiertag().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feiertag }
     * </p>
     *
     * @return The value of the feiertag property.
     */
    public List<Feiertag> getFeiertag() {
        if (feiertag == null) {
            feiertag = new ArrayList<>();
        }
        return this.feiertag;
    }

}
