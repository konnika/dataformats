
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;


/**
 * Die ImportAnfrage Nachricht wird an ein externes System gesendet (durch klicken auf den "Import-Button"), um den Import von Kreditgeschäften zu veranlassen.
 * Nur ein einziges Kreditgeschäft darf auf einmal importiert werden.
 *
 * <p>Java class for ImportAnfrage complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ImportAnfrage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="kreditgeschaeftSelektion" type="{http://www.gillardon.de/marzipan/integrationsservice}KreditgeschaeftSelektionImport"/>
 *         <element name="externessystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sprache" type="{http://www.gillardon.de/marzipan/integrationsservice}Sprache" minOccurs="0"/>
 *         <element name="sachbearbeiter" type="{http://www.gillardon.de/marzipan/integrationsservice}Sachbearbeiter" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportAnfrage", propOrder = {

})
public class ImportAnfrage {

    /**
     * Das Tag erlaubt die Auswahl des zu importierenden Kreditgeschäfts über die Angabe von eindeutigem
     * Name bzw. eindeutiger Kontonummer.
     */
    @XmlElement(required = true)
    protected KreditgeschaeftSelektionImport kreditgeschaeftSelektion;
    /**
     * Externes System, von dem MARZIPAN Daten anfordert.
     */
    protected String externessystem;
    /**
     * Die benutzte Sprache in MARZIPAN Web. Es wird die Locale dafür benutzt.
     * Im Moment werden nur die Sprachen Deutsch und English unterstützt, bzw.: de_DE, en_US.
     */
    @XmlSchemaType(name = "string")
    protected Sprache sprache;
    /**
     * Daten des aktuell angemeldeten Sachbearbeiters, der den Import von Daten aus dem externen System veranlasst hat.
     */
    protected Sachbearbeiter sachbearbeiter;

    /**
     * Das Tag erlaubt die Auswahl des zu importierenden Kreditgeschäfts über die Angabe von eindeutigem
     * Name bzw. eindeutiger Kontonummer.
     *
     * @return possible object is
     * {@link KreditgeschaeftSelektionImport }
     */
    public KreditgeschaeftSelektionImport getKreditgeschaeftSelektion() {
        return kreditgeschaeftSelektion;
    }

    /**
     * Sets the value of the kreditgeschaeftSelektion property.
     *
     * @param value allowed object is
     *              {@link KreditgeschaeftSelektionImport }
     * @see #getKreditgeschaeftSelektion()
     */
    public void setKreditgeschaeftSelektion(KreditgeschaeftSelektionImport value) {
        this.kreditgeschaeftSelektion = value;
    }

    /**
     * Externes System, von dem MARZIPAN Daten anfordert.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExternessystem() {
        return externessystem;
    }

    /**
     * Sets the value of the externessystem property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getExternessystem()
     */
    public void setExternessystem(String value) {
        this.externessystem = value;
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

    /**
     * Daten des aktuell angemeldeten Sachbearbeiters, der den Import von Daten aus dem externen System veranlasst hat.
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

}
