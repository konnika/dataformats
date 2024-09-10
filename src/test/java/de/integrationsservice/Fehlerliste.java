
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Wird zurückgeliefert, wenn die angeforderten Daten nicht existieren oder ein Validierungsfehler in den
 * Daten vorliegt.
 *
 * <p>Java class for Fehlerliste complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Fehlerliste">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fehler" type="{http://www.gillardon.de/marzipan/integrationsservice}Fehler" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fehlerliste", propOrder = {
        "fehler"
})
public class Fehlerliste {

    @XmlElement(required = true)
    protected List<Fehler> fehler;

    /**
     * Gets the value of the fehler property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fehler property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFehler().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fehler }
     * </p>
     *
     * @return The value of the fehler property.
     */
    public List<Fehler> getFehler() {
        if (fehler == null) {
            fehler = new ArrayList<>();
        }
        return this.fehler;
    }

}
