
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste der Geschäftsdaten - Institutskriterien (Wert)
 *
 * <p>Java class for InstitutskriterienWert complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="InstitutskriterienWert">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="institutskriteriaWert" type="{http://www.gillardon.de/marzipan/integrationsservice}InstitutskriteriaWert" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitutskriterienWert", propOrder = {
        "institutskriteriaWert"
})
public class InstitutskriterienWert {

    protected List<InstitutskriteriaWert> institutskriteriaWert;

    /**
     * Gets the value of the institutskriteriaWert property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the institutskriteriaWert property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInstitutskriteriaWert().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstitutskriteriaWert }
     * </p>
     *
     * @return The value of the institutskriteriaWert property.
     */
    public List<InstitutskriteriaWert> getInstitutskriteriaWert() {
        if (institutskriteriaWert == null) {
            institutskriteriaWert = new ArrayList<>();
        }
        return this.institutskriteriaWert;
    }

}
