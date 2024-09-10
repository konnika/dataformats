
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Der globale komplexe Typ Cashflows enthält die Daten über Cashflows.
 *
 * <p>Java class for Cashflows complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Cashflows">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cashflow" type="{http://www.gillardon.de/marzipan/integrationsservice}Cashflow" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="herkunft" type="{http://www.gillardon.de/marzipan/integrationsservice}Herkunft" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cashflows", propOrder = {
        "cashflow"
})
public class Cashflows {

    protected List<Cashflow> cashflow;
    /**
     * Herkunft oder Art des Cashflows:
     */
    @XmlAttribute(name = "herkunft")
    protected Herkunft herkunft;

    /**
     * Gets the value of the cashflow property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashflow property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCashflow().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cashflow }
     * </p>
     *
     * @return The value of the cashflow property.
     */
    public List<Cashflow> getCashflow() {
        if (cashflow == null) {
            cashflow = new ArrayList<>();
        }
        return this.cashflow;
    }

    /**
     * Herkunft oder Art des Cashflows:
     *
     * @return possible object is
     * {@link Herkunft }
     */
    public Herkunft getHerkunft() {
        return herkunft;
    }

    /**
     * Sets the value of the herkunft property.
     *
     * @param value allowed object is
     *              {@link Herkunft }
     * @see #getHerkunft()
     */
    public void setHerkunft(Herkunft value) {
        this.herkunft = value;
    }

}
