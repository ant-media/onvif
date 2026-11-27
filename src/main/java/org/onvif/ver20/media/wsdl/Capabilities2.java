
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
 * <p>Java class for Capabilities2 complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Capabilities2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProfileCapabilities" type="{http://www.onvif.org/ver20/media/wsdl}ProfileCapabilities"/>
 *         <element name="StreamingCapabilities" type="{http://www.onvif.org/ver20/media/wsdl}StreamingCapabilities"/>
 *         <element name="AudioClipCapabilities" type="{http://www.onvif.org/ver20/media/wsdl}AudioClipCapabilities" minOccurs="0"/>
 *         <element name="MulticastAudioDecoderCapabilities" type="{http://www.onvif.org/ver20/media/wsdl}MulticastAudioDecoderCapabilities" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="SnapshotUri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Rotation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="VideoSourceMode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="OSD" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TemporaryOSDText" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Mask" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SourceMask" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="WebRTC" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="WebRTC_codecs" type="{http://www.onvif.org/ver10/schema}StringList" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities2", propOrder = {
    "profileCapabilities",
    "streamingCapabilities",
    "audioClipCapabilities",
    "multicastAudioDecoderCapabilities",
    "any"
})
public class Capabilities2 {

    /**
     * Media profile capabilities.
     *
     */
    @XmlElement(name = "ProfileCapabilities", required = true)
    protected ProfileCapabilities profileCapabilities;
    /**
     * Streaming capabilities.
     *
     */
    @XmlElement(name = "StreamingCapabilities", required = true)
    protected StreamingCapabilities streamingCapabilities;
    /**
     * Audio clip capabilities.
     *
     */
    @XmlElement(name = "AudioClipCapabilities")
    protected AudioClipCapabilities audioClipCapabilities;
    /**
     * MulticastAudioDecoder capabilities.
     *
     */
    @XmlElement(name = "MulticastAudioDecoderCapabilities")
    protected MulticastAudioDecoderCapabilities multicastAudioDecoderCapabilities;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indicates if GetSnapshotUri is supported.
     *
     */
    @XmlAttribute(name = "SnapshotUri")
    protected Boolean snapshotUri;
    /**
     * Indicates whether or not Rotation feature is supported.
     *
     */
    @XmlAttribute(name = "Rotation")
    protected Boolean rotation;
    /**
     * Indicates the support for changing video source mode.
     *
     */
    @XmlAttribute(name = "VideoSourceMode")
    protected Boolean videoSourceMode;
    /**
     * Indicates if OSD is supported.
     *
     */
    @XmlAttribute(name = "OSD")
    protected Boolean osd;
    /**
     * Indicates the support for temporary osd text configuration.
     *
     */
    @XmlAttribute(name = "TemporaryOSDText")
    protected Boolean temporaryOSDText;
    /**
     * Indicates if Masking is supported.
     *
     */
    @XmlAttribute(name = "Mask")
    protected Boolean mask;
    /**
     * Indicates that privacy masks are only supported at the video source level and not the video source configuration level.
     * 							If this is true any addition, deletion or change of a privacy mask done for one video source configuration will automatically be
     * 							applied by the device to a corresponding privacy mask for all other video source configuration associated with the same video source.
     *
     */
    @XmlAttribute(name = "SourceMask")
    protected Boolean sourceMask;
    /**
     * Indicates number of supported WebRTC configurations.
     *
     */
    @XmlAttribute(name = "WebRTC")
    protected Integer webRTC;
    /**
     * List of supported video and audio media types as defined by IANA. E.g. "video/H264 audio/opus".
     *
     */
    @XmlAttribute(name = "WebRTC_codecs")
    protected List<String> webRTCCodecs;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Media profile capabilities.
     *
     * @return
     *     possible object is
     *     {@link ProfileCapabilities }
     *
     */
    public ProfileCapabilities getProfileCapabilities() {
        return profileCapabilities;
    }

    /**
     * Sets the value of the profileCapabilities property.
     *
     * @param value
     *     allowed object is
     *     {@link ProfileCapabilities }
     *
     * @see #getProfileCapabilities()
     */
    public void setProfileCapabilities(ProfileCapabilities value) {
        this.profileCapabilities = value;
    }

    /**
     * Streaming capabilities.
     *
     * @return
     *     possible object is
     *     {@link StreamingCapabilities }
     *
     */
    public StreamingCapabilities getStreamingCapabilities() {
        return streamingCapabilities;
    }

    /**
     * Sets the value of the streamingCapabilities property.
     *
     * @param value
     *     allowed object is
     *     {@link StreamingCapabilities }
     *
     * @see #getStreamingCapabilities()
     */
    public void setStreamingCapabilities(StreamingCapabilities value) {
        this.streamingCapabilities = value;
    }

    /**
     * Audio clip capabilities.
     *
     * @return
     *     possible object is
     *     {@link AudioClipCapabilities }
     *
     */
    public AudioClipCapabilities getAudioClipCapabilities() {
        return audioClipCapabilities;
    }

    /**
     * Sets the value of the audioClipCapabilities property.
     *
     * @param value
     *     allowed object is
     *     {@link AudioClipCapabilities }
     *
     * @see #getAudioClipCapabilities()
     */
    public void setAudioClipCapabilities(AudioClipCapabilities value) {
        this.audioClipCapabilities = value;
    }

    /**
     * MulticastAudioDecoder capabilities.
     *
     * @return
     *     possible object is
     *     {@link MulticastAudioDecoderCapabilities }
     *
     */
    public MulticastAudioDecoderCapabilities getMulticastAudioDecoderCapabilities() {
        return multicastAudioDecoderCapabilities;
    }

    /**
     * Sets the value of the multicastAudioDecoderCapabilities property.
     *
     * @param value
     *     allowed object is
     *     {@link MulticastAudioDecoderCapabilities }
     *
     * @see #getMulticastAudioDecoderCapabilities()
     */
    public void setMulticastAudioDecoderCapabilities(MulticastAudioDecoderCapabilities value) {
        this.multicastAudioDecoderCapabilities = value;
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
     * Indicates if GetSnapshotUri is supported.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSnapshotUri() {
        return snapshotUri;
    }

    /**
     * Sets the value of the snapshotUri property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isSnapshotUri()
     */
    public void setSnapshotUri(Boolean value) {
        this.snapshotUri = value;
    }

    /**
     * Indicates whether or not Rotation feature is supported.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isRotation()
     */
    public void setRotation(Boolean value) {
        this.rotation = value;
    }

    /**
     * Indicates the support for changing video source mode.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isVideoSourceMode() {
        return videoSourceMode;
    }

    /**
     * Sets the value of the videoSourceMode property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isVideoSourceMode()
     */
    public void setVideoSourceMode(Boolean value) {
        this.videoSourceMode = value;
    }

    /**
     * Indicates if OSD is supported.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isOSD() {
        return osd;
    }

    /**
     * Sets the value of the osd property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isOSD()
     */
    public void setOSD(Boolean value) {
        this.osd = value;
    }

    /**
     * Indicates the support for temporary osd text configuration.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isTemporaryOSDText() {
        return temporaryOSDText;
    }

    /**
     * Sets the value of the temporaryOSDText property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isTemporaryOSDText()
     */
    public void setTemporaryOSDText(Boolean value) {
        this.temporaryOSDText = value;
    }

    /**
     * Indicates if Masking is supported.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isMask()
     */
    public void setMask(Boolean value) {
        this.mask = value;
    }

    /**
     * Indicates that privacy masks are only supported at the video source level and not the video source configuration level.
     * 							If this is true any addition, deletion or change of a privacy mask done for one video source configuration will automatically be
     * 							applied by the device to a corresponding privacy mask for all other video source configuration associated with the same video source.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSourceMask() {
        return sourceMask;
    }

    /**
     * Sets the value of the sourceMask property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isSourceMask()
     */
    public void setSourceMask(Boolean value) {
        this.sourceMask = value;
    }

    /**
     * Indicates number of supported WebRTC configurations.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getWebRTC() {
        return webRTC;
    }

    /**
     * Sets the value of the webRTC property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getWebRTC()
     */
    public void setWebRTC(Integer value) {
        this.webRTC = value;
    }

    /**
     * List of supported video and audio media types as defined by IANA. E.g. "video/H264 audio/opus".
     *
     * Gets the value of the webRTCCodecs property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webRTCCodecs property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWebRTCCodecs().add(newItem);
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
     *     The value of the webRTCCodecs property.
     */
    public List<String> getWebRTCCodecs() {
        if (webRTCCodecs == null) {
            webRTCCodecs = new ArrayList<>();
        }
        return this.webRTCCodecs;
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
