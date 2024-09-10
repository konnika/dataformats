
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Nebenkosten und Gebühren.
 *
 * <p>Java class for Nebenkosten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Nebenkosten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="abschlag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="gebuehrAbschlagBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="aufschlag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="gebuehrAufschlagBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="anfangBereitstellungszins" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="bereitstZinsAufNombetrag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="bereitstZinsBerechnen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="bereitstellungszins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="disagiosplitting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="disagiosplittingmethode" type="{http://www.gillardon.de/marzipan/integrationsservice}Disagiosplittingmethode" minOccurs="0"/>
 *         <element name="zeitraumDisagiosplitting" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="modusBereitstellungszins" type="{http://www.gillardon.de/marzipan/integrationsservice}ModusBereitstellungszins" minOccurs="0"/>
 *         <element name="forwardAufschlagAusweisen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="zinsaufschlagfreieZeit" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="anzahlZinsaufschlagfreieMonate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="berechnungsbasisVergleichsdarlehen" type="{http://www.gillardon.de/marzipan/integrationsservice}BerechnungsbasisVergleichsdarlehen" minOccurs="0"/>
 *         <element name="sepGebuehrAmAuszTag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="gebuehrenverteilungMethode" type="{http://www.gillardon.de/marzipan/integrationsservice}GebuehrenverteilungMethode" minOccurs="0"/>
 *         <element name="gebuehrenverteilungZeitraum" type="{http://www.gillardon.de/marzipan/integrationsservice}GebuehrenverteilungZeitraum" minOccurs="0"/>
 *         <element name="gebuehrenverteilungBis" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="kreditunabhaengigeKosten" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kreditunKostenMitfinanz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="versicherungsKosten" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="versichKostenMitfinanz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="notarKosten" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="notarKostenMitfinanz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="sonstigeKosten" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="sonstigeKostenMitfinanz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="forwardVorgabewert" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="einmalkosten" type="{http://www.gillardon.de/marzipan/integrationsservice}Einmalkosten" minOccurs="0"/>
 *         <element name="regelmaessigeKostenBetrag" type="{http://www.gillardon.de/marzipan/integrationsservice}RegelmaessigeKostenBetrag" minOccurs="0"/>
 *         <element name="regelmaessigeKostenProzent" type="{http://www.gillardon.de/marzipan/integrationsservice}RegelmaessigeKostenProzent" minOccurs="0"/>
 *         <element name="sonsKostenPAngVEffzinsrel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="lsKostenPAngVEffzinsrel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="lskZahlungsweise" type="{http://www.gillardon.de/marzipan/integrationsservice}Perannoangabe" minOccurs="0"/>
 *         <element name="lskErsteGebuehr" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="lskFolgend" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="maximalerNominalzinsCap" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="capPraemieNkt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="verrechnungsartCap" type="{http://www.gillardon.de/marzipan/integrationsservice}VerrechnungsartCap" minOccurs="0"/>
 *         <element name="bearbeitungsgebuehrNkt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nebenkosten", propOrder = {

})
public class Nebenkosten {

    /**
     * Prozentsatz der einmaligen Gebühr bezogen auf den Nominalbetrag, um den der Auszahlungsbetrag
     * vermindert wird.
     */
    protected Double abschlag;
    /**
     * Betrag der einmaligen Gebühr, um den der Auszahlungsbetrag vermindert wird.
     */
    protected Double gebuehrAbschlagBetrag;
    /**
     * Prozentsatz der einmaligen Gebühr bezogen auf den Nominalbetrag, um welchen der Zinssaldo erhöht
     * wird.
     */
    protected Double aufschlag;
    /**
     * Betrag der einmaligen Gebühr, um den der Zinssaldo erhöht wird.
     */
    protected Double gebuehrAufschlagBetrag;
    /**
     * Ab diesem Termin wird der Bereitstellungszins in Rechnung gestellt. Der Bereitstellungszins kann
     * mit jeder Auszahlung oder zu jedem Zinstermin gezahlt werden.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar anfangBereitstellungszins;
    /**
     * Soll als Grundwert für die Berechnung der Bereitstellungszinsen immer der Nominalbetrag oder die
     * aktuelle Restschuld herangezogen werden?
     */
    protected Boolean bereitstZinsAufNombetrag;
    /**
     * Soll der Bereitstellungszins bei der Berechnung berücksichtigt werden oder soll nur im Ausdruck
     * ein Hinweis auf gegebenenfalls fällige Bereitstellungszinsen gegeben werden.
     */
    protected Boolean bereitstZinsBerechnen;
    /**
     * Zins, der für den zu diesem Zeitpunkt noch nicht ausgezahlten Darlehensbetrag fällig wird.
     */
    protected Double bereitstellungszins;
    /**
     * Wenn dieses Flag aktiviert ist, beziehen sich die Gebühren (als Auf- oder Abschlag) nicht nur
     * auf den Zeitraum bis zum Zinsbindungsende, sondern darüber hinaus. Zum Ende der Zinsbindung wird
     * eine Gebührenerstattung ausbezahlt.
     * Wird für Effektivzinslaufzeit PAngV die Auswahl Gesamtlaufzeit bzw. vereinbartes Laufzeitende
     * vereinbart, so werden die ggf. noch nicht verbrauchten Gebühren erstattet und beim Folgedarlehen
     * als separate Gebühr eingestellt.
     * Der Zeitraum auf den die Gebühren verrechnet werden, ist manuell vorzugeben und muss bei Vorgabe
     * von Effektivzinslaufzeit Gesamtlaufzeit bzw. vereinbartes Laufzeitende mit der Gesamtlaufzeit
     * bzw. mit dem Zeitraum bis zum vereinbarten  Laufzeitende übereinstimmen.
     */
    protected Boolean disagiosplitting;
    /**
     * Laufzeitproportional:
     * Zum Ende der Zinsbindung wird eine Gebührenerstattung ausbezahlt, die sich nach der Laufzeit im
     * Verhältnis zum Verrechnungszeitraum richtet. Soll der Effektivzins bis zum Ende der
     * Gesamtlaufzeit bzw. zum vereinbarten Laufzeitende berechnet werden, werden die am Ende der
     * Zinsbindung erstatteten Gebühren als separate Kosten in den Kreditzahlungsstrom eingestellt.
     * Restschuldproportional
     * Zum Ende der Zinsbindung wird eine Gebührenerstattung ausbezahlt, die sich nach der Höhe der
     * Restschuld im Verhältnis zum anfänglichen Zinssaldo richtet.
     * Soll der Effektivzins bis zum Ende der Gesamtlaufzeit bzw. zum vereinbarten Laufzeitende
     * berechnet werden, werden die am Ende der Zinsbindung erstatteten Gebühren als separate Kosten in
     * den Kreditzahlungsstrom eingestellt.
     */
    @XmlSchemaType(name = "string")
    protected Disagiosplittingmethode disagiosplittingmethode;
    /**
     * Verrechnungszeitraum, der als Grundlage für die Gebührenerstattung herangezogen wird.
     */
    protected Double zeitraumDisagiosplitting;
    /**
     * MARZIPAN Web kann die Bereitstellungszinsen entweder mit jeder Auszahlung oder jeweils am
     * Zinstermin berechnen. Bereitstellungszinsen werden immer separat gezahlt.
     * BEREIT_PRO_AUSZAHLUNG BEREIT_PRO_ZINSTERMIN
     */
    @XmlSchemaType(name = "string")
    protected ModusBereitstellungszins modusBereitstellungszins;
    /**
     * Soll ein Forwardaufschlag ausgewiesen werden? Schaltet bei Auswahl Ja die weiteren Felder zur
     * Berechnung des Forwardaufschlags frei. Deaktiviert bei Auswahl Ja auch die Checkbox
     * Bereitstellungszins berechnen.
     */
    protected Boolean forwardAufschlagAusweisen;
    /**
     * Datum, bis zu dem kein Forward-Zins berechnet wird. Korrespondiert mit Feld Anzahl
     * zinsaufschlagfreie Monate.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zinsaufschlagfreieZeit;
    /**
     * Zeit in Monaten, bis zu der kein Forward-Zins berechnet wird.
     */
    protected Double anzahlZinsaufschlagfreieMonate;
    /**
     * Berechnungsbasis für das zur Forward-Berechnung herangezogene Darlehen. Die Befüllung ist
     * abhängig von der Auswahl der Berechnungsbasis in der Grunddatenmaske.
     * Im Einzelnen: Nominalzins (angeboten bei Effektiv, Marge, Deckungsbeitrag); Margenbarwert
     * (angeboten bei Marge, Deckungsbeitrag); Marge in Prozent (angeboten bei Marge, Deckungsbeitrag);
     * BASIS_VGLDARLEHEN_NOMINAL BASIS_VGLDARLEHEN_MARGE_BARWERT BASIS_VGLDARLEHEN_MARGE_PROZENT
     * BASIS_VGLDARLEHEN_NETTOMARGE_BARWERT BASIS_VGLDARLEHEN_NETTOMARGE_PROZENT
     */
    @XmlSchemaType(name = "string")
    protected BerechnungsbasisVergleichsdarlehen berechnungsbasisVergleichsdarlehen;
    /**
     * Separate Gebühr am Auszahlungstag als Betrag.
     */
    protected Double sepGebuehrAmAuszTag;
    /**
     * Art der Gebührenverteilung (laufzeitproportional, nominalzinsproportional).
     * GEBUEHRENVERTEILUNG_LAUFZEITPROPORTIONAL GEBUEHRENVERTEILUNG_NOMINALZINSPROPORTIONAL
     */
    @XmlSchemaType(name = "string")
    protected GebuehrenverteilungMethode gebuehrenverteilungMethode;
    /**
     * Liquiditätsbindungsende: Zur Kalkulation der unverbrauchten Gebühr wird das
     * Liquiditätsbindungsende verwendet. Anderes Datum: Zur Kalkulation der unverbrauchten Gebühr wird
     * das Datum Gebührenverteilung bis verwendet. Die Gebühr wird zeitanteilig verteilt.
     * LIQUIDITAETSBINDUNGSENDE KEINE ANDERES_DATUM
     */
    @XmlSchemaType(name = "string")
    protected GebuehrenverteilungZeitraum gebuehrenverteilungZeitraum;
    /**
     * Eingabe des Datums zur Gebührenverteilung. Das Datum Gebührenverteilung bis darf nicht vor dem
     * Liquiditätsbindungsende liegen.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gebuehrenverteilungBis;
    /**
     * Kreditunabhängige Kosten (eingeführt im Rahmen der Verbraucherkreditrichtlinie)
     */
    protected Double kreditunabhaengigeKosten;
    /**
     * Sollen kreditunabhängige Kosten separat bezahlt oder mitfinanziert werden?
     */
    protected Boolean kreditunKostenMitfinanz;
    /**
     * Versicherungskosten ohne Einfluss auf die Kreditvergabe (eingeführt im Rahmen der
     * Verbraucherkreditrichtlinie)
     */
    protected Double versicherungsKosten;
    /**
     * Sollen Versicherungskosten separat bezahlt oder mitfinanziert werden?
     */
    protected Boolean versichKostenMitfinanz;
    /**
     * Notarkosten (eingeführt im Rahmen der Verbraucherkreditrichtlinie).
     */
    protected Double notarKosten;
    /**
     * Sollen Notarkosten separat bezahlt oder mitfinanziert werden?
     */
    protected Boolean notarKostenMitfinanz;
    /**
     * Sonstige Kosten (eingeführt im Rahmen der Verbraucherkreditrichtlinie).
     */
    protected Double sonstigeKosten;
    /**
     * Sollen sonstige Kosten separat bezahlt oder mitfinanziert werden?
     */
    protected Boolean sonstigeKostenMitfinanz;
    /**
     * Vorgabewert, auf dessen Grundlage der Nominalzins für das Darlehen
     * mit Auszahlung "heute" (d.h. zum Kalkulationsdatum der Zinsstruktur)
     * ermittelt wird. In der Regel ist dies der entsprechende Wert aus dem
     * Forward Darlehen. Hiervon abweichende Vorgaben sind möglich.
     */
    protected Double forwardVorgabewert;
    /**
     * Einmalkosten als Betrag bezogen auf die Gesamtlaufzeit.
     */
    protected Einmalkosten einmalkosten;
    /**
     * Regelmäßige Kosten als Betrag.
     */
    protected RegelmaessigeKostenBetrag regelmaessigeKostenBetrag;
    /**
     * Regelmäßige Kosten als Prozentsatz der Restschuld
     */
    protected RegelmaessigeKostenProzent regelmaessigeKostenProzent;
    /**
     * Einmalige am Auszahlungsdatum fällige PAngV-effektivzinsrelevante Kosten
     */
    protected Double sonsKostenPAngVEffzinsrel;
    /**
     * Höhe der laufenden sonstige PAngV-effektivzinsrelevanten Kosten
     */
    protected Double lsKostenPAngVEffzinsrel;
    /**
     * Angabe, in welchen Abständen die laufenden sonstigen Kosten fällig werden.
     * Im Einzelnen: monatlich; zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     * PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERTELJAEHRLICH PA_ZWEIMONATLICH PA_MONATLICH
     */
    @XmlSchemaType(name = "string")
    protected Perannoangabe lskZahlungsweise;
    /**
     * Datum, an dem die laufenden sonstigen Kosten zum ersten Mal fällig werden.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lskErsteGebuehr;
    /**
     * Datum, an dem die laufenden sonstigen Kosten zum ersten Mal fällig werden.
     */
    protected Integer lskFolgend;
    /**
     * Zinsobergrenze - Maximaler Nominalzins auf den Block CAP-Parämie(auf den Reiter Nebenkosten)
     */
    protected Double maximalerNominalzinsCap;
    /**
     * Bei einem variablen Darlehen (Beachte: im Grunddatendialog muss der Nominalzins auf variabel
     * gestellt sein) kann eine CAP vereinbart werden, das heißt eine Obergrenze für den Kundenzins.
     * Dieser CAP ist eine Zinsoption, für die dem Kunden eine Prämie in Rechnung gestellt werden kann.
     * Diese Prämie kann hier eingestellt werden. Sie wird im Darlehen entweder mitfinanziert
     * (Aufschlag) oder separat gezahlt (Abschlag). Die CAP-Prämie fließt analog einer Gebühr in den
     * Effektivzins ein.
     * Der maximale Nominalzins, das heißt die Zinsobergrenze, hat nur informativen Charakter.
     */
    protected Double capPraemieNkt;
    /**
     * Verrechnungsart der CAP-Prämie (auf den Reiter Nebenkosten): Aufschlag / Abschlag.
     * VERRECHNUNGSART_AUFSCHLAG VERRECHNUNGSART_ABSCHLAG
     */
    @XmlSchemaType(name = "string")
    protected VerrechnungsartCap verrechnungsartCap;
    /**
     * Separate zum Zeitpunkt Auszahlungsdatum fällige Bearbeitungsgebühr, die auf den Zinssaldo
     * verrechnet wird.
     */
    protected Double bearbeitungsgebuehrNkt;

    /**
     * Prozentsatz der einmaligen Gebühr bezogen auf den Nominalbetrag, um den der Auszahlungsbetrag
     * vermindert wird.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAbschlag() {
        return abschlag;
    }

    /**
     * Sets the value of the abschlag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAbschlag()
     */
    public void setAbschlag(Double value) {
        this.abschlag = value;
    }

    /**
     * Betrag der einmaligen Gebühr, um den der Auszahlungsbetrag vermindert wird.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGebuehrAbschlagBetrag() {
        return gebuehrAbschlagBetrag;
    }

    /**
     * Sets the value of the gebuehrAbschlagBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getGebuehrAbschlagBetrag()
     */
    public void setGebuehrAbschlagBetrag(Double value) {
        this.gebuehrAbschlagBetrag = value;
    }

    /**
     * Prozentsatz der einmaligen Gebühr bezogen auf den Nominalbetrag, um welchen der Zinssaldo erhöht
     * wird.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAufschlag() {
        return aufschlag;
    }

    /**
     * Sets the value of the aufschlag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAufschlag()
     */
    public void setAufschlag(Double value) {
        this.aufschlag = value;
    }

    /**
     * Betrag der einmaligen Gebühr, um den der Zinssaldo erhöht wird.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGebuehrAufschlagBetrag() {
        return gebuehrAufschlagBetrag;
    }

    /**
     * Sets the value of the gebuehrAufschlagBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getGebuehrAufschlagBetrag()
     */
    public void setGebuehrAufschlagBetrag(Double value) {
        this.gebuehrAufschlagBetrag = value;
    }

    /**
     * Ab diesem Termin wird der Bereitstellungszins in Rechnung gestellt. Der Bereitstellungszins kann
     * mit jeder Auszahlung oder zu jedem Zinstermin gezahlt werden.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAnfangBereitstellungszins() {
        return anfangBereitstellungszins;
    }

    /**
     * Sets the value of the anfangBereitstellungszins property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAnfangBereitstellungszins()
     */
    public void setAnfangBereitstellungszins(XMLGregorianCalendar value) {
        this.anfangBereitstellungszins = value;
    }

    /**
     * Soll als Grundwert für die Berechnung der Bereitstellungszinsen immer der Nominalbetrag oder die
     * aktuelle Restschuld herangezogen werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBereitstZinsAufNombetrag() {
        return bereitstZinsAufNombetrag;
    }

    /**
     * Sets the value of the bereitstZinsAufNombetrag property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isBereitstZinsAufNombetrag()
     */
    public void setBereitstZinsAufNombetrag(Boolean value) {
        this.bereitstZinsAufNombetrag = value;
    }

    /**
     * Soll der Bereitstellungszins bei der Berechnung berücksichtigt werden oder soll nur im Ausdruck
     * ein Hinweis auf gegebenenfalls fällige Bereitstellungszinsen gegeben werden.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBereitstZinsBerechnen() {
        return bereitstZinsBerechnen;
    }

    /**
     * Sets the value of the bereitstZinsBerechnen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isBereitstZinsBerechnen()
     */
    public void setBereitstZinsBerechnen(Boolean value) {
        this.bereitstZinsBerechnen = value;
    }

    /**
     * Zins, der für den zu diesem Zeitpunkt noch nicht ausgezahlten Darlehensbetrag fällig wird.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBereitstellungszins() {
        return bereitstellungszins;
    }

    /**
     * Sets the value of the bereitstellungszins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBereitstellungszins()
     */
    public void setBereitstellungszins(Double value) {
        this.bereitstellungszins = value;
    }

    /**
     * Wenn dieses Flag aktiviert ist, beziehen sich die Gebühren (als Auf- oder Abschlag) nicht nur
     * auf den Zeitraum bis zum Zinsbindungsende, sondern darüber hinaus. Zum Ende der Zinsbindung wird
     * eine Gebührenerstattung ausbezahlt.
     * Wird für Effektivzinslaufzeit PAngV die Auswahl Gesamtlaufzeit bzw. vereinbartes Laufzeitende
     * vereinbart, so werden die ggf. noch nicht verbrauchten Gebühren erstattet und beim Folgedarlehen
     * als separate Gebühr eingestellt.
     * Der Zeitraum auf den die Gebühren verrechnet werden, ist manuell vorzugeben und muss bei Vorgabe
     * von Effektivzinslaufzeit Gesamtlaufzeit bzw. vereinbartes Laufzeitende mit der Gesamtlaufzeit
     * bzw. mit dem Zeitraum bis zum vereinbarten  Laufzeitende übereinstimmen.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDisagiosplitting() {
        return disagiosplitting;
    }

    /**
     * Sets the value of the disagiosplitting property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isDisagiosplitting()
     */
    public void setDisagiosplitting(Boolean value) {
        this.disagiosplitting = value;
    }

    /**
     * Laufzeitproportional:
     * Zum Ende der Zinsbindung wird eine Gebührenerstattung ausbezahlt, die sich nach der Laufzeit im
     * Verhältnis zum Verrechnungszeitraum richtet. Soll der Effektivzins bis zum Ende der
     * Gesamtlaufzeit bzw. zum vereinbarten Laufzeitende berechnet werden, werden die am Ende der
     * Zinsbindung erstatteten Gebühren als separate Kosten in den Kreditzahlungsstrom eingestellt.
     * Restschuldproportional
     * Zum Ende der Zinsbindung wird eine Gebührenerstattung ausbezahlt, die sich nach der Höhe der
     * Restschuld im Verhältnis zum anfänglichen Zinssaldo richtet.
     * Soll der Effektivzins bis zum Ende der Gesamtlaufzeit bzw. zum vereinbarten Laufzeitende
     * berechnet werden, werden die am Ende der Zinsbindung erstatteten Gebühren als separate Kosten in
     * den Kreditzahlungsstrom eingestellt.
     *
     * @return possible object is
     * {@link Disagiosplittingmethode }
     */
    public Disagiosplittingmethode getDisagiosplittingmethode() {
        return disagiosplittingmethode;
    }

    /**
     * Sets the value of the disagiosplittingmethode property.
     *
     * @param value allowed object is
     *              {@link Disagiosplittingmethode }
     * @see #getDisagiosplittingmethode()
     */
    public void setDisagiosplittingmethode(Disagiosplittingmethode value) {
        this.disagiosplittingmethode = value;
    }

    /**
     * Verrechnungszeitraum, der als Grundlage für die Gebührenerstattung herangezogen wird.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZeitraumDisagiosplitting() {
        return zeitraumDisagiosplitting;
    }

    /**
     * Sets the value of the zeitraumDisagiosplitting property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZeitraumDisagiosplitting()
     */
    public void setZeitraumDisagiosplitting(Double value) {
        this.zeitraumDisagiosplitting = value;
    }

    /**
     * MARZIPAN Web kann die Bereitstellungszinsen entweder mit jeder Auszahlung oder jeweils am
     * Zinstermin berechnen. Bereitstellungszinsen werden immer separat gezahlt.
     * BEREIT_PRO_AUSZAHLUNG BEREIT_PRO_ZINSTERMIN
     *
     * @return possible object is
     * {@link ModusBereitstellungszins }
     */
    public ModusBereitstellungszins getModusBereitstellungszins() {
        return modusBereitstellungszins;
    }

    /**
     * Sets the value of the modusBereitstellungszins property.
     *
     * @param value allowed object is
     *              {@link ModusBereitstellungszins }
     * @see #getModusBereitstellungszins()
     */
    public void setModusBereitstellungszins(ModusBereitstellungszins value) {
        this.modusBereitstellungszins = value;
    }

    /**
     * Soll ein Forwardaufschlag ausgewiesen werden? Schaltet bei Auswahl Ja die weiteren Felder zur
     * Berechnung des Forwardaufschlags frei. Deaktiviert bei Auswahl Ja auch die Checkbox
     * Bereitstellungszins berechnen.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isForwardAufschlagAusweisen() {
        return forwardAufschlagAusweisen;
    }

    /**
     * Sets the value of the forwardAufschlagAusweisen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isForwardAufschlagAusweisen()
     */
    public void setForwardAufschlagAusweisen(Boolean value) {
        this.forwardAufschlagAusweisen = value;
    }

    /**
     * Datum, bis zu dem kein Forward-Zins berechnet wird. Korrespondiert mit Feld Anzahl
     * zinsaufschlagfreie Monate.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getZinsaufschlagfreieZeit() {
        return zinsaufschlagfreieZeit;
    }

    /**
     * Sets the value of the zinsaufschlagfreieZeit property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getZinsaufschlagfreieZeit()
     */
    public void setZinsaufschlagfreieZeit(XMLGregorianCalendar value) {
        this.zinsaufschlagfreieZeit = value;
    }

    /**
     * Zeit in Monaten, bis zu der kein Forward-Zins berechnet wird.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAnzahlZinsaufschlagfreieMonate() {
        return anzahlZinsaufschlagfreieMonate;
    }

    /**
     * Sets the value of the anzahlZinsaufschlagfreieMonate property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAnzahlZinsaufschlagfreieMonate()
     */
    public void setAnzahlZinsaufschlagfreieMonate(Double value) {
        this.anzahlZinsaufschlagfreieMonate = value;
    }

    /**
     * Berechnungsbasis für das zur Forward-Berechnung herangezogene Darlehen. Die Befüllung ist
     * abhängig von der Auswahl der Berechnungsbasis in der Grunddatenmaske.
     * Im Einzelnen: Nominalzins (angeboten bei Effektiv, Marge, Deckungsbeitrag); Margenbarwert
     * (angeboten bei Marge, Deckungsbeitrag); Marge in Prozent (angeboten bei Marge, Deckungsbeitrag);
     * BASIS_VGLDARLEHEN_NOMINAL BASIS_VGLDARLEHEN_MARGE_BARWERT BASIS_VGLDARLEHEN_MARGE_PROZENT
     * BASIS_VGLDARLEHEN_NETTOMARGE_BARWERT BASIS_VGLDARLEHEN_NETTOMARGE_PROZENT
     *
     * @return possible object is
     * {@link BerechnungsbasisVergleichsdarlehen }
     */
    public BerechnungsbasisVergleichsdarlehen getBerechnungsbasisVergleichsdarlehen() {
        return berechnungsbasisVergleichsdarlehen;
    }

    /**
     * Sets the value of the berechnungsbasisVergleichsdarlehen property.
     *
     * @param value allowed object is
     *              {@link BerechnungsbasisVergleichsdarlehen }
     * @see #getBerechnungsbasisVergleichsdarlehen()
     */
    public void setBerechnungsbasisVergleichsdarlehen(BerechnungsbasisVergleichsdarlehen value) {
        this.berechnungsbasisVergleichsdarlehen = value;
    }

    /**
     * Separate Gebühr am Auszahlungstag als Betrag.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSepGebuehrAmAuszTag() {
        return sepGebuehrAmAuszTag;
    }

    /**
     * Sets the value of the sepGebuehrAmAuszTag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSepGebuehrAmAuszTag()
     */
    public void setSepGebuehrAmAuszTag(Double value) {
        this.sepGebuehrAmAuszTag = value;
    }

    /**
     * Art der Gebührenverteilung (laufzeitproportional, nominalzinsproportional).
     * GEBUEHRENVERTEILUNG_LAUFZEITPROPORTIONAL GEBUEHRENVERTEILUNG_NOMINALZINSPROPORTIONAL
     *
     * @return possible object is
     * {@link GebuehrenverteilungMethode }
     */
    public GebuehrenverteilungMethode getGebuehrenverteilungMethode() {
        return gebuehrenverteilungMethode;
    }

    /**
     * Sets the value of the gebuehrenverteilungMethode property.
     *
     * @param value allowed object is
     *              {@link GebuehrenverteilungMethode }
     * @see #getGebuehrenverteilungMethode()
     */
    public void setGebuehrenverteilungMethode(GebuehrenverteilungMethode value) {
        this.gebuehrenverteilungMethode = value;
    }

    /**
     * Liquiditätsbindungsende: Zur Kalkulation der unverbrauchten Gebühr wird das
     * Liquiditätsbindungsende verwendet. Anderes Datum: Zur Kalkulation der unverbrauchten Gebühr wird
     * das Datum Gebührenverteilung bis verwendet. Die Gebühr wird zeitanteilig verteilt.
     * LIQUIDITAETSBINDUNGSENDE KEINE ANDERES_DATUM
     *
     * @return possible object is
     * {@link GebuehrenverteilungZeitraum }
     */
    public GebuehrenverteilungZeitraum getGebuehrenverteilungZeitraum() {
        return gebuehrenverteilungZeitraum;
    }

    /**
     * Sets the value of the gebuehrenverteilungZeitraum property.
     *
     * @param value allowed object is
     *              {@link GebuehrenverteilungZeitraum }
     * @see #getGebuehrenverteilungZeitraum()
     */
    public void setGebuehrenverteilungZeitraum(GebuehrenverteilungZeitraum value) {
        this.gebuehrenverteilungZeitraum = value;
    }

    /**
     * Eingabe des Datums zur Gebührenverteilung. Das Datum Gebührenverteilung bis darf nicht vor dem
     * Liquiditätsbindungsende liegen.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getGebuehrenverteilungBis() {
        return gebuehrenverteilungBis;
    }

    /**
     * Sets the value of the gebuehrenverteilungBis property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getGebuehrenverteilungBis()
     */
    public void setGebuehrenverteilungBis(XMLGregorianCalendar value) {
        this.gebuehrenverteilungBis = value;
    }

    /**
     * Kreditunabhängige Kosten (eingeführt im Rahmen der Verbraucherkreditrichtlinie)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKreditunabhaengigeKosten() {
        return kreditunabhaengigeKosten;
    }

    /**
     * Sets the value of the kreditunabhaengigeKosten property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKreditunabhaengigeKosten()
     */
    public void setKreditunabhaengigeKosten(Double value) {
        this.kreditunabhaengigeKosten = value;
    }

    /**
     * Sollen kreditunabhängige Kosten separat bezahlt oder mitfinanziert werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isKreditunKostenMitfinanz() {
        return kreditunKostenMitfinanz;
    }

    /**
     * Sets the value of the kreditunKostenMitfinanz property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isKreditunKostenMitfinanz()
     */
    public void setKreditunKostenMitfinanz(Boolean value) {
        this.kreditunKostenMitfinanz = value;
    }

    /**
     * Versicherungskosten ohne Einfluss auf die Kreditvergabe (eingeführt im Rahmen der
     * Verbraucherkreditrichtlinie)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVersicherungsKosten() {
        return versicherungsKosten;
    }

    /**
     * Sets the value of the versicherungsKosten property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVersicherungsKosten()
     */
    public void setVersicherungsKosten(Double value) {
        this.versicherungsKosten = value;
    }

    /**
     * Sollen Versicherungskosten separat bezahlt oder mitfinanziert werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVersichKostenMitfinanz() {
        return versichKostenMitfinanz;
    }

    /**
     * Sets the value of the versichKostenMitfinanz property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isVersichKostenMitfinanz()
     */
    public void setVersichKostenMitfinanz(Boolean value) {
        this.versichKostenMitfinanz = value;
    }

    /**
     * Notarkosten (eingeführt im Rahmen der Verbraucherkreditrichtlinie).
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNotarKosten() {
        return notarKosten;
    }

    /**
     * Sets the value of the notarKosten property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNotarKosten()
     */
    public void setNotarKosten(Double value) {
        this.notarKosten = value;
    }

    /**
     * Sollen Notarkosten separat bezahlt oder mitfinanziert werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isNotarKostenMitfinanz() {
        return notarKostenMitfinanz;
    }

    /**
     * Sets the value of the notarKostenMitfinanz property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isNotarKostenMitfinanz()
     */
    public void setNotarKostenMitfinanz(Boolean value) {
        this.notarKostenMitfinanz = value;
    }

    /**
     * Sonstige Kosten (eingeführt im Rahmen der Verbraucherkreditrichtlinie).
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
     * Sollen sonstige Kosten separat bezahlt oder mitfinanziert werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSonstigeKostenMitfinanz() {
        return sonstigeKostenMitfinanz;
    }

    /**
     * Sets the value of the sonstigeKostenMitfinanz property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isSonstigeKostenMitfinanz()
     */
    public void setSonstigeKostenMitfinanz(Boolean value) {
        this.sonstigeKostenMitfinanz = value;
    }

    /**
     * Vorgabewert, auf dessen Grundlage der Nominalzins für das Darlehen
     * mit Auszahlung "heute" (d.h. zum Kalkulationsdatum der Zinsstruktur)
     * ermittelt wird. In der Regel ist dies der entsprechende Wert aus dem
     * Forward Darlehen. Hiervon abweichende Vorgaben sind möglich.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getForwardVorgabewert() {
        return forwardVorgabewert;
    }

    /**
     * Sets the value of the forwardVorgabewert property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getForwardVorgabewert()
     */
    public void setForwardVorgabewert(Double value) {
        this.forwardVorgabewert = value;
    }

    /**
     * Einmalkosten als Betrag bezogen auf die Gesamtlaufzeit.
     *
     * @return possible object is
     * {@link Einmalkosten }
     */
    public Einmalkosten getEinmalkosten() {
        return einmalkosten;
    }

    /**
     * Sets the value of the einmalkosten property.
     *
     * @param value allowed object is
     *              {@link Einmalkosten }
     * @see #getEinmalkosten()
     */
    public void setEinmalkosten(Einmalkosten value) {
        this.einmalkosten = value;
    }

    /**
     * Regelmäßige Kosten als Betrag.
     *
     * @return possible object is
     * {@link RegelmaessigeKostenBetrag }
     */
    public RegelmaessigeKostenBetrag getRegelmaessigeKostenBetrag() {
        return regelmaessigeKostenBetrag;
    }

    /**
     * Sets the value of the regelmaessigeKostenBetrag property.
     *
     * @param value allowed object is
     *              {@link RegelmaessigeKostenBetrag }
     * @see #getRegelmaessigeKostenBetrag()
     */
    public void setRegelmaessigeKostenBetrag(RegelmaessigeKostenBetrag value) {
        this.regelmaessigeKostenBetrag = value;
    }

    /**
     * Regelmäßige Kosten als Prozentsatz der Restschuld
     *
     * @return possible object is
     * {@link RegelmaessigeKostenProzent }
     */
    public RegelmaessigeKostenProzent getRegelmaessigeKostenProzent() {
        return regelmaessigeKostenProzent;
    }

    /**
     * Sets the value of the regelmaessigeKostenProzent property.
     *
     * @param value allowed object is
     *              {@link RegelmaessigeKostenProzent }
     * @see #getRegelmaessigeKostenProzent()
     */
    public void setRegelmaessigeKostenProzent(RegelmaessigeKostenProzent value) {
        this.regelmaessigeKostenProzent = value;
    }

    /**
     * Einmalige am Auszahlungsdatum fällige PAngV-effektivzinsrelevante Kosten
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSonsKostenPAngVEffzinsrel() {
        return sonsKostenPAngVEffzinsrel;
    }

    /**
     * Sets the value of the sonsKostenPAngVEffzinsrel property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSonsKostenPAngVEffzinsrel()
     */
    public void setSonsKostenPAngVEffzinsrel(Double value) {
        this.sonsKostenPAngVEffzinsrel = value;
    }

    /**
     * Höhe der laufenden sonstige PAngV-effektivzinsrelevanten Kosten
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLsKostenPAngVEffzinsrel() {
        return lsKostenPAngVEffzinsrel;
    }

    /**
     * Sets the value of the lsKostenPAngVEffzinsrel property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLsKostenPAngVEffzinsrel()
     */
    public void setLsKostenPAngVEffzinsrel(Double value) {
        this.lsKostenPAngVEffzinsrel = value;
    }

    /**
     * Angabe, in welchen Abständen die laufenden sonstigen Kosten fällig werden.
     * Im Einzelnen: monatlich; zweimonatlich; vierteljährlich; halbjährlich; jährlich;
     * PA_JAEHRLICH PA_HALBJAEHRLICH PA_VIERTELJAEHRLICH PA_ZWEIMONATLICH PA_MONATLICH
     *
     * @return possible object is
     * {@link Perannoangabe }
     */
    public Perannoangabe getLskZahlungsweise() {
        return lskZahlungsweise;
    }

    /**
     * Sets the value of the lskZahlungsweise property.
     *
     * @param value allowed object is
     *              {@link Perannoangabe }
     * @see #getLskZahlungsweise()
     */
    public void setLskZahlungsweise(Perannoangabe value) {
        this.lskZahlungsweise = value;
    }

    /**
     * Datum, an dem die laufenden sonstigen Kosten zum ersten Mal fällig werden.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLskErsteGebuehr() {
        return lskErsteGebuehr;
    }

    /**
     * Sets the value of the lskErsteGebuehr property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getLskErsteGebuehr()
     */
    public void setLskErsteGebuehr(XMLGregorianCalendar value) {
        this.lskErsteGebuehr = value;
    }

    /**
     * Datum, an dem die laufenden sonstigen Kosten zum ersten Mal fällig werden.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getLskFolgend() {
        return lskFolgend;
    }

    /**
     * Sets the value of the lskFolgend property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getLskFolgend()
     */
    public void setLskFolgend(Integer value) {
        this.lskFolgend = value;
    }

    /**
     * Zinsobergrenze - Maximaler Nominalzins auf den Block CAP-Parämie(auf den Reiter Nebenkosten)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMaximalerNominalzinsCap() {
        return maximalerNominalzinsCap;
    }

    /**
     * Sets the value of the maximalerNominalzinsCap property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMaximalerNominalzinsCap()
     */
    public void setMaximalerNominalzinsCap(Double value) {
        this.maximalerNominalzinsCap = value;
    }

    /**
     * Bei einem variablen Darlehen (Beachte: im Grunddatendialog muss der Nominalzins auf variabel
     * gestellt sein) kann eine CAP vereinbart werden, das heißt eine Obergrenze für den Kundenzins.
     * Dieser CAP ist eine Zinsoption, für die dem Kunden eine Prämie in Rechnung gestellt werden kann.
     * Diese Prämie kann hier eingestellt werden. Sie wird im Darlehen entweder mitfinanziert
     * (Aufschlag) oder separat gezahlt (Abschlag). Die CAP-Prämie fließt analog einer Gebühr in den
     * Effektivzins ein.
     * Der maximale Nominalzins, das heißt die Zinsobergrenze, hat nur informativen Charakter.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getCapPraemieNkt() {
        return capPraemieNkt;
    }

    /**
     * Sets the value of the capPraemieNkt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getCapPraemieNkt()
     */
    public void setCapPraemieNkt(Double value) {
        this.capPraemieNkt = value;
    }

    /**
     * Verrechnungsart der CAP-Prämie (auf den Reiter Nebenkosten): Aufschlag / Abschlag.
     * VERRECHNUNGSART_AUFSCHLAG VERRECHNUNGSART_ABSCHLAG
     *
     * @return possible object is
     * {@link VerrechnungsartCap }
     */
    public VerrechnungsartCap getVerrechnungsartCap() {
        return verrechnungsartCap;
    }

    /**
     * Sets the value of the verrechnungsartCap property.
     *
     * @param value allowed object is
     *              {@link VerrechnungsartCap }
     * @see #getVerrechnungsartCap()
     */
    public void setVerrechnungsartCap(VerrechnungsartCap value) {
        this.verrechnungsartCap = value;
    }

    /**
     * Separate zum Zeitpunkt Auszahlungsdatum fällige Bearbeitungsgebühr, die auf den Zinssaldo
     * verrechnet wird.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBearbeitungsgebuehrNkt() {
        return bearbeitungsgebuehrNkt;
    }

    /**
     * Sets the value of the bearbeitungsgebuehrNkt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBearbeitungsgebuehrNkt()
     */
    public void setBearbeitungsgebuehrNkt(Double value) {
        this.bearbeitungsgebuehrNkt = value;
    }

}
