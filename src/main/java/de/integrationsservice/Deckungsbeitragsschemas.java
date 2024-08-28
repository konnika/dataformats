
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Eine Liste von Deckungsbeitragsschemas.
 *
 * <p>Java class for Deckungsbeitragsschemas complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Deckungsbeitragsschemas">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="deckungsbeitragsschema" type="{http://www.gillardon.de/marzipan/integrationsservice}Deckungsbeitragsschema" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deckungsbeitragsschemas", propOrder = {
        "deckungsbeitragsschema"
})
public class Deckungsbeitragsschemas {

    protected List<Deckungsbeitragsschema> deckungsbeitragsschema;

    /**
     * Gets the value of the deckungsbeitragsschema property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deckungsbeitragsschema property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeckungsbeitragsschema().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deckungsbeitragsschema }
     * </p>
     *
     * @return The value of the deckungsbeitragsschema property.
     */
    public List<Deckungsbeitragsschema> getDeckungsbeitragsschema() {
        if (deckungsbeitragsschema == null) {
            deckungsbeitragsschema = new ArrayList<>();
        }
        return this.deckungsbeitragsschema;
    }

}
