
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Der globale komplexe Typ StatusuebergangHistory enthält Daten für die am Geschäft durchgeführten
 * Statusübergänge.
 *
 * <p>Java class for StatusuebergangHistory complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="StatusuebergangHistory">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="angefragtTreasuryUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="angefragtTreasuryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="gemeldetUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gemeldetDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="freigegebenUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="freigegebenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="geprueftTreasuryUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="geprueftTreasuryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="gesperrtUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gesperrtDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="abgeloestUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="abgeloestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="angefragtFachlichUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="angefragtFachlichDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="geprueftFachlichUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="geprueftFachlichDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusuebergangHistory", propOrder = {

})
public class StatusuebergangHistory {

    /**
     * Benutzername des Anwenders, der das Darlehen an Treasury angefragt hat.
     */
    protected String angefragtTreasuryUser;
    /**
     * Datum, an dem das Geschäft an Treasury angefragt wurde.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar angefragtTreasuryDate;
    /**
     * Benutzername des Anwenders, der das Darlehen gemeldet hat.
     */
    protected String gemeldetUser;
    /**
     * Datum, an dem das Geschäft gemeldet wurde.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gemeldetDate;
    /**
     * Benutzername des Anwenders, der das Darlehen freigegeben hat.
     */
    protected String freigegebenUser;
    /**
     * Datum, an dem das Geschäft freigegeben wurde.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar freigegebenDate;
    /**
     * Benutzername des Anwenders, der das Darlehen
     * aus Treasury-Sicht geprüft hat.
     */
    protected String geprueftTreasuryUser;
    /**
     * Datum, an dem das Geschäft durch Treasury geprüft wurde.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar geprueftTreasuryDate;
    /**
     * Benutzername des Anwenders, der das Geschäft gesperrt hat.
     */
    protected String gesperrtUser;
    /**
     * Datum, an dem das Geschäft gesperrt wurde.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gesperrtDate;
    /**
     * Benutzername des Anwenders, der das Geschäft abgelöst hat.
     */
    protected String abgeloestUser;
    /**
     * Datum, an dem das Geschäft abgelöst wurde.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar abgeloestDate;
    /**
     * Benutzername des Anwenders, der das Geschäft fachlich angefragt hat.
     */
    protected String angefragtFachlichUser;
    /**
     * Datum, an dem das Geschäft fachlich angefragt wurde.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar angefragtFachlichDate;
    /**
     * Benutzername des Anwenders, der das Geschäft fachlich geprüft hat.
     */
    protected String geprueftFachlichUser;
    /**
     * Datum, an dem das Geschäft fachlich geprüft wurde.
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar geprueftFachlichDate;

    /**
     * Benutzername des Anwenders, der das Darlehen an Treasury angefragt hat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAngefragtTreasuryUser() {
        return angefragtTreasuryUser;
    }

    /**
     * Sets the value of the angefragtTreasuryUser property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getAngefragtTreasuryUser()
     */
    public void setAngefragtTreasuryUser(String value) {
        this.angefragtTreasuryUser = value;
    }

    /**
     * Datum, an dem das Geschäft an Treasury angefragt wurde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAngefragtTreasuryDate() {
        return angefragtTreasuryDate;
    }

    /**
     * Sets the value of the angefragtTreasuryDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAngefragtTreasuryDate()
     */
    public void setAngefragtTreasuryDate(XMLGregorianCalendar value) {
        this.angefragtTreasuryDate = value;
    }

    /**
     * Benutzername des Anwenders, der das Darlehen gemeldet hat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGemeldetUser() {
        return gemeldetUser;
    }

    /**
     * Sets the value of the gemeldetUser property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getGemeldetUser()
     */
    public void setGemeldetUser(String value) {
        this.gemeldetUser = value;
    }

    /**
     * Datum, an dem das Geschäft gemeldet wurde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getGemeldetDate() {
        return gemeldetDate;
    }

    /**
     * Sets the value of the gemeldetDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getGemeldetDate()
     */
    public void setGemeldetDate(XMLGregorianCalendar value) {
        this.gemeldetDate = value;
    }

    /**
     * Benutzername des Anwenders, der das Darlehen freigegeben hat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFreigegebenUser() {
        return freigegebenUser;
    }

    /**
     * Sets the value of the freigegebenUser property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getFreigegebenUser()
     */
    public void setFreigegebenUser(String value) {
        this.freigegebenUser = value;
    }

    /**
     * Datum, an dem das Geschäft freigegeben wurde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFreigegebenDate() {
        return freigegebenDate;
    }

    /**
     * Sets the value of the freigegebenDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getFreigegebenDate()
     */
    public void setFreigegebenDate(XMLGregorianCalendar value) {
        this.freigegebenDate = value;
    }

    /**
     * Benutzername des Anwenders, der das Darlehen
     * aus Treasury-Sicht geprüft hat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGeprueftTreasuryUser() {
        return geprueftTreasuryUser;
    }

    /**
     * Sets the value of the geprueftTreasuryUser property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getGeprueftTreasuryUser()
     */
    public void setGeprueftTreasuryUser(String value) {
        this.geprueftTreasuryUser = value;
    }

    /**
     * Datum, an dem das Geschäft durch Treasury geprüft wurde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getGeprueftTreasuryDate() {
        return geprueftTreasuryDate;
    }

    /**
     * Sets the value of the geprueftTreasuryDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getGeprueftTreasuryDate()
     */
    public void setGeprueftTreasuryDate(XMLGregorianCalendar value) {
        this.geprueftTreasuryDate = value;
    }

    /**
     * Benutzername des Anwenders, der das Geschäft gesperrt hat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGesperrtUser() {
        return gesperrtUser;
    }

    /**
     * Sets the value of the gesperrtUser property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getGesperrtUser()
     */
    public void setGesperrtUser(String value) {
        this.gesperrtUser = value;
    }

    /**
     * Datum, an dem das Geschäft gesperrt wurde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getGesperrtDate() {
        return gesperrtDate;
    }

    /**
     * Sets the value of the gesperrtDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getGesperrtDate()
     */
    public void setGesperrtDate(XMLGregorianCalendar value) {
        this.gesperrtDate = value;
    }

    /**
     * Benutzername des Anwenders, der das Geschäft abgelöst hat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAbgeloestUser() {
        return abgeloestUser;
    }

    /**
     * Sets the value of the abgeloestUser property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getAbgeloestUser()
     */
    public void setAbgeloestUser(String value) {
        this.abgeloestUser = value;
    }

    /**
     * Datum, an dem das Geschäft abgelöst wurde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAbgeloestDate() {
        return abgeloestDate;
    }

    /**
     * Sets the value of the abgeloestDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAbgeloestDate()
     */
    public void setAbgeloestDate(XMLGregorianCalendar value) {
        this.abgeloestDate = value;
    }

    /**
     * Benutzername des Anwenders, der das Geschäft fachlich angefragt hat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAngefragtFachlichUser() {
        return angefragtFachlichUser;
    }

    /**
     * Sets the value of the angefragtFachlichUser property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getAngefragtFachlichUser()
     */
    public void setAngefragtFachlichUser(String value) {
        this.angefragtFachlichUser = value;
    }

    /**
     * Datum, an dem das Geschäft fachlich angefragt wurde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAngefragtFachlichDate() {
        return angefragtFachlichDate;
    }

    /**
     * Sets the value of the angefragtFachlichDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getAngefragtFachlichDate()
     */
    public void setAngefragtFachlichDate(XMLGregorianCalendar value) {
        this.angefragtFachlichDate = value;
    }

    /**
     * Benutzername des Anwenders, der das Geschäft fachlich geprüft hat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGeprueftFachlichUser() {
        return geprueftFachlichUser;
    }

    /**
     * Sets the value of the geprueftFachlichUser property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getGeprueftFachlichUser()
     */
    public void setGeprueftFachlichUser(String value) {
        this.geprueftFachlichUser = value;
    }

    /**
     * Datum, an dem das Geschäft fachlich geprüft wurde.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getGeprueftFachlichDate() {
        return geprueftFachlichDate;
    }

    /**
     * Sets the value of the geprueftFachlichDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     * @see #getGeprueftFachlichDate()
     */
    public void setGeprueftFachlichDate(XMLGregorianCalendar value) {
        this.geprueftFachlichDate = value;
    }

}
