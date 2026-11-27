
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.EQPreset;


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
 *         <element name="Configuration" type="{http://www.onvif.org/ver10/schema}EQPreset"/>
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
    "configuration"
})
@XmlRootElement(name = "SetEQPresetConfiguration")
public class SetEQPresetConfiguration {

    /**
     * Contains the modified EQ Preset configuration.
     *
     */
    @XmlElement(name = "Configuration", required = true)
    protected EQPreset configuration;

    /**
     * Contains the modified EQ Preset configuration.
     *
     * @return
     *     possible object is
     *     {@link EQPreset }
     *
     */
    public EQPreset getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     *
     * @param value
     *     allowed object is
     *     {@link EQPreset }
     *
     * @see #getConfiguration()
     */
    public void setConfiguration(EQPreset value) {
        this.configuration = value;
    }

}
