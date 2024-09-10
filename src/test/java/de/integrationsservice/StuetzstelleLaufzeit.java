
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Laufzeit der Stützstelle (aus der Laufzeit wird für ein konkretes Kalkulationsdatum der
 * Zinsstruktur
 * und dem Feiertagskalender, der sich aus dem Finanzplatz ergibt, die Fälligkeit der Stützstelle
 * berechnet).
 * Alternativ kann die Fälligkeit direkt definiert werden.
 *
 * <p>Java class for StuetzstelleLaufzeit complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="StuetzstelleLaufzeit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="anzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="laufzeittyp" type="{http://www.gillardon.de/marzipan/integrationsservice}Laufzeittyp"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StuetzstelleLaufzeit", propOrder = {

})
public class StuetzstelleLaufzeit {

    @XmlElement(required = true)
    protected String name;
    protected int anzahl;
    /**
     * Laufzeittyp (Tagesgeld, TOM/NEXT, Tage, Monate, Jahre)
     * TAGESGELD TOM/NEXT TAGE MONATE JAHRE
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Laufzeittyp laufzeittyp;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the anzahl property.
     */
    public int getAnzahl() {
        return anzahl;
    }

    /**
     * Sets the value of the anzahl property.
     */
    public void setAnzahl(int value) {
        this.anzahl = value;
    }

    /**
     * Laufzeittyp (Tagesgeld, TOM/NEXT, Tage, Monate, Jahre)
     * TAGESGELD TOM/NEXT TAGE MONATE JAHRE
     *
     * @return possible object is
     * {@link Laufzeittyp }
     */
    public Laufzeittyp getLaufzeittyp() {
        return laufzeittyp;
    }

    /**
     * Sets the value of the laufzeittyp property.
     *
     * @param value allowed object is
     *              {@link Laufzeittyp }
     * @see #getLaufzeittyp()
     */
    public void setLaufzeittyp(Laufzeittyp value) {
        this.laufzeittyp = value;
    }

}
