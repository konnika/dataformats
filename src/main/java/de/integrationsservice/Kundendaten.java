
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;


/**
 * Name und Adresse des Kunden (Darlehensnehmer)
 *
 * <p>Java class for Kundendaten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Kundendaten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="PLZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="anrede" type="{http://www.gillardon.de/marzipan/integrationsservice}Anrede" minOccurs="0"/>
 *         <element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kundennummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="land" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nachname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="telefonnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="titel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="wohnort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vornameFrau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nachnameFrau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="titelFrau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kundendaten", propOrder = {

})
public class Kundendaten {

    /**
     * Die PLZ des Kunden
     */
    @XmlElement(name = "PLZ")
    protected String plz;
    /**
     * Anrede (Herr, Frau, Firma usw.)
     */
    @XmlSchemaType(name = "string")
    protected Anrede anrede;
    /**
     * E-Mail des Kunden
     */
    protected String email;
    /**
     * Kundennummer des Kunden
     */
    protected String kundennummer;
    /**
     * Das Land des Kunden
     */
    protected String land;
    /**
     * Der Nachname von Kunden
     */
    protected String nachname;
    /**
     * Die Straße des Kunden
     */
    protected String strasse;
    /**
     * Telefonnummer des Kunden
     */
    protected String telefonnummer;
    /**
     * Titel des Kunden (Dr., Dipl. Ing. usw)
     */
    protected String titel;
    /**
     * Vorname des Kunden
     */
    protected String vorname;
    /**
     * Wohnort des Kunden
     */
    protected String wohnort;
    /**
     * Vorname der Frau
     */
    protected String vornameFrau;
    /**
     * Nachname der Frau
     */
    protected String nachnameFrau;
    /**
     * Titel der Frau (Dr., Dipl. Ing. usw)
     */
    protected String titelFrau;

    /**
     * Die PLZ des Kunden
     *
     * @return possible object is
     * {@link String }
     */
    public String getPLZ() {
        return plz;
    }

    /**
     * Sets the value of the plz property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getPLZ()
     */
    public void setPLZ(String value) {
        this.plz = value;
    }

    /**
     * Anrede (Herr, Frau, Firma usw.)
     *
     * @return possible object is
     * {@link Anrede }
     */
    public Anrede getAnrede() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     *
     * @param value allowed object is
     *              {@link Anrede }
     * @see #getAnrede()
     */
    public void setAnrede(Anrede value) {
        this.anrede = value;
    }

    /**
     * E-Mail des Kunden
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getEmail()
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Kundennummer des Kunden
     *
     * @return possible object is
     * {@link String }
     */
    public String getKundennummer() {
        return kundennummer;
    }

    /**
     * Sets the value of the kundennummer property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKundennummer()
     */
    public void setKundennummer(String value) {
        this.kundennummer = value;
    }

    /**
     * Das Land des Kunden
     *
     * @return possible object is
     * {@link String }
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getLand()
     */
    public void setLand(String value) {
        this.land = value;
    }

    /**
     * Der Nachname von Kunden
     *
     * @return possible object is
     * {@link String }
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * Sets the value of the nachname property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getNachname()
     */
    public void setNachname(String value) {
        this.nachname = value;
    }

    /**
     * Die Straße des Kunden
     *
     * @return possible object is
     * {@link String }
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * Sets the value of the strasse property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getStrasse()
     */
    public void setStrasse(String value) {
        this.strasse = value;
    }

    /**
     * Telefonnummer des Kunden
     *
     * @return possible object is
     * {@link String }
     */
    public String getTelefonnummer() {
        return telefonnummer;
    }

    /**
     * Sets the value of the telefonnummer property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTelefonnummer()
     */
    public void setTelefonnummer(String value) {
        this.telefonnummer = value;
    }

    /**
     * Titel des Kunden (Dr., Dipl. Ing. usw)
     *
     * @return possible object is
     * {@link String }
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTitel()
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Vorname des Kunden
     *
     * @return possible object is
     * {@link String }
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Sets the value of the vorname property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getVorname()
     */
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Wohnort des Kunden
     *
     * @return possible object is
     * {@link String }
     */
    public String getWohnort() {
        return wohnort;
    }

    /**
     * Sets the value of the wohnort property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getWohnort()
     */
    public void setWohnort(String value) {
        this.wohnort = value;
    }

    /**
     * Vorname der Frau
     *
     * @return possible object is
     * {@link String }
     */
    public String getVornameFrau() {
        return vornameFrau;
    }

    /**
     * Sets the value of the vornameFrau property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getVornameFrau()
     */
    public void setVornameFrau(String value) {
        this.vornameFrau = value;
    }

    /**
     * Nachname der Frau
     *
     * @return possible object is
     * {@link String }
     */
    public String getNachnameFrau() {
        return nachnameFrau;
    }

    /**
     * Sets the value of the nachnameFrau property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getNachnameFrau()
     */
    public void setNachnameFrau(String value) {
        this.nachnameFrau = value;
    }

    /**
     * Titel der Frau (Dr., Dipl. Ing. usw)
     *
     * @return possible object is
     * {@link String }
     */
    public String getTitelFrau() {
        return titelFrau;
    }

    /**
     * Sets the value of the titelFrau property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTitelFrau()
     */
    public void setTitelFrau(String value) {
        this.titelFrau = value;
    }

}
