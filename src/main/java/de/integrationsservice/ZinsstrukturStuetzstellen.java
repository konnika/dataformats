
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Liste der Stützstellen der Zinsstruktur
 *
 * <p>Java class for ZinsstrukturStuetzstellen complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ZinsstrukturStuetzstellen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="stuetzstelle" type="{http://www.gillardon.de/marzipan/integrationsservice}Stuetzstelle" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZinsstrukturStuetzstellen", propOrder = {
        "stuetzstelle"
})
public class ZinsstrukturStuetzstellen {

    /**
     * Refinanzierungskondition für eine bestimmte Laufzeit.
     */
    @XmlElement(required = true)
    protected List<Stuetzstelle> stuetzstelle;

    /**
     * Refinanzierungskondition für eine bestimmte Laufzeit.
     * <p>
     * Gets the value of the stuetzstelle property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stuetzstelle property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStuetzstelle().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stuetzstelle }
     * </p>
     *
     * @return The value of the stuetzstelle property.
     */
    public List<Stuetzstelle> getStuetzstelle() {
        if (stuetzstelle == null) {
            stuetzstelle = new ArrayList<>();
        }
        return this.stuetzstelle;
    }

}
