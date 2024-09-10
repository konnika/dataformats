
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enthält Anforderungsflags für verschiedene gewünschte zusätzliche Ergebnisse wie Cashflows, Tilgungsplan oder Abgrenzungspläne.
 *
 * <p>Java class for ZusaetzlicheErgebnisse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ZusaetzlicheErgebnisse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="mitCashflows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="mitTilgungsplan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="mitAbgrenzungen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZusaetzlicheErgebnisse", propOrder = {

})
public class ZusaetzlicheErgebnisse {

    /**
     * Sollen Cashflows mit exportiert werden?
     */
    protected Boolean mitCashflows;
    /**
     * Soll der volle Tilgungsplan bis Zinsbindungsende mit exportiert werden?
     */
    protected Boolean mitTilgungsplan;
    /**
     * Sollen Abgrenzungspläne mit exportiert werden?
     */
    protected Boolean mitAbgrenzungen;

    /**
     * Sollen Cashflows mit exportiert werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMitCashflows() {
        return mitCashflows;
    }

    /**
     * Sets the value of the mitCashflows property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMitCashflows()
     */
    public void setMitCashflows(Boolean value) {
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
     * Sollen Abgrenzungspläne mit exportiert werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMitAbgrenzungen() {
        return mitAbgrenzungen;
    }

    /**
     * Sets the value of the mitAbgrenzungen property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isMitAbgrenzungen()
     */
    public void setMitAbgrenzungen(Boolean value) {
        this.mitAbgrenzungen = value;
    }

}
