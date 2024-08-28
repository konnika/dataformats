
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Kontoführungsmethode standard oder beliebig bei Annuitätendarlehen
 * standard: Rhythmus der Zinsverrechnung = Rhythmus der Raten (müssen vor Tilgungsbeginn auch zeitlich mit
 * den späteren Ratenterminen aufeinanderfallen)
 * beliebig: Rhythmus der Zinsverrechnungen kann ungleich Rhythmus der Raten sein. Sofortige
 * Tilgungsverrechnung: ja/nein. Bei ja Tilgungsverrechnung mit jeder Rate
 *
 * <p>Java class for AnnuitaetenMethode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AnnuitaetenMethode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANN_BELIEBIG"/>
 *     <enumeration value="ANN_STANDARD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "AnnuitaetenMethode")
@XmlEnum
public enum AnnuitaetenMethode {

    ANN_BELIEBIG,
    ANN_STANDARD;

    public String value() {
        return name();
    }

    public static AnnuitaetenMethode fromValue(String v) {
        return valueOf(v);
    }

}
