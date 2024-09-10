
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Mit der Methode kann vorgegeben werden, welcher Referenzzinssatz verwendet werden soll.
 * Es gibt folgende Möglichkeiten:
 * lt. Referenzzinstyp - Es wird der aktuell gültige Referenzzinssatz passend zum gewählten Referenzzins
 * verwendet.
 * interpolieren - Mit Hilfe der risikolosen Zinsstruktur wird für die Laufzeit ein Referenzzinssatz
 * interpoliert.
 * manuell - Der Nominalzins wird direkt eingegeben und nicht automatisch aktualisiert. Beim Fixing wird
 * die Einstellung auf lt. Referenzzinstyp zurückgesetzt.
 * Im Fixing gibt es nur die Einstellungen lt. Referenzzinstyp und manuell, weil eine gebrochene erste
 * Zinsbindungsperiode dann nicht mehr möglich ist.
 *
 * <p>Java class for ReferenzzinsMethode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ReferenzzinsMethode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REFERENZZINS_VERWENDEN"/>
 *     <enumeration value="REFERENZZINS_INTERPOLIEREN"/>
 *     <enumeration value="REFERENZZINS_MANUELL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "ReferenzzinsMethode")
@XmlEnum
public enum ReferenzzinsMethode {

    REFERENZZINS_VERWENDEN,
    REFERENZZINS_INTERPOLIEREN,
    REFERENZZINS_MANUELL;

    public String value() {
        return name();
    }

    public static ReferenzzinsMethode fromValue(String v) {
        return valueOf(v);
    }

}
