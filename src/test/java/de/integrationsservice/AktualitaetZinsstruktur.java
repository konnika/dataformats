
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Enthält Informationen zu einer Aktualitätsprüfung einer Zinsstruktur.
 *
 * <p>Java class for AktualitaetZinsstruktur complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AktualitaetZinsstruktur">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="teilmarkt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="zinsstrukturdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="aktuell" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="fehler" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AktualitaetZinsstruktur", propOrder = {

})
public class AktualitaetZinsstruktur {

    /**
     * Teilmarktname der Zinsstruktur.
     */
    @XmlElement(required = true)
    protected String teilmarkt;
    /**
     * Waehrung (ISO-Code) der Zinsstruktur.
     */
    @XmlElement(required = true)
    protected String waehrung;
    /**
     * Datum und Uhrzeit der Zinsstruktur.
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar zinsstrukturdatum;
    /**
     * Kennzeichen Aktualität Zinsstruktur (nur im Ergebnis).
     */
    protected Boolean aktuell;
    /**
     * Fehler-ID pro angefragter Zinsstruktur (nur im Ergebnis).
     */
    protected String fehler;

    /**
     * Teilmarktname der Zinsstruktur.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTeilmarkt() {
        return teilmarkt;
    }

    /**
     * Sets the value of the teilmarkt property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTeilmarkt()
     */
    public void setTeilmarkt(String value) {
        this.teilmarkt = value;
    }

    /**
     * Waehrung (ISO-Code) der Zinsstruktur.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the value of the waehrung property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getWaehrung()
     */
    public void setWaehrung(String value) {
        this.waehrung = value;
    }

    /**
     * Datum und Uhrzeit der Zinsstruktur.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getZinsstrukturdatum() {
        return zinsstrukturdatum;
    }

    /**
     * Sets the value of the zinsstrukturdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getZinsstrukturdatum()
     */
    public void setZinsstrukturdatum(XMLGregorianCalendar value) {
        this.zinsstrukturdatum = value;
    }

    /**
     * Kennzeichen Aktualität Zinsstruktur (nur im Ergebnis).
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAktuell() {
        return aktuell;
    }

    /**
     * Sets the value of the aktuell property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isAktuell()
     */
    public void setAktuell(Boolean value) {
        this.aktuell = value;
    }

    /**
     * Fehler-ID pro angefragter Zinsstruktur (nur im Ergebnis).
     *
     * @return possible object is
     * {@link String }
     */
    public String getFehler() {
        return fehler;
    }

    /**
     * Sets the value of the fehler property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getFehler()
     */
    public void setFehler(String value) {
        this.fehler = value;
    }

}
