
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;


/**
 * Der globale komplexe Typ Sparengeschäft enthält alle Daten zur Beschreibung eines Passiv-Geschäfts.
 *
 * <p>Java class for Sparengeschaeft complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Sparengeschaeft">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="letzteBerechnung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="geaendertAm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="geaendertUm" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="oid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="produktTyp" type="{http://www.gillardon.de/marzipan/integrationsservice}ProduktTyp" minOccurs="0"/>
 *         <element name="statusGeschaeft" type="{http://www.gillardon.de/marzipan/integrationsservice}Geschaeftsstatus" minOccurs="0"/>
 *         <element name="ownername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="anlagedatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="laufzeit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="laufzeitendeDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="anlagebetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="endvermoegen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nominalzins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinsausschuettung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="zinsNachKontostand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="zinsGestaffelt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ersteZinsverrech" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="kirchensteuerProzent" type="{http://www.gillardon.de/marzipan/integrationsservice}KirchensteuerProzent" minOccurs="0"/>
 *         <element name="kontostandsgrenze1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kontostandsgrenze2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kontostandsgrenze3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kontostandsgrenze4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinsVerrechnungTag" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         <element name="zastZahlen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="zastBagatellgrenze" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zastProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zastFreibetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zastSoliProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ekstZahlen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ekstProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="abstZahlen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="abstProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kontostBezug" type="{http://www.gillardon.de/marzipan/integrationsservice}KontostBezug" minOccurs="0"/>
 *         <element name="zinsverlauf" type="{http://www.gillardon.de/marzipan/integrationsservice}Verlauf" minOccurs="0"/>
 *         <element name="steuerfaellig" type="{http://www.gillardon.de/marzipan/integrationsservice}Steuerfaellig" minOccurs="0"/>
 *         <element name="usance" type="{http://www.gillardon.de/marzipan/integrationsservice}Usance" minOccurs="0"/>
 *         <element name="tageMitverz" type="{http://www.gillardon.de/marzipan/integrationsservice}TageMitverz" minOccurs="0"/>
 *         <element name="zinsRhythmus" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *         <element name="zinsart" type="{http://www.gillardon.de/marzipan/integrationsservice}Zinsart" minOccurs="0"/>
 *         <element name="produktKonfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="istGesamtfinanzierung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="kontoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kalkulation" type="{http://www.gillardon.de/marzipan/integrationsservice}Kalkulation" minOccurs="0"/>
 *         <element name="kalkulationsparameter" type="{http://www.gillardon.de/marzipan/integrationsservice}Kalkulationsparameter" minOccurs="0"/>
 *         <element name="liquikosten" type="{http://www.gillardon.de/marzipan/integrationsservice}Liquikosten" minOccurs="0"/>
 *         <element name="StatusuebergangHistory" type="{http://www.gillardon.de/marzipan/integrationsservice}StatusuebergangHistory" minOccurs="0"/>
 *         <element name="impliziteoptionen" type="{http://www.gillardon.de/marzipan/integrationsservice}ImpliziteOptionen" minOccurs="0"/>
 *         <element name="bonussparplan" type="{http://www.gillardon.de/marzipan/integrationsservice}Bonussparplan" minOccurs="0"/>
 *         <element name="sparenRate" type="{http://www.gillardon.de/marzipan/integrationsservice}SparenRate" minOccurs="0"/>
 *         <element name="zinssaetze" type="{http://www.gillardon.de/marzipan/integrationsservice}Zinssaetze" minOccurs="0"/>
 *         <element name="verwaltungsdaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Verwaltungsdaten" minOccurs="0"/>
 *       </all>
 *       <anyAttribute/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sparengeschaeft", propOrder = {

})
public class Sparengeschaeft {

    /**
     * Datum, an dem die letzte echte Berechnung (keine default-Rechnung) durchgeführt wurde.
     * Das Feld wird nur verwendet, wenn in Produkt eine Abhängigkeit zum aktuellen Datum konfiguriert
     * wurde.
     * In diesem Fall wird beim Importieren des Geschäftes (Default-Rechnung) dieses Datum anstatt
     * des aktuellen Datums für das Produktkonfigurierte Feld verwendet.
     * Ist dieses Feld leer, wird das aktuelle Datum verwendet.
     * Bei einer echten Berechnung (klick auf ein Berechne-Button) wird immer das aktuelle Datum
     * verwendet.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar letzteBerechnung;
    /**
     * Datum, an dem das Geschäft zuletzt geändert wurde.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar geaendertAm;
    /**
     * Uhrzeit an der das Geschäft zuletzt geändert wurde.
     */
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar geaendertUm;
    /**
     * Name des Geschäfts (Geschäfts-ID)
     */
    protected String name;
    /**
     * Kommentar zum Geschäft.
     */
    protected String kommentar;
    /**
     * Technischer Schlüssel zur eindeutigen Identifikation des Geschäfts in der Datenbank.
     */
    protected Integer oid;
    /**
     * Typ des Geschäfts: Sparbuch (SBH) Bonussparplan (BSP) Sparbrief (SBF) Auszahlplan (AZP)
     * Termingeld (TGD)
     * siehe Struktur ProduktTyp
     */
    @XmlSchemaType(name = "string")
    protected ProduktTyp produktTyp;
    /**
     * Legt fest, in welchem Status das Geschäft ist erstellt angefragt geprueft gemeldet gesperrt
     * siehe Struktur Geschaeftsstatus
     */
    @XmlSchemaType(name = "string")
    protected Geschaeftsstatus statusGeschaeft;
    /**
     * Benutzername des Anwenders der das Geschäft angelegt hat.
     */
    protected String ownername;
    /**
     * Benutzername des Anwenders der das Geschäft zuletzt geändert hat.
     */
    protected String username;
    /**
     * Zeitpunkt des Sparbriefbegins, Zeitpunkt des Termingeldbegins.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar anlagedatum;
    /**
     * Für die Berechnung des aktuellen Geschäfts verwendete Währung (bei Margen- und
     * Nettomargenrechnung wird die Währung durch die ausgewählte Zinsstruktur festgelegt; wenn sie
     * geändert wird, wird dies vor einer Berechnung geprüft).
     */
    protected String waehrung;
    /**
     * Laufzeit des Sparbriefs in Jahren oder Laufzeit des Termingelds in Tagen
     */
    protected Double laufzeit;
    /**
     * Zeitpunkt des Sparbriefendes, Zeitpunkt des Termingeldendes
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar laufzeitendeDatum;
    /**
     * Summe, die am Anlagedatum eingezahlt wird
     */
    protected Double anlagebetrag;
    /**
     * Auszahlungsbetrag am Ende der Laufzeit
     */
    protected Double endvermoegen;
    /**
     * Sparbrief:
     * Wenn unter Zinskonditionen Zinstabelle (zeitabhängig) = zeitunabhängig und Zinstabelle
     * (betragsabhängig) = betragsunabhängig: Höhe des nominalen Zinssatzes für ein Jahr.
     * Wenn Zinstabelle (zeitabhängig) ungleich zeitunabhängig oder Zinstabelle (betragsabhängig)
     * ungleich betragsunabhängig ist, wird hier ein Hinweistext auf die Zinsstaffel-Tabelle unter
     * Zinskonditionen angezeigt.
     * Termingeld:
     * Wenn unter Zinskonditionen Zinstabelle (betragsabhängig) = betragsunabhängig: Höhe des nominalen
     * Zinssatzes für ein Jahr.
     * Wenn Zinstabelle (betragsabhängig) ungleich betragsunabhängig ist, wird hier ein Hinweistext auf
     * die Zinsstaffel-Tabelle unter Zinskonditionen angezeigt.
     */
    protected Double nominalzins;
    /**
     * Legt fest, ob Zinszahlungen auf dem Konto gutgeschrieben oder ausgezahlt werden
     * Zinsen ausschütten (true) oder verrechnen (false)
     */
    protected Boolean zinsausschuettung;
    /**
     * Betragsabhängiger Zinsverlauf: betragsunabhängig Zinssaldo Summe der Einzahlungen
     */
    protected Boolean zinsNachKontostand;
    /**
     * Legt fest, ob Zins nach Laufzeit / Datum einmalig gemäß Laufzeitende ermittelt wird und dann
     * über die ganze Laufzeit gilt, oder über die gesamte Laufzeit gemäß Zinstabelle angepasst wird.
     */
    protected Boolean zinsGestaffelt;
    /**
     * Datum der ersten Zinsverrechnung
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ersteZinsverrech;
    /**
     * Auswahl, welcher prozentuale Kirchensteuersatz bei der Berechnung der Abgeltungssteuersatz
     * zugrunde gelegt werden soll: keine, 8%, 9%.
     * KIRCHENSTEUER_KEINE KIRCHENSTEUER_ACHTPROZENT KIRCHENSTEUER_NEUNPROZENT
     */
    @XmlSchemaType(name = "string")
    protected KirchensteuerProzent kirchensteuerProzent;
    /**
     * Kontostandsgrenze 1 für Zins nach Kontostand und Laufzeit oder Datum.
     */
    protected Double kontostandsgrenze1;
    /**
     * Kontostandsgrenze 2 für Zins nach Kontostand und Laufzeit oder Datum.
     */
    protected Double kontostandsgrenze2;
    /**
     * Kontostandsgrenze 3 für Zins nach Kontostand und Laufzeit oder Datum.
     */
    protected Double kontostandsgrenze3;
    /**
     * Kontostandsgrenze 4 für Zins nach Kontostand und Laufzeit oder Datum.
     */
    protected Double kontostandsgrenze4;
    /**
     * Tag, an dem die Zinsverrechnung stattfindet. Mögliche Auswahlen sind 1. des Monats, ..., 30. des
     * Monats und Ultimo.
     */
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger zinsVerrechnungTag;
    /**
     * Für Sparanlagen mit Anlagedatum vor dem 01.01.2009 stehen für die Steuerberechnung die folgenden
     * Optionen zur Verfügung
     * keine Steuer, Zinsabschlagsteuer, Einkommensteuer, Für Sparanlagen mit Anlagedatum nach dem
     * 31.12.2008 stehen die Auswahlen, keine Steuer, Abgeltungsteuer, zur Verfügung. Soll
     * Zinsabschlagsteuer gezahlt werden?
     */
    protected Boolean zastZahlen;
    /**
     * Bagatellgrenze für Zinsabschlagsteuer.
     */
    protected Double zastBagatellgrenze;
    /**
     * Prozentsatz für Zinsabschlagsteuer.
     */
    protected Double zastProzent;
    /**
     * Bis zu dieser Höhe werden Zinsen nicht mit Abgeltungsteuer belastet.
     */
    protected Double zastFreibetrag;
    /**
     * Prozentsatz des Solidaritätszuschlags für Abgeltungsteuer. Dieser Wert wird in den
     * Voreinstellungen vorbelegt und kann verändert werden.
     */
    protected Double zastSoliProzent;
    /**
     * Für Sparanlagen mit Anlagedatum vor dem 01.01.2009 stehen für die Steuerberechnung die folgenden
     * Optionen zur Verfügung
     * keine Steuer, Zinsabschlagsteuer, Einkommensteuer
     * Für Sparanlagen mit Anlagedatum nach dem 31.12.2008 stehen die Auswahlen keine Steuer,
     * Abgeltungsteuer zur Verfügung.
     * Soll Einkommensteuer gezahlt werden?
     */
    protected Boolean ekstZahlen;
    /**
     * Prozentsatz für Einkommensteuer.
     */
    protected Double ekstProzent;
    /**
     * Soll Abgeltungssteuer gezahlt werden?
     */
    protected Boolean abstZahlen;
    /**
     * Prozentsatz für Abgeltungssteuer.
     */
    protected Double abstProzent;
    /**
     * Betragsabhängiger Zinsverlauf: betragsunabhängig, Zinssaldo, Summe der Einzahlungen, Mischzins
     * ZINS_NACH_KONTOSTAND_ZINSBERECHNUNGSSALDO ZINS_NACH_KONTOSTAND_SUMME_DER_EINZAHLUNGEN
     * ZINS_NACH_KONTOSTAND_MISCHZINS_AUS_ZINSSTUFEN ZINS_NACH_KONTOSTAND_BETRAGSUNABHAENGIG
     */
    @XmlSchemaType(name = "string")
    protected KontostBezug kontostBezug;
    /**
     * Enthält die Basis des Verlaufs (konstant, nach Laufzeit, nach Datum), welche zur Berechnung der
     * Zinsrate benötigt wird.
     * siehe Struktur Verlauf
     */
    @XmlSchemaType(name = "string")
    protected Verlauf zinsverlauf;
    /**
     * Steuert, wann die Steuer berechnet wird: am Zinstermin, am Ende
     * Steuerfaelligkeitstyp_ZINSTERMIN Steuerfaelligkeitstyp_ENDE
     */
    @XmlSchemaType(name = "string")
    protected Steuerfaellig steuerfaellig;
    /**
     * Zinsusance, auf deren Grundlage der nominale Zins berechnet wird
     */
    @XmlSchemaType(name = "string")
    protected Usance usance;
    /**
     * Legt fest, ob für jede Einzahlung der Anlagetag oder der Rückzahlungstag mitverzinst wird.
     * TAGE_MITVERZINSEN_EINZAHLUNGSTAGE TAGE_MITVERZINSEN_RUECKZAHLUNGSTAGE
     */
    @XmlSchemaType(name = "string")
    protected TageMitverz tageMitverz;
    /**
     * Rhythmus der Zinszahlung: monatlich, zweimonatlich, vierteljährlich, halbjährlich, jährlich
     * siehe Struktur Perannoangabe
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe zinsRhythmus;
    /**
     * Für die Margenrechnung mit Angabe eines Bewertungszinssatzes.(fest/variabel)
     * siehe Struktur Zinsart
     */
    @XmlSchemaType(name = "string")
    protected Zinsart zinsart;
    /**
     * Auswahl des in MARZIPAN konfigurierten Produktes
     */
    protected String produktKonfiguration;
    /**
     * Flag zur Identifikation von Geschäften, die Teil einer Gesamtfinanzierung sind.
     */
    protected Boolean istGesamtfinanzierung;
    /**
     * Identifiziert zusammengehörige APE-Geschäfte.
     */
    protected String kontoID;
    /**
     * Enthält zusätzliche Daten zur Kalkulation
     */
    protected Kalkulation kalkulation;
    /**
     * Zusätzliche Angaben zur Berechnung
     */
    protected Kalkulationsparameter kalkulationsparameter;
    /**
     * Enthält zusätzliche Daten zur Liquikosten.
     */
    protected Liquikosten liquikosten;
    /**
     * Enthält Daten für die am Geschäft durchgeführten Statusübergänge.
     */
    @XmlElement(name = "StatusuebergangHistory")
    protected StatusuebergangHistory statusuebergangHistory;
    /**
     * Zusätzliche Daten zu impliziten Optionen.
     */
    protected ImpliziteOptionen impliziteoptionen;
    /**
     * Zusätzliche Geschäftsdaten für ein Sparengeschäft des Produkttyps Bonussparplan.
     */
    protected Bonussparplan bonussparplan;
    /**
     * Ratenangaben für ein Sparengeschäft des Produkttyps Bonussparplan oder Sparbuch
     */
    protected SparenRate sparenRate;
    /**
     * Zinsstaffel eines Sparengeschäfts für Zins nach Laufzeit, Datum, Kontostand oder Kombinationen.
     */
    protected Zinssaetze zinssaetze;
    /**
     * Verwaltungsdaten zu einem Geschäft
     */
    protected Verwaltungsdaten verwaltungsdaten;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Datum, an dem die letzte echte Berechnung (keine default-Rechnung) durchgeführt wurde.
     * Das Feld wird nur verwendet, wenn in Produkt eine Abhängigkeit zum aktuellen Datum konfiguriert
     * wurde.
     * In diesem Fall wird beim Importieren des Geschäftes (Default-Rechnung) dieses Datum anstatt
     * des aktuellen Datums für das Produktkonfigurierte Feld verwendet.
     * Ist dieses Feld leer, wird das aktuelle Datum verwendet.
     * Bei einer echten Berechnung (klick auf ein Berechne-Button) wird immer das aktuelle Datum
     * verwendet.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLetzteBerechnung() {
        return letzteBerechnung;
    }

    /**
     * Sets the value of the letzteBerechnung property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getLetzteBerechnung()
     */
    public void setLetzteBerechnung(XMLGregorianCalendar value) {
        this.letzteBerechnung = value;
    }

    /**
     * Datum, an dem das Geschäft zuletzt geändert wurde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getGeaendertAm() {
        return geaendertAm;
    }

    /**
     * Sets the value of the geaendertAm property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getGeaendertAm()
     */
    public void setGeaendertAm(XMLGregorianCalendar value) {
        this.geaendertAm = value;
    }

    /**
     * Uhrzeit an der das Geschäft zuletzt geändert wurde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getGeaendertUm() {
        return geaendertUm;
    }

    /**
     * Sets the value of the geaendertUm property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getGeaendertUm()
     */
    public void setGeaendertUm(XMLGregorianCalendar value) {
        this.geaendertUm = value;
    }

    /**
     * Name des Geschäfts (Geschäfts-ID)
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
     * Kommentar zum Geschäft.
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
     * Technischer Schlüssel zur eindeutigen Identifikation des Geschäfts in der Datenbank.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getOid()
     */
    public void setOid(Integer value) {
        this.oid = value;
    }

    /**
     * Typ des Geschäfts: Sparbuch (SBH) Bonussparplan (BSP) Sparbrief (SBF) Auszahlplan (AZP)
     * Termingeld (TGD)
     * siehe Struktur ProduktTyp
     *
     * @return possible object is
     * {@link ProduktTyp }
     */
    public ProduktTyp getProduktTyp() {
        return produktTyp;
    }

    /**
     * Sets the value of the produktTyp property.
     *
     * @param value allowed object is
     *              {@link ProduktTyp }
     * @see #getProduktTyp()
     */
    public void setProduktTyp(ProduktTyp value) {
        this.produktTyp = value;
    }

    /**
     * Legt fest, in welchem Status das Geschäft ist erstellt angefragt geprueft gemeldet gesperrt
     * siehe Struktur Geschaeftsstatus
     *
     * @return possible object is
     * {@link Geschaeftsstatus }
     */
    public Geschaeftsstatus getStatusGeschaeft() {
        return statusGeschaeft;
    }

    /**
     * Sets the value of the statusGeschaeft property.
     *
     * @param value allowed object is
     *              {@link Geschaeftsstatus }
     * @see #getStatusGeschaeft()
     */
    public void setStatusGeschaeft(Geschaeftsstatus value) {
        this.statusGeschaeft = value;
    }

    /**
     * Benutzername des Anwenders der das Geschäft angelegt hat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOwnername() {
        return ownername;
    }

    /**
     * Sets the value of the ownername property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getOwnername()
     */
    public void setOwnername(String value) {
        this.ownername = value;
    }

    /**
     * Benutzername des Anwenders der das Geschäft zuletzt geändert hat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getUsername()
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Zeitpunkt des Sparbriefbegins, Zeitpunkt des Termingeldbegins.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAnlagedatum() {
        return anlagedatum;
    }

    /**
     * Sets the value of the anlagedatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAnlagedatum()
     */
    public void setAnlagedatum(XMLGregorianCalendar value) {
        this.anlagedatum = value;
    }

    /**
     * Für die Berechnung des aktuellen Geschäfts verwendete Währung (bei Margen- und
     * Nettomargenrechnung wird die Währung durch die ausgewählte Zinsstruktur festgelegt; wenn sie
     * geändert wird, wird dies vor einer Berechnung geprüft).
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
     * Laufzeit des Sparbriefs in Jahren oder Laufzeit des Termingelds in Tagen
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLaufzeit() {
        return laufzeit;
    }

    /**
     * Sets the value of the laufzeit property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLaufzeit()
     */
    public void setLaufzeit(Double value) {
        this.laufzeit = value;
    }

    /**
     * Zeitpunkt des Sparbriefendes, Zeitpunkt des Termingeldendes
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLaufzeitendeDatum() {
        return laufzeitendeDatum;
    }

    /**
     * Sets the value of the laufzeitendeDatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getLaufzeitendeDatum()
     */
    public void setLaufzeitendeDatum(XMLGregorianCalendar value) {
        this.laufzeitendeDatum = value;
    }

    /**
     * Summe, die am Anlagedatum eingezahlt wird
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAnlagebetrag() {
        return anlagebetrag;
    }

    /**
     * Sets the value of the anlagebetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAnlagebetrag()
     */
    public void setAnlagebetrag(Double value) {
        this.anlagebetrag = value;
    }

    /**
     * Auszahlungsbetrag am Ende der Laufzeit
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEndvermoegen() {
        return endvermoegen;
    }

    /**
     * Sets the value of the endvermoegen property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEndvermoegen()
     */
    public void setEndvermoegen(Double value) {
        this.endvermoegen = value;
    }

    /**
     * Sparbrief:
     * Wenn unter Zinskonditionen Zinstabelle (zeitabhängig) = zeitunabhängig und Zinstabelle
     * (betragsabhängig) = betragsunabhängig: Höhe des nominalen Zinssatzes für ein Jahr.
     * Wenn Zinstabelle (zeitabhängig) ungleich zeitunabhängig oder Zinstabelle (betragsabhängig)
     * ungleich betragsunabhängig ist, wird hier ein Hinweistext auf die Zinsstaffel-Tabelle unter
     * Zinskonditionen angezeigt.
     * Termingeld:
     * Wenn unter Zinskonditionen Zinstabelle (betragsabhängig) = betragsunabhängig: Höhe des nominalen
     * Zinssatzes für ein Jahr.
     * Wenn Zinstabelle (betragsabhängig) ungleich betragsunabhängig ist, wird hier ein Hinweistext auf
     * die Zinsstaffel-Tabelle unter Zinskonditionen angezeigt.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNominalzins() {
        return nominalzins;
    }

    /**
     * Sets the value of the nominalzins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNominalzins()
     */
    public void setNominalzins(Double value) {
        this.nominalzins = value;
    }

    /**
     * Legt fest, ob Zinszahlungen auf dem Konto gutgeschrieben oder ausgezahlt werden
     * Zinsen ausschütten (true) oder verrechnen (false)
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isZinsausschuettung() {
        return zinsausschuettung;
    }

    /**
     * Sets the value of the zinsausschuettung property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isZinsausschuettung()
     */
    public void setZinsausschuettung(Boolean value) {
        this.zinsausschuettung = value;
    }

    /**
     * Betragsabhängiger Zinsverlauf: betragsunabhängig Zinssaldo Summe der Einzahlungen
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isZinsNachKontostand() {
        return zinsNachKontostand;
    }

    /**
     * Sets the value of the zinsNachKontostand property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isZinsNachKontostand()
     */
    public void setZinsNachKontostand(Boolean value) {
        this.zinsNachKontostand = value;
    }

    /**
     * Legt fest, ob Zins nach Laufzeit / Datum einmalig gemäß Laufzeitende ermittelt wird und dann
     * über die ganze Laufzeit gilt, oder über die gesamte Laufzeit gemäß Zinstabelle angepasst wird.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isZinsGestaffelt() {
        return zinsGestaffelt;
    }

    /**
     * Sets the value of the zinsGestaffelt property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isZinsGestaffelt()
     */
    public void setZinsGestaffelt(Boolean value) {
        this.zinsGestaffelt = value;
    }

    /**
     * Datum der ersten Zinsverrechnung
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErsteZinsverrech() {
        return ersteZinsverrech;
    }

    /**
     * Sets the value of the ersteZinsverrech property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErsteZinsverrech()
     */
    public void setErsteZinsverrech(XMLGregorianCalendar value) {
        this.ersteZinsverrech = value;
    }

    /**
     * Auswahl, welcher prozentuale Kirchensteuersatz bei der Berechnung der Abgeltungssteuersatz
     * zugrunde gelegt werden soll: keine, 8%, 9%.
     * KIRCHENSTEUER_KEINE KIRCHENSTEUER_ACHTPROZENT KIRCHENSTEUER_NEUNPROZENT
     *
     * @return possible object is
     * {@link KirchensteuerProzent }
     */
    public KirchensteuerProzent getKirchensteuerProzent() {
        return kirchensteuerProzent;
    }

    /**
     * Sets the value of the kirchensteuerProzent property.
     *
     * @param value allowed object is
     *              {@link KirchensteuerProzent }
     * @see #getKirchensteuerProzent()
     */
    public void setKirchensteuerProzent(KirchensteuerProzent value) {
        this.kirchensteuerProzent = value;
    }

    /**
     * Kontostandsgrenze 1 für Zins nach Kontostand und Laufzeit oder Datum.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKontostandsgrenze1() {
        return kontostandsgrenze1;
    }

    /**
     * Sets the value of the kontostandsgrenze1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKontostandsgrenze1()
     */
    public void setKontostandsgrenze1(Double value) {
        this.kontostandsgrenze1 = value;
    }

    /**
     * Kontostandsgrenze 2 für Zins nach Kontostand und Laufzeit oder Datum.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKontostandsgrenze2() {
        return kontostandsgrenze2;
    }

    /**
     * Sets the value of the kontostandsgrenze2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKontostandsgrenze2()
     */
    public void setKontostandsgrenze2(Double value) {
        this.kontostandsgrenze2 = value;
    }

    /**
     * Kontostandsgrenze 3 für Zins nach Kontostand und Laufzeit oder Datum.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKontostandsgrenze3() {
        return kontostandsgrenze3;
    }

    /**
     * Sets the value of the kontostandsgrenze3 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKontostandsgrenze3()
     */
    public void setKontostandsgrenze3(Double value) {
        this.kontostandsgrenze3 = value;
    }

    /**
     * Kontostandsgrenze 4 für Zins nach Kontostand und Laufzeit oder Datum.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKontostandsgrenze4() {
        return kontostandsgrenze4;
    }

    /**
     * Sets the value of the kontostandsgrenze4 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKontostandsgrenze4()
     */
    public void setKontostandsgrenze4(Double value) {
        this.kontostandsgrenze4 = value;
    }

    /**
     * Tag, an dem die Zinsverrechnung stattfindet. Mögliche Auswahlen sind 1. des Monats, ..., 30. des
     * Monats und Ultimo.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getZinsVerrechnungTag() {
        return zinsVerrechnungTag;
    }

    /**
     * Sets the value of the zinsVerrechnungTag property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getZinsVerrechnungTag()
     */
    public void setZinsVerrechnungTag(BigInteger value) {
        this.zinsVerrechnungTag = value;
    }

    /**
     * Für Sparanlagen mit Anlagedatum vor dem 01.01.2009 stehen für die Steuerberechnung die folgenden
     * Optionen zur Verfügung
     * keine Steuer, Zinsabschlagsteuer, Einkommensteuer, Für Sparanlagen mit Anlagedatum nach dem
     * 31.12.2008 stehen die Auswahlen, keine Steuer, Abgeltungsteuer, zur Verfügung. Soll
     * Zinsabschlagsteuer gezahlt werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isZastZahlen() {
        return zastZahlen;
    }

    /**
     * Sets the value of the zastZahlen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isZastZahlen()
     */
    public void setZastZahlen(Boolean value) {
        this.zastZahlen = value;
    }

    /**
     * Bagatellgrenze für Zinsabschlagsteuer.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZastBagatellgrenze() {
        return zastBagatellgrenze;
    }

    /**
     * Sets the value of the zastBagatellgrenze property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZastBagatellgrenze()
     */
    public void setZastBagatellgrenze(Double value) {
        this.zastBagatellgrenze = value;
    }

    /**
     * Prozentsatz für Zinsabschlagsteuer.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZastProzent() {
        return zastProzent;
    }

    /**
     * Sets the value of the zastProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZastProzent()
     */
    public void setZastProzent(Double value) {
        this.zastProzent = value;
    }

    /**
     * Bis zu dieser Höhe werden Zinsen nicht mit Abgeltungsteuer belastet.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZastFreibetrag() {
        return zastFreibetrag;
    }

    /**
     * Sets the value of the zastFreibetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZastFreibetrag()
     */
    public void setZastFreibetrag(Double value) {
        this.zastFreibetrag = value;
    }

    /**
     * Prozentsatz des Solidaritätszuschlags für Abgeltungsteuer. Dieser Wert wird in den
     * Voreinstellungen vorbelegt und kann verändert werden.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZastSoliProzent() {
        return zastSoliProzent;
    }

    /**
     * Sets the value of the zastSoliProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZastSoliProzent()
     */
    public void setZastSoliProzent(Double value) {
        this.zastSoliProzent = value;
    }

    /**
     * Für Sparanlagen mit Anlagedatum vor dem 01.01.2009 stehen für die Steuerberechnung die folgenden
     * Optionen zur Verfügung
     * keine Steuer, Zinsabschlagsteuer, Einkommensteuer
     * Für Sparanlagen mit Anlagedatum nach dem 31.12.2008 stehen die Auswahlen keine Steuer,
     * Abgeltungsteuer zur Verfügung.
     * Soll Einkommensteuer gezahlt werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isEkstZahlen() {
        return ekstZahlen;
    }

    /**
     * Sets the value of the ekstZahlen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isEkstZahlen()
     */
    public void setEkstZahlen(Boolean value) {
        this.ekstZahlen = value;
    }

    /**
     * Prozentsatz für Einkommensteuer.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEkstProzent() {
        return ekstProzent;
    }

    /**
     * Sets the value of the ekstProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEkstProzent()
     */
    public void setEkstProzent(Double value) {
        this.ekstProzent = value;
    }

    /**
     * Soll Abgeltungssteuer gezahlt werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAbstZahlen() {
        return abstZahlen;
    }

    /**
     * Sets the value of the abstZahlen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isAbstZahlen()
     */
    public void setAbstZahlen(Boolean value) {
        this.abstZahlen = value;
    }

    /**
     * Prozentsatz für Abgeltungssteuer.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAbstProzent() {
        return abstProzent;
    }

    /**
     * Sets the value of the abstProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAbstProzent()
     */
    public void setAbstProzent(Double value) {
        this.abstProzent = value;
    }

    /**
     * Betragsabhängiger Zinsverlauf: betragsunabhängig, Zinssaldo, Summe der Einzahlungen, Mischzins
     * ZINS_NACH_KONTOSTAND_ZINSBERECHNUNGSSALDO ZINS_NACH_KONTOSTAND_SUMME_DER_EINZAHLUNGEN
     * ZINS_NACH_KONTOSTAND_MISCHZINS_AUS_ZINSSTUFEN ZINS_NACH_KONTOSTAND_BETRAGSUNABHAENGIG
     *
     * @return possible object is
     * {@link KontostBezug }
     */
    public KontostBezug getKontostBezug() {
        return kontostBezug;
    }

    /**
     * Sets the value of the kontostBezug property.
     *
     * @param value allowed object is
     *              {@link KontostBezug }
     * @see #getKontostBezug()
     */
    public void setKontostBezug(KontostBezug value) {
        this.kontostBezug = value;
    }

    /**
     * Enthält die Basis des Verlaufs (konstant, nach Laufzeit, nach Datum), welche zur Berechnung der
     * Zinsrate benötigt wird.
     * siehe Struktur Verlauf
     *
     * @return possible object is
     * {@link Verlauf }
     */
    public Verlauf getZinsverlauf() {
        return zinsverlauf;
    }

    /**
     * Sets the value of the zinsverlauf property.
     *
     * @param value allowed object is
     *              {@link Verlauf }
     * @see #getZinsverlauf()
     */
    public void setZinsverlauf(Verlauf value) {
        this.zinsverlauf = value;
    }

    /**
     * Steuert, wann die Steuer berechnet wird: am Zinstermin, am Ende
     * Steuerfaelligkeitstyp_ZINSTERMIN Steuerfaelligkeitstyp_ENDE
     *
     * @return possible object is
     * {@link Steuerfaellig }
     */
    public Steuerfaellig getSteuerfaellig() {
        return steuerfaellig;
    }

    /**
     * Sets the value of the steuerfaellig property.
     *
     * @param value allowed object is
     *              {@link Steuerfaellig }
     * @see #getSteuerfaellig()
     */
    public void setSteuerfaellig(Steuerfaellig value) {
        this.steuerfaellig = value;
    }

    /**
     * Zinsusance, auf deren Grundlage der nominale Zins berechnet wird
     *
     * @return possible object is
     * {@link Usance }
     */
    public Usance getUsance() {
        return usance;
    }

    /**
     * Sets the value of the usance property.
     *
     * @param value allowed object is
     *              {@link Usance }
     * @see #getUsance()
     */
    public void setUsance(Usance value) {
        this.usance = value;
    }

    /**
     * Legt fest, ob für jede Einzahlung der Anlagetag oder der Rückzahlungstag mitverzinst wird.
     * TAGE_MITVERZINSEN_EINZAHLUNGSTAGE TAGE_MITVERZINSEN_RUECKZAHLUNGSTAGE
     *
     * @return possible object is
     * {@link TageMitverz }
     */
    public TageMitverz getTageMitverz() {
        return tageMitverz;
    }

    /**
     * Sets the value of the tageMitverz property.
     *
     * @param value allowed object is
     *              {@link TageMitverz }
     * @see #getTageMitverz()
     */
    public void setTageMitverz(TageMitverz value) {
        this.tageMitverz = value;
    }

    /**
     * Rhythmus der Zinszahlung: monatlich, zweimonatlich, vierteljährlich, halbjährlich, jährlich
     * siehe Struktur Perannoangabe
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getZinsRhythmus() {
        return zinsRhythmus;
    }

    /**
     * Sets the value of the zinsRhythmus property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getZinsRhythmus()
     */
    public void setZinsRhythmus(Perannoangabe value) {
        this.zinsRhythmus = value;
    }

    /**
     * Für die Margenrechnung mit Angabe eines Bewertungszinssatzes.(fest/variabel)
     * siehe Struktur Zinsart
     *
     * @return possible object is
     * {@link Zinsart }
     */
    public Zinsart getZinsart() {
        return zinsart;
    }

    /**
     * Sets the value of the zinsart property.
     *
     * @param value allowed object is
     *              {@link Zinsart }
     * @see #getZinsart()
     */
    public void setZinsart(Zinsart value) {
        this.zinsart = value;
    }

    /**
     * Auswahl des in MARZIPAN konfigurierten Produktes
     *
     * @return possible object is
     * {@link String }
     */
    public String getProduktKonfiguration() {
        return produktKonfiguration;
    }

    /**
     * Sets the value of the produktKonfiguration property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getProduktKonfiguration()
     */
    public void setProduktKonfiguration(String value) {
        this.produktKonfiguration = value;
    }

    /**
     * Flag zur Identifikation von Geschäften, die Teil einer Gesamtfinanzierung sind.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIstGesamtfinanzierung() {
        return istGesamtfinanzierung;
    }

    /**
     * Sets the value of the istGesamtfinanzierung property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isIstGesamtfinanzierung()
     */
    public void setIstGesamtfinanzierung(Boolean value) {
        this.istGesamtfinanzierung = value;
    }

    /**
     * Identifiziert zusammengehörige APE-Geschäfte.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKontoID() {
        return kontoID;
    }

    /**
     * Sets the value of the kontoID property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKontoID()
     */
    public void setKontoID(String value) {
        this.kontoID = value;
    }

    /**
     * Enthält zusätzliche Daten zur Kalkulation
     *
     * @return possible object is
     * {@link Kalkulation }
     */
    public Kalkulation getKalkulation() {
        return kalkulation;
    }

    /**
     * Sets the value of the kalkulation property.
     *
     * @param value allowed object is
     *              {@link Kalkulation }
     * @see #getKalkulation()
     */
    public void setKalkulation(Kalkulation value) {
        this.kalkulation = value;
    }

    /**
     * Zusätzliche Angaben zur Berechnung
     *
     * @return possible object is
     * {@link Kalkulationsparameter }
     */
    public Kalkulationsparameter getKalkulationsparameter() {
        return kalkulationsparameter;
    }

    /**
     * Sets the value of the kalkulationsparameter property.
     *
     * @param value allowed object is
     *              {@link Kalkulationsparameter }
     * @see #getKalkulationsparameter()
     */
    public void setKalkulationsparameter(Kalkulationsparameter value) {
        this.kalkulationsparameter = value;
    }

    /**
     * Enthält zusätzliche Daten zur Liquikosten.
     *
     * @return possible object is
     * {@link Liquikosten }
     */
    public Liquikosten getLiquikosten() {
        return liquikosten;
    }

    /**
     * Sets the value of the liquikosten property.
     *
     * @param value allowed object is
     *              {@link Liquikosten }
     * @see #getLiquikosten()
     */
    public void setLiquikosten(Liquikosten value) {
        this.liquikosten = value;
    }

    /**
     * Enthält Daten für die am Geschäft durchgeführten Statusübergänge.
     *
     * @return possible object is
     * {@link StatusuebergangHistory }
     */
    public StatusuebergangHistory getStatusuebergangHistory() {
        return statusuebergangHistory;
    }

    /**
     * Sets the value of the statusuebergangHistory property.
     *
     * @param value allowed object is
     *              {@link StatusuebergangHistory }
     * @see #getStatusuebergangHistory()
     */
    public void setStatusuebergangHistory(StatusuebergangHistory value) {
        this.statusuebergangHistory = value;
    }

    /**
     * Zusätzliche Daten zu impliziten Optionen.
     *
     * @return possible object is
     * {@link ImpliziteOptionen }
     */
    public ImpliziteOptionen getImpliziteoptionen() {
        return impliziteoptionen;
    }

    /**
     * Sets the value of the impliziteoptionen property.
     *
     * @param value allowed object is
     *              {@link ImpliziteOptionen }
     * @see #getImpliziteoptionen()
     */
    public void setImpliziteoptionen(ImpliziteOptionen value) {
        this.impliziteoptionen = value;
    }

    /**
     * Zusätzliche Geschäftsdaten für ein Sparengeschäft des Produkttyps Bonussparplan.
     *
     * @return possible object is
     * {@link Bonussparplan }
     */
    public Bonussparplan getBonussparplan() {
        return bonussparplan;
    }

    /**
     * Sets the value of the bonussparplan property.
     *
     * @param value allowed object is
     *              {@link Bonussparplan }
     * @see #getBonussparplan()
     */
    public void setBonussparplan(Bonussparplan value) {
        this.bonussparplan = value;
    }

    /**
     * Ratenangaben für ein Sparengeschäft des Produkttyps Bonussparplan oder Sparbuch
     *
     * @return possible object is
     * {@link SparenRate }
     */
    public SparenRate getSparenRate() {
        return sparenRate;
    }

    /**
     * Sets the value of the sparenRate property.
     *
     * @param value allowed object is
     *              {@link SparenRate }
     * @see #getSparenRate()
     */
    public void setSparenRate(SparenRate value) {
        this.sparenRate = value;
    }

    /**
     * Zinsstaffel eines Sparengeschäfts für Zins nach Laufzeit, Datum, Kontostand oder Kombinationen.
     *
     * @return possible object is
     * {@link Zinssaetze }
     */
    public Zinssaetze getZinssaetze() {
        return zinssaetze;
    }

    /**
     * Sets the value of the zinssaetze property.
     *
     * @param value allowed object is
     *              {@link Zinssaetze }
     * @see #getZinssaetze()
     */
    public void setZinssaetze(Zinssaetze value) {
        this.zinssaetze = value;
    }

    /**
     * Verwaltungsdaten zu einem Geschäft
     *
     * @return possible object is
     * {@link Verwaltungsdaten }
     */
    public Verwaltungsdaten getVerwaltungsdaten() {
        return verwaltungsdaten;
    }

    /**
     * Sets the value of the verwaltungsdaten property.
     *
     * @param value allowed object is
     *              {@link Verwaltungsdaten }
     * @see #getVerwaltungsdaten()
     */
    public void setVerwaltungsdaten(Verwaltungsdaten value) {
        this.verwaltungsdaten = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     * <p>
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
