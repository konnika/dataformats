
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Enthält die Daten für implizite Optionen
 *
 * <p>Java class for ImpliziteOptionen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ImpliziteOptionen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="optionspreis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="schwelleAbsolut" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="schwelleRelativ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="schwellenverrechnen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="schrittweite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="volaTeilmarkt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="volatilitaet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="schwellwertSatz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="krFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="krAmMonat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="krAmTag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="jhrlFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="jhrlAmTag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="jhrlAmMonat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="jhrlHoeheVon" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="jhrlHoeheBis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="jhrlOptionTeilbar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="jhrlErstmaligJahr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="mtlFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="mtlHoeheVon" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="mtlHoeheBis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kuendSperrFrist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="kuendRecht489" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vollstAuszahlungAm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="periodizitaetJaehrlichesVerfuegungsrecht" type="{http://www.gillardon.de/marzipan/integrationsservice}Periodizitaet" minOccurs="0"/>
 *         <element name="periodizitaetKuendigungsrecht" type="{http://www.gillardon.de/marzipan/integrationsservice}Periodizitaet" minOccurs="0"/>
 *         <element name="schwelleModus" type="{http://www.gillardon.de/marzipan/integrationsservice}SchwelleModus" minOccurs="0"/>
 *         <element name="artKuendigungsrechte" type="{http://www.gillardon.de/marzipan/integrationsservice}ArtKuendigungsrechte" minOccurs="0"/>
 *         <element name="ausuebungKuendigungsrechte" type="{http://www.gillardon.de/marzipan/integrationsservice}AusuebungKuendigungsrechte" minOccurs="0"/>
 *         <element name="ausuebungsverhalten" type="{http://www.gillardon.de/marzipan/integrationsservice}Ausuebungsverhalten" minOccurs="0"/>
 *         <element name="ausuebungsfunktion" type="{http://www.gillardon.de/marzipan/integrationsservice}Ausuebungsfunktion" minOccurs="0"/>
 *         <element name="ausuebungswahrscheinlichkeit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="standardZinsvorteilgrenze" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="standardA1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="standardB1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="standardC1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="standardA2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="standardB2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="standardC2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="individuellZinsvorteilgrenze" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="individuellA1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="individuellB1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="individuellC1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="individuellA2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="individuellB2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="individuellC2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margenbarwertsicherung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="implOptModell" type="{http://www.gillardon.de/marzipan/integrationsservice}ImplOptModell" minOccurs="0"/>
 *         <element name="optionsrechte" type="{http://www.gillardon.de/marzipan/integrationsservice}Optionsrechte" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpliziteOptionen", propOrder = {

})
public class ImpliziteOptionen {

    /**
     * Preis der impliziten Optionen
     */
    protected Double optionspreis;
    /**
     * Wenn die absolute Schwelle überschritten ist, so übt der Darlehensnehmer sein Optionsrecht aus
     */
    protected Double schwelleAbsolut;
    /**
     * Wenn die relative Schwelle überschritten ist, so übt der Darlehensnehmer sein Optionsrecht aus.
     */
    protected Double schwelleRelativ;
    /**
     * Flag, ob die Ausübungsschwelle verrechnet werden soll.
     */
    protected Boolean schwellenverrechnen;
    /**
     * Schrittweite bei der Berechnung (nur bei Darlehen, bei Sparen nicht relevant).
     * WIRD AB MARZIPAN WEB 2.14 NICHT MEHR BENUTZT.
     */
    protected Integer schrittweite;
    /**
     * Name des Teilmarkts der Zinsvolamatrix. Die Volatilitätsmatrix ist mit demselben Teilmarkt
     * auszuwählen.
     */
    protected String volaTeilmarkt;
    /**
     * Die Volatilität kann aus den am Markt gehandelten Zinsvolatilitäten für Swaptions abgelesen
     * werden, oder in Abhängigkeit der Optionslaufzeit (Zeitpunkt des Sondertilgungsrechts) und der
     * Restlaufzeit des Underlyings (Restlaufzeit des Kredits nach Sondertilgungsrecht) aus einer
     * Volatilitätsmatrix gelesen werden. Bei Rechten, die an mehreren Zeitpunkten oder über einen
     * Zeitraum hinweg ausgeübt werden können, werden im Optionspreismodell mehrere Volatilitäten aus
     * der Volatilitätsmatrix herangezogen.
     */
    protected Double volatilitaet;
    /**
     * In den Voreinstellungen kann jeweils eine relative und eine absolute Schwelle unter einem Namen
     * zusammengefasst werden, der bei Name über ein Auswahlfeld ausgewählt werden kann.
     */
    protected String schwellwertSatz;
    /**
     * Flag, ob bei Sparanlagen ein Kündigungsrecht (jederzeit oder jährlich) eingeräumt wird
     */
    protected Boolean krFlag;
    /**
     * Monat für jährliches Kuendigungsrecht von Sparanlagen (nur bei Periodizität 'jaehrlich am')
     */
    protected Integer krAmMonat;
    /**
     * Tag fuer jaehrliches Kuendigungsrecht von Sparanlagen (nur bei Periodizitaet 'jaehrlich am')
     */
    protected Integer krAmTag;
    /**
     * Aktivierung zusätzlicher Eingabefelder für jährliche Sonderkündigungsrechte
     */
    protected Boolean jhrlFlag;
    /**
     * Tag für ein jährliches Verfügungsrecht (Sparanlagen) bzw. jährliches Sondertilgungsrecht
     * (Darlehen) (nur bei Periodizität 'jaehrlich am')
     */
    protected Integer jhrlAmTag;
    /**
     * Monat für ein jährliches Verfügungsrecht (Sparanlagen) bzw. jährliches Sondertilgungsrecht
     * (Darlehen) (nur bei Periodizität 'jaehrlich am')
     */
    protected Integer jhrlAmMonat;
    /**
     * Untere Betragsgrenze des jährlichen Verfügungsrechts (Sparanlagen) bzw. des jährlichen
     * Sondertilgungsrechts (Darlehen)
     */
    protected Double jhrlHoeheVon;
    /**
     * Obere Betragsgrenze des jährlichen Verfügungsrechts (Sparanlagen) bzw. des jährlichen
     * Sondertilgungsrechts (Darlehen)
     */
    protected Double jhrlHoeheBis;
    /**
     * Gibt an, ob das Recht in mehreren Teilbeträgen ausgeübt werden (Häkchen gesetzt) oder nur in
     * einem Betrag im Gültigkeitszeitraum ausgeübt werden kann (Häkchen nicht gesetzt)
     */
    protected Boolean jhrlOptionTeilbar;
    /**
     * Jahr, in dem ein jährliches Sondertilgungsrecht für Darlehen erstmalig ausgeübt werden darf
     */
    protected Integer jhrlErstmaligJahr;
    /**
     * Das Recht wird als amerikanisches Recht von Kalendermonat zu Kalendermonat (vom 1. bis Ultimo
     * jedes Monats), erstes Recht beginnt am Geschäftsbeginn plus Kündigungssperrfrist, letztes Recht
     * endet am Geschäftsende.
     */
    protected Boolean mtlFlag;
    /**
     * Untere Betragsgrenze des monatlichen Verfügungsrechts für Sparanlagen
     */
    protected Double mtlHoeheVon;
    /**
     * Ober Betragsgrenze des monatlichen Verfügungsrechts für Sparanlagen
     */
    protected Double mtlHoeheBis;
    /**
     * Ganze Monate, die von Geschäftsbeginn aus gezählt werden. Erst nach der Kündigungssperrfirst ist
     * eine Kündigung / Verfügung möglich. Der Wert ist wichtig für die Eingabe des Beginndatums des
     * ersten Kündigungsrechts. Die Kündigungssperrfrist gilt für die drei oberen Eingabeblöcke
     * (Kündigungsrecht, jährliches Verfügungsrecht, monatliches Verfügungsrecht) gleichermaßen.
     */
    protected Integer kuendSperrFrist;
    /**
     * Flag, ob Kündigungsrecht für Darlehen nach Paragraph 489 BGB eingeräumt wird. Kündigungsrecht
     * nach 10 Jahren mit 6 Monaten Vorlaufzeit.
     */
    protected Boolean kuendRecht489;
    /**
     * Datum der vollständigen Darlehensauszahlung für die Berücksichtigung des Kündigungsrechts nach
     * Paragraph 489 BGB
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vollstAuszahlungAm;
    /**
     * Periodizität des jährlichen Verfügungsrechts (Sparanlagen) bzw. des jährlichen
     * Sondertilgungsrechts (Darlehen)
     * Auswahl aus pro Laufzeitjahr, pro Kalenderjahr, jährlich am
     */
    @XmlSchemaType(name = "string")
    protected Periodizitaet periodizitaetJaehrlichesVerfuegungsrecht;
    /**
     * Periodizität des Kündigungsrechts für Sparanlagen.
     */
    @XmlSchemaType(name = "string")
    protected Periodizitaet periodizitaetKuendigungsrecht;
    /**
     * Art der Schwelle (Auswahl, Manuell, keine)
     */
    @XmlSchemaType(name = "string")
    protected SchwelleModus schwelleModus;
    /**
     * Art des Kündigungsrechts.
     */
    @XmlSchemaType(name = "string")
    protected ArtKuendigungsrechte artKuendigungsrechte;
    /**
     * Ausübungsvariante des Kündigungsrechts.
     */
    @XmlSchemaType(name = "string")
    protected AusuebungKuendigungsrechte ausuebungKuendigungsrechte;
    /**
     * Ausübungsverhalten (optional, eingeschränkt optional, statistisch)
     */
    @XmlSchemaType(name = "string")
    protected Ausuebungsverhalten ausuebungsverhalten;
    /**
     * Ausübungsfunktion (standard, individuell)
     */
    @XmlSchemaType(name = "string")
    protected Ausuebungsfunktion ausuebungsfunktion;
    /**
     * Ausübungswahrscheinlichkeit in Prozent
     */
    protected Double ausuebungswahrscheinlichkeit;
    /**
     * Zinsvorteilgrenze für die Standardausübungsfunktion
     */
    protected Double standardZinsvorteilgrenze;
    /**
     * Parameter A1 für die Standardausübungsfunktion
     */
    protected Double standardA1;
    /**
     * Parameter B1 für die Standardausübungsfunktion
     */
    protected Double standardB1;
    /**
     * Parameter C1 für die Standardausübungsfunktion
     */
    protected Double standardC1;
    /**
     * Parameter A2 für die Standardausübungsfunktion
     */
    protected Double standardA2;
    /**
     * Parameter B2 für die Standardausübungsfunktion
     */
    protected Double standardB2;
    /**
     * Parameter C2 für die Standardausübungsfunktion
     */
    protected Double standardC2;
    /**
     * Zinsvorteilgrenze für die individuelle Ausübungsfunktion
     */
    protected Double individuellZinsvorteilgrenze;
    /**
     * Parameter A1 für die individuelle Ausübungsfunktion
     */
    protected Double individuellA1;
    /**
     * Parameter B1 für die individuelle Ausübungsfunktion
     */
    protected Double individuellB1;
    /**
     * Parameter C1 für die individuelle Ausübungsfunktion
     */
    protected Double individuellC1;
    /**
     * Parameter A2 für die individuelle Ausübungsfunktion
     */
    protected Double individuellA2;
    /**
     * Parameter B2 für die individuelle Ausübungsfunktion
     */
    protected Double individuellB2;
    /**
     * Parameter C2 für die individuelle Ausübungsfunktion
     */
    protected Double individuellC2;
    /**
     * Wenn das Flag aktiviert ist, wird in der Berechnung des Optionspreises der Margenbarwert nicht
     * mit abgesichert. Der Optionspreis fällt niedriger aus.
     */
    protected Boolean margenbarwertsicherung;
    /**
     * Berechnungsmodell für die impliziten Optionen.
     */
    @XmlSchemaType(name = "string")
    protected ImplOptModell implOptModell;
    /**
     * Daten für optionale Tilgungsrechte (Darlehen) bzw. Verfügungsrechte/Kündigungsrechte (Sparen).
     */
    protected Optionsrechte optionsrechte;

    /**
     * Preis der impliziten Optionen
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getOptionspreis() {
        return optionspreis;
    }

    /**
     * Sets the value of the optionspreis property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getOptionspreis()
     */
    public void setOptionspreis(Double value) {
        this.optionspreis = value;
    }

    /**
     * Wenn die absolute Schwelle überschritten ist, so übt der Darlehensnehmer sein Optionsrecht aus
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSchwelleAbsolut() {
        return schwelleAbsolut;
    }

    /**
     * Sets the value of the schwelleAbsolut property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSchwelleAbsolut()
     */
    public void setSchwelleAbsolut(Double value) {
        this.schwelleAbsolut = value;
    }

    /**
     * Wenn die relative Schwelle überschritten ist, so übt der Darlehensnehmer sein Optionsrecht aus.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSchwelleRelativ() {
        return schwelleRelativ;
    }

    /**
     * Sets the value of the schwelleRelativ property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSchwelleRelativ()
     */
    public void setSchwelleRelativ(Double value) {
        this.schwelleRelativ = value;
    }

    /**
     * Flag, ob die Ausübungsschwelle verrechnet werden soll.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSchwellenverrechnen() {
        return schwellenverrechnen;
    }

    /**
     * Sets the value of the schwellenverrechnen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isSchwellenverrechnen()
     */
    public void setSchwellenverrechnen(Boolean value) {
        this.schwellenverrechnen = value;
    }

    /**
     * Schrittweite bei der Berechnung (nur bei Darlehen, bei Sparen nicht relevant).
     * WIRD AB MARZIPAN WEB 2.14 NICHT MEHR BENUTZT.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getSchrittweite() {
        return schrittweite;
    }

    /**
     * Sets the value of the schrittweite property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getSchrittweite()
     */
    public void setSchrittweite(Integer value) {
        this.schrittweite = value;
    }

    /**
     * Name des Teilmarkts der Zinsvolamatrix. Die Volatilitätsmatrix ist mit demselben Teilmarkt
     * auszuwählen.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVolaTeilmarkt() {
        return volaTeilmarkt;
    }

    /**
     * Sets the value of the volaTeilmarkt property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getVolaTeilmarkt()
     */
    public void setVolaTeilmarkt(String value) {
        this.volaTeilmarkt = value;
    }

    /**
     * Die Volatilität kann aus den am Markt gehandelten Zinsvolatilitäten für Swaptions abgelesen
     * werden, oder in Abhängigkeit der Optionslaufzeit (Zeitpunkt des Sondertilgungsrechts) und der
     * Restlaufzeit des Underlyings (Restlaufzeit des Kredits nach Sondertilgungsrecht) aus einer
     * Volatilitätsmatrix gelesen werden. Bei Rechten, die an mehreren Zeitpunkten oder über einen
     * Zeitraum hinweg ausgeübt werden können, werden im Optionspreismodell mehrere Volatilitäten aus
     * der Volatilitätsmatrix herangezogen.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVolatilitaet() {
        return volatilitaet;
    }

    /**
     * Sets the value of the volatilitaet property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVolatilitaet()
     */
    public void setVolatilitaet(Double value) {
        this.volatilitaet = value;
    }

    /**
     * In den Voreinstellungen kann jeweils eine relative und eine absolute Schwelle unter einem Namen
     * zusammengefasst werden, der bei Name über ein Auswahlfeld ausgewählt werden kann.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchwellwertSatz() {
        return schwellwertSatz;
    }

    /**
     * Sets the value of the schwellwertSatz property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getSchwellwertSatz()
     */
    public void setSchwellwertSatz(String value) {
        this.schwellwertSatz = value;
    }

    /**
     * Flag, ob bei Sparanlagen ein Kündigungsrecht (jederzeit oder jährlich) eingeräumt wird
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isKrFlag() {
        return krFlag;
    }

    /**
     * Sets the value of the krFlag property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isKrFlag()
     */
    public void setKrFlag(Boolean value) {
        this.krFlag = value;
    }

    /**
     * Monat für jährliches Kuendigungsrecht von Sparanlagen (nur bei Periodizität 'jaehrlich am')
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getKrAmMonat() {
        return krAmMonat;
    }

    /**
     * Sets the value of the krAmMonat property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getKrAmMonat()
     */
    public void setKrAmMonat(Integer value) {
        this.krAmMonat = value;
    }

    /**
     * Tag fuer jaehrliches Kuendigungsrecht von Sparanlagen (nur bei Periodizitaet 'jaehrlich am')
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getKrAmTag() {
        return krAmTag;
    }

    /**
     * Sets the value of the krAmTag property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getKrAmTag()
     */
    public void setKrAmTag(Integer value) {
        this.krAmTag = value;
    }

    /**
     * Aktivierung zusätzlicher Eingabefelder für jährliche Sonderkündigungsrechte
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isJhrlFlag() {
        return jhrlFlag;
    }

    /**
     * Sets the value of the jhrlFlag property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isJhrlFlag()
     */
    public void setJhrlFlag(Boolean value) {
        this.jhrlFlag = value;
    }

    /**
     * Tag für ein jährliches Verfügungsrecht (Sparanlagen) bzw. jährliches Sondertilgungsrecht
     * (Darlehen) (nur bei Periodizität 'jaehrlich am')
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getJhrlAmTag() {
        return jhrlAmTag;
    }

    /**
     * Sets the value of the jhrlAmTag property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getJhrlAmTag()
     */
    public void setJhrlAmTag(Integer value) {
        this.jhrlAmTag = value;
    }

    /**
     * Monat für ein jährliches Verfügungsrecht (Sparanlagen) bzw. jährliches Sondertilgungsrecht
     * (Darlehen) (nur bei Periodizität 'jaehrlich am')
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getJhrlAmMonat() {
        return jhrlAmMonat;
    }

    /**
     * Sets the value of the jhrlAmMonat property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getJhrlAmMonat()
     */
    public void setJhrlAmMonat(Integer value) {
        this.jhrlAmMonat = value;
    }

    /**
     * Untere Betragsgrenze des jährlichen Verfügungsrechts (Sparanlagen) bzw. des jährlichen
     * Sondertilgungsrechts (Darlehen)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getJhrlHoeheVon() {
        return jhrlHoeheVon;
    }

    /**
     * Sets the value of the jhrlHoeheVon property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getJhrlHoeheVon()
     */
    public void setJhrlHoeheVon(Double value) {
        this.jhrlHoeheVon = value;
    }

    /**
     * Obere Betragsgrenze des jährlichen Verfügungsrechts (Sparanlagen) bzw. des jährlichen
     * Sondertilgungsrechts (Darlehen)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getJhrlHoeheBis() {
        return jhrlHoeheBis;
    }

    /**
     * Sets the value of the jhrlHoeheBis property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getJhrlHoeheBis()
     */
    public void setJhrlHoeheBis(Double value) {
        this.jhrlHoeheBis = value;
    }

    /**
     * Gibt an, ob das Recht in mehreren Teilbeträgen ausgeübt werden (Häkchen gesetzt) oder nur in
     * einem Betrag im Gültigkeitszeitraum ausgeübt werden kann (Häkchen nicht gesetzt)
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isJhrlOptionTeilbar() {
        return jhrlOptionTeilbar;
    }

    /**
     * Sets the value of the jhrlOptionTeilbar property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isJhrlOptionTeilbar()
     */
    public void setJhrlOptionTeilbar(Boolean value) {
        this.jhrlOptionTeilbar = value;
    }

    /**
     * Jahr, in dem ein jährliches Sondertilgungsrecht für Darlehen erstmalig ausgeübt werden darf
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getJhrlErstmaligJahr() {
        return jhrlErstmaligJahr;
    }

    /**
     * Sets the value of the jhrlErstmaligJahr property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getJhrlErstmaligJahr()
     */
    public void setJhrlErstmaligJahr(Integer value) {
        this.jhrlErstmaligJahr = value;
    }

    /**
     * Das Recht wird als amerikanisches Recht von Kalendermonat zu Kalendermonat (vom 1. bis Ultimo
     * jedes Monats), erstes Recht beginnt am Geschäftsbeginn plus Kündigungssperrfrist, letztes Recht
     * endet am Geschäftsende.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMtlFlag() {
        return mtlFlag;
    }

    /**
     * Sets the value of the mtlFlag property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMtlFlag()
     */
    public void setMtlFlag(Boolean value) {
        this.mtlFlag = value;
    }

    /**
     * Untere Betragsgrenze des monatlichen Verfügungsrechts für Sparanlagen
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMtlHoeheVon() {
        return mtlHoeheVon;
    }

    /**
     * Sets the value of the mtlHoeheVon property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMtlHoeheVon()
     */
    public void setMtlHoeheVon(Double value) {
        this.mtlHoeheVon = value;
    }

    /**
     * Ober Betragsgrenze des monatlichen Verfügungsrechts für Sparanlagen
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMtlHoeheBis() {
        return mtlHoeheBis;
    }

    /**
     * Sets the value of the mtlHoeheBis property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMtlHoeheBis()
     */
    public void setMtlHoeheBis(Double value) {
        this.mtlHoeheBis = value;
    }

    /**
     * Ganze Monate, die von Geschäftsbeginn aus gezählt werden. Erst nach der Kündigungssperrfirst ist
     * eine Kündigung / Verfügung möglich. Der Wert ist wichtig für die Eingabe des Beginndatums des
     * ersten Kündigungsrechts. Die Kündigungssperrfrist gilt für die drei oberen Eingabeblöcke
     * (Kündigungsrecht, jährliches Verfügungsrecht, monatliches Verfügungsrecht) gleichermaßen.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getKuendSperrFrist() {
        return kuendSperrFrist;
    }

    /**
     * Sets the value of the kuendSperrFrist property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getKuendSperrFrist()
     */
    public void setKuendSperrFrist(Integer value) {
        this.kuendSperrFrist = value;
    }

    /**
     * Flag, ob Kündigungsrecht für Darlehen nach Paragraph 489 BGB eingeräumt wird. Kündigungsrecht
     * nach 10 Jahren mit 6 Monaten Vorlaufzeit.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isKuendRecht489() {
        return kuendRecht489;
    }

    /**
     * Sets the value of the kuendRecht489 property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isKuendRecht489()
     */
    public void setKuendRecht489(Boolean value) {
        this.kuendRecht489 = value;
    }

    /**
     * Datum der vollständigen Darlehensauszahlung für die Berücksichtigung des Kündigungsrechts nach
     * Paragraph 489 BGB
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getVollstAuszahlungAm() {
        return vollstAuszahlungAm;
    }

    /**
     * Sets the value of the vollstAuszahlungAm property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getVollstAuszahlungAm()
     */
    public void setVollstAuszahlungAm(XMLGregorianCalendar value) {
        this.vollstAuszahlungAm = value;
    }

    /**
     * Periodizität des jährlichen Verfügungsrechts (Sparanlagen) bzw. des jährlichen
     * Sondertilgungsrechts (Darlehen)
     * Auswahl aus pro Laufzeitjahr, pro Kalenderjahr, jährlich am
     *
     * @return possible object is
     * {@link Periodizitaet }
     */
    public Periodizitaet getPeriodizitaetJaehrlichesVerfuegungsrecht() {
        return periodizitaetJaehrlichesVerfuegungsrecht;
    }

    /**
     * Sets the value of the periodizitaetJaehrlichesVerfuegungsrecht property.
     *
     * @param value allowed object is
     *              {@link Periodizitaet }
     * @see #getPeriodizitaetJaehrlichesVerfuegungsrecht()
     */
    public void setPeriodizitaetJaehrlichesVerfuegungsrecht(Periodizitaet value) {
        this.periodizitaetJaehrlichesVerfuegungsrecht = value;
    }

    /**
     * Periodizität des Kündigungsrechts für Sparanlagen.
     *
     * @return possible object is
     * {@link Periodizitaet }
     */
    public Periodizitaet getPeriodizitaetKuendigungsrecht() {
        return periodizitaetKuendigungsrecht;
    }

    /**
     * Sets the value of the periodizitaetKuendigungsrecht property.
     *
     * @param value allowed object is
     *              {@link Periodizitaet }
     * @see #getPeriodizitaetKuendigungsrecht()
     */
    public void setPeriodizitaetKuendigungsrecht(Periodizitaet value) {
        this.periodizitaetKuendigungsrecht = value;
    }

    /**
     * Art der Schwelle (Auswahl, Manuell, keine)
     *
     * @return possible object is
     * {@link SchwelleModus }
     */
    public SchwelleModus getSchwelleModus() {
        return schwelleModus;
    }

    /**
     * Sets the value of the schwelleModus property.
     *
     * @param value allowed object is
     *              {@link SchwelleModus }
     * @see #getSchwelleModus()
     */
    public void setSchwelleModus(SchwelleModus value) {
        this.schwelleModus = value;
    }

    /**
     * Art des Kündigungsrechts.
     *
     * @return possible object is
     * {@link ArtKuendigungsrechte }
     */
    public ArtKuendigungsrechte getArtKuendigungsrechte() {
        return artKuendigungsrechte;
    }

    /**
     * Sets the value of the artKuendigungsrechte property.
     *
     * @param value allowed object is
     *              {@link ArtKuendigungsrechte }
     * @see #getArtKuendigungsrechte()
     */
    public void setArtKuendigungsrechte(ArtKuendigungsrechte value) {
        this.artKuendigungsrechte = value;
    }

    /**
     * Ausübungsvariante des Kündigungsrechts.
     *
     * @return possible object is
     * {@link AusuebungKuendigungsrechte }
     */
    public AusuebungKuendigungsrechte getAusuebungKuendigungsrechte() {
        return ausuebungKuendigungsrechte;
    }

    /**
     * Sets the value of the ausuebungKuendigungsrechte property.
     *
     * @param value allowed object is
     *              {@link AusuebungKuendigungsrechte }
     * @see #getAusuebungKuendigungsrechte()
     */
    public void setAusuebungKuendigungsrechte(AusuebungKuendigungsrechte value) {
        this.ausuebungKuendigungsrechte = value;
    }

    /**
     * Ausübungsverhalten (optional, eingeschränkt optional, statistisch)
     *
     * @return possible object is
     * {@link Ausuebungsverhalten }
     */
    public Ausuebungsverhalten getAusuebungsverhalten() {
        return ausuebungsverhalten;
    }

    /**
     * Sets the value of the ausuebungsverhalten property.
     *
     * @param value allowed object is
     *              {@link Ausuebungsverhalten }
     * @see #getAusuebungsverhalten()
     */
    public void setAusuebungsverhalten(Ausuebungsverhalten value) {
        this.ausuebungsverhalten = value;
    }

    /**
     * Ausübungsfunktion (standard, individuell)
     *
     * @return possible object is
     * {@link Ausuebungsfunktion }
     */
    public Ausuebungsfunktion getAusuebungsfunktion() {
        return ausuebungsfunktion;
    }

    /**
     * Sets the value of the ausuebungsfunktion property.
     *
     * @param value allowed object is
     *              {@link Ausuebungsfunktion }
     * @see #getAusuebungsfunktion()
     */
    public void setAusuebungsfunktion(Ausuebungsfunktion value) {
        this.ausuebungsfunktion = value;
    }

    /**
     * Ausübungswahrscheinlichkeit in Prozent
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAusuebungswahrscheinlichkeit() {
        return ausuebungswahrscheinlichkeit;
    }

    /**
     * Sets the value of the ausuebungswahrscheinlichkeit property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAusuebungswahrscheinlichkeit()
     */
    public void setAusuebungswahrscheinlichkeit(Double value) {
        this.ausuebungswahrscheinlichkeit = value;
    }

    /**
     * Zinsvorteilgrenze für die Standardausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getStandardZinsvorteilgrenze() {
        return standardZinsvorteilgrenze;
    }

    /**
     * Sets the value of the standardZinsvorteilgrenze property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getStandardZinsvorteilgrenze()
     */
    public void setStandardZinsvorteilgrenze(Double value) {
        this.standardZinsvorteilgrenze = value;
    }

    /**
     * Parameter A1 für die Standardausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getStandardA1() {
        return standardA1;
    }

    /**
     * Sets the value of the standardA1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getStandardA1()
     */
    public void setStandardA1(Double value) {
        this.standardA1 = value;
    }

    /**
     * Parameter B1 für die Standardausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getStandardB1() {
        return standardB1;
    }

    /**
     * Sets the value of the standardB1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getStandardB1()
     */
    public void setStandardB1(Double value) {
        this.standardB1 = value;
    }

    /**
     * Parameter C1 für die Standardausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getStandardC1() {
        return standardC1;
    }

    /**
     * Sets the value of the standardC1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getStandardC1()
     */
    public void setStandardC1(Double value) {
        this.standardC1 = value;
    }

    /**
     * Parameter A2 für die Standardausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getStandardA2() {
        return standardA2;
    }

    /**
     * Sets the value of the standardA2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getStandardA2()
     */
    public void setStandardA2(Double value) {
        this.standardA2 = value;
    }

    /**
     * Parameter B2 für die Standardausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getStandardB2() {
        return standardB2;
    }

    /**
     * Sets the value of the standardB2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getStandardB2()
     */
    public void setStandardB2(Double value) {
        this.standardB2 = value;
    }

    /**
     * Parameter C2 für die Standardausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getStandardC2() {
        return standardC2;
    }

    /**
     * Sets the value of the standardC2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getStandardC2()
     */
    public void setStandardC2(Double value) {
        this.standardC2 = value;
    }

    /**
     * Zinsvorteilgrenze für die individuelle Ausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getIndividuellZinsvorteilgrenze() {
        return individuellZinsvorteilgrenze;
    }

    /**
     * Sets the value of the individuellZinsvorteilgrenze property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getIndividuellZinsvorteilgrenze()
     */
    public void setIndividuellZinsvorteilgrenze(Double value) {
        this.individuellZinsvorteilgrenze = value;
    }

    /**
     * Parameter A1 für die individuelle Ausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getIndividuellA1() {
        return individuellA1;
    }

    /**
     * Sets the value of the individuellA1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getIndividuellA1()
     */
    public void setIndividuellA1(Double value) {
        this.individuellA1 = value;
    }

    /**
     * Parameter B1 für die individuelle Ausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getIndividuellB1() {
        return individuellB1;
    }

    /**
     * Sets the value of the individuellB1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getIndividuellB1()
     */
    public void setIndividuellB1(Double value) {
        this.individuellB1 = value;
    }

    /**
     * Parameter C1 für die individuelle Ausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getIndividuellC1() {
        return individuellC1;
    }

    /**
     * Sets the value of the individuellC1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getIndividuellC1()
     */
    public void setIndividuellC1(Double value) {
        this.individuellC1 = value;
    }

    /**
     * Parameter A2 für die individuelle Ausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getIndividuellA2() {
        return individuellA2;
    }

    /**
     * Sets the value of the individuellA2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getIndividuellA2()
     */
    public void setIndividuellA2(Double value) {
        this.individuellA2 = value;
    }

    /**
     * Parameter B2 für die individuelle Ausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getIndividuellB2() {
        return individuellB2;
    }

    /**
     * Sets the value of the individuellB2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getIndividuellB2()
     */
    public void setIndividuellB2(Double value) {
        this.individuellB2 = value;
    }

    /**
     * Parameter C2 für die individuelle Ausübungsfunktion
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getIndividuellC2() {
        return individuellC2;
    }

    /**
     * Sets the value of the individuellC2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getIndividuellC2()
     */
    public void setIndividuellC2(Double value) {
        this.individuellC2 = value;
    }

    /**
     * Wenn das Flag aktiviert ist, wird in der Berechnung des Optionspreises der Margenbarwert nicht
     * mit abgesichert. Der Optionspreis fällt niedriger aus.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMargenbarwertsicherung() {
        return margenbarwertsicherung;
    }

    /**
     * Sets the value of the margenbarwertsicherung property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMargenbarwertsicherung()
     */
    public void setMargenbarwertsicherung(Boolean value) {
        this.margenbarwertsicherung = value;
    }

    /**
     * Berechnungsmodell für die impliziten Optionen.
     *
     * @return possible object is
     * {@link ImplOptModell }
     */
    public ImplOptModell getImplOptModell() {
        return implOptModell;
    }

    /**
     * Sets the value of the implOptModell property.
     *
     * @param value allowed object is
     *              {@link ImplOptModell }
     * @see #getImplOptModell()
     */
    public void setImplOptModell(ImplOptModell value) {
        this.implOptModell = value;
    }

    /**
     * Daten für optionale Tilgungsrechte (Darlehen) bzw. Verfügungsrechte/Kündigungsrechte (Sparen).
     *
     * @return possible object is
     * {@link Optionsrechte }
     */
    public Optionsrechte getOptionsrechte() {
        return optionsrechte;
    }

    /**
     * Sets the value of the optionsrechte property.
     *
     * @param value allowed object is
     *              {@link Optionsrechte }
     * @see #getOptionsrechte()
     */
    public void setOptionsrechte(Optionsrechte value) {
        this.optionsrechte = value;
    }

}
