
package org.onvif.ver20.media.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A media profile consists of a set of media configurations.
 *
 * <p>Java class for MediaProfile complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="MediaProfile">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://www.onvif.org/ver10/schema}Name"/>
 *         <element name="Configurations" type="{http://www.onvif.org/ver20/media/wsdl}ConfigurationSet" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       <attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaProfile", propOrder = {
    "name",
    "configurations"
})
public class MediaProfile {

    /**
     * User readable name of the profile.
     *
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * The configurations assigned to the profile.
     *
     */
    @XmlElement(name = "Configurations")
    protected ConfigurationSet configurations;
    /**
     * Unique identifier of the profile.
     *
     */
    @XmlAttribute(name = "token", required = true)
    protected String token;
    /**
     * A value of true signals that the profile cannot be deleted. Default is false.
     *
     */
    @XmlAttribute(name = "fixed")
    protected Boolean fixed;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * User readable name of the profile.
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
     * The configurations assigned to the profile.
     *
     * @return
     *     possible object is
     *     {@link ConfigurationSet }
     *
     */
    public ConfigurationSet getConfigurations() {
        return configurations;
    }

    /**
     * Sets the value of the configurations property.
     *
     * @param value
     *     allowed object is
     *     {@link ConfigurationSet }
     *
     * @see #getConfigurations()
     */
    public void setConfigurations(ConfigurationSet value) {
        this.configurations = value;
    }

    /**
     * Unique identifier of the profile.
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
     * A value of true signals that the profile cannot be deleted. Default is false.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isFixed() {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isFixed()
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     *
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     *
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
