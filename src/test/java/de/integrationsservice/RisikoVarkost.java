
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Daten für das Risiko variable Kosten
 *
 * <p>Java class for RisikoVarkost complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RisikoVarkost">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="freigabestatus" type="{http://www.gillardon.de/marzipan/integrationsservice}Freigabestatus" minOccurs="0"/>
 *         <element name="variableKosten" type="{http://www.gillardon.de/marzipan/integrationsservice}DoubleFrom1000NegativTo1000Positiv"/>
 *         <element name="kreditkonversionsfaktor" type="{http://www.gillardon.de/marzipan/integrationsservice}DoubleFrom1000NegativTo1000Positiv"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisikoVarkost", propOrder = {

})
public class RisikoVarkost {

    /**
     * Name des variablen Kostens
     * muss beim Export aus EINSTAND angegeben werden
     */
    protected String name;
    /**
     * Kommentar des variablen Kostens
     */
    protected String kommentar;
    /**
     * Erstellungsdatum des variablen Kostens
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erstellungsdatum;
    /**
     * Ersteller des variablen Kostens
     */
    protected String ersteller;
    /**
     * Freigabestatus des variablen Kostens
     */
    @XmlSchemaType(name = "string")
    protected Freigabestatus freigabestatus;
    /**
     * Kosten, die durch den Ausfall entfallen.
     */
    protected double variableKosten;
    /**
     * CreditConversionsfaktor für die ökonomischen Eigenkapitalkosten
     * 0 100
     */
    protected double kreditkonversionsfaktor;

    /**
     * Name des variablen Kostens
     * muss beim Export aus EINSTAND angegeben werden
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
     * Kommentar des variablen Kostens
     *
     * @return possible object is
     * {@link String }
     */
    public String getKommentar() {
        return kommentar;
    }

    /**
     * Sets the value of the kommentar property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKommentar()
     */
    public void setKommentar(String value) {
        this.kommentar = value;
    }

    /**
     * Erstellungsdatum des variablen Kostens
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getErstellungsdatum() {
        return erstellungsdatum;
    }

    /**
     * Sets the value of the erstellungsdatum property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getErstellungsdatum()
     */
    public void setErstellungsdatum(XMLGregorianCalendar value) {
        this.erstellungsdatum = value;
    }

    /**
     * Ersteller des variablen Kostens
     *
     * @return possible object is
     * {@link String }
     */
    public String getErsteller() {
        return ersteller;
    }

    /**
     * Sets the value of the ersteller property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getErsteller()
     */
    public void setErsteller(String value) {
        this.ersteller = value;
    }

    /**
     * Freigabestatus des variablen Kostens
     *
     * @return possible object is
     * {@link Freigabestatus }
     */
    public Freigabestatus getFreigabestatus() {
        return freigabestatus;
    }

    /**
     * Sets the value of the freigabestatus property.
     *
     * @param value allowed object is
     *              {@link Freigabestatus }
     * @see #getFreigabestatus()
     */
    public void setFreigabestatus(Freigabestatus value) {
        this.freigabestatus = value;
    }

    /**
     * Kosten, die durch den Ausfall entfallen.
     */
    public double getVariableKosten() {
        return variableKosten;
    }

    /**
     * Sets the value of the variableKosten property.
     */
    public void setVariableKosten(double value) {
        this.variableKosten = value;
    }

    /**
     * CreditConversionsfaktor für die ökonomischen Eigenkapitalkosten
     * 0 100
     */
    public double getKreditkonversionsfaktor() {
        return kreditkonversionsfaktor;
    }

    /**
     * Sets the value of the kreditkonversionsfaktor property.
     */
    public void setKreditkonversionsfaktor(double value) {
        this.kreditkonversionsfaktor = value;
    }

}
