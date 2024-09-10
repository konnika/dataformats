
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Eine Anfrage mit Validate Tag wird von MARZIPAN versand, um die Daten in einem Kreditgeschäft zu prüfen.
 * Das externe System kann fehlende Daten ergänzen und an MARZIPAN zurückschicken.
 * In der Rückantwort kann eine Liste von Fehlern mitgeschickt werden.
 *
 * <p>Java class for Validate complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Validate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="Kreditgeschaeft" type="{http://www.gillardon.de/marzipan/integrationsservice}Kreditgeschaeft"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Fehlerliste" minOccurs="0"/>
 *         <element name="sachbearbeiter" type="{http://www.gillardon.de/marzipan/integrationsservice}Sachbearbeiter" minOccurs="0"/>
 *         <element name="sprache" type="{http://www.gillardon.de/marzipan/integrationsservice}Sprache" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Validate", propOrder = {

})
public class Validate {

    @XmlElement(name = "Kreditgeschaeft", required = true)
    protected Kreditgeschaeft kreditgeschaeft;
    /**
     * Wird zurückgeliefert, wenn die angeforderten Daten nicht existieren oder ein Validierungsfehler in den
     * Daten vorliegt.
     */
    @XmlElement(name = "Fehlerliste")
    protected Fehlerliste fehlerliste;
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
     * Gets the value of the kreditgeschaeft property.
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
     */
    public void setKreditgeschaeft(Kreditgeschaeft value) {
        this.kreditgeschaeft = value;
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
