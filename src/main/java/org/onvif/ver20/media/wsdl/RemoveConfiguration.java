
package org.onvif.ver20.media.wsdl;

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
 *         <element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Configuration" type="{http://www.onvif.org/ver20/media/wsdl}ConfigurationRef" maxOccurs="unbounded"/>
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
    "profileToken",
    "configuration"
})
@XmlRootElement(name = "RemoveConfiguration")
public class RemoveConfiguration {

    /**
     * This element contains a  reference to the media profile from which the configuration shall be removed.
     *
     */
    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;
    /**
     * List of configurations to be removed. The types shall be provided in the order defined by tr2:ConfigurationEnumeration. Tokens appearing in the configuration list shall be ignored. Presence of the "All" type shall result in an empty profile.
     *
     */
    @XmlElement(name = "Configuration", required = true)
    protected List<ConfigurationRef> configuration;

    /**
     * This element contains a  reference to the media profile from which the configuration shall be removed.
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

    /**
     * List of configurations to be removed. The types shall be provided in the order defined by tr2:ConfigurationEnumeration. Tokens appearing in the configuration list shall be ignored. Presence of the "All" type shall result in an empty profile.
     *
     * Gets the value of the configuration property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuration property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfiguration().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurationRef }
     * </p>
     *
     *
     * @return
     *     The value of the configuration property.
     */
    public List<ConfigurationRef> getConfiguration() {
        if (configuration == null) {
            configuration = new ArrayList<>();
        }
        return this.configuration;
    }

}
