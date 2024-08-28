
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RegelmaessigeKostenProzentKosten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RegelmaessigeKostenProzentKosten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="verbuergungsgrad" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="buergschaftsprovision" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="berechnungTag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="datumBerechnungVon" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="datumBerechnungBis" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="berechnungRhythmus" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *         <element name="zeilenId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegelmaessigeKostenProzentKosten", propOrder = {

})
public class RegelmaessigeKostenProzentKosten {

    /**
     * Bezeichnung der Kosten - Frei eingebbares Textfeld mit 25 Zeichen Länge
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
     */
    @XmlElement(required = true)
    protected String bezeichnung;
    /**
     * Prozentwert der Restschuld
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
     */
    protected Double verbuergungsgrad;
    /**
     * Bürgschaftsprovision: Prozentwert vom Prozentwert der Restschuld
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
     */
    protected Double buergschaftsprovision;
    /**
     * Auszahlungstag der Rate
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
     */
    protected Integer berechnungTag;
    /**
     * Monat und Jahr der ersten Rate
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumBerechnungVon;
    /**
     * Endedatum für die Berechnung der Kosten
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumBerechnungBis;
    /**
     * Angabe, in welchen Abständen die regelmäßigen Kosten fällig werden.
     * Im Einzelnen: monatlich; zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
     * PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERTELJAEHRLICH PA_ZWEIMONATLICH PA_MONATLICH
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe berechnungRhythmus;
    /**
     * Zeilen-ID - Eindeutige Identifikation der Zeile.
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
     * Fortlaufende ID der Tabellenzeile Kein Dialogfeld
     */
    protected Long zeilenId;

    /**
     * Bezeichnung der Kosten - Frei eingebbares Textfeld mit 25 Zeichen Länge
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
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
     * Prozentwert der Restschuld
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVerbuergungsgrad() {
        return verbuergungsgrad;
    }

    /**
     * Sets the value of the verbuergungsgrad property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVerbuergungsgrad()
     */
    public void setVerbuergungsgrad(Double value) {
        this.verbuergungsgrad = value;
    }

    /**
     * Bürgschaftsprovision: Prozentwert vom Prozentwert der Restschuld
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBuergschaftsprovision() {
        return buergschaftsprovision;
    }

    /**
     * Sets the value of the buergschaftsprovision property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBuergschaftsprovision()
     */
    public void setBuergschaftsprovision(Double value) {
        this.buergschaftsprovision = value;
    }

    /**
     * Auszahlungstag der Rate
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getBerechnungTag() {
        return berechnungTag;
    }

    /**
     * Sets the value of the berechnungTag property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getBerechnungTag()
     */
    public void setBerechnungTag(Integer value) {
        this.berechnungTag = value;
    }

    /**
     * Monat und Jahr der ersten Rate
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatumBerechnungVon() {
        return datumBerechnungVon;
    }

    /**
     * Sets the value of the datumBerechnungVon property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatumBerechnungVon()
     */
    public void setDatumBerechnungVon(XMLGregorianCalendar value) {
        this.datumBerechnungVon = value;
    }

    /**
     * Endedatum für die Berechnung der Kosten
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatumBerechnungBis() {
        return datumBerechnungBis;
    }

    /**
     * Sets the value of the datumBerechnungBis property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatumBerechnungBis()
     */
    public void setDatumBerechnungBis(XMLGregorianCalendar value) {
        this.datumBerechnungBis = value;
    }

    /**
     * Angabe, in welchen Abständen die regelmäßigen Kosten fällig werden.
     * Im Einzelnen: monatlich; zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
     * PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERTELJAEHRLICH PA_ZWEIMONATLICH PA_MONATLICH
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getBerechnungRhythmus() {
        return berechnungRhythmus;
    }

    /**
     * Sets the value of the berechnungRhythmus property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getBerechnungRhythmus()
     */
    public void setBerechnungRhythmus(Perannoangabe value) {
        this.berechnungRhythmus = value;
    }

    /**
     * Zeilen-ID - Eindeutige Identifikation der Zeile.
     * Tabelle der regelmäßigen Kosten als Prozentsatz der Restschuld
     * Fortlaufende ID der Tabellenzeile Kein Dialogfeld
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
