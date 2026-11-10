
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
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.VideoResolution;
import org.w3c.dom.Element;


/**
 * <p>Java class for VideoSourceMode complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="VideoSourceMode">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaxFramerate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MaxResolution" type="{http://www.onvif.org/ver10/schema}VideoResolution"/>
 *         <element name="Encodings" type="{http://www.onvif.org/ver10/schema}StringList"/>
 *         <element name="Reboot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Description" type="{http://www.onvif.org/ver10/schema}Description" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       <attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceMode", propOrder = {
    "maxFramerate",
    "maxResolution",
    "encodings",
    "reboot",
    "description",
    "any"
})
public class VideoSourceMode {

    /**
     * Max frame rate in frames per second for this video source mode.
     *
     */
    @XmlElement(name = "MaxFramerate")
    protected float maxFramerate;
    /**
     * Max horizontal and vertical resolution for this video source mode.
     *
     */
    @XmlElement(name = "MaxResolution", required = true)
    protected VideoResolution maxResolution;
    /**
     * List of one or more encodings supported for this video source.  For name definitions see tt:VideoEncodingMimeNames, and see
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iana.org/assignments/media-types/media-types.xhtml#video"&gt;IANA Media Types&lt;/a&gt;
     * </pre>
     * .
     *
     */
    @XmlList
    @XmlElement(name = "Encodings", required = true)
    protected List<String> encodings;
    /**
     * After setting the mode if a device starts to reboot this value is true. If a device change the mode without rebooting this value is false. If true, configured parameters may not be guaranteed by the device after rebooting.
     *
     */
    @XmlElement(name = "Reboot")
    protected boolean reboot;
    /**
     * Informative description of this video source mode. This field should be described in English.
     *
     */
    @XmlElement(name = "Description")
    protected String description;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indicate token for video source mode.
     *
     */
    @XmlAttribute(name = "token", required = true)
    protected String token;
    /**
     * Indication of whether this mode is active. If active this value is true. In case of non-indication, it means as false. The value of true shall be had by only one video source mode.
     *
     */
    @XmlAttribute(name = "Enabled")
    protected Boolean enabled;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Max frame rate in frames per second for this video source mode.
     *
     */
    public float getMaxFramerate() {
        return maxFramerate;
    }

    /**
     * Sets the value of the maxFramerate property.
     *
     */
    public void setMaxFramerate(float value) {
        this.maxFramerate = value;
    }

    /**
     * Max horizontal and vertical resolution for this video source mode.
     *
     * @return
     *     possible object is
     *     {@link VideoResolution }
     *
     */
    public VideoResolution getMaxResolution() {
        return maxResolution;
    }

    /**
     * Sets the value of the maxResolution property.
     *
     * @param value
     *     allowed object is
     *     {@link VideoResolution }
     *
     * @see #getMaxResolution()
     */
    public void setMaxResolution(VideoResolution value) {
        this.maxResolution = value;
    }

    /**
     * List of one or more encodings supported for this video source.  For name definitions see tt:VideoEncodingMimeNames, and see
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iana.org/assignments/media-types/media-types.xhtml#video"&gt;IANA Media Types&lt;/a&gt;
     * </pre>
     * .
     *
     * Gets the value of the encodings property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encodings property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEncodings().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     *
     * @return
     *     The value of the encodings property.
     */
    public List<String> getEncodings() {
        if (encodings == null) {
            encodings = new ArrayList<>();
        }
        return this.encodings;
    }

    /**
     * After setting the mode if a device starts to reboot this value is true. If a device change the mode without rebooting this value is false. If true, configured parameters may not be guaranteed by the device after rebooting.
     *
     */
    public boolean isReboot() {
        return reboot;
    }

    /**
     * Sets the value of the reboot property.
     *
     */
    public void setReboot(boolean value) {
        this.reboot = value;
    }

    /**
     * Informative description of this video source mode. This field should be described in English.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Indicate token for video source mode.
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
     * Indication of whether this mode is active. If active this value is true. In case of non-indication, it means as false. The value of true shall be had by only one video source mode.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isEnabled()
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
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
