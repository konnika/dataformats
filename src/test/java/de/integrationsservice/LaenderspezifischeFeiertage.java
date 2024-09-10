
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Liste der länderspezifischen Feiertage des Finanzplatzes
 *
 * <p>Java class for LaenderspezifischeFeiertage complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="LaenderspezifischeFeiertage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="amerikanischeFeiertage" type="{http://www.gillardon.de/marzipan/integrationsservice}AmerikanischeFeiertage" minOccurs="0"/>
 *         <element name="britischeFeiertage" type="{http://www.gillardon.de/marzipan/integrationsservice}BritischeFeiertage" minOccurs="0"/>
 *         <element name="japanischeFeiertage" type="{http://www.gillardon.de/marzipan/integrationsservice}JapanischeFeiertage" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaenderspezifischeFeiertage", propOrder = {
        "amerikanischeFeiertage",
        "britischeFeiertage",
        "japanischeFeiertage"
})
public class LaenderspezifischeFeiertage {

    /**
     * Amerikanische Feiertage
     */
    protected AmerikanischeFeiertage amerikanischeFeiertage;
    /**
     * Britische Feiertage
     */
    protected BritischeFeiertage britischeFeiertage;
    /**
     * Japanische Feiertage
     */
    protected JapanischeFeiertage japanischeFeiertage;

    /**
     * Amerikanische Feiertage
     *
     * @return possible object is
     * {@link AmerikanischeFeiertage }
     */
    public AmerikanischeFeiertage getAmerikanischeFeiertage() {
        return amerikanischeFeiertage;
    }

    /**
     * Sets the value of the amerikanischeFeiertage property.
     *
     * @param value allowed object is
     *              {@link AmerikanischeFeiertage }
     * @see #getAmerikanischeFeiertage()
     */
    public void setAmerikanischeFeiertage(AmerikanischeFeiertage value) {
        this.amerikanischeFeiertage = value;
    }

    /**
     * Britische Feiertage
     *
     * @return possible object is
     * {@link BritischeFeiertage }
     */
    public BritischeFeiertage getBritischeFeiertage() {
        return britischeFeiertage;
    }

    /**
     * Sets the value of the britischeFeiertage property.
     *
     * @param value allowed object is
     *              {@link BritischeFeiertage }
     * @see #getBritischeFeiertage()
     */
    public void setBritischeFeiertage(BritischeFeiertage value) {
        this.britischeFeiertage = value;
    }

    /**
     * Japanische Feiertage
     *
     * @return possible object is
     * {@link JapanischeFeiertage }
     */
    public JapanischeFeiertage getJapanischeFeiertage() {
        return japanischeFeiertage;
    }

    /**
     * Sets the value of the japanischeFeiertage property.
     *
     * @param value allowed object is
     *              {@link JapanischeFeiertage }
     * @see #getJapanischeFeiertage()
     */
    public void setJapanischeFeiertage(JapanischeFeiertage value) {
        this.japanischeFeiertage = value;
    }

}
