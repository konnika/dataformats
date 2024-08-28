
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Der globale komplexe Typ Risikodaten enthält die Risikodaten zu einem Geschäft.
 *
 * <p>Java class for Risikodaten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Risikodaten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="risikoPraemieBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="risikoUebernahmePraemie" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="erwarteterVerlust" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ratingStichtag" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="verlustQuote" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="besicherungsQuote" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="altesBlanko" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ratingKonfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ratingSzenario" type="{http://www.gillardon.de/marzipan/integrationsservice}ZusaetzlicheExportFelder" minOccurs="0"/>
 *         <element name="bonitaet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="einbringungsKonfiguration" type="{http://www.gillardon.de/marzipan/integrationsservice}ZusaetzlicheExportFelder" minOccurs="0"/>
 *         <element name="einbringungsquote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rechengenauigkeit" type="{http://www.gillardon.de/marzipan/integrationsservice}ZusaetzlicheExportFelder" minOccurs="0"/>
 *         <element name="risikoKonfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sicherheitenKonfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sicherheitenSzenario" type="{http://www.gillardon.de/marzipan/integrationsservice}ZusaetzlicheExportFelder" minOccurs="0"/>
 *         <element name="risikoVarkost" type="{http://www.gillardon.de/marzipan/integrationsservice}ZusaetzlicheExportFelder" minOccurs="0"/>
 *         <element name="risikoEigenkapitalkost" type="{http://www.gillardon.de/marzipan/integrationsservice}ZusaetzlicheExportFelder" minOccurs="0"/>
 *         <element name="kundenklasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lgdKonfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lgdSzenario" type="{http://www.gillardon.de/marzipan/integrationsservice}ZusaetzlicheExportFelder" minOccurs="0"/>
 *         <element name="lgdQuote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ekkOekonomisch" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ekkAufsichtsrechtlich" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="eigenkapitalBilanziell" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="eigenkapitalVerzinslich" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="initialesRisikogewicht" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ekkBilanziell" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ekkVerzinslich" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="besicherungsArt" type="{http://www.gillardon.de/marzipan/integrationsservice}BesicherungsArt" minOccurs="0"/>
 *         <element name="rarocOekonomisch" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="rarocRegulatorisch" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="roracOekonomisch" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="roracRegulatorisch" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="rorwa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="rwa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ruepVariante" type="{http://www.gillardon.de/marzipan/integrationsservice}RuepVariante" minOccurs="0"/>
 *         <element name="kontoSicherheiten" type="{http://www.gillardon.de/marzipan/integrationsservice}KontoSicherheiten" minOccurs="0"/>
 *         <element name="durchschnittlichesRisikogewicht" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="durchschnittlichesRisikogewichtKSAOutputfloor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="initialesRisikogewichtKSAOutputfloor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="allokiertesEigenkapitalKSAOutputfloor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bestandObligoVerbund" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bestandWohnimmobilienVerbund" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="umsatzVerbund" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Risikodaten", propOrder = {

})
public class Risikodaten {

    /**
     * Risikoprämie
     */
    protected Double risikoPraemieBetrag;
    /**
     * Risikoübernahmeprämie
     */
    protected Double risikoUebernahmePraemie;
    /**
     * Erwarteter Verlust
     */
    protected Double erwarteterVerlust;
    /**
     * Stichtag des Ratings
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ratingStichtag;
    /**
     * Verlustquote in %
     */
    protected Double verlustQuote;
    /**
     * Besicherungsquote in %
     */
    protected Double besicherungsQuote;
    /**
     * Altes Blanko
     */
    protected Double altesBlanko;
    /**
     * Name des Ratingsystems/Ratingkonfiguration. Das Ratingsystem enthält die dem Ratingtyp aktuell
     * zugeordneten Ausfallwahrscheinlichkeiten.
     */
    protected String ratingKonfiguration;
    /**
     * Name der Ratingsystemparameter
     */
    protected ZusaetzlicheExportFelder ratingSzenario;
    /**
     * Das Rating des Kunden
     */
    protected String bonitaet;
    /**
     * Name der hinterlegten Einbringungsquoten
     */
    protected ZusaetzlicheExportFelder einbringungsKonfiguration;
    /**
     * Name der Einbringungsklasse
     */
    protected String einbringungsquote;
    /**
     * Name der hinterlegten Konfiguration zur Rechengenauigkeit
     */
    protected ZusaetzlicheExportFelder rechengenauigkeit;
    /**
     * Name der hinterlegten VaR-Konfiguration (Risikoübernahmeprämie)
     */
    protected String risikoKonfiguration;
    /**
     * Name des Sicherheitensystems
     */
    protected String sicherheitenKonfiguration;
    /**
     * Name der hinterlegten Sicherheitenparameter
     */
    protected ZusaetzlicheExportFelder sicherheitenSzenario;
    /**
     * Name der Konfiguration für variable Kosten und CCF.
     */
    protected ZusaetzlicheExportFelder risikoVarkost;
    /**
     * Name der Konfiguration für Eigenkapitalkosten.
     */
    protected ZusaetzlicheExportFelder risikoEigenkapitalkost;
    /**
     * Name der Kundenklasse für die Eigenkapitalkosten.
     */
    protected String kundenklasse;
    /**
     * Name der LGD-Konfiguration
     */
    protected String lgdKonfiguration;
    /**
     * Name des LGD-Szenarios
     */
    protected ZusaetzlicheExportFelder lgdSzenario;
    /**
     * Verlustquote (LGD)
     */
    protected String lgdQuote;
    /**
     * Eigenkapitalkosten ökonomisch.
     */
    protected Double ekkOekonomisch;
    /**
     * Eigenkapitalkosten aufsichtsrechtlich.
     */
    protected Double ekkAufsichtsrechtlich;
    /**
     * Bilanzielles (allokiertes) Eigenkapital.
     */
    protected Double eigenkapitalBilanziell;
    /**
     * Verzinsliches Eigenkapital.
     */
    protected Double eigenkapitalVerzinslich;
    /**
     * Initiales Risikogewicht.
     */
    protected Double initialesRisikogewicht;
    /**
     * Eigenkapitalkosten aufsichtsrechtlich fuer den bilanziellen Anteil.
     */
    protected Double ekkBilanziell;
    /**
     * Eigenkapitalkosten aufsichtsrechtlich fuer den verzinslichen Anteil.
     */
    protected Double ekkVerzinslich;
    /**
     * Modus der Sicherheitenberechnung.
     */
    @XmlSchemaType(name = "string")
    protected BesicherungsArt besicherungsArt;
    /**
     * RAROC oekonomisch
     */
    protected Double rarocOekonomisch;
    /**
     * RAROC regulatorisch
     */
    protected Double rarocRegulatorisch;
    /**
     * RORAC oekonomisch
     */
    protected Double roracOekonomisch;
    /**
     * RORAC regulatorisch
     */
    protected Double roracRegulatorisch;
    /**
     * Relation von Ergebnisbeitrag und risikogewichteten Aktiva (RWA)
     */
    protected Double rorwa;
    /**
     * Risikogewichtete Aktiva
     */
    protected Double rwa;
    /**
     * Berechnungsvariante für die Risikoübernahmeprämie.
     */
    @XmlSchemaType(name = "string")
    protected RuepVariante ruepVariante;
    /**
     * Kontosicherheiten
     */
    protected KontoSicherheiten kontoSicherheiten;
    /**
     * Durchschnittliches Risikogewicht (RW) nach IRB ungefloort
     */
    protected Double durchschnittlichesRisikogewicht;
    /**
     * Durchschnittliches Risikogewicht nach KSA Output Floor
     */
    protected Double durchschnittlichesRisikogewichtKSAOutputfloor;
    /**
     * Initiales Risikogewicht nach KSA Output Floor
     */
    protected Double initialesRisikogewichtKSAOutputfloor;
    /**
     * Allokiertes Eigenkapital nach KSA Output Floor
     */
    protected Double allokiertesEigenkapitalKSAOutputfloor;
    /**
     * Bestand Obligo des Verbundes
     */
    protected Double bestandObligoVerbund;
    /**
     * Bestand Wohnimmobilien des Verbunds in Prozent
     */
    protected Double bestandWohnimmobilienVerbund;
    /**
     * Umsatz des Verbundes
     */
    protected Double umsatzVerbund;

    /**
     * Risikoprämie
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRisikoPraemieBetrag() {
        return risikoPraemieBetrag;
    }

    /**
     * Sets the value of the risikoPraemieBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRisikoPraemieBetrag()
     */
    public void setRisikoPraemieBetrag(Double value) {
        this.risikoPraemieBetrag = value;
    }

    /**
     * Risikoübernahmeprämie
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRisikoUebernahmePraemie() {
        return risikoUebernahmePraemie;
    }

    /**
     * Sets the value of the risikoUebernahmePraemie property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRisikoUebernahmePraemie()
     */
    public void setRisikoUebernahmePraemie(Double value) {
        this.risikoUebernahmePraemie = value;
    }

    /**
     * Erwarteter Verlust
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getErwarteterVerlust() {
        return erwarteterVerlust;
    }

    /**
     * Sets the value of the erwarteterVerlust property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getErwarteterVerlust()
     */
    public void setErwarteterVerlust(Double value) {
        this.erwarteterVerlust = value;
    }

    /**
     * Stichtag des Ratings
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getRatingStichtag() {
        return ratingStichtag;
    }

    /**
     * Sets the value of the ratingStichtag property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getRatingStichtag()
     */
    public void setRatingStichtag(XMLGregorianCalendar value) {
        this.ratingStichtag = value;
    }

    /**
     * Verlustquote in %
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVerlustQuote() {
        return verlustQuote;
    }

    /**
     * Sets the value of the verlustQuote property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVerlustQuote()
     */
    public void setVerlustQuote(Double value) {
        this.verlustQuote = value;
    }

    /**
     * Besicherungsquote in %
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBesicherungsQuote() {
        return besicherungsQuote;
    }

    /**
     * Sets the value of the besicherungsQuote property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBesicherungsQuote()
     */
    public void setBesicherungsQuote(Double value) {
        this.besicherungsQuote = value;
    }

    /**
     * Altes Blanko
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAltesBlanko() {
        return altesBlanko;
    }

    /**
     * Sets the value of the altesBlanko property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAltesBlanko()
     */
    public void setAltesBlanko(Double value) {
        this.altesBlanko = value;
    }

    /**
     * Name des Ratingsystems/Ratingkonfiguration. Das Ratingsystem enthält die dem Ratingtyp aktuell
     * zugeordneten Ausfallwahrscheinlichkeiten.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatingKonfiguration() {
        return ratingKonfiguration;
    }

    /**
     * Sets the value of the ratingKonfiguration property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getRatingKonfiguration()
     */
    public void setRatingKonfiguration(String value) {
        this.ratingKonfiguration = value;
    }

    /**
     * Name der Ratingsystemparameter
     *
     * @return possible object is
     * {@link ZusaetzlicheExportFelder }
     */
    public ZusaetzlicheExportFelder getRatingSzenario() {
        return ratingSzenario;
    }

    /**
     * Sets the value of the ratingSzenario property.
     *
     * @param value allowed object is
     *              {@link ZusaetzlicheExportFelder }
     * @see #getRatingSzenario()
     */
    public void setRatingSzenario(ZusaetzlicheExportFelder value) {
        this.ratingSzenario = value;
    }

    /**
     * Das Rating des Kunden
     *
     * @return possible object is
     * {@link String }
     */
    public String getBonitaet() {
        return bonitaet;
    }

    /**
     * Sets the value of the bonitaet property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getBonitaet()
     */
    public void setBonitaet(String value) {
        this.bonitaet = value;
    }

    /**
     * Name der hinterlegten Einbringungsquoten
     *
     * @return possible object is
     * {@link ZusaetzlicheExportFelder }
     */
    public ZusaetzlicheExportFelder getEinbringungsKonfiguration() {
        return einbringungsKonfiguration;
    }

    /**
     * Sets the value of the einbringungsKonfiguration property.
     *
     * @param value allowed object is
     *              {@link ZusaetzlicheExportFelder }
     * @see #getEinbringungsKonfiguration()
     */
    public void setEinbringungsKonfiguration(ZusaetzlicheExportFelder value) {
        this.einbringungsKonfiguration = value;
    }

    /**
     * Name der Einbringungsklasse
     *
     * @return possible object is
     * {@link String }
     */
    public String getEinbringungsquote() {
        return einbringungsquote;
    }

    /**
     * Sets the value of the einbringungsquote property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getEinbringungsquote()
     */
    public void setEinbringungsquote(String value) {
        this.einbringungsquote = value;
    }

    /**
     * Name der hinterlegten Konfiguration zur Rechengenauigkeit
     *
     * @return possible object is
     * {@link ZusaetzlicheExportFelder }
     */
    public ZusaetzlicheExportFelder getRechengenauigkeit() {
        return rechengenauigkeit;
    }

    /**
     * Sets the value of the rechengenauigkeit property.
     *
     * @param value allowed object is
     *              {@link ZusaetzlicheExportFelder }
     * @see #getRechengenauigkeit()
     */
    public void setRechengenauigkeit(ZusaetzlicheExportFelder value) {
        this.rechengenauigkeit = value;
    }

    /**
     * Name der hinterlegten VaR-Konfiguration (Risikoübernahmeprämie)
     *
     * @return possible object is
     * {@link String }
     */
    public String getRisikoKonfiguration() {
        return risikoKonfiguration;
    }

    /**
     * Sets the value of the risikoKonfiguration property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getRisikoKonfiguration()
     */
    public void setRisikoKonfiguration(String value) {
        this.risikoKonfiguration = value;
    }

    /**
     * Name des Sicherheitensystems
     *
     * @return possible object is
     * {@link String }
     */
    public String getSicherheitenKonfiguration() {
        return sicherheitenKonfiguration;
    }

    /**
     * Sets the value of the sicherheitenKonfiguration property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getSicherheitenKonfiguration()
     */
    public void setSicherheitenKonfiguration(String value) {
        this.sicherheitenKonfiguration = value;
    }

    /**
     * Name der hinterlegten Sicherheitenparameter
     *
     * @return possible object is
     * {@link ZusaetzlicheExportFelder }
     */
    public ZusaetzlicheExportFelder getSicherheitenSzenario() {
        return sicherheitenSzenario;
    }

    /**
     * Sets the value of the sicherheitenSzenario property.
     *
     * @param value allowed object is
     *              {@link ZusaetzlicheExportFelder }
     * @see #getSicherheitenSzenario()
     */
    public void setSicherheitenSzenario(ZusaetzlicheExportFelder value) {
        this.sicherheitenSzenario = value;
    }

    /**
     * Name der Konfiguration für variable Kosten und CCF.
     *
     * @return possible object is
     * {@link ZusaetzlicheExportFelder }
     */
    public ZusaetzlicheExportFelder getRisikoVarkost() {
        return risikoVarkost;
    }

    /**
     * Sets the value of the risikoVarkost property.
     *
     * @param value allowed object is
     *              {@link ZusaetzlicheExportFelder }
     * @see #getRisikoVarkost()
     */
    public void setRisikoVarkost(ZusaetzlicheExportFelder value) {
        this.risikoVarkost = value;
    }

    /**
     * Name der Konfiguration für Eigenkapitalkosten.
     *
     * @return possible object is
     * {@link ZusaetzlicheExportFelder }
     */
    public ZusaetzlicheExportFelder getRisikoEigenkapitalkost() {
        return risikoEigenkapitalkost;
    }

    /**
     * Sets the value of the risikoEigenkapitalkost property.
     *
     * @param value allowed object is
     *              {@link ZusaetzlicheExportFelder }
     * @see #getRisikoEigenkapitalkost()
     */
    public void setRisikoEigenkapitalkost(ZusaetzlicheExportFelder value) {
        this.risikoEigenkapitalkost = value;
    }

    /**
     * Name der Kundenklasse für die Eigenkapitalkosten.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKundenklasse() {
        return kundenklasse;
    }

    /**
     * Sets the value of the kundenklasse property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKundenklasse()
     */
    public void setKundenklasse(String value) {
        this.kundenklasse = value;
    }

    /**
     * Name der LGD-Konfiguration
     *
     * @return possible object is
     * {@link String }
     */
    public String getLgdKonfiguration() {
        return lgdKonfiguration;
    }

    /**
     * Sets the value of the lgdKonfiguration property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getLgdKonfiguration()
     */
    public void setLgdKonfiguration(String value) {
        this.lgdKonfiguration = value;
    }

    /**
     * Name des LGD-Szenarios
     *
     * @return possible object is
     * {@link ZusaetzlicheExportFelder }
     */
    public ZusaetzlicheExportFelder getLgdSzenario() {
        return lgdSzenario;
    }

    /**
     * Sets the value of the lgdSzenario property.
     *
     * @param value allowed object is
     *              {@link ZusaetzlicheExportFelder }
     * @see #getLgdSzenario()
     */
    public void setLgdSzenario(ZusaetzlicheExportFelder value) {
        this.lgdSzenario = value;
    }

    /**
     * Verlustquote (LGD)
     *
     * @return possible object is
     * {@link String }
     */
    public String getLgdQuote() {
        return lgdQuote;
    }

    /**
     * Sets the value of the lgdQuote property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getLgdQuote()
     */
    public void setLgdQuote(String value) {
        this.lgdQuote = value;
    }

    /**
     * Eigenkapitalkosten ökonomisch.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEkkOekonomisch() {
        return ekkOekonomisch;
    }

    /**
     * Sets the value of the ekkOekonomisch property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEkkOekonomisch()
     */
    public void setEkkOekonomisch(Double value) {
        this.ekkOekonomisch = value;
    }

    /**
     * Eigenkapitalkosten aufsichtsrechtlich.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEkkAufsichtsrechtlich() {
        return ekkAufsichtsrechtlich;
    }

    /**
     * Sets the value of the ekkAufsichtsrechtlich property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEkkAufsichtsrechtlich()
     */
    public void setEkkAufsichtsrechtlich(Double value) {
        this.ekkAufsichtsrechtlich = value;
    }

    /**
     * Bilanzielles (allokiertes) Eigenkapital.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEigenkapitalBilanziell() {
        return eigenkapitalBilanziell;
    }

    /**
     * Sets the value of the eigenkapitalBilanziell property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEigenkapitalBilanziell()
     */
    public void setEigenkapitalBilanziell(Double value) {
        this.eigenkapitalBilanziell = value;
    }

    /**
     * Verzinsliches Eigenkapital.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEigenkapitalVerzinslich() {
        return eigenkapitalVerzinslich;
    }

    /**
     * Sets the value of the eigenkapitalVerzinslich property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEigenkapitalVerzinslich()
     */
    public void setEigenkapitalVerzinslich(Double value) {
        this.eigenkapitalVerzinslich = value;
    }

    /**
     * Initiales Risikogewicht.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getInitialesRisikogewicht() {
        return initialesRisikogewicht;
    }

    /**
     * Sets the value of the initialesRisikogewicht property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getInitialesRisikogewicht()
     */
    public void setInitialesRisikogewicht(Double value) {
        this.initialesRisikogewicht = value;
    }

    /**
     * Eigenkapitalkosten aufsichtsrechtlich fuer den bilanziellen Anteil.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEkkBilanziell() {
        return ekkBilanziell;
    }

    /**
     * Sets the value of the ekkBilanziell property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEkkBilanziell()
     */
    public void setEkkBilanziell(Double value) {
        this.ekkBilanziell = value;
    }

    /**
     * Eigenkapitalkosten aufsichtsrechtlich fuer den verzinslichen Anteil.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEkkVerzinslich() {
        return ekkVerzinslich;
    }

    /**
     * Sets the value of the ekkVerzinslich property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEkkVerzinslich()
     */
    public void setEkkVerzinslich(Double value) {
        this.ekkVerzinslich = value;
    }

    /**
     * Modus der Sicherheitenberechnung.
     *
     * @return possible object is
     * {@link BesicherungsArt }
     */
    public BesicherungsArt getBesicherungsArt() {
        return besicherungsArt;
    }

    /**
     * Sets the value of the besicherungsArt property.
     *
     * @param value allowed object is
     *              {@link BesicherungsArt }
     * @see #getBesicherungsArt()
     */
    public void setBesicherungsArt(BesicherungsArt value) {
        this.besicherungsArt = value;
    }

    /**
     * RAROC oekonomisch
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRarocOekonomisch() {
        return rarocOekonomisch;
    }

    /**
     * Sets the value of the rarocOekonomisch property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRarocOekonomisch()
     */
    public void setRarocOekonomisch(Double value) {
        this.rarocOekonomisch = value;
    }

    /**
     * RAROC regulatorisch
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRarocRegulatorisch() {
        return rarocRegulatorisch;
    }

    /**
     * Sets the value of the rarocRegulatorisch property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRarocRegulatorisch()
     */
    public void setRarocRegulatorisch(Double value) {
        this.rarocRegulatorisch = value;
    }

    /**
     * RORAC oekonomisch
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRoracOekonomisch() {
        return roracOekonomisch;
    }

    /**
     * Sets the value of the roracOekonomisch property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRoracOekonomisch()
     */
    public void setRoracOekonomisch(Double value) {
        this.roracOekonomisch = value;
    }

    /**
     * RORAC regulatorisch
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRoracRegulatorisch() {
        return roracRegulatorisch;
    }

    /**
     * Sets the value of the roracRegulatorisch property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRoracRegulatorisch()
     */
    public void setRoracRegulatorisch(Double value) {
        this.roracRegulatorisch = value;
    }

    /**
     * Relation von Ergebnisbeitrag und risikogewichteten Aktiva (RWA)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRorwa() {
        return rorwa;
    }

    /**
     * Sets the value of the rorwa property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRorwa()
     */
    public void setRorwa(Double value) {
        this.rorwa = value;
    }

    /**
     * Risikogewichtete Aktiva
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRwa() {
        return rwa;
    }

    /**
     * Sets the value of the rwa property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRwa()
     */
    public void setRwa(Double value) {
        this.rwa = value;
    }

    /**
     * Berechnungsvariante für die Risikoübernahmeprämie.
     *
     * @return possible object is
     * {@link RuepVariante }
     */
    public RuepVariante getRuepVariante() {
        return ruepVariante;
    }

    /**
     * Sets the value of the ruepVariante property.
     *
     * @param value allowed object is
     *              {@link RuepVariante }
     * @see #getRuepVariante()
     */
    public void setRuepVariante(RuepVariante value) {
        this.ruepVariante = value;
    }

    /**
     * Kontosicherheiten
     *
     * @return possible object is
     * {@link KontoSicherheiten }
     */
    public KontoSicherheiten getKontoSicherheiten() {
        return kontoSicherheiten;
    }

    /**
     * Sets the value of the kontoSicherheiten property.
     *
     * @param value allowed object is
     *              {@link KontoSicherheiten }
     * @see #getKontoSicherheiten()
     */
    public void setKontoSicherheiten(KontoSicherheiten value) {
        this.kontoSicherheiten = value;
    }

    /**
     * Durchschnittliches Risikogewicht (RW) nach IRB ungefloort
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDurchschnittlichesRisikogewicht() {
        return durchschnittlichesRisikogewicht;
    }

    /**
     * Sets the value of the durchschnittlichesRisikogewicht property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDurchschnittlichesRisikogewicht()
     */
    public void setDurchschnittlichesRisikogewicht(Double value) {
        this.durchschnittlichesRisikogewicht = value;
    }

    /**
     * Durchschnittliches Risikogewicht nach KSA Output Floor
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDurchschnittlichesRisikogewichtKSAOutputfloor() {
        return durchschnittlichesRisikogewichtKSAOutputfloor;
    }

    /**
     * Sets the value of the durchschnittlichesRisikogewichtKSAOutputfloor property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDurchschnittlichesRisikogewichtKSAOutputfloor()
     */
    public void setDurchschnittlichesRisikogewichtKSAOutputfloor(Double value) {
        this.durchschnittlichesRisikogewichtKSAOutputfloor = value;
    }

    /**
     * Initiales Risikogewicht nach KSA Output Floor
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getInitialesRisikogewichtKSAOutputfloor() {
        return initialesRisikogewichtKSAOutputfloor;
    }

    /**
     * Sets the value of the initialesRisikogewichtKSAOutputfloor property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getInitialesRisikogewichtKSAOutputfloor()
     */
    public void setInitialesRisikogewichtKSAOutputfloor(Double value) {
        this.initialesRisikogewichtKSAOutputfloor = value;
    }

    /**
     * Allokiertes Eigenkapital nach KSA Output Floor
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAllokiertesEigenkapitalKSAOutputfloor() {
        return allokiertesEigenkapitalKSAOutputfloor;
    }

    /**
     * Sets the value of the allokiertesEigenkapitalKSAOutputfloor property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAllokiertesEigenkapitalKSAOutputfloor()
     */
    public void setAllokiertesEigenkapitalKSAOutputfloor(Double value) {
        this.allokiertesEigenkapitalKSAOutputfloor = value;
    }

    /**
     * Bestand Obligo des Verbundes
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBestandObligoVerbund() {
        return bestandObligoVerbund;
    }

    /**
     * Sets the value of the bestandObligoVerbund property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBestandObligoVerbund()
     */
    public void setBestandObligoVerbund(Double value) {
        this.bestandObligoVerbund = value;
    }

    /**
     * Bestand Wohnimmobilien des Verbunds in Prozent
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBestandWohnimmobilienVerbund() {
        return bestandWohnimmobilienVerbund;
    }

    /**
     * Sets the value of the bestandWohnimmobilienVerbund property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBestandWohnimmobilienVerbund()
     */
    public void setBestandWohnimmobilienVerbund(Double value) {
        this.bestandWohnimmobilienVerbund = value;
    }

    /**
     * Umsatz des Verbundes
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getUmsatzVerbund() {
        return umsatzVerbund;
    }

    /**
     * Sets the value of the umsatzVerbund property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getUmsatzVerbund()
     */
    public void setUmsatzVerbund(Double value) {
        this.umsatzVerbund = value;
    }

}
