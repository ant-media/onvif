
package org.onvif.ver20.media.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Color;
import org.onvif.ver10.schema.Polygon;
import org.w3c.dom.Element;


/**
 * <p>Java class for Mask complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Mask">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConfigurationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Polygon" type="{http://www.onvif.org/ver10/schema}Polygon"/>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Color" type="{http://www.onvif.org/ver10/schema}Color" minOccurs="0"/>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="token" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mask", propOrder = {
    "configurationToken",
    "polygon",
    "type",
    "color",
    "enabled",
    "any"
})
public class Mask {

    /**
     * Token of the VideoSourceConfiguration the Mask is associated with.
     *
     */
    @XmlElement(name = "ConfigurationToken", required = true)
    protected String configurationToken;
    /**
     * Geometric representation of the mask area.
     *
     */
    @XmlElement(name = "Polygon", required = true)
    protected Polygon polygon;
    /**
     * Type of masking as defined by tr2:MaskType:
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
     * 								&lt;li&gt;Color - The masked area is colored with color defined by the Color field.&lt;/li&gt;
     * 								&lt;li&gt;Pixelated - The masked area is filled in mosaic style to hide details.&lt;/li&gt;
     * 								&lt;li&gt;Blurred - The masked area is low pass filtered to hide details.&lt;/li&gt;
     * 							&lt;/ul&gt;
     * </pre>
     *
     */
    @XmlElement(name = "Type", required = true)
    protected String type;
    /**
     * Color of the masked area.
     *
     */
    @XmlElement(name = "Color")
    protected Color color;
    /**
     * If set the mask will cover the image, otherwise it will be fully transparent.
     *
     */
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Token of the mask.
     *
     */
    @XmlAttribute(name = "token")
    protected String token;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Token of the VideoSourceConfiguration the Mask is associated with.
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
     * Geometric representation of the mask area.
     *
     * @return
     *     possible object is
     *     {@link Polygon }
     *
     */
    public Polygon getPolygon() {
        return polygon;
    }

    /**
     * Sets the value of the polygon property.
     *
     * @param value
     *     allowed object is
     *     {@link Polygon }
     *
     * @see #getPolygon()
     */
    public void setPolygon(Polygon value) {
        this.polygon = value;
    }

    /**
     * Type of masking as defined by tr2:MaskType:
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
     * 								&lt;li&gt;Color - The masked area is colored with color defined by the Color field.&lt;/li&gt;
     * 								&lt;li&gt;Pixelated - The masked area is filled in mosaic style to hide details.&lt;/li&gt;
     * 								&lt;li&gt;Blurred - The masked area is low pass filtered to hide details.&lt;/li&gt;
     * 							&lt;/ul&gt;
     * </pre>
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
     * Color of the masked area.
     *
     * @return
     *     possible object is
     *     {@link Color }
     *
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value
     *     allowed object is
     *     {@link Color }
     *
     * @see #getColor()
     */
    public void setColor(Color value) {
        this.color = value;
    }

    /**
     * If set the mask will cover the image, otherwise it will be fully transparent.
     *
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     *
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the any property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * </p>
     *
     *
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Token of the mask.
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
