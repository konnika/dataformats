
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Eine Liste von Finanzplätzen.
 *
 * <p>Java class for Finanzplaetze complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Finanzplaetze">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="finanzplatz" type="{http://www.gillardon.de/marzipan/integrationsservice}Finanzplatz" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Finanzplaetze", propOrder = {
        "finanzplatz"
})
public class Finanzplaetze {

    protected List<Finanzplatz> finanzplatz;

    /**
     * Gets the value of the finanzplatz property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finanzplatz property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFinanzplatz().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Finanzplatz }
     * </p>
     *
     * @return The value of the finanzplatz property.
     */
    public List<Finanzplatz> getFinanzplatz() {
        if (finanzplatz == null) {
            finanzplatz = new ArrayList<>();
        }
        return this.finanzplatz;
    }

}
