
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Eine Liste von Risiko Eigenkapitalkosten aufsichtsrechtlich.
 *
 * <p>Java class for RisikoEigenkapitalkosten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RisikoEigenkapitalkosten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="risikoEigenkapitalkost" type="{http://www.gillardon.de/marzipan/integrationsservice}RisikoEigenkapitalkost" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisikoEigenkapitalkosten", propOrder = {
        "risikoEigenkapitalkost"
})
public class RisikoEigenkapitalkosten {

    protected List<RisikoEigenkapitalkost> risikoEigenkapitalkost;

    /**
     * Gets the value of the risikoEigenkapitalkost property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the risikoEigenkapitalkost property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRisikoEigenkapitalkost().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RisikoEigenkapitalkost }
     * </p>
     *
     * @return The value of the risikoEigenkapitalkost property.
     */
    public List<RisikoEigenkapitalkost> getRisikoEigenkapitalkost() {
        if (risikoEigenkapitalkost == null) {
            risikoEigenkapitalkost = new ArrayList<>();
        }
        return this.risikoEigenkapitalkost;
    }

}
