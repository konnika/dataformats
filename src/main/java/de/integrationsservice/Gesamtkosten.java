
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * Der globale komplexe Typ Gesamtkosten: Die Gesamtkosten beziehen sich auf eine hypothetische Laufzeit
 * bis zur vollständigen Tilgung des Darlehens.
 *
 * <p>Java class for Gesamtkosten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Gesamtkosten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="ablaufdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ablaufdatumUltimo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="abschlussProvBSV" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="anzahlBeitraegeBSV" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         <element name="anzahlBeitraegeLV" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         <element name="anzahlRatenGesamt" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         <element name="barAuslagen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="datumLetzteRate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="gesBetrZahlng" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="gesamtkostenvariante" type="{http://www.gillardon.de/marzipan/integrationsservice}Gesamtkostenvariante" minOccurs="0"/>
 *         <element name="hoeheBeitraegeBSV" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="hoeheBeitraegeLV" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="hoeheLetzteRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinsenkapitalisieren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="laufzeitGesamt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nebenLeistung1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nebenLeistung2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nettoKreditBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nomZinsFolgedarl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ratenhoeheFolgedarl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="restkreditVers" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sonstigeKosten" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sumBereitstelZinsGes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sumBezZinsenNeugesch" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sumKtoFuerngsGebGes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sumKtofuerngsGebFolgDarl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sumSonstZahlng" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sumTilgFolgDarl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sumTilgGes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sumZahlngFolgDarl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sumZahlngGesamt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sumZahlngNeuGesch" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sumZinsenNeugesch" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeZinsenGesamt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="tilgungFolgedarl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="unbezZnsNeuGesch" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="weitereKosten1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="weitereKosten2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="wertErmittlungsKost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zahlungswBeitrBSV" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *         <element name="zahlungswBeitrLV" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gesamtkosten", propOrder = {

})
public class Gesamtkosten {

    /**
     * Die Gesamtkosten werden bis zu diesem Datum bestimmt.
     * Nur für Gesamtbetrag aller Zahlungen bis vereinbartes Laufzeitende relevant
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ablaufdatum;
    /**
     * Ultimokennzeichen für das vereinbarte Laufzeitende
     */
    protected Boolean ablaufdatumUltimo;
    /**
     * Zu zahlende Abschlussprovision für den Bausparvertrag
     */
    protected Double abschlussProvBSV;
    /**
     * Anzahl der Beiträge für den Bausparvertrag
     */
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger anzahlBeitraegeBSV;
    /**
     * Anzahl der Beiträge für eine bestehende Lebensversicherung
     */
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger anzahlBeitraegeLV;
    /**
     * Gesamtanzahl der Raten bis zur vollständigen Tilgung des Darlehens. Bei endfälligen Darlehen
     * wird hier die Anzahl der Zinszahlungen innerhalb der Gesamtlaufzeit ausgegeben.
     */
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger anzahlRatenGesamt;
    /**
     * Entstandene Barauslagen
     */
    protected Double barAuslagen;
    /**
     * Datum letzte Rate am Ende der Gesamtlaufzeit
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumLetzteRate;
    /**
     * Gesamtbetrag aller durch das Darlehen entstandenen Kosten
     */
    protected Double gesBetrZahlng;
    /**
     * Die Gesamtkosten können auf 3 verschiedene Arten bestimmt werden:
     * bis Zinsbindungsende, bis zur vollständigen Tilgung oder bis zu einem vorgegebenen Ablaufdatum.
     * siehe Struktur Gesamtkostenvariante
     */
    @XmlSchemaType(name = "string")
    protected Gesamtkostenvariante gesamtkostenvariante;
    /**
     * Höhe der Beiträge für den Bausparvertrag
     */
    protected Double hoeheBeitraegeBSV;
    /**
     * Höhe der laufenden Lebensversicherungsbeiträge
     */
    protected Double hoeheBeitraegeLV;
    /**
     * Höhe letzte Rate am Ende der Gesamtlaufzeit
     */
    protected Double hoeheLetzteRate;
    /**
     * Um die Gesamtkosten berechnen zu können, wird mit einem Folgedarlehen prolongiert. Hier kann nun
     * entschieden werden, ob die bestehende Kontoführung beibehalten wird bis das Darlehen vollständig
     * getilgt ist oder ob das Konto abgeschlossen wird und die Prolongation über ein neues Konto
     * erfolgt.
     */
    protected Boolean zinsenkapitalisieren;
    /**
     * Gesamtlaufzeit des Darlehens, bis es vollständig getilgt ist.
     */
    protected Double laufzeitGesamt;
    /**
     * Weitere Kosten, die indirekt im Zusammenhang mit dem Kredit stehen.
     */
    protected Double nebenLeistung1;
    /**
     * Weitere Kosten, die indirekt im Zusammenhang mit dem Kredit stehen.
     */
    protected Double nebenLeistung2;
    /**
     * Tatsächlich zur Verfügung stehender Betrag nach Abzug aller Kosten, auch abzüglich der Kosten
     * die nicht verpflichtend und infolge dessen nicht effektivzinswirksam sind.
     */
    protected Double nettoKreditBetrag;
    /**
     * Hier kann der Nominalzins des Folgedarlehens angegeben werden, wenn dieser vom bisherigem
     * abweichen soll.
     */
    protected Double nomZinsFolgedarl;
    /**
     * Hier kann die Ratenhöhe des Folgedarlehens angegeben werden, wenn diese von der bisherigen
     * abweichen soll.
     */
    protected Double ratenhoeheFolgedarl;
    /**
     * Höhe einer nicht verpflichtend abgeschlossenen  Restkreditversicherung
     */
    protected Double restkreditVers;
    /**
     * Sonstige Kosten
     */
    protected Double sonstigeKosten;
    /**
     * Die Summe der angefallenen Bereitstellungszinsen beim Neugeschäft und des Folgedarlehens
     */
    protected Double sumBereitstelZinsGes;
    /**
     * Die Summe der angefallenen Bereitstellungszinsen beim Neugeschäft
     */
    protected Double sumBezZinsenNeugesch;
    /**
     * Die Summe von dem Kontoauszugspreis des Neugeschäfts und des Folgedarlehens
     */
    protected Double sumKtoFuerngsGebGes;
    /**
     * Kontoauszugspreis des Folgedarlehens
     */
    protected Double sumKtofuerngsGebFolgDarl;
    /**
     * Die Summe aller Zahlungen, die in der Maske Weitere Kosten eingegeben werden können.
     */
    protected Double sumSonstZahlng;
    /**
     * Tilgungen des Folgedarlehens
     */
    protected Double sumTilgFolgDarl;
    /**
     * Die Summe von den Tilgungen des Neugeschäfts und des Folgedarlehens
     */
    protected Double sumTilgGes;
    /**
     * Zahlungen des Folgedarlehens
     */
    protected Double sumZahlngFolgDarl;
    /**
     * Die Summe von den Zahlungen des Neugeschäfts und des Folgedarlehens
     */
    protected Double sumZahlngGesamt;
    /**
     * Die Summe von den Zahlungen des Neugeschäfts
     */
    protected Double sumZahlngNeuGesch;
    /**
     * Zinsen des Neugeschäfts
     */
    protected Double sumZinsenNeugesch;
    /**
     * Die Summe von den Zinsen des Neugeschäfts und des Folgedarlehens
     */
    protected Double summeZinsenGesamt;
    /**
     * Hier kann die Tilgung des Folgedarlehens angegeben werden, wenn diese von der bisherigen
     * abweichen soll.
     */
    protected Double tilgungFolgedarl;
    /**
     * Der unbezahlte Zins des Neugeschäfts ist in der Tilgung des Folgedarlehens enthalten.
     */
    protected Double unbezZnsNeuGesch;
    /**
     * Weitere sonstige Kosten
     */
    protected Double weitereKosten1;
    /**
     * Weitere sonstige Kosten
     */
    protected Double weitereKosten2;
    /**
     * Wertermittlungskosten z.B. für Sicherheiten. Hinweis: Nach der aktuellen Rechtssprechung dürfen
     * die Wertermittlungskosten dem Kunden nicht in Rechnung gestellt werden. Dieses Feld dient für
     * historische Berechnungen.
     */
    protected Double wertErmittlungsKost;
    /**
     * Zahlungsrhythmus der Beiträge für den Bausparvertrag: monatlich; vierteljährlich; halbjährlich;
     * jährlich;
     * PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERTELJAEHRLICH PA_MONATLICH
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe zahlungswBeitrBSV;
    /**
     * Zahlungsrhythmus der Lebensversicherungsbeiträge: monatlich; vierteljährlich; halbjährlich;
     * jährlich;
     * PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERTELJAEHRLICH PA_MONATLICH
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe zahlungswBeitrLV;

    /**
     * Die Gesamtkosten werden bis zu diesem Datum bestimmt.
     * Nur für Gesamtbetrag aller Zahlungen bis vereinbartes Laufzeitende relevant
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAblaufdatum() {
        return ablaufdatum;
    }

    /**
     * Sets the value of the ablaufdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAblaufdatum()
     */
    public void setAblaufdatum(XMLGregorianCalendar value) {
        this.ablaufdatum = value;
    }

    /**
     * Ultimokennzeichen für das vereinbarte Laufzeitende
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAblaufdatumUltimo() {
        return ablaufdatumUltimo;
    }

    /**
     * Sets the value of the ablaufdatumUltimo property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isAblaufdatumUltimo()
     */
    public void setAblaufdatumUltimo(Boolean value) {
        this.ablaufdatumUltimo = value;
    }

    /**
     * Zu zahlende Abschlussprovision für den Bausparvertrag
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAbschlussProvBSV() {
        return abschlussProvBSV;
    }

    /**
     * Sets the value of the abschlussProvBSV property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAbschlussProvBSV()
     */
    public void setAbschlussProvBSV(Double value) {
        this.abschlussProvBSV = value;
    }

    /**
     * Anzahl der Beiträge für den Bausparvertrag
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getAnzahlBeitraegeBSV() {
        return anzahlBeitraegeBSV;
    }

    /**
     * Sets the value of the anzahlBeitraegeBSV property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getAnzahlBeitraegeBSV()
     */
    public void setAnzahlBeitraegeBSV(BigInteger value) {
        this.anzahlBeitraegeBSV = value;
    }

    /**
     * Anzahl der Beiträge für eine bestehende Lebensversicherung
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getAnzahlBeitraegeLV() {
        return anzahlBeitraegeLV;
    }

    /**
     * Sets the value of the anzahlBeitraegeLV property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getAnzahlBeitraegeLV()
     */
    public void setAnzahlBeitraegeLV(BigInteger value) {
        this.anzahlBeitraegeLV = value;
    }

    /**
     * Gesamtanzahl der Raten bis zur vollständigen Tilgung des Darlehens. Bei endfälligen Darlehen
     * wird hier die Anzahl der Zinszahlungen innerhalb der Gesamtlaufzeit ausgegeben.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getAnzahlRatenGesamt() {
        return anzahlRatenGesamt;
    }

    /**
     * Sets the value of the anzahlRatenGesamt property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getAnzahlRatenGesamt()
     */
    public void setAnzahlRatenGesamt(BigInteger value) {
        this.anzahlRatenGesamt = value;
    }

    /**
     * Entstandene Barauslagen
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBarAuslagen() {
        return barAuslagen;
    }

    /**
     * Sets the value of the barAuslagen property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBarAuslagen()
     */
    public void setBarAuslagen(Double value) {
        this.barAuslagen = value;
    }

    /**
     * Datum letzte Rate am Ende der Gesamtlaufzeit
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatumLetzteRate() {
        return datumLetzteRate;
    }

    /**
     * Sets the value of the datumLetzteRate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatumLetzteRate()
     */
    public void setDatumLetzteRate(XMLGregorianCalendar value) {
        this.datumLetzteRate = value;
    }

    /**
     * Gesamtbetrag aller durch das Darlehen entstandenen Kosten
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGesBetrZahlng() {
        return gesBetrZahlng;
    }

    /**
     * Sets the value of the gesBetrZahlng property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getGesBetrZahlng()
     */
    public void setGesBetrZahlng(Double value) {
        this.gesBetrZahlng = value;
    }

    /**
     * Die Gesamtkosten können auf 3 verschiedene Arten bestimmt werden:
     * bis Zinsbindungsende, bis zur vollständigen Tilgung oder bis zu einem vorgegebenen Ablaufdatum.
     * siehe Struktur Gesamtkostenvariante
     *
     * @return possible object is
     * {@link Gesamtkostenvariante }
     */
    public Gesamtkostenvariante getGesamtkostenvariante() {
        return gesamtkostenvariante;
    }

    /**
     * Sets the value of the gesamtkostenvariante property.
     *
     * @param value allowed object is
     *              {@link Gesamtkostenvariante }
     * @see #getGesamtkostenvariante()
     */
    public void setGesamtkostenvariante(Gesamtkostenvariante value) {
        this.gesamtkostenvariante = value;
    }

    /**
     * Höhe der Beiträge für den Bausparvertrag
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getHoeheBeitraegeBSV() {
        return hoeheBeitraegeBSV;
    }

    /**
     * Sets the value of the hoeheBeitraegeBSV property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getHoeheBeitraegeBSV()
     */
    public void setHoeheBeitraegeBSV(Double value) {
        this.hoeheBeitraegeBSV = value;
    }

    /**
     * Höhe der laufenden Lebensversicherungsbeiträge
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getHoeheBeitraegeLV() {
        return hoeheBeitraegeLV;
    }

    /**
     * Sets the value of the hoeheBeitraegeLV property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getHoeheBeitraegeLV()
     */
    public void setHoeheBeitraegeLV(Double value) {
        this.hoeheBeitraegeLV = value;
    }

    /**
     * Höhe letzte Rate am Ende der Gesamtlaufzeit
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getHoeheLetzteRate() {
        return hoeheLetzteRate;
    }

    /**
     * Sets the value of the hoeheLetzteRate property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getHoeheLetzteRate()
     */
    public void setHoeheLetzteRate(Double value) {
        this.hoeheLetzteRate = value;
    }

    /**
     * Um die Gesamtkosten berechnen zu können, wird mit einem Folgedarlehen prolongiert. Hier kann nun
     * entschieden werden, ob die bestehende Kontoführung beibehalten wird bis das Darlehen vollständig
     * getilgt ist oder ob das Konto abgeschlossen wird und die Prolongation über ein neues Konto
     * erfolgt.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isZinsenkapitalisieren() {
        return zinsenkapitalisieren;
    }

    /**
     * Sets the value of the zinsenkapitalisieren property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isZinsenkapitalisieren()
     */
    public void setZinsenkapitalisieren(Boolean value) {
        this.zinsenkapitalisieren = value;
    }

    /**
     * Gesamtlaufzeit des Darlehens, bis es vollständig getilgt ist.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLaufzeitGesamt() {
        return laufzeitGesamt;
    }

    /**
     * Sets the value of the laufzeitGesamt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLaufzeitGesamt()
     */
    public void setLaufzeitGesamt(Double value) {
        this.laufzeitGesamt = value;
    }

    /**
     * Weitere Kosten, die indirekt im Zusammenhang mit dem Kredit stehen.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNebenLeistung1() {
        return nebenLeistung1;
    }

    /**
     * Sets the value of the nebenLeistung1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNebenLeistung1()
     */
    public void setNebenLeistung1(Double value) {
        this.nebenLeistung1 = value;
    }

    /**
     * Weitere Kosten, die indirekt im Zusammenhang mit dem Kredit stehen.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNebenLeistung2() {
        return nebenLeistung2;
    }

    /**
     * Sets the value of the nebenLeistung2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNebenLeistung2()
     */
    public void setNebenLeistung2(Double value) {
        this.nebenLeistung2 = value;
    }

    /**
     * Tatsächlich zur Verfügung stehender Betrag nach Abzug aller Kosten, auch abzüglich der Kosten
     * die nicht verpflichtend und infolge dessen nicht effektivzinswirksam sind.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNettoKreditBetrag() {
        return nettoKreditBetrag;
    }

    /**
     * Sets the value of the nettoKreditBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNettoKreditBetrag()
     */
    public void setNettoKreditBetrag(Double value) {
        this.nettoKreditBetrag = value;
    }

    /**
     * Hier kann der Nominalzins des Folgedarlehens angegeben werden, wenn dieser vom bisherigem
     * abweichen soll.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNomZinsFolgedarl() {
        return nomZinsFolgedarl;
    }

    /**
     * Sets the value of the nomZinsFolgedarl property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNomZinsFolgedarl()
     */
    public void setNomZinsFolgedarl(Double value) {
        this.nomZinsFolgedarl = value;
    }

    /**
     * Hier kann die Ratenhöhe des Folgedarlehens angegeben werden, wenn diese von der bisherigen
     * abweichen soll.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRatenhoeheFolgedarl() {
        return ratenhoeheFolgedarl;
    }

    /**
     * Sets the value of the ratenhoeheFolgedarl property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRatenhoeheFolgedarl()
     */
    public void setRatenhoeheFolgedarl(Double value) {
        this.ratenhoeheFolgedarl = value;
    }

    /**
     * Höhe einer nicht verpflichtend abgeschlossenen  Restkreditversicherung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRestkreditVers() {
        return restkreditVers;
    }

    /**
     * Sets the value of the restkreditVers property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRestkreditVers()
     */
    public void setRestkreditVers(Double value) {
        this.restkreditVers = value;
    }

    /**
     * Sonstige Kosten
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSonstigeKosten() {
        return sonstigeKosten;
    }

    /**
     * Sets the value of the sonstigeKosten property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSonstigeKosten()
     */
    public void setSonstigeKosten(Double value) {
        this.sonstigeKosten = value;
    }

    /**
     * Die Summe der angefallenen Bereitstellungszinsen beim Neugeschäft und des Folgedarlehens
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSumBereitstelZinsGes() {
        return sumBereitstelZinsGes;
    }

    /**
     * Sets the value of the sumBereitstelZinsGes property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSumBereitstelZinsGes()
     */
    public void setSumBereitstelZinsGes(Double value) {
        this.sumBereitstelZinsGes = value;
    }

    /**
     * Die Summe der angefallenen Bereitstellungszinsen beim Neugeschäft
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSumBezZinsenNeugesch() {
        return sumBezZinsenNeugesch;
    }

    /**
     * Sets the value of the sumBezZinsenNeugesch property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSumBezZinsenNeugesch()
     */
    public void setSumBezZinsenNeugesch(Double value) {
        this.sumBezZinsenNeugesch = value;
    }

    /**
     * Die Summe von dem Kontoauszugspreis des Neugeschäfts und des Folgedarlehens
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSumKtoFuerngsGebGes() {
        return sumKtoFuerngsGebGes;
    }

    /**
     * Sets the value of the sumKtoFuerngsGebGes property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSumKtoFuerngsGebGes()
     */
    public void setSumKtoFuerngsGebGes(Double value) {
        this.sumKtoFuerngsGebGes = value;
    }

    /**
     * Kontoauszugspreis des Folgedarlehens
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSumKtofuerngsGebFolgDarl() {
        return sumKtofuerngsGebFolgDarl;
    }

    /**
     * Sets the value of the sumKtofuerngsGebFolgDarl property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSumKtofuerngsGebFolgDarl()
     */
    public void setSumKtofuerngsGebFolgDarl(Double value) {
        this.sumKtofuerngsGebFolgDarl = value;
    }

    /**
     * Die Summe aller Zahlungen, die in der Maske Weitere Kosten eingegeben werden können.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSumSonstZahlng() {
        return sumSonstZahlng;
    }

    /**
     * Sets the value of the sumSonstZahlng property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSumSonstZahlng()
     */
    public void setSumSonstZahlng(Double value) {
        this.sumSonstZahlng = value;
    }

    /**
     * Tilgungen des Folgedarlehens
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSumTilgFolgDarl() {
        return sumTilgFolgDarl;
    }

    /**
     * Sets the value of the sumTilgFolgDarl property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSumTilgFolgDarl()
     */
    public void setSumTilgFolgDarl(Double value) {
        this.sumTilgFolgDarl = value;
    }

    /**
     * Die Summe von den Tilgungen des Neugeschäfts und des Folgedarlehens
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSumTilgGes() {
        return sumTilgGes;
    }

    /**
     * Sets the value of the sumTilgGes property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSumTilgGes()
     */
    public void setSumTilgGes(Double value) {
        this.sumTilgGes = value;
    }

    /**
     * Zahlungen des Folgedarlehens
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSumZahlngFolgDarl() {
        return sumZahlngFolgDarl;
    }

    /**
     * Sets the value of the sumZahlngFolgDarl property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSumZahlngFolgDarl()
     */
    public void setSumZahlngFolgDarl(Double value) {
        this.sumZahlngFolgDarl = value;
    }

    /**
     * Die Summe von den Zahlungen des Neugeschäfts und des Folgedarlehens
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSumZahlngGesamt() {
        return sumZahlngGesamt;
    }

    /**
     * Sets the value of the sumZahlngGesamt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSumZahlngGesamt()
     */
    public void setSumZahlngGesamt(Double value) {
        this.sumZahlngGesamt = value;
    }

    /**
     * Die Summe von den Zahlungen des Neugeschäfts
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSumZahlngNeuGesch() {
        return sumZahlngNeuGesch;
    }

    /**
     * Sets the value of the sumZahlngNeuGesch property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSumZahlngNeuGesch()
     */
    public void setSumZahlngNeuGesch(Double value) {
        this.sumZahlngNeuGesch = value;
    }

    /**
     * Zinsen des Neugeschäfts
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSumZinsenNeugesch() {
        return sumZinsenNeugesch;
    }

    /**
     * Sets the value of the sumZinsenNeugesch property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSumZinsenNeugesch()
     */
    public void setSumZinsenNeugesch(Double value) {
        this.sumZinsenNeugesch = value;
    }

    /**
     * Die Summe von den Zinsen des Neugeschäfts und des Folgedarlehens
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeZinsenGesamt() {
        return summeZinsenGesamt;
    }

    /**
     * Sets the value of the summeZinsenGesamt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeZinsenGesamt()
     */
    public void setSummeZinsenGesamt(Double value) {
        this.summeZinsenGesamt = value;
    }

    /**
     * Hier kann die Tilgung des Folgedarlehens angegeben werden, wenn diese von der bisherigen
     * abweichen soll.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTilgungFolgedarl() {
        return tilgungFolgedarl;
    }

    /**
     * Sets the value of the tilgungFolgedarl property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getTilgungFolgedarl()
     */
    public void setTilgungFolgedarl(Double value) {
        this.tilgungFolgedarl = value;
    }

    /**
     * Der unbezahlte Zins des Neugeschäfts ist in der Tilgung des Folgedarlehens enthalten.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getUnbezZnsNeuGesch() {
        return unbezZnsNeuGesch;
    }

    /**
     * Sets the value of the unbezZnsNeuGesch property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getUnbezZnsNeuGesch()
     */
    public void setUnbezZnsNeuGesch(Double value) {
        this.unbezZnsNeuGesch = value;
    }

    /**
     * Weitere sonstige Kosten
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getWeitereKosten1() {
        return weitereKosten1;
    }

    /**
     * Sets the value of the weitereKosten1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getWeitereKosten1()
     */
    public void setWeitereKosten1(Double value) {
        this.weitereKosten1 = value;
    }

    /**
     * Weitere sonstige Kosten
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getWeitereKosten2() {
        return weitereKosten2;
    }

    /**
     * Sets the value of the weitereKosten2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getWeitereKosten2()
     */
    public void setWeitereKosten2(Double value) {
        this.weitereKosten2 = value;
    }

    /**
     * Wertermittlungskosten z.B. für Sicherheiten. Hinweis: Nach der aktuellen Rechtssprechung dürfen
     * die Wertermittlungskosten dem Kunden nicht in Rechnung gestellt werden. Dieses Feld dient für
     * historische Berechnungen.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getWertErmittlungsKost() {
        return wertErmittlungsKost;
    }

    /**
     * Sets the value of the wertErmittlungsKost property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getWertErmittlungsKost()
     */
    public void setWertErmittlungsKost(Double value) {
        this.wertErmittlungsKost = value;
    }

    /**
     * Zahlungsrhythmus der Beiträge für den Bausparvertrag: monatlich; vierteljährlich; halbjährlich;
     * jährlich;
     * PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERTELJAEHRLICH PA_MONATLICH
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getZahlungswBeitrBSV() {
        return zahlungswBeitrBSV;
    }

    /**
     * Sets the value of the zahlungswBeitrBSV property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getZahlungswBeitrBSV()
     */
    public void setZahlungswBeitrBSV(Perannoangabe value) {
        this.zahlungswBeitrBSV = value;
    }

    /**
     * Zahlungsrhythmus der Lebensversicherungsbeiträge: monatlich; vierteljährlich; halbjährlich;
     * jährlich;
     * PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERTELJAEHRLICH PA_MONATLICH
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getZahlungswBeitrLV() {
        return zahlungswBeitrLV;
    }

    /**
     * Sets the value of the zahlungswBeitrLV property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getZahlungswBeitrLV()
     */
    public void setZahlungswBeitrLV(Perannoangabe value) {
        this.zahlungswBeitrLV = value;
    }

}
