
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Die Zinsstruktur legt die Refinanzierungskondition für einen bestimmten Teilmarkt und eine Währung fest.
 * Die Zinsstruktur besteht aus einer Liste von Stützstellen und einigen Kopfdaten.
 *
 * <p>Java class for Zinsstruktur complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Zinsstruktur">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="stuetzstellen" type="{http://www.gillardon.de/marzipan/integrationsservice}ZinsstrukturStuetzstellen"/>
 *         <element name="freigabestatus" type="{http://www.gillardon.de/marzipan/integrationsservice}Freigabestatus" minOccurs="0"/>
 *         <element name="erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="geldkapitalgrenze" type="{http://www.gillardon.de/marzipan/integrationsservice}Geldkapitalgrenze"/>
 *         <element name="kalkulationsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="uhrzeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="teilmarkt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="finanzplatz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="finanzplatzMitFeiertagen" type="{http://www.gillardon.de/marzipan/integrationsservice}Finanzplatz" minOccurs="0"/>
 *         <element name="valutadatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="interpolationsart" type="{http://www.gillardon.de/marzipan/integrationsservice}Interpolationsart"/>
 *         <element name="endEndConvention" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zinsstruktur", propOrder = {

})
public class Zinsstruktur {

    /**
     * Liste der Stützstellen der Zinsstruktur
     */
    @XmlElement(required = true)
    protected ZinsstrukturStuetzstellen stuetzstellen;
    /**
     * Freigabestatus der Zinsstruktur
     */
    @XmlSchemaType(name = "string")
    protected Freigabestatus freigabestatus;
    /**
     * Erstellungsdatum der Zinsstruktur
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erstellungsdatum;
    /**
     * Grenze zwischen Geldmarkt- und Kapitalmarkt-Papieren
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Geldkapitalgrenze geldkapitalgrenze;
    /**
     * Tag, für den die Zinsstruktur gilt, Startdatum Zinssätze im Geldmarkt
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kalkulationsdatum;
    /**
     * Uhrzeit, ab dem die Zinsstruktur am Kalkulationstag gilt
     */
    @XmlElement(required = true)
    protected String uhrzeit;
    /**
     * Kommentar zur Zinsstruktur
     */
    protected String kommentar;
    /**
     * Name des Teilmarkts, für den die Zinsstruktur gilt
     */
    protected String teilmarkt;
    /**
     * Währung, für die die Zinsstruktur gilt
     */
    protected String waehrung;
    /**
     * Name des Finanzplatzes, für den die Zinsstruktur gilt
     */
    protected String finanzplatz;
    /**
     * Finanzplatz inkl. Feiertagen für die Zinsstruktur
     */
    protected Finanzplatz finanzplatzMitFeiertagen;
    /**
     * Valutadatum der Stützstellen der Zinsstruktur im Kapitalmarkt
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valutadatum;
    /**
     * Interpolationsart (linear, usancenkonform)
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Interpolationsart interpolationsart;
    /**
     * End/End-Convention: Fälligkeitsermittlung der Wertpapiere nach der End-End Konvention. Dies hat
     * nur eine Bedeutung, wenn das Valutadatum am letzten Bankarbeitstag des Monats liegt. Das
     * Fälligkeitsdatum ist dann auch am Monatsende, wenn die Laufzeit das Vielfache eines Monats ist.
     */
    protected boolean endEndConvention;
    /**
     * Technische Datenbank ID (Primary Key) der Zinsstruktur in der MARZIPAN
     * Datenbank.
     */
    protected Integer id;

    /**
     * Liste der Stützstellen der Zinsstruktur
     *
     * @return possible object is
     * {@link ZinsstrukturStuetzstellen }
     */
    public ZinsstrukturStuetzstellen getStuetzstellen() {
        return stuetzstellen;
    }

    /**
     * Sets the value of the stuetzstellen property.
     *
     * @param value allowed object is
     *              {@link ZinsstrukturStuetzstellen }
     * @see #getStuetzstellen()
     */
    public void setStuetzstellen(ZinsstrukturStuetzstellen value) {
        this.stuetzstellen = value;
    }

    /**
     * Freigabestatus der Zinsstruktur
     *
     * @return possible object is
     * {@link Freigabestatus }
     */
    public Freigabestatus getFreigabestatus() {
        return freigabestatus;
    }

    /**
     * Sets the value of the freigabestatus property.
     *
     * @param value allowed object is
     *              {@link Freigabestatus }
     * @see #getFreigabestatus()
     */
    public void setFreigabestatus(Freigabestatus value) {
        this.freigabestatus = value;
    }

    /**
     * Erstellungsdatum der Zinsstruktur
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErstellungsdatum() {
        return erstellungsdatum;
    }

    /**
     * Sets the value of the erstellungsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErstellungsdatum()
     */
    public void setErstellungsdatum(XMLGregorianCalendar value) {
        this.erstellungsdatum = value;
    }

    /**
     * Grenze zwischen Geldmarkt- und Kapitalmarkt-Papieren
     *
     * @return possible object is
     * {@link Geldkapitalgrenze }
     */
    public Geldkapitalgrenze getGeldkapitalgrenze() {
        return geldkapitalgrenze;
    }

    /**
     * Sets the value of the geldkapitalgrenze property.
     *
     * @param value allowed object is
     *              {@link Geldkapitalgrenze }
     * @see #getGeldkapitalgrenze()
     */
    public void setGeldkapitalgrenze(Geldkapitalgrenze value) {
        this.geldkapitalgrenze = value;
    }

    /**
     * Tag, für den die Zinsstruktur gilt, Startdatum Zinssätze im Geldmarkt
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getKalkulationsdatum() {
        return kalkulationsdatum;
    }

    /**
     * Sets the value of the kalkulationsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getKalkulationsdatum()
     */
    public void setKalkulationsdatum(XMLGregorianCalendar value) {
        this.kalkulationsdatum = value;
    }

    /**
     * Uhrzeit, ab dem die Zinsstruktur am Kalkulationstag gilt
     *
     * @return possible object is
     * {@link String }
     */
    public String getUhrzeit() {
        return uhrzeit;
    }

    /**
     * Sets the value of the uhrzeit property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getUhrzeit()
     */
    public void setUhrzeit(String value) {
        this.uhrzeit = value;
    }

    /**
     * Kommentar zur Zinsstruktur
     *
     * @return possible object is
     * {@link String }
     */
    public String getKommentar() {
        return kommentar;
    }

    /**
     * Sets the value of the kommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKommentar()
     */
    public void setKommentar(String value) {
        this.kommentar = value;
    }

    /**
     * Name des Teilmarkts, für den die Zinsstruktur gilt
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
     * Währung, für die die Zinsstruktur gilt
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
     * Name des Finanzplatzes, für den die Zinsstruktur gilt
     *
     * @return possible object is
     * {@link String }
     */
    public String getFinanzplatz() {
        return finanzplatz;
    }

    /**
     * Sets the value of the finanzplatz property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getFinanzplatz()
     */
    public void setFinanzplatz(String value) {
        this.finanzplatz = value;
    }

    /**
     * Finanzplatz inkl. Feiertagen für die Zinsstruktur
     *
     * @return possible object is
     * {@link Finanzplatz }
     */
    public Finanzplatz getFinanzplatzMitFeiertagen() {
        return finanzplatzMitFeiertagen;
    }

    /**
     * Sets the value of the finanzplatzMitFeiertagen property.
     *
     * @param value allowed object is
     *              {@link Finanzplatz }
     * @see #getFinanzplatzMitFeiertagen()
     */
    public void setFinanzplatzMitFeiertagen(Finanzplatz value) {
        this.finanzplatzMitFeiertagen = value;
    }

    /**
     * Valutadatum der Stützstellen der Zinsstruktur im Kapitalmarkt
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getValutadatum() {
        return valutadatum;
    }

    /**
     * Sets the value of the valutadatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getValutadatum()
     */
    public void setValutadatum(XMLGregorianCalendar value) {
        this.valutadatum = value;
    }

    /**
     * Interpolationsart (linear, usancenkonform)
     *
     * @return possible object is
     * {@link Interpolationsart }
     */
    public Interpolationsart getInterpolationsart() {
        return interpolationsart;
    }

    /**
     * Sets the value of the interpolationsart property.
     *
     * @param value allowed object is
     *              {@link Interpolationsart }
     * @see #getInterpolationsart()
     */
    public void setInterpolationsart(Interpolationsart value) {
        this.interpolationsart = value;
    }

    /**
     * End/End-Convention: Fälligkeitsermittlung der Wertpapiere nach der End-End Konvention. Dies hat
     * nur eine Bedeutung, wenn das Valutadatum am letzten Bankarbeitstag des Monats liegt. Das
     * Fälligkeitsdatum ist dann auch am Monatsende, wenn die Laufzeit das Vielfache eines Monats ist.
     */
    public boolean isEndEndConvention() {
        return endEndConvention;
    }

    /**
     * Sets the value of the endEndConvention property.
     */
    public void setEndEndConvention(boolean value) {
        this.endEndConvention = value;
    }

    /**
     * Technische Datenbank ID (Primary Key) der Zinsstruktur in der MARZIPAN
     * Datenbank.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getId()
     */
    public void setId(Integer value) {
        this.id = value;
    }

}
