
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Methode zur Aufteilung nominales Konto: linear oder einstandsoptimiert
 *
 * <p>Java class for AufteilungNominalesKonto</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AufteilungNominalesKonto">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LINEAR"/>
 *     <enumeration value="EINSTANDSOPTIMIERT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "AufteilungNominalesKonto")
@XmlEnum
public enum AufteilungNominalesKonto {

    LINEAR,
    EINSTANDSOPTIMIERT;

    public String value() {
        return name();
    }

    public static AufteilungNominalesKonto fromValue(String v) {
        return valueOf(v);
    }

}
