
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Das AutoUpdateKopfdaten-Tag wird vom externen System verwendet,
 * um Kopfdaten für ein bestehendes Kreditgeschäft in der MARZIPAN-Datenbank, zu aktualisieren.
 *
 * <p>Java class for AutoUpdateKopfdaten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AutoUpdateKopfdaten">
 *   <complexContent>
 *     <extension base="{http://www.gillardon.de/marzipan/integrationsservice}Logindaten">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="institutsdaten" type="{http://www.gillardon.de/marzipan/integrationsservice}InstitutsdatenForAutoUpdateKopfdaten" minOccurs="0"/>
 *         <element name="kundendaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Kundendaten" minOccurs="0"/>
 *         <element name="verwaltungsdaten" type="{http://www.gillardon.de/marzipan/integrationsservice}Verwaltungsdaten" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoUpdateKopfdaten", propOrder = {
        "name",
        "institutsdaten",
        "kundendaten",
        "verwaltungsdaten"
})
public class AutoUpdateKopfdaten
        extends Logindaten {

    /**
     * Name des Geschäfts (Geschäfts-ID), für das die Kopfdaten aktualisiert werden sollen.
     */
    @XmlElement(required = true)
    protected String name;
    /**
     * Institutsbezogene Daten zum Geschäft
     */
    protected InstitutsdatenForAutoUpdateKopfdaten institutsdaten;
    /**
     * Name und Adresse des Kunden (Darlehensnehmer)
     */
    protected Kundendaten kundendaten;
    /**
     * Verwaltungsdaten zu einem Geschäft
     */
    protected Verwaltungsdaten verwaltungsdaten;

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
     * {@link InstitutsdatenForAutoUpdateKopfdaten }
     */
    public InstitutsdatenForAutoUpdateKopfdaten getInstitutsdaten() {
        return institutsdaten;
    }

    /**
     * Sets the value of the institutsdaten property.
     *
     * @param value allowed object is
     *              {@link InstitutsdatenForAutoUpdateKopfdaten }
     * @see #getInstitutsdaten()
     */
    public void setInstitutsdaten(InstitutsdatenForAutoUpdateKopfdaten value) {
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

}
