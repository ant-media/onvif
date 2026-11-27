
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationRef complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ConfigurationRef">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationRef", propOrder = {
    "type",
    "token"
})
public class ConfigurationRef {

    /**
     * Type of the configuration as defined by tr2:ConfigurationEnumeration.
     *
     */
    @XmlElement(name = "Type", required = true)
    protected String type;
    /**
     * Reference token of an existing configuration.
     * 							Token shall be included in the AddConfiguration request along with the type.
     * 							Token shall be included in the CreateProfile request when Configuration elements are included and type is selected.
     * 							Token is optional for RemoveConfiguration request. If no token is provided in RemoveConfiguration request, device shall
     * 							remove the configuration of the type included in the profile.
     *
     */
    @XmlElement(name = "Token")
    protected String token;

    /**
     * Type of the configuration as defined by tr2:ConfigurationEnumeration.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Reference token of an existing configuration.
     * 							Token shall be included in the AddConfiguration request along with the type.
     * 							Token shall be included in the CreateProfile request when Configuration elements are included and type is selected.
     * 							Token is optional for RemoveConfiguration request. If no token is provided in RemoveConfiguration request, device shall
     * 							remove the configuration of the type included in the profile.
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

}
