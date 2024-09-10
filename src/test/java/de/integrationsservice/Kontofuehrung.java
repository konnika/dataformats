
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Der globale komplexe Typ Kontoführung enthält zusätzliche Daten zur Kontoführung
 *
 * <p>Java class for Kontofuehrung complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Kontofuehrung">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="zinsenGleichVerteilt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="anteiligeLetzteRateBerechnen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="halboffenLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="annuitaetenMethode" type="{http://www.gillardon.de/marzipan/integrationsservice}AnnuitaetenMethode" minOccurs="0"/>
 *         <element name="ausweisUmsatzsteuer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="umsatzsteuerEffZinsRelevant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="auszahlungstagVerzinst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="datumswerteSchieben" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ersteTilgungsanrechnung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ersteZinszahlung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="erstesZinsperiodenende" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="hoeheErsteRate" type="{http://www.gillardon.de/marzipan/integrationsservice}HoeheErsteRate" minOccurs="0"/>
 *         <element name="rueckzahltagVerzinst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="sofortigeTilgungsanrechnung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="tilgungsanrechnung" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *         <element name="tilgungsanrTag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="verschiebung" type="{http://www.gillardon.de/marzipan/integrationsservice}Verschieberegel" minOccurs="0"/>
 *         <element name="anpassungZinsberechnung" type="{http://www.gillardon.de/marzipan/integrationsservice}TerminAdjusted" minOccurs="0"/>
 *         <element name="restschuldart" type="{http://www.gillardon.de/marzipan/integrationsservice}Restschuldart" minOccurs="0"/>
 *         <element name="vorfaelligeZinstage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="zinsBisTilgungsbeginn" type="{http://www.gillardon.de/marzipan/integrationsservice}ZinsBisTilgungsbeginn" minOccurs="0"/>
 *         <element name="zinstermine" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *         <element name="zinsfaelligTag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="zinsverrechnungMitJederRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="zinsberechnungTag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ratenGlaettungMethode" type="{http://www.gillardon.de/marzipan/integrationsservice}RatenGlaettungMethode" minOccurs="0"/>
 *         <element name="ratenGlaettungBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kontofuehrungsgebuehr" type="{http://www.gillardon.de/marzipan/integrationsservice}Kontofuehrungsgebuehr" minOccurs="0"/>
 *         <element name="zinseszinsenBerechnen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kontofuehrung", propOrder = {

})
public class Kontofuehrung {

    /**
     * Flag, ob die Zinsen gleichmäßig verteilt werden sollen,
     * wenn mehrere Raten an einem Tilgungsanrechnungstermin mit dem Zinssaldo verrechnet werden.
     * Nur für Annuitätendarlehen relevant.
     * Voreinstellung / Darlehen
     */
    protected Boolean zinsenGleichVerteilt;
    /**
     * Liegt das Zinsbindungsende des Annuitätendarlehens zwischen zwei Ratenterminen, so wird am Datum
     * des Zinsbindungsendes eine zeitanteilige annuitätische Rate ausgewiesen.
     * Durch diese Darstellung ist auch bei Zinsbindungsende zwischen zwei Ratenterminen eine
     * Berechnung mit Vorgabe Restschuld 0 möglich, da diese die anteilige letzte Rate nicht
     * beinhaltet.
     */
    protected Boolean anteiligeLetzteRateBerechnen;
    /**
     * Intervallgrenzen für Verzinsung Tage.
     */
    protected Boolean halboffenLinks;
    /**
     * Kontoführungsmethode standard oder beliebig bei Annuitätendarlehen
     * standard: Rhythmus der Zinsverrechnung = Rhythmus der Raten (müssen vor Tilgungsbeginn auch
     * zeitlich mit den späteren Ratenterminen aufeinanderfallen)
     * beliebig: Rhythmus der Zinsverrechnungen kann ungleich Rhythmus der Raten sein. Sofortige
     * Tilgungsverrechnung: ja/nein. Bei ja Tilgungsverrechnung mit jeder Rate
     */
    @XmlSchemaType(name = "string")
    protected AnnuitaetenMethode annuitaetenMethode;
    /**
     * Die Erhebung von Umsatzsteuer ist ein Wahlrecht der Bank und lässt sich individuell bei jedem zu
     * kalkulierendem Produkt einstellen. Mögliche Auswahlen sind: Nein/Ja
     */
    protected Boolean ausweisUmsatzsteuer;
    /**
     * Über die Auswahl kann wahlweise gesteuert werden, ob die Umsatzsteuer in den PAngV-Effektivzins
     * eingerechnet werden soll. Mögliche Auswahlen sind Nein; Ja;
     * Der Parameter kann über die Voreinstellungen vorbelegt werden.
     * Nur bei Auswahl Ausweis Umsatzsteuer relevant
     */
    protected Boolean umsatzsteuerEffZinsRelevant;
    /**
     * Gibt an, ob der erste Tag der Darlehenslaufzeit mitverzinst werden soll.
     */
    protected Boolean auszahlungstagVerzinst;
    /**
     * Gibt an, ob die Feiertagsverschiebung anhand eines Feiertagkalenders auf der Oberfläche
     * und in den Berechnungsprotokollen stattfindet.
     * Bei Belegung mit false zeigt die Feiertagsverschiebung ihre Wirkung nur in den Berechnungen
     * und der Darstellung der Zahlungsströme in den Kontoplänen.
     */
    protected Boolean datumswerteSchieben;
    /**
     * Der Termin, an dem zum ersten Mal die Tilgung dem Konto angerechnet wird.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ersteTilgungsanrechnung;
    /**
     * Tag der ersten Zinszahlung
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ersteZinszahlung;
    /**
     * Wenn das Zinsperiodenende vom Ende der Ratenzahlungsperiode abweicht, wird es hier eingestellt.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erstesZinsperiodenende;
    /**
     * Die erste Rate kann voll, anteilig der Zinsen, anteilig der Zinsen und der Tilgung bezahlt
     * werden.
     */
    @XmlSchemaType(name = "string")
    protected HoeheErsteRate hoeheErsteRate;
    /**
     * Gibt an, ob der letzte Tag der Darlehenslaufzeit mitverzinst werden soll.
     */
    protected Boolean rueckzahltagVerzinst;
    /**
     * Sofortige Tilgungsanrechnung: Der Tilgungsanteil wird sofort nach jeder Ratenzahlung mit dem
     * Konto verrechnet. Keine sofortige Tilgungsanrechnung: Die Tilgung wird zu einem späteren
     * Zeitpunkt dem Konto gutgeschrieben.
     * Nur bei Auswahl Kontoführungstyp Beliebig relevant
     */
    protected Boolean sofortigeTilgungsanrechnung;
    /**
     * Angabe, in welchen Abständen die Tilgung dem Konto angerechnet werden soll. Im Einzelnen:
     * monatlich; zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe tilgungsanrechnung;
    /**
     * Der Tag im Monat, an welchem die Tilgung angerechnet wird.
     */
    protected Integer tilgungsanrTag;
    /**
     * Welche Verschieberegel soll verwendet werden, wenn ein Termin nicht auf einen Bankarbeitstag
     * fällt.
     */
    @XmlSchemaType(name = "string")
    protected Verschieberegel verschiebung;
    /**
     * Gibt an, ob bei Verschiebung von Zinszahlungsterminen der zugehörige Zinsverrechnungstermin
     * unverändert bleiben (unadjusted) oder auf denselben Termin (adjusted) verschoben werden soll.
     */
    @XmlSchemaType(name = "string")
    protected TerminAdjusted anpassungZinsberechnung;
    /**
     * Folgende Restschuldarten können ausgewählt werden: Restschuld ausweisen,Volltilgung, letzte Rate
     * hoch, Volltilgung, letzte Rate tief.
     */
    @XmlSchemaType(name = "string")
    protected Restschuldart restschuldart;
    /**
     * Es besteht die Möglichkeit, dass Zinsen vorfällig gezahlt werden. Hierbei wird immer von einem
     * Monat von 30 Tagen ausgegangen, unabhängig von der eingestellten Zinsusance. Zum Beispiel werden
     * bei einem ersten Zinsperiodenende am 31.03. und bei 10 vorfälligen Zinstagen die Zinsen bereits
     * am 20.03. fällig.
     */
    protected Integer vorfaelligeZinstage;
    /**
     * Die Zinsen, die bis zur ersten Zinszahlung anfallen, können verrechnet/kumuliert werden.
     */
    @XmlSchemaType(name = "string")
    protected ZinsBisTilgungsbeginn zinsBisTilgungsbeginn;
    /**
     * Angabe, in welchen Abständen die Zinsen berechnet werden. Bei Kontoführungstyp Standard liegt
     * der Rhythmus der Zinstermine vor Tilgungsbeginn im Rhythmus der späteren Ratentermine. Daher
     * kann dieses Feld nicht eingegeben werden. Bei Kontoführungstyp Beliebig ist der Zeitpunkt der
     * Zinsberechnung unabhängig von dem Ratenzahlungstermin. Die eigentliche Zinsperiode kann kürzer
     * oder länger als der Rhythmus der Ratenzahlung sein. Im Einzelnen: monatlich; zweimonatlich;
     * vierteljährlich;  halbjährlich; jährlich
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe zinstermine;
    /**
     * Tag im Monat, an dem die Zinsperiode endet.
     */
    protected Integer zinsfaelligTag;
    /**
     * Wenn ja, werden mit jeder Rate (nicht bei Auszahlungen oder sonstigen Treppen) die aufgelaufenen
     * Zinsen verrechnet. Wenn ein, dann wird über die folgenden Felder ein eigener Rhythmus definiert.
     */
    protected Boolean zinsverrechnungMitJederRate;
    /**
     * Periodentag der Zinsberechnung
     */
    protected Integer zinsberechnungTag;
    /**
     * Wenn eine Ratenglättung gewünscht ist, muss festgelegt werden, ob die letzte Rate niedriger oder
     * höher als die restlichen Raten sein soll.
     */
    @XmlSchemaType(name = "string")
    protected RatenGlaettungMethode ratenGlaettungMethode;
    /**
     * Genauigkeit, auf welche die Raten gerundet werden, zum Beispiel 0.01 für Rundung auf einen Cent.
     */
    protected Double ratenGlaettungBetrag;
    /**
     * Regelungen für die Zahlung von
     * Kontoauszugspreisen
     */
    protected Kontofuehrungsgebuehr kontofuehrungsgebuehr;
    /**
     * Flag, ob Zinseszinsen berechnet werden sollen. Dieses Flag ist aktuell nur bei
     * Treppenrechner-Annuitätendarlehen relevant.
     */
    protected Boolean zinseszinsenBerechnen;

    /**
     * Flag, ob die Zinsen gleichmäßig verteilt werden sollen,
     * wenn mehrere Raten an einem Tilgungsanrechnungstermin mit dem Zinssaldo verrechnet werden.
     * Nur für Annuitätendarlehen relevant.
     * Voreinstellung / Darlehen
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isZinsenGleichVerteilt() {
        return zinsenGleichVerteilt;
    }

    /**
     * Sets the value of the zinsenGleichVerteilt property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isZinsenGleichVerteilt()
     */
    public void setZinsenGleichVerteilt(Boolean value) {
        this.zinsenGleichVerteilt = value;
    }

    /**
     * Liegt das Zinsbindungsende des Annuitätendarlehens zwischen zwei Ratenterminen, so wird am Datum
     * des Zinsbindungsendes eine zeitanteilige annuitätische Rate ausgewiesen.
     * Durch diese Darstellung ist auch bei Zinsbindungsende zwischen zwei Ratenterminen eine
     * Berechnung mit Vorgabe Restschuld 0 möglich, da diese die anteilige letzte Rate nicht
     * beinhaltet.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAnteiligeLetzteRateBerechnen() {
        return anteiligeLetzteRateBerechnen;
    }

    /**
     * Sets the value of the anteiligeLetzteRateBerechnen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isAnteiligeLetzteRateBerechnen()
     */
    public void setAnteiligeLetzteRateBerechnen(Boolean value) {
        this.anteiligeLetzteRateBerechnen = value;
    }

    /**
     * Intervallgrenzen für Verzinsung Tage.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isHalboffenLinks() {
        return halboffenLinks;
    }

    /**
     * Sets the value of the halboffenLinks property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isHalboffenLinks()
     */
    public void setHalboffenLinks(Boolean value) {
        this.halboffenLinks = value;
    }

    /**
     * Kontoführungsmethode standard oder beliebig bei Annuitätendarlehen
     * standard: Rhythmus der Zinsverrechnung = Rhythmus der Raten (müssen vor Tilgungsbeginn auch
     * zeitlich mit den späteren Ratenterminen aufeinanderfallen)
     * beliebig: Rhythmus der Zinsverrechnungen kann ungleich Rhythmus der Raten sein. Sofortige
     * Tilgungsverrechnung: ja/nein. Bei ja Tilgungsverrechnung mit jeder Rate
     *
     * @return possible object is
     * {@link AnnuitaetenMethode }
     */
    public AnnuitaetenMethode getAnnuitaetenMethode() {
        return annuitaetenMethode;
    }

    /**
     * Sets the value of the annuitaetenMethode property.
     *
     * @param value allowed object is
     *              {@link AnnuitaetenMethode }
     * @see #getAnnuitaetenMethode()
     */
    public void setAnnuitaetenMethode(AnnuitaetenMethode value) {
        this.annuitaetenMethode = value;
    }

    /**
     * Die Erhebung von Umsatzsteuer ist ein Wahlrecht der Bank und lässt sich individuell bei jedem zu
     * kalkulierendem Produkt einstellen. Mögliche Auswahlen sind: Nein/Ja
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAusweisUmsatzsteuer() {
        return ausweisUmsatzsteuer;
    }

    /**
     * Sets the value of the ausweisUmsatzsteuer property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isAusweisUmsatzsteuer()
     */
    public void setAusweisUmsatzsteuer(Boolean value) {
        this.ausweisUmsatzsteuer = value;
    }

    /**
     * Über die Auswahl kann wahlweise gesteuert werden, ob die Umsatzsteuer in den PAngV-Effektivzins
     * eingerechnet werden soll. Mögliche Auswahlen sind Nein; Ja;
     * Der Parameter kann über die Voreinstellungen vorbelegt werden.
     * Nur bei Auswahl Ausweis Umsatzsteuer relevant
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isUmsatzsteuerEffZinsRelevant() {
        return umsatzsteuerEffZinsRelevant;
    }

    /**
     * Sets the value of the umsatzsteuerEffZinsRelevant property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isUmsatzsteuerEffZinsRelevant()
     */
    public void setUmsatzsteuerEffZinsRelevant(Boolean value) {
        this.umsatzsteuerEffZinsRelevant = value;
    }

    /**
     * Gibt an, ob der erste Tag der Darlehenslaufzeit mitverzinst werden soll.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAuszahlungstagVerzinst() {
        return auszahlungstagVerzinst;
    }

    /**
     * Sets the value of the auszahlungstagVerzinst property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isAuszahlungstagVerzinst()
     */
    public void setAuszahlungstagVerzinst(Boolean value) {
        this.auszahlungstagVerzinst = value;
    }

    /**
     * Gibt an, ob die Feiertagsverschiebung anhand eines Feiertagkalenders auf der Oberfläche
     * und in den Berechnungsprotokollen stattfindet.
     * Bei Belegung mit false zeigt die Feiertagsverschiebung ihre Wirkung nur in den Berechnungen
     * und der Darstellung der Zahlungsströme in den Kontoplänen.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDatumswerteSchieben() {
        return datumswerteSchieben;
    }

    /**
     * Sets the value of the datumswerteSchieben property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isDatumswerteSchieben()
     */
    public void setDatumswerteSchieben(Boolean value) {
        this.datumswerteSchieben = value;
    }

    /**
     * Der Termin, an dem zum ersten Mal die Tilgung dem Konto angerechnet wird.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErsteTilgungsanrechnung() {
        return ersteTilgungsanrechnung;
    }

    /**
     * Sets the value of the ersteTilgungsanrechnung property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErsteTilgungsanrechnung()
     */
    public void setErsteTilgungsanrechnung(XMLGregorianCalendar value) {
        this.ersteTilgungsanrechnung = value;
    }

    /**
     * Tag der ersten Zinszahlung
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErsteZinszahlung() {
        return ersteZinszahlung;
    }

    /**
     * Sets the value of the ersteZinszahlung property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErsteZinszahlung()
     */
    public void setErsteZinszahlung(XMLGregorianCalendar value) {
        this.ersteZinszahlung = value;
    }

    /**
     * Wenn das Zinsperiodenende vom Ende der Ratenzahlungsperiode abweicht, wird es hier eingestellt.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErstesZinsperiodenende() {
        return erstesZinsperiodenende;
    }

    /**
     * Sets the value of the erstesZinsperiodenende property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErstesZinsperiodenende()
     */
    public void setErstesZinsperiodenende(XMLGregorianCalendar value) {
        this.erstesZinsperiodenende = value;
    }

    /**
     * Die erste Rate kann voll, anteilig der Zinsen, anteilig der Zinsen und der Tilgung bezahlt
     * werden.
     *
     * @return possible object is
     * {@link HoeheErsteRate }
     */
    public HoeheErsteRate getHoeheErsteRate() {
        return hoeheErsteRate;
    }

    /**
     * Sets the value of the hoeheErsteRate property.
     *
     * @param value allowed object is
     *              {@link HoeheErsteRate }
     * @see #getHoeheErsteRate()
     */
    public void setHoeheErsteRate(HoeheErsteRate value) {
        this.hoeheErsteRate = value;
    }

    /**
     * Gibt an, ob der letzte Tag der Darlehenslaufzeit mitverzinst werden soll.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRueckzahltagVerzinst() {
        return rueckzahltagVerzinst;
    }

    /**
     * Sets the value of the rueckzahltagVerzinst property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isRueckzahltagVerzinst()
     */
    public void setRueckzahltagVerzinst(Boolean value) {
        this.rueckzahltagVerzinst = value;
    }

    /**
     * Sofortige Tilgungsanrechnung: Der Tilgungsanteil wird sofort nach jeder Ratenzahlung mit dem
     * Konto verrechnet. Keine sofortige Tilgungsanrechnung: Die Tilgung wird zu einem späteren
     * Zeitpunkt dem Konto gutgeschrieben.
     * Nur bei Auswahl Kontoführungstyp Beliebig relevant
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSofortigeTilgungsanrechnung() {
        return sofortigeTilgungsanrechnung;
    }

    /**
     * Sets the value of the sofortigeTilgungsanrechnung property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isSofortigeTilgungsanrechnung()
     */
    public void setSofortigeTilgungsanrechnung(Boolean value) {
        this.sofortigeTilgungsanrechnung = value;
    }

    /**
     * Angabe, in welchen Abständen die Tilgung dem Konto angerechnet werden soll. Im Einzelnen:
     * monatlich; zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getTilgungsanrechnung() {
        return tilgungsanrechnung;
    }

    /**
     * Sets the value of the tilgungsanrechnung property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getTilgungsanrechnung()
     */
    public void setTilgungsanrechnung(Perannoangabe value) {
        this.tilgungsanrechnung = value;
    }

    /**
     * Der Tag im Monat, an welchem die Tilgung angerechnet wird.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTilgungsanrTag() {
        return tilgungsanrTag;
    }

    /**
     * Sets the value of the tilgungsanrTag property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getTilgungsanrTag()
     */
    public void setTilgungsanrTag(Integer value) {
        this.tilgungsanrTag = value;
    }

    /**
     * Welche Verschieberegel soll verwendet werden, wenn ein Termin nicht auf einen Bankarbeitstag
     * fällt.
     *
     * @return possible object is
     * {@link Verschieberegel }
     */
    public Verschieberegel getVerschiebung() {
        return verschiebung;
    }

    /**
     * Sets the value of the verschiebung property.
     *
     * @param value allowed object is
     *              {@link Verschieberegel }
     * @see #getVerschiebung()
     */
    public void setVerschiebung(Verschieberegel value) {
        this.verschiebung = value;
    }

    /**
     * Gibt an, ob bei Verschiebung von Zinszahlungsterminen der zugehörige Zinsverrechnungstermin
     * unverändert bleiben (unadjusted) oder auf denselben Termin (adjusted) verschoben werden soll.
     *
     * @return possible object is
     * {@link TerminAdjusted }
     */
    public TerminAdjusted getAnpassungZinsberechnung() {
        return anpassungZinsberechnung;
    }

    /**
     * Sets the value of the anpassungZinsberechnung property.
     *
     * @param value allowed object is
     *              {@link TerminAdjusted }
     * @see #getAnpassungZinsberechnung()
     */
    public void setAnpassungZinsberechnung(TerminAdjusted value) {
        this.anpassungZinsberechnung = value;
    }

    /**
     * Folgende Restschuldarten können ausgewählt werden: Restschuld ausweisen,Volltilgung, letzte Rate
     * hoch, Volltilgung, letzte Rate tief.
     *
     * @return possible object is
     * {@link Restschuldart }
     */
    public Restschuldart getRestschuldart() {
        return restschuldart;
    }

    /**
     * Sets the value of the restschuldart property.
     *
     * @param value allowed object is
     *              {@link Restschuldart }
     * @see #getRestschuldart()
     */
    public void setRestschuldart(Restschuldart value) {
        this.restschuldart = value;
    }

    /**
     * Es besteht die Möglichkeit, dass Zinsen vorfällig gezahlt werden. Hierbei wird immer von einem
     * Monat von 30 Tagen ausgegangen, unabhängig von der eingestellten Zinsusance. Zum Beispiel werden
     * bei einem ersten Zinsperiodenende am 31.03. und bei 10 vorfälligen Zinstagen die Zinsen bereits
     * am 20.03. fällig.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getVorfaelligeZinstage() {
        return vorfaelligeZinstage;
    }

    /**
     * Sets the value of the vorfaelligeZinstage property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getVorfaelligeZinstage()
     */
    public void setVorfaelligeZinstage(Integer value) {
        this.vorfaelligeZinstage = value;
    }

    /**
     * Die Zinsen, die bis zur ersten Zinszahlung anfallen, können verrechnet/kumuliert werden.
     *
     * @return possible object is
     * {@link ZinsBisTilgungsbeginn }
     */
    public ZinsBisTilgungsbeginn getZinsBisTilgungsbeginn() {
        return zinsBisTilgungsbeginn;
    }

    /**
     * Sets the value of the zinsBisTilgungsbeginn property.
     *
     * @param value allowed object is
     *              {@link ZinsBisTilgungsbeginn }
     * @see #getZinsBisTilgungsbeginn()
     */
    public void setZinsBisTilgungsbeginn(ZinsBisTilgungsbeginn value) {
        this.zinsBisTilgungsbeginn = value;
    }

    /**
     * Angabe, in welchen Abständen die Zinsen berechnet werden. Bei Kontoführungstyp Standard liegt
     * der Rhythmus der Zinstermine vor Tilgungsbeginn im Rhythmus der späteren Ratentermine. Daher
     * kann dieses Feld nicht eingegeben werden. Bei Kontoführungstyp Beliebig ist der Zeitpunkt der
     * Zinsberechnung unabhängig von dem Ratenzahlungstermin. Die eigentliche Zinsperiode kann kürzer
     * oder länger als der Rhythmus der Ratenzahlung sein. Im Einzelnen: monatlich; zweimonatlich;
     * vierteljährlich;  halbjährlich; jährlich
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getZinstermine() {
        return zinstermine;
    }

    /**
     * Sets the value of the zinstermine property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getZinstermine()
     */
    public void setZinstermine(Perannoangabe value) {
        this.zinstermine = value;
    }

    /**
     * Tag im Monat, an dem die Zinsperiode endet.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getZinsfaelligTag() {
        return zinsfaelligTag;
    }

    /**
     * Sets the value of the zinsfaelligTag property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getZinsfaelligTag()
     */
    public void setZinsfaelligTag(Integer value) {
        this.zinsfaelligTag = value;
    }

    /**
     * Wenn ja, werden mit jeder Rate (nicht bei Auszahlungen oder sonstigen Treppen) die aufgelaufenen
     * Zinsen verrechnet. Wenn ein, dann wird über die folgenden Felder ein eigener Rhythmus definiert.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isZinsverrechnungMitJederRate() {
        return zinsverrechnungMitJederRate;
    }

    /**
     * Sets the value of the zinsverrechnungMitJederRate property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isZinsverrechnungMitJederRate()
     */
    public void setZinsverrechnungMitJederRate(Boolean value) {
        this.zinsverrechnungMitJederRate = value;
    }

    /**
     * Periodentag der Zinsberechnung
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getZinsberechnungTag() {
        return zinsberechnungTag;
    }

    /**
     * Sets the value of the zinsberechnungTag property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getZinsberechnungTag()
     */
    public void setZinsberechnungTag(Integer value) {
        this.zinsberechnungTag = value;
    }

    /**
     * Wenn eine Ratenglättung gewünscht ist, muss festgelegt werden, ob die letzte Rate niedriger oder
     * höher als die restlichen Raten sein soll.
     *
     * @return possible object is
     * {@link RatenGlaettungMethode }
     */
    public RatenGlaettungMethode getRatenGlaettungMethode() {
        return ratenGlaettungMethode;
    }

    /**
     * Sets the value of the ratenGlaettungMethode property.
     *
     * @param value allowed object is
     *              {@link RatenGlaettungMethode }
     * @see #getRatenGlaettungMethode()
     */
    public void setRatenGlaettungMethode(RatenGlaettungMethode value) {
        this.ratenGlaettungMethode = value;
    }

    /**
     * Genauigkeit, auf welche die Raten gerundet werden, zum Beispiel 0.01 für Rundung auf einen Cent.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRatenGlaettungBetrag() {
        return ratenGlaettungBetrag;
    }

    /**
     * Sets the value of the ratenGlaettungBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRatenGlaettungBetrag()
     */
    public void setRatenGlaettungBetrag(Double value) {
        this.ratenGlaettungBetrag = value;
    }

    /**
     * Regelungen für die Zahlung von
     * Kontoauszugspreisen
     *
     * @return possible object is
     * {@link Kontofuehrungsgebuehr }
     */
    public Kontofuehrungsgebuehr getKontofuehrungsgebuehr() {
        return kontofuehrungsgebuehr;
    }

    /**
     * Sets the value of the kontofuehrungsgebuehr property.
     *
     * @param value allowed object is
     *              {@link Kontofuehrungsgebuehr }
     * @see #getKontofuehrungsgebuehr()
     */
    public void setKontofuehrungsgebuehr(Kontofuehrungsgebuehr value) {
        this.kontofuehrungsgebuehr = value;
    }

    /**
     * Flag, ob Zinseszinsen berechnet werden sollen. Dieses Flag ist aktuell nur bei
     * Treppenrechner-Annuitätendarlehen relevant.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isZinseszinsenBerechnen() {
        return zinseszinsenBerechnen;
    }

    /**
     * Sets the value of the zinseszinsenBerechnen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isZinseszinsenBerechnen()
     */
    public void setZinseszinsenBerechnen(Boolean value) {
        this.zinseszinsenBerechnen = value;
    }

}
