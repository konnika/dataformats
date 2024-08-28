
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Tabelle der annuitätischen Tilgungsstruktur
 *
 * <p>Java class for AnnuTilgungen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AnnuTilgungen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="annuTilgung" type="{http://www.gillardon.de/marzipan/integrationsservice}AnnuTilgung" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnuTilgungen", propOrder = {
        "annuTilgung"
})
public class AnnuTilgungen {

    protected List<AnnuTilgung> annuTilgung;

    /**
     * Gets the value of the annuTilgung property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annuTilgung property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAnnuTilgung().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnuTilgung }
     * </p>
     *
     * @return The value of the annuTilgung property.
     */
    public List<AnnuTilgung> getAnnuTilgung() {
        if (annuTilgung == null) {
            annuTilgung = new ArrayList<>();
        }
        return this.annuTilgung;
    }

}
