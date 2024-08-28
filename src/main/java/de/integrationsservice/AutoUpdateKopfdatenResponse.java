
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Wird als Antwort auf AutoUpdateKopfdatenRequest verwendet.
 * Es wird entweder alle Eingabedaten oder eine Fehlermeldung zurückgeliefert.
 *
 * <p>Java class for AutoUpdateKopfdatenResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AutoUpdateKopfdatenResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="institutsdaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Institutsdaten" minOccurs="0"/>
 *         <element name="kundendaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Kundendaten" minOccurs="0"/>
 *         <element name="verwaltungsdaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Verwaltungsdaten" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Fehlerliste" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoUpdateKopfdatenResponse", propOrder = {
        "name",
        "institutsdaten",
        "kundendaten",
        "verwaltungsdaten",
        "fehlerliste"
})
public class AutoUpdateKopfdatenResponse {

    /**
     * Name des Geschäfts (Geschäfts-ID), für das die Kopfdaten aktualisiert werden sollen.
     */
    protected String name;
    /**
     * Institutsbezogene Daten zum Geschäft
     */
    protected Institutsdaten institutsdaten;
    /**
     * Name und Adresse des Kunden (Darlehensnehmer)
     */
    protected Kundendaten kundendaten;
    /**
     * Verwaltungsdaten zu einem Geschäft
     */
    protected Verwaltungsdaten verwaltungsdaten;
    /**
     * Wird zurückgeliefert, wenn die angeforderten Daten nicht existieren oder ein Validierungsfehler in den
     * Daten vorliegt.
     */
    @XmlElement(name = "Fehlerliste")
    protected Fehlerliste fehlerliste;

    /**
     * Name des Geschäfts (Geschäfts-ID), für das die Kopfdaten aktualisiert werden sollen.
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
     * Institutsbezogene Daten zum Geschäft
     *
     * @return possible object is
     * {@link Institutsdaten }
     */
    public Institutsdaten getInstitutsdaten() {
        return institutsdaten;
    }

    /**
     * Sets the value of the institutsdaten property.
     *
     * @param value allowed object is
     *              {@link Institutsdaten }
     * @see #getInstitutsdaten()
     */
    public void setInstitutsdaten(Institutsdaten value) {
        this.institutsdaten = value;
    }

    /**
     * Name und Adresse des Kunden (Darlehensnehmer)
     *
     * @return possible object is
     * {@link Kundendaten }
     */
    public Kundendaten getKundendaten() {
        return kundendaten;
    }

    /**
     * Sets the value of the kundendaten property.
     *
     * @param value allowed object is
     *              {@link Kundendaten }
     * @see #getKundendaten()
     */
    public void setKundendaten(Kundendaten value) {
        this.kundendaten = value;
    }

    /**
     * Verwaltungsdaten zu einem Geschäft
     *
     * @return possible object is
     * {@link Verwaltungsdaten }
     */
    public Verwaltungsdaten getVerwaltungsdaten() {
        return verwaltungsdaten;
    }

    /**
     * Sets the value of the verwaltungsdaten property.
     *
     * @param value allowed object is
     *              {@link Verwaltungsdaten }
     * @see #getVerwaltungsdaten()
     */
    public void setVerwaltungsdaten(Verwaltungsdaten value) {
        this.verwaltungsdaten = value;
    }

    /**
     * Wird zurückgeliefert, wenn die angeforderten Daten nicht existieren oder ein Validierungsfehler in den
     * Daten vorliegt.
     *
     * @return possible object is
     * {@link Fehlerliste }
     */
    public Fehlerliste getFehlerliste() {
        return fehlerliste;
    }

    /**
     * Sets the value of the fehlerliste property.
     *
     * @param value allowed object is
     *              {@link Fehlerliste }
     * @see #getFehlerliste()
     */
    public void setFehlerliste(Fehlerliste value) {
        this.fehlerliste = value;
    }

}
