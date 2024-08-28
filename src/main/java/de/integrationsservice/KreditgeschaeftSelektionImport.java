
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Das Tag erlaubt die Auswahl des zu importierenden Kreditgeschäfts über die Angabe von eindeutigem
 * Name bzw. eindeutiger Kontonummer.
 *
 * <p>Java class for KreditgeschaeftSelektionImport complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="KreditgeschaeftSelektionImport">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kontonummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KreditgeschaeftSelektionImport", propOrder = {
        "name",
        "kontonummer"
})
public class KreditgeschaeftSelektionImport {

    /**
     * Name des Kreditgeschäfts.
     */
    protected String name;
    /**
     * Kontonummer des Kreditgeschäfts.
     */
    protected String kontonummer;

    /**
     * Name des Kreditgeschäfts.
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
     * Kontonummer des Kreditgeschäfts.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKontonummer() {
        return kontonummer;
    }

    /**
     * Sets the value of the kontonummer property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKontonummer()
     */
    public void setKontonummer(String value) {
        this.kontonummer = value;
    }

}
