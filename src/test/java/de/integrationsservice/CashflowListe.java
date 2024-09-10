
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Der globale komplexe TypCashflowListe- enthält eine Liste von Cashflows
 *
 * <p>Java class for CashflowListe complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="CashflowListe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cashflows" type="{http://www.gillardon.de/marzipan/integrationsservice}Cashflows" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashflowListe", propOrder = {
        "cashflows"
})
public class CashflowListe {

    /**
     * Cashflow
     */
    protected List<Cashflows> cashflows;

    /**
     * Cashflow
     * <p>
     * Gets the value of the cashflows property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashflows property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCashflows().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cashflows }
     * </p>
     *
     * @return The value of the cashflows property.
     */
    public List<Cashflows> getCashflows() {
        if (cashflows == null) {
            cashflows = new ArrayList<>();
        }
        return this.cashflows;
    }

}
