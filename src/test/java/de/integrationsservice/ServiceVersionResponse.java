
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * enthält die Versionsnummer
 *
 * <p>Java class for ServiceVersionResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ServiceVersionResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="major" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="minor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceVersionResponse", propOrder = {
        "major",
        "minor"
})
public class ServiceVersionResponse {

    /**
     * Versionsnummer erste Ziffer
     */
    protected int major;
    /**
     * Versionsnummer zweite Ziffer
     */
    protected int minor;

    /**
     * Versionsnummer erste Ziffer
     */
    public int getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     */
    public void setMajor(int value) {
        this.major = value;
    }

    /**
     * Versionsnummer zweite Ziffer
     */
    public int getMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     */
    public void setMinor(int value) {
        this.minor = value;
    }

}
