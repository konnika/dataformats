
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Liste mit Vorhaltewerten, falls der Vorhaltewert in Abhängigkeit eines Kriteriums (siehe
 * Vorhaltewerttyp) gestaffelt ist
 *
 * <p>Java class for Vorhaltewert complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Vorhaltewert">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="abGrenze" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="wert" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vorhaltewert", propOrder = {

})
public class Vorhaltewert {

    /**
     * Grenze, ab der der Vorhaltewert gilt.
     */
    protected double abGrenze;
    /**
     * Der Wert.
     */
    protected double wert;

    /**
     * Grenze, ab der der Vorhaltewert gilt.
     */
    public double getAbGrenze() {
        return abGrenze;
    }

    /**
     * Sets the value of the abGrenze property.
     */
    public void setAbGrenze(double value) {
        this.abGrenze = value;
    }

    /**
     * Der Wert.
     */
    public double getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     */
    public void setWert(double value) {
        this.wert = value;
    }

}
