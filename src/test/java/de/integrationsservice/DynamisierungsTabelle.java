
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Die Dynamisierungstabelle der Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
 *
 * <p>Java class for DynamisierungsTabelle complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="DynamisierungsTabelle">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="zeile" type="{http://www.gillardon.de/marzipan/integrationsservice}DynamisierungsTabelleZeile" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamisierungsTabelle", propOrder = {
        "zeile"
})
public class DynamisierungsTabelle {

    /**
     * Eine Zeile der Dynamisierungstabelle.
     */
    @XmlElement(required = true)
    protected List<DynamisierungsTabelleZeile> zeile;

    /**
     * Eine Zeile der Dynamisierungstabelle.
     * <p>
     * Gets the value of the zeile property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeile property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getZeile().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamisierungsTabelleZeile }
     * </p>
     *
     * @return The value of the zeile property.
     */
    public List<DynamisierungsTabelleZeile> getZeile() {
        if (zeile == null) {
            zeile = new ArrayList<>();
        }
        return this.zeile;
    }

}
