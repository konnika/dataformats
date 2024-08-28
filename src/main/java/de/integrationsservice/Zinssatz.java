
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Zinssatz complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Zinssatz">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="zinslaufzeit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="kontostand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinssatz0" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinssatz1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinssatz2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinssatz3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zinssatz4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zinssatz", propOrder = {

})
public class Zinssatz {

    /**
     * Laufzeit für Zinssatz / Zinssätze in der Zinstabelle (zeitabhängig): nach Laufzeit
     */
    protected Double zinslaufzeit;
    /**
     * Datum für Zinssatz / Zinssätze in der Zinstabelle (zeitabhängig): "nach Datum"
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zinsdatum;
    /**
     * Zinssaldo für Zinstabelle (betragsabhängig) nach Zinssaldo' ohne Kombination mit Laufzeit oder
     * Datum
     */
    protected Double kontostand;
    /**
     * Zinssatz für Zins nach Laufzeit, Datum oder Kontostand ohne Kombination
     * bzw. Zinssatz für Kontostand 0 bei Kombination von Zins nach Kontostand mit Laufzeit oder Datum.
     */
    protected Double zinssatz0;
    /**
     * Zinssatz für Zinssaldo ab Betrag 1 bei Kombination von Zins nach Zinssaldo mit Laufzeit oder
     * Datum
     */
    protected Double zinssatz1;
    /**
     * Zinssatz für Zinssaldo ab Betrag 2 bei Kombination von Zins nach Zinssaldo mit Laufzeit oder
     * Datum
     */
    protected Double zinssatz2;
    /**
     * Zinssatz für Zinssaldo ab Betrag 3 bei Kombination von Zins nach Zinssaldo mit Laufzeit oder
     * Datum
     */
    protected Double zinssatz3;
    /**
     * Zinssatz für Zinssaldo ab Betrag 4 bei Kombination von Zins nach Zinssaldo mit Laufzeit oder
     * Datum
     */
    protected Double zinssatz4;

    /**
     * Laufzeit für Zinssatz / Zinssätze in der Zinstabelle (zeitabhängig): nach Laufzeit
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinslaufzeit() {
        return zinslaufzeit;
    }

    /**
     * Sets the value of the zinslaufzeit property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinslaufzeit()
     */
    public void setZinslaufzeit(Double value) {
        this.zinslaufzeit = value;
    }

    /**
     * Datum für Zinssatz / Zinssätze in der Zinstabelle (zeitabhängig): "nach Datum"
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getZinsdatum() {
        return zinsdatum;
    }

    /**
     * Sets the value of the zinsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getZinsdatum()
     */
    public void setZinsdatum(XMLGregorianCalendar value) {
        this.zinsdatum = value;
    }

    /**
     * Zinssaldo für Zinstabelle (betragsabhängig) nach Zinssaldo' ohne Kombination mit Laufzeit oder
     * Datum
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKontostand() {
        return kontostand;
    }

    /**
     * Sets the value of the kontostand property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKontostand()
     */
    public void setKontostand(Double value) {
        this.kontostand = value;
    }

    /**
     * Zinssatz für Zins nach Laufzeit, Datum oder Kontostand ohne Kombination
     * bzw. Zinssatz für Kontostand 0 bei Kombination von Zins nach Kontostand mit Laufzeit oder Datum.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinssatz0() {
        return zinssatz0;
    }

    /**
     * Sets the value of the zinssatz0 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinssatz0()
     */
    public void setZinssatz0(Double value) {
        this.zinssatz0 = value;
    }

    /**
     * Zinssatz für Zinssaldo ab Betrag 1 bei Kombination von Zins nach Zinssaldo mit Laufzeit oder
     * Datum
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinssatz1() {
        return zinssatz1;
    }

    /**
     * Sets the value of the zinssatz1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinssatz1()
     */
    public void setZinssatz1(Double value) {
        this.zinssatz1 = value;
    }

    /**
     * Zinssatz für Zinssaldo ab Betrag 2 bei Kombination von Zins nach Zinssaldo mit Laufzeit oder
     * Datum
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinssatz2() {
        return zinssatz2;
    }

    /**
     * Sets the value of the zinssatz2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinssatz2()
     */
    public void setZinssatz2(Double value) {
        this.zinssatz2 = value;
    }

    /**
     * Zinssatz für Zinssaldo ab Betrag 3 bei Kombination von Zins nach Zinssaldo mit Laufzeit oder
     * Datum
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinssatz3() {
        return zinssatz3;
    }

    /**
     * Sets the value of the zinssatz3 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinssatz3()
     */
    public void setZinssatz3(Double value) {
        this.zinssatz3 = value;
    }

    /**
     * Zinssatz für Zinssaldo ab Betrag 4 bei Kombination von Zins nach Zinssaldo mit Laufzeit oder
     * Datum
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinssatz4() {
        return zinssatz4;
    }

    /**
     * Sets the value of the zinssatz4 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinssatz4()
     */
    public void setZinssatz4(Double value) {
        this.zinssatz4 = value;
    }

}
