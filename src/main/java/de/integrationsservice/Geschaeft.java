
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;


/**
 * Enthält Informationen zu einem Geschäft in MARZIPAN Web.
 *
 * <p>Java class for Geschaeft complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Geschaeft">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="alterstatus" type="{http://www.gillardon.de/marzipan/integrationsservice}Geschaeftsstatus" minOccurs="0"/>
 *         <element name="updatemodus" type="{http://www.gillardon.de/marzipan/integrationsservice}UpdateModus" minOccurs="0"/>
 *         <element name="Kreditgeschaeft" type="{http://www.gillardon.de/marzipan/integrationsservice}Kreditgeschaeft" minOccurs="0"/>
 *         <element name="Sparengeschaeft" type="{http://www.gillardon.de/marzipan/integrationsservice}Sparengeschaeft" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Plaene" minOccurs="0"/>
 *         <element name="dbSchema" type="{http://www.gillardon.de/marzipan/integrationsservice}DBSchema" minOccurs="0"/>
 *         <element name="sachbearbeiter" type="{http://www.gillardon.de/marzipan/integrationsservice}Sachbearbeiter" minOccurs="0"/>
 *         <element name="sprache" type="{http://www.gillardon.de/marzipan/integrationsservice}Sprache" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geschaeft", propOrder = {

})
public class Geschaeft {

    /**
     * Enthält den Status des Geschäfts vor der aktuellen Änderung.
     */
    @XmlSchemaType(name = "string")
    protected Geschaeftsstatus alterstatus;
    /**
     * Enthält den Modus für den Cashver-Update.
     */
    @XmlSchemaType(name = "string")
    protected UpdateModus updatemodus;
    /**
     * Enthält alle Daten zur Beschreibung eines Kredits.
     */
    @XmlElement(name = "Kreditgeschaeft")
    protected Kreditgeschaeft kreditgeschaeft;
    /**
     * Enthält alle Daten zur Beschreibung eines Passiv-Geschäfts.
     */
    @XmlElement(name = "Sparengeschaeft")
    protected Sparengeschaeft sparengeschaeft;
    /**
     * Enthält Cashflows, Abgrenzungspläne und Tilgungsplan.
     */
    @XmlElement(name = "Plaene")
    protected Plaene plaene;
    /**
     * Deckungsbeitragsschema für das im Nettomargenmodus berechnete Geschäft.
     */
    protected DBSchema dbSchema;
    /**
     * Daten des aktuell angemeldeten Sachbearbeiters
     */
    protected Sachbearbeiter sachbearbeiter;
    /**
     * Die benutzte Sprache in MARZIPAN Web. Es wird die Locale dafür benutzt.
     * Im Moment werden nur die Sprachen Deutsch und English unterstützt, bzw.: de_DE, en_US.
     */
    @XmlSchemaType(name = "string")
    protected Sprache sprache;

    /**
     * Enthält den Status des Geschäfts vor der aktuellen Änderung.
     *
     * @return possible object is
     * {@link Geschaeftsstatus }
     */
    public Geschaeftsstatus getAlterstatus() {
        return alterstatus;
    }

    /**
     * Sets the value of the alterstatus property.
     *
     * @param value allowed object is
     *              {@link Geschaeftsstatus }
     * @see #getAlterstatus()
     */
    public void setAlterstatus(Geschaeftsstatus value) {
        this.alterstatus = value;
    }

    /**
     * Enthält den Modus für den Cashver-Update.
     *
     * @return possible object is
     * {@link UpdateModus }
     */
    public UpdateModus getUpdatemodus() {
        return updatemodus;
    }

    /**
     * Sets the value of the updatemodus property.
     *
     * @param value allowed object is
     *              {@link UpdateModus }
     * @see #getUpdatemodus()
     */
    public void setUpdatemodus(UpdateModus value) {
        this.updatemodus = value;
    }

    /**
     * Enthält alle Daten zur Beschreibung eines Kredits.
     *
     * @return possible object is
     * {@link Kreditgeschaeft }
     */
    public Kreditgeschaeft getKreditgeschaeft() {
        return kreditgeschaeft;
    }

    /**
     * Sets the value of the kreditgeschaeft property.
     *
     * @param value allowed object is
     *              {@link Kreditgeschaeft }
     * @see #getKreditgeschaeft()
     */
    public void setKreditgeschaeft(Kreditgeschaeft value) {
        this.kreditgeschaeft = value;
    }

    /**
     * Enthält alle Daten zur Beschreibung eines Passiv-Geschäfts.
     *
     * @return possible object is
     * {@link Sparengeschaeft }
     */
    public Sparengeschaeft getSparengeschaeft() {
        return sparengeschaeft;
    }

    /**
     * Sets the value of the sparengeschaeft property.
     *
     * @param value allowed object is
     *              {@link Sparengeschaeft }
     * @see #getSparengeschaeft()
     */
    public void setSparengeschaeft(Sparengeschaeft value) {
        this.sparengeschaeft = value;
    }

    /**
     * Enthält Cashflows, Abgrenzungspläne und Tilgungsplan.
     *
     * @return possible object is
     * {@link Plaene }
     */
    public Plaene getPlaene() {
        return plaene;
    }

    /**
     * Sets the value of the plaene property.
     *
     * @param value allowed object is
     *              {@link Plaene }
     * @see #getPlaene()
     */
    public void setPlaene(Plaene value) {
        this.plaene = value;
    }

    /**
     * Deckungsbeitragsschema für das im Nettomargenmodus berechnete Geschäft.
     *
     * @return possible object is
     * {@link DBSchema }
     */
    public DBSchema getDbSchema() {
        return dbSchema;
    }

    /**
     * Sets the value of the dbSchema property.
     *
     * @param value allowed object is
     *              {@link DBSchema }
     * @see #getDbSchema()
     */
    public void setDbSchema(DBSchema value) {
        this.dbSchema = value;
    }

    /**
     * Daten des aktuell angemeldeten Sachbearbeiters
     *
     * @return possible object is
     * {@link Sachbearbeiter }
     */
    public Sachbearbeiter getSachbearbeiter() {
        return sachbearbeiter;
    }

    /**
     * Sets the value of the sachbearbeiter property.
     *
     * @param value allowed object is
     *              {@link Sachbearbeiter }
     * @see #getSachbearbeiter()
     */
    public void setSachbearbeiter(Sachbearbeiter value) {
        this.sachbearbeiter = value;
    }

    /**
     * Die benutzte Sprache in MARZIPAN Web. Es wird die Locale dafür benutzt.
     * Im Moment werden nur die Sprachen Deutsch und English unterstützt, bzw.: de_DE, en_US.
     *
     * @return possible object is
     * {@link Sprache }
     */
    public Sprache getSprache() {
        return sprache;
    }

    /**
     * Sets the value of the sprache property.
     *
     * @param value allowed object is
     *              {@link Sprache }
     * @see #getSprache()
     */
    public void setSprache(Sprache value) {
        this.sprache = value;
    }

}
