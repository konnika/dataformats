
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste der Geschäftsdaten - Institutskriterien (Datum)
 *
 * <p>Java class for InstitutskriterienDatum complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="InstitutskriterienDatum">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="institutskriteriaDatum" type="{http://www.gillardon.de/marzipan/integrationsservice}InstitutskriteriaDatum" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitutskriterienDatum", propOrder = {
        "institutskriteriaDatum"
})
public class InstitutskriterienDatum {

    protected List<InstitutskriteriaDatum> institutskriteriaDatum;

    /**
     * Gets the value of the institutskriteriaDatum property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the institutskriteriaDatum property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInstitutskriteriaDatum().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstitutskriteriaDatum }
     * </p>
     *
     * @return The value of the institutskriteriaDatum property.
     */
    public List<InstitutskriteriaDatum> getInstitutskriteriaDatum() {
        if (institutskriteriaDatum == null) {
            institutskriteriaDatum = new ArrayList<>();
        }
        return this.institutskriteriaDatum;
    }

}
