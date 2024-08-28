
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Das ZinstrukturenSelektion Tag erlaubt die Auswahl der zu exportierenden Zinsstrukturen über die Angabe
 * der eindeutigen ID oder die Selektion mehrer Zinsstrukturen über das <alleaus> Tag.
 *
 * <p>Java class for ZinsstrukturenSelektion complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ZinsstrukturenSelektion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="alleaus" type="{http://www.gillardon.de/marzipan/integrationsservice}Alleaus"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZinsstrukturenSelektion", propOrder = {
        "alleaus",
        "id"
})
public class ZinsstrukturenSelektion {

    /**
     * Das Tag <alleaus> dient dazu, alle Zinsstrukturen mit einem der angegebenen
     * Teilmärkte und der angegebene Währung und Kalkulationsdatum zu exportieren.
     */
    protected Alleaus alleaus;
    /**
     * Eindeutige IDs der Zinsstrukturen.
     */
    @XmlElement(type = Integer.class)
    protected List<Integer> id;

    /**
     * Das Tag <alleaus> dient dazu, alle Zinsstrukturen mit einem der angegebenen
     * Teilmärkte und der angegebene Währung und Kalkulationsdatum zu exportieren.
     *
     * @return possible object is
     * {@link Alleaus }
     */
    public Alleaus getAlleaus() {
        return alleaus;
    }

    /**
     * Sets the value of the alleaus property.
     *
     * @param value allowed object is
     *              {@link Alleaus }
     * @see #getAlleaus()
     */
    public void setAlleaus(Alleaus value) {
        this.alleaus = value;
    }

    /**
     * Eindeutige IDs der Zinsstrukturen.
     * <p>
     * Gets the value of the id property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getId().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     *
     * @return The value of the id property.
     */
    public List<Integer> getId() {
        if (id == null) {
            id = new ArrayList<>();
        }
        return this.id;
    }

}
