
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Der globale komplexe Typ GedecktUngedeckt enthält die Daten für teilweise gedeckte Berechnung.
 *
 * <p>Java class for GedecktUngedeckt complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="GedecktUngedeckt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="aufteilungNominalesKonto" type="{http://www.gillardon.de/marzipan/integrationsservice}AufteilungNominalesKonto" minOccurs="0"/>
 *         <element name="beleihungswert" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="gedeckterAnteil" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="gedeckterAnteilBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="teilmarktUngedeckt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="startdatTilgungGedeckt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="tilgProzGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="tilgRateGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="einstandGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="einstandUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margeGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margeUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margenbarwertGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="margenbarwertUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeAllerTilgungenGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeAllerTilgungenUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeAllerZinsenGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeAllerZinsenUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeAllerAuszahlungenGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeAllerAuszahlungenUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeAllerMarginGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="summeAllerMarginUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="gedeckterTeilAusSicherheitenErmitteln" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GedecktUngedeckt", propOrder = {

})
public class GedecktUngedeckt {

    /**
     * Methode zur Aufteilung nominales Konto: linear oder einstandsoptimiert
     */
    @XmlSchemaType(name = "string")
    protected AufteilungNominalesKonto aufteilungNominalesKonto;
    /**
     * Beleihungswert der Sicherheit
     */
    protected Double beleihungswert;
    /**
     * Gedeckter Teil vom Beleihungswert in %
     */
    protected Double gedeckterAnteil;
    /**
     * Gedeckter Teil vom Beleihungswert in Betrag
     */
    protected Double gedeckterAnteilBetrag;
    /**
     * Name des Teilmarkts der Zinsstruktur für den ungedeckten Teil des Darlehens.
     * Wird bei der Kalkulation benötigt, wenn die Zinsstrukturen aus der Datenbank gelesen werden
     * sollen.
     */
    protected String teilmarktUngedeckt;
    /**
     * Datum des Tilgungsbeginns des gedeckten Teils
     * Nur bei Auswahl Darlehensart Teilweise gedeckt relevant
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startdatTilgungGedeckt;
    /**
     * Tilgungssatz des gedeckten Darlehensteils bezogen auf das Ursprungskapital in %
     * Nur bei Auswahl Darlehensart Teilweise gedeckt relevant
     */
    protected Double tilgProzGedeckt;
    /**
     * Tilgungsrate des gedeckten Teils
     * Nur bei Auswahl Darlehensart Teilweise gedeckt relevant
     */
    protected Double tilgRateGedeckt;
    /**
     * Der kalkulierte Einstand gedeckter Teil ist bei einer teilgedeckten Berechnung der Effektivzins
     * der strukturkongruenten Refinanzierung des gedeckten Teils des Darlehens. Er zeigt also an,
     * welchen Effektivzins die Bank bei zinsänderungsrisikofreier Refinanzierung auf der Passivseite
     * für den gedeckten Anteil zu bezahlen hat.
     */
    protected Double einstandGedeckt;
    /**
     * Der kalkulierte Einstand ungedeckter Teil ist bei einer teilgedeckten Berechnung der
     * Effektivzins der strukturkongruenten Refinanzierung des ungedeckten Teils des Darlehens. Er
     * zeigt also an, welchen Effektivzins die Bank bei zinsänderungsrisikofreier Refinanzierung auf
     * der Passivseite für den ungedeckten Anteil zu bezahlen hat.
     */
    protected Double einstandUngedeckt;
    /**
     * Die Marge % gedeckter Teil ist die Marge vor Kosten, welche die Bank auf der Basis der
     * strukturkongruenten Refinanzierung des gedeckten Teils des Darlehens erzielt. Die Marge ergibt
     * sich als Differenz von Einstand des Kundengeschäfts und Effektivzins des
     * Refinanzierungsgeschäfts des gedeckten Teils des Darlehens.
     * Nur bei Prolongation und teilgedeckt relevant
     */
    protected Double margeGedeckt;
    /**
     * Die Marge % ungedeckter Teil ist die Marge vor Kosten, welche die Bank auf der Basis der
     * strukturkongruenten Refinanzierung des ungedeckten Teils des Darlehens erzielt. Die Marge ergibt
     * sich als Differenz von Einstand des Kundengeschäfts und Effektivzins des
     * Refinanzierungsgeschäfts des ungedeckten Teils des Darlehens.
     * Nur bei Prolongation und teilgedeckt relevant
     */
    protected Double margeUngedeckt;
    /**
     * Die Marge % gedeckter Teil ist die Marge vor Kosten, welche die Bank auf der Basis der
     * strukturkongruenten Refinanzierung des gedeckten Teils des Darlehens erzielt. Die Marge ergibt
     * sich als Differenz von Einstand des Kundengeschäfts und Effektivzins des
     * Refinanzierungsgeschäfts des gedeckten Teils des Darlehens.
     * Nur bei Prolongation und teilgedeckt relevant
     */
    protected Double margenbarwertGedeckt;
    /**
     * Der Margenbarwert ungedeckter Teil ist der Betrag, den die Bank im Fall einer teilgedeckten
     * Berechnung bei strukturkongruenter Refinanzierung für den ungedeckten Anteil des Kredits sofort
     * entnehmen kann. In allen zukünftigen Zeitpunkten liegt dann ein Saldo von 0 zwischen
     * Aktivgeschäft und strukturkongruenter Refinanzierung vor.
     * Nur bei Prolongation und teilgedeckt relevant
     */
    protected Double margenbarwertUngedeckt;
    /**
     * Im Feld wird die Summe der Tilgungen ausgewiesen, die sich für den gedeckten Teil des Kredits
     * ergeben.
     * Nur bei Prolongation und teilgedeckt relevant
     */
    protected Double summeAllerTilgungenGedeckt;
    /**
     * Im Feld wird die Summe der Tilgungen ausgewiesen, die sich für den ungedeckten Teil des Kredits
     * ergeben.
     * Nur bei Prolongation und teilgedeckt relevant
     */
    protected Double summeAllerTilgungenUngedeckt;
    /**
     * Im Feld wird die Summe der anfallenden Zinsen ausgewiesen, die sich für den gedeckten Teil des
     * Kredits ergeben.
     * Nur bei Prolongation und teilgedeckt relevant
     */
    protected Double summeAllerZinsenGedeckt;
    /**
     * Im Feld wird die Summe der anfallenden Zinsen ausgewiesen, die sich für den ungedeckten Teil des
     * Kredits ergeben.
     * Nur bei Prolongation und teilgedeckt relevant
     */
    protected Double summeAllerZinsenUngedeckt;
    /**
     * Summe aller Auszahlungen gedeckter Teil
     */
    protected Double summeAllerAuszahlungenGedeckt;
    /**
     * Summe aller Auszahlungen ungedeckter Teil
     */
    protected Double summeAllerAuszahlungenUngedeckt;
    /**
     * Summe aller Auschläge für den gedeckten Teil
     * Nur bei Prolongation und teilgedeckt relevant
     */
    protected Double summeAllerMarginGedeckt;
    /**
     * Summe aller Aufschläge für den ungedeckten Teil
     * Nur bei Prolongation und teilgedeckt relevant
     */
    protected Double summeAllerMarginUngedeckt;
    /**
     * Soll der gedeckte Teil aus den Sicherheiten ermittelt werden?
     */
    protected Boolean gedeckterTeilAusSicherheitenErmitteln;

    /**
     * Methode zur Aufteilung nominales Konto: linear oder einstandsoptimiert
     *
     * @return possible object is
     * {@link AufteilungNominalesKonto }
     */
    public AufteilungNominalesKonto getAufteilungNominalesKonto() {
        return aufteilungNominalesKonto;
    }

    /**
     * Sets the value of the aufteilungNominalesKonto property.
     *
     * @param value allowed object is
     *              {@link AufteilungNominalesKonto }
     * @see #getAufteilungNominalesKonto()
     */
    public void setAufteilungNominalesKonto(AufteilungNominalesKonto value) {
        this.aufteilungNominalesKonto = value;
    }

    /**
     * Beleihungswert der Sicherheit
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBeleihungswert() {
        return beleihungswert;
    }

    /**
     * Sets the value of the beleihungswert property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBeleihungswert()
     */
    public void setBeleihungswert(Double value) {
        this.beleihungswert = value;
    }

    /**
     * Gedeckter Teil vom Beleihungswert in %
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGedeckterAnteil() {
        return gedeckterAnteil;
    }

    /**
     * Sets the value of the gedeckterAnteil property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getGedeckterAnteil()
     */
    public void setGedeckterAnteil(Double value) {
        this.gedeckterAnteil = value;
    }

    /**
     * Gedeckter Teil vom Beleihungswert in Betrag
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGedeckterAnteilBetrag() {
        return gedeckterAnteilBetrag;
    }

    /**
     * Sets the value of the gedeckterAnteilBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getGedeckterAnteilBetrag()
     */
    public void setGedeckterAnteilBetrag(Double value) {
        this.gedeckterAnteilBetrag = value;
    }

    /**
     * Name des Teilmarkts der Zinsstruktur für den ungedeckten Teil des Darlehens.
     * Wird bei der Kalkulation benötigt, wenn die Zinsstrukturen aus der Datenbank gelesen werden
     * sollen.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTeilmarktUngedeckt() {
        return teilmarktUngedeckt;
    }

    /**
     * Sets the value of the teilmarktUngedeckt property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getTeilmarktUngedeckt()
     */
    public void setTeilmarktUngedeckt(String value) {
        this.teilmarktUngedeckt = value;
    }

    /**
     * Datum des Tilgungsbeginns des gedeckten Teils
     * Nur bei Auswahl Darlehensart Teilweise gedeckt relevant
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStartdatTilgungGedeckt() {
        return startdatTilgungGedeckt;
    }

    /**
     * Sets the value of the startdatTilgungGedeckt property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getStartdatTilgungGedeckt()
     */
    public void setStartdatTilgungGedeckt(XMLGregorianCalendar value) {
        this.startdatTilgungGedeckt = value;
    }

    /**
     * Tilgungssatz des gedeckten Darlehensteils bezogen auf das Ursprungskapital in %
     * Nur bei Auswahl Darlehensart Teilweise gedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTilgProzGedeckt() {
        return tilgProzGedeckt;
    }

    /**
     * Sets the value of the tilgProzGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getTilgProzGedeckt()
     */
    public void setTilgProzGedeckt(Double value) {
        this.tilgProzGedeckt = value;
    }

    /**
     * Tilgungsrate des gedeckten Teils
     * Nur bei Auswahl Darlehensart Teilweise gedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getTilgRateGedeckt() {
        return tilgRateGedeckt;
    }

    /**
     * Sets the value of the tilgRateGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getTilgRateGedeckt()
     */
    public void setTilgRateGedeckt(Double value) {
        this.tilgRateGedeckt = value;
    }

    /**
     * Der kalkulierte Einstand gedeckter Teil ist bei einer teilgedeckten Berechnung der Effektivzins
     * der strukturkongruenten Refinanzierung des gedeckten Teils des Darlehens. Er zeigt also an,
     * welchen Effektivzins die Bank bei zinsänderungsrisikofreier Refinanzierung auf der Passivseite
     * für den gedeckten Anteil zu bezahlen hat.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEinstandGedeckt() {
        return einstandGedeckt;
    }

    /**
     * Sets the value of the einstandGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEinstandGedeckt()
     */
    public void setEinstandGedeckt(Double value) {
        this.einstandGedeckt = value;
    }

    /**
     * Der kalkulierte Einstand ungedeckter Teil ist bei einer teilgedeckten Berechnung der
     * Effektivzins der strukturkongruenten Refinanzierung des ungedeckten Teils des Darlehens. Er
     * zeigt also an, welchen Effektivzins die Bank bei zinsänderungsrisikofreier Refinanzierung auf
     * der Passivseite für den ungedeckten Anteil zu bezahlen hat.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEinstandUngedeckt() {
        return einstandUngedeckt;
    }

    /**
     * Sets the value of the einstandUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEinstandUngedeckt()
     */
    public void setEinstandUngedeckt(Double value) {
        this.einstandUngedeckt = value;
    }

    /**
     * Die Marge % gedeckter Teil ist die Marge vor Kosten, welche die Bank auf der Basis der
     * strukturkongruenten Refinanzierung des gedeckten Teils des Darlehens erzielt. Die Marge ergibt
     * sich als Differenz von Einstand des Kundengeschäfts und Effektivzins des
     * Refinanzierungsgeschäfts des gedeckten Teils des Darlehens.
     * Nur bei Prolongation und teilgedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargeGedeckt() {
        return margeGedeckt;
    }

    /**
     * Sets the value of the margeGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargeGedeckt()
     */
    public void setMargeGedeckt(Double value) {
        this.margeGedeckt = value;
    }

    /**
     * Die Marge % ungedeckter Teil ist die Marge vor Kosten, welche die Bank auf der Basis der
     * strukturkongruenten Refinanzierung des ungedeckten Teils des Darlehens erzielt. Die Marge ergibt
     * sich als Differenz von Einstand des Kundengeschäfts und Effektivzins des
     * Refinanzierungsgeschäfts des ungedeckten Teils des Darlehens.
     * Nur bei Prolongation und teilgedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargeUngedeckt() {
        return margeUngedeckt;
    }

    /**
     * Sets the value of the margeUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargeUngedeckt()
     */
    public void setMargeUngedeckt(Double value) {
        this.margeUngedeckt = value;
    }

    /**
     * Die Marge % gedeckter Teil ist die Marge vor Kosten, welche die Bank auf der Basis der
     * strukturkongruenten Refinanzierung des gedeckten Teils des Darlehens erzielt. Die Marge ergibt
     * sich als Differenz von Einstand des Kundengeschäfts und Effektivzins des
     * Refinanzierungsgeschäfts des gedeckten Teils des Darlehens.
     * Nur bei Prolongation und teilgedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargenbarwertGedeckt() {
        return margenbarwertGedeckt;
    }

    /**
     * Sets the value of the margenbarwertGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargenbarwertGedeckt()
     */
    public void setMargenbarwertGedeckt(Double value) {
        this.margenbarwertGedeckt = value;
    }

    /**
     * Der Margenbarwert ungedeckter Teil ist der Betrag, den die Bank im Fall einer teilgedeckten
     * Berechnung bei strukturkongruenter Refinanzierung für den ungedeckten Anteil des Kredits sofort
     * entnehmen kann. In allen zukünftigen Zeitpunkten liegt dann ein Saldo von 0 zwischen
     * Aktivgeschäft und strukturkongruenter Refinanzierung vor.
     * Nur bei Prolongation und teilgedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMargenbarwertUngedeckt() {
        return margenbarwertUngedeckt;
    }

    /**
     * Sets the value of the margenbarwertUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMargenbarwertUngedeckt()
     */
    public void setMargenbarwertUngedeckt(Double value) {
        this.margenbarwertUngedeckt = value;
    }

    /**
     * Im Feld wird die Summe der Tilgungen ausgewiesen, die sich für den gedeckten Teil des Kredits
     * ergeben.
     * Nur bei Prolongation und teilgedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeAllerTilgungenGedeckt() {
        return summeAllerTilgungenGedeckt;
    }

    /**
     * Sets the value of the summeAllerTilgungenGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeAllerTilgungenGedeckt()
     */
    public void setSummeAllerTilgungenGedeckt(Double value) {
        this.summeAllerTilgungenGedeckt = value;
    }

    /**
     * Im Feld wird die Summe der Tilgungen ausgewiesen, die sich für den ungedeckten Teil des Kredits
     * ergeben.
     * Nur bei Prolongation und teilgedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeAllerTilgungenUngedeckt() {
        return summeAllerTilgungenUngedeckt;
    }

    /**
     * Sets the value of the summeAllerTilgungenUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeAllerTilgungenUngedeckt()
     */
    public void setSummeAllerTilgungenUngedeckt(Double value) {
        this.summeAllerTilgungenUngedeckt = value;
    }

    /**
     * Im Feld wird die Summe der anfallenden Zinsen ausgewiesen, die sich für den gedeckten Teil des
     * Kredits ergeben.
     * Nur bei Prolongation und teilgedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeAllerZinsenGedeckt() {
        return summeAllerZinsenGedeckt;
    }

    /**
     * Sets the value of the summeAllerZinsenGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeAllerZinsenGedeckt()
     */
    public void setSummeAllerZinsenGedeckt(Double value) {
        this.summeAllerZinsenGedeckt = value;
    }

    /**
     * Im Feld wird die Summe der anfallenden Zinsen ausgewiesen, die sich für den ungedeckten Teil des
     * Kredits ergeben.
     * Nur bei Prolongation und teilgedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeAllerZinsenUngedeckt() {
        return summeAllerZinsenUngedeckt;
    }

    /**
     * Sets the value of the summeAllerZinsenUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeAllerZinsenUngedeckt()
     */
    public void setSummeAllerZinsenUngedeckt(Double value) {
        this.summeAllerZinsenUngedeckt = value;
    }

    /**
     * Summe aller Auszahlungen gedeckter Teil
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeAllerAuszahlungenGedeckt() {
        return summeAllerAuszahlungenGedeckt;
    }

    /**
     * Sets the value of the summeAllerAuszahlungenGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeAllerAuszahlungenGedeckt()
     */
    public void setSummeAllerAuszahlungenGedeckt(Double value) {
        this.summeAllerAuszahlungenGedeckt = value;
    }

    /**
     * Summe aller Auszahlungen ungedeckter Teil
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeAllerAuszahlungenUngedeckt() {
        return summeAllerAuszahlungenUngedeckt;
    }

    /**
     * Sets the value of the summeAllerAuszahlungenUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeAllerAuszahlungenUngedeckt()
     */
    public void setSummeAllerAuszahlungenUngedeckt(Double value) {
        this.summeAllerAuszahlungenUngedeckt = value;
    }

    /**
     * Summe aller Auschläge für den gedeckten Teil
     * Nur bei Prolongation und teilgedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeAllerMarginGedeckt() {
        return summeAllerMarginGedeckt;
    }

    /**
     * Sets the value of the summeAllerMarginGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeAllerMarginGedeckt()
     */
    public void setSummeAllerMarginGedeckt(Double value) {
        this.summeAllerMarginGedeckt = value;
    }

    /**
     * Summe aller Aufschläge für den ungedeckten Teil
     * Nur bei Prolongation und teilgedeckt relevant
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSummeAllerMarginUngedeckt() {
        return summeAllerMarginUngedeckt;
    }

    /**
     * Sets the value of the summeAllerMarginUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getSummeAllerMarginUngedeckt()
     */
    public void setSummeAllerMarginUngedeckt(Double value) {
        this.summeAllerMarginUngedeckt = value;
    }

    /**
     * Soll der gedeckte Teil aus den Sicherheiten ermittelt werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGedeckterTeilAusSicherheitenErmitteln() {
        return gedeckterTeilAusSicherheitenErmitteln;
    }

    /**
     * Sets the value of the gedeckterTeilAusSicherheitenErmitteln property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isGedeckterTeilAusSicherheitenErmitteln()
     */
    public void setGedeckterTeilAusSicherheitenErmitteln(Boolean value) {
        this.gedeckterTeilAusSicherheitenErmitteln = value;
    }

}
