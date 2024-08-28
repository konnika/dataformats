
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Das ImportMitMelden-Tag wird vom externen System verwendet, um ein Kredit- oder Sparen-Geschäft in der MARZIPAN-Datenbank zu speichern
 * und sofort zu melden (evtl. mit automatischer Freigabe) oder anzufragen.
 * Eine möglicherweise aktivierte verpflichtende fachliche Anfrage in den Voreinstellungen wird in diesem Use-Case nicht berücksichtigt.
 * Sparen-Geschäfte können nur über die Webservice-Schnittstelle importiert werden, nicht über die JMS-Schnittstelle.
 * Es kann nur 1 Geschäft importiert werden, d.h. entweder "Kreditgeschaeft" oder "Sparengeschaeft" müssen leer sein.
 *
 * <p>Java class for ImportMitMelden complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ImportMitMelden">
 *   <complexContent>
 *     <extension base="{http://www.gillardon.de/marzipan/integrationsservice}Logindaten">
 *       <sequence>
 *         <element name="Kreditgeschaeft" type="{http://www.gillardon.de/marzipan/integrationsservice}Kreditgeschaeft" minOccurs="0"/>
 *         <element name="Sparengeschaeft" type="{http://www.gillardon.de/marzipan/integrationsservice}Sparengeschaeft" minOccurs="0"/>
 *         <element name="ueberpruefungAnfragegrenzen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="automatischeFreigabe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportMitMelden", propOrder = {
        "kreditgeschaeft",
        "sparengeschaeft",
        "ueberpruefungAnfragegrenzen",
        "automatischeFreigabe"
})
public class ImportMitMelden
        extends Logindaten {

    /**
     * Daten des zu importierenden Kredit-Geschäfts.
     */
    @XmlElement(name = "Kreditgeschaeft")
    protected Kreditgeschaeft kreditgeschaeft;
    /**
     * Daten des zu importierenden Sparen-Geschäfts (nur für die Webservice-Schnittstelle relevant).
     */
    @XmlElement(name = "Sparengeschaeft")
    protected Sparengeschaeft sparengeschaeft;
    /**
     * Sollen die Anfragegrenzen überprüft werden und bei Überschreiten das Geschäft in den Status "ANGEFRAGT_TREASURY" übergehen?
     * Falls dieses Flag auf "false" steht, wird das Geschäft sofort in den Status "Gemeldet" oder "Freigegeben" überführt,
     * auch wenn die Schwellwerte überschritten werden. Diese Einstellung wirkt nur bei Kreditgeschäften.
     * Bei Sparengeschäften wird sie ignoriert, da es hier kein Anfragen gibt.
     */
    protected boolean ueberpruefungAnfragegrenzen;
    /**
     * Legt fest, ob ein zu meldendes Geschäft sofort freigegeben werden soll.
     * Diese (optionale) Einstellung überschreibt die entsprechende Voreinstellung für die automatische Freigabe,
     * d.h. bei aktivierter automatischer Freigabe wird beim Melden immer sofort freigegeben,
     * bei deaktivierter automatischer Freigabe wird nie sofort freigegeben (unabhängig von der Voreinstellung).
     * Wird das Element nicht übergeben, erfolgt die automatische Freigabe entsprechend der Voreinstellung.
     */
    protected Boolean automatischeFreigabe;

    /**
     * Daten des zu importierenden Kredit-Geschäfts.
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
     * Daten des zu importierenden Sparen-Geschäfts (nur für die Webservice-Schnittstelle relevant).
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
     * Sollen die Anfragegrenzen überprüft werden und bei Überschreiten das Geschäft in den Status "ANGEFRAGT_TREASURY" übergehen?
     * Falls dieses Flag auf "false" steht, wird das Geschäft sofort in den Status "Gemeldet" oder "Freigegeben" überführt,
     * auch wenn die Schwellwerte überschritten werden. Diese Einstellung wirkt nur bei Kreditgeschäften.
     * Bei Sparengeschäften wird sie ignoriert, da es hier kein Anfragen gibt.
     */
    public boolean isUeberpruefungAnfragegrenzen() {
        return ueberpruefungAnfragegrenzen;
    }

    /**
     * Sets the value of the ueberpruefungAnfragegrenzen property.
     */
    public void setUeberpruefungAnfragegrenzen(boolean value) {
        this.ueberpruefungAnfragegrenzen = value;
    }

    /**
     * Legt fest, ob ein zu meldendes Geschäft sofort freigegeben werden soll.
     * Diese (optionale) Einstellung überschreibt die entsprechende Voreinstellung für die automatische Freigabe,
     * d.h. bei aktivierter automatischer Freigabe wird beim Melden immer sofort freigegeben,
     * bei deaktivierter automatischer Freigabe wird nie sofort freigegeben (unabhängig von der Voreinstellung).
     * Wird das Element nicht übergeben, erfolgt die automatische Freigabe entsprechend der Voreinstellung.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAutomatischeFreigabe() {
        return automatischeFreigabe;
    }

    /**
     * Sets the value of the automatischeFreigabe property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isAutomatischeFreigabe()
     */
    public void setAutomatischeFreigabe(Boolean value) {
        this.automatischeFreigabe = value;
    }

}
