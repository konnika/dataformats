
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Der globale komplexe Typ Deckungsbeitragsschema enthält Informationen über das Deckungsbeitragsschema,
 * welches aus einigen Kopfdaten, einer Liste von Kosten/Erträgen und einer Liste von Deckungsbeiträgen
 * besteht.
 *
 * <p>Java class for Deckungsbeitragsschema complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Deckungsbeitragsschema">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nettomargeistdbnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="erstellungsuhrzeit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="freigabestatus" type="{http://www.gillardon.de/marzipan/integrationsservice}Freigabestatus" minOccurs="0"/>
 *         <element name="oekonomische_dbnr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="regulatorische_dbnr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="kostenListe" type="{http://www.gillardon.de/marzipan/integrationsservice}KostenListe"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deckungsbeitragsschema", propOrder = {

})
public class Deckungsbeitragsschema {

    /**
     * Name des Deckungsbeitragsschemas.
     */
    protected String name;
    /**
     * Die Nummer der Deckungsbeitragsstufe, die die Nettomarge darstellt (von der aus
     * ggf. auf die Kondition etc. zurückgerechnet werden kann).
     */
    protected int nettomargeistdbnr;
    /**
     * Erstellungsdatum des Deckungsbeitragsschemas.
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erstellungsdatum;
    /**
     * Erstellungsuhrzeit des Deckungsbeitragsschemas.
     */
    protected String erstellungsuhrzeit;
    /**
     * Kommentar des Deckungsbeitragsschemas.
     */
    protected String kommentar;
    /**
     * Das Deckungsbeitragsschema kann freigegeben, in Bearbeitung oder gesperrt sein
     */
    @XmlSchemaType(name = "string")
    protected Freigabestatus freigabestatus;
    /**
     * Die Nummer des Deckungsbeitrags, der die Grundlage für die RORAC Berechnung und
     * die ökonomische RAROC Berechnung ist.
     */
    @XmlElement(name = "oekonomische_dbnr")
    protected Integer oekonomischeDbnr;
    /**
     * Die Nummer des Deckungsbeitrags, der die Grundlage für die regulatorische RAROC
     * Berechnung ist.
     */
    @XmlElement(name = "regulatorische_dbnr")
    protected Integer regulatorischeDbnr;
    /**
     * Liste der Kosten/Erträge des Deckungsbeitragsschemas.
     */
    @XmlElement(required = true)
    protected KostenListe kostenListe;

    /**
     * Name des Deckungsbeitragsschemas.
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
     * Die Nummer der Deckungsbeitragsstufe, die die Nettomarge darstellt (von der aus
     * ggf. auf die Kondition etc. zurückgerechnet werden kann).
     */
    public int getNettomargeistdbnr() {
        return nettomargeistdbnr;
    }

    /**
     * Sets the value of the nettomargeistdbnr property.
     */
    public void setNettomargeistdbnr(int value) {
        this.nettomargeistdbnr = value;
    }

    /**
     * Erstellungsdatum des Deckungsbeitragsschemas.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErstellungsdatum() {
        return erstellungsdatum;
    }

    /**
     * Sets the value of the erstellungsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErstellungsdatum()
     */
    public void setErstellungsdatum(XMLGregorianCalendar value) {
        this.erstellungsdatum = value;
    }

    /**
     * Erstellungsuhrzeit des Deckungsbeitragsschemas.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErstellungsuhrzeit() {
        return erstellungsuhrzeit;
    }

    /**
     * Sets the value of the erstellungsuhrzeit property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getErstellungsuhrzeit()
     */
    public void setErstellungsuhrzeit(String value) {
        this.erstellungsuhrzeit = value;
    }

    /**
     * Kommentar des Deckungsbeitragsschemas.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKommentar() {
        return kommentar;
    }

    /**
     * Sets the value of the kommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKommentar()
     */
    public void setKommentar(String value) {
        this.kommentar = value;
    }

    /**
     * Das Deckungsbeitragsschema kann freigegeben, in Bearbeitung oder gesperrt sein
     *
     * @return possible object is
     * {@link Freigabestatus }
     */
    public Freigabestatus getFreigabestatus() {
        return freigabestatus;
    }

    /**
     * Sets the value of the freigabestatus property.
     *
     * @param value allowed object is
     *              {@link Freigabestatus }
     * @see #getFreigabestatus()
     */
    public void setFreigabestatus(Freigabestatus value) {
        this.freigabestatus = value;
    }

    /**
     * Die Nummer des Deckungsbeitrags, der die Grundlage für die RORAC Berechnung und
     * die ökonomische RAROC Berechnung ist.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getOekonomischeDbnr() {
        return oekonomischeDbnr;
    }

    /**
     * Sets the value of the oekonomischeDbnr property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getOekonomischeDbnr()
     */
    public void setOekonomischeDbnr(Integer value) {
        this.oekonomischeDbnr = value;
    }

    /**
     * Die Nummer des Deckungsbeitrags, der die Grundlage für die regulatorische RAROC
     * Berechnung ist.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRegulatorischeDbnr() {
        return regulatorischeDbnr;
    }

    /**
     * Sets the value of the regulatorischeDbnr property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getRegulatorischeDbnr()
     */
    public void setRegulatorischeDbnr(Integer value) {
        this.regulatorischeDbnr = value;
    }

    /**
     * Liste der Kosten/Erträge des Deckungsbeitragsschemas.
     *
     * @return possible object is
     * {@link KostenListe }
     */
    public KostenListe getKostenListe() {
        return kostenListe;
    }

    /**
     * Sets the value of the kostenListe property.
     *
     * @param value allowed object is
     *              {@link KostenListe }
     * @see #getKostenListe()
     */
    public void setKostenListe(KostenListe value) {
        this.kostenListe = value;
    }

}
