
package de.integrationsservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Ftpc Spreads
 *
 * <p>Java class for FtpcSpreads complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FtpcSpreads">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ftpcSpread" type="{http://www.gillardon.de/marzipan/integrationsservice}FtpcSpread" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FtpcSpreads", propOrder = {
        "ftpcSpread"
})
public class FtpcSpreads {

    protected List<FtpcSpread> ftpcSpread;

    /**
     * Gets the value of the ftpcSpread property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ftpcSpread property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFtpcSpread().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FtpcSpread }
     * </p>
     *
     * @return The value of the ftpcSpread property.
     */
    public List<FtpcSpread> getFtpcSpread() {
        if (ftpcSpread == null) {
            ftpcSpread = new ArrayList<>();
        }
        return this.ftpcSpread;
    }

}
