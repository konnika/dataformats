
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigInteger;


/**
 * Enthält Berechnungsergebnisse
 *
 * <p>Java class for Kalkulation complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Kalkulation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="anzahlTilgungsanrechnungen" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         <element name="anzahlZinstermine" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         <element name="effektivzins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="effzinsAibdZibi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="effzinsAibdLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="effektivzinsPAngV" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="einstandZibi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="einstandLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margeProzZibi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margeNominal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margenbarwertZibi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nettomargeProzZibi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nettomargenbarwertZibi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nettomargeProzErsterZeitabschnitt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nettomargenbarwertErsterZeitabschnitt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margeProzLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margenbarwertLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nettomargeProzLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nettomargenbarwertLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="duration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="modifiedDuration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="convexity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="pvbpZibi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="pvbpLiqui" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="produktName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="spreadAbweichendeKontofuehrung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="einstandssatzTreasury" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="aufschlagIntern" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquiditaetsDifferenz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="restschuldTagesaktuell" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinssaldoTagesaktuell" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeZinsen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeTilgungen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="institutsdaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Institutsdaten" minOccurs="0"/>
 *         <element name="kundendaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Kundendaten" minOccurs="0"/>
 *         <element name="druckdaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Druckdaten" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kalkulation", propOrder = {

})
public class Kalkulation {

    /**
     * Anzahl der Tilgungsanrechnungen für Darlehen
     */
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger anzahlTilgungsanrechnungen;
    /**
     * Anzahl der Zinstermine fuer für Darlehen
     */
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger anzahlZinstermine;
    /**
     * Der berechnete Effektivzins entsprechend der eingestellten Effektivzinsmethode.
     * Bei einem RollOver enthält dieses Element den Effektivzins bis zum nächsten Zinsbindungsende.
     */
    protected Double effektivzins;
    /**
     * Effektivzins nach der AIBD Effektivzinsmethode bis Zinsbindungsende.
     */
    protected Double effzinsAibdZibi;
    /**
     * Effektivzins nach der AIBD Effektivzinsmethode bis Liquiditätsbindungsende.
     */
    protected Double effzinsAibdLiqui;
    /**
     * Effektivzins PAngV auf 2 Nachkommastellen gerundet bei Effektivzinsmethode PAngV. Mit anderer
     * Effektivzinsmethode erfolgt keine Ausgabe.
     * Bei einem RollOver enthält dieses Element den Effektivzins bis zum nächsten Zinsbindungsende.
     */
    protected Double effektivzinsPAngV;
    /**
     * Effektivzins (nach ICMA) der Refinanzierung bis Zinsbindungsende.
     */
    protected Double einstandZibi;
    /**
     * Effektivzins (nach ICMA) der Refinanzierung bis Liquiditätsbindungsende
     */
    protected Double einstandLiqui;
    /**
     * Marge in % bis Zinsbindungsende
     */
    protected Double margeProzZibi;
    /**
     * Marge % im nominalen Kreis
     */
    protected Double margeNominal;
    /**
     * Margenbarwert bis Zinsbindungsende
     */
    protected Double margenbarwertZibi;
    /**
     * Die prozentuale Nettomarge berechnet sich aus der prozentualen Marge, indem die Kosten aus dem
     * Deckungsbeitrag berücksichtigt werden.
     */
    protected Double nettomargeProzZibi;
    /**
     * Der Nettomargenbarwert berechnet sich aus dem Margenbarwert, indem die Kosten aus dem
     * Deckungsbeitrag berücksichtigt werden.
     */
    protected Double nettomargenbarwertZibi;
    /**
     * Die prozentuale Nettomarge des im Deckungsbeitragsschema definierten ersten Zeitabschnitts.
     */
    protected Double nettomargeProzErsterZeitabschnitt;
    /**
     * Der Nettomargenbarwert des im Deckungsbeitragsschema definierten ersten Zeitabschnitts.
     */
    protected Double nettomargenbarwertErsterZeitabschnitt;
    /**
     * Es handelt sich um die effektive Bruttomarge. Sie errechnet sich durch Differenzbildung:
     * Effektivzins minus Einstand. Der zugrunde gelegte Zahlungsstrom ist der Pricing Cash Flow, also
     * der Zahlungsstrom, welcher mit den kalkulierten Forward-Zinssätzen der risikobehafteten
     * Zinsstruktur erhöht um den Aufschlag ermittelt wurde. Die Refinanzierung erfolgt mit der
     * risikobehafteten Zinsstruktur.
     */
    protected Double margeProzLiqui;
    /**
     * Margenbarwert bis Liquiditätsbindungsende.
     */
    protected Double margenbarwertLiqui;
    /**
     * Die prozentuale Nettomarge berechnet sich aus der prozentualen Marge unter
     * Berücksichtigung der Kosten aus dem Deckungsbeitrag.
     */
    protected Double nettomargeProzLiqui;
    /**
     * Der Nettomargenbarwert berechnet sich aus dem Margenbarwert unter Berücksichtigung
     * der Kosten aus dem Deckungsbeitrag.
     */
    protected Double nettomargenbarwertLiqui;
    /**
     * Die Duration ist ein Maß für das Risiko. Ein Wertpapier mit der Duration d verhält
     * sich gegenüber Parallelverschiebungen der Zinsstruktur genauso wie ein Zerobond mit der Laufzeit
     * d. Die Duration gibt an, wann die Hälfte des zeitgewichteten Barwerts des im Wertpapier
     * gebundenen Kapitals zurückgeflossen ist. Sie ist also ein Maß für die Kapitalbindung.
     */
    protected Double duration;
    /**
     * Die Modified Duration gibt an, um wie viel Prozent sich der Kurswert ändert, wenn
     * sich der Zins um einen Prozentpunkt ändert. Je nach Einstellung der Art der Durationsberechnung
     * ist die Rendite in obiger Formel der Effektivzins des Geschäfts beziehungsweise der
     * Einstandssatz des Geschäfts.
     */
    protected Double modifiedDuration;
    /**
     * Mathematisches Maß, mit dem die Sensitivität eines Anleihekurses hinsichtlich der
     * Zinssätze gemessen wird. Eine hohe Konvexität weist darauf hin, dass der Kurs der Anleihe
     * stärker auf Veränderungen des Zinssatzes reagiert.
     */
    protected Double convexity;
    /**
     * PVBP - Price Value of a Basis Point bis Zinsbindungsende.
     */
    protected Double pvbpZibi;
    /**
     * PVBP - Price Value of a Basis Point bis Liquiditätsbindungsende.
     */
    protected Double pvbpLiqui;
    /**
     * Produktname in Marzipan Web
     */
    protected String produktName;
    /**
     * Nominaler Spread in der Margenrechnung bei von Zinsrhythmus abweichendem Referenzzinsrhythmus in
     * %.
     * Bei Terminzinskurvenverfahren: Spread abweichende Zinszahlung
     */
    protected Double spreadAbweichendeKontofuehrung;
    /**
     * Nominaler Einstandssatz in % für den Nominalzins (Aufschlag intern plus Referenzins).
     */
    protected Double einstandssatzTreasury;
    /**
     * Nominaler Einstandssatz in % für den externen Aufschlag auf den Referenzzins.
     * Bei Terminzinskurvenverfahren: Mindestaufschlag in %
     */
    protected Double aufschlagIntern;
    /**
     * Barwertige Größe zur Berücksichtigung von vorgegebenen Liquiditätskosten und iOPC-Kennzahlen in
     * der Margenrechnung.
     * WIRD AKTUELL NOCH NICHT IN MARZIPAN WEB UNTERSTÜTZT.
     */
    protected Double liquiditaetsDifferenz;
    /**
     * Restschuld zu einem bestimmten Stichtag.
     */
    protected Double restschuldTagesaktuell;
    /**
     * Zinssaldo zu einem bestimmten Stichtag.
     */
    protected Double zinssaldoTagesaktuell;
    /**
     * Summe aller Zinsen bis Zinsbindungsende.
     */
    protected Double summeZinsen;
    /**
     * Summe aller Tilgungen bis Zinsbindungsende.
     */
    protected Double summeTilgungen;
    /**
     * Institutsbezogene Daten zum Geschäft
     */
    protected Institutsdaten institutsdaten;
    /**
     * Name und Adresse des Kunden (Darlehensnehmer)
     */
    protected Kundendaten kundendaten;
    /**
     * Druckdaten zu einem Geschäft.
     */
    protected Druckdaten druckdaten;

    /**
     * Anzahl der Tilgungsanrechnungen für Darlehen
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getAnzahlTilgungsanrechnungen() {
        return anzahlTilgungsanrechnungen;
    }

    /**
     * Sets the value of the anzahlTilgungsanrechnungen property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getAnzahlTilgungsanrechnungen()
     */
    public void setAnzahlTilgungsanrechnungen(BigInteger value) {
        this.anzahlTilgungsanrechnungen = value;
    }

    /**
     * Anzahl der Zinstermine fuer für Darlehen
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getAnzahlZinstermine() {
        return anzahlZinstermine;
    }

    /**
     * Sets the value of the anzahlZinstermine property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getAnzahlZinstermine()
     */
    public void setAnzahlZinstermine(BigInteger value) {
        this.anzahlZinstermine = value;
    }

    /**
     * Der berechnete Effektivzins entsprechend der eingestellten Effektivzinsmethode.
     * Bei einem RollOver enthält dieses Element den Effektivzins bis zum nächsten Zinsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEffektivzins() {
        return effektivzins;
    }

    /**
     * Sets the value of the effektivzins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEffektivzins()
     */
    public void setEffektivzins(Double value) {
        this.effektivzins = value;
    }

    /**
     * Effektivzins nach der AIBD Effektivzinsmethode bis Zinsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEffzinsAibdZibi() {
        return effzinsAibdZibi;
    }

    /**
     * Sets the value of the effzinsAibdZibi property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEffzinsAibdZibi()
     */
    public void setEffzinsAibdZibi(Double value) {
        this.effzinsAibdZibi = value;
    }

    /**
     * Effektivzins nach der AIBD Effektivzinsmethode bis Liquiditätsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEffzinsAibdLiqui() {
        return effzinsAibdLiqui;
    }

    /**
     * Sets the value of the effzinsAibdLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEffzinsAibdLiqui()
     */
    public void setEffzinsAibdLiqui(Double value) {
        this.effzinsAibdLiqui = value;
    }

    /**
     * Effektivzins PAngV auf 2 Nachkommastellen gerundet bei Effektivzinsmethode PAngV. Mit anderer
     * Effektivzinsmethode erfolgt keine Ausgabe.
     * Bei einem RollOver enthält dieses Element den Effektivzins bis zum nächsten Zinsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEffektivzinsPAngV() {
        return effektivzinsPAngV;
    }

    /**
     * Sets the value of the effektivzinsPAngV property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEffektivzinsPAngV()
     */
    public void setEffektivzinsPAngV(Double value) {
        this.effektivzinsPAngV = value;
    }

    /**
     * Effektivzins (nach ICMA) der Refinanzierung bis Zinsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEinstandZibi() {
        return einstandZibi;
    }

    /**
     * Sets the value of the einstandZibi property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEinstandZibi()
     */
    public void setEinstandZibi(Double value) {
        this.einstandZibi = value;
    }

    /**
     * Effektivzins (nach ICMA) der Refinanzierung bis Liquiditätsbindungsende
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEinstandLiqui() {
        return einstandLiqui;
    }

    /**
     * Sets the value of the einstandLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEinstandLiqui()
     */
    public void setEinstandLiqui(Double value) {
        this.einstandLiqui = value;
    }

    /**
     * Marge in % bis Zinsbindungsende
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargeProzZibi() {
        return margeProzZibi;
    }

    /**
     * Sets the value of the margeProzZibi property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargeProzZibi()
     */
    public void setMargeProzZibi(Double value) {
        this.margeProzZibi = value;
    }

    /**
     * Marge % im nominalen Kreis
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargeNominal() {
        return margeNominal;
    }

    /**
     * Sets the value of the margeNominal property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargeNominal()
     */
    public void setMargeNominal(Double value) {
        this.margeNominal = value;
    }

    /**
     * Margenbarwert bis Zinsbindungsende
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargenbarwertZibi() {
        return margenbarwertZibi;
    }

    /**
     * Sets the value of the margenbarwertZibi property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargenbarwertZibi()
     */
    public void setMargenbarwertZibi(Double value) {
        this.margenbarwertZibi = value;
    }

    /**
     * Die prozentuale Nettomarge berechnet sich aus der prozentualen Marge, indem die Kosten aus dem
     * Deckungsbeitrag berücksichtigt werden.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNettomargeProzZibi() {
        return nettomargeProzZibi;
    }

    /**
     * Sets the value of the nettomargeProzZibi property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNettomargeProzZibi()
     */
    public void setNettomargeProzZibi(Double value) {
        this.nettomargeProzZibi = value;
    }

    /**
     * Der Nettomargenbarwert berechnet sich aus dem Margenbarwert, indem die Kosten aus dem
     * Deckungsbeitrag berücksichtigt werden.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNettomargenbarwertZibi() {
        return nettomargenbarwertZibi;
    }

    /**
     * Sets the value of the nettomargenbarwertZibi property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNettomargenbarwertZibi()
     */
    public void setNettomargenbarwertZibi(Double value) {
        this.nettomargenbarwertZibi = value;
    }

    /**
     * Die prozentuale Nettomarge des im Deckungsbeitragsschema definierten ersten Zeitabschnitts.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNettomargeProzErsterZeitabschnitt() {
        return nettomargeProzErsterZeitabschnitt;
    }

    /**
     * Sets the value of the nettomargeProzErsterZeitabschnitt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNettomargeProzErsterZeitabschnitt()
     */
    public void setNettomargeProzErsterZeitabschnitt(Double value) {
        this.nettomargeProzErsterZeitabschnitt = value;
    }

    /**
     * Der Nettomargenbarwert des im Deckungsbeitragsschema definierten ersten Zeitabschnitts.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNettomargenbarwertErsterZeitabschnitt() {
        return nettomargenbarwertErsterZeitabschnitt;
    }

    /**
     * Sets the value of the nettomargenbarwertErsterZeitabschnitt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNettomargenbarwertErsterZeitabschnitt()
     */
    public void setNettomargenbarwertErsterZeitabschnitt(Double value) {
        this.nettomargenbarwertErsterZeitabschnitt = value;
    }

    /**
     * Es handelt sich um die effektive Bruttomarge. Sie errechnet sich durch Differenzbildung:
     * Effektivzins minus Einstand. Der zugrunde gelegte Zahlungsstrom ist der Pricing Cash Flow, also
     * der Zahlungsstrom, welcher mit den kalkulierten Forward-Zinssätzen der risikobehafteten
     * Zinsstruktur erhöht um den Aufschlag ermittelt wurde. Die Refinanzierung erfolgt mit der
     * risikobehafteten Zinsstruktur.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargeProzLiqui() {
        return margeProzLiqui;
    }

    /**
     * Sets the value of the margeProzLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargeProzLiqui()
     */
    public void setMargeProzLiqui(Double value) {
        this.margeProzLiqui = value;
    }

    /**
     * Margenbarwert bis Liquiditätsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargenbarwertLiqui() {
        return margenbarwertLiqui;
    }

    /**
     * Sets the value of the margenbarwertLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargenbarwertLiqui()
     */
    public void setMargenbarwertLiqui(Double value) {
        this.margenbarwertLiqui = value;
    }

    /**
     * Die prozentuale Nettomarge berechnet sich aus der prozentualen Marge unter
     * Berücksichtigung der Kosten aus dem Deckungsbeitrag.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNettomargeProzLiqui() {
        return nettomargeProzLiqui;
    }

    /**
     * Sets the value of the nettomargeProzLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNettomargeProzLiqui()
     */
    public void setNettomargeProzLiqui(Double value) {
        this.nettomargeProzLiqui = value;
    }

    /**
     * Der Nettomargenbarwert berechnet sich aus dem Margenbarwert unter Berücksichtigung
     * der Kosten aus dem Deckungsbeitrag.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNettomargenbarwertLiqui() {
        return nettomargenbarwertLiqui;
    }

    /**
     * Sets the value of the nettomargenbarwertLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNettomargenbarwertLiqui()
     */
    public void setNettomargenbarwertLiqui(Double value) {
        this.nettomargenbarwertLiqui = value;
    }

    /**
     * Die Duration ist ein Maß für das Risiko. Ein Wertpapier mit der Duration d verhält
     * sich gegenüber Parallelverschiebungen der Zinsstruktur genauso wie ein Zerobond mit der Laufzeit
     * d. Die Duration gibt an, wann die Hälfte des zeitgewichteten Barwerts des im Wertpapier
     * gebundenen Kapitals zurückgeflossen ist. Sie ist also ein Maß für die Kapitalbindung.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDuration()
     */
    public void setDuration(Double value) {
        this.duration = value;
    }

    /**
     * Die Modified Duration gibt an, um wie viel Prozent sich der Kurswert ändert, wenn
     * sich der Zins um einen Prozentpunkt ändert. Je nach Einstellung der Art der Durationsberechnung
     * ist die Rendite in obiger Formel der Effektivzins des Geschäfts beziehungsweise der
     * Einstandssatz des Geschäfts.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getModifiedDuration() {
        return modifiedDuration;
    }

    /**
     * Sets the value of the modifiedDuration property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getModifiedDuration()
     */
    public void setModifiedDuration(Double value) {
        this.modifiedDuration = value;
    }

    /**
     * Mathematisches Maß, mit dem die Sensitivität eines Anleihekurses hinsichtlich der
     * Zinssätze gemessen wird. Eine hohe Konvexität weist darauf hin, dass der Kurs der Anleihe
     * stärker auf Veränderungen des Zinssatzes reagiert.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getConvexity() {
        return convexity;
    }

    /**
     * Sets the value of the convexity property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getConvexity()
     */
    public void setConvexity(Double value) {
        this.convexity = value;
    }

    /**
     * PVBP - Price Value of a Basis Point bis Zinsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getPvbpZibi() {
        return pvbpZibi;
    }

    /**
     * Sets the value of the pvbpZibi property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getPvbpZibi()
     */
    public void setPvbpZibi(Double value) {
        this.pvbpZibi = value;
    }

    /**
     * PVBP - Price Value of a Basis Point bis Liquiditätsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getPvbpLiqui() {
        return pvbpLiqui;
    }

    /**
     * Sets the value of the pvbpLiqui property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getPvbpLiqui()
     */
    public void setPvbpLiqui(Double value) {
        this.pvbpLiqui = value;
    }

    /**
     * Produktname in Marzipan Web
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
     * Nominaler Spread in der Margenrechnung bei von Zinsrhythmus abweichendem Referenzzinsrhythmus in
     * %.
     * Bei Terminzinskurvenverfahren: Spread abweichende Zinszahlung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSpreadAbweichendeKontofuehrung() {
        return spreadAbweichendeKontofuehrung;
    }

    /**
     * Sets the value of the spreadAbweichendeKontofuehrung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSpreadAbweichendeKontofuehrung()
     */
    public void setSpreadAbweichendeKontofuehrung(Double value) {
        this.spreadAbweichendeKontofuehrung = value;
    }

    /**
     * Nominaler Einstandssatz in % für den Nominalzins (Aufschlag intern plus Referenzins).
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEinstandssatzTreasury() {
        return einstandssatzTreasury;
    }

    /**
     * Sets the value of the einstandssatzTreasury property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEinstandssatzTreasury()
     */
    public void setEinstandssatzTreasury(Double value) {
        this.einstandssatzTreasury = value;
    }

    /**
     * Nominaler Einstandssatz in % für den externen Aufschlag auf den Referenzzins.
     * Bei Terminzinskurvenverfahren: Mindestaufschlag in %
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAufschlagIntern() {
        return aufschlagIntern;
    }

    /**
     * Sets the value of the aufschlagIntern property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAufschlagIntern()
     */
    public void setAufschlagIntern(Double value) {
        this.aufschlagIntern = value;
    }

    /**
     * Barwertige Größe zur Berücksichtigung von vorgegebenen Liquiditätskosten und iOPC-Kennzahlen in
     * der Margenrechnung.
     * WIRD AKTUELL NOCH NICHT IN MARZIPAN WEB UNTERSTÜTZT.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLiquiditaetsDifferenz() {
        return liquiditaetsDifferenz;
    }

    /**
     * Sets the value of the liquiditaetsDifferenz property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLiquiditaetsDifferenz()
     */
    public void setLiquiditaetsDifferenz(Double value) {
        this.liquiditaetsDifferenz = value;
    }

    /**
     * Restschuld zu einem bestimmten Stichtag.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRestschuldTagesaktuell() {
        return restschuldTagesaktuell;
    }

    /**
     * Sets the value of the restschuldTagesaktuell property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRestschuldTagesaktuell()
     */
    public void setRestschuldTagesaktuell(Double value) {
        this.restschuldTagesaktuell = value;
    }

    /**
     * Zinssaldo zu einem bestimmten Stichtag.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinssaldoTagesaktuell() {
        return zinssaldoTagesaktuell;
    }

    /**
     * Sets the value of the zinssaldoTagesaktuell property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinssaldoTagesaktuell()
     */
    public void setZinssaldoTagesaktuell(Double value) {
        this.zinssaldoTagesaktuell = value;
    }

    /**
     * Summe aller Zinsen bis Zinsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeZinsen() {
        return summeZinsen;
    }

    /**
     * Sets the value of the summeZinsen property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeZinsen()
     */
    public void setSummeZinsen(Double value) {
        this.summeZinsen = value;
    }

    /**
     * Summe aller Tilgungen bis Zinsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeTilgungen() {
        return summeTilgungen;
    }

    /**
     * Sets the value of the summeTilgungen property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeTilgungen()
     */
    public void setSummeTilgungen(Double value) {
        this.summeTilgungen = value;
    }

    /**
     * Institutsbezogene Daten zum Geschäft
     *
     * @return possible object is
     * {@link Institutsdaten }
     */
    public Institutsdaten getInstitutsdaten() {
        return institutsdaten;
    }

    /**
     * Sets the value of the institutsdaten property.
     *
     * @param value allowed object is
     *              {@link Institutsdaten }
     * @see #getInstitutsdaten()
     */
    public void setInstitutsdaten(Institutsdaten value) {
        this.institutsdaten = value;
    }

    /**
     * Name und Adresse des Kunden (Darlehensnehmer)
     *
     * @return possible object is
     * {@link Kundendaten }
     */
    public Kundendaten getKundendaten() {
        return kundendaten;
    }

    /**
     * Sets the value of the kundendaten property.
     *
     * @param value allowed object is
     *              {@link Kundendaten }
     * @see #getKundendaten()
     */
    public void setKundendaten(Kundendaten value) {
        this.kundendaten = value;
    }

    /**
     * Druckdaten zu einem Geschäft.
     *
     * @return possible object is
     * {@link Druckdaten }
     */
    public Druckdaten getDruckdaten() {
        return druckdaten;
    }

    /**
     * Sets the value of the druckdaten property.
     *
     * @param value allowed object is
     *              {@link Druckdaten }
     * @see #getDruckdaten()
     */
    public void setDruckdaten(Druckdaten value) {
        this.druckdaten = value;
    }

}
