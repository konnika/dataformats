
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Bewegungsstufendefinitionen für Treppenrechnergeschäfte
 *
 * <p>Java class for Bewegungsstufen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Bewegungsstufen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="treppe" type="{http://www.gillardon.de/marzipan/integrationsservice}BewegungsstufenTreppe" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bewegungsstufen", propOrder = {
        "treppe"
})
public class Bewegungsstufen {

    protected List<BewegungsstufenTreppe> treppe;

    /**
     * Gets the value of the treppe property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treppe property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTreppe().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BewegungsstufenTreppe }
     * </p>
     *
     * @return The value of the treppe property.
     */
    public List<BewegungsstufenTreppe> getTreppe() {
        if (treppe == null) {
            treppe = new ArrayList<>();
        }
        return this.treppe;
    }

}
