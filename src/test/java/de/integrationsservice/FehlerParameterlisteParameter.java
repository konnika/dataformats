
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Wert des Parameters als String dargestellt. Die Unterscheidung des Typs erfolgt über das Attribut "typ".
 *
 * <p>Java class for FehlerParameterlisteParameter complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FehlerParameterlisteParameter">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="typ" use="required" type="{http://www.gillardon.de/marzipan/integrationsservice}Parametertyp" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FehlerParameterlisteParameter", propOrder = {
        "value"
})
public class FehlerParameterlisteParameter {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "typ", required = true)
    protected Parametertyp typ;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the typ property.
     *
     * @return possible object is
     * {@link Parametertyp }
     */
    public Parametertyp getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     *
     * @param value allowed object is
     *              {@link Parametertyp }
     */
    public void setTyp(Parametertyp value) {
        this.typ = value;
    }

}
