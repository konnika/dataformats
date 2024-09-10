
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste von Parametern zu der Fehlermeldung. Die Unterscheidung der Parametertypen von den
 * Stringparametern ist für die
 * länderspezifische Ausgabe der Fehlermeldung wichtig.
 * Die Reihenfolge der Untertags ist signifikant, da sie bei der Ausgabe der Fehlermeldung für die
 * Zuordnung der Parameter
 * zu einem entsprechenden Platzhalter verwendet wird.
 *
 * <p>Java class for FehlerParameterliste complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FehlerParameterliste">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="parameter" type="{http://www.gillardon.de/marzipan/integrationsservice}FehlerParameterlisteParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FehlerParameterliste", propOrder = {
        "parameter"
})
public class FehlerParameterliste {

    /**
     * Wert des Parameters als String dargestellt. Die Unterscheidung des Typs erfolgt über das
     * Attribut "typ".
     */
    protected List<FehlerParameterlisteParameter> parameter;

    /**
     * Wert des Parameters als String dargestellt. Die Unterscheidung des Typs erfolgt über das
     * Attribut "typ".
     * <p>
     * Gets the value of the parameter property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getParameter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FehlerParameterlisteParameter }
     * </p>
     *
     * @return The value of the parameter property.
     */
    public List<FehlerParameterlisteParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<>();
        }
        return this.parameter;
    }

}
