
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der globale komplexe Typ Prolongation enthält zusätzliche Daten für die Prolongation eines Darlehens.
 *
 * <p>Java class for Prolongation complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Prolongation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="berechnungsnominale" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="unbezahlterZins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nichtVerrechneteRaten" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="unbezahlterZinsGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nichtVerrechneteRatenGedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="unbezahlterZinsUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nichtVerrechneteRatenUngedeckt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="prolongationflag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prolongation", propOrder = {

})
public class Prolongation {

    /**
     * Bei einer Prolongation wird für die Berechnung der Ratenhöhe nicht der Nominalbetrag sondern der
     * Nominalbetrag des Ursprungsdarlehens, die sogenannten Berechnungsnominale, zugrunde gelegt.
     * Es ergibt sich: Rate = Prozentwert der anfänglichen Tilgung zum  Grundwert Berechnungsnominale +
     * Prozentwert vom Nominalzins zum Grundwert Berechnungsnominale.
     * Die Berechnungsnominale wird bei teilgedeckten Darlehen auch für lineare Aufteilung des Kontos verwendet.
     * Dieses Feld ist nur verfügbar, wenn die Auswahl Prolongation auf Ja eingestellt ist.
     */
    protected Double berechnungsnominale;
    /**
     * In der Regel fallen die Zeitpunkte von Prolongationen auf einen Termin, zu dem der
     * Ursprungskredit vollständig abgerechnet wird. Es findet also die letzte Zinsverrechnung und auch
     * die letzte Tilgungsanrechnung statt. In diesen Fällen erübrigen sich Eingaben zu den genannten
     * Feldern. Wird ausnahmsweise zum Festzinsbindungsende kein kompletter Kontoabschluss
     * durchgeführt, kann der richtige Startsaldo zur Zinsberechnung über noch nicht bezahlter Zins
     * berechnet werden.
     * Diese Felder sind nur verfügbar, wenn die Auswahl Prolongation auf Ja eingestellt ist.
     */
    protected Double unbezahlterZins;
    /**
     * In der Regel fallen die Zeitpunkte von Prolongationen auf einen Termin, zu dem der
     * Ursprungskredit vollständig abgerechnet wird. Es findet also die letzte Zinsverrechnung und auch
     * die letzte Tilgungsanrechnung statt. In diesen Fällen erübrigen sich Eingaben zu den genannten
     * Feldern. Wird ausnahmsweise zum Festzinsbindungsende kein kompletter Kontoabschluss
     * durchgeführt, kann der richtige Startsaldo zur Zinsberechnung über noch nicht bezahlter Zins
     * berechnet werden. Verzögerte Tilgungsanrechnung, die vom alten in das neue Darlehen
     * hinüberreicht, wird über noch nicht verrechnete Raten gesteuert.
     * Diese Felder sind nur verfügbar, wenn die Auswahl Prolongation auf Ja eingestellt ist.
     * Bei Endfälliges Darlehen nur Noch nicht verrechneter Zins.
     */
    protected Double nichtVerrechneteRaten;
    /**
     * Angabe welcher Zinsanteil dem gedeckten Teil zuzuordnen ist.
     */
    protected Double unbezahlterZinsGedeckt;
    /**
     * Angabe welcher Ratenanteil dem gedeckten Teil zuzuordnen ist.
     */
    protected Double nichtVerrechneteRatenGedeckt;
    /**
     * Angabe welcher Zinsanteil dem ungedeckten Teil zuzuordnen ist.
     */
    protected Double unbezahlterZinsUngedeckt;
    /**
     * Angabe welcher Ratenanteil dem ungedeckten Teil zuzuordnen ist.
     */
    protected Double nichtVerrechneteRatenUngedeckt;
    /**
     * Wenn es sich bei dem Darlehen um eine Prolongation handelt, können über diese Auswahl (Ja/Nein)
     * zusätzliche Eingabefelder verfügbar gemacht werden.
     */
    protected Boolean prolongationflag;

    /**
     * Bei einer Prolongation wird für die Berechnung der Ratenhöhe nicht der Nominalbetrag sondern der
     * Nominalbetrag des Ursprungsdarlehens, die sogenannten Berechnungsnominale, zugrunde gelegt.
     * Es ergibt sich: Rate = Prozentwert der anfänglichen Tilgung zum  Grundwert Berechnungsnominale +
     * Prozentwert vom Nominalzins zum Grundwert Berechnungsnominale.
     * Die Berechnungsnominale wird bei teilgedeckten Darlehen auch für lineare Aufteilung des Kontos verwendet.
     * Dieses Feld ist nur verfügbar, wenn die Auswahl Prolongation auf Ja eingestellt ist.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBerechnungsnominale() {
        return berechnungsnominale;
    }

    /**
     * Sets the value of the berechnungsnominale property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBerechnungsnominale()
     */
    public void setBerechnungsnominale(Double value) {
        this.berechnungsnominale = value;
    }

    /**
     * In der Regel fallen die Zeitpunkte von Prolongationen auf einen Termin, zu dem der
     * Ursprungskredit vollständig abgerechnet wird. Es findet also die letzte Zinsverrechnung und auch
     * die letzte Tilgungsanrechnung statt. In diesen Fällen erübrigen sich Eingaben zu den genannten
     * Feldern. Wird ausnahmsweise zum Festzinsbindungsende kein kompletter Kontoabschluss
     * durchgeführt, kann der richtige Startsaldo zur Zinsberechnung über noch nicht bezahlter Zins
     * berechnet werden.
     * Diese Felder sind nur verfügbar, wenn die Auswahl Prolongation auf Ja eingestellt ist.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getUnbezahlterZins() {
        return unbezahlterZins;
    }

    /**
     * Sets the value of the unbezahlterZins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getUnbezahlterZins()
     */
    public void setUnbezahlterZins(Double value) {
        this.unbezahlterZins = value;
    }

    /**
     * In der Regel fallen die Zeitpunkte von Prolongationen auf einen Termin, zu dem der
     * Ursprungskredit vollständig abgerechnet wird. Es findet also die letzte Zinsverrechnung und auch
     * die letzte Tilgungsanrechnung statt. In diesen Fällen erübrigen sich Eingaben zu den genannten
     * Feldern. Wird ausnahmsweise zum Festzinsbindungsende kein kompletter Kontoabschluss
     * durchgeführt, kann der richtige Startsaldo zur Zinsberechnung über noch nicht bezahlter Zins
     * berechnet werden. Verzögerte Tilgungsanrechnung, die vom alten in das neue Darlehen
     * hinüberreicht, wird über noch nicht verrechnete Raten gesteuert.
     * Diese Felder sind nur verfügbar, wenn die Auswahl Prolongation auf Ja eingestellt ist.
     * Bei Endfälliges Darlehen nur Noch nicht verrechneter Zins.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNichtVerrechneteRaten() {
        return nichtVerrechneteRaten;
    }

    /**
     * Sets the value of the nichtVerrechneteRaten property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNichtVerrechneteRaten()
     */
    public void setNichtVerrechneteRaten(Double value) {
        this.nichtVerrechneteRaten = value;
    }

    /**
     * Angabe welcher Zinsanteil dem gedeckten Teil zuzuordnen ist.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getUnbezahlterZinsGedeckt() {
        return unbezahlterZinsGedeckt;
    }

    /**
     * Sets the value of the unbezahlterZinsGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getUnbezahlterZinsGedeckt()
     */
    public void setUnbezahlterZinsGedeckt(Double value) {
        this.unbezahlterZinsGedeckt = value;
    }

    /**
     * Angabe welcher Ratenanteil dem gedeckten Teil zuzuordnen ist.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNichtVerrechneteRatenGedeckt() {
        return nichtVerrechneteRatenGedeckt;
    }

    /**
     * Sets the value of the nichtVerrechneteRatenGedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNichtVerrechneteRatenGedeckt()
     */
    public void setNichtVerrechneteRatenGedeckt(Double value) {
        this.nichtVerrechneteRatenGedeckt = value;
    }

    /**
     * Angabe welcher Zinsanteil dem ungedeckten Teil zuzuordnen ist.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getUnbezahlterZinsUngedeckt() {
        return unbezahlterZinsUngedeckt;
    }

    /**
     * Sets the value of the unbezahlterZinsUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getUnbezahlterZinsUngedeckt()
     */
    public void setUnbezahlterZinsUngedeckt(Double value) {
        this.unbezahlterZinsUngedeckt = value;
    }

    /**
     * Angabe welcher Ratenanteil dem ungedeckten Teil zuzuordnen ist.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getNichtVerrechneteRatenUngedeckt() {
        return nichtVerrechneteRatenUngedeckt;
    }

    /**
     * Sets the value of the nichtVerrechneteRatenUngedeckt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getNichtVerrechneteRatenUngedeckt()
     */
    public void setNichtVerrechneteRatenUngedeckt(Double value) {
        this.nichtVerrechneteRatenUngedeckt = value;
    }

    /**
     * Wenn es sich bei dem Darlehen um eine Prolongation handelt, können über diese Auswahl (Ja/Nein)
     * zusätzliche Eingabefelder verfügbar gemacht werden.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isProlongationflag() {
        return prolongationflag;
    }

    /**
     * Sets the value of the prolongationflag property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isProlongationflag()
     */
    public void setProlongationflag(Boolean value) {
        this.prolongationflag = value;
    }

}
