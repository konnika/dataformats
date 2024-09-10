
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Neuernominalzins complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Neuernominalzins">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="datum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="kontostand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zins1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zins2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zins3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zins4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="zins5" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Neuernominalzins", propOrder = {

})
public class Neuernominalzins {

    /**
     * Datum, ab dem der Zinssatz gilt
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    /**
     * Kontostand, bis zu dem der Zinssatz gilt
     */
    protected Double kontostand;
    /**
     * Angabe des neuen Zinssatzes in Prozent für den Kontostand (kleiner als) Kontostandgrenze 1
     */
    protected Double zins1;
    /**
     * Angabe des neuen Zinssatzes in Prozent für den Kontostandgrenze 1 (kleiner als oder egal mit)
     * Kontostand (kleiner als) Kontostandgrenze 2
     */
    protected Double zins2;
    /**
     * Angabe des neuen Zinssatzes in Prozent für den Kontostandgrenze 2 Kontostand (kleiner als)
     * Kontostandgrenze 3
     */
    protected Double zins3;
    /**
     * Angabe des neuen Zinssatzes in Prozent für den Kontostandgrenze 3 (kleiner als oder egal mit)
     * Kontostand (kleiner als) Kontostandgrenze 4
     */
    protected Double zins4;
    /**
     * Angabe des neuen Zinssatzes in Prozent für den Kontostand (egal oder größer als)
     * Kontostandgrenze 4
     */
    protected Double zins5;

    /**
     * Datum, ab dem der Zinssatz gilt
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getDatum()
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Kontostand, bis zu dem der Zinssatz gilt
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
     * Angabe des neuen Zinssatzes in Prozent für den Kontostand (kleiner als) Kontostandgrenze 1
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZins1() {
        return zins1;
    }

    /**
     * Sets the value of the zins1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZins1()
     */
    public void setZins1(Double value) {
        this.zins1 = value;
    }

    /**
     * Angabe des neuen Zinssatzes in Prozent für den Kontostandgrenze 1 (kleiner als oder egal mit)
     * Kontostand (kleiner als) Kontostandgrenze 2
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZins2() {
        return zins2;
    }

    /**
     * Sets the value of the zins2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZins2()
     */
    public void setZins2(Double value) {
        this.zins2 = value;
    }

    /**
     * Angabe des neuen Zinssatzes in Prozent für den Kontostandgrenze 2 Kontostand (kleiner als)
     * Kontostandgrenze 3
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZins3() {
        return zins3;
    }

    /**
     * Sets the value of the zins3 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZins3()
     */
    public void setZins3(Double value) {
        this.zins3 = value;
    }

    /**
     * Angabe des neuen Zinssatzes in Prozent für den Kontostandgrenze 3 (kleiner als oder egal mit)
     * Kontostand (kleiner als) Kontostandgrenze 4
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZins4() {
        return zins4;
    }

    /**
     * Sets the value of the zins4 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZins4()
     */
    public void setZins4(Double value) {
        this.zins4 = value;
    }

    /**
     * Angabe des neuen Zinssatzes in Prozent für den Kontostand (egal oder größer als)
     * Kontostandgrenze 4
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZins5() {
        return zins5;
    }

    /**
     * Sets the value of the zins5 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZins5()
     */
    public void setZins5(Double value) {
        this.zins5 = value;
    }

}
