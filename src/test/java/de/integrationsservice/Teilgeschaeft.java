
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Teilgeschaeft complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Teilgeschaeft">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="anteil" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="kontonummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Teilgeschaeft", propOrder = {

})
public class Teilgeschaeft {

    /**
     * Anteil eines neu erzeugten Geschäfts in %. Die Summe aller Anteile muss 100 ergeben.
     */
    protected double anteil;
    /**
     * Kontonummer eines neu erzeugten Geschäfts.
     */
    @XmlElement(required = true)
    protected String kontonummer;

    /**
     * Anteil eines neu erzeugten Geschäfts in %. Die Summe aller Anteile muss 100 ergeben.
     */
    public double getAnteil() {
        return anteil;
    }

    /**
     * Sets the value of the anteil property.
     */
    public void setAnteil(double value) {
        this.anteil = value;
    }

    /**
     * Kontonummer eines neu erzeugten Geschäfts.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKontonummer() {
        return kontonummer;
    }

    /**
     * Sets the value of the kontonummer property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKontonummer()
     */
    public void setKontonummer(String value) {
        this.kontonummer = value;
    }

}
