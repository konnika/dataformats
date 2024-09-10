
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Regelmäßige Kosten als Prozentsatz der Restschuld
 *
 * <p>Java class for RegelmaessigeKostenProzent complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RegelmaessigeKostenProzent">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kosten" type="{http://www.gillardon.de/marzipan/integrationsservice}RegelmaessigeKostenProzentKosten" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegelmaessigeKostenProzent", propOrder = {
        "kosten"
})
public class RegelmaessigeKostenProzent {

    protected List<RegelmaessigeKostenProzentKosten> kosten;

    /**
     * Gets the value of the kosten property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kosten property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKosten().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegelmaessigeKostenProzentKosten }
     * </p>
     *
     * @return The value of the kosten property.
     */
    public List<RegelmaessigeKostenProzentKosten> getKosten() {
        if (kosten == null) {
            kosten = new ArrayList<>();
        }
        return this.kosten;
    }

}
