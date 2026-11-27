
package org.onvif.ver20.imaging.wsdl;

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
 *         <element name="Preset" type="{http://www.onvif.org/ver20/imaging/wsdl}ImagingPreset" minOccurs="0"/>
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
@XmlRootElement(name = "GetCurrentPresetResponse")
public class GetCurrentPresetResponse {

    /**
     * Current Imaging Preset in use for the specified Video Source.
     *
     */
    @XmlElement(name = "Preset")
    protected ImagingPreset preset;

    /**
     * Current Imaging Preset in use for the specified Video Source.
     *
     * @return
     *     possible object is
     *     {@link ImagingPreset }
     *
     */
    public ImagingPreset getPreset() {
        return preset;
    }

    /**
     * Sets the value of the preset property.
     *
     * @param value
     *     allowed object is
     *     {@link ImagingPreset }
     *
     * @see #getPreset()
     */
    public void setPreset(ImagingPreset value) {
        this.preset = value;
    }

}
