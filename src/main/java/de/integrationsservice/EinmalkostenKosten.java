
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EinmalkostenKosten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="EinmalkostenKosten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datumEinmalkosten" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="betrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zeilenId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EinmalkostenKosten", propOrder = {

})
public class EinmalkostenKosten {

    /**
     * Frei eingebbares Textfeld mit 25 Zeichen Länge
     * Tabelle Einmalkosten bezogen auf die Gesamtlaufzeit
     */
    @XmlElement(required = true)
    protected String bezeichnung;
    /**
     * Auszahlungsdatum der Einmalkosten
     * Tabelle Einmalkosten bezogen auf die Gesamtlaufzeit
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumEinmalkosten;
    /**
     * Höhe der Einmalkosten
     * Tabelle Einmalkosten bezogen auf die Gesamtlaufzeit
     */
    protected Double betrag;
    /**
     * Zeilen-ID
     * Tabelle Einmalkosten bezogen auf die Gesamtlaufzeit
     */
    protected Long zeilenId;

    /**
     * Frei eingebbares Textfeld mit 25 Zeichen Länge
     * Tabelle Einmalkosten bezogen auf die Gesamtlaufzeit
     *
     * @return possible object is
     * {@link String }
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getBezeichnung()
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Auszahlungsdatum der Einmalkosten
     * Tabelle Einmalkosten bezogen auf die Gesamtlaufzeit
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatumEinmalkosten() {
        return datumEinmalkosten;
    }

    /**
     * Sets the value of the datumEinmalkosten property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatumEinmalkosten()
     */
    public void setDatumEinmalkosten(XMLGregorianCalendar value) {
        this.datumEinmalkosten = value;
    }

    /**
     * Höhe der Einmalkosten
     * Tabelle Einmalkosten bezogen auf die Gesamtlaufzeit
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBetrag() {
        return betrag;
    }

    /**
     * Sets the value of the betrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBetrag()
     */
    public void setBetrag(Double value) {
        this.betrag = value;
    }

    /**
     * Zeilen-ID
     * Tabelle Einmalkosten bezogen auf die Gesamtlaufzeit
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getZeilenId() {
        return zeilenId;
    }

    /**
     * Sets the value of the zeilenId property.
     *
     * @param value allowed object is
     *              {@link Long }
     * @see #getZeilenId()
     */
    public void setZeilenId(Long value) {
        this.zeilenId = value;
    }

}
