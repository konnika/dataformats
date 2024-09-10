
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der globale komplexe Typ Logindaten enthält Benutzerinformationen für Authentifizierung
 *
 * <p>Java class for Logindaten complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Logindaten">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="institutsname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Logindaten", propOrder = {
        "username",
        "password",
        "institutsname",
        "token"
})
@XmlSeeAlso({
        Import.class,
        Statusuebergang.class,
        Rekonditionierung.class,
        AutoImport.class,
        AutoUpdate.class,
        AutoUpdateKopfdaten.class,
        ImportMitMelden.class
})
public class Logindaten {

    /**
     * Gilt nur für Einsprung ueber Postrequest: Benutzername des MARZIPAN-Anwenders, mit dessen Namen
     * in Marzipan Web eingesprungen wird.
     */
    protected String username;
    /**
     * Gilt nur für Einsprung ueber Postrequest: Password fuer die Anmeldung
     */
    protected String password;
    /**
     * Gilt nur für Einsprung ueber Postrequest:
     * Name des Instituts, für welches per Postrequest eingesprungen werden soll.
     * Dieses Element wird nur bei MultiClient-Betrieb benötigt.
     */
    protected String institutsname;
    /**
     * Gilt nur für Einsprung ueber Postrequest und fuer Webservice-Aufrufe:
     * SSO Token, welches die Authentifizierung/Autorisierung sicherstellt.
     */
    protected String token;

    /**
     * Gilt nur für Einsprung ueber Postrequest: Benutzername des MARZIPAN-Anwenders, mit dessen Namen
     * in Marzipan Web eingesprungen wird.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getUsername()
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gilt nur für Einsprung ueber Postrequest: Password fuer die Anmeldung
     *
     * @return possible object is
     * {@link String }
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getPassword()
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gilt nur für Einsprung ueber Postrequest:
     * Name des Instituts, für welches per Postrequest eingesprungen werden soll.
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
     * Gilt nur für Einsprung ueber Postrequest und fuer Webservice-Aufrufe:
     * SSO Token, welches die Authentifizierung/Autorisierung sicherstellt.
     *
     * @return possible object is
     * {@link String }
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value allowed object is
     *              {@link String }
     * @see #getToken()
     */
    public void setToken(String value) {
        this.token = value;
    }

}
