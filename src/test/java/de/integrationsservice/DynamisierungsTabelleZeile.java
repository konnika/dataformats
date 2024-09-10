
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Eine Zeile der Dynamisierungstabelle.
 *
 * <p>Java class for DynamisierungsTabelleZeile complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="DynamisierungsTabelleZeile">
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
 *         <element name="uevza_haftendes_ek" type="{http://www.gillardon.de/marzipan/integrationsservice}DoubleFrom100NegativTo100Positiv"/>
 *         <element name="uevza_verzins_komp" type="{http://www.gillardon.de/marzipan/integrationsservice}DoubleFrom100NegativTo100Positiv"/>
 *         <element name="koeffizient" type="{http://www.gillardon.de/marzipan/integrationsservice}DoubleFrom100NegativTo100Positiv"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamisierungsTabelleZeile", propOrder = {

})
public class DynamisierungsTabelleZeile {

    /**
     * Jahr der Überverzinsungsansprüche und des Solvabilitätskoeffizient
     */
    protected int jahr;
    /**
     * Überverzinsungsanspruch haftendes Eigenkapital
     * 0 100
     */
    @XmlElement(name = "uevza_haftendes_ek")
    protected double uevzaHaftendesEk;
    /**
     * Überverzinsungsanspruch verzinsliche Komponente
     * 0 100
     */
    @XmlElement(name = "uevza_verzins_komp")
    protected double uevzaVerzinsKomp;
    /**
     * Solvabilitätskoeffizient (ca. 8-13 %)
     * 0 100
     */
    protected double koeffizient;

    /**
     * Jahr der Überverzinsungsansprüche und des Solvabilitätskoeffizient
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
     * Überverzinsungsanspruch haftendes Eigenkapital
     * 0 100
     */
    public double getUevzaHaftendesEk() {
        return uevzaHaftendesEk;
    }

    /**
     * Sets the value of the uevzaHaftendesEk property.
     */
    public void setUevzaHaftendesEk(double value) {
        this.uevzaHaftendesEk = value;
    }

    /**
     * Überverzinsungsanspruch verzinsliche Komponente
     * 0 100
     */
    public double getUevzaVerzinsKomp() {
        return uevzaVerzinsKomp;
    }

    /**
     * Sets the value of the uevzaVerzinsKomp property.
     */
    public void setUevzaVerzinsKomp(double value) {
        this.uevzaVerzinsKomp = value;
    }

    /**
     * Solvabilitätskoeffizient (ca. 8-13 %)
     * 0 100
     */
    public double getKoeffizient() {
        return koeffizient;
    }

    /**
     * Sets the value of the koeffizient property.
     */
    public void setKoeffizient(double value) {
        this.koeffizient = value;
    }

}
