
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste aller Gruppen, in denen sich der aktuell angemeldete Sachbearbeiter befindet.
 * Die Gruppen werden derzeit nur in der Validierungs-Anfrage per Webservice gefüllt.
 * In allen anderen Fällen ist dieses Element nicht vorhanden.
 *
 * <p>Java class for SachbearbeiterGruppen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="SachbearbeiterGruppen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="gruppe" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SachbearbeiterGruppen", propOrder = {
        "gruppe"
})
public class SachbearbeiterGruppen {

    /**
     * Name einer Gruppe, in welcher der Sachbearbeiter enthalten ist.
     */
    protected List<String> gruppe;

    /**
     * Name einer Gruppe, in welcher der Sachbearbeiter enthalten ist.
     * <p>
     * Gets the value of the gruppe property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gruppe property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGruppe().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     * @return The value of the gruppe property.
     */
    public List<String> getGruppe() {
        if (gruppe == null) {
            gruppe = new ArrayList<>();
        }
        return this.gruppe;
    }

}
