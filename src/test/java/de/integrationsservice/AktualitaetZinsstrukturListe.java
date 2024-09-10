
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Für jeden Eintrag der Liste wird geprüft, ob die durch die Attribute definierte Zinsstruktur aktuell ist.
 * Wird sowohl für Request als auch für Response verwendet.
 *
 * <p>Java class for AktualitaetZinsstrukturListe complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AktualitaetZinsstrukturListe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="institutsname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aktualitaetZinsstruktur" type="{http://www.gillardon.de/marzipan/integrationsservice}AktualitaetZinsstruktur" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AktualitaetZinsstrukturListe", propOrder = {
        "institutsname",
        "aktualitaetZinsstruktur"
})
public class AktualitaetZinsstrukturListe {

    /**
     * Name des Instituts, für welches die Aktualitätsprüfung durchgeführt werden soll.
     * Dieses Element wird nur bei MultiClient-Betrieb benötigt.
     */
    protected String institutsname;
    /**
     * Enthält Attribute, um die Aktualität der Zinsstruktur abzufragen. Das Ergebnis der Prüfung und ein eventueller Fehler sind auch enthalten.
     */
    @XmlElement(required = true)
    protected List<AktualitaetZinsstruktur> aktualitaetZinsstruktur;

    /**
     * Name des Instituts, für welches die Aktualitätsprüfung durchgeführt werden soll.
     * Dieses Element wird nur bei MultiClient-Betrieb benötigt.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInstitutsname() {
        return institutsname;
    }

    /**
     * Sets the value of the institutsname property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getInstitutsname()
     */
    public void setInstitutsname(String value) {
        this.institutsname = value;
    }

    /**
     * Enthält Attribute, um die Aktualität der Zinsstruktur abzufragen. Das Ergebnis der Prüfung und ein eventueller Fehler sind auch enthalten.
     * <p>
     * Gets the value of the aktualitaetZinsstruktur property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aktualitaetZinsstruktur property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAktualitaetZinsstruktur().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AktualitaetZinsstruktur }
     * </p>
     *
     * @return The value of the aktualitaetZinsstruktur property.
     */
    public List<AktualitaetZinsstruktur> getAktualitaetZinsstruktur() {
        if (aktualitaetZinsstruktur == null) {
            aktualitaetZinsstruktur = new ArrayList<>();
        }
        return this.aktualitaetZinsstruktur;
    }

}
