
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Optionale Sondertilgungsrechte, die dem Kunden zugesagt sind.
 *
 * <p>Java class for ApeSondertilgungen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ApeSondertilgungen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="apeSondertilgung" type="{http://www.gillardon.de/marzipan/integrationsservice}ApeSondertilgung" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApeSondertilgungen", propOrder = {
        "apeSondertilgung"
})
public class ApeSondertilgungen {

    protected List<ApeSondertilgung> apeSondertilgung;

    /**
     * Gets the value of the apeSondertilgung property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apeSondertilgung property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getApeSondertilgung().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApeSondertilgung }
     * </p>
     *
     * @return The value of the apeSondertilgung property.
     */
    public List<ApeSondertilgung> getApeSondertilgung() {
        if (apeSondertilgung == null) {
            apeSondertilgung = new ArrayList<>();
        }
        return this.apeSondertilgung;
    }

}
