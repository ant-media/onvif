
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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Configuration for the Multicast Audio Decoder.
 *
 * <p>Java class for MulticastAudioDecoderConfiguration complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="MulticastAudioDecoderConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       <sequence>
 *         <element name="Enable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="AudioOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Bitrate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="SamplingRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastReceiverConfiguration"/>
 *         <element name="RTPPayloadType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MediaFormatParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SRTPPreSharedParameters" type="{http://www.onvif.org/ver10/schema}SRTPPreShared" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MulticastAudioDecoderConfiguration", propOrder = {
    "enable",
    "audioOutputToken",
    "encoding",
    "bitrate",
    "samplingRate",
    "multicast",
    "rtpPayloadType",
    "priority",
    "mediaFormatParameters",
    "srtpPreSharedParameters",
    "any"
})
public class MulticastAudioDecoderConfiguration
    extends ConfigurationEntity
{

    /**
     * Indicates whether the Multicast Audio Decoder is enabled or disabled.
     *
     */
    @XmlElement(name = "Enable")
    protected boolean enable;
    /**
     * Token of the physical Audio output. This element is optional and can occur multiple times.
     *
     */
    @XmlElement(name = "AudioOutputToken")
    protected List<String> audioOutputToken;
    /**
     * Specifies the encoding type according to IANA media types.
     *
     */
    @XmlElement(name = "Encoding", required = true)
    protected String encoding;
    /**
     * The bitrate of the audio stream in bits per second.
     *
     */
    @XmlElement(name = "Bitrate")
    protected int bitrate;
    /**
     * The sampling rate of the audio stream in kHz.
     *
     */
    @XmlElement(name = "SamplingRate")
    protected int samplingRate;
    /**
     * Contains configuration details for multicast settings.
     *
     */
    @XmlElement(name = "Multicast", required = true)
    protected MulticastReceiverConfiguration multicast;
    /**
     * Defines the RTP payload type used for the audio stream.
     * 							To ensure compatibility, it is recommended to use dynamic payload types (96 and above), as specified in RFC 3551.
     * 							Standard payload types (0-95) should only be used for predefined audio formats matching the audio encoding as defined in
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iana.org/assignments/rtp-parameters/rtp-parameters.xhtml#rtp-parameters-1"&gt;IANA RTP Payload Types&lt;/a&gt;
     * </pre>
     * ,
     * 							as using them for non-standard media may lead to unexpected errors or interoperability issues.
     *
     */
    @XmlElement(name = "RTPPayloadType")
    protected int rtpPayloadType;
    /**
     * Indicates the priority level when multiple configurations are active.
     * 								A higher value signifies a higher priority. If several configurations have the same priority value the order between those configurations is undefined.
     *
     */
    @XmlElement(name = "Priority")
    protected int priority;
    /**
     * Optional media format parameters as specified in SDP, such as:
     * 								a=fmtp:101 stereo=1; sprop-stereo=1.
     *
     */
    @XmlElement(name = "MediaFormatParameters")
    protected String mediaFormatParameters;
    /**
     * Optional configuration parameters for SRTP pre-shared key usage, applicable when SRTP is supported. When this configuration is present, RTP packets shall be encrypted.
     *
     */
    @XmlElement(name = "SRTPPreSharedParameters")
    protected SRTPPreShared srtpPreSharedParameters;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates whether the Multicast Audio Decoder is enabled or disabled.
     *
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     *
     */
    public void setEnable(boolean value) {
        this.enable = value;
    }

    /**
     * Token of the physical Audio output. This element is optional and can occur multiple times.
     *
     * Gets the value of the audioOutputToken property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioOutputToken property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAudioOutputToken().add(newItem);
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
     *     The value of the audioOutputToken property.
     */
    public List<String> getAudioOutputToken() {
        if (audioOutputToken == null) {
            audioOutputToken = new ArrayList<>();
        }
        return this.audioOutputToken;
    }

    /**
     * Specifies the encoding type according to IANA media types.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getEncoding()
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * The bitrate of the audio stream in bits per second.
     *
     */
    public int getBitrate() {
        return bitrate;
    }

    /**
     * Sets the value of the bitrate property.
     *
     */
    public void setBitrate(int value) {
        this.bitrate = value;
    }

    /**
     * The sampling rate of the audio stream in kHz.
     *
     */
    public int getSamplingRate() {
        return samplingRate;
    }

    /**
     * Sets the value of the samplingRate property.
     *
     */
    public void setSamplingRate(int value) {
        this.samplingRate = value;
    }

    /**
     * Contains configuration details for multicast settings.
     *
     * @return
     *     possible object is
     *     {@link MulticastReceiverConfiguration }
     *
     */
    public MulticastReceiverConfiguration getMulticast() {
        return multicast;
    }

    /**
     * Sets the value of the multicast property.
     *
     * @param value
     *     allowed object is
     *     {@link MulticastReceiverConfiguration }
     *
     * @see #getMulticast()
     */
    public void setMulticast(MulticastReceiverConfiguration value) {
        this.multicast = value;
    }

    /**
     * Defines the RTP payload type used for the audio stream.
     * 							To ensure compatibility, it is recommended to use dynamic payload types (96 and above), as specified in RFC 3551.
     * 							Standard payload types (0-95) should only be used for predefined audio formats matching the audio encoding as defined in
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iana.org/assignments/rtp-parameters/rtp-parameters.xhtml#rtp-parameters-1"&gt;IANA RTP Payload Types&lt;/a&gt;
     * </pre>
     * ,
     * 							as using them for non-standard media may lead to unexpected errors or interoperability issues.
     *
     */
    public int getRTPPayloadType() {
        return rtpPayloadType;
    }

    /**
     * Sets the value of the rtpPayloadType property.
     *
     */
    public void setRTPPayloadType(int value) {
        this.rtpPayloadType = value;
    }

    /**
     * Indicates the priority level when multiple configurations are active.
     * 								A higher value signifies a higher priority. If several configurations have the same priority value the order between those configurations is undefined.
     *
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     *
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Optional media format parameters as specified in SDP, such as:
     * 								a=fmtp:101 stereo=1; sprop-stereo=1.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMediaFormatParameters() {
        return mediaFormatParameters;
    }

    /**
     * Sets the value of the mediaFormatParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getMediaFormatParameters()
     */
    public void setMediaFormatParameters(String value) {
        this.mediaFormatParameters = value;
    }

    /**
     * Optional configuration parameters for SRTP pre-shared key usage, applicable when SRTP is supported. When this configuration is present, RTP packets shall be encrypted.
     *
     * @return
     *     possible object is
     *     {@link SRTPPreShared }
     *
     */
    public SRTPPreShared getSRTPPreSharedParameters() {
        return srtpPreSharedParameters;
    }

    /**
     * Sets the value of the srtpPreSharedParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link SRTPPreShared }
     *
     * @see #getSRTPPreSharedParameters()
     */
    public void setSRTPPreSharedParameters(SRTPPreShared value) {
        this.srtpPreSharedParameters = value;
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
