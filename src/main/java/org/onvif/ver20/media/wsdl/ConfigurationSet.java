
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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.AudioDecoderConfiguration;
import org.onvif.ver10.schema.AudioEncoder2Configuration;
import org.onvif.ver10.schema.AudioOutputConfiguration;
import org.onvif.ver10.schema.AudioSourceConfiguration;
import org.onvif.ver10.schema.MetadataConfiguration;
import org.onvif.ver10.schema.PTZConfiguration;
import org.onvif.ver10.schema.VideoAnalyticsConfiguration;
import org.onvif.ver10.schema.VideoEncoder2Configuration;
import org.onvif.ver10.schema.VideoSourceConfiguration;
import org.w3c.dom.Element;


/**
 * A set of media configurations.
 *
 * <p>Java class for ConfigurationSet complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ConfigurationSet">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VideoSource" type="{http://www.onvif.org/ver10/schema}VideoSourceConfiguration" minOccurs="0"/>
 *         <element name="AudioSource" type="{http://www.onvif.org/ver10/schema}AudioSourceConfiguration" minOccurs="0"/>
 *         <element name="VideoEncoder" type="{http://www.onvif.org/ver10/schema}VideoEncoder2Configuration" minOccurs="0"/>
 *         <element name="AudioEncoder" type="{http://www.onvif.org/ver10/schema}AudioEncoder2Configuration" minOccurs="0"/>
 *         <element name="Analytics" type="{http://www.onvif.org/ver10/schema}VideoAnalyticsConfiguration" minOccurs="0"/>
 *         <element name="PTZ" type="{http://www.onvif.org/ver10/schema}PTZConfiguration" minOccurs="0"/>
 *         <element name="Metadata" type="{http://www.onvif.org/ver10/schema}MetadataConfiguration" minOccurs="0"/>
 *         <element name="AudioOutput" type="{http://www.onvif.org/ver10/schema}AudioOutputConfiguration" minOccurs="0"/>
 *         <element name="AudioDecoder" type="{http://www.onvif.org/ver10/schema}AudioDecoderConfiguration" minOccurs="0"/>
 *         <element name="Receiver" type="{http://www.onvif.org/ver20/media/wsdl}ReceiverConfiguration" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationSet", propOrder = {
    "videoSource",
    "audioSource",
    "videoEncoder",
    "audioEncoder",
    "analytics",
    "ptz",
    "metadata",
    "audioOutput",
    "audioDecoder",
    "receiver",
    "any"
})
public class ConfigurationSet {

    /**
     * Optional configuration of the Video input.
     *
     */
    @XmlElement(name = "VideoSource")
    protected VideoSourceConfiguration videoSource;
    /**
     * Optional configuration of the Audio input.
     *
     */
    @XmlElement(name = "AudioSource")
    protected AudioSourceConfiguration audioSource;
    /**
     * Optional configuration of the Video encoder.
     *
     */
    @XmlElement(name = "VideoEncoder")
    protected VideoEncoder2Configuration videoEncoder;
    /**
     * Optional configuration of the Audio encoder.
     *
     */
    @XmlElement(name = "AudioEncoder")
    protected AudioEncoder2Configuration audioEncoder;
    /**
     * Optional configuration of the analytics module and rule engine.
     *
     */
    @XmlElement(name = "Analytics")
    protected VideoAnalyticsConfiguration analytics;
    /**
     * Optional configuration of the pan tilt zoom unit.
     *
     */
    @XmlElement(name = "PTZ")
    protected PTZConfiguration ptz;
    /**
     * Optional configuration of the metadata stream.
     *
     */
    @XmlElement(name = "Metadata")
    protected MetadataConfiguration metadata;
    /**
     * Optional configuration of the Audio output.
     *
     */
    @XmlElement(name = "AudioOutput")
    protected AudioOutputConfiguration audioOutput;
    /**
     * Optional configuration of the Audio decoder.
     *
     */
    @XmlElement(name = "AudioDecoder")
    protected AudioDecoderConfiguration audioDecoder;
    /**
     * Optional configuration of the Receiver.
     *
     */
    @XmlElement(name = "Receiver")
    protected ReceiverConfiguration receiver;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Optional configuration of the Video input.
     *
     * @return
     *     possible object is
     *     {@link VideoSourceConfiguration }
     *
     */
    public VideoSourceConfiguration getVideoSource() {
        return videoSource;
    }

    /**
     * Sets the value of the videoSource property.
     *
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfiguration }
     *
     * @see #getVideoSource()
     */
    public void setVideoSource(VideoSourceConfiguration value) {
        this.videoSource = value;
    }

    /**
     * Optional configuration of the Audio input.
     *
     * @return
     *     possible object is
     *     {@link AudioSourceConfiguration }
     *
     */
    public AudioSourceConfiguration getAudioSource() {
        return audioSource;
    }

    /**
     * Sets the value of the audioSource property.
     *
     * @param value
     *     allowed object is
     *     {@link AudioSourceConfiguration }
     *
     * @see #getAudioSource()
     */
    public void setAudioSource(AudioSourceConfiguration value) {
        this.audioSource = value;
    }

    /**
     * Optional configuration of the Video encoder.
     *
     * @return
     *     possible object is
     *     {@link VideoEncoder2Configuration }
     *
     */
    public VideoEncoder2Configuration getVideoEncoder() {
        return videoEncoder;
    }

    /**
     * Sets the value of the videoEncoder property.
     *
     * @param value
     *     allowed object is
     *     {@link VideoEncoder2Configuration }
     *
     * @see #getVideoEncoder()
     */
    public void setVideoEncoder(VideoEncoder2Configuration value) {
        this.videoEncoder = value;
    }

    /**
     * Optional configuration of the Audio encoder.
     *
     * @return
     *     possible object is
     *     {@link AudioEncoder2Configuration }
     *
     */
    public AudioEncoder2Configuration getAudioEncoder() {
        return audioEncoder;
    }

    /**
     * Sets the value of the audioEncoder property.
     *
     * @param value
     *     allowed object is
     *     {@link AudioEncoder2Configuration }
     *
     * @see #getAudioEncoder()
     */
    public void setAudioEncoder(AudioEncoder2Configuration value) {
        this.audioEncoder = value;
    }

    /**
     * Optional configuration of the analytics module and rule engine.
     *
     * @return
     *     possible object is
     *     {@link VideoAnalyticsConfiguration }
     *
     */
    public VideoAnalyticsConfiguration getAnalytics() {
        return analytics;
    }

    /**
     * Sets the value of the analytics property.
     *
     * @param value
     *     allowed object is
     *     {@link VideoAnalyticsConfiguration }
     *
     * @see #getAnalytics()
     */
    public void setAnalytics(VideoAnalyticsConfiguration value) {
        this.analytics = value;
    }

    /**
     * Optional configuration of the pan tilt zoom unit.
     *
     * @return
     *     possible object is
     *     {@link PTZConfiguration }
     *
     */
    public PTZConfiguration getPTZ() {
        return ptz;
    }

    /**
     * Sets the value of the ptz property.
     *
     * @param value
     *     allowed object is
     *     {@link PTZConfiguration }
     *
     * @see #getPTZ()
     */
    public void setPTZ(PTZConfiguration value) {
        this.ptz = value;
    }

    /**
     * Optional configuration of the metadata stream.
     *
     * @return
     *     possible object is
     *     {@link MetadataConfiguration }
     *
     */
    public MetadataConfiguration getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     *
     * @param value
     *     allowed object is
     *     {@link MetadataConfiguration }
     *
     * @see #getMetadata()
     */
    public void setMetadata(MetadataConfiguration value) {
        this.metadata = value;
    }

    /**
     * Optional configuration of the Audio output.
     *
     * @return
     *     possible object is
     *     {@link AudioOutputConfiguration }
     *
     */
    public AudioOutputConfiguration getAudioOutput() {
        return audioOutput;
    }

    /**
     * Sets the value of the audioOutput property.
     *
     * @param value
     *     allowed object is
     *     {@link AudioOutputConfiguration }
     *
     * @see #getAudioOutput()
     */
    public void setAudioOutput(AudioOutputConfiguration value) {
        this.audioOutput = value;
    }

    /**
     * Optional configuration of the Audio decoder.
     *
     * @return
     *     possible object is
     *     {@link AudioDecoderConfiguration }
     *
     */
    public AudioDecoderConfiguration getAudioDecoder() {
        return audioDecoder;
    }

    /**
     * Sets the value of the audioDecoder property.
     *
     * @param value
     *     allowed object is
     *     {@link AudioDecoderConfiguration }
     *
     * @see #getAudioDecoder()
     */
    public void setAudioDecoder(AudioDecoderConfiguration value) {
        this.audioDecoder = value;
    }

    /**
     * Optional configuration of the Receiver.
     *
     * @return
     *     possible object is
     *     {@link ReceiverConfiguration }
     *
     */
    public ReceiverConfiguration getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     *
     * @param value
     *     allowed object is
     *     {@link ReceiverConfiguration }
     *
     * @see #getReceiver()
     */
    public void setReceiver(ReceiverConfiguration value) {
        this.receiver = value;
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
