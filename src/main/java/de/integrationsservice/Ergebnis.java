
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Wird als Antwort auf diverse Anfragen (z.B. Statusübergang, Rekonditionierung, AutoImport) verwendet.
 * Es wird entweder ein Geschäft oder eine Fehlermeldung zurückgeliefert.
 * Im Erfolgsfall werden evtl. auch eine oder mehrere Warnungen/Infos mitgeschickt.
 * Die Pläne werden nicht bei jedem Use-Case erzeugt und geliefert.
 *
 * <p>Java class for Ergebnis complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Ergebnis">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Geschaefte" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Fehlerliste" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ergebnis", propOrder = {

})
public class Ergebnis {

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
