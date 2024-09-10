
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Das Export-Tag wird von MARZIPAN benutzt, um Kreditgeschäfte, Zinsstrukturen, Finanzplätze, Deckungsbeitragsschemas, Ratingszenarien,
 * Risiko Eigenkapitalkosten, Risikokonfigurationen (Risikoübernahmeprämien) und Risiko variable Kosten (RisikoVarKost),
 * die vom externen System angefordert wurden, zu liefern.
 *
 * <p>Java class for Export complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Export">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Geschaefte" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Zinsstrukturen" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Finanzplaetze" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Deckungsbeitragsschemas" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Ratingszenarien" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}RisikoVarkosten" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}RisikoEigenkapitalkosten" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Risikokonfigurationen" minOccurs="0"/>
 *         <element ref="{http://www.gillardon.de/marzipan/integrationsservice}Fehlerliste" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Export", propOrder = {

})
public class Export {

    /**
     * Eine Liste von Geschäften eventuell mit zusätzlichen Ergebnissen.
     */
    @XmlElement(name = "Geschaefte")
    protected Geschaefte geschaefte;
    /**
     * Eine Liste von Zinsstrukturen.
     */
    @XmlElement(name = "Zinsstrukturen")
    protected Zinsstrukturen zinsstrukturen;
    /**
     * Eine Liste von Finanzplätzen.
     */
    @XmlElement(name = "Finanzplaetze")
    protected Finanzplaetze finanzplaetze;
    /**
     * Eine Liste von Deckungsbeitragsschemas.
     */
    @XmlElement(name = "Deckungsbeitragsschemas")
    protected Deckungsbeitragsschemas deckungsbeitragsschemas;
    /**
     * Eine Liste von Ratingszenarien.
     */
    @XmlElement(name = "Ratingszenarien")
    protected Ratingszenarien ratingszenarien;
    /**
     * Eine Liste von Risiko variablen Kosten.
     */
    @XmlElement(name = "RisikoVarkosten")
    protected RisikoVarkosten risikoVarkosten;
    /**
     * Eine Liste von Risiko Eigenkapitalkosten aufsichtsrechtlich.
     */
    @XmlElement(name = "RisikoEigenkapitalkosten")
    protected RisikoEigenkapitalkosten risikoEigenkapitalkosten;
    /**
     * Eine Liste von Risikokonfigurationen.
     */
    @XmlElement(name = "Risikokonfigurationen")
    protected Risikokonfigurationen risikokonfigurationen;
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
     * Eine Liste von Zinsstrukturen.
     *
     * @return possible object is
     * {@link Zinsstrukturen }
     */
    public Zinsstrukturen getZinsstrukturen() {
        return zinsstrukturen;
    }

    /**
     * Sets the value of the zinsstrukturen property.
     *
     * @param value allowed object is
     *              {@link Zinsstrukturen }
     * @see #getZinsstrukturen()
     */
    public void setZinsstrukturen(Zinsstrukturen value) {
        this.zinsstrukturen = value;
    }

    /**
     * Eine Liste von Finanzplätzen.
     *
     * @return possible object is
     * {@link Finanzplaetze }
     */
    public Finanzplaetze getFinanzplaetze() {
        return finanzplaetze;
    }

    /**
     * Sets the value of the finanzplaetze property.
     *
     * @param value allowed object is
     *              {@link Finanzplaetze }
     * @see #getFinanzplaetze()
     */
    public void setFinanzplaetze(Finanzplaetze value) {
        this.finanzplaetze = value;
    }

    /**
     * Eine Liste von Deckungsbeitragsschemas.
     *
     * @return possible object is
     * {@link Deckungsbeitragsschemas }
     */
    public Deckungsbeitragsschemas getDeckungsbeitragsschemas() {
        return deckungsbeitragsschemas;
    }

    /**
     * Sets the value of the deckungsbeitragsschemas property.
     *
     * @param value allowed object is
     *              {@link Deckungsbeitragsschemas }
     * @see #getDeckungsbeitragsschemas()
     */
    public void setDeckungsbeitragsschemas(Deckungsbeitragsschemas value) {
        this.deckungsbeitragsschemas = value;
    }

    /**
     * Eine Liste von Ratingszenarien.
     *
     * @return possible object is
     * {@link Ratingszenarien }
     */
    public Ratingszenarien getRatingszenarien() {
        return ratingszenarien;
    }

    /**
     * Sets the value of the ratingszenarien property.
     *
     * @param value allowed object is
     *              {@link Ratingszenarien }
     * @see #getRatingszenarien()
     */
    public void setRatingszenarien(Ratingszenarien value) {
        this.ratingszenarien = value;
    }

    /**
     * Eine Liste von Risiko variablen Kosten.
     *
     * @return possible object is
     * {@link RisikoVarkosten }
     */
    public RisikoVarkosten getRisikoVarkosten() {
        return risikoVarkosten;
    }

    /**
     * Sets the value of the risikoVarkosten property.
     *
     * @param value allowed object is
     *              {@link RisikoVarkosten }
     * @see #getRisikoVarkosten()
     */
    public void setRisikoVarkosten(RisikoVarkosten value) {
        this.risikoVarkosten = value;
    }

    /**
     * Eine Liste von Risiko Eigenkapitalkosten aufsichtsrechtlich.
     *
     * @return possible object is
     * {@link RisikoEigenkapitalkosten }
     */
    public RisikoEigenkapitalkosten getRisikoEigenkapitalkosten() {
        return risikoEigenkapitalkosten;
    }

    /**
     * Sets the value of the risikoEigenkapitalkosten property.
     *
     * @param value allowed object is
     *              {@link RisikoEigenkapitalkosten }
     * @see #getRisikoEigenkapitalkosten()
     */
    public void setRisikoEigenkapitalkosten(RisikoEigenkapitalkosten value) {
        this.risikoEigenkapitalkosten = value;
    }

    /**
     * Eine Liste von Risikokonfigurationen.
     *
     * @return possible object is
     * {@link Risikokonfigurationen }
     */
    public Risikokonfigurationen getRisikokonfigurationen() {
        return risikokonfigurationen;
    }

    /**
     * Sets the value of the risikokonfigurationen property.
     *
     * @param value allowed object is
     *              {@link Risikokonfigurationen }
     * @see #getRisikokonfigurationen()
     */
    public void setRisikokonfigurationen(Risikokonfigurationen value) {
        this.risikokonfigurationen = value;
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
