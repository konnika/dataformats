
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * Der globale komplexe Typ -Bonussparplan- enthält zusätzliche Daten für Produkttyp Bonussparplan.
 *
 * <p>Java class for Bonussparplan complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Bonussparplan">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="ersterBonustermin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="bonusTerminTag" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         <element name="bonusZahlungVersch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ersteBonuszahlung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="bonusZahlungTag" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         <element name="bonusAnteilig" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="bonusGestaffelt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="bonusRaten" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bonusZinsen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bonusausschuettung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="bonusverlauf" type="{http://www.gillardon.de/marzipan/integrationsservice}Verlauf" minOccurs="0"/>
 *         <element name="bonusRhythmus" type="{http://www.gillardon.de/marzipan/integrationsservice}BonusRhythmus" minOccurs="0"/>
 *         <element name="bonussaetze" type="{http://www.gillardon.de/marzipan/integrationsservice}Bonussaetze" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bonussparplan", propOrder = {

})
public class Bonussparplan {

    /**
     * Datum der ersten Bonusberechnung.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ersterBonustermin;
    /**
     * Tag, an dem die Bonusberechnung stattfindet. Mögliche Auswahlen sind 1. des Monats, ..., 30. des
     * Monats und Ultimo.
     */
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bonusTerminTag;
    /**
     * Sollen Bonuszahlungen verschoben werden?
     */
    protected Boolean bonusZahlungVersch;
    /**
     * Datum der ersten Bonusverrechnung oder -auszahlung.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ersteBonuszahlung;
    /**
     * Tag, an dem die Bonuszahlung stattfindet. Mögliche Auswahlen sind 1. des Monats, ..., 30. des
     * Monats und Ultimo.
     */
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bonusZahlungTag;
    /**
     * Anteilige Bonuszahlung, wenn bei periodischer Bonuszahlung am Ende nicht das Ende einer
     * Bonusperiode erreicht wird.
     */
    protected Boolean bonusAnteilig;
    /**
     * Legt fest, ob Bonus nach Laufzeit/Datum einmalig gemäß -Laufzeitende- ermittelt wird und dann
     * über die ganze Laufzeit gilt, oder über die gesamte Laufzeit gemäß Bonustabelle angepasst wird.
     */
    protected Boolean bonusGestaffelt;
    /**
     * In der Grunddatenmaske:
     * Wenn unter Bonuskonditionen die Bonustabelle konstant ist: Höhe des Bonus auf die Ratenzahlungen
     * in Prozent.
     * Wenn unter Bonuskonditionen die Bonustabelle nicht konstant ist, wird hier ein Hinweistext auf
     * die Bonusstaffeltabelle unter Bonuskonditionen angezeigt.
     */
    protected Double bonusRaten;
    /**
     * In der Grunddatenmaske:
     * Wenn unter Bonuskonditionen die Bonustabelle konstant ist: Höhe des Bonus auf die Zinsen in
     * Prozent.
     * Wenn unter Bonuskonditionen die Bonustabelle nicht konstant ist, wird hier ein Hinweistext auf
     * die Bonusstaffeltabelle unter Bonuskonditionen angezeigt.
     */
    protected Double bonusZinsen;
    /**
     * Bonus ausschütten (true) oder verrechnen (false).
     */
    protected Boolean bonusausschuettung;
    /**
     * Enthält die Basis des Verlaufs (konstant, nach Laufzeit, nach Datum),
     * welche zur Berechnung der Bonusrate benötigt wird.
     * siehe Struktur -Verlauf-
     */
    @XmlSchemaType(name = "string")
    protected Verlauf bonusverlauf;
    /**
     * Rhythmus der Bonuszahlung
     * - einmalig am Laufzeitende
     * - jährlich
     * - halbjährlich
     * - vierteljährlich
     * - zweimonatlich
     * - monatlich
     */
    @XmlSchemaType(name = "string")
    protected BonusRhythmus bonusRhythmus;
    /**
     * Bonusstaffel für Bonus nach Laufzeit oder Datum.
     */
    protected Bonussaetze bonussaetze;

    /**
     * Datum der ersten Bonusberechnung.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErsterBonustermin() {
        return ersterBonustermin;
    }

    /**
     * Sets the value of the ersterBonustermin property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErsterBonustermin()
     */
    public void setErsterBonustermin(XMLGregorianCalendar value) {
        this.ersterBonustermin = value;
    }

    /**
     * Tag, an dem die Bonusberechnung stattfindet. Mögliche Auswahlen sind 1. des Monats, ..., 30. des
     * Monats und Ultimo.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getBonusTerminTag() {
        return bonusTerminTag;
    }

    /**
     * Sets the value of the bonusTerminTag property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getBonusTerminTag()
     */
    public void setBonusTerminTag(BigInteger value) {
        this.bonusTerminTag = value;
    }

    /**
     * Sollen Bonuszahlungen verschoben werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBonusZahlungVersch() {
        return bonusZahlungVersch;
    }

    /**
     * Sets the value of the bonusZahlungVersch property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isBonusZahlungVersch()
     */
    public void setBonusZahlungVersch(Boolean value) {
        this.bonusZahlungVersch = value;
    }

    /**
     * Datum der ersten Bonusverrechnung oder -auszahlung.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErsteBonuszahlung() {
        return ersteBonuszahlung;
    }

    /**
     * Sets the value of the ersteBonuszahlung property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErsteBonuszahlung()
     */
    public void setErsteBonuszahlung(XMLGregorianCalendar value) {
        this.ersteBonuszahlung = value;
    }

    /**
     * Tag, an dem die Bonuszahlung stattfindet. Mögliche Auswahlen sind 1. des Monats, ..., 30. des
     * Monats und Ultimo.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getBonusZahlungTag() {
        return bonusZahlungTag;
    }

    /**
     * Sets the value of the bonusZahlungTag property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     * @see #getBonusZahlungTag()
     */
    public void setBonusZahlungTag(BigInteger value) {
        this.bonusZahlungTag = value;
    }

    /**
     * Anteilige Bonuszahlung, wenn bei periodischer Bonuszahlung am Ende nicht das Ende einer
     * Bonusperiode erreicht wird.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBonusAnteilig() {
        return bonusAnteilig;
    }

    /**
     * Sets the value of the bonusAnteilig property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isBonusAnteilig()
     */
    public void setBonusAnteilig(Boolean value) {
        this.bonusAnteilig = value;
    }

    /**
     * Legt fest, ob Bonus nach Laufzeit/Datum einmalig gemäß -Laufzeitende- ermittelt wird und dann
     * über die ganze Laufzeit gilt, oder über die gesamte Laufzeit gemäß Bonustabelle angepasst wird.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBonusGestaffelt() {
        return bonusGestaffelt;
    }

    /**
     * Sets the value of the bonusGestaffelt property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isBonusGestaffelt()
     */
    public void setBonusGestaffelt(Boolean value) {
        this.bonusGestaffelt = value;
    }

    /**
     * In der Grunddatenmaske:
     * Wenn unter Bonuskonditionen die Bonustabelle konstant ist: Höhe des Bonus auf die Ratenzahlungen
     * in Prozent.
     * Wenn unter Bonuskonditionen die Bonustabelle nicht konstant ist, wird hier ein Hinweistext auf
     * die Bonusstaffeltabelle unter Bonuskonditionen angezeigt.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBonusRaten() {
        return bonusRaten;
    }

    /**
     * Sets the value of the bonusRaten property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBonusRaten()
     */
    public void setBonusRaten(Double value) {
        this.bonusRaten = value;
    }

    /**
     * In der Grunddatenmaske:
     * Wenn unter Bonuskonditionen die Bonustabelle konstant ist: Höhe des Bonus auf die Zinsen in
     * Prozent.
     * Wenn unter Bonuskonditionen die Bonustabelle nicht konstant ist, wird hier ein Hinweistext auf
     * die Bonusstaffeltabelle unter Bonuskonditionen angezeigt.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBonusZinsen() {
        return bonusZinsen;
    }

    /**
     * Sets the value of the bonusZinsen property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBonusZinsen()
     */
    public void setBonusZinsen(Double value) {
        this.bonusZinsen = value;
    }

    /**
     * Bonus ausschütten (true) oder verrechnen (false).
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBonusausschuettung() {
        return bonusausschuettung;
    }

    /**
     * Sets the value of the bonusausschuettung property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isBonusausschuettung()
     */
    public void setBonusausschuettung(Boolean value) {
        this.bonusausschuettung = value;
    }

    /**
     * Enthält die Basis des Verlaufs (konstant, nach Laufzeit, nach Datum),
     * welche zur Berechnung der Bonusrate benötigt wird.
     * siehe Struktur -Verlauf-
     *
     * @return possible object is
     * {@link Verlauf }
     */
    public Verlauf getBonusverlauf() {
        return bonusverlauf;
    }

    /**
     * Sets the value of the bonusverlauf property.
     *
     * @param value allowed object is
     *              {@link Verlauf }
     * @see #getBonusverlauf()
     */
    public void setBonusverlauf(Verlauf value) {
        this.bonusverlauf = value;
    }

    /**
     * Rhythmus der Bonuszahlung
     * - einmalig am Laufzeitende
     * - jährlich
     * - halbjährlich
     * - vierteljährlich
     * - zweimonatlich
     * - monatlich
     *
     * @return possible object is
     * {@link BonusRhythmus }
     */
    public BonusRhythmus getBonusRhythmus() {
        return bonusRhythmus;
    }

    /**
     * Sets the value of the bonusRhythmus property.
     *
     * @param value allowed object is
     *              {@link BonusRhythmus }
     * @see #getBonusRhythmus()
     */
    public void setBonusRhythmus(BonusRhythmus value) {
        this.bonusRhythmus = value;
    }

    /**
     * Bonusstaffel für Bonus nach Laufzeit oder Datum.
     *
     * @return possible object is
     * {@link Bonussaetze }
     */
    public Bonussaetze getBonussaetze() {
        return bonussaetze;
    }

    /**
     * Sets the value of the bonussaetze property.
     *
     * @param value allowed object is
     *              {@link Bonussaetze }
     * @see #getBonussaetze()
     */
    public void setBonussaetze(Bonussaetze value) {
        this.bonussaetze = value;
    }

}
