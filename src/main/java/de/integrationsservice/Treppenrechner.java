
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der globale komplexe Typ Treppenrechner enthält spezielle Daten über Treppenrechner.
 *
 * <p>Java class for Treppenrechner complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Treppenrechner">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="nomzinsform" type="{http://www.gillardon.de/marzipan/integrationsservice}Nomzinsform" minOccurs="0"/>
 *         <element name="kontostandsgrenze1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kontostandsgrenze2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kontostandsgrenze3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kontostandsgrenze4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="nominalzinsstaffel" type="{http://www.gillardon.de/marzipan/integrationsservice}Nominalzinsstaffel" minOccurs="0"/>
 *         <element name="restschuld" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="diskontsatz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="respekttage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Treppenrechner", propOrder = {

})
public class Treppenrechner {

    /**
     * Art des Nominalzinses. Bei Staffel verschiedene Eingabemöglichkeiten: nach Zeit, nach
     * Kontostand, nach Zeit und Kontostand mit 2 oder 4 Grenzen.
     */
    @XmlSchemaType(name = "string")
    protected Nomzinsform nomzinsform;
    /**
     * 1. Kontostandsgrenze für Nominalzinsstaffel.
     * Wird bei Nominalzinsform NOMZINS_NACHZEITUNDKONTOSTAND und NOMZINS_NACHZEITUNDKONTOSTAND5
     * benötigt.
     */
    protected Double kontostandsgrenze1;
    /**
     * 2. Kontostandsgrenze für Nominalzinsstaffel.
     * Wird bei Nominalzinsform NOMZINS_NACHZEITUNDKONTOSTAND und NOMZINS_NACHZEITUNDKONTOSTAND5
     * benötigt.
     */
    protected Double kontostandsgrenze2;
    /**
     * 3. Kontostandsgrenze für Nominalzinsstaffel.
     * Wird nur bei Nominalzinsform NOMZINS_NACHZEITUNDKONTOSTAND5 benötigt.
     */
    protected Double kontostandsgrenze3;
    /**
     * 4. Kontostandsgrenze für Nominalzinsstaffel.
     * Wird nur bei Nominalzinsform NOMZINS_NACHZEITUNDKONTOSTAND5 benötigt.
     */
    protected Double kontostandsgrenze4;
    /**
     * Nominalzinsstaffel
     */
    protected Nominalzinsstaffel nominalzinsstaffel;
    /**
     * Die Restschuld zum Ablauf der Zinsbindung
     */
    protected Double restschuld;
    /**
     * Der Diskontsatz bei der Diskontrechnung
     */
    protected Double diskontsatz;
    /**
     * Die Respekttage bei der Diskontrechnung
     */
    protected Integer respekttage;

    /**
     * Art des Nominalzinses. Bei Staffel verschiedene Eingabemöglichkeiten: nach Zeit, nach
     * Kontostand, nach Zeit und Kontostand mit 2 oder 4 Grenzen.
     *
     * @return possible object is
     * {@link Nomzinsform }
     */
    public Nomzinsform getNomzinsform() {
        return nomzinsform;
    }

    /**
     * Sets the value of the nomzinsform property.
     *
     * @param value allowed object is
     *              {@link Nomzinsform }
     * @see #getNomzinsform()
     */
    public void setNomzinsform(Nomzinsform value) {
        this.nomzinsform = value;
    }

    /**
     * 1. Kontostandsgrenze für Nominalzinsstaffel.
     * Wird bei Nominalzinsform NOMZINS_NACHZEITUNDKONTOSTAND und NOMZINS_NACHZEITUNDKONTOSTAND5
     * benötigt.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKontostandsgrenze1() {
        return kontostandsgrenze1;
    }

    /**
     * Sets the value of the kontostandsgrenze1 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKontostandsgrenze1()
     */
    public void setKontostandsgrenze1(Double value) {
        this.kontostandsgrenze1 = value;
    }

    /**
     * 2. Kontostandsgrenze für Nominalzinsstaffel.
     * Wird bei Nominalzinsform NOMZINS_NACHZEITUNDKONTOSTAND und NOMZINS_NACHZEITUNDKONTOSTAND5
     * benötigt.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKontostandsgrenze2() {
        return kontostandsgrenze2;
    }

    /**
     * Sets the value of the kontostandsgrenze2 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKontostandsgrenze2()
     */
    public void setKontostandsgrenze2(Double value) {
        this.kontostandsgrenze2 = value;
    }

    /**
     * 3. Kontostandsgrenze für Nominalzinsstaffel.
     * Wird nur bei Nominalzinsform NOMZINS_NACHZEITUNDKONTOSTAND5 benötigt.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKontostandsgrenze3() {
        return kontostandsgrenze3;
    }

    /**
     * Sets the value of the kontostandsgrenze3 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKontostandsgrenze3()
     */
    public void setKontostandsgrenze3(Double value) {
        this.kontostandsgrenze3 = value;
    }

    /**
     * 4. Kontostandsgrenze für Nominalzinsstaffel.
     * Wird nur bei Nominalzinsform NOMZINS_NACHZEITUNDKONTOSTAND5 benötigt.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getKontostandsgrenze4() {
        return kontostandsgrenze4;
    }

    /**
     * Sets the value of the kontostandsgrenze4 property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getKontostandsgrenze4()
     */
    public void setKontostandsgrenze4(Double value) {
        this.kontostandsgrenze4 = value;
    }

    /**
     * Nominalzinsstaffel
     *
     * @return possible object is
     * {@link Nominalzinsstaffel }
     */
    public Nominalzinsstaffel getNominalzinsstaffel() {
        return nominalzinsstaffel;
    }

    /**
     * Sets the value of the nominalzinsstaffel property.
     *
     * @param value allowed object is
     *              {@link Nominalzinsstaffel }
     * @see #getNominalzinsstaffel()
     */
    public void setNominalzinsstaffel(Nominalzinsstaffel value) {
        this.nominalzinsstaffel = value;
    }

    /**
     * Die Restschuld zum Ablauf der Zinsbindung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRestschuld() {
        return restschuld;
    }

    /**
     * Sets the value of the restschuld property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getRestschuld()
     */
    public void setRestschuld(Double value) {
        this.restschuld = value;
    }

    /**
     * Der Diskontsatz bei der Diskontrechnung
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getDiskontsatz() {
        return diskontsatz;
    }

    /**
     * Sets the value of the diskontsatz property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getDiskontsatz()
     */
    public void setDiskontsatz(Double value) {
        this.diskontsatz = value;
    }

    /**
     * Die Respekttage bei der Diskontrechnung
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRespekttage() {
        return respekttage;
    }

    /**
     * Sets the value of the respekttage property.
     *
     * @param value allowed object is
     *              {@link Integer }
     * @see #getRespekttage()
     */
    public void setRespekttage(Integer value) {
        this.respekttage = value;
    }

}
