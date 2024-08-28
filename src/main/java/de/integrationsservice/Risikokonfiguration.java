
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Das Risikokonfiguration (Risikoübernahmeprämie) besteht aus einigen Kopfdaten, einer zugehörigen
 * q-Faktor Tabelle und einer Dynamisierungstabelle
 *
 * <p>Java class for Risikokonfiguration complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Risikokonfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ruepVariante" type="{http://www.gillardon.de/marzipan/integrationsservice}RuepVariante"/>
 *         <element name="freigabestatus" type="{http://www.gillardon.de/marzipan/integrationsservice}Freigabestatus" minOccurs="0"/>
 *         <element name="risikokonfigurationParameter" type="{http://www.gillardon.de/marzipan/integrationsservice}RisikokonfigurationParameter" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Risikokonfiguration", propOrder = {

})
public class Risikokonfiguration {

    /**
     * Name der Konfiguration für die Risikoübernahmeprämie.
     */
    protected String name;
    /**
     * Kommentar der Konfiguration für die Risikoübernahmeprämie.
     */
    protected String kommentar;
    /**
     * Erstellungsdatum der Risikokonfiguration
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erstellungsdatum;
    /**
     * Ersteller der Risikokonfiguration
     */
    protected String ersteller;
    /**
     * Berechnungsvariante für die Risikoübernahmeprämie.
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RuepVariante ruepVariante;
    /**
     * Freigabestatus der Risikokonfiguration
     */
    @XmlSchemaType(name = "string")
    protected Freigabestatus freigabestatus;
    /**
     * Der Ansatz der Parameter der Risikokonfiguration
     */
    protected RisikokonfigurationParameter risikokonfigurationParameter;

    /**
     * Name der Konfiguration für die Risikoübernahmeprämie.
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
     * Kommentar der Konfiguration für die Risikoübernahmeprämie.
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
     * Erstellungsdatum der Risikokonfiguration
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
     * Ersteller der Risikokonfiguration
     *
     * @return possible object is
     * {@link String }
     */
    public String getErsteller() {
        return ersteller;
    }

    /**
     * Sets the value of the ersteller property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getErsteller()
     */
    public void setErsteller(String value) {
        this.ersteller = value;
    }

    /**
     * Berechnungsvariante für die Risikoübernahmeprämie.
     *
     * @return possible object is
     * {@link RuepVariante }
     */
    public RuepVariante getRuepVariante() {
        return ruepVariante;
    }

    /**
     * Sets the value of the ruepVariante property.
     *
     * @param value allowed object is
     *              {@link RuepVariante }
     * @see #getRuepVariante()
     */
    public void setRuepVariante(RuepVariante value) {
        this.ruepVariante = value;
    }

    /**
     * Freigabestatus der Risikokonfiguration
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
     * Der Ansatz der Parameter der Risikokonfiguration
     *
     * @return possible object is
     * {@link RisikokonfigurationParameter }
     */
    public RisikokonfigurationParameter getRisikokonfigurationParameter() {
        return risikokonfigurationParameter;
    }

    /**
     * Sets the value of the risikokonfigurationParameter property.
     *
     * @param value allowed object is
     *              {@link RisikokonfigurationParameter }
     * @see #getRisikokonfigurationParameter()
     */
    public void setRisikokonfigurationParameter(RisikokonfigurationParameter value) {
        this.risikokonfigurationParameter = value;
    }

}
