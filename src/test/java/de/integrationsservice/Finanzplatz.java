
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der Finanzplatz legt die Feiertage fest. Er wird sowohl für die Berechnung von Zahlungsterminen von
 * Geschäften
 * als auch für die Ermittlung der Termine in Zinsstrukturen verwendet.
 *
 * <p>Java class for Finanzplatz complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Finanzplatz">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="festeFeiertage" type="{http://www.gillardon.de/marzipan/integrationsservice}FesteFeiertage" minOccurs="0"/>
 *         <element name="kirchlicheFeiertage" type="{http://www.gillardon.de/marzipan/integrationsservice}KirchlicheFeiertage" minOccurs="0"/>
 *         <element name="laenderspezifischeFeiertage" type="{http://www.gillardon.de/marzipan/integrationsservice}LaenderspezifischeFeiertage" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Finanzplatz", propOrder = {

})
public class Finanzplatz {

    /**
     * Name des Finanzplatzes
     */
    protected String name;
    /**
     * Kommentar zum Finanzplatz
     */
    protected String kommentar;
    /**
     * Liste der festen Feiertage des Finanzplatzes
     */
    protected FesteFeiertage festeFeiertage;
    /**
     * Liste der kirchlichen Feiertage des Finanzplatzes
     */
    protected KirchlicheFeiertage kirchlicheFeiertage;
    /**
     * Liste der länderspezifischen Feiertage des Finanzplatzes
     */
    protected LaenderspezifischeFeiertage laenderspezifischeFeiertage;

    /**
     * Name des Finanzplatzes
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
     * Kommentar zum Finanzplatz
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
     * Liste der festen Feiertage des Finanzplatzes
     *
     * @return possible object is
     * {@link FesteFeiertage }
     */
    public FesteFeiertage getFesteFeiertage() {
        return festeFeiertage;
    }

    /**
     * Sets the value of the festeFeiertage property.
     *
     * @param value allowed object is
     *              {@link FesteFeiertage }
     * @see #getFesteFeiertage()
     */
    public void setFesteFeiertage(FesteFeiertage value) {
        this.festeFeiertage = value;
    }

    /**
     * Liste der kirchlichen Feiertage des Finanzplatzes
     *
     * @return possible object is
     * {@link KirchlicheFeiertage }
     */
    public KirchlicheFeiertage getKirchlicheFeiertage() {
        return kirchlicheFeiertage;
    }

    /**
     * Sets the value of the kirchlicheFeiertage property.
     *
     * @param value allowed object is
     *              {@link KirchlicheFeiertage }
     * @see #getKirchlicheFeiertage()
     */
    public void setKirchlicheFeiertage(KirchlicheFeiertage value) {
        this.kirchlicheFeiertage = value;
    }

    /**
     * Liste der länderspezifischen Feiertage des Finanzplatzes
     *
     * @return possible object is
     * {@link LaenderspezifischeFeiertage }
     */
    public LaenderspezifischeFeiertage getLaenderspezifischeFeiertage() {
        return laenderspezifischeFeiertage;
    }

    /**
     * Sets the value of the laenderspezifischeFeiertage property.
     *
     * @param value allowed object is
     *              {@link LaenderspezifischeFeiertage }
     * @see #getLaenderspezifischeFeiertage()
     */
    public void setLaenderspezifischeFeiertage(LaenderspezifischeFeiertage value) {
        this.laenderspezifischeFeiertage = value;
    }

}
