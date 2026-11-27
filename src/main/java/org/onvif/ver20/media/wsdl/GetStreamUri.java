
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
 *         <element name="Protocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
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
    "protocol",
    "profileToken"
})
@XmlRootElement(name = "GetStreamUri")
public class GetStreamUri {

    /**
     * Defines the network protocol for streaming as defined by tr2:TransportProtocol
     *
     */
    @XmlElement(name = "Protocol", required = true)
    protected String protocol;
    /**
     * The ProfileToken element indicates the media profile to use and will define the configuration of the content of the stream.
     *
     */
    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;

    /**
     * Defines the network protocol for streaming as defined by tr2:TransportProtocol
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getProtocol()
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * The ProfileToken element indicates the media profile to use and will define the configuration of the content of the stream.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProfileToken() {
        return profileToken;
    }

    /**
     * Sets the value of the profileToken property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getProfileToken()
     */
    public void setProfileToken(String value) {
        this.profileToken = value;
    }

}
