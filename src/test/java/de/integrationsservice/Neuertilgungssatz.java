
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Neuertilgungssatz complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Neuertilgungssatz">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="ausfuehrungsDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="tilgungssatz" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="aktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Neuertilgungssatz", propOrder = {

})
public class Neuertilgungssatz {

    /**
     * Datum des Tilgungssatzwechsels
     * Tabelle des Tilgungssatzwechsels
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ausfuehrungsDatum;
    /**
     * Angabe des neuen Tilgungssatzes in Prozent. Hierbei bezieht sich der Tilgungssatz immer zum
     * Grundwert des Nominalbetrags.
     * Tabelle des Tilgungssatzwechsels
     */
    protected double tilgungssatz;
    /**
     * Steuert, ob die Tilgungssatzwechsel bei der Berechnung berücksichtigt werden
     * soll
     */
    protected Boolean aktiv;

    /**
     * Datum des Tilgungssatzwechsels
     * Tabelle des Tilgungssatzwechsels
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAusfuehrungsDatum() {
        return ausfuehrungsDatum;
    }

    /**
     * Sets the value of the ausfuehrungsDatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAusfuehrungsDatum()
     */
    public void setAusfuehrungsDatum(XMLGregorianCalendar value) {
        this.ausfuehrungsDatum = value;
    }

    /**
     * Angabe des neuen Tilgungssatzes in Prozent. Hierbei bezieht sich der Tilgungssatz immer zum
     * Grundwert des Nominalbetrags.
     * Tabelle des Tilgungssatzwechsels
     */
    public double getTilgungssatz() {
        return tilgungssatz;
    }

    /**
     * Sets the value of the tilgungssatz property.
     */
    public void setTilgungssatz(double value) {
        this.tilgungssatz = value;
    }

    /**
     * Steuert, ob die Tilgungssatzwechsel bei der Berechnung berücksichtigt werden
     * soll
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAktiv() {
        return aktiv;
    }

    /**
     * Sets the value of the aktiv property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isAktiv()
     */
    public void setAktiv(Boolean value) {
        this.aktiv = value;
    }

}
