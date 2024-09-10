
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enthält Cashflows, Abgrenzungspläne und Tilgungspläne.
 *
 * <p>Java class for Plaene complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Plaene">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="abgrenzungen" type="{http://www.gillardon.de/marzipan/integrationsservice}Abgrenzungen" minOccurs="0"/>
 *         <element name="cashflowListe" type="{http://www.gillardon.de/marzipan/integrationsservice}CashflowListe" minOccurs="0"/>
 *         <element name="tilgungsplan" type="{http://www.gillardon.de/marzipan/integrationsservice}Tilgungsplan" minOccurs="0"/>
 *         <element name="tilgungsplanGesamtkosten" type="{http://www.gillardon.de/marzipan/integrationsservice}Tilgungsplan" minOccurs="0"/>
 *         <element name="zeroBondAbzinsungskonto" type="{http://www.gillardon.de/marzipan/integrationsservice}ZeroBondAbzinsungskonto" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Plaene", propOrder = {

})
public class Plaene {

    /**
     * Zins- und Gebührenabgrenzungen
     */
    protected Abgrenzungen abgrenzungen;
    /**
     * Liste von CashFlows
     */
    protected CashflowListe cashflowListe;
    /**
     * Voller Tilgungsplan bis Zinsbindungsende.
     */
    protected Tilgungsplan tilgungsplan;
    /**
     * Voller Tilgungsplan aus Gesamtkosten-Sicht inkl. PAngV-Gebühren.
     * Einige Einstellungen werden unabhängig von Geschäfts-Vorgaben mit festen Werten vorbelegt
     * (z.B. Kontoabschlussvariante "Konto beibehalten" und automatische Ermittlung der Konditionen des
     * Folgedarlehens).
     * Dieser Plan wird - falls angefordert - beim Export von Geschäften über die
     * Webservice-Schnittstelle geliefert.
     * Dieser Plan kann nur für Annuitätendarlehen, Tilgungsdarlehen und Endfällige Darlehen
     * angefordert werden.
     * Für alle anderen Produkttypen (einschließlich Universaldarlehen) wird dieser Plan nie
     * exportiert.
     */
    protected Tilgungsplan tilgungsplanGesamtkosten;
    /**
     * Nachweis über Abzinsung mit Zerobondrenditen.
     */
    protected ZeroBondAbzinsungskonto zeroBondAbzinsungskonto;

    /**
     * Zins- und Gebührenabgrenzungen
     *
     * @return possible object is
     * {@link Abgrenzungen }
     */
    public Abgrenzungen getAbgrenzungen() {
        return abgrenzungen;
    }

    /**
     * Sets the value of the abgrenzungen property.
     *
     * @param value allowed object is
     *              {@link Abgrenzungen }
     * @see #getAbgrenzungen()
     */
    public void setAbgrenzungen(Abgrenzungen value) {
        this.abgrenzungen = value;
    }

    /**
     * Liste von CashFlows
     *
     * @return possible object is
     * {@link CashflowListe }
     */
    public CashflowListe getCashflowListe() {
        return cashflowListe;
    }

    /**
     * Sets the value of the cashflowListe property.
     *
     * @param value allowed object is
     *              {@link CashflowListe }
     * @see #getCashflowListe()
     */
    public void setCashflowListe(CashflowListe value) {
        this.cashflowListe = value;
    }

    /**
     * Voller Tilgungsplan bis Zinsbindungsende.
     *
     * @return possible object is
     * {@link Tilgungsplan }
     */
    public Tilgungsplan getTilgungsplan() {
        return tilgungsplan;
    }

    /**
     * Sets the value of the tilgungsplan property.
     *
     * @param value allowed object is
     *              {@link Tilgungsplan }
     * @see #getTilgungsplan()
     */
    public void setTilgungsplan(Tilgungsplan value) {
        this.tilgungsplan = value;
    }

    /**
     * Voller Tilgungsplan aus Gesamtkosten-Sicht inkl. PAngV-Gebühren.
     * Einige Einstellungen werden unabhängig von Geschäfts-Vorgaben mit festen Werten vorbelegt
     * (z.B. Kontoabschlussvariante "Konto beibehalten" und automatische Ermittlung der Konditionen des
     * Folgedarlehens).
     * Dieser Plan wird - falls angefordert - beim Export von Geschäften über die
     * Webservice-Schnittstelle geliefert.
     * Dieser Plan kann nur für Annuitätendarlehen, Tilgungsdarlehen und Endfällige Darlehen
     * angefordert werden.
     * Für alle anderen Produkttypen (einschließlich Universaldarlehen) wird dieser Plan nie
     * exportiert.
     *
     * @return possible object is
     * {@link Tilgungsplan }
     */
    public Tilgungsplan getTilgungsplanGesamtkosten() {
        return tilgungsplanGesamtkosten;
    }

    /**
     * Sets the value of the tilgungsplanGesamtkosten property.
     *
     * @param value allowed object is
     *              {@link Tilgungsplan }
     * @see #getTilgungsplanGesamtkosten()
     */
    public void setTilgungsplanGesamtkosten(Tilgungsplan value) {
        this.tilgungsplanGesamtkosten = value;
    }

    /**
     * Nachweis über Abzinsung mit Zerobondrenditen.
     *
     * @return possible object is
     * {@link ZeroBondAbzinsungskonto }
     */
    public ZeroBondAbzinsungskonto getZeroBondAbzinsungskonto() {
        return zeroBondAbzinsungskonto;
    }

    /**
     * Sets the value of the zeroBondAbzinsungskonto property.
     *
     * @param value allowed object is
     *              {@link ZeroBondAbzinsungskonto }
     * @see #getZeroBondAbzinsungskonto()
     */
    public void setZeroBondAbzinsungskonto(ZeroBondAbzinsungskonto value) {
        this.zeroBondAbzinsungskonto = value;
    }

}
