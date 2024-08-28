
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Enthält zusätzliche Angaben für die Berechnung
 *
 * <p>Java class for Kalkulationsparameter complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Kalkulationsparameter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="deckungsbeitragsschema" type="{http://www.gillardon.de/marzipan/integrationsservice}ZusaetzlicheExportFelder" minOccurs="0"/>
 *         <element name="effektiveZinsusance" type="{http://www.gillardon.de/marzipan/integrationsservice}Usance" minOccurs="0"/>
 *         <element name="kalkulationsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="berechnungsansicht" type="{http://www.gillardon.de/marzipan/integrationsservice}Berechnungsansicht" minOccurs="0"/>
 *         <element name="effektivzinsMethode" type="{http://www.gillardon.de/marzipan/integrationsservice}EffektivzinsMethode" minOccurs="0"/>
 *         <element name="effzinsvariantePAngV" type="{http://www.gillardon.de/marzipan/integrationsservice}Gesamtkostenvariante" minOccurs="0"/>
 *         <element name="pAngVMethode" type="{http://www.gillardon.de/marzipan/integrationsservice}PAngVMethode" minOccurs="0"/>
 *         <element name="berechnungsartMarge" type="{http://www.gillardon.de/marzipan/integrationsservice}Entnahmeart" minOccurs="0"/>
 *         <element name="durationberechnungsart" type="{http://www.gillardon.de/marzipan/integrationsservice}Durationberechnungsart" minOccurs="0"/>
 *         <element name="rundungBetraege" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="rundungNominalzinsProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="teilmarkt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="teilmarktRisikolos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="teilweiseGedeckt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="teilmarktBasisswapSpread" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="teilmarktSwap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="zinsstrukturID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="zinsstrukturKommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kalkulationsdatumZinsstruktur" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="zinsstrUngedecktID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="zinsstrUngedecktKommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="zinsstrRisikolosID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="zinsstrRisikolosKommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="zinsstrKreditRisikoID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="zinsstrKreditRisikoKommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="zinsstrBasisswapSpreadID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="kalkulationsdatumBasisswapSpreadZinsstruktur" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="zinsstrBasisswapSpreadKommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="zinsstrSwapID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="kalkulationsdatumSwapZinsstruktur" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="zinsstrSwapKommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mitLiquikosten" type="{http://www.gillardon.de/marzipan/integrationsservice}MitLiquikosten" minOccurs="0"/>
 *         <element name="zinsstrukturUhrzeitAuswahlModus" type="{http://www.gillardon.de/marzipan/integrationsservice}ZinsstrukturUhrzeitAuswahlModus" minOccurs="0"/>
 *         <element name="aufschlagBasiskurve" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ftpcSpreads" type="{http://www.gillardon.de/marzipan/integrationsservice}FtpcSpreads" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kalkulationsparameter", propOrder = {

})
public class Kalkulationsparameter {

    /**
     * Name des zu verwendenden Deckungsbeitragsschemas
     */
    protected ZusaetzlicheExportFelder deckungsbeitragsschema;
    /**
     * Zinsusance zur Berechnung Effektivzins und Einstand
     * siehe Struktur Usance
     */
    @XmlSchemaType(name = "string")
    protected Usance effektiveZinsusance;
    /**
     * Kalkulationsdatum des Geschäfts, auf das die Zinsstruktur bei entsprechender Voreinstellung
     * verschoben werden soll
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kalkulationsdatum;
    /**
     * Abhängig von der eingestellten Berechnungsbasis stehen verschiedene Rechenfunktionalitäten zur
     * Verfügung. Die hierfür benötigten Eingabe- und Ergebnisfelder werden entsprechend eingeblendet.
     * Bei fehlenden oder nicht sinnvollen Werten erscheint im oberen Bereich des Fensters eine
     * Fehlermeldung. Folgende Berechnungsbasen können Sie einstellen: effektiv, Marge, Deckungsbeitrag
     */
    @XmlSchemaType(name = "string")
    protected Berechnungsansicht berechnungsansicht;
    /**
     * Methode der Effektivzinsberechnung
     */
    @XmlSchemaType(name = "string")
    protected EffektivzinsMethode effektivzinsMethode;
    /**
     * Der PAngV-Effektivzins kann auf drei verschiedene Arten bestimmt werden: bis Zinsbindungsende,
     * bis zur vollständigen Tilgung oder bis zu einem vorgegebenen Ablaufdatum.
     * siehe Struktur Gesamtkostenvariante
     */
    @XmlSchemaType(name = "string")
    protected Gesamtkostenvariante effzinsvariantePAngV;
    /**
     * Methode für die Berechnung des Effektivzinses PAngV (PANGV_2000 oder PANGV_2016)
     * siehe Struktur PAngVMethode
     */
    @XmlSchemaType(name = "string")
    protected PAngVMethode pAngVMethode;
    /**
     * Entnahmeart für die Margenrechnung (Sofortentnahme, Laufende Entnahme, Nominale Entnahme).
     */
    @XmlSchemaType(name = "string")
    protected Entnahmeart berechnungsartMarge;
    /**
     * Art der Durationberechnung (keine, auf Basis Einstand, auf Basis Effektivzins, auf Basis
     * Zinsstruktur).
     */
    @XmlSchemaType(name = "string")
    protected Durationberechnungsart durationberechnungsart;
    /**
     * Beispiel: Eingabe: auf zwei Nachkommastellen. Folge: Alle Beträge, sowohl in den Eingabe- und
     * Ergebnisdialogen als auch in den Kontoplänen, werden vor dem weiteren Rechnen auf Cent genau
     * gerundet.
     * Eingabe: keine Rundung. Folge: Eine Rundung findet nicht statt. Die Rundungseinstellung greift
     * für Annuitätendarlehen, Tilgungsdarlehen, endfällige Darlehen, Annuitätentilgung und
     * Roll-Over-Darlehen.
     */
    protected Double rundungBetraege;
    /**
     * Bei Ausgabe von Tilgungsplänen ist es oft sinnvoll, mit glatten Nominalzinsen zu rechnen. Dies
     * gilt insbesondere dann, wenn der Nominalzins vorher berechnet wurde. Sofern ein von null
     * abweichender Wert eingegeben wird, rundet das Programm eingegebene und berechnete Nominalzinsen.
     * Beispiel: Wenn bei Vorgabe des Effektivzinssatzes der Nominalzins gesucht wird, ermittelt das
     * Programm das Ergebnis mit allen Nachkommastellen. Wird auf dieser Basis der Tilgungsplan
     * gedruckt, werden sich Cent-Differenzen im Vergleich zum tatsächlichen Tilgungsplan zeigen, weil
     * in der Praxis der Nominalzins geglättet ist.
     * In der Combobox kann gewählt werden, auf welche Nachkommastelle gerundet werden soll. Beachte:
     * Das Konto geht bei Rundungen unter Umständen nicht mehr genau auf. Es verbleiben
     * Cent-Differenzen. Die Rundungseinstellung greift für Annuitätendarlehen, Tilgungsdarlehen,
     * endfällige Darlehen und Annuitätentilgung.
     */
    protected Double rundungNominalzinsProzent;
    /**
     * Teilmarkt der ausgewählten Zinsstruktur der Refinanzierung (gedeckt)
     */
    protected String teilmarkt;
    /**
     * Risikoloser Teilmarkt der ausgewählten Zinsstruktur zur Berechnung der Liquiditätskosten.
     */
    protected String teilmarktRisikolos;
    /**
     * Teilweise gedeckte Darlehen - Darlehensart teilweise gedeckt
     * Teilweise gedeckte Darlehen sind Festzinsdarlehen, bei denen der Nominalbetrag teilweise mit
     * Sicherheiten abgedeckt ist. Aus diesem Grund müssen für die Margenrechnung zwei Zinsstrukturen
     * herangezogen werden, eine für den gedeckten Anteil und eine für den ungedeckten Teil.
     */
    protected Boolean teilweiseGedeckt;
    /**
     * Name des Teilmarktes für die Basis-Swap-Spreadkurve für Roll-Over im Spread-Verfahren
     */
    protected String teilmarktBasisswapSpread;
    /**
     * Name des Teilmarktes der Swapkurve für Roll-Over im TZK-Verfahren.
     */
    protected String teilmarktSwap;
    /**
     * Datenbank ID der verwendeten Zinsstruktur. Falls eingegeben, wird die Zinsstruktur anhand der ID
     * übernommen,
     * sonst wird die neueste Zinsstruktur anhand Kalkulationsdatum, Währung und Teilmarkt übernommen.
     */
    protected Integer zinsstrukturID;
    /**
     * Kommentar der verwendeten Zinsstruktur.
     */
    protected String zinsstrukturKommentar;
    /**
     * Kalkulationsdatum der ausgewählten Zinsstruktur des gedeckten Teils bei Darlehensart Teilweise
     * gedeckt.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kalkulationsdatumZinsstruktur;
    /**
     * Teilmarkt der ausgewählten Zinsstruktur für den ungedeckten Anteil vom Nominalbetrag
     * Datenbank ID (MARZIPAN) der verwendeten Zinsstruktur für den ungedeckten Teil des Kredits
     */
    protected Integer zinsstrUngedecktID;
    /**
     * Kommentar der verwendeten Zinsstruktur für den ungedeckten Teil des Kredits
     */
    protected String zinsstrUngedecktKommentar;
    /**
     * Datenbank ID der verwendeten risikolosen Zinsstruktur
     */
    protected Integer zinsstrRisikolosID;
    /**
     * Kommentar der verwendeten risikolosen Zinsstruktur
     */
    protected String zinsstrRisikolosKommentar;
    /**
     * Datenbank ID der verwendeten Kreditrisiko-Zinsstruktur
     */
    protected Integer zinsstrKreditRisikoID;
    /**
     * Kommentar der verwendeten Refinanzierungszinsstruktur.
     */
    protected String zinsstrKreditRisikoKommentar;
    /**
     * Datenbank ID der verwendeten Basis Swap Spread Zinsstruktur. Falls eingegeben, wird die
     * Zinsstruktur anhand der ID übernommen, sonst wird die neueste Zinsstruktur anhand
     * Kalkulationsdatum, Währung und Teilmarkt übernommen.
     */
    protected Integer zinsstrBasisswapSpreadID;
    /**
     * Kalkulationsdatum der Basis Swap Spreadstruktur.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kalkulationsdatumBasisswapSpreadZinsstruktur;
    /**
     * Kommentar der verwendeten Basis Swap Spreadstruktur
     */
    protected String zinsstrBasisswapSpreadKommentar;
    /**
     * Datenbank ID der verwendeten Swap-Zinsstruktur im TZK-Verfahren. Falls eingegeben, wird die
     * Zinsstruktur anhand der ID übernommen, sonst wird die neueste Zinsstruktur anhand
     * Kalkulationsdatum, Währung und Teilmarkt übernommen.
     */
    protected Integer zinsstrSwapID;
    /**
     * Kalkulationsdatum der verwendeten Swap-Zinsstruktur im TZK-Verfahren.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kalkulationsdatumSwapZinsstruktur;
    /**
     * Kommentar der verwendeten Swap-Zinsstruktur im TZK-Verfahren.
     */
    protected String zinsstrSwapKommentar;
    /**
     * Berechnung mit oder ohne Liquiditätskosten
     */
    @XmlSchemaType(name = "string")
    protected MitLiquikosten mitLiquikosten;
    /**
     * Auswahl der Zinsstruktur gemäß Uhrzeit.
     * Das Element ist ein reines Ausgabefeld. Beim Import wird dieses Element ignoriert.
     */
    @XmlSchemaType(name = "string")
    protected ZinsstrukturUhrzeitAuswahlModus zinsstrukturUhrzeitAuswahlModus;
    /**
     * Aufschlag auf die Basiskurve.
     */
    protected Double aufschlagBasiskurve;
    /**
     * Ftpc Spreads
     */
    protected FtpcSpreads ftpcSpreads;

    /**
     * Name des zu verwendenden Deckungsbeitragsschemas
     *
     * @return possible object is
     * {@link ZusaetzlicheExportFelder }
     */
    public ZusaetzlicheExportFelder getDeckungsbeitragsschema() {
        return deckungsbeitragsschema;
    }

    /**
     * Sets the value of the deckungsbeitragsschema property.
     *
     * @param value allowed object is
     *              {@link ZusaetzlicheExportFelder }
     * @see #getDeckungsbeitragsschema()
     */
    public void setDeckungsbeitragsschema(ZusaetzlicheExportFelder value) {
        this.deckungsbeitragsschema = value;
    }

    /**
     * Zinsusance zur Berechnung Effektivzins und Einstand
     * siehe Struktur Usance
     *
     * @return possible object is
     * {@link Usance }
     */
    public Usance getEffektiveZinsusance() {
        return effektiveZinsusance;
    }

    /**
     * Sets the value of the effektiveZinsusance property.
     *
     * @param value allowed object is
     *              {@link Usance }
     * @see #getEffektiveZinsusance()
     */
    public void setEffektiveZinsusance(Usance value) {
        this.effektiveZinsusance = value;
    }

    /**
     * Kalkulationsdatum des Geschäfts, auf das die Zinsstruktur bei entsprechender Voreinstellung
     * verschoben werden soll
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
     * Abhängig von der eingestellten Berechnungsbasis stehen verschiedene Rechenfunktionalitäten zur
     * Verfügung. Die hierfür benötigten Eingabe- und Ergebnisfelder werden entsprechend eingeblendet.
     * Bei fehlenden oder nicht sinnvollen Werten erscheint im oberen Bereich des Fensters eine
     * Fehlermeldung. Folgende Berechnungsbasen können Sie einstellen: effektiv, Marge, Deckungsbeitrag
     *
     * @return possible object is
     * {@link Berechnungsansicht }
     */
    public Berechnungsansicht getBerechnungsansicht() {
        return berechnungsansicht;
    }

    /**
     * Sets the value of the berechnungsansicht property.
     *
     * @param value allowed object is
     *              {@link Berechnungsansicht }
     * @see #getBerechnungsansicht()
     */
    public void setBerechnungsansicht(Berechnungsansicht value) {
        this.berechnungsansicht = value;
    }

    /**
     * Methode der Effektivzinsberechnung
     *
     * @return possible object is
     * {@link EffektivzinsMethode }
     */
    public EffektivzinsMethode getEffektivzinsMethode() {
        return effektivzinsMethode;
    }

    /**
     * Sets the value of the effektivzinsMethode property.
     *
     * @param value allowed object is
     *              {@link EffektivzinsMethode }
     * @see #getEffektivzinsMethode()
     */
    public void setEffektivzinsMethode(EffektivzinsMethode value) {
        this.effektivzinsMethode = value;
    }

    /**
     * Der PAngV-Effektivzins kann auf drei verschiedene Arten bestimmt werden: bis Zinsbindungsende,
     * bis zur vollständigen Tilgung oder bis zu einem vorgegebenen Ablaufdatum.
     * siehe Struktur Gesamtkostenvariante
     *
     * @return possible object is
     * {@link Gesamtkostenvariante }
     */
    public Gesamtkostenvariante getEffzinsvariantePAngV() {
        return effzinsvariantePAngV;
    }

    /**
     * Sets the value of the effzinsvariantePAngV property.
     *
     * @param value allowed object is
     *              {@link Gesamtkostenvariante }
     * @see #getEffzinsvariantePAngV()
     */
    public void setEffzinsvariantePAngV(Gesamtkostenvariante value) {
        this.effzinsvariantePAngV = value;
    }

    /**
     * Methode für die Berechnung des Effektivzinses PAngV (PANGV_2000 oder PANGV_2016)
     * siehe Struktur PAngVMethode
     *
     * @return possible object is
     * {@link PAngVMethode }
     */
    public PAngVMethode getPAngVMethode() {
        return pAngVMethode;
    }

    /**
     * Sets the value of the pAngVMethode property.
     *
     * @param value allowed object is
     *              {@link PAngVMethode }
     * @see #getPAngVMethode()
     */
    public void setPAngVMethode(PAngVMethode value) {
        this.pAngVMethode = value;
    }

    /**
     * Entnahmeart für die Margenrechnung (Sofortentnahme, Laufende Entnahme, Nominale Entnahme).
     *
     * @return possible object is
     * {@link Entnahmeart }
     */
    public Entnahmeart getBerechnungsartMarge() {
        return berechnungsartMarge;
    }

    /**
     * Sets the value of the berechnungsartMarge property.
     *
     * @param value allowed object is
     *              {@link Entnahmeart }
     * @see #getBerechnungsartMarge()
     */
    public void setBerechnungsartMarge(Entnahmeart value) {
        this.berechnungsartMarge = value;
    }

    /**
     * Art der Durationberechnung (keine, auf Basis Einstand, auf Basis Effektivzins, auf Basis
     * Zinsstruktur).
     *
     * @return possible object is
     * {@link Durationberechnungsart }
     */
    public Durationberechnungsart getDurationberechnungsart() {
        return durationberechnungsart;
    }

    /**
     * Sets the value of the durationberechnungsart property.
     *
     * @param value allowed object is
     *              {@link Durationberechnungsart }
     * @see #getDurationberechnungsart()
     */
    public void setDurationberechnungsart(Durationberechnungsart value) {
        this.durationberechnungsart = value;
    }

    /**
     * Beispiel: Eingabe: auf zwei Nachkommastellen. Folge: Alle Beträge, sowohl in den Eingabe- und
     * Ergebnisdialogen als auch in den Kontoplänen, werden vor dem weiteren Rechnen auf Cent genau
     * gerundet.
     * Eingabe: keine Rundung. Folge: Eine Rundung findet nicht statt. Die Rundungseinstellung greift
     * für Annuitätendarlehen, Tilgungsdarlehen, endfällige Darlehen, Annuitätentilgung und
     * Roll-Over-Darlehen.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRundungBetraege() {
        return rundungBetraege;
    }

    /**
     * Sets the value of the rundungBetraege property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRundungBetraege()
     */
    public void setRundungBetraege(Double value) {
        this.rundungBetraege = value;
    }

    /**
     * Bei Ausgabe von Tilgungsplänen ist es oft sinnvoll, mit glatten Nominalzinsen zu rechnen. Dies
     * gilt insbesondere dann, wenn der Nominalzins vorher berechnet wurde. Sofern ein von null
     * abweichender Wert eingegeben wird, rundet das Programm eingegebene und berechnete Nominalzinsen.
     * Beispiel: Wenn bei Vorgabe des Effektivzinssatzes der Nominalzins gesucht wird, ermittelt das
     * Programm das Ergebnis mit allen Nachkommastellen. Wird auf dieser Basis der Tilgungsplan
     * gedruckt, werden sich Cent-Differenzen im Vergleich zum tatsächlichen Tilgungsplan zeigen, weil
     * in der Praxis der Nominalzins geglättet ist.
     * In der Combobox kann gewählt werden, auf welche Nachkommastelle gerundet werden soll. Beachte:
     * Das Konto geht bei Rundungen unter Umständen nicht mehr genau auf. Es verbleiben
     * Cent-Differenzen. Die Rundungseinstellung greift für Annuitätendarlehen, Tilgungsdarlehen,
     * endfällige Darlehen und Annuitätentilgung.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRundungNominalzinsProzent() {
        return rundungNominalzinsProzent;
    }

    /**
     * Sets the value of the rundungNominalzinsProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRundungNominalzinsProzent()
     */
    public void setRundungNominalzinsProzent(Double value) {
        this.rundungNominalzinsProzent = value;
    }

    /**
     * Teilmarkt der ausgewählten Zinsstruktur der Refinanzierung (gedeckt)
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
     * Risikoloser Teilmarkt der ausgewählten Zinsstruktur zur Berechnung der Liquiditätskosten.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTeilmarktRisikolos() {
        return teilmarktRisikolos;
    }

    /**
     * Sets the value of the teilmarktRisikolos property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTeilmarktRisikolos()
     */
    public void setTeilmarktRisikolos(String value) {
        this.teilmarktRisikolos = value;
    }

    /**
     * Teilweise gedeckte Darlehen - Darlehensart teilweise gedeckt
     * Teilweise gedeckte Darlehen sind Festzinsdarlehen, bei denen der Nominalbetrag teilweise mit
     * Sicherheiten abgedeckt ist. Aus diesem Grund müssen für die Margenrechnung zwei Zinsstrukturen
     * herangezogen werden, eine für den gedeckten Anteil und eine für den ungedeckten Teil.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTeilweiseGedeckt() {
        return teilweiseGedeckt;
    }

    /**
     * Sets the value of the teilweiseGedeckt property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isTeilweiseGedeckt()
     */
    public void setTeilweiseGedeckt(Boolean value) {
        this.teilweiseGedeckt = value;
    }

    /**
     * Name des Teilmarktes für die Basis-Swap-Spreadkurve für Roll-Over im Spread-Verfahren
     *
     * @return possible object is
     * {@link String }
     */
    public String getTeilmarktBasisswapSpread() {
        return teilmarktBasisswapSpread;
    }

    /**
     * Sets the value of the teilmarktBasisswapSpread property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTeilmarktBasisswapSpread()
     */
    public void setTeilmarktBasisswapSpread(String value) {
        this.teilmarktBasisswapSpread = value;
    }

    /**
     * Name des Teilmarktes der Swapkurve für Roll-Over im TZK-Verfahren.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTeilmarktSwap() {
        return teilmarktSwap;
    }

    /**
     * Sets the value of the teilmarktSwap property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTeilmarktSwap()
     */
    public void setTeilmarktSwap(String value) {
        this.teilmarktSwap = value;
    }

    /**
     * Datenbank ID der verwendeten Zinsstruktur. Falls eingegeben, wird die Zinsstruktur anhand der ID
     * übernommen,
     * sonst wird die neueste Zinsstruktur anhand Kalkulationsdatum, Währung und Teilmarkt übernommen.
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
     * Kommentar der verwendeten Zinsstruktur.
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
     * Kalkulationsdatum der ausgewählten Zinsstruktur des gedeckten Teils bei Darlehensart Teilweise
     * gedeckt.
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
     * Teilmarkt der ausgewählten Zinsstruktur für den ungedeckten Anteil vom Nominalbetrag
     * Datenbank ID (MARZIPAN) der verwendeten Zinsstruktur für den ungedeckten Teil des Kredits
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getZinsstrUngedecktID() {
        return zinsstrUngedecktID;
    }

    /**
     * Sets the value of the zinsstrUngedecktID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getZinsstrUngedecktID()
     */
    public void setZinsstrUngedecktID(Integer value) {
        this.zinsstrUngedecktID = value;
    }

    /**
     * Kommentar der verwendeten Zinsstruktur für den ungedeckten Teil des Kredits
     *
     * @return possible object is
     * {@link String }
     */
    public String getZinsstrUngedecktKommentar() {
        return zinsstrUngedecktKommentar;
    }

    /**
     * Sets the value of the zinsstrUngedecktKommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getZinsstrUngedecktKommentar()
     */
    public void setZinsstrUngedecktKommentar(String value) {
        this.zinsstrUngedecktKommentar = value;
    }

    /**
     * Datenbank ID der verwendeten risikolosen Zinsstruktur
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getZinsstrRisikolosID() {
        return zinsstrRisikolosID;
    }

    /**
     * Sets the value of the zinsstrRisikolosID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getZinsstrRisikolosID()
     */
    public void setZinsstrRisikolosID(Integer value) {
        this.zinsstrRisikolosID = value;
    }

    /**
     * Kommentar der verwendeten risikolosen Zinsstruktur
     *
     * @return possible object is
     * {@link String }
     */
    public String getZinsstrRisikolosKommentar() {
        return zinsstrRisikolosKommentar;
    }

    /**
     * Sets the value of the zinsstrRisikolosKommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getZinsstrRisikolosKommentar()
     */
    public void setZinsstrRisikolosKommentar(String value) {
        this.zinsstrRisikolosKommentar = value;
    }

    /**
     * Datenbank ID der verwendeten Kreditrisiko-Zinsstruktur
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getZinsstrKreditRisikoID() {
        return zinsstrKreditRisikoID;
    }

    /**
     * Sets the value of the zinsstrKreditRisikoID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getZinsstrKreditRisikoID()
     */
    public void setZinsstrKreditRisikoID(Integer value) {
        this.zinsstrKreditRisikoID = value;
    }

    /**
     * Kommentar der verwendeten Refinanzierungszinsstruktur.
     *
     * @return possible object is
     * {@link String }
     */
    public String getZinsstrKreditRisikoKommentar() {
        return zinsstrKreditRisikoKommentar;
    }

    /**
     * Sets the value of the zinsstrKreditRisikoKommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getZinsstrKreditRisikoKommentar()
     */
    public void setZinsstrKreditRisikoKommentar(String value) {
        this.zinsstrKreditRisikoKommentar = value;
    }

    /**
     * Datenbank ID der verwendeten Basis Swap Spread Zinsstruktur. Falls eingegeben, wird die
     * Zinsstruktur anhand der ID übernommen, sonst wird die neueste Zinsstruktur anhand
     * Kalkulationsdatum, Währung und Teilmarkt übernommen.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getZinsstrBasisswapSpreadID() {
        return zinsstrBasisswapSpreadID;
    }

    /**
     * Sets the value of the zinsstrBasisswapSpreadID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getZinsstrBasisswapSpreadID()
     */
    public void setZinsstrBasisswapSpreadID(Integer value) {
        this.zinsstrBasisswapSpreadID = value;
    }

    /**
     * Kalkulationsdatum der Basis Swap Spreadstruktur.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getKalkulationsdatumBasisswapSpreadZinsstruktur() {
        return kalkulationsdatumBasisswapSpreadZinsstruktur;
    }

    /**
     * Sets the value of the kalkulationsdatumBasisswapSpreadZinsstruktur property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getKalkulationsdatumBasisswapSpreadZinsstruktur()
     */
    public void setKalkulationsdatumBasisswapSpreadZinsstruktur(XMLGregorianCalendar value) {
        this.kalkulationsdatumBasisswapSpreadZinsstruktur = value;
    }

    /**
     * Kommentar der verwendeten Basis Swap Spreadstruktur
     *
     * @return possible object is
     * {@link String }
     */
    public String getZinsstrBasisswapSpreadKommentar() {
        return zinsstrBasisswapSpreadKommentar;
    }

    /**
     * Sets the value of the zinsstrBasisswapSpreadKommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getZinsstrBasisswapSpreadKommentar()
     */
    public void setZinsstrBasisswapSpreadKommentar(String value) {
        this.zinsstrBasisswapSpreadKommentar = value;
    }

    /**
     * Datenbank ID der verwendeten Swap-Zinsstruktur im TZK-Verfahren. Falls eingegeben, wird die
     * Zinsstruktur anhand der ID übernommen, sonst wird die neueste Zinsstruktur anhand
     * Kalkulationsdatum, Währung und Teilmarkt übernommen.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getZinsstrSwapID() {
        return zinsstrSwapID;
    }

    /**
     * Sets the value of the zinsstrSwapID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getZinsstrSwapID()
     */
    public void setZinsstrSwapID(Integer value) {
        this.zinsstrSwapID = value;
    }

    /**
     * Kalkulationsdatum der verwendeten Swap-Zinsstruktur im TZK-Verfahren.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getKalkulationsdatumSwapZinsstruktur() {
        return kalkulationsdatumSwapZinsstruktur;
    }

    /**
     * Sets the value of the kalkulationsdatumSwapZinsstruktur property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getKalkulationsdatumSwapZinsstruktur()
     */
    public void setKalkulationsdatumSwapZinsstruktur(XMLGregorianCalendar value) {
        this.kalkulationsdatumSwapZinsstruktur = value;
    }

    /**
     * Kommentar der verwendeten Swap-Zinsstruktur im TZK-Verfahren.
     *
     * @return possible object is
     * {@link String }
     */
    public String getZinsstrSwapKommentar() {
        return zinsstrSwapKommentar;
    }

    /**
     * Sets the value of the zinsstrSwapKommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getZinsstrSwapKommentar()
     */
    public void setZinsstrSwapKommentar(String value) {
        this.zinsstrSwapKommentar = value;
    }

    /**
     * Berechnung mit oder ohne Liquiditätskosten
     *
     * @return possible object is
     * {@link MitLiquikosten }
     */
    public MitLiquikosten getMitLiquikosten() {
        return mitLiquikosten;
    }

    /**
     * Sets the value of the mitLiquikosten property.
     *
     * @param value allowed object is
     *              {@link MitLiquikosten }
     * @see #getMitLiquikosten()
     */
    public void setMitLiquikosten(MitLiquikosten value) {
        this.mitLiquikosten = value;
    }

    /**
     * Auswahl der Zinsstruktur gemäß Uhrzeit.
     * Das Element ist ein reines Ausgabefeld. Beim Import wird dieses Element ignoriert.
     *
     * @return possible object is
     * {@link ZinsstrukturUhrzeitAuswahlModus }
     */
    public ZinsstrukturUhrzeitAuswahlModus getZinsstrukturUhrzeitAuswahlModus() {
        return zinsstrukturUhrzeitAuswahlModus;
    }

    /**
     * Sets the value of the zinsstrukturUhrzeitAuswahlModus property.
     *
     * @param value allowed object is
     *              {@link ZinsstrukturUhrzeitAuswahlModus }
     * @see #getZinsstrukturUhrzeitAuswahlModus()
     */
    public void setZinsstrukturUhrzeitAuswahlModus(ZinsstrukturUhrzeitAuswahlModus value) {
        this.zinsstrukturUhrzeitAuswahlModus = value;
    }

    /**
     * Aufschlag auf die Basiskurve.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAufschlagBasiskurve() {
        return aufschlagBasiskurve;
    }

    /**
     * Sets the value of the aufschlagBasiskurve property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAufschlagBasiskurve()
     */
    public void setAufschlagBasiskurve(Double value) {
        this.aufschlagBasiskurve = value;
    }

    /**
     * Ftpc Spreads
     *
     * @return possible object is
     * {@link FtpcSpreads }
     */
    public FtpcSpreads getFtpcSpreads() {
        return ftpcSpreads;
    }

    /**
     * Sets the value of the ftpcSpreads property.
     *
     * @param value allowed object is
     *              {@link FtpcSpreads }
     * @see #getFtpcSpreads()
     */
    public void setFtpcSpreads(FtpcSpreads value) {
        this.ftpcSpreads = value;
    }

}
