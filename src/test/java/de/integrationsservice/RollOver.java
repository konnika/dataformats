
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Der globale komplexe Typ enthält spezielle Daten für Roll-Over-Darlehen
 *
 * <p>Java class for RollOver complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RollOver">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="tilgungsart" type="{http://www.gillardon.de/marzipan/integrationsservice}Tilgungsart" minOccurs="0"/>
 *         <element name="referenzzinslaufzeitVerwenden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="referenzzinsID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="referenzzinsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="referenzzinsLaufzeit" type="{http://www.gillardon.de/marzipan/integrationsservice}ReferenzzinsLaufzeit" minOccurs="0"/>
 *         <element name="referenzzinsMethode" type="{http://www.gillardon.de/marzipan/integrationsservice}ReferenzzinsMethode" minOccurs="0"/>
 *         <element name="margeAusDisagio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="marginIstFix" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="naechstesFixingDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="fixingtage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="fixingterminZeilenNr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="fixingArt" type="{http://www.gillardon.de/marzipan/integrationsservice}FixingArt" minOccurs="0"/>
 *         <element name="referenzzinsHoehe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="referenzzinsHoeheEinstand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="referenzzinsDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="referenzzinssatzManuellAusgewaehlt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="interpolierterZinsHoehe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinsbindungsbeginn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="restkapital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="restschuldMitZinsLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="restschuldOhneZinsLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="anzahlZinsenLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="anzahlZinsenZinsbindung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="disagioRueckErstattungLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="gebuehrenRueckErstattungLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="disagioRueckErstattungZinsaenderung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="gebuehrenRueckErstattungZinsaenderung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeZinsenLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeTilgungenLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="auszahlungsdatumUnverschoben" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="zinsbindungsendeUnverschoben" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="annuNominalzins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="annuRestschuld" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="annuAnnuitaetenHoehe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="annuRatenPA" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *         <element name="annuFinanzplatz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="annuVerschiebung" type="{http://www.gillardon.de/marzipan/integrationsservice}Verschieberegel" minOccurs="0"/>
 *         <element name="usanceAnnuitaeten" type="{http://www.gillardon.de/marzipan/integrationsservice}Usance" minOccurs="0"/>
 *         <element name="annuMethode" type="{http://www.gillardon.de/marzipan/integrationsservice}AnnuMethode" minOccurs="0"/>
 *         <element name="tilgungsvereinbarung" type="{http://www.gillardon.de/marzipan/integrationsservice}Tilgungsvereinbarung" minOccurs="0"/>
 *         <element name="annuTilgungen" type="{http://www.gillardon.de/marzipan/integrationsservice}AnnuTilgungen" minOccurs="0"/>
 *         <element name="sonderzahlungen" type="{http://www.gillardon.de/marzipan/integrationsservice}Sonderzahlungen" minOccurs="0"/>
 *         <element name="zinsanpassungstermine" type="{http://www.gillardon.de/marzipan/integrationsservice}Zinsanpassungstermine" minOccurs="0"/>
 *         <element name="rollOverOvernightVariante" type="{http://www.gillardon.de/marzipan/integrationsservice}RollOverOvernightVariante" minOccurs="0"/>
 *         <element name="rollOverOffsetTage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="overnightReferenzzinsen" type="{http://www.gillardon.de/marzipan/integrationsservice}OvernightReferenzzinsen" minOccurs="0"/>
 *         <element name="stueckzinstyp" type="{http://www.gillardon.de/marzipan/integrationsservice}Stueckzinsmethode" minOccurs="0"/>
 *         <element name="zinslaufAb" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="stueckzins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="stuecktage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="nomzinsFuerStueckzins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RollOver", propOrder = {

})
public class RollOver {

    /**
     * Über die Art der Kontoführung wird bestimmt, ob eine Ratentilgung mit gleichbleibend hohen
     * Tilgungsraten berücksichtigt werden soll, oder ob ein annuitätischer Tilgungsverlauf berechnet
     * werden soll.
     */
    @XmlSchemaType(name = "string")
    protected Tilgungsart tilgungsart;
    /**
     * SEinstellung für Roll-Over-Darlehen, die nur wirkt, wenn auch in der Checkbox Referenzzins an
     * Zinsusance anpassen ein Haken gesetzt ist.
     * aktiviert:Anpassung des Referenzzinses wird auf die Laufzeit des Referenzzinses bezogen
     * deaktiviert: (Default) Anpassung des Referenzzinses wird auf die erste Zinsperiode bezogen
     */
    protected Boolean referenzzinslaufzeitVerwenden;
    /**
     * Datenbank ID des verwendeten Referenzzinses
     */
    protected Integer referenzzinsID;
    /**
     * Name des verwendeten Referenzzinses
     */
    protected String referenzzinsName;
    /**
     * Laufzeit des verwendeten Referenzzinses. Die Laufzeit des Referenzzins bestimt den Rythmus der
     * Zinsanpassung von Rollover Geschäften.
     * siehe Struktur ReferenzzinsLaufzeit
     */
    @XmlSchemaType(name = "string")
    protected ReferenzzinsLaufzeit referenzzinsLaufzeit;
    /**
     * Mit der Methode kann vorgegeben werden, welcher Referenzzinssatz verwendet werden soll.
     * Es gibt folgende Möglichkeiten:
     * lt. Referenzzinstyp - Es wird der aktuell gültige Referenzzinssatz passend zum gewählten
     * Referenzzins verwendet.
     * interpolieren - Mit Hilfe der risikolosen Zinsstruktur wird für die Laufzeit ein
     * Referenzzinssatz interpoliert.
     * manuell - Der Nominalzins wird direkt eingegeben und nicht automatisch aktualisiert. Beim Fixing
     * wird die Einstellung auf lt. Referenzzinstyp zurückgesetzt.
     * Im Fixing gibt es nur die Einstellungen lt. Referenzzinstyp und manuell, weil eine gebrochene
     * erste Zinsbindungsperiode dann nicht mehr möglich ist.
     */
    @XmlSchemaType(name = "string")
    protected ReferenzzinsMethode referenzzinsMethode;
    /**
     * Marge aus einem möglicherweise vereinbarten Disagio
     */
    protected Double margeAusDisagio;
    /**
     * Kennzeichen für fixen Aufschlag
     */
    protected Boolean marginIstFix;
    /**
     * Datum, an dem das nächste Fixing fällig ist. Datum, an dem der Nominalzins bis zur darauf
     * folgenden Zinsbindung vereinbart wird. Der Fixingtermin liegt üblicherweise zwei Banktage vor
     * dem Zinsbindungsende. Die Fixingtage werden bei der Kontoführung eingestellt.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar naechstesFixingDatum;
    /**
     * Die Anzahl der Fixingtage vor dem Zinsbindungsende wird der Nominalzins für die nächste
     * Zinsbindungsdauer gefixt. Dieser Wert wird über den ausgewählten Referenzzins bestimmt
     */
    protected Integer fixingtage;
    /**
     * Zeilennummer des nächsten Fixingtermins
     */
    protected Integer fixingterminZeilenNr;
    /**
     * Der Dropdown-Liste steuert, ob der Nominalzins für die erste Zinsperiode fest vereinbart ist
     * (sofort fixieren), oder ob er lediglich für eine erste Prognose herangezogen wird (später
     * fixieren). In diesem Fall muss vor der Auszahlung noch ein Fixing stattfinden.
     */
    @XmlSchemaType(name = "string")
    protected FixingArt fixingArt;
    /**
     * Referenzzinssatz zum eingestellten Referenzzinstyp
     */
    protected Double referenzzinsHoehe;
    /**
     * Referenzzinssatz aus GilKonfigPS
     */
    protected Double referenzzinsHoeheEinstand;
    /**
     * Datum, an welchem der Referenzzins den ausgewiesenen Referenzzinssatz hatte.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referenzzinsDatum;
    /**
     * Kennzeichen, ob der Referenzzinssatz manuell ausgewählt wurde.
     * Das Element ist ein reines Ausgabefeld. Beim Import wird dieses Element ignoriert
     * und bei anschliessenden Berechnungen automatisch der neueste Referenzzinssatz verwendet.
     */
    protected Boolean referenzzinssatzManuellAusgewaehlt;
    /**
     * Aus der aktuellen risikolosen Zinsstruktur wird der Zinssatz für den Zeitraum bis zum
     * Zinsperiodenende errechnet (Interpolation).
     */
    protected Double interpolierterZinsHoehe;
    /**
     * Beginn der aktuellen Zinsperiode
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zinsbindungsbeginn;
    /**
     * Restkapital zu Beginn der aktuellen Zinsperiode
     * Feld soll entfallen!
     */
    protected Double restkapital;
    /**
     * Restschuld zum Ablauf der Liquiditätsbindung; der Betrag enthält gegebenenfalls noch nicht
     * verrechnete Zinsanteile.
     */
    protected Double restschuldMitZinsLiqui;
    /**
     * Restschuld zum Ablauf der Liquiditätsbindung
     */
    protected Double restschuldOhneZinsLiqui;
    /**
     * Anzahl der Zinszahlungen bis Liquiditätsbindungsende
     */
    protected Double anzahlZinsenLiqui;
    /**
     * Anzahl der Zinszahlungen bis Zinsbindungsende
     */
    protected Double anzahlZinsenZinsbindung;
    /**
     * Rückerstattung des Disagio aus Liquiditätssicht
     */
    protected Double disagioRueckErstattungLiqui;
    /**
     * Gebührenrückerstattung zum Ablauf der Liquiditätsbindung. Eine Erstattung wird berechnet, falls
     * ausdrücklich ein über das Liquiditätsbindungsende hinausgehender Gebührenverrechnungszeitraum
     * unter Nebenkosten erfasst wird.
     */
    protected Double gebuehrenRueckErstattungLiqui;
    /**
     * Rückerstattung des Disagio aus Zinsänderungssicht
     */
    protected Double disagioRueckErstattungZinsaenderung;
    /**
     * Gebührenrückerstattung zum Ablauf der Zinsbindung. Ein Teil der Gebühr muss erstattet werden,
     * falls der Gebührenverrechnungszeitraum über das Zinsbindungsende hinausreicht.
     */
    protected Double gebuehrenRueckErstattungZinsaenderung;
    /**
     * Summe der Zinsen bis Liquiditätsbindungsende, nicht für Terminzinskurvenverfahren
     */
    protected Double summeZinsenLiqui;
    /**
     * Summe der Tilgungen bis Liquiditätsbindungsende
     */
    protected Double summeTilgungenLiqui;
    /**
     * Unverschobenes Auszahlungsdatum
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar auszahlungsdatumUnverschoben;
    /**
     * Unverschobenes Zinsbindungsende
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zinsbindungsendeUnverschoben;
    /**
     * Nominalzins, welcher für die Berechnung des annuitätischen Tilgungsverlaufs verwendet wird. Der
     * hier vorgegebene Nominalzins darf von dem Nominalzins auf der Grunddaten-Maske abweichen.
     */
    protected Double annuNominalzins;
    /**
     * Restschuld der annuitätischen Tilgung
     */
    protected Double annuRestschuld;
    /**
     * Höhe der annuitätischen Rate
     */
    protected Double annuAnnuitaetenHoehe;
    /**
     * Anzahl der annuitätischen Tilgungen (Perioden) pro Jahr
     * siehe Struktur Perannoangabe
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe annuRatenPA;
    /**
     * Name des Finanzplatzes für die Berechnung der annuitätischen Tilgungsstruktur.
     * Abhängig vom Finanzplatz werden unterschiedliche Feiertage berücksichtigt.
     */
    protected String annuFinanzplatz;
    /**
     * Welche Verschieberegel soll für die Berechnung der annuitätischen Tilgungsstruktur
     * verwendet werden, wenn ein Termin nicht auf einen Bankarbeitstag fällt.
     * siehe Struktur Verschieberegel
     */
    @XmlSchemaType(name = "string")
    protected Verschieberegel annuVerschiebung;
    /**
     * Zinsusance für die Berechnung der annuitätischen Tilgungsanteile
     * siehe Struktur Usance
     */
    @XmlSchemaType(name = "string")
    protected Usance usanceAnnuitaeten;
    /**
     * Methode der annuitätischen Tilgung
     */
    @XmlSchemaType(name = "string")
    protected AnnuMethode annuMethode;
    /**
     * Tilgungsvereinbarung: Tilgungsstruktur fest oder Rate fest
     */
    @XmlSchemaType(name = "string")
    protected Tilgungsvereinbarung tilgungsvereinbarung;
    /**
     * Tabelle der annuitätischen Tilgungsstruktur
     */
    protected AnnuTilgungen annuTilgungen;
    /**
     * Vertragliche Sonderzahlungen innerhalb der Laufzeit des Darlehens.
     */
    protected Sonderzahlungen sonderzahlungen;
    /**
     * Zinsanpassungstermine.
     */
    protected Zinsanpassungstermine zinsanpassungstermine;
    /**
     * Overnight-Variante für RollOver
     */
    @XmlSchemaType(name = "string")
    protected RollOverOvernightVariante rollOverOvernightVariante;
    /**
     * Die Anzahl der Offset-Tage beim Overnight-Verfahren
     */
    protected Integer rollOverOffsetTage;
    /**
     * Referenzzinsen für Roll-Over Overnight.
     */
    protected OvernightReferenzzinsen overnightReferenzzinsen;
    /**
     * Der Stückzinstyp für Rollover
     */
    @XmlSchemaType(name = "string")
    protected Stueckzinsmethode stueckzinstyp;
    /**
     * Der Zinslauf ab für die Stückzinsberechnung Rollover
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zinslaufAb;
    /**
     * Der berechnete Stückzins für Rollover
     */
    protected Double stueckzins;
    /**
     * Die berechneten Stücktage für Rollover
     */
    protected Long stuecktage;
    /**
     * Der Nominalzins für die Stückzinsberechnung Rollover Overnight
     */
    protected Double nomzinsFuerStueckzins;

    /**
     * Über die Art der Kontoführung wird bestimmt, ob eine Ratentilgung mit gleichbleibend hohen
     * Tilgungsraten berücksichtigt werden soll, oder ob ein annuitätischer Tilgungsverlauf berechnet
     * werden soll.
     *
     * @return possible object is
     * {@link Tilgungsart }
     */
    public Tilgungsart getTilgungsart() {
        return tilgungsart;
    }

    /**
     * Sets the value of the tilgungsart property.
     *
     * @param value allowed object is
     *              {@link Tilgungsart }
     * @see #getTilgungsart()
     */
    public void setTilgungsart(Tilgungsart value) {
        this.tilgungsart = value;
    }

    /**
     * SEinstellung für Roll-Over-Darlehen, die nur wirkt, wenn auch in der Checkbox Referenzzins an
     * Zinsusance anpassen ein Haken gesetzt ist.
     * aktiviert:Anpassung des Referenzzinses wird auf die Laufzeit des Referenzzinses bezogen
     * deaktiviert: (Default) Anpassung des Referenzzinses wird auf die erste Zinsperiode bezogen
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReferenzzinslaufzeitVerwenden() {
        return referenzzinslaufzeitVerwenden;
    }

    /**
     * Sets the value of the referenzzinslaufzeitVerwenden property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isReferenzzinslaufzeitVerwenden()
     */
    public void setReferenzzinslaufzeitVerwenden(Boolean value) {
        this.referenzzinslaufzeitVerwenden = value;
    }

    /**
     * Datenbank ID des verwendeten Referenzzinses
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getReferenzzinsID() {
        return referenzzinsID;
    }

    /**
     * Sets the value of the referenzzinsID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getReferenzzinsID()
     */
    public void setReferenzzinsID(Integer value) {
        this.referenzzinsID = value;
    }

    /**
     * Name des verwendeten Referenzzinses
     *
     * @return possible object is
     * {@link String }
     */
    public String getReferenzzinsName() {
        return referenzzinsName;
    }

    /**
     * Sets the value of the referenzzinsName property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getReferenzzinsName()
     */
    public void setReferenzzinsName(String value) {
        this.referenzzinsName = value;
    }

    /**
     * Laufzeit des verwendeten Referenzzinses. Die Laufzeit des Referenzzins bestimt den Rythmus der
     * Zinsanpassung von Rollover Geschäften.
     * siehe Struktur ReferenzzinsLaufzeit
     *
     * @return possible object is
     * {@link ReferenzzinsLaufzeit }
     */
    public ReferenzzinsLaufzeit getReferenzzinsLaufzeit() {
        return referenzzinsLaufzeit;
    }

    /**
     * Sets the value of the referenzzinsLaufzeit property.
     *
     * @param value allowed object is
     *              {@link ReferenzzinsLaufzeit }
     * @see #getReferenzzinsLaufzeit()
     */
    public void setReferenzzinsLaufzeit(ReferenzzinsLaufzeit value) {
        this.referenzzinsLaufzeit = value;
    }

    /**
     * Mit der Methode kann vorgegeben werden, welcher Referenzzinssatz verwendet werden soll.
     * Es gibt folgende Möglichkeiten:
     * lt. Referenzzinstyp - Es wird der aktuell gültige Referenzzinssatz passend zum gewählten
     * Referenzzins verwendet.
     * interpolieren - Mit Hilfe der risikolosen Zinsstruktur wird für die Laufzeit ein
     * Referenzzinssatz interpoliert.
     * manuell - Der Nominalzins wird direkt eingegeben und nicht automatisch aktualisiert. Beim Fixing
     * wird die Einstellung auf lt. Referenzzinstyp zurückgesetzt.
     * Im Fixing gibt es nur die Einstellungen lt. Referenzzinstyp und manuell, weil eine gebrochene
     * erste Zinsbindungsperiode dann nicht mehr möglich ist.
     *
     * @return possible object is
     * {@link ReferenzzinsMethode }
     */
    public ReferenzzinsMethode getReferenzzinsMethode() {
        return referenzzinsMethode;
    }

    /**
     * Sets the value of the referenzzinsMethode property.
     *
     * @param value allowed object is
     *              {@link ReferenzzinsMethode }
     * @see #getReferenzzinsMethode()
     */
    public void setReferenzzinsMethode(ReferenzzinsMethode value) {
        this.referenzzinsMethode = value;
    }

    /**
     * Marge aus einem möglicherweise vereinbarten Disagio
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargeAusDisagio() {
        return margeAusDisagio;
    }

    /**
     * Sets the value of the margeAusDisagio property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargeAusDisagio()
     */
    public void setMargeAusDisagio(Double value) {
        this.margeAusDisagio = value;
    }

    /**
     * Kennzeichen für fixen Aufschlag
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMarginIstFix() {
        return marginIstFix;
    }

    /**
     * Sets the value of the marginIstFix property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMarginIstFix()
     */
    public void setMarginIstFix(Boolean value) {
        this.marginIstFix = value;
    }

    /**
     * Datum, an dem das nächste Fixing fällig ist. Datum, an dem der Nominalzins bis zur darauf
     * folgenden Zinsbindung vereinbart wird. Der Fixingtermin liegt üblicherweise zwei Banktage vor
     * dem Zinsbindungsende. Die Fixingtage werden bei der Kontoführung eingestellt.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getNaechstesFixingDatum() {
        return naechstesFixingDatum;
    }

    /**
     * Sets the value of the naechstesFixingDatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getNaechstesFixingDatum()
     */
    public void setNaechstesFixingDatum(XMLGregorianCalendar value) {
        this.naechstesFixingDatum = value;
    }

    /**
     * Die Anzahl der Fixingtage vor dem Zinsbindungsende wird der Nominalzins für die nächste
     * Zinsbindungsdauer gefixt. Dieser Wert wird über den ausgewählten Referenzzins bestimmt
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getFixingtage() {
        return fixingtage;
    }

    /**
     * Sets the value of the fixingtage property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getFixingtage()
     */
    public void setFixingtage(Integer value) {
        this.fixingtage = value;
    }

    /**
     * Zeilennummer des nächsten Fixingtermins
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getFixingterminZeilenNr() {
        return fixingterminZeilenNr;
    }

    /**
     * Sets the value of the fixingterminZeilenNr property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getFixingterminZeilenNr()
     */
    public void setFixingterminZeilenNr(Integer value) {
        this.fixingterminZeilenNr = value;
    }

    /**
     * Der Dropdown-Liste steuert, ob der Nominalzins für die erste Zinsperiode fest vereinbart ist
     * (sofort fixieren), oder ob er lediglich für eine erste Prognose herangezogen wird (später
     * fixieren). In diesem Fall muss vor der Auszahlung noch ein Fixing stattfinden.
     *
     * @return possible object is
     * {@link FixingArt }
     */
    public FixingArt getFixingArt() {
        return fixingArt;
    }

    /**
     * Sets the value of the fixingArt property.
     *
     * @param value allowed object is
     *              {@link FixingArt }
     * @see #getFixingArt()
     */
    public void setFixingArt(FixingArt value) {
        this.fixingArt = value;
    }

    /**
     * Referenzzinssatz zum eingestellten Referenzzinstyp
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getReferenzzinsHoehe() {
        return referenzzinsHoehe;
    }

    /**
     * Sets the value of the referenzzinsHoehe property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getReferenzzinsHoehe()
     */
    public void setReferenzzinsHoehe(Double value) {
        this.referenzzinsHoehe = value;
    }

    /**
     * Referenzzinssatz aus GilKonfigPS
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getReferenzzinsHoeheEinstand() {
        return referenzzinsHoeheEinstand;
    }

    /**
     * Sets the value of the referenzzinsHoeheEinstand property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getReferenzzinsHoeheEinstand()
     */
    public void setReferenzzinsHoeheEinstand(Double value) {
        this.referenzzinsHoeheEinstand = value;
    }

    /**
     * Datum, an welchem der Referenzzins den ausgewiesenen Referenzzinssatz hatte.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getReferenzzinsDatum() {
        return referenzzinsDatum;
    }

    /**
     * Sets the value of the referenzzinsDatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getReferenzzinsDatum()
     */
    public void setReferenzzinsDatum(XMLGregorianCalendar value) {
        this.referenzzinsDatum = value;
    }

    /**
     * Kennzeichen, ob der Referenzzinssatz manuell ausgewählt wurde.
     * Das Element ist ein reines Ausgabefeld. Beim Import wird dieses Element ignoriert
     * und bei anschliessenden Berechnungen automatisch der neueste Referenzzinssatz verwendet.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReferenzzinssatzManuellAusgewaehlt() {
        return referenzzinssatzManuellAusgewaehlt;
    }

    /**
     * Sets the value of the referenzzinssatzManuellAusgewaehlt property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isReferenzzinssatzManuellAusgewaehlt()
     */
    public void setReferenzzinssatzManuellAusgewaehlt(Boolean value) {
        this.referenzzinssatzManuellAusgewaehlt = value;
    }

    /**
     * Aus der aktuellen risikolosen Zinsstruktur wird der Zinssatz für den Zeitraum bis zum
     * Zinsperiodenende errechnet (Interpolation).
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getInterpolierterZinsHoehe() {
        return interpolierterZinsHoehe;
    }

    /**
     * Sets the value of the interpolierterZinsHoehe property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getInterpolierterZinsHoehe()
     */
    public void setInterpolierterZinsHoehe(Double value) {
        this.interpolierterZinsHoehe = value;
    }

    /**
     * Beginn der aktuellen Zinsperiode
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getZinsbindungsbeginn() {
        return zinsbindungsbeginn;
    }

    /**
     * Sets the value of the zinsbindungsbeginn property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getZinsbindungsbeginn()
     */
    public void setZinsbindungsbeginn(XMLGregorianCalendar value) {
        this.zinsbindungsbeginn = value;
    }

    /**
     * Restkapital zu Beginn der aktuellen Zinsperiode
     * Feld soll entfallen!
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRestkapital() {
        return restkapital;
    }

    /**
     * Sets the value of the restkapital property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRestkapital()
     */
    public void setRestkapital(Double value) {
        this.restkapital = value;
    }

    /**
     * Restschuld zum Ablauf der Liquiditätsbindung; der Betrag enthält gegebenenfalls noch nicht
     * verrechnete Zinsanteile.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRestschuldMitZinsLiqui() {
        return restschuldMitZinsLiqui;
    }

    /**
     * Sets the value of the restschuldMitZinsLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRestschuldMitZinsLiqui()
     */
    public void setRestschuldMitZinsLiqui(Double value) {
        this.restschuldMitZinsLiqui = value;
    }

    /**
     * Restschuld zum Ablauf der Liquiditätsbindung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRestschuldOhneZinsLiqui() {
        return restschuldOhneZinsLiqui;
    }

    /**
     * Sets the value of the restschuldOhneZinsLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRestschuldOhneZinsLiqui()
     */
    public void setRestschuldOhneZinsLiqui(Double value) {
        this.restschuldOhneZinsLiqui = value;
    }

    /**
     * Anzahl der Zinszahlungen bis Liquiditätsbindungsende
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAnzahlZinsenLiqui() {
        return anzahlZinsenLiqui;
    }

    /**
     * Sets the value of the anzahlZinsenLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAnzahlZinsenLiqui()
     */
    public void setAnzahlZinsenLiqui(Double value) {
        this.anzahlZinsenLiqui = value;
    }

    /**
     * Anzahl der Zinszahlungen bis Zinsbindungsende
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAnzahlZinsenZinsbindung() {
        return anzahlZinsenZinsbindung;
    }

    /**
     * Sets the value of the anzahlZinsenZinsbindung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAnzahlZinsenZinsbindung()
     */
    public void setAnzahlZinsenZinsbindung(Double value) {
        this.anzahlZinsenZinsbindung = value;
    }

    /**
     * Rückerstattung des Disagio aus Liquiditätssicht
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDisagioRueckErstattungLiqui() {
        return disagioRueckErstattungLiqui;
    }

    /**
     * Sets the value of the disagioRueckErstattungLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDisagioRueckErstattungLiqui()
     */
    public void setDisagioRueckErstattungLiqui(Double value) {
        this.disagioRueckErstattungLiqui = value;
    }

    /**
     * Gebührenrückerstattung zum Ablauf der Liquiditätsbindung. Eine Erstattung wird berechnet, falls
     * ausdrücklich ein über das Liquiditätsbindungsende hinausgehender Gebührenverrechnungszeitraum
     * unter Nebenkosten erfasst wird.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGebuehrenRueckErstattungLiqui() {
        return gebuehrenRueckErstattungLiqui;
    }

    /**
     * Sets the value of the gebuehrenRueckErstattungLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getGebuehrenRueckErstattungLiqui()
     */
    public void setGebuehrenRueckErstattungLiqui(Double value) {
        this.gebuehrenRueckErstattungLiqui = value;
    }

    /**
     * Rückerstattung des Disagio aus Zinsänderungssicht
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDisagioRueckErstattungZinsaenderung() {
        return disagioRueckErstattungZinsaenderung;
    }

    /**
     * Sets the value of the disagioRueckErstattungZinsaenderung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDisagioRueckErstattungZinsaenderung()
     */
    public void setDisagioRueckErstattungZinsaenderung(Double value) {
        this.disagioRueckErstattungZinsaenderung = value;
    }

    /**
     * Gebührenrückerstattung zum Ablauf der Zinsbindung. Ein Teil der Gebühr muss erstattet werden,
     * falls der Gebührenverrechnungszeitraum über das Zinsbindungsende hinausreicht.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGebuehrenRueckErstattungZinsaenderung() {
        return gebuehrenRueckErstattungZinsaenderung;
    }

    /**
     * Sets the value of the gebuehrenRueckErstattungZinsaenderung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getGebuehrenRueckErstattungZinsaenderung()
     */
    public void setGebuehrenRueckErstattungZinsaenderung(Double value) {
        this.gebuehrenRueckErstattungZinsaenderung = value;
    }

    /**
     * Summe der Zinsen bis Liquiditätsbindungsende, nicht für Terminzinskurvenverfahren
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeZinsenLiqui() {
        return summeZinsenLiqui;
    }

    /**
     * Sets the value of the summeZinsenLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeZinsenLiqui()
     */
    public void setSummeZinsenLiqui(Double value) {
        this.summeZinsenLiqui = value;
    }

    /**
     * Summe der Tilgungen bis Liquiditätsbindungsende
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeTilgungenLiqui() {
        return summeTilgungenLiqui;
    }

    /**
     * Sets the value of the summeTilgungenLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeTilgungenLiqui()
     */
    public void setSummeTilgungenLiqui(Double value) {
        this.summeTilgungenLiqui = value;
    }

    /**
     * Unverschobenes Auszahlungsdatum
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAuszahlungsdatumUnverschoben() {
        return auszahlungsdatumUnverschoben;
    }

    /**
     * Sets the value of the auszahlungsdatumUnverschoben property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAuszahlungsdatumUnverschoben()
     */
    public void setAuszahlungsdatumUnverschoben(XMLGregorianCalendar value) {
        this.auszahlungsdatumUnverschoben = value;
    }

    /**
     * Unverschobenes Zinsbindungsende
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getZinsbindungsendeUnverschoben() {
        return zinsbindungsendeUnverschoben;
    }

    /**
     * Sets the value of the zinsbindungsendeUnverschoben property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getZinsbindungsendeUnverschoben()
     */
    public void setZinsbindungsendeUnverschoben(XMLGregorianCalendar value) {
        this.zinsbindungsendeUnverschoben = value;
    }

    /**
     * Nominalzins, welcher für die Berechnung des annuitätischen Tilgungsverlaufs verwendet wird. Der
     * hier vorgegebene Nominalzins darf von dem Nominalzins auf der Grunddaten-Maske abweichen.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAnnuNominalzins() {
        return annuNominalzins;
    }

    /**
     * Sets the value of the annuNominalzins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAnnuNominalzins()
     */
    public void setAnnuNominalzins(Double value) {
        this.annuNominalzins = value;
    }

    /**
     * Restschuld der annuitätischen Tilgung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAnnuRestschuld() {
        return annuRestschuld;
    }

    /**
     * Sets the value of the annuRestschuld property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAnnuRestschuld()
     */
    public void setAnnuRestschuld(Double value) {
        this.annuRestschuld = value;
    }

    /**
     * Höhe der annuitätischen Rate
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAnnuAnnuitaetenHoehe() {
        return annuAnnuitaetenHoehe;
    }

    /**
     * Sets the value of the annuAnnuitaetenHoehe property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAnnuAnnuitaetenHoehe()
     */
    public void setAnnuAnnuitaetenHoehe(Double value) {
        this.annuAnnuitaetenHoehe = value;
    }

    /**
     * Anzahl der annuitätischen Tilgungen (Perioden) pro Jahr
     * siehe Struktur Perannoangabe
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getAnnuRatenPA() {
        return annuRatenPA;
    }

    /**
     * Sets the value of the annuRatenPA property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getAnnuRatenPA()
     */
    public void setAnnuRatenPA(Perannoangabe value) {
        this.annuRatenPA = value;
    }

    /**
     * Name des Finanzplatzes für die Berechnung der annuitätischen Tilgungsstruktur.
     * Abhängig vom Finanzplatz werden unterschiedliche Feiertage berücksichtigt.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAnnuFinanzplatz() {
        return annuFinanzplatz;
    }

    /**
     * Sets the value of the annuFinanzplatz property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getAnnuFinanzplatz()
     */
    public void setAnnuFinanzplatz(String value) {
        this.annuFinanzplatz = value;
    }

    /**
     * Welche Verschieberegel soll für die Berechnung der annuitätischen Tilgungsstruktur
     * verwendet werden, wenn ein Termin nicht auf einen Bankarbeitstag fällt.
     * siehe Struktur Verschieberegel
     *
     * @return possible object is
     * {@link Verschieberegel }
     */
    public Verschieberegel getAnnuVerschiebung() {
        return annuVerschiebung;
    }

    /**
     * Sets the value of the annuVerschiebung property.
     *
     * @param value allowed object is
     *              {@link Verschieberegel }
     * @see #getAnnuVerschiebung()
     */
    public void setAnnuVerschiebung(Verschieberegel value) {
        this.annuVerschiebung = value;
    }

    /**
     * Zinsusance für die Berechnung der annuitätischen Tilgungsanteile
     * siehe Struktur Usance
     *
     * @return possible object is
     * {@link Usance }
     */
    public Usance getUsanceAnnuitaeten() {
        return usanceAnnuitaeten;
    }

    /**
     * Sets the value of the usanceAnnuitaeten property.
     *
     * @param value allowed object is
     *              {@link Usance }
     * @see #getUsanceAnnuitaeten()
     */
    public void setUsanceAnnuitaeten(Usance value) {
        this.usanceAnnuitaeten = value;
    }

    /**
     * Methode der annuitätischen Tilgung
     *
     * @return possible object is
     * {@link AnnuMethode }
     */
    public AnnuMethode getAnnuMethode() {
        return annuMethode;
    }

    /**
     * Sets the value of the annuMethode property.
     *
     * @param value allowed object is
     *              {@link AnnuMethode }
     * @see #getAnnuMethode()
     */
    public void setAnnuMethode(AnnuMethode value) {
        this.annuMethode = value;
    }

    /**
     * Tilgungsvereinbarung: Tilgungsstruktur fest oder Rate fest
     *
     * @return possible object is
     * {@link Tilgungsvereinbarung }
     */
    public Tilgungsvereinbarung getTilgungsvereinbarung() {
        return tilgungsvereinbarung;
    }

    /**
     * Sets the value of the tilgungsvereinbarung property.
     *
     * @param value allowed object is
     *              {@link Tilgungsvereinbarung }
     * @see #getTilgungsvereinbarung()
     */
    public void setTilgungsvereinbarung(Tilgungsvereinbarung value) {
        this.tilgungsvereinbarung = value;
    }

    /**
     * Tabelle der annuitätischen Tilgungsstruktur
     *
     * @return possible object is
     * {@link AnnuTilgungen }
     */
    public AnnuTilgungen getAnnuTilgungen() {
        return annuTilgungen;
    }

    /**
     * Sets the value of the annuTilgungen property.
     *
     * @param value allowed object is
     *              {@link AnnuTilgungen }
     * @see #getAnnuTilgungen()
     */
    public void setAnnuTilgungen(AnnuTilgungen value) {
        this.annuTilgungen = value;
    }

    /**
     * Vertragliche Sonderzahlungen innerhalb der Laufzeit des Darlehens.
     *
     * @return possible object is
     * {@link Sonderzahlungen }
     */
    public Sonderzahlungen getSonderzahlungen() {
        return sonderzahlungen;
    }

    /**
     * Sets the value of the sonderzahlungen property.
     *
     * @param value allowed object is
     *              {@link Sonderzahlungen }
     * @see #getSonderzahlungen()
     */
    public void setSonderzahlungen(Sonderzahlungen value) {
        this.sonderzahlungen = value;
    }

    /**
     * Zinsanpassungstermine.
     *
     * @return possible object is
     * {@link Zinsanpassungstermine }
     */
    public Zinsanpassungstermine getZinsanpassungstermine() {
        return zinsanpassungstermine;
    }

    /**
     * Sets the value of the zinsanpassungstermine property.
     *
     * @param value allowed object is
     *              {@link Zinsanpassungstermine }
     * @see #getZinsanpassungstermine()
     */
    public void setZinsanpassungstermine(Zinsanpassungstermine value) {
        this.zinsanpassungstermine = value;
    }

    /**
     * Overnight-Variante für RollOver
     *
     * @return possible object is
     * {@link RollOverOvernightVariante }
     */
    public RollOverOvernightVariante getRollOverOvernightVariante() {
        return rollOverOvernightVariante;
    }

    /**
     * Sets the value of the rollOverOvernightVariante property.
     *
     * @param value allowed object is
     *              {@link RollOverOvernightVariante }
     * @see #getRollOverOvernightVariante()
     */
    public void setRollOverOvernightVariante(RollOverOvernightVariante value) {
        this.rollOverOvernightVariante = value;
    }

    /**
     * Die Anzahl der Offset-Tage beim Overnight-Verfahren
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRollOverOffsetTage() {
        return rollOverOffsetTage;
    }

    /**
     * Sets the value of the rollOverOffsetTage property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getRollOverOffsetTage()
     */
    public void setRollOverOffsetTage(Integer value) {
        this.rollOverOffsetTage = value;
    }

    /**
     * Referenzzinsen für Roll-Over Overnight.
     *
     * @return possible object is
     * {@link OvernightReferenzzinsen }
     */
    public OvernightReferenzzinsen getOvernightReferenzzinsen() {
        return overnightReferenzzinsen;
    }

    /**
     * Sets the value of the overnightReferenzzinsen property.
     *
     * @param value allowed object is
     *              {@link OvernightReferenzzinsen }
     * @see #getOvernightReferenzzinsen()
     */
    public void setOvernightReferenzzinsen(OvernightReferenzzinsen value) {
        this.overnightReferenzzinsen = value;
    }

    /**
     * Der Stückzinstyp für Rollover
     *
     * @return possible object is
     * {@link Stueckzinsmethode }
     */
    public Stueckzinsmethode getStueckzinstyp() {
        return stueckzinstyp;
    }

    /**
     * Sets the value of the stueckzinstyp property.
     *
     * @param value allowed object is
     *              {@link Stueckzinsmethode }
     * @see #getStueckzinstyp()
     */
    public void setStueckzinstyp(Stueckzinsmethode value) {
        this.stueckzinstyp = value;
    }

    /**
     * Der Zinslauf ab für die Stückzinsberechnung Rollover
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getZinslaufAb() {
        return zinslaufAb;
    }

    /**
     * Sets the value of the zinslaufAb property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getZinslaufAb()
     */
    public void setZinslaufAb(XMLGregorianCalendar value) {
        this.zinslaufAb = value;
    }

    /**
     * Der berechnete Stückzins für Rollover
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getStueckzins() {
        return stueckzins;
    }

    /**
     * Sets the value of the stueckzins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getStueckzins()
     */
    public void setStueckzins(Double value) {
        this.stueckzins = value;
    }

    /**
     * Die berechneten Stücktage für Rollover
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getStuecktage() {
        return stuecktage;
    }

    /**
     * Sets the value of the stuecktage property.
     *
     * @param value allowed object is
     *              {@link Long }
     * @see #getStuecktage()
     */
    public void setStuecktage(Long value) {
        this.stuecktage = value;
    }

    /**
     * Der Nominalzins für die Stückzinsberechnung Rollover Overnight
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNomzinsFuerStueckzins() {
        return nomzinsFuerStueckzins;
    }

    /**
     * Sets the value of the nomzinsFuerStueckzins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNomzinsFuerStueckzins()
     */
    public void setNomzinsFuerStueckzins(Double value) {
        this.nomzinsFuerStueckzins = value;
    }

}
