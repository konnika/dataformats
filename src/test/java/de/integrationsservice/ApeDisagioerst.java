
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Falls beim ausserplanmäßigen Ereignis die Disagioerstattung beruecksichtigt werden soll,
 * werden zusaetzliche Eingaben gebraucht.
 *
 * <p>Java class for ApeDisagioerst complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ApeDisagioerst">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="apeEffektivzins" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="disErstMethode" type="{http://www.gillardon.de/marzipan/integrationsservice}DisErstMethode" minOccurs="0"/>
 *         <element name="disErstZukSotiAbzi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="disErstZukSoti" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="disagioGezahlt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="disagioerstattung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="verrechneteDisErst" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="disagioUnverbrRO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="reineDisErst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="zinssummeGesamt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApeDisagioerst", propOrder = {

})
public class ApeDisagioerst {

    /**
     * Effektivzins des gesamten Darlehens ohne Leistungsstörung
     */
    protected Double apeEffektivzins;
    /**
     * Die Disagioerstattung für das außerplanmäßige Ereignis kann nominalzinsproportional oder
     * effektivzinskonstant berechnet werden. Das -nicht verbrauchte Disagio- kann über Eingabe auch
     * direkt eingegeben werden.
     */
    @XmlSchemaType(name = "string")
    protected DisErstMethode disErstMethode;
    /**
     * Sollen die Disagioerstattungen der zukünftigen Sondertilgungsrechte strukturkongruent abgezinst
     * werden?
     */
    protected Boolean disErstZukSotiAbzi;
    /**
     * Disagioerstattungen der zukünftigen Sondertilgungsrechte
     */
    protected Double disErstZukSoti;
    /**
     * vom Kunden gezahltes Disagio
     */
    protected Double disagioGezahlt;
    /**
     * Höhe der Disagioerstattung für das außerplanmäßige Ereignis, die dem Kunden zurückerstattet wird
     */
    protected Double disagioerstattung;
    /**
     * Verrechnete Disagioerstattung
     */
    protected Double verrechneteDisErst;
    /**
     * Unverbrauchtes Disagio am nächsten Fixing-Termin von Roll-Over-Darlehen
     */
    protected Double disagioUnverbrRO;
    /**
     * Soll lediglich eine Disagioerstattung berechnet werden, da es sich bei der Geschäftsänderung um
     * ein nicht VFE-pflichtiges optionales Sondertilgungsrecht handelt, welches ausgeübt wird, so kann
     * dies über die Option -Reine Disagioerstattung- erreicht werden.
     * In diesem Fall wird nur der Disagioerstattungsbetrag berechnet und nachgewiesen.
     */
    protected Boolean reineDisErst;
    /**
     * Zinssumme des gesamten Darlehens ohne Leistungsstörung
     */
    protected Double zinssummeGesamt;

    /**
     * Effektivzins des gesamten Darlehens ohne Leistungsstörung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getApeEffektivzins() {
        return apeEffektivzins;
    }

    /**
     * Sets the value of the apeEffektivzins property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getApeEffektivzins()
     */
    public void setApeEffektivzins(Double value) {
        this.apeEffektivzins = value;
    }

    /**
     * Die Disagioerstattung für das außerplanmäßige Ereignis kann nominalzinsproportional oder
     * effektivzinskonstant berechnet werden. Das -nicht verbrauchte Disagio- kann über Eingabe auch
     * direkt eingegeben werden.
     *
     * @return possible object is
     * {@link DisErstMethode }
     */
    public DisErstMethode getDisErstMethode() {
        return disErstMethode;
    }

    /**
     * Sets the value of the disErstMethode property.
     *
     * @param value allowed object is
     *              {@link DisErstMethode }
     * @see #getDisErstMethode()
     */
    public void setDisErstMethode(DisErstMethode value) {
        this.disErstMethode = value;
    }

    /**
     * Sollen die Disagioerstattungen der zukünftigen Sondertilgungsrechte strukturkongruent abgezinst
     * werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDisErstZukSotiAbzi() {
        return disErstZukSotiAbzi;
    }

    /**
     * Sets the value of the disErstZukSotiAbzi property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isDisErstZukSotiAbzi()
     */
    public void setDisErstZukSotiAbzi(Boolean value) {
        this.disErstZukSotiAbzi = value;
    }

    /**
     * Disagioerstattungen der zukünftigen Sondertilgungsrechte
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDisErstZukSoti() {
        return disErstZukSoti;
    }

    /**
     * Sets the value of the disErstZukSoti property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDisErstZukSoti()
     */
    public void setDisErstZukSoti(Double value) {
        this.disErstZukSoti = value;
    }

    /**
     * vom Kunden gezahltes Disagio
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDisagioGezahlt() {
        return disagioGezahlt;
    }

    /**
     * Sets the value of the disagioGezahlt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDisagioGezahlt()
     */
    public void setDisagioGezahlt(Double value) {
        this.disagioGezahlt = value;
    }

    /**
     * Höhe der Disagioerstattung für das außerplanmäßige Ereignis, die dem Kunden zurückerstattet wird
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDisagioerstattung() {
        return disagioerstattung;
    }

    /**
     * Sets the value of the disagioerstattung property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDisagioerstattung()
     */
    public void setDisagioerstattung(Double value) {
        this.disagioerstattung = value;
    }

    /**
     * Verrechnete Disagioerstattung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVerrechneteDisErst() {
        return verrechneteDisErst;
    }

    /**
     * Sets the value of the verrechneteDisErst property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVerrechneteDisErst()
     */
    public void setVerrechneteDisErst(Double value) {
        this.verrechneteDisErst = value;
    }

    /**
     * Unverbrauchtes Disagio am nächsten Fixing-Termin von Roll-Over-Darlehen
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDisagioUnverbrRO() {
        return disagioUnverbrRO;
    }

    /**
     * Sets the value of the disagioUnverbrRO property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDisagioUnverbrRO()
     */
    public void setDisagioUnverbrRO(Double value) {
        this.disagioUnverbrRO = value;
    }

    /**
     * Soll lediglich eine Disagioerstattung berechnet werden, da es sich bei der Geschäftsänderung um
     * ein nicht VFE-pflichtiges optionales Sondertilgungsrecht handelt, welches ausgeübt wird, so kann
     * dies über die Option -Reine Disagioerstattung- erreicht werden.
     * In diesem Fall wird nur der Disagioerstattungsbetrag berechnet und nachgewiesen.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReineDisErst() {
        return reineDisErst;
    }

    /**
     * Sets the value of the reineDisErst property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isReineDisErst()
     */
    public void setReineDisErst(Boolean value) {
        this.reineDisErst = value;
    }

    /**
     * Zinssumme des gesamten Darlehens ohne Leistungsstörung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinssummeGesamt() {
        return zinssummeGesamt;
    }

    /**
     * Sets the value of the zinssummeGesamt property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinssummeGesamt()
     */
    public void setZinssummeGesamt(Double value) {
        this.zinssummeGesamt = value;
    }

}
