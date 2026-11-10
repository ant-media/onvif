
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
 *         <element name="Name" type="{http://www.onvif.org/ver10/schema}Name" minOccurs="0"/>
 *         <element name="Configuration" type="{http://www.onvif.org/ver20/media/wsdl}ConfigurationRef" maxOccurs="unbounded" minOccurs="0"/>
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
    "name",
    "configuration"
})
@XmlRootElement(name = "AddConfiguration")
public class AddConfiguration {

    /**
     * Reference to the profile where the configuration should be added
     *
     */
    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;
    /**
     * Optional item. If present updates the Name property of the profile.
     *
     */
    @XmlElement(name = "Name")
    protected String name;
    /**
     * List of configurations to be added. The types shall be provided in the order defined by tr2:ConfigurationEnumeration. List entries with tr2:ConfigurationEnumeration value "All" shall be ignored.
     *
     */
    @XmlElement(name = "Configuration")
    protected List<ConfigurationRef> configuration;

    /**
     * Reference to the profile where the configuration should be added
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
     * Optional item. If present updates the Name property of the profile.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * List of configurations to be added. The types shall be provided in the order defined by tr2:ConfigurationEnumeration. List entries with tr2:ConfigurationEnumeration value "All" shall be ignored.
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
