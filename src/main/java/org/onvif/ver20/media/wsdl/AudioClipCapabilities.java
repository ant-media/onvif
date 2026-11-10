
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
import org.w3c.dom.Element;


/**
 * <p>Java class for AudioClipCapabilities complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AudioClipCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TTSCapabilities" type="{http://www.onvif.org/ver20/media/wsdl}TTSCapabilities" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="MaxAudioClipLimit" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="MaxAudioClipSize" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="SupportedAudioClipFormat" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioClipCapabilities", propOrder = {
    "ttsCapabilities",
    "any"
})
public class AudioClipCapabilities {

    /**
     * Indicates device has TTS capability.
     *
     */
    @XmlElement(name = "TTSCapabilities")
    protected TTSCapabilities ttsCapabilities;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indicates the maximum number of audio clips that can be uploaded to the device.
     *
     */
    @XmlAttribute(name = "MaxAudioClipLimit")
    protected Integer maxAudioClipLimit;
    /**
     * Indicates the maximum size of the audio clip that can be uploaded, in KB.
     *
     */
    @XmlAttribute(name = "MaxAudioClipSize")
    protected Float maxAudioClipSize;
    /**
     * Enumerates the supported audio clip formats. See tr2: SupportedAudioClipFormat.
     *
     */
    @XmlAttribute(name = "SupportedAudioClipFormat")
    protected List<String> supportedAudioClipFormat;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates device has TTS capability.
     *
     * @return
     *     possible object is
     *     {@link TTSCapabilities }
     *
     */
    public TTSCapabilities getTTSCapabilities() {
        return ttsCapabilities;
    }

    /**
     * Sets the value of the ttsCapabilities property.
     *
     * @param value
     *     allowed object is
     *     {@link TTSCapabilities }
     *
     * @see #getTTSCapabilities()
     */
    public void setTTSCapabilities(TTSCapabilities value) {
        this.ttsCapabilities = value;
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
     * Indicates the maximum number of audio clips that can be uploaded to the device.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMaxAudioClipLimit() {
        return maxAudioClipLimit;
    }

    /**
     * Sets the value of the maxAudioClipLimit property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getMaxAudioClipLimit()
     */
    public void setMaxAudioClipLimit(Integer value) {
        this.maxAudioClipLimit = value;
    }

    /**
     * Indicates the maximum size of the audio clip that can be uploaded, in KB.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getMaxAudioClipSize() {
        return maxAudioClipSize;
    }

    /**
     * Sets the value of the maxAudioClipSize property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getMaxAudioClipSize()
     */
    public void setMaxAudioClipSize(Float value) {
        this.maxAudioClipSize = value;
    }

    /**
     * Enumerates the supported audio clip formats. See tr2: SupportedAudioClipFormat.
     *
     * Gets the value of the supportedAudioClipFormat property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedAudioClipFormat property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedAudioClipFormat().add(newItem);
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
     *     The value of the supportedAudioClipFormat property.
     */
    public List<String> getSupportedAudioClipFormat() {
        if (supportedAudioClipFormat == null) {
            supportedAudioClipFormat = new ArrayList<>();
        }
        return this.supportedAudioClipFormat;
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
