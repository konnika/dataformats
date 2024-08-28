
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Tilgungszeilen bei Sondertilgungen
 *
 * <p>Java class for Sondertilgungen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Sondertilgungen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sondertilgung" type="{http://www.gillardon.de/marzipan/integrationsservice}TilgungZeile" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sondertilgungen", propOrder = {
        "sondertilgung"
})
public class Sondertilgungen {

    protected List<TilgungZeile> sondertilgung;

    /**
     * Gets the value of the sondertilgung property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sondertilgung property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSondertilgung().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TilgungZeile }
     * </p>
     *
     * @return The value of the sondertilgung property.
     */
    public List<TilgungZeile> getSondertilgung() {
        if (sondertilgung == null) {
            sondertilgung = new ArrayList<>();
        }
        return this.sondertilgung;
    }

}
