
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Liste mit Ausfallwahrscheinlichkeiten der Ratingklassen in Prozent je Laufzeit.
 *
 * <p>Java class for Ausfallwahrscheinlichkeit complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Ausfallwahrscheinlichkeit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="wkt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="laufzeit" type="{http://www.gillardon.de/marzipan/integrationsservice}AusfallwahrscheinlichkeitLaufzeit"/>
 *         <element name="bonitaet" type="{http://www.gillardon.de/marzipan/integrationsservice}Bonitaet"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ausfallwahrscheinlichkeit", propOrder = {

})
public class Ausfallwahrscheinlichkeit {

    /**
     * Die Höhe der kumulierten Ausfallwahrscheinlichkeit in der Liste mit Ausfallwahrscheinlichkeiten
     * der Ratingklassen in Prozent je Laufzeit.
     */
    protected double wkt;
    /**
     * Die Laufzeit als Text
     */
    @XmlElement(required = true)
    protected AusfallwahrscheinlichkeitLaufzeit laufzeit;
    @XmlElement(required = true)
    protected Bonitaet bonitaet;

    /**
     * Die Höhe der kumulierten Ausfallwahrscheinlichkeit in der Liste mit Ausfallwahrscheinlichkeiten
     * der Ratingklassen in Prozent je Laufzeit.
     */
    public double getWkt() {
        return wkt;
    }

    /**
     * Sets the value of the wkt property.
     */
    public void setWkt(double value) {
        this.wkt = value;
    }

    /**
     * Die Laufzeit als Text
     *
     * @return possible object is
     * {@link AusfallwahrscheinlichkeitLaufzeit }
     */
    public AusfallwahrscheinlichkeitLaufzeit getLaufzeit() {
        return laufzeit;
    }

    /**
     * Sets the value of the laufzeit property.
     *
     * @param value allowed object is
     *              {@link AusfallwahrscheinlichkeitLaufzeit }
     * @see #getLaufzeit()
     */
    public void setLaufzeit(AusfallwahrscheinlichkeitLaufzeit value) {
        this.laufzeit = value;
    }

    /**
     * Gets the value of the bonitaet property.
     *
     * @return possible object is
     * {@link Bonitaet }
     */
    public Bonitaet getBonitaet() {
        return bonitaet;
    }

    /**
     * Sets the value of the bonitaet property.
     *
     * @param value allowed object is
     *              {@link Bonitaet }
     */
    public void setBonitaet(Bonitaet value) {
        this.bonitaet = value;
    }

}
