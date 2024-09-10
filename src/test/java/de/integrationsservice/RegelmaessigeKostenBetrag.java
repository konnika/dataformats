
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Regelmäßige Kosten als Betrag.
 *
 * <p>Java class for RegelmaessigeKostenBetrag complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RegelmaessigeKostenBetrag">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kosten" type="{http://www.gillardon.de/marzipan/integrationsservice}RegelmaessigeKostenBetragKosten" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegelmaessigeKostenBetrag", propOrder = {
        "kosten"
})
public class RegelmaessigeKostenBetrag {

    protected List<RegelmaessigeKostenBetragKosten> kosten;

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
     * {@link RegelmaessigeKostenBetragKosten }
     * </p>
     *
     * @return The value of the kosten property.
     */
    public List<RegelmaessigeKostenBetragKosten> getKosten() {
        if (kosten == null) {
            kosten = new ArrayList<>();
        }
        return this.kosten;
    }

}
