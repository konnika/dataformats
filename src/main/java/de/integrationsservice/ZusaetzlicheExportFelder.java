
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der globale komplexe Typ fr zusaetzliche Daten im Export. Name, Erstellungsdatum
 * und Erstellungsuhrzeit zur eindeutigen Identifikation.
 *
 * <p>Java class for ZusaetzlicheExportFelder complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ZusaetzlicheExportFelder">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="erstellungsuhrzeit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZusaetzlicheExportFelder", propOrder = {
        "name",
        "erstellungsdatum",
        "erstellungsuhrzeit"
})
public class ZusaetzlicheExportFelder {

    /**
     * Name zur eindeutigen Identifikation.
     */
    protected String name;
    /**
     * Erstellungsdatum zur eindeutigen Identifikation.
     */
    protected String erstellungsdatum;
    /**
     * Erstellungsuhrzeit zur eindeutigen Identifikation.
     */
    protected String erstellungsuhrzeit;

    /**
     * Name zur eindeutigen Identifikation.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Erstellungsdatum zur eindeutigen Identifikation.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErstellungsdatum() {
        return erstellungsdatum;
    }

    /**
     * Sets the value of the erstellungsdatum property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getErstellungsdatum()
     */
    public void setErstellungsdatum(String value) {
        this.erstellungsdatum = value;
    }

    /**
     * Erstellungsuhrzeit zur eindeutigen Identifikation.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErstellungsuhrzeit() {
        return erstellungsuhrzeit;
    }

    /**
     * Sets the value of the erstellungsuhrzeit property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getErstellungsuhrzeit()
     */
    public void setErstellungsuhrzeit(String value) {
        this.erstellungsuhrzeit = value;
    }

}
