
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Der globale komplexe Typ Abzinsungskonto enthält die Daten des Zerobond-Abzinsungskontos der
 * KAPLAN-Berechnung.
 *
 * <p>Java class for ZeroBondAbzinsungskonto complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ZeroBondAbzinsungskonto">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="abzinsungskontoRow" type="{http://www.gillardon.de/marzipan/integrationsservice}AbzinsungskontoRow" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroBondAbzinsungskonto", propOrder = {
        "abzinsungskontoRow"
})
public class ZeroBondAbzinsungskonto {

    protected List<AbzinsungskontoRow> abzinsungskontoRow;

    /**
     * Gets the value of the abzinsungskontoRow property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abzinsungskontoRow property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAbzinsungskontoRow().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbzinsungskontoRow }
     * </p>
     *
     * @return The value of the abzinsungskontoRow property.
     */
    public List<AbzinsungskontoRow> getAbzinsungskontoRow() {
        if (abzinsungskontoRow == null) {
            abzinsungskontoRow = new ArrayList<>();
        }
        return this.abzinsungskontoRow;
    }

}
