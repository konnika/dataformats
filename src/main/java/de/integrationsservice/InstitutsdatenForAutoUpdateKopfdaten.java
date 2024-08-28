
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Institutsbezogene Daten zum Geschäft
 *
 * <p>Java class for InstitutsdatenForAutoUpdateKopfdaten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="InstitutsdatenForAutoUpdateKopfdaten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="berater" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="betriebsstelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kontonummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="institutsdatenvariabel" type="{http://www.gillardon.de/marzipan/integrationsservice}Institutsdatenvariabel" minOccurs="0"/>
 *         <element name="institutskriterienAuswahl" type="{http://www.gillardon.de/marzipan/integrationsservice}InstitutskriterienAuswahl" minOccurs="0"/>
 *         <element name="institutskriterienWert" type="{http://www.gillardon.de/marzipan/integrationsservice}InstitutskriterienWert" minOccurs="0"/>
 *         <element name="institutskriterienDatum" type="{http://www.gillardon.de/marzipan/integrationsservice}InstitutskriterienDatum" minOccurs="0"/>
 *         <element name="iban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitutsdatenForAutoUpdateKopfdaten", propOrder = {

})
public class InstitutsdatenForAutoUpdateKopfdaten {

    /**
     * ID des Beraters (Name, Nummer oder ähnliches)
     */
    protected String berater;
    /**
     * Betriebsstelle/Kundenverantwortliche Stelle oder die Abteilung des Beraters oder dergleichen.
     */
    protected String betriebsstelle;
    /**
     * Kontonummer des Geschäfts
     */
    protected String kontonummer;
    /**
     * Liste der institutsspezifischen Geschäftsdaten
     */
    protected Institutsdatenvariabel institutsdatenvariabel;
    /**
     * Liste der Geschäftsdaten - Institutskriterien (Auswahl)
     */
    protected InstitutskriterienAuswahl institutskriterienAuswahl;
    /**
     * Liste der Geschäftsdaten - Institutskriterien (Wert)
     */
    protected InstitutskriterienWert institutskriterienWert;
    /**
     * Liste der Geschäftsdaten - Institutskriterien (Datum)
     */
    protected InstitutskriterienDatum institutskriterienDatum;
    /**
     * International Bank Account Number
     */
    protected String iban;
    /**
     * Business Identifier Code
     */
    protected String bic;

    /**
     * ID des Beraters (Name, Nummer oder ähnliches)
     *
     * @return possible object is
     * {@link String }
     */
    public String getBerater() {
        return berater;
    }

    /**
     * Sets the value of the berater property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getBerater()
     */
    public void setBerater(String value) {
        this.berater = value;
    }

    /**
     * Betriebsstelle/Kundenverantwortliche Stelle oder die Abteilung des Beraters oder dergleichen.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBetriebsstelle() {
        return betriebsstelle;
    }

    /**
     * Sets the value of the betriebsstelle property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getBetriebsstelle()
     */
    public void setBetriebsstelle(String value) {
        this.betriebsstelle = value;
    }

    /**
     * Kontonummer des Geschäfts
     *
     * @return possible object is
     * {@link String }
     */
    public String getKontonummer() {
        return kontonummer;
    }

    /**
     * Sets the value of the kontonummer property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKontonummer()
     */
    public void setKontonummer(String value) {
        this.kontonummer = value;
    }

    /**
     * Liste der institutsspezifischen Geschäftsdaten
     *
     * @return possible object is
     * {@link Institutsdatenvariabel }
     */
    public Institutsdatenvariabel getInstitutsdatenvariabel() {
        return institutsdatenvariabel;
    }

    /**
     * Sets the value of the institutsdatenvariabel property.
     *
     * @param value allowed object is
     *              {@link Institutsdatenvariabel }
     * @see #getInstitutsdatenvariabel()
     */
    public void setInstitutsdatenvariabel(Institutsdatenvariabel value) {
        this.institutsdatenvariabel = value;
    }

    /**
     * Liste der Geschäftsdaten - Institutskriterien (Auswahl)
     *
     * @return possible object is
     * {@link InstitutskriterienAuswahl }
     */
    public InstitutskriterienAuswahl getInstitutskriterienAuswahl() {
        return institutskriterienAuswahl;
    }

    /**
     * Sets the value of the institutskriterienAuswahl property.
     *
     * @param value allowed object is
     *              {@link InstitutskriterienAuswahl }
     * @see #getInstitutskriterienAuswahl()
     */
    public void setInstitutskriterienAuswahl(InstitutskriterienAuswahl value) {
        this.institutskriterienAuswahl = value;
    }

    /**
     * Liste der Geschäftsdaten - Institutskriterien (Wert)
     *
     * @return possible object is
     * {@link InstitutskriterienWert }
     */
    public InstitutskriterienWert getInstitutskriterienWert() {
        return institutskriterienWert;
    }

    /**
     * Sets the value of the institutskriterienWert property.
     *
     * @param value allowed object is
     *              {@link InstitutskriterienWert }
     * @see #getInstitutskriterienWert()
     */
    public void setInstitutskriterienWert(InstitutskriterienWert value) {
        this.institutskriterienWert = value;
    }

    /**
     * Liste der Geschäftsdaten - Institutskriterien (Datum)
     *
     * @return possible object is
     * {@link InstitutskriterienDatum }
     */
    public InstitutskriterienDatum getInstitutskriterienDatum() {
        return institutskriterienDatum;
    }

    /**
     * Sets the value of the institutskriterienDatum property.
     *
     * @param value allowed object is
     *              {@link InstitutskriterienDatum }
     * @see #getInstitutskriterienDatum()
     */
    public void setInstitutskriterienDatum(InstitutskriterienDatum value) {
        this.institutskriterienDatum = value;
    }

    /**
     * International Bank Account Number
     *
     * @return possible object is
     * {@link String }
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getIban()
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Business Identifier Code
     *
     * @return possible object is
     * {@link String }
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getBic()
     */
    public void setBic(String value) {
        this.bic = value;
    }

}
