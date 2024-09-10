
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Der globale komplexe Typ RisikoEigenkapitalkost enthält die Informationen über die Eigenkapitalkosten.
 *
 * <p>Java class for RisikoEigenkapitalkost complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RisikoEigenkapitalkost">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="freigabestatus" type="{http://www.gillardon.de/marzipan/integrationsservice}Freigabestatus" minOccurs="0"/>
 *         <element name="lgdDifferenz" type="{http://www.gillardon.de/marzipan/integrationsservice}LGDDifferenz"/>
 *         <element name="dynamisierungsTabelle" type="{http://www.gillardon.de/marzipan/integrationsservice}DynamisierungsTabelle"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisikoEigenkapitalkost", propOrder = {

})
public class RisikoEigenkapitalkost {

    /**
     * Name der Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
     */
    protected String name;
    /**
     * Kommentar für die Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
     */
    protected String kommentar;
    /**
     * Erstellungsdatum der Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erstellungsdatum;
    /**
     * Ersteller der Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
     */
    protected String ersteller;
    /**
     * Freigabestatus der Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
     */
    @XmlSchemaType(name = "string")
    protected Freigabestatus freigabestatus;
    /**
     * LGD-Differenz:
     * - keine Wertberichtigung
     * - Berechnung der Wertberichtigung
     * - aufsichtsrechtlich ausreichende Wertberichtigung
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LGDDifferenz lgdDifferenz;
    /**
     * Die Dynamisierungstabelle der Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
     */
    @XmlElement(required = true)
    protected DynamisierungsTabelle dynamisierungsTabelle;

    /**
     * Name der Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
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
     * Kommentar für die Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
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
     * Erstellungsdatum der Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
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
     * Ersteller der Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
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
     * Freigabestatus der Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
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
     * LGD-Differenz:
     * - keine Wertberichtigung
     * - Berechnung der Wertberichtigung
     * - aufsichtsrechtlich ausreichende Wertberichtigung
     *
     * @return possible object is
     * {@link LGDDifferenz }
     */
    public LGDDifferenz getLgdDifferenz() {
        return lgdDifferenz;
    }

    /**
     * Sets the value of the lgdDifferenz property.
     *
     * @param value allowed object is
     *              {@link LGDDifferenz }
     * @see #getLgdDifferenz()
     */
    public void setLgdDifferenz(LGDDifferenz value) {
        this.lgdDifferenz = value;
    }

    /**
     * Die Dynamisierungstabelle der Eigenkapitalkosten aus aufsichtsrechtlicher Sicht
     *
     * @return possible object is
     * {@link DynamisierungsTabelle }
     */
    public DynamisierungsTabelle getDynamisierungsTabelle() {
        return dynamisierungsTabelle;
    }

    /**
     * Sets the value of the dynamisierungsTabelle property.
     *
     * @param value allowed object is
     *              {@link DynamisierungsTabelle }
     * @see #getDynamisierungsTabelle()
     */
    public void setDynamisierungsTabelle(DynamisierungsTabelle value) {
        this.dynamisierungsTabelle = value;
    }

}
