
package de.integrationsservice;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Auswahl der Rasterung eines Tilgungsplans.
 *
 * <p>Java class for RasterungTilgungsplan complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RasterungTilgungsplan">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="raster" type="{http://www.gillardon.de/marzipan/integrationsservice}Raster" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RasterungTilgungsplan", propOrder = {
        "raster"
})
public class RasterungTilgungsplan {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<Raster> raster;

    /**
     * Gets the value of the raster property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raster property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRaster().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Raster }
     * </p>
     *
     * @return The value of the raster property.
     */
    public List<Raster> getRaster() {
        if (raster == null) {
            raster = new ArrayList<>();
        }
        return this.raster;
    }

}
