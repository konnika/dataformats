
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der globale komplexe Typ Sachbearbeiter enthält die Daten des Sachbearbeiters
 *
 * <p>Java class for Sachbearbeiter complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Sachbearbeiter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="anrede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nachname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sabnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="titel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="plz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kuerzel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vertriebsendstelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gruppen" type="{http://www.gillardon.de/marzipan/integrationsservice}SachbearbeiterGruppen" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sachbearbeiter", propOrder = {

})
public class Sachbearbeiter {

    /**
     * Mögliche Werte für die Anrede sind "Herr" und "Frau".
     */
    protected String anrede;
    /**
     * E-Mail des Beraters
     */
    protected String email;
    /**
     * Fax des Beraters
     */
    protected String fax;
    /**
     * Der eingegebene Kommentar wird auf dem Angebotsschreiben und dem Berechnungsprotokoll
     * ausgewiesen.
     */
    protected String kommentar;
    /**
     * Nachname des Beraters
     */
    protected String nachname;
    /**
     * Vorname des Beraters
     */
    protected String name;
    /**
     * Die Sachbearbeiternummer
     */
    protected String sabnummer;
    /**
     * Telefonnummer des Beraters
     */
    protected String telefon;
    /**
     * Titel des Beraters
     */
    protected String titel;
    /**
     * Vorname des Beraters
     */
    protected String vorname;
    /**
     * Straße des Beraters
     */
    protected String strasse;
    /**
     * PLZ des Beraters
     */
    protected String plz;
    /**
     * Ort des Beraters
     */
    protected String ort;
    /**
     * Kürzel des Beraters
     */
    protected String kuerzel;
    /**
     * Vertriebsendstelle des Beraters
     */
    protected String vertriebsendstelle;
    /**
     * Liste aller Gruppen, in denen sich der aktuell angemeldete Sachbearbeiter befindet.
     * Die Gruppen werden derzeit nur in der Validierungs-Anfrage per Webservice gefüllt.
     * In allen anderen Fällen ist dieses Element nicht vorhanden.
     */
    protected SachbearbeiterGruppen gruppen;

    /**
     * Mögliche Werte für die Anrede sind "Herr" und "Frau".
     *
     * @return possible object is
     * {@link String }
     */
    public String getAnrede() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getAnrede()
     */
    public void setAnrede(String value) {
        this.anrede = value;
    }

    /**
     * E-Mail des Beraters
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
     * Fax des Beraters
     *
     * @return possible object is
     * {@link String }
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getFax()
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Der eingegebene Kommentar wird auf dem Angebotsschreiben und dem Berechnungsprotokoll
     * ausgewiesen.
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
     * Nachname des Beraters
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
     * Vorname des Beraters
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
     * Die Sachbearbeiternummer
     *
     * @return possible object is
     * {@link String }
     */
    public String getSabnummer() {
        return sabnummer;
    }

    /**
     * Sets the value of the sabnummer property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getSabnummer()
     */
    public void setSabnummer(String value) {
        this.sabnummer = value;
    }

    /**
     * Telefonnummer des Beraters
     *
     * @return possible object is
     * {@link String }
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTelefon()
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Titel des Beraters
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
     * Vorname des Beraters
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
     * Straße des Beraters
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
     * PLZ des Beraters
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlz() {
        return plz;
    }

    /**
     * Sets the value of the plz property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getPlz()
     */
    public void setPlz(String value) {
        this.plz = value;
    }

    /**
     * Ort des Beraters
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getOrt()
     */
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Kürzel des Beraters
     *
     * @return possible object is
     * {@link String }
     */
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * Sets the value of the kuerzel property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKuerzel()
     */
    public void setKuerzel(String value) {
        this.kuerzel = value;
    }

    /**
     * Vertriebsendstelle des Beraters
     *
     * @return possible object is
     * {@link String }
     */
    public String getVertriebsendstelle() {
        return vertriebsendstelle;
    }

    /**
     * Sets the value of the vertriebsendstelle property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getVertriebsendstelle()
     */
    public void setVertriebsendstelle(String value) {
        this.vertriebsendstelle = value;
    }

    /**
     * Liste aller Gruppen, in denen sich der aktuell angemeldete Sachbearbeiter befindet.
     * Die Gruppen werden derzeit nur in der Validierungs-Anfrage per Webservice gefüllt.
     * In allen anderen Fällen ist dieses Element nicht vorhanden.
     *
     * @return possible object is
     * {@link SachbearbeiterGruppen }
     */
    public SachbearbeiterGruppen getGruppen() {
        return gruppen;
    }

    /**
     * Sets the value of the gruppen property.
     *
     * @param value allowed object is
     *              {@link SachbearbeiterGruppen }
     * @see #getGruppen()
     */
    public void setGruppen(SachbearbeiterGruppen value) {
        this.gruppen = value;
    }

}
