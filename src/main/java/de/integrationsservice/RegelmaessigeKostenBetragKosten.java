
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RegelmaessigeKostenBetragKosten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RegelmaessigeKostenBetragKosten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="betrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="tag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="datumVon" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="datumBis" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="rhythmus" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *         <element name="zeilenId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegelmaessigeKostenBetragKosten", propOrder = {

})
public class RegelmaessigeKostenBetragKosten {

    /**
     * Frei eingebbares Textfeld mit 25 Zeichen Länge
     * Tabelle der regelmäßigen Kosten als Betrag
     */
    @XmlElement(required = true)
    protected String bezeichnung;
    /**
     * Höhe der regelmäßigen Kosten
     * Tabelle der regelmäßigen Kosten als Betrag
     */
    protected Double betrag;
    /**
     * Auszahlungstag der Rate
     * Tabelle der regelmäßigen Kosten als Betrag
     */
    protected Integer tag;
    /**
     * Monat und Jahr der ersten Rate
     * Tabelle der regelmäßigen Kosten als Betrag
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVon;
    /**
     * Ende der Gesamtlaufzeit
     * Tabelle der regelmäßigen Kosten als Betrag
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumBis;
    /**
     * Angabe, in welchen Abständen die regelmäßigen Kosten fällig werden.
     * Im Einzelnen: monatlich; zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     * Tabelle der regelmäßigen Kosten als Betrag PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERMONATLICH
     * PA_VIERTELJAEHRLICH PA_ZWEIMONATLICH PA_MONATLICH
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe rhythmus;
    /**
     * Eindeutige Identifikation der Zeile. Zeilen-ID.
     * Tabelle der regelmäßigen Kosten als Betrag Fortlaufende ID der Tabellenzeile Kein Dialogfeld
     */
    protected Long zeilenId;

    /**
     * Frei eingebbares Textfeld mit 25 Zeichen Länge
     * Tabelle der regelmäßigen Kosten als Betrag
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
     * Höhe der regelmäßigen Kosten
     * Tabelle der regelmäßigen Kosten als Betrag
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
     * Auszahlungstag der Rate
     * Tabelle der regelmäßigen Kosten als Betrag
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getTag()
     */
    public void setTag(Integer value) {
        this.tag = value;
    }

    /**
     * Monat und Jahr der ersten Rate
     * Tabelle der regelmäßigen Kosten als Betrag
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatumVon() {
        return datumVon;
    }

    /**
     * Sets the value of the datumVon property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatumVon()
     */
    public void setDatumVon(XMLGregorianCalendar value) {
        this.datumVon = value;
    }

    /**
     * Ende der Gesamtlaufzeit
     * Tabelle der regelmäßigen Kosten als Betrag
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatumBis() {
        return datumBis;
    }

    /**
     * Sets the value of the datumBis property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatumBis()
     */
    public void setDatumBis(XMLGregorianCalendar value) {
        this.datumBis = value;
    }

    /**
     * Angabe, in welchen Abständen die regelmäßigen Kosten fällig werden.
     * Im Einzelnen: monatlich; zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     * Tabelle der regelmäßigen Kosten als Betrag PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERMONATLICH
     * PA_VIERTELJAEHRLICH PA_ZWEIMONATLICH PA_MONATLICH
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getRhythmus() {
        return rhythmus;
    }

    /**
     * Sets the value of the rhythmus property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getRhythmus()
     */
    public void setRhythmus(Perannoangabe value) {
        this.rhythmus = value;
    }

    /**
     * Eindeutige Identifikation der Zeile. Zeilen-ID.
     * Tabelle der regelmäßigen Kosten als Betrag Fortlaufende ID der Tabellenzeile Kein Dialogfeld
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
