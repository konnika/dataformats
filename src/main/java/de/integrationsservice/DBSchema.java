
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Deckungsbeitragsschema des berechneten Geschäfts.
 *
 * <p>Java class for DBSchema complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="DBSchema">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dbPosition" type="{http://www.gillardon.de/marzipan/integrationsservice}DbPosition" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBSchema", propOrder = {
        "dbPosition"
})
public class DBSchema {

    /**
     * Position (Kosten, Ertrag, DB-Stufe) im DB-Schema
     */
    @XmlElement(required = true)
    protected List<DbPosition> dbPosition;

    /**
     * Position (Kosten, Ertrag, DB-Stufe) im DB-Schema
     * <p>
     * Gets the value of the dbPosition property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbPosition property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDbPosition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DbPosition }
     * </p>
     *
     * @return The value of the dbPosition property.
     */
    public List<DbPosition> getDbPosition() {
        if (dbPosition == null) {
            dbPosition = new ArrayList<>();
        }
        return this.dbPosition;
    }

}
