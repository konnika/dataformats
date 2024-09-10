
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Mögliche Arten für ein Ratingszenario.
 *
 * <p>Java class for RatingkonfigurationArt</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RatingkonfigurationArt">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KEINE_KLASSIFIZIERUNG"/>
 *     <enumeration value="INTERN"/>
 *     <enumeration value="EXTERN_KURZFRISTIG"/>
 *     <enumeration value="EXTERN_LANGFRISTIG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "RatingkonfigurationArt")
@XmlEnum
public enum RatingkonfigurationArt {


    /**
     * Keine Klassifizierung
     */
    KEINE_KLASSIFIZIERUNG,

    /**
     * Intern
     */
    INTERN,

    /**
     * Extern kurzfristig
     */
    EXTERN_KURZFRISTIG,

    /**
     * Extern langfristig
     */
    EXTERN_LANGFRISTIG;

    public String value() {
        return name();
    }

    public static RatingkonfigurationArt fromValue(String v) {
        return valueOf(v);
    }

}
