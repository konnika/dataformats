
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste der Kosten/Erträge des Deckungsbeitragsschemas.
 *
 * <p>Java class for KostenListe complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="KostenListe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded">
 *         <element name="dbStufe" type="{http://www.gillardon.de/marzipan/integrationsservice}DBStufe"/>
 *         <element name="kosten" type="{http://www.gillardon.de/marzipan/integrationsservice}Kosten"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KostenListe", propOrder = {
        "dbStufeOrKosten"
})
public class KostenListe {

    @XmlElements({
            @XmlElement(name = "dbStufe", type = DBStufe.class),
            @XmlElement(name = "kosten")
    })
    protected List<Kosten> dbStufeOrKosten;

    /**
     * Gets the value of the dbStufeOrKosten property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbStufeOrKosten property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDbStufeOrKosten().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DBStufe }
     * {@link Kosten }
     * </p>
     *
     * @return The value of the dbStufeOrKosten property.
     */
    public List<Kosten> getDbStufeOrKosten() {
        if (dbStufeOrKosten == null) {
            dbStufeOrKosten = new ArrayList<>();
        }
        return this.dbStufeOrKosten;
    }

}
