
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Position (Kosten, Ertrag, DB-Stufe) im DB-Schema
 *
 * <p>Java class for DbPosition complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="DbPosition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="namePosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="externeWeiterverarbeitungArt" type="{http://www.gillardon.de/marzipan/integrationsservice}ExterneWeiterverarbeitungArt" minOccurs="0"/>
 *         <element name="vorhaltewert" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ergebnisProzent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ergebnisBetrag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DbPosition", propOrder = {

})
public class DbPosition {

    /**
     * Ergebnis DBSchema: Name der Kosten-/Ertrags-/DBStufen-Position
     */
    protected String namePosition;
    /**
     * Ergebnis DBSchema: Art für externe Weiterverarbeitung
     */
    @XmlSchemaType(name = "string")
    protected ExterneWeiterverarbeitungArt externeWeiterverarbeitungArt;
    /**
     * Ergebnis DBSchema: Vorhaltewert der Kosten-/Ertrags-Position
     */
    protected Double vorhaltewert;
    /**
     * Ergebnis DBSchema: Ergebnis in Prozent der Kosten-/Ertags-/DBStufen-Position
     */
    protected Double ergebnisProzent;
    /**
     * Ergebnis DBSchema: Ergebnis in Währungseinheiten der
     * Kosten-/Ertags-/DBStufen-Position
     */
    protected Double ergebnisBetrag;

    /**
     * Ergebnis DBSchema: Name der Kosten-/Ertrags-/DBStufen-Position
     *
     * @return possible object is
     * {@link String }
     */
    public String getNamePosition() {
        return namePosition;
    }

    /**
     * Sets the value of the namePosition property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getNamePosition()
     */
    public void setNamePosition(String value) {
        this.namePosition = value;
    }

    /**
     * Ergebnis DBSchema: Art für externe Weiterverarbeitung
     *
     * @return possible object is
     * {@link ExterneWeiterverarbeitungArt }
     */
    public ExterneWeiterverarbeitungArt getExterneWeiterverarbeitungArt() {
        return externeWeiterverarbeitungArt;
    }

    /**
     * Sets the value of the externeWeiterverarbeitungArt property.
     *
     * @param value allowed object is
     *              {@link ExterneWeiterverarbeitungArt }
     * @see #getExterneWeiterverarbeitungArt()
     */
    public void setExterneWeiterverarbeitungArt(ExterneWeiterverarbeitungArt value) {
        this.externeWeiterverarbeitungArt = value;
    }

    /**
     * Ergebnis DBSchema: Vorhaltewert der Kosten-/Ertrags-Position
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getVorhaltewert() {
        return vorhaltewert;
    }

    /**
     * Sets the value of the vorhaltewert property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getVorhaltewert()
     */
    public void setVorhaltewert(Double value) {
        this.vorhaltewert = value;
    }

    /**
     * Ergebnis DBSchema: Ergebnis in Prozent der Kosten-/Ertags-/DBStufen-Position
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getErgebnisProzent() {
        return ergebnisProzent;
    }

    /**
     * Sets the value of the ergebnisProzent property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getErgebnisProzent()
     */
    public void setErgebnisProzent(Double value) {
        this.ergebnisProzent = value;
    }

    /**
     * Ergebnis DBSchema: Ergebnis in Währungseinheiten der
     * Kosten-/Ertags-/DBStufen-Position
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getErgebnisBetrag() {
        return ergebnisBetrag;
    }

    /**
     * Sets the value of the ergebnisBetrag property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getErgebnisBetrag()
     */
    public void setErgebnisBetrag(Double value) {
        this.ergebnisBetrag = value;
    }

}
