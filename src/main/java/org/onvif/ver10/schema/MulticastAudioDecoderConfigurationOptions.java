
package org.onvif.ver10.schema;

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
import org.w3c.dom.Element;


/**
 * <p>Java class for MulticastAudioDecoderConfigurationOptions complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="MulticastAudioDecoderConfigurationOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EncodingOptions" type="{http://www.onvif.org/ver10/schema}AudioDecoder2Options"/>
 *         <element name="PriorityRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="AudioOutputTokens" type="{http://www.onvif.org/ver10/schema}StringList" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="SecureStreamingProtocolAlgorithms" type="{http://www.onvif.org/ver10/schema}StringList" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MulticastAudioDecoderConfigurationOptions", propOrder = {
    "encodingOptions",
    "priorityRange",
    "audioOutputTokens",
    "any"
})
public class MulticastAudioDecoderConfigurationOptions {

    /**
     * Supported encoding options for the multicast audio decoder.
     *
     */
    @XmlElement(name = "EncodingOptions", required = true)
    protected AudioDecoder2Options encodingOptions;
    /**
     * Specifies the priority range as an integer. This indicates the priority level for audio configuration.
     *
     */
    @XmlElement(name = "PriorityRange", required = true)
    protected IntRange priorityRange;
    /**
     * Optional list of physical Audio output tokens. This element is used when only certain audio outputs can be configured for this token.
     *
     */
    @XmlList
    @XmlElement(name = "AudioOutputTokens")
    protected List<String> audioOutputTokens;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * An optional parameter specifies the list of supported cryptographic algorithms when SRTP support is signaled as 'true' in the GetServiceCapabilitiesResponse.
     * 				Refer to tt:SrtpSecurityAlgorithms for the acceptable values.
     *
     */
    @XmlAttribute(name = "SecureStreamingProtocolAlgorithms")
    protected List<String> secureStreamingProtocolAlgorithms;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Supported encoding options for the multicast audio decoder.
     *
     * @return
     *     possible object is
     *     {@link AudioDecoder2Options }
     *
     */
    public AudioDecoder2Options getEncodingOptions() {
        return encodingOptions;
    }

    /**
     * Sets the value of the encodingOptions property.
     *
     * @param value
     *     allowed object is
     *     {@link AudioDecoder2Options }
     *
     * @see #getEncodingOptions()
     */
    public void setEncodingOptions(AudioDecoder2Options value) {
        this.encodingOptions = value;
    }

    /**
     * Specifies the priority range as an integer. This indicates the priority level for audio configuration.
     *
     * @return
     *     possible object is
     *     {@link IntRange }
     *
     */
    public IntRange getPriorityRange() {
        return priorityRange;
    }

    /**
     * Sets the value of the priorityRange property.
     *
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *
     * @see #getPriorityRange()
     */
    public void setPriorityRange(IntRange value) {
        this.priorityRange = value;
    }

    /**
     * Optional list of physical Audio output tokens. This element is used when only certain audio outputs can be configured for this token.
     *
     * Gets the value of the audioOutputTokens property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioOutputTokens property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAudioOutputTokens().add(newItem);
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
     *     The value of the audioOutputTokens property.
     */
    public List<String> getAudioOutputTokens() {
        if (audioOutputTokens == null) {
            audioOutputTokens = new ArrayList<>();
        }
        return this.audioOutputTokens;
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
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     *
     *
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * An optional parameter specifies the list of supported cryptographic algorithms when SRTP support is signaled as 'true' in the GetServiceCapabilitiesResponse.
     * 				Refer to tt:SrtpSecurityAlgorithms for the acceptable values.
     *
     * Gets the value of the secureStreamingProtocolAlgorithms property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secureStreamingProtocolAlgorithms property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSecureStreamingProtocolAlgorithms().add(newItem);
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
     *     The value of the secureStreamingProtocolAlgorithms property.
     */
    public List<String> getSecureStreamingProtocolAlgorithms() {
        if (secureStreamingProtocolAlgorithms == null) {
            secureStreamingProtocolAlgorithms = new ArrayList<>();
        }
        return this.secureStreamingProtocolAlgorithms;
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
