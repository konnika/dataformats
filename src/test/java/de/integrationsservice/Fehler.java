
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Fehler complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Fehler">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="fehlerkategorie" type="{http://www.gillardon.de/marzipan/integrationsservice}Fehlerkategorie" minOccurs="0"/>
 *         <element name="fehlerid" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         <element name="fehlertext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="parameterliste" type="{http://www.gillardon.de/marzipan/integrationsservice}FehlerParameterliste" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fehler", propOrder = {

})
public class Fehler {

    /**
     * Kategorie des Fehlers (Fehler, Warnung oder Info)
     */
    @XmlSchemaType(name = "string")
    protected Fehlerkategorie fehlerkategorie;
    /**
     * Eindeutige Bezeichnung des Fehlers. Mittels der Bezeichnung wird sprachabhängig
     * nach einem hinterlegten
     * Fehlertext gesucht. Wenn kein Fehlertext gefunden wird, wird die geschickte Fehler-ID angezeigt.
     */
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fehlerid;
    /**
     * Fehlertext, der ausgegeben wird, wenn keine Fehler-ID übergeben wurde.
     */
    protected String fehlertext;
    /**
     * Liste von Parametern zu der Fehlermeldung. Die Unterscheidung der Parametertypen von den
     * Stringparametern ist für die
     * länderspezifische Ausgabe der Fehlermeldung wichtig.
     * Die Reihenfolge der Untertags ist signifikant, da sie bei der Ausgabe der Fehlermeldung für die
     * Zuordnung der Parameter
     * zu einem entsprechenden Platzhalter verwendet wird.
     */
    protected FehlerParameterliste parameterliste;

    /**
     * Kategorie des Fehlers (Fehler, Warnung oder Info)
     *
     * @return possible object is
     * {@link Fehlerkategorie }
     */
    public Fehlerkategorie getFehlerkategorie() {
        return fehlerkategorie;
    }

    /**
     * Sets the value of the fehlerkategorie property.
     *
     * @param value allowed object is
     *              {@link Fehlerkategorie }
     * @see #getFehlerkategorie()
     */
    public void setFehlerkategorie(Fehlerkategorie value) {
        this.fehlerkategorie = value;
    }

    /**
     * Eindeutige Bezeichnung des Fehlers. Mittels der Bezeichnung wird sprachabhängig
     * nach einem hinterlegten
     * Fehlertext gesucht. Wenn kein Fehlertext gefunden wird, wird die geschickte Fehler-ID angezeigt.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFehlerid() {
        return fehlerid;
    }

    /**
     * Sets the value of the fehlerid property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getFehlerid()
     */
    public void setFehlerid(String value) {
        this.fehlerid = value;
    }

    /**
     * Fehlertext, der ausgegeben wird, wenn keine Fehler-ID übergeben wurde.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFehlertext() {
        return fehlertext;
    }

    /**
     * Sets the value of the fehlertext property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getFehlertext()
     */
    public void setFehlertext(String value) {
        this.fehlertext = value;
    }

    /**
     * Liste von Parametern zu der Fehlermeldung. Die Unterscheidung der Parametertypen von den
     * Stringparametern ist für die
     * länderspezifische Ausgabe der Fehlermeldung wichtig.
     * Die Reihenfolge der Untertags ist signifikant, da sie bei der Ausgabe der Fehlermeldung für die
     * Zuordnung der Parameter
     * zu einem entsprechenden Platzhalter verwendet wird.
     *
     * @return possible object is
     * {@link FehlerParameterliste }
     */
    public FehlerParameterliste getParameterliste() {
        return parameterliste;
    }

    /**
     * Sets the value of the parameterliste property.
     *
     * @param value allowed object is
     *              {@link FehlerParameterliste }
     * @see #getParameterliste()
     */
    public void setParameterliste(FehlerParameterliste value) {
        this.parameterliste = value;
    }

}
