
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;


/**
 * Der globale komplexe Typ Kreditgeschaeft enthält die Daten zu Kreditgeschäften.
 *
 * <p>Java class for Kreditgeschaeft complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Kreditgeschaeft">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="letzteBerechnung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="geaendertAm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="geaendertUm" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         <element name="meldenMoeglichBis" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="hinweisBerater" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hinweisTreasury" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="oid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="produktTyp" type="{http://www.gillardon.de/marzipan/integrationsservice}ProduktTyp" minOccurs="0"/>
 *         <element name="statusGeschaeft" type="{http://www.gillardon.de/marzipan/integrationsservice}Geschaeftsstatus" minOccurs="0"/>
 *         <element name="ownername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kundensegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="anfaenglicheTilgung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="anzahlRatenPA" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *         <element name="auszahlungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="auszahlungsdatumUltimo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="disagio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="disagioBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="disagioInklVerrSchaden" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="disagioBetragInklVerrSchaden" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ersteRate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="laufzeit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nominalbetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="auszahlungsbetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="auszahlungskurs" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nominalzins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="marginProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ratenzahlungTag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="usance" type="{http://www.gillardon.de/marzipan/integrationsservice}Usance" minOccurs="0"/>
 *         <element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="zinsart" type="{http://www.gillardon.de/marzipan/integrationsservice}Zinsart" minOccurs="0"/>
 *         <element name="zinsbindung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="zinsbindungUltimo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="liquiditaetsbindungsende" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="liquiditaetsbindungslaufzeit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquibindungUltimo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="kontoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ratenanpassungSondertilgung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ratenanpassungTeilauszahlung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="konditionsStaffelTyp" type="{http://www.gillardon.de/marzipan/integrationsservice}KonditionsStaffelTyp" minOccurs="0"/>
 *         <element name="apeZuZahlenderBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nominalzinsVorVerr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="annuitaetenzins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="restschuldOhneZins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="restschuldMitZins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="apeBeziehung" type="{http://www.gillardon.de/marzipan/integrationsservice}ApeBeziehung" minOccurs="0"/>
 *         <element name="apeVerrechModus" type="{http://www.gillardon.de/marzipan/integrationsservice}ApeVerrechModus" minOccurs="0"/>
 *         <element name="produktKonfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="istGesamtfinanzierung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="kalkulation" type="{http://www.gillardon.de/marzipan/integrationsservice}Kalkulation" minOccurs="0"/>
 *         <element name="kalkulationsparameter" type="{http://www.gillardon.de/marzipan/integrationsservice}Kalkulationsparameter" minOccurs="0"/>
 *         <element name="liquikosten" type="{http://www.gillardon.de/marzipan/integrationsservice}Liquikosten" minOccurs="0"/>
 *         <element name="StatusuebergangHistory" type="{http://www.gillardon.de/marzipan/integrationsservice}StatusuebergangHistory" minOccurs="0"/>
 *         <element name="mitGesamtkosten" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="gesamtkosten" type="{http://www.gillardon.de/marzipan/integrationsservice}Gesamtkosten" minOccurs="0"/>
 *         <element name="kontofuehrung" type="{http://www.gillardon.de/marzipan/integrationsservice}Kontofuehrung" minOccurs="0"/>
 *         <element name="finanzplaetze" type="{http://www.gillardon.de/marzipan/integrationsservice}FinanzplaetzeNamen" minOccurs="0"/>
 *         <element name="iopc" type="{http://www.gillardon.de/marzipan/integrationsservice}Iopc" minOccurs="0"/>
 *         <element name="nebenkosten" type="{http://www.gillardon.de/marzipan/integrationsservice}Nebenkosten" minOccurs="0"/>
 *         <element name="prolongation" type="{http://www.gillardon.de/marzipan/integrationsservice}Prolongation" minOccurs="0"/>
 *         <element name="gedecktungedeckt" type="{http://www.gillardon.de/marzipan/integrationsservice}GedecktUngedeckt" minOccurs="0"/>
 *         <element name="risikodaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Risikodaten" minOccurs="0"/>
 *         <element name="impliziteoptionen" type="{http://www.gillardon.de/marzipan/integrationsservice}ImpliziteOptionen" minOccurs="0"/>
 *         <element name="rolloverdaten" type="{http://www.gillardon.de/marzipan/integrationsservice}RollOver" minOccurs="0"/>
 *         <element name="treppenrechnerdaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Treppenrechner" minOccurs="0"/>
 *         <element name="abloesung" type="{http://www.gillardon.de/marzipan/integrationsservice}Abloesung" minOccurs="0"/>
 *         <element name="mitFtpcBerechnet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ftpcKriterien" type="{http://www.gillardon.de/marzipan/integrationsservice}FtpcKriterien" minOccurs="0"/>
 *         <element name="sondertilgungenAktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="sondertilgungen" type="{http://www.gillardon.de/marzipan/integrationsservice}Sondertilgungen" minOccurs="0"/>
 *         <element name="teilvalutierungenAktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="teilvalutierungen" type="{http://www.gillardon.de/marzipan/integrationsservice}Teilvalutierungen" minOccurs="0"/>
 *         <element name="tilgungssatzwechselAktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="tilgungssatzwechsel" type="{http://www.gillardon.de/marzipan/integrationsservice}Tilgungssatzwechsel" minOccurs="0"/>
 *         <element name="zinswechselAktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="zinswechsel" type="{http://www.gillardon.de/marzipan/integrationsservice}Zinswechsel" minOccurs="0"/>
 *         <element name="ratenwechselAktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ratenwechsel" type="{http://www.gillardon.de/marzipan/integrationsservice}Ratenwechsel" minOccurs="0"/>
 *         <element name="ratenstufeAktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ratenstufen" type="{http://www.gillardon.de/marzipan/integrationsservice}Ratenstufen" minOccurs="0"/>
 *         <element name="bewegungsstufen" type="{http://www.gillardon.de/marzipan/integrationsservice}Bewegungsstufen" minOccurs="0"/>
 *         <element name="datumVollvaluta" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="istUniversaldarlehen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vorgaengerGeschaeft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nachfolgerGeschaeft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="wurzelGeschaeft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulaereRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="zusagedatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="verwaltungsdaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Verwaltungsdaten" minOccurs="0"/>
 *       </all>
 *       <anyAttribute/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kreditgeschaeft", propOrder = {

})
public class Kreditgeschaeft {

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
     * Datum an dem das Geschäft zuletzt geändert wurde.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar geaendertAm;
    /**
     * Uhrzeit an der das Geschäft zuletzt geändert wurde.
     */
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar geaendertUm;
    /**
     * Zeitpunkt, bis zu dem die Meldung des Geschäfts möglich ist.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar meldenMoeglichBis;
    /**
     * Eingabe von Text ("Hinweisen") im Meldeprozess, seitens des Inhabers der Rolle "Berater"
     * für sich und/ oder im Kontext der Schwellenwertprüfung den Adressaten Treasury.
     * Maximal 300 Zeichen.
     */
    protected String hinweisBerater;
    /**
     * Eingabe von Text ("Hinweisen") im Meldeprozess, seitens des Inhabers der Rolle "Treasury"
     * für sich und/ oder im Kontext der Schwellenwertprüfung den Adressaten Berater.
     * Maximal 300 Zeichen.
     */
    protected String hinweisTreasury;
    /**
     * Technischer Name des Geschäfts (Geschäfts-ID)
     */
    protected String name;
    /**
     * Bezeichnung des Geschäfts
     */
    protected String kommentar;
    /**
     * Technischer Schlüssel zur eindeutigen Identifikation des Darlehens in der Datenbank.
     */
    protected Integer oid;
    /**
     * Auswahl des Darlehenstypen
     * Relevant für Kredite / AKTIV: MARZIPAN_ANNUITAETENDARLEHEN MARZIPAN_ANNUITAETENTILGUNG
     * MARZIPAN_TILGUNGSDARLEHEN MARZIPAN_ENDFAELLIGESDARLEHEN
     * MARZIPAN_TREPPENRECHNER_ANNUITAETENDARLEHEN MARZIPAN_TREPPENRECHNER_TILGUNGSDARLEHEN
     * MARZIPAN_TREPPENRECHNER_CASHFLOWSEFFEKTIV
     */
    @XmlSchemaType(name = "string")
    protected ProduktTyp produktTyp;
    /**
     * Legt fest in welchem Status das Geschäft ist.
     * siehe Struktur Geschaeftsstatus
     */
    @XmlSchemaType(name = "string")
    protected Geschaeftsstatus statusGeschaeft;
    /**
     * Benutzername des Anwenders der das Geschäft angelegt hat.
     */
    protected String ownername;
    /**
     * Benutzername des Anwenders der das Darlehen zuletzt geändert hat.
     */
    protected String username;
    /**
     * Kundensegment mit Teilmarkt und Waehrungen.
     */
    protected String kundensegment;
    /**
     * Prozentsatz der Tilgung zum Grundwert Nominalbetrag, der in der ersten Rate verrechnet ist.
     */
    protected Double anfaenglicheTilgung;
    /**
     * Angabe, in welchen Abständen die Raten gezahlt werden. Im Einzelnen: monatlich; zweimonatlich;
     * vierteljährlich; halbjährlich; jährlich;
     * PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERTELJAEHRLICH PA_ZWEIMONATLICH PA_MONATLICH
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe anzahlRatenPA;
    /**
     * Auszahlungsdatum des Darlehens (Wenn die Auszahlung in mehreren Teilauszahlungen erfolgt, so
     * geben Sie diese bei den Sondervereinbarungen an.)
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar auszahlungsdatum;
    /**
     * Kennzeichen, ob in der Zinsusance 30/360 deutsch der 28.02. bzw. der 29.02. im Schaltjahr als
     * der 30.02. zu interpretieren ist (Ultimoflag gesetzt) ist oder ob tatsächlich der 28.02. bzw.
     * der 29.02. im Februar mit 30 Tagen gemeint ist (Ultimoflag nicht gesetzt).
     */
    protected Boolean auszahlungsdatumUltimo;
    /**
     * Prozentsatz des Disagios bezogen auf den Nominalbetrag. Das Disagio ist eine Zinsvorauszahlung
     * und vermindert den Auszahlungsbetrag.
     */
    protected Double disagio;
    /**
     * Wert in EUR des Disagios bezogen auf den Nominalbetrag. Das Disagio ist eine Zinsvorauszahlung
     * und vermindert den Auszahlungsbetrag.
     */
    protected Double disagioBetrag;
    /**
     * DisagioInklVerrSchaden in %
     */
    protected Double disagioInklVerrSchaden;
    /**
     * DisagioInklVerrSchaden als Betrag.
     */
    protected Double disagioBetragInklVerrSchaden;
    /**
     * Der Tag im Monat, an dem die Raten gezahlt werden. Zum Beispiel: des Monats; 15. des Monats; 23.
     * des Monats; Ultimo des Monats;
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ersteRate;
    /**
     * Laufzeit des Darlehens in Jahren bis zum Vertragsende. Z.B. bis zum Zinsbindungsende bei
     * Festzinsdarlehen.
     */
    protected Double laufzeit;
    /**
     * Nominalbetrag des Darlehens. Eingabe ist ein Pflichtfeld.
     */
    protected Double nominalbetrag;
    /**
     * Der tatsächlich ausgezahlte Betrag. Der Auszahlungsbetrag ist der Nominalbetrag vermindert um
     * das Disagio und die Gebühr als Abschlag.
     */
    protected Double auszahlungsbetrag;
    /**
     * Der tatsächlich ausgezahlte Betrag als Prozentsatz zum Grundwert Nominalbetrag. Der
     * Auszahlungsbetrag ist der Nominalbetrag vermindert um das Disagio und die Gebühr als Abschlag.
     */
    protected Double auszahlungskurs;
    /**
     * Der Nominalzins ist der Zins, mit dem der Kredit ab Datum der Auszahlung bis zum Ende der
     * Zinsbindung verzinst wird.
     */
    protected Double nominalzins;
    /**
     * Es gilt: Nominalzins = aktueller Referenzzins + Aufschlag (auf den Referenzzins)
     */
    protected Double marginProzent;
    /**
     * Die Höhe der Rate berechnet sich aus der Summe des Prozentwertes des Nominalzinses
     * und des Prozentwertes der anfänglichen Tilgung.
     */
    protected Double rate;
    /**
     * Der Tag im Monat, an welchem die Raten gezahlt werden.
     */
    protected Integer ratenzahlungTag;
    /**
     * Hier wird die Zinsusance eingestellt, auf deren Grundlage der nominale Zins berechnet wird.
     * siehe Struktur Usance
     */
    @XmlSchemaType(name = "string")
    protected Usance usance;
    /**
     * ISO Code der Geschäftswährung.
     */
    protected String waehrung;
    /**
     * Abhängig von der eingestellten Darlehensart wird zwischen folgenden Darlehen unterschieden:
     * Festzinsdarlehen Darlehensart fest
     * Bei einem Festzinsdarlehen ist der Nominalzins für die Dauer der Laufzeit (Zinsbindung)
     * vertraglich festgeschrieben. Aus diesem Grund können Marge und Margenbarwert exakt bestimmt
     * werden.
     * Variable Darlehen Darlehensart variabel
     * Das variable Darlehen unterscheidet sich vom Festzinsdarlehen darin, dass die Bank den
     * Nominalzins ohne Beachtung fester Fristen oder ohne vertraglich fixierte Bemessungsvorschrift
     * von sich aus an eine geänderte Zinssituation anpassen kann.
     * Für die Margenrechnung müssen Sie beim variablen Darlehen einen Bewertungszins vorgeben. Dieser
     * entspricht - in gewisser Weise - dem Einstandszins bei einem Festzinsdarlehen.
     * ZINSART_FEST ZINSART_VARIABEL
     */
    @XmlSchemaType(name = "string")
    protected Zinsart zinsart;
    /**
     * Datum, bis zu welchem der Nominalzins fix ist. (Alternative Angabe als Laufzeit)Datum bis zu dem
     * die Zinsbindung gilt.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zinsbindung;
    /**
     * Kennzeichen, ob in der Zinsusance 30/360 deutsch der 28.02.  bzw. der 29.02. im Schaltjahr als
     * der 30.02. zu interpretieren ist (Ultimoflag gesetzt) ist oder ob tatsächlich der 28.02. bzw.
     * der 29.02. im Februar mit 30 Tagen gemeint ist (Ultimoflag nicht gesetzt).
     */
    protected Boolean zinsbindungUltimo;
    /**
     * Der letzte Tag der Liquiditätsbindung. Gibt an, ob der letzte Tag (das Liquiditätsbindungsende)
     * der Darlehenslaufzeit mitverzinst werden soll.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar liquiditaetsbindungsende;
    /**
     * Liquiditätsbindung in Jahren
     */
    protected Double liquiditaetsbindungslaufzeit;
    /**
     * Ob das Liquiditätsbindungsende ein Ultimo ist?
     */
    protected Boolean liquibindungUltimo;
    /**
     * Identifiziert zusammengehörige APE-Geschäfte.
     */
    protected String kontoID;
    /**
     * Nach jeder Sondertilgung wird die Rate soweit vermindert, dass sich am Tilgungsverlauf nichts
     * ändert.
     */
    protected Boolean ratenanpassungSondertilgung;
    /**
     * Nach jeder Auszahlung wird die Rate soweit erhöht, dass sich am Tilgungsverlauf nichts ändert.
     */
    protected Boolean ratenanpassungTeilauszahlung;
    /**
     * Welche Staffel: Nominalzins, Aufschlag extern oder Marge nominal
     * siehe Struktur KonditionsStaffelTyp
     */
    @XmlSchemaType(name = "string")
    protected KonditionsStaffelTyp konditionsStaffelTyp;
    /**
     * Vom Kunden zu zahlenden Betrag aufgrund des außerplanmäßigen Ereignisses
     */
    protected Double apeZuZahlenderBetrag;
    /**
     * Wird der Schaden mit dem Nominalzins des Neugeschäfts verrechnet, sind die zusätzlichen
     * Ergebnisfelder Auszahlungsbetrag inkl. verrechnetem Schaden und Nominalzins vorhanden (der
     * Nominalzins vor der Schadensverrechnung wird dann als Nominalzins vor Verrechnung bezeichnet).
     */
    protected Double nominalzinsVorVerr;
    /**
     * Raten eines Annuitätendarlehens setzen sich immer aus Zins und Tilgungsanteilen zusammen. In der
     * Annuitätentilgung wird das Darlehen wie immer mit dem Nominalzins verzinst, der Tilgungsanteil
     * wird allerdings aus einem parallel berechneten Darlehen übernommen, das bei gleichem
     * Tilgungsanteil mit dem Annuitätenzins verzinst wird. Dadurch ist gewährleistet, dass sich die
     * Restschulden beider Darlehen gleich entwickeln. Das bedeutet aber auch, dass die Ratenhöhe von
     * Termin zu Termin wechselt.
     */
    protected Double annuitaetenzins;
    /**
     * Die Restschuld zum Ablauf der Zinsbindung
     */
    protected Double restschuldOhneZins;
    /**
     * Die Restschuld zum Ablauf der Zinsbindung, ergänzt um den Restzins
     */
    protected Double restschuldMitZins;
    /**
     * Beziehung des Kreditgeschäfts zu einer APE-Berechnung
     * KEIN_APE_NEUGESCHAEFT APE_NEUGESCHAEFT_OHNE_SCHADENSVERRECHNUNG
     * APE_NEUGESCHAEFT_MIT_SCHADENSVERRECHNUNG
     */
    @XmlSchemaType(name = "string")
    protected ApeBeziehung apeBeziehung;
    /**
     * Rückrechnungsmodus für die Verrechnung eines APE-Schadens in einem neuen Darlehen
     * (Ratenhöhe oder Tilgung festhalten)
     * TILGUNGSSATZ_FEST RESTSCHULD_FEST RATENHOEHE_FEST GESAMTLAUFZEIT_FEST
     */
    @XmlSchemaType(name = "string")
    protected ApeVerrechModus apeVerrechModus;
    /**
     * Auswahl des in MARZIPAN konfigurierten Produktes
     */
    protected String produktKonfiguration;
    /**
     * Flag zur Identifikation von Geschäften, die Teil einer Gesamtfinanzierung sind.
     */
    protected Boolean istGesamtfinanzierung;
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
     * Flag, ob Gesamtkostenrechnungen (z.B. auch für die Berechnung des PAngV-Effektivzinses)
     * durchgeführt werden sollen.
     * Diese Einstellmöglichkeit gibt es nur für Universaldarlehen.
     * Für alle anderen Produkttypen wird das Flag nicht ausgewertet, d.h. es zieht die
     * Produkttyp-spezifische Einstellung.
     */
    protected Boolean mitGesamtkosten;
    /**
     * Die Gesamtkosten beziehen sich auf eine
     * hypothetische Laufzeit bis zur vollständigen
     * Tilgung des Darlehens.
     */
    protected Gesamtkosten gesamtkosten;
    /**
     * Zusätzliche Daten zur Kontoführung.
     */
    protected Kontofuehrung kontofuehrung;
    /**
     * Es können mehrere Finanzplaetze gleichzeitig aktiv sein.
     */
    protected FinanzplaetzeNamen finanzplaetze;
    /**
     * Daten fuer IOPC.
     */
    protected Iopc iopc;
    /**
     * Nebenkosten und Gebühren.
     */
    protected Nebenkosten nebenkosten;
    /**
     * Zusätzliche Daten für die Prolongation eines Darlehens.
     */
    protected Prolongation prolongation;
    /**
     * Spezielle Daten für teilweise gedeckte Darlehen.
     */
    protected GedecktUngedeckt gedecktungedeckt;
    /**
     * Risikodaten zum Geschäft.
     */
    protected Risikodaten risikodaten;
    /**
     * Zusätzliche Daten zu impliziten Optionen.
     */
    protected ImpliziteOptionen impliziteoptionen;
    /**
     * Spezielle Daten für Roll-Over-Darlehen.
     */
    protected RollOver rolloverdaten;
    /**
     * Spezielle Daten für Treppenrechner.
     */
    protected Treppenrechner treppenrechnerdaten;
    /**
     * Spezielle Daten für Vorfälligkeitsentschädigung.
     */
    protected Abloesung abloesung;
    /**
     * Flag, ob die Zinsstrukturen wurden mit Ftpc berechnet.
     */
    protected Boolean mitFtpcBerechnet;
    /**
     * Ftpc Kriterien
     */
    protected FtpcKriterien ftpcKriterien;
    /**
     * Die Checkbox steuert, ob die Sondertilgungen aktiv sind und an Rechenkern übergeben werden.
     */
    protected Boolean sondertilgungenAktiv;
    /**
     * Tilgungszeilen bei Sondertilgungen
     */
    protected Sondertilgungen sondertilgungen;
    /**
     * Die Checkbox steuert, ob die Teilvalutierungen aktiv sind und an Rechenkern übergeben werden.
     */
    protected Boolean teilvalutierungenAktiv;
    /**
     * Teilauszahlungen des Darlehens.
     */
    protected Teilvalutierungen teilvalutierungen;
    /**
     * Die Checkbox steuert, ob der Tilgungssatzwechsel aktiviert ist und an Rechenkern übergeben wird.
     */
    protected Boolean tilgungssatzwechselAktiv;
    /**
     * Vertragliche Tilgungssatzwechsel bei
     * Annuitätendarlehen.
     */
    protected Tilgungssatzwechsel tilgungssatzwechsel;
    /**
     * Die Checkbox steuert, ob der Zinswechsel aktiv ist und an Rechenkern übergeben wird.
     */
    protected Boolean zinswechselAktiv;
    /**
     * Vertraglich festgelegter Zinssatzwechsel
     */
    protected Zinswechsel zinswechsel;
    /**
     * Die Checkbox steuert, ob der Ratenwechsel aktiv ist und an Rechenkern übergeben wird.
     */
    protected Boolean ratenwechselAktiv;
    /**
     * Vertraglich festgelegte Ratenwechsel bei Tilgungsdarlehen.
     */
    protected Ratenwechsel ratenwechsel;
    /**
     * Ist die Ratenstufentabelle aktiviert? Kundenspezifische Erweiterung für Universaldarlehen.
     */
    protected Boolean ratenstufeAktiv;
    /**
     * Vertragliche Raten bei Tilgungsdarlehen oder Annuitätendarlehen.
     * Kundenspezifische Erweiterung für Universaldarlehen.
     */
    protected Ratenstufen ratenstufen;
    /**
     * Bewegungsstufendefinitionen für Treppenrechnergeschäfte
     */
    protected Bewegungsstufen bewegungsstufen;
    /**
     * Datum an dem die Vollvaluta ist
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVollvaluta;
    /**
     * Ist das Geschäft ein Universaldarlehen?
     */
    protected Boolean istUniversaldarlehen;
    /**
     * Name des Vorgänger-Geschäfts (Geschäfts-ID).
     * Dieses Element verweist bei einer Rekonditionierung von Geschäften
     * per Webservice auf das unmittelbare Vorgänger-Geschäft.
     * Das Element ist ein reines Ausgabefeld. Beim Import wird dieses Element ignoriert.
     */
    protected String vorgaengerGeschaeft;
    /**
     * Name des Nachfolger-Geschäfts (Geschäfts-ID).
     * Dieses Element verweist bei einer Rekonditionierung von Geschäften
     * per Webservice auf das unmittelbare Nachfolger-Geschäft.
     * Das Element ist ein reines Ausgabefeld. Beim Import wird dieses Element ignoriert.
     */
    protected String nachfolgerGeschaeft;
    /**
     * Name des Wurzel-Geschäfts (Geschäfts-ID).
     * Dieses Element verweist bei einer Rekonditionierung von Geschäften
     * per Webservice auf das ursprünglich angelegte Geschäft.
     * Das Element ist ein reines Ausgabefeld. Beim Import wird dieses Element ignoriert.
     */
    protected String wurzelGeschaeft;
    /**
     * Ist das Geschäft mit regulärer Rate berechnet oder nur auf Basis von Sondertilgungen oder einer
     * Ratenstaffel?
     * Das Feld hat eine Auswirkung nur in Universaldarlehen für die Produkttypen: Annuitätendarlehen,
     * Tilgungsdarlehen und Roll-Over Tilgend.
     */
    protected Boolean regulaereRate;
    /**
     * Datum der Zusage des Geschäfts
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zusagedatum;
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
     * Datum an dem das Geschäft zuletzt geändert wurde.
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
     * Zeitpunkt, bis zu dem die Meldung des Geschäfts möglich ist.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getMeldenMoeglichBis() {
        return meldenMoeglichBis;
    }

    /**
     * Sets the value of the meldenMoeglichBis property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getMeldenMoeglichBis()
     */
    public void setMeldenMoeglichBis(XMLGregorianCalendar value) {
        this.meldenMoeglichBis = value;
    }

    /**
     * Eingabe von Text ("Hinweisen") im Meldeprozess, seitens des Inhabers der Rolle "Berater"
     * für sich und/ oder im Kontext der Schwellenwertprüfung den Adressaten Treasury.
     * Maximal 300 Zeichen.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHinweisBerater() {
        return hinweisBerater;
    }

    /**
     * Sets the value of the hinweisBerater property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getHinweisBerater()
     */
    public void setHinweisBerater(String value) {
        this.hinweisBerater = value;
    }

    /**
     * Eingabe von Text ("Hinweisen") im Meldeprozess, seitens des Inhabers der Rolle "Treasury"
     * für sich und/ oder im Kontext der Schwellenwertprüfung den Adressaten Berater.
     * Maximal 300 Zeichen.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHinweisTreasury() {
        return hinweisTreasury;
    }

    /**
     * Sets the value of the hinweisTreasury property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getHinweisTreasury()
     */
    public void setHinweisTreasury(String value) {
        this.hinweisTreasury = value;
    }

    /**
     * Technischer Name des Geschäfts (Geschäfts-ID)
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
     * Bezeichnung des Geschäfts
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
     * Technischer Schlüssel zur eindeutigen Identifikation des Darlehens in der Datenbank.
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
     * Auswahl des Darlehenstypen
     * Relevant für Kredite / AKTIV: MARZIPAN_ANNUITAETENDARLEHEN MARZIPAN_ANNUITAETENTILGUNG
     * MARZIPAN_TILGUNGSDARLEHEN MARZIPAN_ENDFAELLIGESDARLEHEN
     * MARZIPAN_TREPPENRECHNER_ANNUITAETENDARLEHEN MARZIPAN_TREPPENRECHNER_TILGUNGSDARLEHEN
     * MARZIPAN_TREPPENRECHNER_CASHFLOWSEFFEKTIV
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
     * Legt fest in welchem Status das Geschäft ist.
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
     * Benutzername des Anwenders der das Darlehen zuletzt geändert hat.
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
     * Kundensegment mit Teilmarkt und Waehrungen.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKundensegment() {
        return kundensegment;
    }

    /**
     * Sets the value of the kundensegment property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKundensegment()
     */
    public void setKundensegment(String value) {
        this.kundensegment = value;
    }

    /**
     * Prozentsatz der Tilgung zum Grundwert Nominalbetrag, der in der ersten Rate verrechnet ist.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAnfaenglicheTilgung() {
        return anfaenglicheTilgung;
    }

    /**
     * Sets the value of the anfaenglicheTilgung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAnfaenglicheTilgung()
     */
    public void setAnfaenglicheTilgung(Double value) {
        this.anfaenglicheTilgung = value;
    }

    /**
     * Angabe, in welchen Abständen die Raten gezahlt werden. Im Einzelnen: monatlich; zweimonatlich;
     * vierteljährlich; halbjährlich; jährlich;
     * PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERTELJAEHRLICH PA_ZWEIMONATLICH PA_MONATLICH
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getAnzahlRatenPA() {
        return anzahlRatenPA;
    }

    /**
     * Sets the value of the anzahlRatenPA property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getAnzahlRatenPA()
     */
    public void setAnzahlRatenPA(Perannoangabe value) {
        this.anzahlRatenPA = value;
    }

    /**
     * Auszahlungsdatum des Darlehens (Wenn die Auszahlung in mehreren Teilauszahlungen erfolgt, so
     * geben Sie diese bei den Sondervereinbarungen an.)
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAuszahlungsdatum() {
        return auszahlungsdatum;
    }

    /**
     * Sets the value of the auszahlungsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAuszahlungsdatum()
     */
    public void setAuszahlungsdatum(XMLGregorianCalendar value) {
        this.auszahlungsdatum = value;
    }

    /**
     * Kennzeichen, ob in der Zinsusance 30/360 deutsch der 28.02. bzw. der 29.02. im Schaltjahr als
     * der 30.02. zu interpretieren ist (Ultimoflag gesetzt) ist oder ob tatsächlich der 28.02. bzw.
     * der 29.02. im Februar mit 30 Tagen gemeint ist (Ultimoflag nicht gesetzt).
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAuszahlungsdatumUltimo() {
        return auszahlungsdatumUltimo;
    }

    /**
     * Sets the value of the auszahlungsdatumUltimo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isAuszahlungsdatumUltimo()
     */
    public void setAuszahlungsdatumUltimo(Boolean value) {
        this.auszahlungsdatumUltimo = value;
    }

    /**
     * Prozentsatz des Disagios bezogen auf den Nominalbetrag. Das Disagio ist eine Zinsvorauszahlung
     * und vermindert den Auszahlungsbetrag.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDisagio() {
        return disagio;
    }

    /**
     * Sets the value of the disagio property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDisagio()
     */
    public void setDisagio(Double value) {
        this.disagio = value;
    }

    /**
     * Wert in EUR des Disagios bezogen auf den Nominalbetrag. Das Disagio ist eine Zinsvorauszahlung
     * und vermindert den Auszahlungsbetrag.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDisagioBetrag() {
        return disagioBetrag;
    }

    /**
     * Sets the value of the disagioBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDisagioBetrag()
     */
    public void setDisagioBetrag(Double value) {
        this.disagioBetrag = value;
    }

    /**
     * DisagioInklVerrSchaden in %
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDisagioInklVerrSchaden() {
        return disagioInklVerrSchaden;
    }

    /**
     * Sets the value of the disagioInklVerrSchaden property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDisagioInklVerrSchaden()
     */
    public void setDisagioInklVerrSchaden(Double value) {
        this.disagioInklVerrSchaden = value;
    }

    /**
     * DisagioInklVerrSchaden als Betrag.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDisagioBetragInklVerrSchaden() {
        return disagioBetragInklVerrSchaden;
    }

    /**
     * Sets the value of the disagioBetragInklVerrSchaden property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDisagioBetragInklVerrSchaden()
     */
    public void setDisagioBetragInklVerrSchaden(Double value) {
        this.disagioBetragInklVerrSchaden = value;
    }

    /**
     * Der Tag im Monat, an dem die Raten gezahlt werden. Zum Beispiel: des Monats; 15. des Monats; 23.
     * des Monats; Ultimo des Monats;
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErsteRate() {
        return ersteRate;
    }

    /**
     * Sets the value of the ersteRate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErsteRate()
     */
    public void setErsteRate(XMLGregorianCalendar value) {
        this.ersteRate = value;
    }

    /**
     * Laufzeit des Darlehens in Jahren bis zum Vertragsende. Z.B. bis zum Zinsbindungsende bei
     * Festzinsdarlehen.
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
     * Nominalbetrag des Darlehens. Eingabe ist ein Pflichtfeld.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNominalbetrag() {
        return nominalbetrag;
    }

    /**
     * Sets the value of the nominalbetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNominalbetrag()
     */
    public void setNominalbetrag(Double value) {
        this.nominalbetrag = value;
    }

    /**
     * Der tatsächlich ausgezahlte Betrag. Der Auszahlungsbetrag ist der Nominalbetrag vermindert um
     * das Disagio und die Gebühr als Abschlag.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAuszahlungsbetrag() {
        return auszahlungsbetrag;
    }

    /**
     * Sets the value of the auszahlungsbetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAuszahlungsbetrag()
     */
    public void setAuszahlungsbetrag(Double value) {
        this.auszahlungsbetrag = value;
    }

    /**
     * Der tatsächlich ausgezahlte Betrag als Prozentsatz zum Grundwert Nominalbetrag. Der
     * Auszahlungsbetrag ist der Nominalbetrag vermindert um das Disagio und die Gebühr als Abschlag.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAuszahlungskurs() {
        return auszahlungskurs;
    }

    /**
     * Sets the value of the auszahlungskurs property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAuszahlungskurs()
     */
    public void setAuszahlungskurs(Double value) {
        this.auszahlungskurs = value;
    }

    /**
     * Der Nominalzins ist der Zins, mit dem der Kredit ab Datum der Auszahlung bis zum Ende der
     * Zinsbindung verzinst wird.
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
     * Es gilt: Nominalzins = aktueller Referenzzins + Aufschlag (auf den Referenzzins)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMarginProzent() {
        return marginProzent;
    }

    /**
     * Sets the value of the marginProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMarginProzent()
     */
    public void setMarginProzent(Double value) {
        this.marginProzent = value;
    }

    /**
     * Die Höhe der Rate berechnet sich aus der Summe des Prozentwertes des Nominalzinses
     * und des Prozentwertes der anfänglichen Tilgung.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRate()
     */
    public void setRate(Double value) {
        this.rate = value;
    }

    /**
     * Der Tag im Monat, an welchem die Raten gezahlt werden.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRatenzahlungTag() {
        return ratenzahlungTag;
    }

    /**
     * Sets the value of the ratenzahlungTag property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getRatenzahlungTag()
     */
    public void setRatenzahlungTag(Integer value) {
        this.ratenzahlungTag = value;
    }

    /**
     * Hier wird die Zinsusance eingestellt, auf deren Grundlage der nominale Zins berechnet wird.
     * siehe Struktur Usance
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
     * ISO Code der Geschäftswährung.
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
     * Abhängig von der eingestellten Darlehensart wird zwischen folgenden Darlehen unterschieden:
     * Festzinsdarlehen Darlehensart fest
     * Bei einem Festzinsdarlehen ist der Nominalzins für die Dauer der Laufzeit (Zinsbindung)
     * vertraglich festgeschrieben. Aus diesem Grund können Marge und Margenbarwert exakt bestimmt
     * werden.
     * Variable Darlehen Darlehensart variabel
     * Das variable Darlehen unterscheidet sich vom Festzinsdarlehen darin, dass die Bank den
     * Nominalzins ohne Beachtung fester Fristen oder ohne vertraglich fixierte Bemessungsvorschrift
     * von sich aus an eine geänderte Zinssituation anpassen kann.
     * Für die Margenrechnung müssen Sie beim variablen Darlehen einen Bewertungszins vorgeben. Dieser
     * entspricht - in gewisser Weise - dem Einstandszins bei einem Festzinsdarlehen.
     * ZINSART_FEST ZINSART_VARIABEL
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
     * Datum, bis zu welchem der Nominalzins fix ist. (Alternative Angabe als Laufzeit)Datum bis zu dem
     * die Zinsbindung gilt.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getZinsbindung() {
        return zinsbindung;
    }

    /**
     * Sets the value of the zinsbindung property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getZinsbindung()
     */
    public void setZinsbindung(XMLGregorianCalendar value) {
        this.zinsbindung = value;
    }

    /**
     * Kennzeichen, ob in der Zinsusance 30/360 deutsch der 28.02.  bzw. der 29.02. im Schaltjahr als
     * der 30.02. zu interpretieren ist (Ultimoflag gesetzt) ist oder ob tatsächlich der 28.02. bzw.
     * der 29.02. im Februar mit 30 Tagen gemeint ist (Ultimoflag nicht gesetzt).
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isZinsbindungUltimo() {
        return zinsbindungUltimo;
    }

    /**
     * Sets the value of the zinsbindungUltimo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isZinsbindungUltimo()
     */
    public void setZinsbindungUltimo(Boolean value) {
        this.zinsbindungUltimo = value;
    }

    /**
     * Der letzte Tag der Liquiditätsbindung. Gibt an, ob der letzte Tag (das Liquiditätsbindungsende)
     * der Darlehenslaufzeit mitverzinst werden soll.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLiquiditaetsbindungsende() {
        return liquiditaetsbindungsende;
    }

    /**
     * Sets the value of the liquiditaetsbindungsende property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getLiquiditaetsbindungsende()
     */
    public void setLiquiditaetsbindungsende(XMLGregorianCalendar value) {
        this.liquiditaetsbindungsende = value;
    }

    /**
     * Liquiditätsbindung in Jahren
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLiquiditaetsbindungslaufzeit() {
        return liquiditaetsbindungslaufzeit;
    }

    /**
     * Sets the value of the liquiditaetsbindungslaufzeit property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLiquiditaetsbindungslaufzeit()
     */
    public void setLiquiditaetsbindungslaufzeit(Double value) {
        this.liquiditaetsbindungslaufzeit = value;
    }

    /**
     * Ob das Liquiditätsbindungsende ein Ultimo ist?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isLiquibindungUltimo() {
        return liquibindungUltimo;
    }

    /**
     * Sets the value of the liquibindungUltimo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isLiquibindungUltimo()
     */
    public void setLiquibindungUltimo(Boolean value) {
        this.liquibindungUltimo = value;
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
     * Nach jeder Sondertilgung wird die Rate soweit vermindert, dass sich am Tilgungsverlauf nichts
     * ändert.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRatenanpassungSondertilgung() {
        return ratenanpassungSondertilgung;
    }

    /**
     * Sets the value of the ratenanpassungSondertilgung property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isRatenanpassungSondertilgung()
     */
    public void setRatenanpassungSondertilgung(Boolean value) {
        this.ratenanpassungSondertilgung = value;
    }

    /**
     * Nach jeder Auszahlung wird die Rate soweit erhöht, dass sich am Tilgungsverlauf nichts ändert.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRatenanpassungTeilauszahlung() {
        return ratenanpassungTeilauszahlung;
    }

    /**
     * Sets the value of the ratenanpassungTeilauszahlung property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isRatenanpassungTeilauszahlung()
     */
    public void setRatenanpassungTeilauszahlung(Boolean value) {
        this.ratenanpassungTeilauszahlung = value;
    }

    /**
     * Welche Staffel: Nominalzins, Aufschlag extern oder Marge nominal
     * siehe Struktur KonditionsStaffelTyp
     *
     * @return possible object is
     * {@link KonditionsStaffelTyp }
     */
    public KonditionsStaffelTyp getKonditionsStaffelTyp() {
        return konditionsStaffelTyp;
    }

    /**
     * Sets the value of the konditionsStaffelTyp property.
     *
     * @param value allowed object is
     *              {@link KonditionsStaffelTyp }
     * @see #getKonditionsStaffelTyp()
     */
    public void setKonditionsStaffelTyp(KonditionsStaffelTyp value) {
        this.konditionsStaffelTyp = value;
    }

    /**
     * Vom Kunden zu zahlenden Betrag aufgrund des außerplanmäßigen Ereignisses
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getApeZuZahlenderBetrag() {
        return apeZuZahlenderBetrag;
    }

    /**
     * Sets the value of the apeZuZahlenderBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getApeZuZahlenderBetrag()
     */
    public void setApeZuZahlenderBetrag(Double value) {
        this.apeZuZahlenderBetrag = value;
    }

    /**
     * Wird der Schaden mit dem Nominalzins des Neugeschäfts verrechnet, sind die zusätzlichen
     * Ergebnisfelder Auszahlungsbetrag inkl. verrechnetem Schaden und Nominalzins vorhanden (der
     * Nominalzins vor der Schadensverrechnung wird dann als Nominalzins vor Verrechnung bezeichnet).
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNominalzinsVorVerr() {
        return nominalzinsVorVerr;
    }

    /**
     * Sets the value of the nominalzinsVorVerr property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNominalzinsVorVerr()
     */
    public void setNominalzinsVorVerr(Double value) {
        this.nominalzinsVorVerr = value;
    }

    /**
     * Raten eines Annuitätendarlehens setzen sich immer aus Zins und Tilgungsanteilen zusammen. In der
     * Annuitätentilgung wird das Darlehen wie immer mit dem Nominalzins verzinst, der Tilgungsanteil
     * wird allerdings aus einem parallel berechneten Darlehen übernommen, das bei gleichem
     * Tilgungsanteil mit dem Annuitätenzins verzinst wird. Dadurch ist gewährleistet, dass sich die
     * Restschulden beider Darlehen gleich entwickeln. Das bedeutet aber auch, dass die Ratenhöhe von
     * Termin zu Termin wechselt.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAnnuitaetenzins() {
        return annuitaetenzins;
    }

    /**
     * Sets the value of the annuitaetenzins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAnnuitaetenzins()
     */
    public void setAnnuitaetenzins(Double value) {
        this.annuitaetenzins = value;
    }

    /**
     * Die Restschuld zum Ablauf der Zinsbindung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRestschuldOhneZins() {
        return restschuldOhneZins;
    }

    /**
     * Sets the value of the restschuldOhneZins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRestschuldOhneZins()
     */
    public void setRestschuldOhneZins(Double value) {
        this.restschuldOhneZins = value;
    }

    /**
     * Die Restschuld zum Ablauf der Zinsbindung, ergänzt um den Restzins
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRestschuldMitZins() {
        return restschuldMitZins;
    }

    /**
     * Sets the value of the restschuldMitZins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRestschuldMitZins()
     */
    public void setRestschuldMitZins(Double value) {
        this.restschuldMitZins = value;
    }

    /**
     * Beziehung des Kreditgeschäfts zu einer APE-Berechnung
     * KEIN_APE_NEUGESCHAEFT APE_NEUGESCHAEFT_OHNE_SCHADENSVERRECHNUNG
     * APE_NEUGESCHAEFT_MIT_SCHADENSVERRECHNUNG
     *
     * @return possible object is
     * {@link ApeBeziehung }
     */
    public ApeBeziehung getApeBeziehung() {
        return apeBeziehung;
    }

    /**
     * Sets the value of the apeBeziehung property.
     *
     * @param value allowed object is
     *              {@link ApeBeziehung }
     * @see #getApeBeziehung()
     */
    public void setApeBeziehung(ApeBeziehung value) {
        this.apeBeziehung = value;
    }

    /**
     * Rückrechnungsmodus für die Verrechnung eines APE-Schadens in einem neuen Darlehen
     * (Ratenhöhe oder Tilgung festhalten)
     * TILGUNGSSATZ_FEST RESTSCHULD_FEST RATENHOEHE_FEST GESAMTLAUFZEIT_FEST
     *
     * @return possible object is
     * {@link ApeVerrechModus }
     */
    public ApeVerrechModus getApeVerrechModus() {
        return apeVerrechModus;
    }

    /**
     * Sets the value of the apeVerrechModus property.
     *
     * @param value allowed object is
     *              {@link ApeVerrechModus }
     * @see #getApeVerrechModus()
     */
    public void setApeVerrechModus(ApeVerrechModus value) {
        this.apeVerrechModus = value;
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
     * Flag, ob Gesamtkostenrechnungen (z.B. auch für die Berechnung des PAngV-Effektivzinses)
     * durchgeführt werden sollen.
     * Diese Einstellmöglichkeit gibt es nur für Universaldarlehen.
     * Für alle anderen Produkttypen wird das Flag nicht ausgewertet, d.h. es zieht die
     * Produkttyp-spezifische Einstellung.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMitGesamtkosten() {
        return mitGesamtkosten;
    }

    /**
     * Sets the value of the mitGesamtkosten property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMitGesamtkosten()
     */
    public void setMitGesamtkosten(Boolean value) {
        this.mitGesamtkosten = value;
    }

    /**
     * Die Gesamtkosten beziehen sich auf eine
     * hypothetische Laufzeit bis zur vollständigen
     * Tilgung des Darlehens.
     *
     * @return possible object is
     * {@link Gesamtkosten }
     */
    public Gesamtkosten getGesamtkosten() {
        return gesamtkosten;
    }

    /**
     * Sets the value of the gesamtkosten property.
     *
     * @param value allowed object is
     *              {@link Gesamtkosten }
     * @see #getGesamtkosten()
     */
    public void setGesamtkosten(Gesamtkosten value) {
        this.gesamtkosten = value;
    }

    /**
     * Zusätzliche Daten zur Kontoführung.
     *
     * @return possible object is
     * {@link Kontofuehrung }
     */
    public Kontofuehrung getKontofuehrung() {
        return kontofuehrung;
    }

    /**
     * Sets the value of the kontofuehrung property.
     *
     * @param value allowed object is
     *              {@link Kontofuehrung }
     * @see #getKontofuehrung()
     */
    public void setKontofuehrung(Kontofuehrung value) {
        this.kontofuehrung = value;
    }

    /**
     * Es können mehrere Finanzplaetze gleichzeitig aktiv sein.
     *
     * @return possible object is
     * {@link FinanzplaetzeNamen }
     */
    public FinanzplaetzeNamen getFinanzplaetze() {
        return finanzplaetze;
    }

    /**
     * Sets the value of the finanzplaetze property.
     *
     * @param value allowed object is
     *              {@link FinanzplaetzeNamen }
     * @see #getFinanzplaetze()
     */
    public void setFinanzplaetze(FinanzplaetzeNamen value) {
        this.finanzplaetze = value;
    }

    /**
     * Daten fuer IOPC.
     *
     * @return possible object is
     * {@link Iopc }
     */
    public Iopc getIopc() {
        return iopc;
    }

    /**
     * Sets the value of the iopc property.
     *
     * @param value allowed object is
     *              {@link Iopc }
     * @see #getIopc()
     */
    public void setIopc(Iopc value) {
        this.iopc = value;
    }

    /**
     * Nebenkosten und Gebühren.
     *
     * @return possible object is
     * {@link Nebenkosten }
     */
    public Nebenkosten getNebenkosten() {
        return nebenkosten;
    }

    /**
     * Sets the value of the nebenkosten property.
     *
     * @param value allowed object is
     *              {@link Nebenkosten }
     * @see #getNebenkosten()
     */
    public void setNebenkosten(Nebenkosten value) {
        this.nebenkosten = value;
    }

    /**
     * Zusätzliche Daten für die Prolongation eines Darlehens.
     *
     * @return possible object is
     * {@link Prolongation }
     */
    public Prolongation getProlongation() {
        return prolongation;
    }

    /**
     * Sets the value of the prolongation property.
     *
     * @param value allowed object is
     *              {@link Prolongation }
     * @see #getProlongation()
     */
    public void setProlongation(Prolongation value) {
        this.prolongation = value;
    }

    /**
     * Spezielle Daten für teilweise gedeckte Darlehen.
     *
     * @return possible object is
     * {@link GedecktUngedeckt }
     */
    public GedecktUngedeckt getGedecktungedeckt() {
        return gedecktungedeckt;
    }

    /**
     * Sets the value of the gedecktungedeckt property.
     *
     * @param value allowed object is
     *              {@link GedecktUngedeckt }
     * @see #getGedecktungedeckt()
     */
    public void setGedecktungedeckt(GedecktUngedeckt value) {
        this.gedecktungedeckt = value;
    }

    /**
     * Risikodaten zum Geschäft.
     *
     * @return possible object is
     * {@link Risikodaten }
     */
    public Risikodaten getRisikodaten() {
        return risikodaten;
    }

    /**
     * Sets the value of the risikodaten property.
     *
     * @param value allowed object is
     *              {@link Risikodaten }
     * @see #getRisikodaten()
     */
    public void setRisikodaten(Risikodaten value) {
        this.risikodaten = value;
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
     * Spezielle Daten für Roll-Over-Darlehen.
     *
     * @return possible object is
     * {@link RollOver }
     */
    public RollOver getRolloverdaten() {
        return rolloverdaten;
    }

    /**
     * Sets the value of the rolloverdaten property.
     *
     * @param value allowed object is
     *              {@link RollOver }
     * @see #getRolloverdaten()
     */
    public void setRolloverdaten(RollOver value) {
        this.rolloverdaten = value;
    }

    /**
     * Spezielle Daten für Treppenrechner.
     *
     * @return possible object is
     * {@link Treppenrechner }
     */
    public Treppenrechner getTreppenrechnerdaten() {
        return treppenrechnerdaten;
    }

    /**
     * Sets the value of the treppenrechnerdaten property.
     *
     * @param value allowed object is
     *              {@link Treppenrechner }
     * @see #getTreppenrechnerdaten()
     */
    public void setTreppenrechnerdaten(Treppenrechner value) {
        this.treppenrechnerdaten = value;
    }

    /**
     * Spezielle Daten für Vorfälligkeitsentschädigung.
     *
     * @return possible object is
     * {@link Abloesung }
     */
    public Abloesung getAbloesung() {
        return abloesung;
    }

    /**
     * Sets the value of the abloesung property.
     *
     * @param value allowed object is
     *              {@link Abloesung }
     * @see #getAbloesung()
     */
    public void setAbloesung(Abloesung value) {
        this.abloesung = value;
    }

    /**
     * Flag, ob die Zinsstrukturen wurden mit Ftpc berechnet.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMitFtpcBerechnet() {
        return mitFtpcBerechnet;
    }

    /**
     * Sets the value of the mitFtpcBerechnet property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMitFtpcBerechnet()
     */
    public void setMitFtpcBerechnet(Boolean value) {
        this.mitFtpcBerechnet = value;
    }

    /**
     * Ftpc Kriterien
     *
     * @return possible object is
     * {@link FtpcKriterien }
     */
    public FtpcKriterien getFtpcKriterien() {
        return ftpcKriterien;
    }

    /**
     * Sets the value of the ftpcKriterien property.
     *
     * @param value allowed object is
     *              {@link FtpcKriterien }
     * @see #getFtpcKriterien()
     */
    public void setFtpcKriterien(FtpcKriterien value) {
        this.ftpcKriterien = value;
    }

    /**
     * Die Checkbox steuert, ob die Sondertilgungen aktiv sind und an Rechenkern übergeben werden.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSondertilgungenAktiv() {
        return sondertilgungenAktiv;
    }

    /**
     * Sets the value of the sondertilgungenAktiv property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isSondertilgungenAktiv()
     */
    public void setSondertilgungenAktiv(Boolean value) {
        this.sondertilgungenAktiv = value;
    }

    /**
     * Tilgungszeilen bei Sondertilgungen
     *
     * @return possible object is
     * {@link Sondertilgungen }
     */
    public Sondertilgungen getSondertilgungen() {
        return sondertilgungen;
    }

    /**
     * Sets the value of the sondertilgungen property.
     *
     * @param value allowed object is
     *              {@link Sondertilgungen }
     * @see #getSondertilgungen()
     */
    public void setSondertilgungen(Sondertilgungen value) {
        this.sondertilgungen = value;
    }

    /**
     * Die Checkbox steuert, ob die Teilvalutierungen aktiv sind und an Rechenkern übergeben werden.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTeilvalutierungenAktiv() {
        return teilvalutierungenAktiv;
    }

    /**
     * Sets the value of the teilvalutierungenAktiv property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isTeilvalutierungenAktiv()
     */
    public void setTeilvalutierungenAktiv(Boolean value) {
        this.teilvalutierungenAktiv = value;
    }

    /**
     * Teilauszahlungen des Darlehens.
     *
     * @return possible object is
     * {@link Teilvalutierungen }
     */
    public Teilvalutierungen getTeilvalutierungen() {
        return teilvalutierungen;
    }

    /**
     * Sets the value of the teilvalutierungen property.
     *
     * @param value allowed object is
     *              {@link Teilvalutierungen }
     * @see #getTeilvalutierungen()
     */
    public void setTeilvalutierungen(Teilvalutierungen value) {
        this.teilvalutierungen = value;
    }

    /**
     * Die Checkbox steuert, ob der Tilgungssatzwechsel aktiviert ist und an Rechenkern übergeben wird.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTilgungssatzwechselAktiv() {
        return tilgungssatzwechselAktiv;
    }

    /**
     * Sets the value of the tilgungssatzwechselAktiv property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isTilgungssatzwechselAktiv()
     */
    public void setTilgungssatzwechselAktiv(Boolean value) {
        this.tilgungssatzwechselAktiv = value;
    }

    /**
     * Vertragliche Tilgungssatzwechsel bei
     * Annuitätendarlehen.
     *
     * @return possible object is
     * {@link Tilgungssatzwechsel }
     */
    public Tilgungssatzwechsel getTilgungssatzwechsel() {
        return tilgungssatzwechsel;
    }

    /**
     * Sets the value of the tilgungssatzwechsel property.
     *
     * @param value allowed object is
     *              {@link Tilgungssatzwechsel }
     * @see #getTilgungssatzwechsel()
     */
    public void setTilgungssatzwechsel(Tilgungssatzwechsel value) {
        this.tilgungssatzwechsel = value;
    }

    /**
     * Die Checkbox steuert, ob der Zinswechsel aktiv ist und an Rechenkern übergeben wird.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isZinswechselAktiv() {
        return zinswechselAktiv;
    }

    /**
     * Sets the value of the zinswechselAktiv property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isZinswechselAktiv()
     */
    public void setZinswechselAktiv(Boolean value) {
        this.zinswechselAktiv = value;
    }

    /**
     * Vertraglich festgelegter Zinssatzwechsel
     *
     * @return possible object is
     * {@link Zinswechsel }
     */
    public Zinswechsel getZinswechsel() {
        return zinswechsel;
    }

    /**
     * Sets the value of the zinswechsel property.
     *
     * @param value allowed object is
     *              {@link Zinswechsel }
     * @see #getZinswechsel()
     */
    public void setZinswechsel(Zinswechsel value) {
        this.zinswechsel = value;
    }

    /**
     * Die Checkbox steuert, ob der Ratenwechsel aktiv ist und an Rechenkern übergeben wird.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRatenwechselAktiv() {
        return ratenwechselAktiv;
    }

    /**
     * Sets the value of the ratenwechselAktiv property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isRatenwechselAktiv()
     */
    public void setRatenwechselAktiv(Boolean value) {
        this.ratenwechselAktiv = value;
    }

    /**
     * Vertraglich festgelegte Ratenwechsel bei Tilgungsdarlehen.
     *
     * @return possible object is
     * {@link Ratenwechsel }
     */
    public Ratenwechsel getRatenwechsel() {
        return ratenwechsel;
    }

    /**
     * Sets the value of the ratenwechsel property.
     *
     * @param value allowed object is
     *              {@link Ratenwechsel }
     * @see #getRatenwechsel()
     */
    public void setRatenwechsel(Ratenwechsel value) {
        this.ratenwechsel = value;
    }

    /**
     * Ist die Ratenstufentabelle aktiviert? Kundenspezifische Erweiterung für Universaldarlehen.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRatenstufeAktiv() {
        return ratenstufeAktiv;
    }

    /**
     * Sets the value of the ratenstufeAktiv property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isRatenstufeAktiv()
     */
    public void setRatenstufeAktiv(Boolean value) {
        this.ratenstufeAktiv = value;
    }

    /**
     * Vertragliche Raten bei Tilgungsdarlehen oder Annuitätendarlehen.
     * Kundenspezifische Erweiterung für Universaldarlehen.
     *
     * @return possible object is
     * {@link Ratenstufen }
     */
    public Ratenstufen getRatenstufen() {
        return ratenstufen;
    }

    /**
     * Sets the value of the ratenstufen property.
     *
     * @param value allowed object is
     *              {@link Ratenstufen }
     * @see #getRatenstufen()
     */
    public void setRatenstufen(Ratenstufen value) {
        this.ratenstufen = value;
    }

    /**
     * Bewegungsstufendefinitionen für Treppenrechnergeschäfte
     *
     * @return possible object is
     * {@link Bewegungsstufen }
     */
    public Bewegungsstufen getBewegungsstufen() {
        return bewegungsstufen;
    }

    /**
     * Sets the value of the bewegungsstufen property.
     *
     * @param value allowed object is
     *              {@link Bewegungsstufen }
     * @see #getBewegungsstufen()
     */
    public void setBewegungsstufen(Bewegungsstufen value) {
        this.bewegungsstufen = value;
    }

    /**
     * Datum an dem die Vollvaluta ist
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatumVollvaluta() {
        return datumVollvaluta;
    }

    /**
     * Sets the value of the datumVollvaluta property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatumVollvaluta()
     */
    public void setDatumVollvaluta(XMLGregorianCalendar value) {
        this.datumVollvaluta = value;
    }

    /**
     * Ist das Geschäft ein Universaldarlehen?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIstUniversaldarlehen() {
        return istUniversaldarlehen;
    }

    /**
     * Sets the value of the istUniversaldarlehen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isIstUniversaldarlehen()
     */
    public void setIstUniversaldarlehen(Boolean value) {
        this.istUniversaldarlehen = value;
    }

    /**
     * Name des Vorgänger-Geschäfts (Geschäfts-ID).
     * Dieses Element verweist bei einer Rekonditionierung von Geschäften
     * per Webservice auf das unmittelbare Vorgänger-Geschäft.
     * Das Element ist ein reines Ausgabefeld. Beim Import wird dieses Element ignoriert.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVorgaengerGeschaeft() {
        return vorgaengerGeschaeft;
    }

    /**
     * Sets the value of the vorgaengerGeschaeft property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getVorgaengerGeschaeft()
     */
    public void setVorgaengerGeschaeft(String value) {
        this.vorgaengerGeschaeft = value;
    }

    /**
     * Name des Nachfolger-Geschäfts (Geschäfts-ID).
     * Dieses Element verweist bei einer Rekonditionierung von Geschäften
     * per Webservice auf das unmittelbare Nachfolger-Geschäft.
     * Das Element ist ein reines Ausgabefeld. Beim Import wird dieses Element ignoriert.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNachfolgerGeschaeft() {
        return nachfolgerGeschaeft;
    }

    /**
     * Sets the value of the nachfolgerGeschaeft property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getNachfolgerGeschaeft()
     */
    public void setNachfolgerGeschaeft(String value) {
        this.nachfolgerGeschaeft = value;
    }

    /**
     * Name des Wurzel-Geschäfts (Geschäfts-ID).
     * Dieses Element verweist bei einer Rekonditionierung von Geschäften
     * per Webservice auf das ursprünglich angelegte Geschäft.
     * Das Element ist ein reines Ausgabefeld. Beim Import wird dieses Element ignoriert.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWurzelGeschaeft() {
        return wurzelGeschaeft;
    }

    /**
     * Sets the value of the wurzelGeschaeft property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getWurzelGeschaeft()
     */
    public void setWurzelGeschaeft(String value) {
        this.wurzelGeschaeft = value;
    }

    /**
     * Ist das Geschäft mit regulärer Rate berechnet oder nur auf Basis von Sondertilgungen oder einer
     * Ratenstaffel?
     * Das Feld hat eine Auswirkung nur in Universaldarlehen für die Produkttypen: Annuitätendarlehen,
     * Tilgungsdarlehen und Roll-Over Tilgend.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRegulaereRate() {
        return regulaereRate;
    }

    /**
     * Sets the value of the regulaereRate property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isRegulaereRate()
     */
    public void setRegulaereRate(Boolean value) {
        this.regulaereRate = value;
    }

    /**
     * Datum der Zusage des Geschäfts
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getZusagedatum() {
        return zusagedatum;
    }

    /**
     * Sets the value of the zusagedatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getZusagedatum()
     */
    public void setZusagedatum(XMLGregorianCalendar value) {
        this.zusagedatum = value;
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
