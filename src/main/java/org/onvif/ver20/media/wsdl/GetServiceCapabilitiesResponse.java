
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
 *         <element name="Capabilities" type="{http://www.onvif.org/ver20/media/wsdl}Capabilities2"/>
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
    "capabilities"
})
@XmlRootElement(name = "GetServiceCapabilitiesResponse")
public class GetServiceCapabilitiesResponse {

    /**
     * The capabilities for the media service is returned in the Capabilities element.
     *
     */
    @XmlElement(name = "Capabilities", required = true)
    protected Capabilities2 capabilities;

    /**
     * The capabilities for the media service is returned in the Capabilities element.
     *
     * @return
     *     possible object is
     *     {@link Capabilities2 }
     *
     */
    public Capabilities2 getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     *
     * @param value
     *     allowed object is
     *     {@link Capabilities2 }
     *
     * @see #getCapabilities()
     */
    public void setCapabilities(Capabilities2 value) {
        this.capabilities = value;
    }

}
