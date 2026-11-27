
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for StreamingCapabilities complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="StreamingCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="RTSPStreaming" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RTPMulticast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RTP_RTSP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NonAggregateControl" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RTSPWebSocketUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="AutoStartMulticast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SecureRTSPStreaming" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamingCapabilities", propOrder = {
    "any"
})
public class StreamingCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indicates support for live media streaming via RTSP.
     *
     */
    @XmlAttribute(name = "RTSPStreaming")
    protected Boolean rtspStreaming;
    /**
     * Indicates support for RTP multicast.
     *
     */
    @XmlAttribute(name = "RTPMulticast")
    protected Boolean rtpMulticast;
    /**
     * Indicates support for RTP/RTSP/TCP.
     *
     */
    @XmlAttribute(name = "RTP_RTSP_TCP")
    protected Boolean rtprtsptcp;
    /**
     * Indicates support for non aggregate RTSP control.
     *
     */
    @XmlAttribute(name = "NonAggregateControl")
    protected Boolean nonAggregateControl;
    /**
     * If streaming over WebSocket is supported, this shall return the RTSP WebSocket URI as described in Streaming Specification Section 5.1.1.5.
     *
     */
    @XmlAttribute(name = "RTSPWebSocketUri")
    @XmlSchemaType(name = "anyURI")
    protected String rtspWebSocketUri;
    /**
     * Indicates support for non-RTSP controlled multicast streaming.
     *
     */
    @XmlAttribute(name = "AutoStartMulticast")
    protected Boolean autoStartMulticast;
    /**
     * Indicates support for live media streaming via RTSPS and SRTP.
     *
     */
    @XmlAttribute(name = "SecureRTSPStreaming")
    protected Boolean secureRTSPStreaming;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

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
     * Indicates support for live media streaming via RTSP.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRTSPStreaming() {
        return rtspStreaming;
    }

    /**
     * Sets the value of the rtspStreaming property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isRTSPStreaming()
     */
    public void setRTSPStreaming(Boolean value) {
        this.rtspStreaming = value;
    }

    /**
     * Indicates support for RTP multicast.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRTPMulticast() {
        return rtpMulticast;
    }

    /**
     * Sets the value of the rtpMulticast property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isRTPMulticast()
     */
    public void setRTPMulticast(Boolean value) {
        this.rtpMulticast = value;
    }

    /**
     * Indicates support for RTP/RTSP/TCP.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRTPRTSPTCP() {
        return rtprtsptcp;
    }

    /**
     * Sets the value of the rtprtsptcp property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isRTPRTSPTCP()
     */
    public void setRTPRTSPTCP(Boolean value) {
        this.rtprtsptcp = value;
    }

    /**
     * Indicates support for non aggregate RTSP control.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isNonAggregateControl() {
        return nonAggregateControl;
    }

    /**
     * Sets the value of the nonAggregateControl property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isNonAggregateControl()
     */
    public void setNonAggregateControl(Boolean value) {
        this.nonAggregateControl = value;
    }

    /**
     * If streaming over WebSocket is supported, this shall return the RTSP WebSocket URI as described in Streaming Specification Section 5.1.1.5.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRTSPWebSocketUri() {
        return rtspWebSocketUri;
    }

    /**
     * Sets the value of the rtspWebSocketUri property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getRTSPWebSocketUri()
     */
    public void setRTSPWebSocketUri(String value) {
        this.rtspWebSocketUri = value;
    }

    /**
     * Indicates support for non-RTSP controlled multicast streaming.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isAutoStartMulticast() {
        return autoStartMulticast;
    }

    /**
     * Sets the value of the autoStartMulticast property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isAutoStartMulticast()
     */
    public void setAutoStartMulticast(Boolean value) {
        this.autoStartMulticast = value;
    }

    /**
     * Indicates support for live media streaming via RTSPS and SRTP.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSecureRTSPStreaming() {
        return secureRTSPStreaming;
    }

    /**
     * Sets the value of the secureRTSPStreaming property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isSecureRTSPStreaming()
     */
    public void setSecureRTSPStreaming(Boolean value) {
        this.secureRTSPStreaming = value;
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
