
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.VideoEncoder2Configuration;


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
 *         <element name="Configuration" type="{http://www.onvif.org/ver10/schema}VideoEncoder2Configuration"/>
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
@XmlRootElement(name = "SetVideoEncoderConfiguration")
public class SetVideoEncoderConfiguration {

    /**
     * Contains the modified video encoder configuration. The configuration shall exist in the device.
     *
     */
    @XmlElement(name = "Configuration", required = true)
    protected VideoEncoder2Configuration configuration;

    /**
     * Contains the modified video encoder configuration. The configuration shall exist in the device.
     *
     * @return
     *     possible object is
     *     {@link VideoEncoder2Configuration }
     *
     */
    public VideoEncoder2Configuration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     *
     * @param value
     *     allowed object is
     *     {@link VideoEncoder2Configuration }
     *
     * @see #getConfiguration()
     */
    public void setConfiguration(VideoEncoder2Configuration value) {
        this.configuration = value;
    }

}
