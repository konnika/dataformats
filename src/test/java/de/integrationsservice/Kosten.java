
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der globale komplexe Typ Kosten enthält Informationen zu einer Kosten-Zeile
 *
 * <p>Java class for Kosten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Kosten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="typ" type="{http://www.gillardon.de/marzipan/integrationsservice}KostenTyp" minOccurs="0"/>
 *         <element name="dbNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="weiterverarbeitung" type="{http://www.gillardon.de/marzipan/integrationsservice}ExterneWeiterverarbeitungArt" minOccurs="0"/>
 *         <element name="abzinsen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vorhaltewert" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="art" type="{http://www.gillardon.de/marzipan/integrationsservice}KostenArt" minOccurs="0"/>
 *         <element name="vorhaltestaffeltyp" type="{http://www.gillardon.de/marzipan/integrationsservice}VorhaltestaffelTyp" minOccurs="0"/>
 *         <element name="dbstufenbezugNr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="dbstufenbezugSubtrahendNr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="vorhaltewerte" type="{http://www.gillardon.de/marzipan/integrationsservice}KostenVorhaltewerte" minOccurs="0"/>
 *         <element name="roracAbzugsposition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kosten", propOrder = {

})
@XmlSeeAlso({
        DBStufe.class
})
public class Kosten {

    /**
     * Name der Kosten-Zeile.
     */
    @XmlElement(required = true)
    protected String name;
    /**
     * Typ der Kostengröße. Abhängig vom Kostentyp müssen unterschiedliche Eigenschaften
     * gesetzt werden.
     */
    @XmlSchemaType(name = "string")
    protected KostenTyp typ;
    /**
     * zugehörig zu DBStufe Nummer
     */
    protected int dbNr;
    /**
     * Position innerhalb der DBStufe
     */
    protected Integer position;
    /**
     * Art für externe Weiterverarbeitung.
     */
    @XmlSchemaType(name = "string")
    protected ExterneWeiterverarbeitungArt weiterverarbeitung;
    /**
     * Abzinsen ist nur zu setzen bei einem Kostentyp mit Vorhaltewert, der zeitlich nach
     * dem Kalkulationsdatum anfällt.
     */
    protected Boolean abzinsen;
    /**
     * Der Vorhaltewert ist bei allen Kostentypen zu setzen, außer bei Kostentypen mit
     * Bezug auf Risiko-, Optionspreis-,
     * Teildeckungsberechnung in MARZIPAN und operativen Kostentypen wie Summe, Maximum, Minimum,
     * Division.
     */
    protected Double vorhaltewert;
    /**
     * Stellt der Vorhaltewert der Kostengröße eine Kosten- oder Ertragsposition dar.
     * "art" ist nur zu setzen bei einem Kostentyp mit Vorhaltewert.
     */
    @XmlSchemaType(name = "string")
    protected KostenArt art;
    /**
     * Ist der Vorhaltewert der Kostengröße eindimensional (in Abhängigkeit eines bestimmten
     * Kriteriums)
     * oder mehrdimensional (in Abhängigkeit eines Kostentableaus) gestaffelt oder stellt er ein
     * Wertekriterium dar?
     * "vorhaltestaffeltyp" ist nur zu setzen bei einem Kostentyp mit Vorhaltewert.
     */
    @XmlSchemaType(name = "string")
    protected VorhaltestaffelTyp vorhaltestaffeltyp;
    /**
     * Nummer der Deckungsbeitragsstufe, auf die sich eine Kostengröße vom Kostentyp
     * Kosten auf DBStufe bezieht bzw. Nummer der Deckungsbeitragsstufe des Minuenden für eine
     * Kostengröße vom Kostentyp Kosten auf DBStufendifferenz
     */
    protected Integer dbstufenbezugNr;
    /**
     * Nummer der Deckungsbeitragsstufe des Subtrahenden einer Kostengröße vom Kostentyp
     * Kosten auf DBStufendifferenz
     */
    protected Integer dbstufenbezugSubtrahendNr;
    /**
     * Liste mit Vorhaltewerten.
     */
    protected KostenVorhaltewerte vorhaltewerte;
    /**
     * Kennzeichen, ob die Kostengröße vom Deckungsbeitrag des RORAC abgezogen werden
     * soll
     */
    protected Boolean roracAbzugsposition;

    /**
     * Name der Kosten-Zeile.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Typ der Kostengröße. Abhängig vom Kostentyp müssen unterschiedliche Eigenschaften
     * gesetzt werden.
     *
     * @return possible object is
     * {@link KostenTyp }
     */
    public KostenTyp getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     *
     * @param value allowed object is
     *              {@link KostenTyp }
     * @see #getTyp()
     */
    public void setTyp(KostenTyp value) {
        this.typ = value;
    }

    /**
     * zugehörig zu DBStufe Nummer
     */
    public int getDbNr() {
        return dbNr;
    }

    /**
     * Sets the value of the dbNr property.
     */
    public void setDbNr(int value) {
        this.dbNr = value;
    }

    /**
     * Position innerhalb der DBStufe
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getPosition()
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Art für externe Weiterverarbeitung.
     *
     * @return possible object is
     * {@link ExterneWeiterverarbeitungArt }
     */
    public ExterneWeiterverarbeitungArt getWeiterverarbeitung() {
        return weiterverarbeitung;
    }

    /**
     * Sets the value of the weiterverarbeitung property.
     *
     * @param value allowed object is
     *              {@link ExterneWeiterverarbeitungArt }
     * @see #getWeiterverarbeitung()
     */
    public void setWeiterverarbeitung(ExterneWeiterverarbeitungArt value) {
        this.weiterverarbeitung = value;
    }

    /**
     * Abzinsen ist nur zu setzen bei einem Kostentyp mit Vorhaltewert, der zeitlich nach
     * dem Kalkulationsdatum anfällt.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAbzinsen() {
        return abzinsen;
    }

    /**
     * Sets the value of the abzinsen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isAbzinsen()
     */
    public void setAbzinsen(Boolean value) {
        this.abzinsen = value;
    }

    /**
     * Der Vorhaltewert ist bei allen Kostentypen zu setzen, außer bei Kostentypen mit
     * Bezug auf Risiko-, Optionspreis-,
     * Teildeckungsberechnung in MARZIPAN und operativen Kostentypen wie Summe, Maximum, Minimum,
     * Division.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVorhaltewert() {
        return vorhaltewert;
    }

    /**
     * Sets the value of the vorhaltewert property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVorhaltewert()
     */
    public void setVorhaltewert(Double value) {
        this.vorhaltewert = value;
    }

    /**
     * Stellt der Vorhaltewert der Kostengröße eine Kosten- oder Ertragsposition dar.
     * "art" ist nur zu setzen bei einem Kostentyp mit Vorhaltewert.
     *
     * @return possible object is
     * {@link KostenArt }
     */
    public KostenArt getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     *
     * @param value allowed object is
     *              {@link KostenArt }
     * @see #getArt()
     */
    public void setArt(KostenArt value) {
        this.art = value;
    }

    /**
     * Ist der Vorhaltewert der Kostengröße eindimensional (in Abhängigkeit eines bestimmten
     * Kriteriums)
     * oder mehrdimensional (in Abhängigkeit eines Kostentableaus) gestaffelt oder stellt er ein
     * Wertekriterium dar?
     * "vorhaltestaffeltyp" ist nur zu setzen bei einem Kostentyp mit Vorhaltewert.
     *
     * @return possible object is
     * {@link VorhaltestaffelTyp }
     */
    public VorhaltestaffelTyp getVorhaltestaffeltyp() {
        return vorhaltestaffeltyp;
    }

    /**
     * Sets the value of the vorhaltestaffeltyp property.
     *
     * @param value allowed object is
     *              {@link VorhaltestaffelTyp }
     * @see #getVorhaltestaffeltyp()
     */
    public void setVorhaltestaffeltyp(VorhaltestaffelTyp value) {
        this.vorhaltestaffeltyp = value;
    }

    /**
     * Nummer der Deckungsbeitragsstufe, auf die sich eine Kostengröße vom Kostentyp
     * Kosten auf DBStufe bezieht bzw. Nummer der Deckungsbeitragsstufe des Minuenden für eine
     * Kostengröße vom Kostentyp Kosten auf DBStufendifferenz
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDbstufenbezugNr() {
        return dbstufenbezugNr;
    }

    /**
     * Sets the value of the dbstufenbezugNr property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getDbstufenbezugNr()
     */
    public void setDbstufenbezugNr(Integer value) {
        this.dbstufenbezugNr = value;
    }

    /**
     * Nummer der Deckungsbeitragsstufe des Subtrahenden einer Kostengröße vom Kostentyp
     * Kosten auf DBStufendifferenz
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDbstufenbezugSubtrahendNr() {
        return dbstufenbezugSubtrahendNr;
    }

    /**
     * Sets the value of the dbstufenbezugSubtrahendNr property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getDbstufenbezugSubtrahendNr()
     */
    public void setDbstufenbezugSubtrahendNr(Integer value) {
        this.dbstufenbezugSubtrahendNr = value;
    }

    /**
     * Liste mit Vorhaltewerten.
     *
     * @return possible object is
     * {@link KostenVorhaltewerte }
     */
    public KostenVorhaltewerte getVorhaltewerte() {
        return vorhaltewerte;
    }

    /**
     * Sets the value of the vorhaltewerte property.
     *
     * @param value allowed object is
     *              {@link KostenVorhaltewerte }
     * @see #getVorhaltewerte()
     */
    public void setVorhaltewerte(KostenVorhaltewerte value) {
        this.vorhaltewerte = value;
    }

    /**
     * Kennzeichen, ob die Kostengröße vom Deckungsbeitrag des RORAC abgezogen werden
     * soll
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRoracAbzugsposition() {
        return roracAbzugsposition;
    }

    /**
     * Sets the value of the roracAbzugsposition property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isRoracAbzugsposition()
     */
    public void setRoracAbzugsposition(Boolean value) {
        this.roracAbzugsposition = value;
    }

}
