
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die ExportAnfrage Nachricht wird über den Webservice-Aufruf "MarzipanExportRequest" gesendet, um den Export von Daten zu veranlassen.
 * MARZIPAN kann Zinsstrukturen, Finanzplätze, Deckungsbeitragsschemas, Ratingszenarien, Risiko variable Kosten (RisikoVarKost), Risiko Eigenkapitalkosten,
 * Risikokonfigurationen (Risikoübernahmeprämien) und Geschäftsdaten exportieren. Nur jeweils ein Datensatz ist exportierbar.
 * Das ExportAnfrage-Tag dient auch als Root-Element für die Anforderung von Daten aus Marzipan heraus über JMS.
 * Nur Geschäfte und Zinsstrukturen können per JMS exportiert werden.
 *
 * <p>Java class for ExportAnfrage complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ExportAnfrage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="kreditgeschaeftSelektion" type="{http://www.gillardon.de/marzipan/integrationsservice}KreditgeschaeftSelektionExport" minOccurs="0"/>
 *         <element name="zinsstrukturenSelektion" type="{http://www.gillardon.de/marzipan/integrationsservice}ZinsstrukturenSelektion" minOccurs="0"/>
 *         <element name="finanzplaetzeSelektion" type="{http://www.gillardon.de/marzipan/integrationsservice}NamenSelektion" minOccurs="0"/>
 *         <element name="deckungsbeitragsschemasSelektion" type="{http://www.gillardon.de/marzipan/integrationsservice}NamenSelektion" minOccurs="0"/>
 *         <element name="ratingszenarienSelektion" type="{http://www.gillardon.de/marzipan/integrationsservice}NamenSelektion" minOccurs="0"/>
 *         <element name="risikoVarkostenSelektion" type="{http://www.gillardon.de/marzipan/integrationsservice}NamenSelektion" minOccurs="0"/>
 *         <element name="risikoEigenkapitalkostenSelektion" type="{http://www.gillardon.de/marzipan/integrationsservice}NamenSelektion" minOccurs="0"/>
 *         <element name="risikokonfigurationenSelektion" type="{http://www.gillardon.de/marzipan/integrationsservice}NamenSelektion" minOccurs="0"/>
 *         <element name="institutsname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportAnfrage", propOrder = {

})
public class ExportAnfrage {

    /**
     * Das Tag erlaubt die Auswahl der zu exportierenden Kreditgeschäfte über die Angabe von eindeutigen
     * IDs, Namen bzw. Kontonummern.
     */
    protected KreditgeschaeftSelektionExport kreditgeschaeftSelektion;
    /**
     * Das ZinstrukturenSelektion Tag erlaubt die Auswahl der zu exportierenden Zinsstrukturen über die Angabe
     * der eindeutigen ID oder die Selektion mehrer Zinsstrukturen über das <alleaus> Tag.
     */
    protected ZinsstrukturenSelektion zinsstrukturenSelektion;
    /**
     * Das FinanzplaetzeSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Finanzplätze über die Angabe
     * von eindeutigen Namen.
     */
    protected NamenSelektion finanzplaetzeSelektion;
    /**
     * Das DeckungsbeitragsschemaSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Deckungsbeitragsschemas über die Angabe
     * von eindeutigen Namen.
     */
    protected NamenSelektion deckungsbeitragsschemasSelektion;
    /**
     * Das RatingszenarienSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Ratingszenarien über die Angabe
     * von eindeutigen Namen.
     */
    protected NamenSelektion ratingszenarienSelektion;
    /**
     * Das risikoVarkostenSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Risiko variablen Kosten über die Angabe
     * von eindeutigen Namen.
     */
    protected NamenSelektion risikoVarkostenSelektion;
    /**
     * Das risikoEigenkaptialkostenSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Risiko Eigenkapitalkosten aufsichtsrechtlich über die Angabe
     * von eindeutigen Namen.
     */
    protected NamenSelektion risikoEigenkapitalkostenSelektion;
    /**
     * Das risikokonfigurationSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Risikokonfigurationen über die Angabe
     * von eindeutigen Namen.
     */
    protected NamenSelektion risikokonfigurationenSelektion;
    /**
     * Name des Instituts, für welches ein Export durchgeführt werden soll.
     * Dieses Element wird nur bei MultiClient-Betrieb benötigt.
     * Aktuell wird dieses Feld nur beim Export über den Webservice ausgewertet.
     */
    protected String institutsname;

    /**
     * Das Tag erlaubt die Auswahl der zu exportierenden Kreditgeschäfte über die Angabe von eindeutigen
     * IDs, Namen bzw. Kontonummern.
     *
     * @return possible object is
     * {@link KreditgeschaeftSelektionExport }
     */
    public KreditgeschaeftSelektionExport getKreditgeschaeftSelektion() {
        return kreditgeschaeftSelektion;
    }

    /**
     * Sets the value of the kreditgeschaeftSelektion property.
     *
     * @param value allowed object is
     *              {@link KreditgeschaeftSelektionExport }
     * @see #getKreditgeschaeftSelektion()
     */
    public void setKreditgeschaeftSelektion(KreditgeschaeftSelektionExport value) {
        this.kreditgeschaeftSelektion = value;
    }

    /**
     * Das ZinstrukturenSelektion Tag erlaubt die Auswahl der zu exportierenden Zinsstrukturen über die Angabe
     * der eindeutigen ID oder die Selektion mehrer Zinsstrukturen über das <alleaus> Tag.
     *
     * @return possible object is
     * {@link ZinsstrukturenSelektion }
     */
    public ZinsstrukturenSelektion getZinsstrukturenSelektion() {
        return zinsstrukturenSelektion;
    }

    /**
     * Sets the value of the zinsstrukturenSelektion property.
     *
     * @param value allowed object is
     *              {@link ZinsstrukturenSelektion }
     * @see #getZinsstrukturenSelektion()
     */
    public void setZinsstrukturenSelektion(ZinsstrukturenSelektion value) {
        this.zinsstrukturenSelektion = value;
    }

    /**
     * Das FinanzplaetzeSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Finanzplätze über die Angabe
     * von eindeutigen Namen.
     *
     * @return possible object is
     * {@link NamenSelektion }
     */
    public NamenSelektion getFinanzplaetzeSelektion() {
        return finanzplaetzeSelektion;
    }

    /**
     * Sets the value of the finanzplaetzeSelektion property.
     *
     * @param value allowed object is
     *              {@link NamenSelektion }
     * @see #getFinanzplaetzeSelektion()
     */
    public void setFinanzplaetzeSelektion(NamenSelektion value) {
        this.finanzplaetzeSelektion = value;
    }

    /**
     * Das DeckungsbeitragsschemaSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Deckungsbeitragsschemas über die Angabe
     * von eindeutigen Namen.
     *
     * @return possible object is
     * {@link NamenSelektion }
     */
    public NamenSelektion getDeckungsbeitragsschemasSelektion() {
        return deckungsbeitragsschemasSelektion;
    }

    /**
     * Sets the value of the deckungsbeitragsschemasSelektion property.
     *
     * @param value allowed object is
     *              {@link NamenSelektion }
     * @see #getDeckungsbeitragsschemasSelektion()
     */
    public void setDeckungsbeitragsschemasSelektion(NamenSelektion value) {
        this.deckungsbeitragsschemasSelektion = value;
    }

    /**
     * Das RatingszenarienSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Ratingszenarien über die Angabe
     * von eindeutigen Namen.
     *
     * @return possible object is
     * {@link NamenSelektion }
     */
    public NamenSelektion getRatingszenarienSelektion() {
        return ratingszenarienSelektion;
    }

    /**
     * Sets the value of the ratingszenarienSelektion property.
     *
     * @param value allowed object is
     *              {@link NamenSelektion }
     * @see #getRatingszenarienSelektion()
     */
    public void setRatingszenarienSelektion(NamenSelektion value) {
        this.ratingszenarienSelektion = value;
    }

    /**
     * Das risikoVarkostenSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Risiko variablen Kosten über die Angabe
     * von eindeutigen Namen.
     *
     * @return possible object is
     * {@link NamenSelektion }
     */
    public NamenSelektion getRisikoVarkostenSelektion() {
        return risikoVarkostenSelektion;
    }

    /**
     * Sets the value of the risikoVarkostenSelektion property.
     *
     * @param value allowed object is
     *              {@link NamenSelektion }
     * @see #getRisikoVarkostenSelektion()
     */
    public void setRisikoVarkostenSelektion(NamenSelektion value) {
        this.risikoVarkostenSelektion = value;
    }

    /**
     * Das risikoEigenkaptialkostenSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Risiko Eigenkapitalkosten aufsichtsrechtlich über die Angabe
     * von eindeutigen Namen.
     *
     * @return possible object is
     * {@link NamenSelektion }
     */
    public NamenSelektion getRisikoEigenkapitalkostenSelektion() {
        return risikoEigenkapitalkostenSelektion;
    }

    /**
     * Sets the value of the risikoEigenkapitalkostenSelektion property.
     *
     * @param value allowed object is
     *              {@link NamenSelektion }
     * @see #getRisikoEigenkapitalkostenSelektion()
     */
    public void setRisikoEigenkapitalkostenSelektion(NamenSelektion value) {
        this.risikoEigenkapitalkostenSelektion = value;
    }

    /**
     * Das risikokonfigurationSelektion Tag erlaubt die
     * Auswahl der zu exportierenden Risikokonfigurationen über die Angabe
     * von eindeutigen Namen.
     *
     * @return possible object is
     * {@link NamenSelektion }
     */
    public NamenSelektion getRisikokonfigurationenSelektion() {
        return risikokonfigurationenSelektion;
    }

    /**
     * Sets the value of the risikokonfigurationenSelektion property.
     *
     * @param value allowed object is
     *              {@link NamenSelektion }
     * @see #getRisikokonfigurationenSelektion()
     */
    public void setRisikokonfigurationenSelektion(NamenSelektion value) {
        this.risikokonfigurationenSelektion = value;
    }

    /**
     * Name des Instituts, für welches ein Export durchgeführt werden soll.
     * Dieses Element wird nur bei MultiClient-Betrieb benötigt.
     * Aktuell wird dieses Feld nur beim Export über den Webservice ausgewertet.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInstitutsname() {
        return institutsname;
    }

    /**
     * Sets the value of the institutsname property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getInstitutsname()
     */
    public void setInstitutsname(String value) {
        this.institutsname = value;
    }

}
