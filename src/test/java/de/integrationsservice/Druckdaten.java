
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Druckdaten zu einem Geschäft.
 *
 * <p>Java class for Druckdaten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Druckdaten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="angebotstext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="angebotstextVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hinweisTextKontoplan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentarText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentarTextVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gesamtkostenDrucken" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Druckdaten", propOrder = {

})
public class Druckdaten {

    /**
     * Freies Eingabefeld, um einen Text zu hinterlegen, der im Angebot als letzter Absatz vor der
     * Grußformel eingefügt wird
     */
    protected String angebotstext;
    /**
     * Freies Eingabefeld, um einen Text zu hinterlegen, der im Angebot (Geschäftsänderung) als letzter
     * Absatz vor der Grußformel eingefügt wird
     */
    protected String angebotstextVE;
    /**
     * Editierbares Feld für den Ausdruck Kontoplan
     */
    protected String hinweisTextKontoplan;
    /**
     * Editierbares Feld für den Ausdruck Berechungsprotokoll
     */
    protected String kommentarText;
    /**
     * Editierbares Feld für den Ausdruck Berechungsprotokoll(Geschäftsänderung)
     */
    protected String kommentarTextVE;
    /**
     * Sollen die Gesamtkosten im Ausdruck ausgewiesen werden?
     */
    protected Boolean gesamtkostenDrucken;

    /**
     * Freies Eingabefeld, um einen Text zu hinterlegen, der im Angebot als letzter Absatz vor der
     * Grußformel eingefügt wird
     *
     * @return possible object is
     * {@link String }
     */
    public String getAngebotstext() {
        return angebotstext;
    }

    /**
     * Sets the value of the angebotstext property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getAngebotstext()
     */
    public void setAngebotstext(String value) {
        this.angebotstext = value;
    }

    /**
     * Freies Eingabefeld, um einen Text zu hinterlegen, der im Angebot (Geschäftsänderung) als letzter
     * Absatz vor der Grußformel eingefügt wird
     *
     * @return possible object is
     * {@link String }
     */
    public String getAngebotstextVE() {
        return angebotstextVE;
    }

    /**
     * Sets the value of the angebotstextVE property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getAngebotstextVE()
     */
    public void setAngebotstextVE(String value) {
        this.angebotstextVE = value;
    }

    /**
     * Editierbares Feld für den Ausdruck Kontoplan
     *
     * @return possible object is
     * {@link String }
     */
    public String getHinweisTextKontoplan() {
        return hinweisTextKontoplan;
    }

    /**
     * Sets the value of the hinweisTextKontoplan property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getHinweisTextKontoplan()
     */
    public void setHinweisTextKontoplan(String value) {
        this.hinweisTextKontoplan = value;
    }

    /**
     * Editierbares Feld für den Ausdruck Berechungsprotokoll
     *
     * @return possible object is
     * {@link String }
     */
    public String getKommentarText() {
        return kommentarText;
    }

    /**
     * Sets the value of the kommentarText property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKommentarText()
     */
    public void setKommentarText(String value) {
        this.kommentarText = value;
    }

    /**
     * Editierbares Feld für den Ausdruck Berechungsprotokoll(Geschäftsänderung)
     *
     * @return possible object is
     * {@link String }
     */
    public String getKommentarTextVE() {
        return kommentarTextVE;
    }

    /**
     * Sets the value of the kommentarTextVE property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKommentarTextVE()
     */
    public void setKommentarTextVE(String value) {
        this.kommentarTextVE = value;
    }

    /**
     * Sollen die Gesamtkosten im Ausdruck ausgewiesen werden?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGesamtkostenDrucken() {
        return gesamtkostenDrucken;
    }

    /**
     * Sets the value of the gesamtkostenDrucken property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isGesamtkostenDrucken()
     */
    public void setGesamtkostenDrucken(Boolean value) {
        this.gesamtkostenDrucken = value;
    }

}
