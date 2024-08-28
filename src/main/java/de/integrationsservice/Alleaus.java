
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * Das Tag <alleaus> dient dazu, alle Zinsstrukturen mit einem der angegebenen
 * Teilmärkte und der angegebene Währung und Kalkulationsdatum zu exportieren.
 *
 * <p>Java class for Alleaus complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Alleaus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="teilmarkt" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kalkulationsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Alleaus", propOrder = {
        "teilmarkt",
        "waehrung",
        "kalkulationsdatum"
})
public class Alleaus {

    @XmlElement(required = true)
    protected List<String> teilmarkt;
    @XmlElement(required = true)
    protected String waehrung;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kalkulationsdatum;

    /**
     * Gets the value of the teilmarkt property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teilmarkt property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeilmarkt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     * @return The value of the teilmarkt property.
     */
    public List<String> getTeilmarkt() {
        if (teilmarkt == null) {
            teilmarkt = new ArrayList<>();
        }
        return this.teilmarkt;
    }

    /**
     * Gets the value of the waehrung property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the value of the waehrung property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWaehrung(String value) {
        this.waehrung = value;
    }

    /**
     * Gets the value of the kalkulationsdatum property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getKalkulationsdatum() {
        return kalkulationsdatum;
    }

    /**
     * Sets the value of the kalkulationsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setKalkulationsdatum(XMLGregorianCalendar value) {
        this.kalkulationsdatum = value;
    }

}
