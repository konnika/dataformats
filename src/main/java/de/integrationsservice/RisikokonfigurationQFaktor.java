
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * q-Faktor Tabelle
 *
 * <p>Java class for RisikokonfigurationQFaktor complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RisikokonfigurationQFaktor">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="nominalbetragBis" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="qFAKTOR" type="{http://www.gillardon.de/marzipan/integrationsservice}DoubleFrom100NegativTo100Positiv"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisikokonfigurationQFaktor", propOrder = {

})
public class RisikokonfigurationQFaktor {

    /**
     * bis zu welchem Nominalbetrag der q-Faktor einen gewissen Wert annimmt
     */
    protected double nominalbetragBis;
    /**
     * bis zu welcher Währung der q-Faktor einen gewissen Wert annimmt
     */
    protected String waehrung;
    /**
     * q-Faktor in Abhängigkeit
     */
    @XmlElement(name = "qFAKTOR")
    protected double qfaktor;

    /**
     * bis zu welchem Nominalbetrag der q-Faktor einen gewissen Wert annimmt
     */
    public double getNominalbetragBis() {
        return nominalbetragBis;
    }

    /**
     * Sets the value of the nominalbetragBis property.
     */
    public void setNominalbetragBis(double value) {
        this.nominalbetragBis = value;
    }

    /**
     * bis zu welcher Währung der q-Faktor einen gewissen Wert annimmt
     *
     * @return possible object is
     * {@link String }
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the value of the waehrung property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getWaehrung()
     */
    public void setWaehrung(String value) {
        this.waehrung = value;
    }

    /**
     * q-Faktor in Abhängigkeit
     */
    public double getQFAKTOR() {
        return qfaktor;
    }

    /**
     * Sets the value of the qfaktor property.
     */
    public void setQFAKTOR(double value) {
        this.qfaktor = value;
    }

}
