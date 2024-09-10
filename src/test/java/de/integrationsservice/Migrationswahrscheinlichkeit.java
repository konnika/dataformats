
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enthält Informationen zu einer Migrationswahrscheinlichkeit.
 *
 * <p>Java class for Migrationswahrscheinlichkeit complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Migrationswahrscheinlichkeit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="wkt">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="vonBonitaet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nachBonitaet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Migrationswahrscheinlichkeit", propOrder = {

})
public class Migrationswahrscheinlichkeit {

    /**
     * Die Höhe der Migrationswahrscheinlichkeit.
     */
    protected double wkt;
    /**
     * Name der Bonität/Ratingklasse (Bonitaet::bnote) aus der migriert wird.
     */
    @XmlElement(required = true)
    protected String vonBonitaet;
    /**
     * Name der Bonität/Ratingklasse (Bonitaet::bnote) in die migriert wird.
     */
    @XmlElement(required = true)
    protected String nachBonitaet;

    /**
     * Die Höhe der Migrationswahrscheinlichkeit.
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
     * Name der Bonität/Ratingklasse (Bonitaet::bnote) aus der migriert wird.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVonBonitaet() {
        return vonBonitaet;
    }

    /**
     * Sets the value of the vonBonitaet property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getVonBonitaet()
     */
    public void setVonBonitaet(String value) {
        this.vonBonitaet = value;
    }

    /**
     * Name der Bonität/Ratingklasse (Bonitaet::bnote) in die migriert wird.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNachBonitaet() {
        return nachBonitaet;
    }

    /**
     * Sets the value of the nachBonitaet property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getNachBonitaet()
     */
    public void setNachBonitaet(String value) {
        this.nachBonitaet = value;
    }

}
