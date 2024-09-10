
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enthält Informationen zu einem Jahr.
 *
 * <p>Java class for GezeichnetesKapital complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="GezeichnetesKapital">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="jahr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <pattern value="[1-9]{1}[0-9]{3}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="anteilGezKapital" type="{http://www.gillardon.de/marzipan/integrationsservice}DoubleFrom1000NegativTo1000Positiv"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GezeichnetesKapital", propOrder = {

})
public class GezeichnetesKapital {

    /**
     * vierstellige Jahreszahl
     */
    protected int jahr;
    /**
     * abhängig vom Jahr hat der Anteil eine gewisse Höhe
     */
    protected double anteilGezKapital;

    /**
     * vierstellige Jahreszahl
     */
    public int getJahr() {
        return jahr;
    }

    /**
     * Sets the value of the jahr property.
     */
    public void setJahr(int value) {
        this.jahr = value;
    }

    /**
     * abhängig vom Jahr hat der Anteil eine gewisse Höhe
     */
    public double getAnteilGezKapital() {
        return anteilGezKapital;
    }

    /**
     * Sets the value of the anteilGezKapital property.
     */
    public void setAnteilGezKapital(double value) {
        this.anteilGezKapital = value;
    }

}
