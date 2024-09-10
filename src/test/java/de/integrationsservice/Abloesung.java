
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Der globale komplexe Typ "Abloesung" enthält spezielle Daten für Vorfälligkeitsentschädigung.
 *
 * <p>Java class for Abloesung complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Abloesung">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="andereErstArt" type="{http://www.gillardon.de/marzipan/integrationsservice}KOSTENERSTATTART" minOccurs="0"/>
 *         <element name="apeEinstand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="wiederanlagesatzIntern" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="wiederanlagesatzInternGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="wiederanlagesatzInternUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="apeKalkdat" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="apeKalkdatIntern" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="berechnungsart" type="{http://www.gillardon.de/marzipan/integrationsservice}ApeBerechnungsart" minOccurs="0"/>
 *         <element name="apeProduktID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="produktKonfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="produktName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="apeTyp" type="{http://www.gillardon.de/marzipan/integrationsservice}ApeTyp" minOccurs="0"/>
 *         <element name="bruttoschaden" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bruttoschadenIntern" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bruttoschadenVorVerrechnung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bruttoschadenVorVerrechnungIntern" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bruttoschadenVorVerrechnungInternGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bruttoschadenVorVerrechnungInternUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="datumApe" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="datumAuszUrsprung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="datumZuZahlendBetr" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="datumFruehstKuendig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="erstattungKulanz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="erstattungRisikoko" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="erstattungVerwKst" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="erstBruttoschBesch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="folgeGeschKond" type="{http://www.gillardon.de/marzipan/integrationsservice}FOLGEGESCHKOND" minOccurs="0"/>
 *         <element name="hoeheSondertilgung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="hoeheTeilnichtabna" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kapitmktschaden" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kapitmktschadenIntern" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kapitmktschadenInternGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kapitmktschadenInternUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kostenUndGebuehren" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kuendrecht10Jbeach" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="kulanz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margeUrsprungsdarl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margenschaden" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margenschadenIntern" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margenschadenInternGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margenschadenInternUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nettoschaden" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nettoschadenIntern" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nettoschadenGekappt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="rateAmApeDatum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="rateAmApeDatumAusw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="rateSondertilgung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="rateTeilnichtabnah" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="risikokosten" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="risKostErstArt" type="{http://www.gillardon.de/marzipan/integrationsservice}KOSTENERSTATTART" minOccurs="0"/>
 *         <element name="teilmarktID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="teilmarkt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="teilmarktIntern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="teilmarktInternUngedeckt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="verwaltKstRhyt" type="{http://www.gillardon.de/marzipan/integrationsservice}Rhythmus" minOccurs="0"/>
 *         <element name="verwaltkostAbzins" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="verwaltkostenEnde" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="verwaltkostenlfd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="vfeDeckelungAufBasisKreditsaldo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="optimierteSondertilgungsrechte" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="optimierteTilgungswechselrechte" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vorfaelligerBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="vorfaelligerBIsUserVor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="zinsAmApeDatum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinsstrukturID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="zinsstrukturKommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kalkulationsdatumZinsstruktur" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="zinsstrukturInternKommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="zinsstrukturInternUngedecktKommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="zinsstrukturInternKalkulationsdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="zinsstrukturInternUngedecktKalkulationsdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="zuZahlenderBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zuZahlenderBetragIntern" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kundennutzenErst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="margenErstNeug" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margenErstBerechn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="margenErstGBVert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="margenErstNurAltg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="apeDarlehensHerkunft" type="{http://www.gillardon.de/marzipan/integrationsservice}ApeDarlehensHerkunft" minOccurs="0"/>
 *         <element name="nominalbetragUrsprung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="vertragsbeginnUrsprung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="berechtigtesInteresse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="schadensaufschlagProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="schadensaufschlagBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ausgefalleneZinsen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="begrenzterNettoschaden" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="vfeBegrenzung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="laufzeitBisZBE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="apeDisagioerst" type="{http://www.gillardon.de/marzipan/integrationsservice}ApeDisagioerst" minOccurs="0"/>
 *         <element name="apeSondertilgungen" type="{http://www.gillardon.de/marzipan/integrationsservice}ApeSondertilgungen" minOccurs="0"/>
 *         <element name="tilgungswechselErstAb" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="tilgungswechselErlaubtAnzahl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="tilgungswechselMinTilgungssatz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="tilgungswechselMaxTilgungssatz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="tilgungswechselMinTilgungsrate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="tilgungswechselMaxTilgungsrate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Abloesung", propOrder = {

})
public class Abloesung {

    /**
     * Art der Berechnung der restlichen Erstattungen und der Schadensaufteilung (nominal, effektiv)
     */
    @XmlSchemaType(name = "string")
    protected KOSTENERSTATTART andereErstArt;
    /**
     * Einstandssatz zum Zeitpunkt des außerplanmäßigen Ereignisses
     */
    protected Double apeEinstand;
    /**
     * Wiederanlagesatz der internen Schadensberechnung zum Zeitpunkt des außerplanmäßigen Ereignisses
     */
    protected Double wiederanlagesatzIntern;
    /**
     * Wiederanlagesatz des gedeckten Teils der internen Schadensberechnung zum Zeitpunkt des außerplanmäßigen Ereignisses
     */
    protected Double wiederanlagesatzInternGedeckt;
    /**
     * Wiederanlagesatz des ungedeckten Teils der internen Schadensberechnung zum Zeitpunkt des außerplanmäßigen Ereignisses
     */
    protected Double wiederanlagesatzInternUngedeckt;
    /**
     * Kalkulationsdatum des außerplanmäßigen Ereignisses
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar apeKalkdat;
    /**
     * Kalkulationsdatum für die interne Schadensberechnung des außerplanmäßigen Ereignisses
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar apeKalkdatIntern;
    /**
     * Art der Schadensberechnung: EXTERN; INTERN; EXTERN_INTERN
     */
    @XmlSchemaType(name = "string")
    protected ApeBerechnungsart berechnungsart;
    /**
     * ID des Produkts, welches zur Kalkulation des außerplanmäßigen Ereignisses zu Grunde gelegt wird
     */
    protected Integer apeProduktID;
    /**
     * Technischer Name des APE Produkts
     */
    protected String produktKonfiguration;
    /**
     * Produktname des APE-Produkts in Marzipan Web
     */
    protected String produktName;
    /**
     * Der APE-Typ gibt die Art des ausserplanmäßigen Ereignisses an:
     * (Abloesung, Sondertilgung, Nichtabnahme, Teilnichtabnahme)
     * APE_ABLOESUNG; APE_SONDERTILGUNG; APE_NICHTABNAHME; APE_TEILNICHTABNAHME
     */
    @XmlSchemaType(name = "string")
    protected ApeTyp apeTyp;
    /**
     * Höhe der Brutto-Schadens, der aufgrund des außerplanmäßigen Ereignisses gezahlt werden muss
     * (Vorfaelligkeitsentschädigung, (Teil-)Nichtabnahmeentschädigung)
     */
    protected Double bruttoschaden;
    /**
     * Verrechneter Bruttoschaden aus interner Schadensberechnung
     */
    protected Double bruttoschadenIntern;
    /**
     * Höhe des Brutto-Schadens vor Verrechnung aus externer Schadensberechnung
     */
    protected Double bruttoschadenVorVerrechnung;
    /**
     * Höhe des Brutto-Schadens vor Verrechnung aus interner Schadensberechnung
     */
    protected Double bruttoschadenVorVerrechnungIntern;
    /**
     * Höhe des Brutto-Schadens vor Verrechnung des gedeckten Teils aus der internen Schadensberechnung
     */
    protected Double bruttoschadenVorVerrechnungInternGedeckt;
    /**
     * Höhe des Brutto-Schadens vor Verrechnung des ungedeckten Teils aus der internen Schadensberechnung
     */
    protected Double bruttoschadenVorVerrechnungInternUngedeckt;
    /**
     * Datum, an dem das außerplanmäßige Ereignis stattfindet
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumApe;
    /**
     * Auszahlungsdatum des Ursprungsdarlehens
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumAuszUrsprung;
    /**
     * Datum, an dem der aufgrund des außerplanmäßigen Ereignisses zu zahlende Betrag fällig ist
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZuZahlendBetr;
    /**
     * Datum der frühest möglichen Kündigung unter Berücksichtigung von §489
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumFruehstKuendig;
    /**
     * Eventuell soll der Schaden beziehungsweise ein Teil des Schadens, der aufgrund des
     * außerplanmäßigen Ereignisses entsteht, übernommen werden. (Dies ist z.B. bei vorzeitigen
     * Prolongationen sinnvoll.) Diese Kostenübernahme wird als Erstattung aus Kulanz ausgewiesen.
     */
    protected Double erstattungKulanz;
    /**
     * Durch das außerplanmäßige Ereignis kann sich das Risiko für das Geldinstitut verringern
     * beziehungsweise ganz entfallen. Das eingesparte Geld muss dem Kunden erstattet werden.
     */
    protected Double erstattungRisikoko;
    /**
     * Durch das außerplanmäßige Ereignis können sich die Verwaltungskosten für das Geldinstitut
     * verringern beziehungsweise ganz entfallen. Das eingesparte Geld muss dem Kunden erstattet
     * werden.
     */
    protected Double erstattungVerwKst;
    /**
     * Soll die Erstattung auf den Bruttoschaden beschränkt werden?
     */
    protected Boolean erstBruttoschBesch;
    /**
     * Kondition des APE-Folgegeschäfts
     */
    @XmlSchemaType(name = "string")
    protected FOLGEGESCHKOND folgeGeschKond;
    /**
     * Betrag, der am außerplanmäßig getilgt wird
     */
    protected Double hoeheSondertilgung;
    /**
     * Betrag, der nicht abgenommen wird
     */
    protected Double hoeheTeilnichtabna;
    /**
     * Wenn die Marge des Ursprungsdarlehens bekannt ist, kann der Schaden, der aufgrund des
     * außerplanmäßigen Ereignisses entsteht, in einen Margen- und in einen Kapitalmarktschaden
     * aufgeteilt werden.
     */
    protected Double kapitmktschaden;
    /**
     * Kapitalmarktschaden aus interner Schadensberechnung
     */
    protected Double kapitmktschadenIntern;
    /**
     * Kapitalmarktschaden des gedeckten Teils aus der internen Schadensberechnung
     */
    protected Double kapitmktschadenInternGedeckt;
    /**
     * Kapitalmarktschaden des ungedeckten Teils aus der internen Schadensberechnung
     */
    protected Double kapitmktschadenInternUngedeckt;
    /**
     * Hier können Kosten und Gebühren erfasst werden, die bei der Kalkulation des außerplanmäßigen
     * Ereignisses anfallen.
     */
    protected Double kostenUndGebuehren;
    /**
     * Steuert, ob bei der Berechnung das Kündigungsrecht nach §489 Abs. 1 Nr. 2 BGB berücksichtigt
     * werden soll.
     */
    protected Boolean kuendrecht10Jbeach;
    /**
     * Eventuell soll der Schaden beziehungsweise ein Teil des Schadens, der aufgrund des
     * außerplanmäßigen Ereignisses entsteht, übernommen werden (dies ist z.B. bei vorzeitigen
     * Prolongationen sinnvoll).
     * Diese Kostenübernahme wird als Erstattung aus Kulanz ausgewiesen und wird bei der Eingabe als
     * Prozentgröße angegeben, wobei diese je nach Einstellung der Systemvariablen -Schadensaufteilung
     * u. restl. Erstattungen- bei der Produktkonfiguration eine -nominale- (Einstellung auf
     * Nominalzinsreduzierung) beziehungsweise -effektive- (Einstellung auf Renditeerhöhung oder
     * Margenvorgabe) Rechengröße ist.
     */
    protected Double kulanz;
    /**
     * Der Schaden, der aufgrund des außerplanmäßigen Ereignisses entsteht, kann in einen Margen- und
     * in einen Kapitalmarktschaden aufgeteilt werden. Hierfür wird die nominale Marge des
     * Ursprungsdarlehens benötigt. Wird kein Wert eingegeben, so wird die Schadensaufteilung nicht
     * berechnet. Dieses Feld ist ein -nominaler Wert- und nur vorhanden, wenn bei der
     * Produktkonfiguration die Systemvariable -Schadensaufteilung u. restl. Erstattungen- auf
     * -Nominalzinsreduzierung- eingestellt ist.
     */
    protected Double margeUrsprungsdarl;
    /**
     * Wenn die Marge des Ursprungsdarlehens bekannt ist, kann der Schaden, der aufgrund des
     * außerplanmäßigen Ereignisses entsteht, in einen Margen- und in einen Kapitalmarktschaden
     * aufgeteilt werden.
     */
    protected Double margenschaden;
    /**
     * Margenschaden aus interner Schadensberechnung
     */
    protected Double margenschadenIntern;
    /**
     * Margenschaden des gedeckten Teils aus der internen Schadensberechnung
     */
    protected Double margenschadenInternGedeckt;
    /**
     * Margenschaden des ungedeckten Teils aus der internen Schadensberechnung
     */
    protected Double margenschadenInternUngedeckt;
    /**
     * Die Höhe der Netto-Entschädigung, die wegen des außerplanmäßigen Ereignisses gezahlt werden
     * muss. Ergibt sich aus der Brutto-Entschädigung abzüglich der Erstattungsbeträge für Risiko,
     * Verwaltung und Kulanz und zuzüglich des Berechnungsaufwands.
     */
    protected Double nettoschaden;
    /**
     * Verrechneter Nettoschaden aus interner Schadensberechnung
     */
    protected Double nettoschadenIntern;
    /**
     * Die Vorfälligkeitsentschädigung netto auf 0 gekappt, sofern die Vorfälligkeitsentschädigung
     * netto kleiner 0 ist, und der Kundennutzen nicht erstattet werden soll.
     */
    protected Double nettoschadenGekappt;
    /**
     * Ausstehende Rate am APE-Datum: Wenn die Leistungsstörung an einem Ratentermin stattfindet, so
     * ist eine Rate fällig.
     */
    protected Double rateAmApeDatum;
    /**
     * Wenn am Datum des zu zahlenden Betrags eine Rate oder/und Zinszahlung fällig ist, so kann diese
     * in den zu zahlenden Betrag mit eingerechnet werden.
     */
    protected Boolean rateAmApeDatumAusw;
    /**
     * Angepasste Ratenhöhe nach dem außerplanmäßigen Ereignis (Sondertilgung)
     */
    protected Double rateSondertilgung;
    /**
     * Angepasste Ratenhöhe nach dem außerplanmäßigen Ereignis (Teilnichtabnahme)
     */
    protected Double rateTeilnichtabnah;
    /**
     * Durch das außerplanmäßige Ereignis kann sich das Risiko für das Geldinstitut verringern
     * beziehungsweise ganz entfallen. Das eingesparte Geld muss dem Kunden erstattet werden.
     * Die Risikokosten sind als Prozentgröße anzugeben wobei dieser Wert je nach Einstellung der
     * Systemvariablen -Erstattung der Risikokosten- bei der Produktkonfiguration eine -nominale-
     * (Einstellung auf Nominalzinsreduzierung) beziehungsweise -effektive- (Einstellung auf
     * Renditeerhöhung oder Margenvorgabe) Rechengröße ist.
     */
    protected Double risikokosten;
    /**
     * Art der Berechnung der Erstattung der Risikokosten (nominal, effektiv)
     */
    @XmlSchemaType(name = "string")
    protected KOSTENERSTATTART risKostErstArt;
    /**
     * Datenbank-ID vom Teilmarkt der Zinsstruktur, welche zur Kalkulation
     * des außerplanmäßigen Ereignisses verwendet wird
     */
    protected Integer teilmarktID;
    /**
     * Name des Teilmarkts der Zinsstruktur, welche zur Kalkulation
     * des außerplanmäßigen Ereignisses verwendet wird
     */
    protected String teilmarkt;
    /**
     * Teilmarkt-Name der Zinsstruktur, welche zur internen Schadensberrechnung des außerplanmäßigen
     * Ereignisses verwendet wird
     */
    protected String teilmarktIntern;
    /**
     * Teilmarkt-Name der Zinsstruktur, welche zur internen Schadensberrechnung des ungedeckten Teils des außerplanmäßigen
     * Ereignisses verwendet wird
     */
    protected String teilmarktInternUngedeckt;
    /**
     * Rhythmus der laufenden Verwaltungskosten: -einmalig; -jährlich; -halbjährlich; -viermonatlich;
     * -vierteljährlich; -zweimonatlich; -monatlich
     */
    @XmlSchemaType(name = "string")
    protected Rhythmus verwaltKstRhyt;
    /**
     * Sollen die Verwaltungskosten abgezinst werden?
     */
    protected Boolean verwaltkostAbzins;
    /**
     * Höhe der eingesparten Verwaltungskosten am Ende. Das eingesparte Geld muss dem Kunden erstattet
     * werden.
     */
    protected Double verwaltkostenEnde;
    /**
     * Höhe der eingesparten laufenden Verwaltungskosten.
     * Durch das außerplanmäßige Ereignis können sich laufende Verwaltungskosten für das Geldinstitut
     * verringern beziehungsweise ganz entfallen. Das eingesparte Geld muss dem Kunden erstattet
     * werden.
     */
    protected Double verwaltkostenlfd;
    /**
     * Über diesen Schalter wird gesteuert, ob die in §502 BGB geregelte Deckelung der VFE auf 0,5%
     * bzw. 1% des vorzeitig zurückgezahlten Kapitals auf Basis des Kreditsaldos zum Zeitpunkt der
     * vorzeitigen Rückzahlung des Kredits abzüglich eingestellter optionaler Sondertilgungsrechte bis
     * zu diesem Zeitpunkt berechnet werden soll oder auf Basis des Kreditsaldos inklusive der bis zum
     * Zeitpunkt der vorzeitigen Rückzahlung aufgelaufenen Zinsen.
     */
    protected Boolean vfeDeckelungAufBasisKreditsaldo;
    /**
     * Über diesen Schalter wird gesteuert, ob die Berechnung der VFE nur mit den vorteilhaften
     * Sondertilgungsrechten, oder mit allen erfolgen soll.
     */
    protected Boolean optimierteSondertilgungsrechte;
    /**
     * Über diesen Schalter wird gesteuert, ob Tilgungswechsel-Rechte nur dann in die
     * Vorfälligkeitsentschädigung eingehen, wenn es sich für den Kunden lohnt die Tilgung zu ändern.
     */
    protected Boolean optimierteTilgungswechselrechte;
    /**
     * Höhe des Betrages, der aufgrund des außerplanmäßigen Ereignisses verfrüht fällig wird
     */
    protected Double vorfaelligerBetrag;
    /**
     * Damit wird festgestellt, ob der gespeicherte Wert für vorfälligen Betrag berechnet oder
     * vorgegeben ist.
     */
    protected Boolean vorfaelligerBIsUserVor;
    /**
     * Wenn die Leistungsstörung an einem Zinstermin stattfindet, so ist eine Zinszahlung fällig.
     */
    protected Double zinsAmApeDatum;
    /**
     * Datenbank-ID der Zinsstruktur, welche zur Kalkulation
     * des außerplanmäßigen Ereignisses verwendet wird
     */
    protected Integer zinsstrukturID;
    /**
     * Kommentar der Zinsstruktur, welche zur Kalkulation
     * des außerplanmäßigen Ereignisses verwendet wird
     */
    protected String zinsstrukturKommentar;
    /**
     * Kalkulationsdatum und Uhrzeit der Zinskurve bei Geschäftsänderung
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kalkulationsdatumZinsstruktur;
    /**
     * Kommentar der Zinsstruktur, welche zur internen Schadensberrechnung des außerplanmäßigen
     * Ereignisses verwendet wird
     */
    protected String zinsstrukturInternKommentar;
    /**
     * Kommentar der Zinsstruktur, welche zur internen Schadensberrechnung des ungedeckten Teils des außerplanmäßigen
     * Ereignisses verwendet wird
     */
    protected String zinsstrukturInternUngedecktKommentar;
    /**
     * Kalkulationsdatum und Uhrzeit der Zinsstruktur, welche zur internen Schadensberrechnung des
     * außerplanmäßigen Ereignisses verwendet wird
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar zinsstrukturInternKalkulationsdatum;
    /**
     * Kalkulationsdatum und Uhrzeit der Zinsstruktur, welche zur internen Schadensberrechnung des ungedeckten Teils des
     * außerplanmäßigen Ereignisses verwendet wird
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar zinsstrukturInternUngedecktKalkulationsdatum;
    /**
     * Der vom Kunden zu zahlenden Betrag aufgrund des außerplanmäßigen Ereignisses
     */
    protected Double zuZahlenderBetrag;
    /**
     * Zu zahlender Betrag aus interner Schadensberechnung
     */
    protected Double zuZahlenderBetragIntern;
    /**
     * Soll ein eventuell durch die Geschäftsänderung entstehender Kundennutzen erstattet werden?
     */
    protected Boolean kundennutzenErst;
    /**
     * Höhe der Margenerstattung aus dem Neugeschäft bei gleichzeitigem Abschluss eines Neugeschäfts
     * mit der Ablösung/Nichtabnahme des Altgeschäfts
     */
    protected Double margenErstNeug;
    /**
     * Soll dem Kunden eine Margenerstattung aus dem Alt- und/oder Neugeschäft gewährt werden?
     * Diese Auswahl ist nur bei den Geschäftsänderungsarten -Ablösung- und -Nichtabnahme- vorhanden.
     */
    protected Boolean margenErstBerechn;
    /**
     * Soll bei Vorhandensein eines Neugeschäfts die Margenerstattung aus dem Neugeschäft mit
     * vertauschten Geld-/Briefsätzen berechnet werden?
     * Diese Auswahl ist nur bei den Geschäftsänderungsarten -Ablösung- und -Nichtabnahme- vorhanden.
     */
    protected Boolean margenErstGBVert;
    /**
     * Soll auch bei Vorhandensein eines Neugeschäfts nur die Margenerstattung aus dem Altgeschäft
     * berücksichtigt werden?
     * Diese Einstellung ist nur bei den Geschäftsänderungsarten -Ablösung- und -Nichtabnahme-
     * vorhanden.
     */
    protected Boolean margenErstNurAltg;
    /**
     * Herkunft bzw. Erfassungsart des Altdarlehens, das Basis für eine Geschäftsänderung ist (Bestand
     * MARZIPAN / Bestand nicht MARZIPAN / nach Kontostand)
     * BESTAND_MARZIPAN; BESTAND_NICHT_MARZIPAN; NACH_KONTOSTAND
     */
    @XmlSchemaType(name = "string")
    protected ApeDarlehensHerkunft apeDarlehensHerkunft;
    /**
     * Nominalbetrag des Ursprungsdarlehens (wird für APE nach Kontostand benötigt).
     */
    protected Double nominalbetragUrsprung;
    /**
     * Vertragsbeginn des Ursprungsdarlehens: Auszahlungsdatum auf der Grunddatenseite des
     * Ursprungsdarlehens (wird für APE nach Kontostand benötigt).
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vertragsbeginnUrsprung;
    /**
     * Über die Option -Interesse- kann eingestellt werden, ob die Geschäftsänderung aus berechtigtem
     * oder nicht berechtigtem Interesse erfolgt. Bei berechtigtem Interesse wird eine
     * Vorfälligkeitsentschädigung berechnet, bei nicht berechtigtem Interesse ein
     * Vorfälligkeitsentgelt.
     */
    protected Boolean berechtigtesInteresse;
    /**
     * Prozentualer Aufschlag auf den Bruttoschaden, zur Berechnung des Vorfälligkeitsentgeltes (nur
     * bei nicht berechtigtem Interesse).
     */
    protected Double schadensaufschlagProzent;
    /**
     * Schadensaufschlag, der sich aus dem unter -Aufschlag auf den entstandenen Schaden- vorgegebenen
     * Prozentwert ergibt.
     */
    protected Double schadensaufschlagBetrag;
    /**
     * Zinssumme des ausfallenden Zahlungsstroms.
     */
    protected Double ausgefalleneZinsen;
    /**
     * Wird angezeigt, wenn das Kalkulationsdatum nach dem 10.06.2010 liegt, also ab Inkrafttreten der
     * Verbraucherkreditrichtlinie und das Darlehen nicht grundpfandrechtlich besichert ist. Ist die
     * ursprüngliche Restlaufzeit des Darlehens größer als ein Jahr, wird auf 1% des vorfälligen
     * Betrages gedeckelt, andernfalls auf 0,5%.
     */
    protected Double begrenzterNettoschaden;
    /**
     * Die Option -Begrenzung der VFE gemäß §502 BGB- steht für Berechnungen zur Verfügung bei denen
     * das Kalkulationsdatum nach dem 10.06.2010 liegt. Für nicht grundpfandrechtlich besicherte
     * Darlehen wird die Netto- Vorfälligkeitsentschädigung gemäß den Regelungen der ab dem 11.06.2010
     * zu berücksichtigenden EU-Verbraucherkreditrichtlinie betragsmäßig begrenzt.
     * Die Begrenzung kann wahlweise auf Basis des Kreditsaldos zum Zeitpunkt der vorzeitigen
     * Rückzahlung des Kredits berechnet werden oder auf Basis des Kreditsaldos inklusive der bis zum
     * Zeitpunkt der vorzeitigen Rückzahlung aufgelaufenen Zinsen. Diese Auswahl kann in den
     * Voreinstellungen vorgenommen werden.
     * Gemäß § 502 BGB darf die Netto-Vorfälligkeitsentschädigung nicht größer sein als 0,5% bzw. 1%
     * des vorfälligen Betrages bzw. des Kreditsaldos.
     * Dabei wird gemäß § 502 BGB die Grenze 0,5% herangezogen, wenn die Restlaufzeit des Kredits
     * kleiner oder gleich 1 Jahr ist, anderenfalls wird die Grenze 1% angewendet.
     */
    protected Boolean vfeBegrenzung;
    /**
     * Laufzeit vom APE-Datum bis zum Zinsbindungsende.
     */
    protected Double laufzeitBisZBE;
    /**
     * Falls beim ausserplanmäßigen Ereignis die Disagioerstattung beruecksichtigt werden soll,
     * werden zusaetzliche Eingaben gebraucht.
     */
    protected ApeDisagioerst apeDisagioerst;
    /**
     * Optionale Sondertilgungsrechte, die dem Kunden zugesagt sind.
     */
    protected ApeSondertilgungen apeSondertilgungen;
    /**
     * Tilgungssatzwechselrechte od. Ratenwechselrechte: Wechsel erstmal ab
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tilgungswechselErstAb;
    /**
     * Tilgungssatzwechselrechte od. Ratenwechselrechte: Anzahl der erlaubten Wechsel
     */
    protected Integer tilgungswechselErlaubtAnzahl;
    /**
     * Tilgungssatzwechselrechte: minimaler Tilgungssatz
     */
    protected Double tilgungswechselMinTilgungssatz;
    /**
     * Tilgungssatzwechselrechte: maximaler Tilgungssatz
     */
    protected Double tilgungswechselMaxTilgungssatz;
    /**
     * Ratenwechselrechte: minimale Tilgungsrate
     */
    protected Double tilgungswechselMinTilgungsrate;
    /**
     * Ratenwechselrechte: maximale Tilgungsrate
     */
    protected Double tilgungswechselMaxTilgungsrate;

    /**
     * Art der Berechnung der restlichen Erstattungen und der Schadensaufteilung (nominal, effektiv)
     *
     * @return possible object is
     * {@link KOSTENERSTATTART }
     */
    public KOSTENERSTATTART getAndereErstArt() {
        return andereErstArt;
    }

    /**
     * Sets the value of the andereErstArt property.
     *
     * @param value allowed object is
     *              {@link KOSTENERSTATTART }
     * @see #getAndereErstArt()
     */
    public void setAndereErstArt(KOSTENERSTATTART value) {
        this.andereErstArt = value;
    }

    /**
     * Einstandssatz zum Zeitpunkt des außerplanmäßigen Ereignisses
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getApeEinstand() {
        return apeEinstand;
    }

    /**
     * Sets the value of the apeEinstand property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getApeEinstand()
     */
    public void setApeEinstand(Double value) {
        this.apeEinstand = value;
    }

    /**
     * Wiederanlagesatz der internen Schadensberechnung zum Zeitpunkt des außerplanmäßigen Ereignisses
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getWiederanlagesatzIntern() {
        return wiederanlagesatzIntern;
    }

    /**
     * Sets the value of the wiederanlagesatzIntern property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getWiederanlagesatzIntern()
     */
    public void setWiederanlagesatzIntern(Double value) {
        this.wiederanlagesatzIntern = value;
    }

    /**
     * Wiederanlagesatz des gedeckten Teils der internen Schadensberechnung zum Zeitpunkt des außerplanmäßigen Ereignisses
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getWiederanlagesatzInternGedeckt() {
        return wiederanlagesatzInternGedeckt;
    }

    /**
     * Sets the value of the wiederanlagesatzInternGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getWiederanlagesatzInternGedeckt()
     */
    public void setWiederanlagesatzInternGedeckt(Double value) {
        this.wiederanlagesatzInternGedeckt = value;
    }

    /**
     * Wiederanlagesatz des ungedeckten Teils der internen Schadensberechnung zum Zeitpunkt des außerplanmäßigen Ereignisses
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getWiederanlagesatzInternUngedeckt() {
        return wiederanlagesatzInternUngedeckt;
    }

    /**
     * Sets the value of the wiederanlagesatzInternUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getWiederanlagesatzInternUngedeckt()
     */
    public void setWiederanlagesatzInternUngedeckt(Double value) {
        this.wiederanlagesatzInternUngedeckt = value;
    }

    /**
     * Kalkulationsdatum des außerplanmäßigen Ereignisses
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getApeKalkdat() {
        return apeKalkdat;
    }

    /**
     * Sets the value of the apeKalkdat property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getApeKalkdat()
     */
    public void setApeKalkdat(XMLGregorianCalendar value) {
        this.apeKalkdat = value;
    }

    /**
     * Kalkulationsdatum für die interne Schadensberechnung des außerplanmäßigen Ereignisses
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getApeKalkdatIntern() {
        return apeKalkdatIntern;
    }

    /**
     * Sets the value of the apeKalkdatIntern property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getApeKalkdatIntern()
     */
    public void setApeKalkdatIntern(XMLGregorianCalendar value) {
        this.apeKalkdatIntern = value;
    }

    /**
     * Art der Schadensberechnung: EXTERN; INTERN; EXTERN_INTERN
     *
     * @return possible object is
     * {@link ApeBerechnungsart }
     */
    public ApeBerechnungsart getBerechnungsart() {
        return berechnungsart;
    }

    /**
     * Sets the value of the berechnungsart property.
     *
     * @param value allowed object is
     *              {@link ApeBerechnungsart }
     * @see #getBerechnungsart()
     */
    public void setBerechnungsart(ApeBerechnungsart value) {
        this.berechnungsart = value;
    }

    /**
     * ID des Produkts, welches zur Kalkulation des außerplanmäßigen Ereignisses zu Grunde gelegt wird
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getApeProduktID() {
        return apeProduktID;
    }

    /**
     * Sets the value of the apeProduktID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getApeProduktID()
     */
    public void setApeProduktID(Integer value) {
        this.apeProduktID = value;
    }

    /**
     * Technischer Name des APE Produkts
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
     * Produktname des APE-Produkts in Marzipan Web
     *
     * @return possible object is
     * {@link String }
     */
    public String getProduktName() {
        return produktName;
    }

    /**
     * Sets the value of the produktName property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getProduktName()
     */
    public void setProduktName(String value) {
        this.produktName = value;
    }

    /**
     * Der APE-Typ gibt die Art des ausserplanmäßigen Ereignisses an:
     * (Abloesung, Sondertilgung, Nichtabnahme, Teilnichtabnahme)
     * APE_ABLOESUNG; APE_SONDERTILGUNG; APE_NICHTABNAHME; APE_TEILNICHTABNAHME
     *
     * @return possible object is
     * {@link ApeTyp }
     */
    public ApeTyp getApeTyp() {
        return apeTyp;
    }

    /**
     * Sets the value of the apeTyp property.
     *
     * @param value allowed object is
     *              {@link ApeTyp }
     * @see #getApeTyp()
     */
    public void setApeTyp(ApeTyp value) {
        this.apeTyp = value;
    }

    /**
     * Höhe der Brutto-Schadens, der aufgrund des außerplanmäßigen Ereignisses gezahlt werden muss
     * (Vorfaelligkeitsentschädigung, (Teil-)Nichtabnahmeentschädigung)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBruttoschaden() {
        return bruttoschaden;
    }

    /**
     * Sets the value of the bruttoschaden property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBruttoschaden()
     */
    public void setBruttoschaden(Double value) {
        this.bruttoschaden = value;
    }

    /**
     * Verrechneter Bruttoschaden aus interner Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBruttoschadenIntern() {
        return bruttoschadenIntern;
    }

    /**
     * Sets the value of the bruttoschadenIntern property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBruttoschadenIntern()
     */
    public void setBruttoschadenIntern(Double value) {
        this.bruttoschadenIntern = value;
    }

    /**
     * Höhe des Brutto-Schadens vor Verrechnung aus externer Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBruttoschadenVorVerrechnung() {
        return bruttoschadenVorVerrechnung;
    }

    /**
     * Sets the value of the bruttoschadenVorVerrechnung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBruttoschadenVorVerrechnung()
     */
    public void setBruttoschadenVorVerrechnung(Double value) {
        this.bruttoschadenVorVerrechnung = value;
    }

    /**
     * Höhe des Brutto-Schadens vor Verrechnung aus interner Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBruttoschadenVorVerrechnungIntern() {
        return bruttoschadenVorVerrechnungIntern;
    }

    /**
     * Sets the value of the bruttoschadenVorVerrechnungIntern property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBruttoschadenVorVerrechnungIntern()
     */
    public void setBruttoschadenVorVerrechnungIntern(Double value) {
        this.bruttoschadenVorVerrechnungIntern = value;
    }

    /**
     * Höhe des Brutto-Schadens vor Verrechnung des gedeckten Teils aus der internen Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBruttoschadenVorVerrechnungInternGedeckt() {
        return bruttoschadenVorVerrechnungInternGedeckt;
    }

    /**
     * Sets the value of the bruttoschadenVorVerrechnungInternGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBruttoschadenVorVerrechnungInternGedeckt()
     */
    public void setBruttoschadenVorVerrechnungInternGedeckt(Double value) {
        this.bruttoschadenVorVerrechnungInternGedeckt = value;
    }

    /**
     * Höhe des Brutto-Schadens vor Verrechnung des ungedeckten Teils aus der internen Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBruttoschadenVorVerrechnungInternUngedeckt() {
        return bruttoschadenVorVerrechnungInternUngedeckt;
    }

    /**
     * Sets the value of the bruttoschadenVorVerrechnungInternUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBruttoschadenVorVerrechnungInternUngedeckt()
     */
    public void setBruttoschadenVorVerrechnungInternUngedeckt(Double value) {
        this.bruttoschadenVorVerrechnungInternUngedeckt = value;
    }

    /**
     * Datum, an dem das außerplanmäßige Ereignis stattfindet
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatumApe() {
        return datumApe;
    }

    /**
     * Sets the value of the datumApe property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatumApe()
     */
    public void setDatumApe(XMLGregorianCalendar value) {
        this.datumApe = value;
    }

    /**
     * Auszahlungsdatum des Ursprungsdarlehens
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatumAuszUrsprung() {
        return datumAuszUrsprung;
    }

    /**
     * Sets the value of the datumAuszUrsprung property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatumAuszUrsprung()
     */
    public void setDatumAuszUrsprung(XMLGregorianCalendar value) {
        this.datumAuszUrsprung = value;
    }

    /**
     * Datum, an dem der aufgrund des außerplanmäßigen Ereignisses zu zahlende Betrag fällig ist
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatumZuZahlendBetr() {
        return datumZuZahlendBetr;
    }

    /**
     * Sets the value of the datumZuZahlendBetr property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatumZuZahlendBetr()
     */
    public void setDatumZuZahlendBetr(XMLGregorianCalendar value) {
        this.datumZuZahlendBetr = value;
    }

    /**
     * Datum der frühest möglichen Kündigung unter Berücksichtigung von §489
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatumFruehstKuendig() {
        return datumFruehstKuendig;
    }

    /**
     * Sets the value of the datumFruehstKuendig property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatumFruehstKuendig()
     */
    public void setDatumFruehstKuendig(XMLGregorianCalendar value) {
        this.datumFruehstKuendig = value;
    }

    /**
     * Eventuell soll der Schaden beziehungsweise ein Teil des Schadens, der aufgrund des
     * außerplanmäßigen Ereignisses entsteht, übernommen werden. (Dies ist z.B. bei vorzeitigen
     * Prolongationen sinnvoll.) Diese Kostenübernahme wird als Erstattung aus Kulanz ausgewiesen.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getErstattungKulanz() {
        return erstattungKulanz;
    }

    /**
     * Sets the value of the erstattungKulanz property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getErstattungKulanz()
     */
    public void setErstattungKulanz(Double value) {
        this.erstattungKulanz = value;
    }

    /**
     * Durch das außerplanmäßige Ereignis kann sich das Risiko für das Geldinstitut verringern
     * beziehungsweise ganz entfallen. Das eingesparte Geld muss dem Kunden erstattet werden.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getErstattungRisikoko() {
        return erstattungRisikoko;
    }

    /**
     * Sets the value of the erstattungRisikoko property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getErstattungRisikoko()
     */
    public void setErstattungRisikoko(Double value) {
        this.erstattungRisikoko = value;
    }

    /**
     * Durch das außerplanmäßige Ereignis können sich die Verwaltungskosten für das Geldinstitut
     * verringern beziehungsweise ganz entfallen. Das eingesparte Geld muss dem Kunden erstattet
     * werden.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getErstattungVerwKst() {
        return erstattungVerwKst;
    }

    /**
     * Sets the value of the erstattungVerwKst property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getErstattungVerwKst()
     */
    public void setErstattungVerwKst(Double value) {
        this.erstattungVerwKst = value;
    }

    /**
     * Soll die Erstattung auf den Bruttoschaden beschränkt werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isErstBruttoschBesch() {
        return erstBruttoschBesch;
    }

    /**
     * Sets the value of the erstBruttoschBesch property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isErstBruttoschBesch()
     */
    public void setErstBruttoschBesch(Boolean value) {
        this.erstBruttoschBesch = value;
    }

    /**
     * Kondition des APE-Folgegeschäfts
     *
     * @return possible object is
     * {@link FOLGEGESCHKOND }
     */
    public FOLGEGESCHKOND getFolgeGeschKond() {
        return folgeGeschKond;
    }

    /**
     * Sets the value of the folgeGeschKond property.
     *
     * @param value allowed object is
     *              {@link FOLGEGESCHKOND }
     * @see #getFolgeGeschKond()
     */
    public void setFolgeGeschKond(FOLGEGESCHKOND value) {
        this.folgeGeschKond = value;
    }

    /**
     * Betrag, der am außerplanmäßig getilgt wird
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getHoeheSondertilgung() {
        return hoeheSondertilgung;
    }

    /**
     * Sets the value of the hoeheSondertilgung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getHoeheSondertilgung()
     */
    public void setHoeheSondertilgung(Double value) {
        this.hoeheSondertilgung = value;
    }

    /**
     * Betrag, der nicht abgenommen wird
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getHoeheTeilnichtabna() {
        return hoeheTeilnichtabna;
    }

    /**
     * Sets the value of the hoeheTeilnichtabna property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getHoeheTeilnichtabna()
     */
    public void setHoeheTeilnichtabna(Double value) {
        this.hoeheTeilnichtabna = value;
    }

    /**
     * Wenn die Marge des Ursprungsdarlehens bekannt ist, kann der Schaden, der aufgrund des
     * außerplanmäßigen Ereignisses entsteht, in einen Margen- und in einen Kapitalmarktschaden
     * aufgeteilt werden.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKapitmktschaden() {
        return kapitmktschaden;
    }

    /**
     * Sets the value of the kapitmktschaden property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKapitmktschaden()
     */
    public void setKapitmktschaden(Double value) {
        this.kapitmktschaden = value;
    }

    /**
     * Kapitalmarktschaden aus interner Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKapitmktschadenIntern() {
        return kapitmktschadenIntern;
    }

    /**
     * Sets the value of the kapitmktschadenIntern property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKapitmktschadenIntern()
     */
    public void setKapitmktschadenIntern(Double value) {
        this.kapitmktschadenIntern = value;
    }

    /**
     * Kapitalmarktschaden des gedeckten Teils aus der internen Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKapitmktschadenInternGedeckt() {
        return kapitmktschadenInternGedeckt;
    }

    /**
     * Sets the value of the kapitmktschadenInternGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKapitmktschadenInternGedeckt()
     */
    public void setKapitmktschadenInternGedeckt(Double value) {
        this.kapitmktschadenInternGedeckt = value;
    }

    /**
     * Kapitalmarktschaden des ungedeckten Teils aus der internen Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKapitmktschadenInternUngedeckt() {
        return kapitmktschadenInternUngedeckt;
    }

    /**
     * Sets the value of the kapitmktschadenInternUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKapitmktschadenInternUngedeckt()
     */
    public void setKapitmktschadenInternUngedeckt(Double value) {
        this.kapitmktschadenInternUngedeckt = value;
    }

    /**
     * Hier können Kosten und Gebühren erfasst werden, die bei der Kalkulation des außerplanmäßigen
     * Ereignisses anfallen.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKostenUndGebuehren() {
        return kostenUndGebuehren;
    }

    /**
     * Sets the value of the kostenUndGebuehren property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKostenUndGebuehren()
     */
    public void setKostenUndGebuehren(Double value) {
        this.kostenUndGebuehren = value;
    }

    /**
     * Steuert, ob bei der Berechnung das Kündigungsrecht nach §489 Abs. 1 Nr. 2 BGB berücksichtigt
     * werden soll.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isKuendrecht10Jbeach() {
        return kuendrecht10Jbeach;
    }

    /**
     * Sets the value of the kuendrecht10Jbeach property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isKuendrecht10Jbeach()
     */
    public void setKuendrecht10Jbeach(Boolean value) {
        this.kuendrecht10Jbeach = value;
    }

    /**
     * Eventuell soll der Schaden beziehungsweise ein Teil des Schadens, der aufgrund des
     * außerplanmäßigen Ereignisses entsteht, übernommen werden (dies ist z.B. bei vorzeitigen
     * Prolongationen sinnvoll).
     * Diese Kostenübernahme wird als Erstattung aus Kulanz ausgewiesen und wird bei der Eingabe als
     * Prozentgröße angegeben, wobei diese je nach Einstellung der Systemvariablen -Schadensaufteilung
     * u. restl. Erstattungen- bei der Produktkonfiguration eine -nominale- (Einstellung auf
     * Nominalzinsreduzierung) beziehungsweise -effektive- (Einstellung auf Renditeerhöhung oder
     * Margenvorgabe) Rechengröße ist.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKulanz() {
        return kulanz;
    }

    /**
     * Sets the value of the kulanz property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKulanz()
     */
    public void setKulanz(Double value) {
        this.kulanz = value;
    }

    /**
     * Der Schaden, der aufgrund des außerplanmäßigen Ereignisses entsteht, kann in einen Margen- und
     * in einen Kapitalmarktschaden aufgeteilt werden. Hierfür wird die nominale Marge des
     * Ursprungsdarlehens benötigt. Wird kein Wert eingegeben, so wird die Schadensaufteilung nicht
     * berechnet. Dieses Feld ist ein -nominaler Wert- und nur vorhanden, wenn bei der
     * Produktkonfiguration die Systemvariable -Schadensaufteilung u. restl. Erstattungen- auf
     * -Nominalzinsreduzierung- eingestellt ist.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargeUrsprungsdarl() {
        return margeUrsprungsdarl;
    }

    /**
     * Sets the value of the margeUrsprungsdarl property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargeUrsprungsdarl()
     */
    public void setMargeUrsprungsdarl(Double value) {
        this.margeUrsprungsdarl = value;
    }

    /**
     * Wenn die Marge des Ursprungsdarlehens bekannt ist, kann der Schaden, der aufgrund des
     * außerplanmäßigen Ereignisses entsteht, in einen Margen- und in einen Kapitalmarktschaden
     * aufgeteilt werden.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargenschaden() {
        return margenschaden;
    }

    /**
     * Sets the value of the margenschaden property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargenschaden()
     */
    public void setMargenschaden(Double value) {
        this.margenschaden = value;
    }

    /**
     * Margenschaden aus interner Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargenschadenIntern() {
        return margenschadenIntern;
    }

    /**
     * Sets the value of the margenschadenIntern property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargenschadenIntern()
     */
    public void setMargenschadenIntern(Double value) {
        this.margenschadenIntern = value;
    }

    /**
     * Margenschaden des gedeckten Teils aus der internen Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargenschadenInternGedeckt() {
        return margenschadenInternGedeckt;
    }

    /**
     * Sets the value of the margenschadenInternGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargenschadenInternGedeckt()
     */
    public void setMargenschadenInternGedeckt(Double value) {
        this.margenschadenInternGedeckt = value;
    }

    /**
     * Margenschaden des ungedeckten Teils aus der internen Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargenschadenInternUngedeckt() {
        return margenschadenInternUngedeckt;
    }

    /**
     * Sets the value of the margenschadenInternUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargenschadenInternUngedeckt()
     */
    public void setMargenschadenInternUngedeckt(Double value) {
        this.margenschadenInternUngedeckt = value;
    }

    /**
     * Die Höhe der Netto-Entschädigung, die wegen des außerplanmäßigen Ereignisses gezahlt werden
     * muss. Ergibt sich aus der Brutto-Entschädigung abzüglich der Erstattungsbeträge für Risiko,
     * Verwaltung und Kulanz und zuzüglich des Berechnungsaufwands.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNettoschaden() {
        return nettoschaden;
    }

    /**
     * Sets the value of the nettoschaden property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNettoschaden()
     */
    public void setNettoschaden(Double value) {
        this.nettoschaden = value;
    }

    /**
     * Verrechneter Nettoschaden aus interner Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNettoschadenIntern() {
        return nettoschadenIntern;
    }

    /**
     * Sets the value of the nettoschadenIntern property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNettoschadenIntern()
     */
    public void setNettoschadenIntern(Double value) {
        this.nettoschadenIntern = value;
    }

    /**
     * Die Vorfälligkeitsentschädigung netto auf 0 gekappt, sofern die Vorfälligkeitsentschädigung
     * netto kleiner 0 ist, und der Kundennutzen nicht erstattet werden soll.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNettoschadenGekappt() {
        return nettoschadenGekappt;
    }

    /**
     * Sets the value of the nettoschadenGekappt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNettoschadenGekappt()
     */
    public void setNettoschadenGekappt(Double value) {
        this.nettoschadenGekappt = value;
    }

    /**
     * Ausstehende Rate am APE-Datum: Wenn die Leistungsstörung an einem Ratentermin stattfindet, so
     * ist eine Rate fällig.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRateAmApeDatum() {
        return rateAmApeDatum;
    }

    /**
     * Sets the value of the rateAmApeDatum property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRateAmApeDatum()
     */
    public void setRateAmApeDatum(Double value) {
        this.rateAmApeDatum = value;
    }

    /**
     * Wenn am Datum des zu zahlenden Betrags eine Rate oder/und Zinszahlung fällig ist, so kann diese
     * in den zu zahlenden Betrag mit eingerechnet werden.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRateAmApeDatumAusw() {
        return rateAmApeDatumAusw;
    }

    /**
     * Sets the value of the rateAmApeDatumAusw property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isRateAmApeDatumAusw()
     */
    public void setRateAmApeDatumAusw(Boolean value) {
        this.rateAmApeDatumAusw = value;
    }

    /**
     * Angepasste Ratenhöhe nach dem außerplanmäßigen Ereignis (Sondertilgung)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRateSondertilgung() {
        return rateSondertilgung;
    }

    /**
     * Sets the value of the rateSondertilgung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRateSondertilgung()
     */
    public void setRateSondertilgung(Double value) {
        this.rateSondertilgung = value;
    }

    /**
     * Angepasste Ratenhöhe nach dem außerplanmäßigen Ereignis (Teilnichtabnahme)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRateTeilnichtabnah() {
        return rateTeilnichtabnah;
    }

    /**
     * Sets the value of the rateTeilnichtabnah property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRateTeilnichtabnah()
     */
    public void setRateTeilnichtabnah(Double value) {
        this.rateTeilnichtabnah = value;
    }

    /**
     * Durch das außerplanmäßige Ereignis kann sich das Risiko für das Geldinstitut verringern
     * beziehungsweise ganz entfallen. Das eingesparte Geld muss dem Kunden erstattet werden.
     * Die Risikokosten sind als Prozentgröße anzugeben wobei dieser Wert je nach Einstellung der
     * Systemvariablen -Erstattung der Risikokosten- bei der Produktkonfiguration eine -nominale-
     * (Einstellung auf Nominalzinsreduzierung) beziehungsweise -effektive- (Einstellung auf
     * Renditeerhöhung oder Margenvorgabe) Rechengröße ist.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRisikokosten() {
        return risikokosten;
    }

    /**
     * Sets the value of the risikokosten property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRisikokosten()
     */
    public void setRisikokosten(Double value) {
        this.risikokosten = value;
    }

    /**
     * Art der Berechnung der Erstattung der Risikokosten (nominal, effektiv)
     *
     * @return possible object is
     * {@link KOSTENERSTATTART }
     */
    public KOSTENERSTATTART getRisKostErstArt() {
        return risKostErstArt;
    }

    /**
     * Sets the value of the risKostErstArt property.
     *
     * @param value allowed object is
     *              {@link KOSTENERSTATTART }
     * @see #getRisKostErstArt()
     */
    public void setRisKostErstArt(KOSTENERSTATTART value) {
        this.risKostErstArt = value;
    }

    /**
     * Datenbank-ID vom Teilmarkt der Zinsstruktur, welche zur Kalkulation
     * des außerplanmäßigen Ereignisses verwendet wird
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTeilmarktID() {
        return teilmarktID;
    }

    /**
     * Sets the value of the teilmarktID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getTeilmarktID()
     */
    public void setTeilmarktID(Integer value) {
        this.teilmarktID = value;
    }

    /**
     * Name des Teilmarkts der Zinsstruktur, welche zur Kalkulation
     * des außerplanmäßigen Ereignisses verwendet wird
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
     * Teilmarkt-Name der Zinsstruktur, welche zur internen Schadensberrechnung des außerplanmäßigen
     * Ereignisses verwendet wird
     *
     * @return possible object is
     * {@link String }
     */
    public String getTeilmarktIntern() {
        return teilmarktIntern;
    }

    /**
     * Sets the value of the teilmarktIntern property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTeilmarktIntern()
     */
    public void setTeilmarktIntern(String value) {
        this.teilmarktIntern = value;
    }

    /**
     * Teilmarkt-Name der Zinsstruktur, welche zur internen Schadensberrechnung des ungedeckten Teils des außerplanmäßigen
     * Ereignisses verwendet wird
     *
     * @return possible object is
     * {@link String }
     */
    public String getTeilmarktInternUngedeckt() {
        return teilmarktInternUngedeckt;
    }

    /**
     * Sets the value of the teilmarktInternUngedeckt property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTeilmarktInternUngedeckt()
     */
    public void setTeilmarktInternUngedeckt(String value) {
        this.teilmarktInternUngedeckt = value;
    }

    /**
     * Rhythmus der laufenden Verwaltungskosten: -einmalig; -jährlich; -halbjährlich; -viermonatlich;
     * -vierteljährlich; -zweimonatlich; -monatlich
     *
     * @return possible object is
     * {@link Rhythmus }
     */
    public Rhythmus getVerwaltKstRhyt() {
        return verwaltKstRhyt;
    }

    /**
     * Sets the value of the verwaltKstRhyt property.
     *
     * @param value allowed object is
     *              {@link Rhythmus }
     * @see #getVerwaltKstRhyt()
     */
    public void setVerwaltKstRhyt(Rhythmus value) {
        this.verwaltKstRhyt = value;
    }

    /**
     * Sollen die Verwaltungskosten abgezinst werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVerwaltkostAbzins() {
        return verwaltkostAbzins;
    }

    /**
     * Sets the value of the verwaltkostAbzins property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isVerwaltkostAbzins()
     */
    public void setVerwaltkostAbzins(Boolean value) {
        this.verwaltkostAbzins = value;
    }

    /**
     * Höhe der eingesparten Verwaltungskosten am Ende. Das eingesparte Geld muss dem Kunden erstattet
     * werden.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVerwaltkostenEnde() {
        return verwaltkostenEnde;
    }

    /**
     * Sets the value of the verwaltkostenEnde property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVerwaltkostenEnde()
     */
    public void setVerwaltkostenEnde(Double value) {
        this.verwaltkostenEnde = value;
    }

    /**
     * Höhe der eingesparten laufenden Verwaltungskosten.
     * Durch das außerplanmäßige Ereignis können sich laufende Verwaltungskosten für das Geldinstitut
     * verringern beziehungsweise ganz entfallen. Das eingesparte Geld muss dem Kunden erstattet
     * werden.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVerwaltkostenlfd() {
        return verwaltkostenlfd;
    }

    /**
     * Sets the value of the verwaltkostenlfd property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVerwaltkostenlfd()
     */
    public void setVerwaltkostenlfd(Double value) {
        this.verwaltkostenlfd = value;
    }

    /**
     * Über diesen Schalter wird gesteuert, ob die in §502 BGB geregelte Deckelung der VFE auf 0,5%
     * bzw. 1% des vorzeitig zurückgezahlten Kapitals auf Basis des Kreditsaldos zum Zeitpunkt der
     * vorzeitigen Rückzahlung des Kredits abzüglich eingestellter optionaler Sondertilgungsrechte bis
     * zu diesem Zeitpunkt berechnet werden soll oder auf Basis des Kreditsaldos inklusive der bis zum
     * Zeitpunkt der vorzeitigen Rückzahlung aufgelaufenen Zinsen.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVfeDeckelungAufBasisKreditsaldo() {
        return vfeDeckelungAufBasisKreditsaldo;
    }

    /**
     * Sets the value of the vfeDeckelungAufBasisKreditsaldo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isVfeDeckelungAufBasisKreditsaldo()
     */
    public void setVfeDeckelungAufBasisKreditsaldo(Boolean value) {
        this.vfeDeckelungAufBasisKreditsaldo = value;
    }

    /**
     * Über diesen Schalter wird gesteuert, ob die Berechnung der VFE nur mit den vorteilhaften
     * Sondertilgungsrechten, oder mit allen erfolgen soll.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isOptimierteSondertilgungsrechte() {
        return optimierteSondertilgungsrechte;
    }

    /**
     * Sets the value of the optimierteSondertilgungsrechte property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isOptimierteSondertilgungsrechte()
     */
    public void setOptimierteSondertilgungsrechte(Boolean value) {
        this.optimierteSondertilgungsrechte = value;
    }

    /**
     * Über diesen Schalter wird gesteuert, ob Tilgungswechsel-Rechte nur dann in die
     * Vorfälligkeitsentschädigung eingehen, wenn es sich für den Kunden lohnt die Tilgung zu ändern.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isOptimierteTilgungswechselrechte() {
        return optimierteTilgungswechselrechte;
    }

    /**
     * Sets the value of the optimierteTilgungswechselrechte property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isOptimierteTilgungswechselrechte()
     */
    public void setOptimierteTilgungswechselrechte(Boolean value) {
        this.optimierteTilgungswechselrechte = value;
    }

    /**
     * Höhe des Betrages, der aufgrund des außerplanmäßigen Ereignisses verfrüht fällig wird
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVorfaelligerBetrag() {
        return vorfaelligerBetrag;
    }

    /**
     * Sets the value of the vorfaelligerBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVorfaelligerBetrag()
     */
    public void setVorfaelligerBetrag(Double value) {
        this.vorfaelligerBetrag = value;
    }

    /**
     * Damit wird festgestellt, ob der gespeicherte Wert für vorfälligen Betrag berechnet oder
     * vorgegeben ist.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVorfaelligerBIsUserVor() {
        return vorfaelligerBIsUserVor;
    }

    /**
     * Sets the value of the vorfaelligerBIsUserVor property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isVorfaelligerBIsUserVor()
     */
    public void setVorfaelligerBIsUserVor(Boolean value) {
        this.vorfaelligerBIsUserVor = value;
    }

    /**
     * Wenn die Leistungsstörung an einem Zinstermin stattfindet, so ist eine Zinszahlung fällig.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinsAmApeDatum() {
        return zinsAmApeDatum;
    }

    /**
     * Sets the value of the zinsAmApeDatum property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinsAmApeDatum()
     */
    public void setZinsAmApeDatum(Double value) {
        this.zinsAmApeDatum = value;
    }

    /**
     * Datenbank-ID der Zinsstruktur, welche zur Kalkulation
     * des außerplanmäßigen Ereignisses verwendet wird
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getZinsstrukturID() {
        return zinsstrukturID;
    }

    /**
     * Sets the value of the zinsstrukturID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getZinsstrukturID()
     */
    public void setZinsstrukturID(Integer value) {
        this.zinsstrukturID = value;
    }

    /**
     * Kommentar der Zinsstruktur, welche zur Kalkulation
     * des außerplanmäßigen Ereignisses verwendet wird
     *
     * @return possible object is
     * {@link String }
     */
    public String getZinsstrukturKommentar() {
        return zinsstrukturKommentar;
    }

    /**
     * Sets the value of the zinsstrukturKommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getZinsstrukturKommentar()
     */
    public void setZinsstrukturKommentar(String value) {
        this.zinsstrukturKommentar = value;
    }

    /**
     * Kalkulationsdatum und Uhrzeit der Zinskurve bei Geschäftsänderung
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getKalkulationsdatumZinsstruktur() {
        return kalkulationsdatumZinsstruktur;
    }

    /**
     * Sets the value of the kalkulationsdatumZinsstruktur property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getKalkulationsdatumZinsstruktur()
     */
    public void setKalkulationsdatumZinsstruktur(XMLGregorianCalendar value) {
        this.kalkulationsdatumZinsstruktur = value;
    }

    /**
     * Kommentar der Zinsstruktur, welche zur internen Schadensberrechnung des außerplanmäßigen
     * Ereignisses verwendet wird
     *
     * @return possible object is
     * {@link String }
     */
    public String getZinsstrukturInternKommentar() {
        return zinsstrukturInternKommentar;
    }

    /**
     * Sets the value of the zinsstrukturInternKommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getZinsstrukturInternKommentar()
     */
    public void setZinsstrukturInternKommentar(String value) {
        this.zinsstrukturInternKommentar = value;
    }

    /**
     * Kommentar der Zinsstruktur, welche zur internen Schadensberrechnung des ungedeckten Teils des außerplanmäßigen
     * Ereignisses verwendet wird
     *
     * @return possible object is
     * {@link String }
     */
    public String getZinsstrukturInternUngedecktKommentar() {
        return zinsstrukturInternUngedecktKommentar;
    }

    /**
     * Sets the value of the zinsstrukturInternUngedecktKommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getZinsstrukturInternUngedecktKommentar()
     */
    public void setZinsstrukturInternUngedecktKommentar(String value) {
        this.zinsstrukturInternUngedecktKommentar = value;
    }

    /**
     * Kalkulationsdatum und Uhrzeit der Zinsstruktur, welche zur internen Schadensberrechnung des
     * außerplanmäßigen Ereignisses verwendet wird
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getZinsstrukturInternKalkulationsdatum() {
        return zinsstrukturInternKalkulationsdatum;
    }

    /**
     * Sets the value of the zinsstrukturInternKalkulationsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getZinsstrukturInternKalkulationsdatum()
     */
    public void setZinsstrukturInternKalkulationsdatum(XMLGregorianCalendar value) {
        this.zinsstrukturInternKalkulationsdatum = value;
    }

    /**
     * Kalkulationsdatum und Uhrzeit der Zinsstruktur, welche zur internen Schadensberrechnung des ungedeckten Teils des
     * außerplanmäßigen Ereignisses verwendet wird
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getZinsstrukturInternUngedecktKalkulationsdatum() {
        return zinsstrukturInternUngedecktKalkulationsdatum;
    }

    /**
     * Sets the value of the zinsstrukturInternUngedecktKalkulationsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getZinsstrukturInternUngedecktKalkulationsdatum()
     */
    public void setZinsstrukturInternUngedecktKalkulationsdatum(XMLGregorianCalendar value) {
        this.zinsstrukturInternUngedecktKalkulationsdatum = value;
    }

    /**
     * Der vom Kunden zu zahlenden Betrag aufgrund des außerplanmäßigen Ereignisses
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZuZahlenderBetrag() {
        return zuZahlenderBetrag;
    }

    /**
     * Sets the value of the zuZahlenderBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZuZahlenderBetrag()
     */
    public void setZuZahlenderBetrag(Double value) {
        this.zuZahlenderBetrag = value;
    }

    /**
     * Zu zahlender Betrag aus interner Schadensberechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZuZahlenderBetragIntern() {
        return zuZahlenderBetragIntern;
    }

    /**
     * Sets the value of the zuZahlenderBetragIntern property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZuZahlenderBetragIntern()
     */
    public void setZuZahlenderBetragIntern(Double value) {
        this.zuZahlenderBetragIntern = value;
    }

    /**
     * Soll ein eventuell durch die Geschäftsänderung entstehender Kundennutzen erstattet werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isKundennutzenErst() {
        return kundennutzenErst;
    }

    /**
     * Sets the value of the kundennutzenErst property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isKundennutzenErst()
     */
    public void setKundennutzenErst(Boolean value) {
        this.kundennutzenErst = value;
    }

    /**
     * Höhe der Margenerstattung aus dem Neugeschäft bei gleichzeitigem Abschluss eines Neugeschäfts
     * mit der Ablösung/Nichtabnahme des Altgeschäfts
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargenErstNeug() {
        return margenErstNeug;
    }

    /**
     * Sets the value of the margenErstNeug property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargenErstNeug()
     */
    public void setMargenErstNeug(Double value) {
        this.margenErstNeug = value;
    }

    /**
     * Soll dem Kunden eine Margenerstattung aus dem Alt- und/oder Neugeschäft gewährt werden?
     * Diese Auswahl ist nur bei den Geschäftsänderungsarten -Ablösung- und -Nichtabnahme- vorhanden.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMargenErstBerechn() {
        return margenErstBerechn;
    }

    /**
     * Sets the value of the margenErstBerechn property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMargenErstBerechn()
     */
    public void setMargenErstBerechn(Boolean value) {
        this.margenErstBerechn = value;
    }

    /**
     * Soll bei Vorhandensein eines Neugeschäfts die Margenerstattung aus dem Neugeschäft mit
     * vertauschten Geld-/Briefsätzen berechnet werden?
     * Diese Auswahl ist nur bei den Geschäftsänderungsarten -Ablösung- und -Nichtabnahme- vorhanden.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMargenErstGBVert() {
        return margenErstGBVert;
    }

    /**
     * Sets the value of the margenErstGBVert property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMargenErstGBVert()
     */
    public void setMargenErstGBVert(Boolean value) {
        this.margenErstGBVert = value;
    }

    /**
     * Soll auch bei Vorhandensein eines Neugeschäfts nur die Margenerstattung aus dem Altgeschäft
     * berücksichtigt werden?
     * Diese Einstellung ist nur bei den Geschäftsänderungsarten -Ablösung- und -Nichtabnahme-
     * vorhanden.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMargenErstNurAltg() {
        return margenErstNurAltg;
    }

    /**
     * Sets the value of the margenErstNurAltg property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMargenErstNurAltg()
     */
    public void setMargenErstNurAltg(Boolean value) {
        this.margenErstNurAltg = value;
    }

    /**
     * Herkunft bzw. Erfassungsart des Altdarlehens, das Basis für eine Geschäftsänderung ist (Bestand
     * MARZIPAN / Bestand nicht MARZIPAN / nach Kontostand)
     * BESTAND_MARZIPAN; BESTAND_NICHT_MARZIPAN; NACH_KONTOSTAND
     *
     * @return possible object is
     * {@link ApeDarlehensHerkunft }
     */
    public ApeDarlehensHerkunft getApeDarlehensHerkunft() {
        return apeDarlehensHerkunft;
    }

    /**
     * Sets the value of the apeDarlehensHerkunft property.
     *
     * @param value allowed object is
     *              {@link ApeDarlehensHerkunft }
     * @see #getApeDarlehensHerkunft()
     */
    public void setApeDarlehensHerkunft(ApeDarlehensHerkunft value) {
        this.apeDarlehensHerkunft = value;
    }

    /**
     * Nominalbetrag des Ursprungsdarlehens (wird für APE nach Kontostand benötigt).
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNominalbetragUrsprung() {
        return nominalbetragUrsprung;
    }

    /**
     * Sets the value of the nominalbetragUrsprung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNominalbetragUrsprung()
     */
    public void setNominalbetragUrsprung(Double value) {
        this.nominalbetragUrsprung = value;
    }

    /**
     * Vertragsbeginn des Ursprungsdarlehens: Auszahlungsdatum auf der Grunddatenseite des
     * Ursprungsdarlehens (wird für APE nach Kontostand benötigt).
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getVertragsbeginnUrsprung() {
        return vertragsbeginnUrsprung;
    }

    /**
     * Sets the value of the vertragsbeginnUrsprung property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getVertragsbeginnUrsprung()
     */
    public void setVertragsbeginnUrsprung(XMLGregorianCalendar value) {
        this.vertragsbeginnUrsprung = value;
    }

    /**
     * Über die Option -Interesse- kann eingestellt werden, ob die Geschäftsänderung aus berechtigtem
     * oder nicht berechtigtem Interesse erfolgt. Bei berechtigtem Interesse wird eine
     * Vorfälligkeitsentschädigung berechnet, bei nicht berechtigtem Interesse ein
     * Vorfälligkeitsentgelt.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBerechtigtesInteresse() {
        return berechtigtesInteresse;
    }

    /**
     * Sets the value of the berechtigtesInteresse property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isBerechtigtesInteresse()
     */
    public void setBerechtigtesInteresse(Boolean value) {
        this.berechtigtesInteresse = value;
    }

    /**
     * Prozentualer Aufschlag auf den Bruttoschaden, zur Berechnung des Vorfälligkeitsentgeltes (nur
     * bei nicht berechtigtem Interesse).
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSchadensaufschlagProzent() {
        return schadensaufschlagProzent;
    }

    /**
     * Sets the value of the schadensaufschlagProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSchadensaufschlagProzent()
     */
    public void setSchadensaufschlagProzent(Double value) {
        this.schadensaufschlagProzent = value;
    }

    /**
     * Schadensaufschlag, der sich aus dem unter -Aufschlag auf den entstandenen Schaden- vorgegebenen
     * Prozentwert ergibt.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSchadensaufschlagBetrag() {
        return schadensaufschlagBetrag;
    }

    /**
     * Sets the value of the schadensaufschlagBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSchadensaufschlagBetrag()
     */
    public void setSchadensaufschlagBetrag(Double value) {
        this.schadensaufschlagBetrag = value;
    }

    /**
     * Zinssumme des ausfallenden Zahlungsstroms.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAusgefalleneZinsen() {
        return ausgefalleneZinsen;
    }

    /**
     * Sets the value of the ausgefalleneZinsen property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAusgefalleneZinsen()
     */
    public void setAusgefalleneZinsen(Double value) {
        this.ausgefalleneZinsen = value;
    }

    /**
     * Wird angezeigt, wenn das Kalkulationsdatum nach dem 10.06.2010 liegt, also ab Inkrafttreten der
     * Verbraucherkreditrichtlinie und das Darlehen nicht grundpfandrechtlich besichert ist. Ist die
     * ursprüngliche Restlaufzeit des Darlehens größer als ein Jahr, wird auf 1% des vorfälligen
     * Betrages gedeckelt, andernfalls auf 0,5%.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBegrenzterNettoschaden() {
        return begrenzterNettoschaden;
    }

    /**
     * Sets the value of the begrenzterNettoschaden property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBegrenzterNettoschaden()
     */
    public void setBegrenzterNettoschaden(Double value) {
        this.begrenzterNettoschaden = value;
    }

    /**
     * Die Option -Begrenzung der VFE gemäß §502 BGB- steht für Berechnungen zur Verfügung bei denen
     * das Kalkulationsdatum nach dem 10.06.2010 liegt. Für nicht grundpfandrechtlich besicherte
     * Darlehen wird die Netto- Vorfälligkeitsentschädigung gemäß den Regelungen der ab dem 11.06.2010
     * zu berücksichtigenden EU-Verbraucherkreditrichtlinie betragsmäßig begrenzt.
     * Die Begrenzung kann wahlweise auf Basis des Kreditsaldos zum Zeitpunkt der vorzeitigen
     * Rückzahlung des Kredits berechnet werden oder auf Basis des Kreditsaldos inklusive der bis zum
     * Zeitpunkt der vorzeitigen Rückzahlung aufgelaufenen Zinsen. Diese Auswahl kann in den
     * Voreinstellungen vorgenommen werden.
     * Gemäß § 502 BGB darf die Netto-Vorfälligkeitsentschädigung nicht größer sein als 0,5% bzw. 1%
     * des vorfälligen Betrages bzw. des Kreditsaldos.
     * Dabei wird gemäß § 502 BGB die Grenze 0,5% herangezogen, wenn die Restlaufzeit des Kredits
     * kleiner oder gleich 1 Jahr ist, anderenfalls wird die Grenze 1% angewendet.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVfeBegrenzung() {
        return vfeBegrenzung;
    }

    /**
     * Sets the value of the vfeBegrenzung property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isVfeBegrenzung()
     */
    public void setVfeBegrenzung(Boolean value) {
        this.vfeBegrenzung = value;
    }

    /**
     * Laufzeit vom APE-Datum bis zum Zinsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLaufzeitBisZBE() {
        return laufzeitBisZBE;
    }

    /**
     * Sets the value of the laufzeitBisZBE property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLaufzeitBisZBE()
     */
    public void setLaufzeitBisZBE(Double value) {
        this.laufzeitBisZBE = value;
    }

    /**
     * Falls beim ausserplanmäßigen Ereignis die Disagioerstattung beruecksichtigt werden soll,
     * werden zusaetzliche Eingaben gebraucht.
     *
     * @return possible object is
     * {@link ApeDisagioerst }
     */
    public ApeDisagioerst getApeDisagioerst() {
        return apeDisagioerst;
    }

    /**
     * Sets the value of the apeDisagioerst property.
     *
     * @param value allowed object is
     *              {@link ApeDisagioerst }
     * @see #getApeDisagioerst()
     */
    public void setApeDisagioerst(ApeDisagioerst value) {
        this.apeDisagioerst = value;
    }

    /**
     * Optionale Sondertilgungsrechte, die dem Kunden zugesagt sind.
     *
     * @return possible object is
     * {@link ApeSondertilgungen }
     */
    public ApeSondertilgungen getApeSondertilgungen() {
        return apeSondertilgungen;
    }

    /**
     * Sets the value of the apeSondertilgungen property.
     *
     * @param value allowed object is
     *              {@link ApeSondertilgungen }
     * @see #getApeSondertilgungen()
     */
    public void setApeSondertilgungen(ApeSondertilgungen value) {
        this.apeSondertilgungen = value;
    }

    /**
     * Tilgungssatzwechselrechte od. Ratenwechselrechte: Wechsel erstmal ab
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTilgungswechselErstAb() {
        return tilgungswechselErstAb;
    }

    /**
     * Sets the value of the tilgungswechselErstAb property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getTilgungswechselErstAb()
     */
    public void setTilgungswechselErstAb(XMLGregorianCalendar value) {
        this.tilgungswechselErstAb = value;
    }

    /**
     * Tilgungssatzwechselrechte od. Ratenwechselrechte: Anzahl der erlaubten Wechsel
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTilgungswechselErlaubtAnzahl() {
        return tilgungswechselErlaubtAnzahl;
    }

    /**
     * Sets the value of the tilgungswechselErlaubtAnzahl property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getTilgungswechselErlaubtAnzahl()
     */
    public void setTilgungswechselErlaubtAnzahl(Integer value) {
        this.tilgungswechselErlaubtAnzahl = value;
    }

    /**
     * Tilgungssatzwechselrechte: minimaler Tilgungssatz
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTilgungswechselMinTilgungssatz() {
        return tilgungswechselMinTilgungssatz;
    }

    /**
     * Sets the value of the tilgungswechselMinTilgungssatz property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getTilgungswechselMinTilgungssatz()
     */
    public void setTilgungswechselMinTilgungssatz(Double value) {
        this.tilgungswechselMinTilgungssatz = value;
    }

    /**
     * Tilgungssatzwechselrechte: maximaler Tilgungssatz
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTilgungswechselMaxTilgungssatz() {
        return tilgungswechselMaxTilgungssatz;
    }

    /**
     * Sets the value of the tilgungswechselMaxTilgungssatz property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getTilgungswechselMaxTilgungssatz()
     */
    public void setTilgungswechselMaxTilgungssatz(Double value) {
        this.tilgungswechselMaxTilgungssatz = value;
    }

    /**
     * Ratenwechselrechte: minimale Tilgungsrate
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTilgungswechselMinTilgungsrate() {
        return tilgungswechselMinTilgungsrate;
    }

    /**
     * Sets the value of the tilgungswechselMinTilgungsrate property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getTilgungswechselMinTilgungsrate()
     */
    public void setTilgungswechselMinTilgungsrate(Double value) {
        this.tilgungswechselMinTilgungsrate = value;
    }

    /**
     * Ratenwechselrechte: maximale Tilgungsrate
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTilgungswechselMaxTilgungsrate() {
        return tilgungswechselMaxTilgungsrate;
    }

    /**
     * Sets the value of the tilgungswechselMaxTilgungsrate property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getTilgungswechselMaxTilgungsrate()
     */
    public void setTilgungswechselMaxTilgungsrate(Double value) {
        this.tilgungswechselMaxTilgungsrate = value;
    }

}
