
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Der globale komplexe Typ Tilgungsplan enthält die Daten über den Tilgungsplan des Darlehens.
 *
 * <p>Java class for Tilgungsplan complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Tilgungsplan">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="row" type="{http://www.gillardon.de/marzipan/integrationsservice}TilgungsplanRow" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tilgungsplan", propOrder = {
        "row"
})
public class Tilgungsplan {

    protected List<TilgungsplanRow> row;

    /**
     * Gets the value of the row property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRow().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TilgungsplanRow }
     * </p>
     *
     * @return The value of the row property.
     */
    public List<TilgungsplanRow> getRow() {
        if (row == null) {
            row = new ArrayList<>();
        }
        return this.row;
    }

}
