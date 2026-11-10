
package org.onvif.ver20.imaging.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Preset" type="{http://www.onvif.org/ver20/imaging/wsdl}ImagingPreset" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "preset"
})
@XmlRootElement(name = "GetPresetsResponse")
public class GetPresetsResponse {

    /**
     * List of Imaging Presets which are available for the requested VideoSource.
     *
     */
    @XmlElement(name = "Preset", required = true)
    protected List<ImagingPreset> preset;

    /**
     * List of Imaging Presets which are available for the requested VideoSource.
     *
     * Gets the value of the preset property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preset property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPreset().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagingPreset }
     * </p>
     *
     *
     * @return
     *     The value of the preset property.
     */
    public List<ImagingPreset> getPreset() {
        if (preset == null) {
            preset = new ArrayList<>();
        }
        return this.preset;
    }

}
