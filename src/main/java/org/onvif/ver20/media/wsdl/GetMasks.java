
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
 *         <element name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
 *         <element name="ConfigurationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
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
    "token",
    "configurationToken"
})
@XmlRootElement(name = "GetMasks")
public class GetMasks {

    /**
     * Optional mask token of an existing mask.
     *
     */
    @XmlElement(name = "Token")
    protected String token;
    /**
     * Optional token of a Video Source Configuration.
     *
     */
    @XmlElement(name = "ConfigurationToken")
    protected String configurationToken;

    /**
     * Optional mask token of an existing mask.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getToken()
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Optional token of a Video Source Configuration.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConfigurationToken() {
        return configurationToken;
    }

    /**
     * Sets the value of the configurationToken property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getConfigurationToken()
     */
    public void setConfigurationToken(String value) {
        this.configurationToken = value;
    }

}
