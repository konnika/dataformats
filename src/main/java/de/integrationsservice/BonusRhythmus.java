
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Rhythmus der Bonuszahlung
 * - einmalig am Laufzeitende
 * - jährlich
 * - halbjährlich
 * - vierteljährlich
 * - zweimonatlich
 * - monatlich
 *
 * <p>Java class for BonusRhythmus</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BonusRhythmus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BR_LAUFZEITENDE"/>
 *     <enumeration value="BR_JAEHRLICH"/>
 *     <enumeration value="BR_HALBJAEHRLICH"/>
 *     <enumeration value="BR_VIERTELJAEHRLICH"/>
 *     <enumeration value="BR_ZWEIMONATLICH"/>
 *     <enumeration value="BR_MONATLICH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "BonusRhythmus")
@XmlEnum
public enum BonusRhythmus {

    BR_LAUFZEITENDE,
    BR_JAEHRLICH,
    BR_HALBJAEHRLICH,
    BR_VIERTELJAEHRLICH,
    BR_ZWEIMONATLICH,
    BR_MONATLICH;

    public String value() {
        return name();
    }

    public static BonusRhythmus fromValue(String v) {
        return valueOf(v);
    }

}
