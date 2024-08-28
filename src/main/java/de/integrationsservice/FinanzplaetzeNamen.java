
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Es können mehrere Finanzplaetze gleichzeitig aktiv sein.
 *
 * <p>Java class for FinanzplaetzeNamen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FinanzplaetzeNamen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="finanzplatz" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="8" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinanzplaetzeNamen", propOrder = {
        "finanzplatz"
})
public class FinanzplaetzeNamen {

    /**
     * Der Finanzplatz, an welchem die Zahlungen für das Geschäft ausgeführt werden. Dieser wird für
     * den zu verwendenden Kalender benötigt.
     */
    protected List<String> finanzplatz;

    /**
     * Der Finanzplatz, an welchem die Zahlungen für das Geschäft ausgeführt werden. Dieser wird für
     * den zu verwendenden Kalender benötigt.
     * <p>
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
     * {@link String }
     * </p>
     *
     * @return The value of the finanzplatz property.
     */
    public List<String> getFinanzplatz() {
        if (finanzplatz == null) {
            finanzplatz = new ArrayList<>();
        }
        return this.finanzplatz;
    }

}
