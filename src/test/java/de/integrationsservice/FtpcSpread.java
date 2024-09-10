
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Eine FtpcSpread in MarzipanWeb, mit technischer Name und Auswahl.
 *
 * <p>Java class for FtpcSpread complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FtpcSpread">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="spreadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="aufschlag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kategorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FtpcSpread", propOrder = {

})
public class FtpcSpread {

    /**
     * ID Der Spread
     */
    protected Long spreadId;
    /**
     * Aufschlag
     */
    protected Double aufschlag;
    /**
     * Name der Kategorie
     */
    protected String kategorie;

    /**
     * ID Der Spread
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSpreadId() {
        return spreadId;
    }

    /**
     * Sets the value of the spreadId property.
     *
     * @param value allowed object is
     *              {@link Long }
     * @see #getSpreadId()
     */
    public void setSpreadId(Long value) {
        this.spreadId = value;
    }

    /**
     * Aufschlag
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getAufschlag() {
        return aufschlag;
    }

    /**
     * Sets the value of the aufschlag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getAufschlag()
     */
    public void setAufschlag(Double value) {
        this.aufschlag = value;
    }

    /**
     * Name der Kategorie
     *
     * @return possible object is
     * {@link String }
     */
    public String getKategorie() {
        return kategorie;
    }

    /**
     * Sets the value of the kategorie property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKategorie()
     */
    public void setKategorie(String value) {
        this.kategorie = value;
    }

}
