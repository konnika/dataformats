
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Ftpc Kriterien
 *
 * <p>Java class for FtpcKriterien complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FtpcKriterien">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ftpcKriterium" type="{http://www.gillardon.de/marzipan/integrationsservice}FtpcKriterium" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FtpcKriterien", propOrder = {
        "ftpcKriterium"
})
public class FtpcKriterien {

    protected List<FtpcKriterium> ftpcKriterium;

    /**
     * Gets the value of the ftpcKriterium property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ftpcKriterium property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFtpcKriterium().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FtpcKriterium }
     * </p>
     *
     * @return The value of the ftpcKriterium property.
     */
    public List<FtpcKriterium> getFtpcKriterium() {
        if (ftpcKriterium == null) {
            ftpcKriterium = new ArrayList<>();
        }
        return this.ftpcKriterium;
    }

}
