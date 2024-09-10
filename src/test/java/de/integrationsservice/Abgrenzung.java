
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Abgrenzung complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Abgrenzung">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="monat" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *         <element name="zins" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="disagio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="gebuehr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="restschuld" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="mittlereRestschuld" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Abgrenzung", propOrder = {

})
public class Abgrenzung {

    /**
     * Monat für den die Abgrenzung gilt (bei monatlichem Abgrenzungsintervall)
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar monat;
    /**
     * Abgegrenzter Zins für den Monat
     */
    protected double zins;
    /**
     * Abgerenztes Disagio bei Disagioabgrenzung auf dem Abgrenzungsplan
     */
    protected Double disagio;
    /**
     * Abgegrenzte Gebühr
     */
    protected Double gebuehr;
    /**
     * Restschuld am Ende des
     * Abgrenzungsmonats
     */
    protected double restschuld;
    /**
     * Durchschnittliche Restschuld
     */
    protected Double mittlereRestschuld;

    /**
     * Monat für den die Abgrenzung gilt (bei monatlichem Abgrenzungsintervall)
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getMonat() {
        return monat;
    }

    /**
     * Sets the value of the monat property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getMonat()
     */
    public void setMonat(XMLGregorianCalendar value) {
        this.monat = value;
    }

    /**
     * Abgegrenzter Zins für den Monat
     */
    public double getZins() {
        return zins;
    }

    /**
     * Sets the value of the zins property.
     */
    public void setZins(double value) {
        this.zins = value;
    }

    /**
     * Abgerenztes Disagio bei Disagioabgrenzung auf dem Abgrenzungsplan
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDisagio() {
        return disagio;
    }

    /**
     * Sets the value of the disagio property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDisagio()
     */
    public void setDisagio(Double value) {
        this.disagio = value;
    }

    /**
     * Abgegrenzte Gebühr
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getGebuehr() {
        return gebuehr;
    }

    /**
     * Sets the value of the gebuehr property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getGebuehr()
     */
    public void setGebuehr(Double value) {
        this.gebuehr = value;
    }

    /**
     * Restschuld am Ende des
     * Abgrenzungsmonats
     */
    public double getRestschuld() {
        return restschuld;
    }

    /**
     * Sets the value of the restschuld property.
     */
    public void setRestschuld(double value) {
        this.restschuld = value;
    }

    /**
     * Durchschnittliche Restschuld
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMittlereRestschuld() {
        return mittlereRestschuld;
    }

    /**
     * Sets the value of the mittlereRestschuld property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getMittlereRestschuld()
     */
    public void setMittlereRestschuld(Double value) {
        this.mittlereRestschuld = value;
    }

}
