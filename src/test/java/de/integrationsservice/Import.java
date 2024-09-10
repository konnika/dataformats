
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Das Import-Tag wird vom externen System verwendet, um ein Kreditgeschäft, das aus MARZIPAN heraus mit einer Import-Anfrage Message angefordert wurde,
 * zu liefern. Falls das angeforderte Geschäft nicht existiert, wird eine entsprechende Fehlermeldung geliefert.
 * Das Import-Tag wird auch beim Einsprung über einen Post-Request verwendet. Hierbei kann sowohl ein Kreditgeschäft als auch ein Sparengeschäft
 * importiert werden.
 * Die Import Nachricht wird noch von externem System an MARZIPAN gesendet (durch klicken auf den "Export-Button" im externen Programm), um den Import
 * von Geschäfte zu veranlassen.
 *
 * <p>Java class for Import complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Import">
 *   <complexContent>
 *     <extension base="{http://www.gillardon.de/marzipan/integrationsservice}Logindaten">
 *       <sequence>
 *         <element name="ruecksprungurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Geschaefte" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Fehlerliste" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Import", propOrder = {
        "ruecksprungurl",
        "geschaefte",
        "fehlerliste"
})
public class Import
        extends Logindaten {

    /**
     * Gilt nur für Einsprung ueber Postrequest:
     * Definiert die url für den Rücksprung in das Portal
     */
    protected String ruecksprungurl;
    /**
     * Eine Liste von Geschäften eventuell mit zusätzlichen Ergebnissen.
     */
    @XmlElement(name = "Geschaefte")
    protected Geschaefte geschaefte;
    /**
     * Wird zurückgeliefert, wenn die angeforderten Daten nicht existieren oder ein Validierungsfehler in den
     * Daten vorliegt.
     */
    @XmlElement(name = "Fehlerliste")
    protected Fehlerliste fehlerliste;

    /**
     * Gilt nur für Einsprung ueber Postrequest:
     * Definiert die url für den Rücksprung in das Portal
     *
     * @return possible object is
     * {@link String }
     */
    public String getRuecksprungurl() {
        return ruecksprungurl;
    }

    /**
     * Sets the value of the ruecksprungurl property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getRuecksprungurl()
     */
    public void setRuecksprungurl(String value) {
        this.ruecksprungurl = value;
    }

    /**
     * Eine Liste von Geschäften eventuell mit zusätzlichen Ergebnissen.
     *
     * @return possible object is
     * {@link Geschaefte }
     */
    public Geschaefte getGeschaefte() {
        return geschaefte;
    }

    /**
     * Sets the value of the geschaefte property.
     *
     * @param value allowed object is
     *              {@link Geschaefte }
     * @see #getGeschaefte()
     */
    public void setGeschaefte(Geschaefte value) {
        this.geschaefte = value;
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
