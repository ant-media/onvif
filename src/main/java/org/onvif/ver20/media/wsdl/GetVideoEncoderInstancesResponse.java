
package org.onvif.ver20.media.wsdl;

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
 *         <element name="Info" type="{http://www.onvif.org/ver20/media/wsdl}EncoderInstanceInfo"/>
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
    "info"
})
@XmlRootElement(name = "GetVideoEncoderInstancesResponse")
public class GetVideoEncoderInstancesResponse {

    /**
     * The minimum guaranteed total number of encoder instances (applications) per VideoSourceConfiguration.
     *
     */
    @XmlElement(name = "Info", required = true)
    protected EncoderInstanceInfo info;

    /**
     * The minimum guaranteed total number of encoder instances (applications) per VideoSourceConfiguration.
     *
     * @return
     *     possible object is
     *     {@link EncoderInstanceInfo }
     *
     */
    public EncoderInstanceInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     *
     * @param value
     *     allowed object is
     *     {@link EncoderInstanceInfo }
     *
     * @see #getInfo()
     */
    public void setInfo(EncoderInstanceInfo value) {
        this.info = value;
    }

}
