
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der globale komplexe Typ Iopc enthält die Daten für kundenspezifischen iOPC Dialog
 *
 * <p>Java class for Iopc complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Iopc">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="wahlrechtsID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kalkulationsID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="zinsProzentRisikopraemie" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquiProzentPufferkosten" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquiProzentRisikopraemie" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="liquiSpread" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="iopcAktiv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Iopc", propOrder = {

})
public class Iopc {

    /**
     * Wahlrecht ID, Pflichtfeld für den Aufruf des Webservices zu iOPC über den Berechnen-Button.
     */
    protected String wahlrechtsID;
    /**
     * Kalkulation ID: Ausgabefeld, welches bei der Rückantwort mitgeliefert wird.
     */
    protected String kalkulationsID;
    /**
     * Zinsrisikoprämie (iOPC Dialog)
     */
    protected Double zinsProzentRisikopraemie;
    /**
     * Liquiditätspufferkosten (iOPC Dialog)
     */
    protected Double liquiProzentPufferkosten;
    /**
     * Liquiditätsspreadrisikoprämie (iOPC Dialog)
     */
    protected Double liquiProzentRisikopraemie;
    /**
     * Liquiditätsspread (iOPC Dialog)
     */
    protected Double liquiSpread;
    /**
     * Nach Bestätigung des iOPC Dialogs mit OK Button wird der Kommentar in das editierbare
     * Kommentarfeld auf der Ausdruckmaske von MARZIPAN Web übertragen
     */
    protected String kommentar;
    /**
     * Ist die IOPC-Tabelle aktiviert?
     */
    protected Boolean iopcAktiv;

    /**
     * Wahlrecht ID, Pflichtfeld für den Aufruf des Webservices zu iOPC über den Berechnen-Button.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWahlrechtsID() {
        return wahlrechtsID;
    }

    /**
     * Sets the value of the wahlrechtsID property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getWahlrechtsID()
     */
    public void setWahlrechtsID(String value) {
        this.wahlrechtsID = value;
    }

    /**
     * Kalkulation ID: Ausgabefeld, welches bei der Rückantwort mitgeliefert wird.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKalkulationsID() {
        return kalkulationsID;
    }

    /**
     * Sets the value of the kalkulationsID property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getKalkulationsID()
     */
    public void setKalkulationsID(String value) {
        this.kalkulationsID = value;
    }

    /**
     * Zinsrisikoprämie (iOPC Dialog)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getZinsProzentRisikopraemie() {
        return zinsProzentRisikopraemie;
    }

    /**
     * Sets the value of the zinsProzentRisikopraemie property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getZinsProzentRisikopraemie()
     */
    public void setZinsProzentRisikopraemie(Double value) {
        this.zinsProzentRisikopraemie = value;
    }

    /**
     * Liquiditätspufferkosten (iOPC Dialog)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLiquiProzentPufferkosten() {
        return liquiProzentPufferkosten;
    }

    /**
     * Sets the value of the liquiProzentPufferkosten property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLiquiProzentPufferkosten()
     */
    public void setLiquiProzentPufferkosten(Double value) {
        this.liquiProzentPufferkosten = value;
    }

    /**
     * Liquiditätsspreadrisikoprämie (iOPC Dialog)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLiquiProzentRisikopraemie() {
        return liquiProzentRisikopraemie;
    }

    /**
     * Sets the value of the liquiProzentRisikopraemie property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLiquiProzentRisikopraemie()
     */
    public void setLiquiProzentRisikopraemie(Double value) {
        this.liquiProzentRisikopraemie = value;
    }

    /**
     * Liquiditätsspread (iOPC Dialog)
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLiquiSpread() {
        return liquiSpread;
    }

    /**
     * Sets the value of the liquiSpread property.
     *
     * @param value allowed object is
     *              {@link Double }
     * @see #getLiquiSpread()
     */
    public void setLiquiSpread(Double value) {
        this.liquiSpread = value;
    }

    /**
     * Nach Bestätigung des iOPC Dialogs mit OK Button wird der Kommentar in das editierbare
     * Kommentarfeld auf der Ausdruckmaske von MARZIPAN Web übertragen
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
     * Ist die IOPC-Tabelle aktiviert?
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIopcAktiv() {
        return iopcAktiv;
    }

    /**
     * Sets the value of the iopcAktiv property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     * @see #isIopcAktiv()
     */
    public void setIopcAktiv(Boolean value) {
        this.iopcAktiv = value;
    }

}
