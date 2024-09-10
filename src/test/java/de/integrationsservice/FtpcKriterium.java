
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Eine FtpcKriterium in MarzipanWeb, mit technischer Name und Auswahl.
 *
 * <p>Java class for FtpcKriterium complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FtpcKriterium">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="auswahl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FtpcKriterium", propOrder = {

})
public class FtpcKriterium {

    /**
     * Technischer Name
     */
    protected String name;
    /**
     * Auswahl
     */
    protected String auswahl;

    /**
     * Technischer Name
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
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Auswahl
     *
     * @return possible object is
     * {@link String }
     */
    public String getAuswahl() {
        return auswahl;
    }

    /**
     * Sets the value of the auswahl property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getAuswahl()
     */
    public void setAuswahl(String value) {
        this.auswahl = value;
    }

}
