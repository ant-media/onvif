
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetConfiguration complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="GetConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConfigurationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
 *         <element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConfiguration", propOrder = {
    "configurationToken",
    "profileToken"
})
public class GetConfiguration {

    /**
     * Token of the requested configuration.
     *
     */
    @XmlElement(name = "ConfigurationToken")
    protected String configurationToken;
    /**
     * Contains the token of an existing media profile the configurations shall be compatible with.
     *
     */
    @XmlElement(name = "ProfileToken")
    protected String profileToken;

    /**
     * Token of the requested configuration.
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

    /**
     * Contains the token of an existing media profile the configurations shall be compatible with.
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
