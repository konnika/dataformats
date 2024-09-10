
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste der Geschäftsdaten - Institutskriterien (Auswahl)
 *
 * <p>Java class for InstitutskriterienAuswahl complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="InstitutskriterienAuswahl">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="institutskriteriaAuswahl" type="{http://www.gillardon.de/marzipan/integrationsservice}InstitutskriteriaAuswahl" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitutskriterienAuswahl", propOrder = {
        "institutskriteriaAuswahl"
})
public class InstitutskriterienAuswahl {

    protected List<InstitutskriteriaAuswahl> institutskriteriaAuswahl;

    /**
     * Gets the value of the institutskriteriaAuswahl property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the institutskriteriaAuswahl property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInstitutskriteriaAuswahl().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstitutskriteriaAuswahl }
     * </p>
     *
     * @return The value of the institutskriteriaAuswahl property.
     */
    public List<InstitutskriteriaAuswahl> getInstitutskriteriaAuswahl() {
        if (institutskriteriaAuswahl == null) {
            institutskriteriaAuswahl = new ArrayList<>();
        }
        return this.institutskriteriaAuswahl;
    }

}
