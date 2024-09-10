
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der Ansatz der Parameter der Risikokonfiguration
 *
 * <p>Java class for RisikokonfigurationParameter complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RisikokonfigurationParameter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="ueVerzinsAnspruch" type="{http://www.gillardon.de/marzipan/integrationsservice}DoubleFrom100NegativTo100Positiv"/>
 *         <element name="defaultFaktor" type="{http://www.gillardon.de/marzipan/integrationsservice}DoubleFrom100NegativTo100Positiv"/>
 *         <element name="limitPuffer">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               <minExclusive value="-10"/>
 *               <maxExclusive value="10"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="risikokonfigurationQFaktoren" type="{http://www.gillardon.de/marzipan/integrationsservice}RisikokonfigurationQFaktoren" minOccurs="0"/>
 *         <element name="dynamisierungstabelle" type="{http://www.gillardon.de/marzipan/integrationsservice}RisikokonfigurationParameterDynamisierungstabelle"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisikokonfigurationParameter", propOrder = {

})
public class RisikokonfigurationParameter {

    /**
     * Überverzinsungsanspruch der Eigenkapitalgeber
     */
    protected double ueVerzinsAnspruch;
    /**
     * Default-q-Faktor der Risikokonfiguration. Bei der Berechnung muss der q-Faktor in diesem Feld
     * geliefert werden.
     */
    protected double defaultFaktor;
    /**
     * Berücksichtigung der ökonomischen EK-Kosten für ein zusätzliches Limit zur Absicherung gegen
     * kurzfristige Risikoerhöhungen
     */
    protected double limitPuffer;
    /**
     * Die q-Faktor Tabelle.
     */
    protected RisikokonfigurationQFaktoren risikokonfigurationQFaktoren;
    /**
     * Die Tabelle für die Dynamisierung der Parameter für das gezeichnete Kapital.
     */
    @XmlElement(required = true)
    protected RisikokonfigurationParameterDynamisierungstabelle dynamisierungstabelle;

    /**
     * Überverzinsungsanspruch der Eigenkapitalgeber
     */
    public double getUeVerzinsAnspruch() {
        return ueVerzinsAnspruch;
    }

    /**
     * Sets the value of the ueVerzinsAnspruch property.
     */
    public void setUeVerzinsAnspruch(double value) {
        this.ueVerzinsAnspruch = value;
    }

    /**
     * Default-q-Faktor der Risikokonfiguration. Bei der Berechnung muss der q-Faktor in diesem Feld
     * geliefert werden.
     */
    public double getDefaultFaktor() {
        return defaultFaktor;
    }

    /**
     * Sets the value of the defaultFaktor property.
     */
    public void setDefaultFaktor(double value) {
        this.defaultFaktor = value;
    }

    /**
     * Berücksichtigung der ökonomischen EK-Kosten für ein zusätzliches Limit zur Absicherung gegen
     * kurzfristige Risikoerhöhungen
     */
    public double getLimitPuffer() {
        return limitPuffer;
    }

    /**
     * Sets the value of the limitPuffer property.
     */
    public void setLimitPuffer(double value) {
        this.limitPuffer = value;
    }

    /**
     * Die q-Faktor Tabelle.
     *
     * @return possible object is
     * {@link RisikokonfigurationQFaktoren }
     */
    public RisikokonfigurationQFaktoren getRisikokonfigurationQFaktoren() {
        return risikokonfigurationQFaktoren;
    }

    /**
     * Sets the value of the risikokonfigurationQFaktoren property.
     *
     * @param value allowed object is
     *              {@link RisikokonfigurationQFaktoren }
     * @see #getRisikokonfigurationQFaktoren()
     */
    public void setRisikokonfigurationQFaktoren(RisikokonfigurationQFaktoren value) {
        this.risikokonfigurationQFaktoren = value;
    }

    /**
     * Die Tabelle für die Dynamisierung der Parameter für das gezeichnete Kapital.
     *
     * @return possible object is
     * {@link RisikokonfigurationParameterDynamisierungstabelle }
     */
    public RisikokonfigurationParameterDynamisierungstabelle getDynamisierungstabelle() {
        return dynamisierungstabelle;
    }

    /**
     * Sets the value of the dynamisierungstabelle property.
     *
     * @param value allowed object is
     *              {@link RisikokonfigurationParameterDynamisierungstabelle }
     * @see #getDynamisierungstabelle()
     */
    public void setDynamisierungstabelle(RisikokonfigurationParameterDynamisierungstabelle value) {
        this.dynamisierungstabelle = value;
    }

}
