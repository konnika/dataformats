
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste der institutsspezifischen Geschäftsdaten
 *
 * <p>Java class for Institutsdatenvariabel complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Institutsdatenvariabel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="eintrag" type="{http://www.gillardon.de/marzipan/integrationsservice}InstitutsdatenvariabelEintrag" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Institutsdatenvariabel", propOrder = {
        "eintrag"
})
public class Institutsdatenvariabel {

    /**
     * Eintrag enthält den Wert für eine institutsspezifische Variable
     */
    protected List<InstitutsdatenvariabelEintrag> eintrag;

    /**
     * Eintrag enthält den Wert für eine institutsspezifische Variable
     * <p>
     * Gets the value of the eintrag property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eintrag property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEintrag().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstitutsdatenvariabelEintrag }
     * </p>
     *
     * @return The value of the eintrag property.
     */
    public List<InstitutsdatenvariabelEintrag> getEintrag() {
        if (eintrag == null) {
            eintrag = new ArrayList<>();
        }
        return this.eintrag;
    }

}
