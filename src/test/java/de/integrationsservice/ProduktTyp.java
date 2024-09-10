
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ProduktTyp definiert die mittels Kreditgeschäft abbildbaren Produkt-Typen.
 *
 * <p>Java class for ProduktTyp</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ProduktTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MARZIPAN_ANNUITAETENDARLEHEN"/>
 *     <enumeration value="MARZIPAN_ANNUITAETENTILGUNG"/>
 *     <enumeration value="MARZIPAN_TILGUNGSDARLEHEN"/>
 *     <enumeration value="MARZIPAN_ENDFAELLIGESDARLEHEN"/>
 *     <enumeration value="MARZIPAN_ROLLOVER_TERM_RATES"/>
 *     <enumeration value="MARZIPAN_ROLLOVER_OVERNIGHT"/>
 *     <enumeration value="MARZIPAN_TREPPENRECHNER_ANNUITAETENDARLEHEN"/>
 *     <enumeration value="MARZIPAN_TREPPENRECHNER_TILGUNGSDARLEHEN"/>
 *     <enumeration value="MARZIPAN_TREPPENRECHNER_CASHFLOWSEFFEKTIV"/>
 *     <enumeration value="MARZIPAN_TREPPENRECHNER_DISKONTRECHNUNG"/>
 *     <enumeration value="MARZIPAN_SPARBRIEF"/>
 *     <enumeration value="MARZIPAN_TERMINGELD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ProduktTyp")
@XmlEnum
public enum ProduktTyp {

    MARZIPAN_ANNUITAETENDARLEHEN,
    MARZIPAN_ANNUITAETENTILGUNG,
    MARZIPAN_TILGUNGSDARLEHEN,
    MARZIPAN_ENDFAELLIGESDARLEHEN,
    MARZIPAN_ROLLOVER_TERM_RATES,
    MARZIPAN_ROLLOVER_OVERNIGHT,
    MARZIPAN_TREPPENRECHNER_ANNUITAETENDARLEHEN,
    MARZIPAN_TREPPENRECHNER_TILGUNGSDARLEHEN,
    MARZIPAN_TREPPENRECHNER_CASHFLOWSEFFEKTIV,
    MARZIPAN_TREPPENRECHNER_DISKONTRECHNUNG,
    MARZIPAN_SPARBRIEF,
    MARZIPAN_TERMINGELD;

    public String value() {
        return name();
    }

    public static ProduktTyp fromValue(String v) {
        return valueOf(v);
    }

}
