
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Teilvalutierung complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Teilvalutierung">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="ausfuehrungsDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="teilvalutierungssatz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="teilvalutierungsbetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="aktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Teilvalutierung", propOrder = {

})
public class Teilvalutierung {

    /**
     * Datum der Teilvalutierung
     * Tabelle der Teilvalutierungen
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ausfuehrungsDatum;
    /**
     * Angabe der Teilvalutierung als Prozentsatz des Auszahlungsbetrages
     * Tabelle der Teilvalutierungen
     */
    protected Double teilvalutierungssatz;
    /**
     * Angabe der Teilvalutierung als Betrag Tabelle der Teilvalutierungen
     */
    protected Double teilvalutierungsbetrag;
    /**
     * Steuert, ob die Teilauszahlung bei der Berechnung berücksichtigt werden soll
     */
    protected Boolean aktiv;

    /**
     * Datum der Teilvalutierung
     * Tabelle der Teilvalutierungen
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
     * Angabe der Teilvalutierung als Prozentsatz des Auszahlungsbetrages
     * Tabelle der Teilvalutierungen
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTeilvalutierungssatz() {
        return teilvalutierungssatz;
    }

    /**
     * Sets the value of the teilvalutierungssatz property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getTeilvalutierungssatz()
     */
    public void setTeilvalutierungssatz(Double value) {
        this.teilvalutierungssatz = value;
    }

    /**
     * Angabe der Teilvalutierung als Betrag Tabelle der Teilvalutierungen
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTeilvalutierungsbetrag() {
        return teilvalutierungsbetrag;
    }

    /**
     * Sets the value of the teilvalutierungsbetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getTeilvalutierungsbetrag()
     */
    public void setTeilvalutierungsbetrag(Double value) {
        this.teilvalutierungsbetrag = value;
    }

    /**
     * Steuert, ob die Teilauszahlung bei der Berechnung berücksichtigt werden soll
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
