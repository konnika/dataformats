
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Aufteilungsnachricht wird an die Kommando Queue des MARZIPAN Messaging Service gesendet,
 * um die Aufteilung von Sammelgeschäften zu veranlassen.
 *
 * <p>Java class for Aufteilung complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Aufteilung">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="oid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="teilgeschaefte" type="{http://www.gillardon.de/marzipan/integrationsservice}Teilgeschaefte"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aufteilung", propOrder = {
        "oid",
        "teilgeschaefte"
})
public class Aufteilung {

    /**
     * Datenbank-ID des Geschäfts, das aufgeteilt werden soll
     */
    protected int oid;
    /**
     * Informationen über die zu erzeugenden Teilgeschäfte.
     */
    @XmlElement(required = true)
    protected Teilgeschaefte teilgeschaefte;

    /**
     * Datenbank-ID des Geschäfts, das aufgeteilt werden soll
     */
    public int getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     */
    public void setOid(int value) {
        this.oid = value;
    }

    /**
     * Informationen über die zu erzeugenden Teilgeschäfte.
     *
     * @return possible object is
     * {@link Teilgeschaefte }
     */
    public Teilgeschaefte getTeilgeschaefte() {
        return teilgeschaefte;
    }

    /**
     * Sets the value of the teilgeschaefte property.
     *
     * @param value allowed object is
     *              {@link Teilgeschaefte }
     * @see #getTeilgeschaefte()
     */
    public void setTeilgeschaefte(Teilgeschaefte value) {
        this.teilgeschaefte = value;
    }

}
