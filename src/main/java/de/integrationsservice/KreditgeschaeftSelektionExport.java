
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Das Tag erlaubt die Auswahl der zu exportierenden Kreditgeschäfte über die Angabe von eindeutigen
 * IDs, Namen bzw. Kontonummern.
 *
 * <p>Java class for KreditgeschaeftSelektionExport complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="KreditgeschaeftSelektionExport">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="oid" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="kontonummer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         </choice>
 *         <element name="mitCashflows" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mitTilgungsplan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="mitTilgungsplanGesamtkosten" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="mitAbgrenzungen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KreditgeschaeftSelektionExport", propOrder = {
        "oid",
        "kontonummer",
        "name",
        "mitCashflows",
        "mitTilgungsplan",
        "mitTilgungsplanGesamtkosten",
        "mitAbgrenzungen"
})
public class KreditgeschaeftSelektionExport {

    /**
     * Darf als Selektionskriterium benutzt sein, wenn der Export über JMS durchgeführt ist.
     */
    @XmlElement(type = Integer.class)
    protected List<Integer> oid;
    /**
     * Darf als Selektionskriterium benutzt sein, wenn der Export über JMS durchgeführt ist.
     */
    protected List<String> kontonummer;
    /**
     * Darf als Selektionskriterium benutzt sein, wenn der Export über Webservice oder JMS durchgeführt ist.
     */
    protected List<String> name;
    /**
     * Sollen Cashflows mit exportiert werden?
     */
    protected boolean mitCashflows;
    /**
     * Soll der volle Tilgungsplan bis Zinsbindungsende mit exportiert werden?
     */
    protected Boolean mitTilgungsplan;
    /**
     * Soll der volle Tilgungsplan aus Gesamtkosten-Sicht inkl. PAngV-Gebühren mit exportiert werden?
     * Diese Einstellung wirkt nur an der Webservice-Schnittstelle.
     * An der JMS-Schnittstelle wird der Tilgungsplan aus Gesamtkosten-Sicht nie exportiert.
     * Dieser Plan kann nur für Annuitätendarlehen, Tilgungsdarlehen und Endfällige Darlehen angefordert werden.
     * Für alle anderen Produkttypen (einschließlich Universaldarlehen) wird eine entsprechende Anforderung ignoriert.
     */
    protected Boolean mitTilgungsplanGesamtkosten;
    /**
     * Sollen Abgrenzungspläne mit exportiert werden?
     */
    protected boolean mitAbgrenzungen;

    /**
     * Darf als Selektionskriterium benutzt sein, wenn der Export über JMS durchgeführt ist.
     * <p>
     * Gets the value of the oid property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oid property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOid().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     *
     * @return The value of the oid property.
     */
    public List<Integer> getOid() {
        if (oid == null) {
            oid = new ArrayList<>();
        }
        return this.oid;
    }

    /**
     * Darf als Selektionskriterium benutzt sein, wenn der Export über JMS durchgeführt ist.
     * <p>
     * Gets the value of the kontonummer property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kontonummer property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKontonummer().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     * @return The value of the kontonummer property.
     */
    public List<String> getKontonummer() {
        if (kontonummer == null) {
            kontonummer = new ArrayList<>();
        }
        return this.kontonummer;
    }

    /**
     * Darf als Selektionskriterium benutzt sein, wenn der Export über Webservice oder JMS durchgeführt ist.
     * <p>
     * Gets the value of the name property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     * @return The value of the name property.
     */
    public List<String> getName() {
        if (name == null) {
            name = new ArrayList<>();
        }
        return this.name;
    }

    /**
     * Sollen Cashflows mit exportiert werden?
     */
    public boolean isMitCashflows() {
        return mitCashflows;
    }

    /**
     * Sets the value of the mitCashflows property.
     */
    public void setMitCashflows(boolean value) {
        this.mitCashflows = value;
    }

    /**
     * Soll der volle Tilgungsplan bis Zinsbindungsende mit exportiert werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMitTilgungsplan() {
        return mitTilgungsplan;
    }

    /**
     * Sets the value of the mitTilgungsplan property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMitTilgungsplan()
     */
    public void setMitTilgungsplan(Boolean value) {
        this.mitTilgungsplan = value;
    }

    /**
     * Soll der volle Tilgungsplan aus Gesamtkosten-Sicht inkl. PAngV-Gebühren mit exportiert werden?
     * Diese Einstellung wirkt nur an der Webservice-Schnittstelle.
     * An der JMS-Schnittstelle wird der Tilgungsplan aus Gesamtkosten-Sicht nie exportiert.
     * Dieser Plan kann nur für Annuitätendarlehen, Tilgungsdarlehen und Endfällige Darlehen angefordert werden.
     * Für alle anderen Produkttypen (einschließlich Universaldarlehen) wird eine entsprechende Anforderung ignoriert.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMitTilgungsplanGesamtkosten() {
        return mitTilgungsplanGesamtkosten;
    }

    /**
     * Sets the value of the mitTilgungsplanGesamtkosten property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMitTilgungsplanGesamtkosten()
     */
    public void setMitTilgungsplanGesamtkosten(Boolean value) {
        this.mitTilgungsplanGesamtkosten = value;
    }

    /**
     * Sollen Abgrenzungspläne mit exportiert werden?
     */
    public boolean isMitAbgrenzungen() {
        return mitAbgrenzungen;
    }

    /**
     * Sets the value of the mitAbgrenzungen property.
     */
    public void setMitAbgrenzungen(boolean value) {
        this.mitAbgrenzungen = value;
    }

}
