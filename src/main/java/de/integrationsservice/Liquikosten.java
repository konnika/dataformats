
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der komplexe globale Typ Liquikosten enthält zusätzliche Daten zur Berechnung von Liquiditätskosten.
 *
 * <p>Java class for Liquikosten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Liquikosten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="einstandRefiNominal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="basisswapeffekt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="einstandSwapNominal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="einstandSwapEffektiv" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="einstandSwapMitDisagio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquiProzentEffZinsbindung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquiProzentEffLiquibindung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquiProzentNomZinsbindung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquiProzentNomLiquibindung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquiBarwertZinsbindung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquiBarwertLiquibindung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquikostenbasis" type="{http://www.gillardon.de/marzipan/integrationsservice}Liquikostenbasis" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Liquikosten", propOrder = {

})
public class Liquikosten {

    /**
     * Einstand Refi nominal
     */
    protected Double einstandRefiNominal;
    /**
     * Bei Terminzinskurvenverfahren: Basisswapeffekt in %
     */
    protected Double basisswapeffekt;
    /**
     * Einstand Swap nominal
     */
    protected Double einstandSwapNominal;
    /**
     * Einstand Swap effektiv
     */
    protected Double einstandSwapEffektiv;
    /**
     * Einstand Swap mit Disagio
     */
    protected Double einstandSwapMitDisagio;
    /**
     * Effektive Liquiditätskosten in Prozent bis Zinsbindungsende
     */
    protected Double liquiProzentEffZinsbindung;
    /**
     * Effektive Liquiditätskosten in Prozent bis Liquiditätsbindungsende
     */
    protected Double liquiProzentEffLiquibindung;
    /**
     * Nominale Liquiditätskosten in Prozent bis Zinsbindungsende.
     */
    protected Double liquiProzentNomZinsbindung;
    /**
     * Nominale Liquiditätskosten in Prozent bis Liquiditätsbindungsende
     */
    protected Double liquiProzentNomLiquibindung;
    /**
     * Liquiditätskostenbarwert aus Zinsänderungssicht
     */
    protected Double liquiBarwertZinsbindung;
    /**
     * Liquiditätskostenbarwert aus Liquiditätssicht
     */
    protected Double liquiBarwertLiquibindung;
    /**
     * Basis der Liquikostenberechnung.
     * Bei CASH-FLOW wird nur ZWEI_KURVEN_VERGLEICH unterstützt.
     */
    @XmlSchemaType(name = "string")
    protected Liquikostenbasis liquikostenbasis;

    /**
     * Einstand Refi nominal
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEinstandRefiNominal() {
        return einstandRefiNominal;
    }

    /**
     * Sets the value of the einstandRefiNominal property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEinstandRefiNominal()
     */
    public void setEinstandRefiNominal(Double value) {
        this.einstandRefiNominal = value;
    }

    /**
     * Bei Terminzinskurvenverfahren: Basisswapeffekt in %
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBasisswapeffekt() {
        return basisswapeffekt;
    }

    /**
     * Sets the value of the basisswapeffekt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBasisswapeffekt()
     */
    public void setBasisswapeffekt(Double value) {
        this.basisswapeffekt = value;
    }

    /**
     * Einstand Swap nominal
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEinstandSwapNominal() {
        return einstandSwapNominal;
    }

    /**
     * Sets the value of the einstandSwapNominal property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEinstandSwapNominal()
     */
    public void setEinstandSwapNominal(Double value) {
        this.einstandSwapNominal = value;
    }

    /**
     * Einstand Swap effektiv
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEinstandSwapEffektiv() {
        return einstandSwapEffektiv;
    }

    /**
     * Sets the value of the einstandSwapEffektiv property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEinstandSwapEffektiv()
     */
    public void setEinstandSwapEffektiv(Double value) {
        this.einstandSwapEffektiv = value;
    }

    /**
     * Einstand Swap mit Disagio
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getEinstandSwapMitDisagio() {
        return einstandSwapMitDisagio;
    }

    /**
     * Sets the value of the einstandSwapMitDisagio property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getEinstandSwapMitDisagio()
     */
    public void setEinstandSwapMitDisagio(Double value) {
        this.einstandSwapMitDisagio = value;
    }

    /**
     * Effektive Liquiditätskosten in Prozent bis Zinsbindungsende
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLiquiProzentEffZinsbindung() {
        return liquiProzentEffZinsbindung;
    }

    /**
     * Sets the value of the liquiProzentEffZinsbindung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLiquiProzentEffZinsbindung()
     */
    public void setLiquiProzentEffZinsbindung(Double value) {
        this.liquiProzentEffZinsbindung = value;
    }

    /**
     * Effektive Liquiditätskosten in Prozent bis Liquiditätsbindungsende
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLiquiProzentEffLiquibindung() {
        return liquiProzentEffLiquibindung;
    }

    /**
     * Sets the value of the liquiProzentEffLiquibindung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLiquiProzentEffLiquibindung()
     */
    public void setLiquiProzentEffLiquibindung(Double value) {
        this.liquiProzentEffLiquibindung = value;
    }

    /**
     * Nominale Liquiditätskosten in Prozent bis Zinsbindungsende.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLiquiProzentNomZinsbindung() {
        return liquiProzentNomZinsbindung;
    }

    /**
     * Sets the value of the liquiProzentNomZinsbindung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLiquiProzentNomZinsbindung()
     */
    public void setLiquiProzentNomZinsbindung(Double value) {
        this.liquiProzentNomZinsbindung = value;
    }

    /**
     * Nominale Liquiditätskosten in Prozent bis Liquiditätsbindungsende
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLiquiProzentNomLiquibindung() {
        return liquiProzentNomLiquibindung;
    }

    /**
     * Sets the value of the liquiProzentNomLiquibindung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLiquiProzentNomLiquibindung()
     */
    public void setLiquiProzentNomLiquibindung(Double value) {
        this.liquiProzentNomLiquibindung = value;
    }

    /**
     * Liquiditätskostenbarwert aus Zinsänderungssicht
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLiquiBarwertZinsbindung() {
        return liquiBarwertZinsbindung;
    }

    /**
     * Sets the value of the liquiBarwertZinsbindung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLiquiBarwertZinsbindung()
     */
    public void setLiquiBarwertZinsbindung(Double value) {
        this.liquiBarwertZinsbindung = value;
    }

    /**
     * Liquiditätskostenbarwert aus Liquiditätssicht
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLiquiBarwertLiquibindung() {
        return liquiBarwertLiquibindung;
    }

    /**
     * Sets the value of the liquiBarwertLiquibindung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLiquiBarwertLiquibindung()
     */
    public void setLiquiBarwertLiquibindung(Double value) {
        this.liquiBarwertLiquibindung = value;
    }

    /**
     * Basis der Liquikostenberechnung.
     * Bei CASH-FLOW wird nur ZWEI_KURVEN_VERGLEICH unterstützt.
     *
     * @return possible object is
     * {@link Liquikostenbasis }
     */
    public Liquikostenbasis getLiquikostenbasis() {
        return liquikostenbasis;
    }

    /**
     * Sets the value of the liquikostenbasis property.
     *
     * @param value allowed object is
     *              {@link Liquikostenbasis }
     * @see #getLiquikostenbasis()
     */
    public void setLiquikostenbasis(Liquikostenbasis value) {
        this.liquikostenbasis = value;
    }

}
