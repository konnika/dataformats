
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Art der Bonuszahlung: - verrechnen; -ausschütten
 *
 * <p>Java class for Bonussatz complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Bonussatz">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="bonuslaufzeit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bonusdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="bonussatzRaten" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="bonussatzZinsen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bonussatz", propOrder = {

})
public class Bonussatz {

    /**
     * Laufzeit in Jahren für Bonussatz.
     */
    protected Double bonuslaufzeit;
    /**
     * Bis zu diesem Datum gelten die Bonus Raten (in %) und Bonus Zinsen (in %).
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bonusdatum;
    /**
     * Bonus auf Ratenzahlungen in Prozent bei Bonus nach Laufzeit oder Datum.
     */
    protected Double bonussatzRaten;
    /**
     * Bonus auf Zinsen in Prozent bei Bonus nach Laufzeit oder Datum.
     */
    protected Double bonussatzZinsen;

    /**
     * Laufzeit in Jahren für Bonussatz.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBonuslaufzeit() {
        return bonuslaufzeit;
    }

    /**
     * Sets the value of the bonuslaufzeit property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBonuslaufzeit()
     */
    public void setBonuslaufzeit(Double value) {
        this.bonuslaufzeit = value;
    }

    /**
     * Bis zu diesem Datum gelten die Bonus Raten (in %) und Bonus Zinsen (in %).
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getBonusdatum() {
        return bonusdatum;
    }

    /**
     * Sets the value of the bonusdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getBonusdatum()
     */
    public void setBonusdatum(XMLGregorianCalendar value) {
        this.bonusdatum = value;
    }

    /**
     * Bonus auf Ratenzahlungen in Prozent bei Bonus nach Laufzeit oder Datum.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBonussatzRaten() {
        return bonussatzRaten;
    }

    /**
     * Sets the value of the bonussatzRaten property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBonussatzRaten()
     */
    public void setBonussatzRaten(Double value) {
        this.bonussatzRaten = value;
    }

    /**
     * Bonus auf Zinsen in Prozent bei Bonus nach Laufzeit oder Datum.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getBonussatzZinsen() {
        return bonussatzZinsen;
    }

    /**
     * Sets the value of the bonussatzZinsen property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getBonussatzZinsen()
     */
    public void setBonussatzZinsen(Double value) {
        this.bonussatzZinsen = value;
    }

}
