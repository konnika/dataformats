
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der globale komplexe Typ DBStufe enthält Informationen zu einer DBStufe-Zeile.
 *
 * <p>Java class for DBStufe complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="DBStufe">
 *   <complexContent>
 *     <restriction base="{http://www.gillardon.de/marzipan/integrationsservice}Kosten">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dbNr">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBStufe")
public class DBStufe
        extends Kosten {


}
