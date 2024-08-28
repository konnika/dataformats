
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstitutskriteriaAuswahl complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="InstitutskriteriaAuswahl">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="schluesselWert" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="auswahl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="printFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitutskriteriaAuswahl", propOrder = {

})
public class InstitutskriteriaAuswahl {

    /**
     * Bezeichnung des Institutskriteriums
     */
    @XmlElement(required = true)
    protected String schluesselWert;
    /**
     * Aktuell ausgewählter Wert für das Institutskriterium. Die möglichen Auswahlwerte werden aus der
     * Datenbank gelesen.
     */
    protected String auswahl;
    /**
     * Markierung, ob das Institutskriterium auf Angebot und Berechnungsprotokoll mit ausgedruckt
     * werden soll.
     */
    protected Boolean printFlag;

    /**
     * Bezeichnung des Institutskriteriums
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchluesselWert() {
        return schluesselWert;
    }

    /**
     * Sets the value of the schluesselWert property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getSchluesselWert()
     */
    public void setSchluesselWert(String value) {
        this.schluesselWert = value;
    }

    /**
     * Aktuell ausgewählter Wert für das Institutskriterium. Die möglichen Auswahlwerte werden aus der
     * Datenbank gelesen.
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

    /**
     * Markierung, ob das Institutskriterium auf Angebot und Berechnungsprotokoll mit ausgedruckt
     * werden soll.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPrintFlag() {
        return printFlag;
    }

    /**
     * Sets the value of the printFlag property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isPrintFlag()
     */
    public void setPrintFlag(Boolean value) {
        this.printFlag = value;
    }

}
