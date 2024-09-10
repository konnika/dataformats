
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Informationen zu einer Bonität/Ratingklasse.
 *
 * <p>Java class for Bonitaet complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Bonitaet">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="bnote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="bnoteGerundet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rang">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               <minInclusive value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ausfall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="marzipannote" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bonitaet", propOrder = {

})
public class Bonitaet {

    /**
     * Der Name der Ratingklasse.
     */
    @XmlElement(required = true)
    protected String bnote;
    /**
     * Wird in MARZIPAN Web nicht genutzt.
     */
    protected String bnoteGerundet;
    /**
     * Der Rang der Ratingklasse.
     */
    protected short rang;
    /**
     * Die Ratingklasse ist eine Ausfallklasse: Ja/Nein.
     */
    protected boolean ausfall;
    /**
     * Die durchnummerierte Integerzahl der Ratingnote, beginnend mit 1.
     */
    protected double marzipannote;

    /**
     * Der Name der Ratingklasse.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBnote() {
        return bnote;
    }

    /**
     * Sets the value of the bnote property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getBnote()
     */
    public void setBnote(String value) {
        this.bnote = value;
    }

    /**
     * Wird in MARZIPAN Web nicht genutzt.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBnoteGerundet() {
        return bnoteGerundet;
    }

    /**
     * Sets the value of the bnoteGerundet property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getBnoteGerundet()
     */
    public void setBnoteGerundet(String value) {
        this.bnoteGerundet = value;
    }

    /**
     * Der Rang der Ratingklasse.
     */
    public short getRang() {
        return rang;
    }

    /**
     * Sets the value of the rang property.
     */
    public void setRang(short value) {
        this.rang = value;
    }

    /**
     * Die Ratingklasse ist eine Ausfallklasse: Ja/Nein.
     */
    public boolean isAusfall() {
        return ausfall;
    }

    /**
     * Sets the value of the ausfall property.
     */
    public void setAusfall(boolean value) {
        this.ausfall = value;
    }

    /**
     * Die durchnummerierte Integerzahl der Ratingnote, beginnend mit 1.
     */
    public double getMarzipannote() {
        return marzipannote;
    }

    /**
     * Sets the value of the marzipannote property.
     */
    public void setMarzipannote(double value) {
        this.marzipannote = value;
    }

}
