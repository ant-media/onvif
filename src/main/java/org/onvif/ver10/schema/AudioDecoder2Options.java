
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
 * <p>Java class for AudioDecoder2Options complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AudioDecoder2Options">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="BitrateList" type="{http://www.onvif.org/ver10/schema}IntItems"/>
 *         <element name="SampleRateList" type="{http://www.onvif.org/ver10/schema}IntItems"/>
 *         <element name="RTPPayloadType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "AudioDecoder2Options", propOrder = {
    "encoding",
    "bitrateList",
    "sampleRateList",
    "rtpPayloadType",
    "any"
})
public class AudioDecoder2Options {

    /**
     * Audio Media Subtype for the audio format. For definitions see tt:AudioEncodingMimeNames and
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iana.org/assignments/media-types/media-types.xhtml#audio"&gt; IANA Media Types&lt;/a&gt;
     * </pre>
     * .
     *
     */
    @XmlElement(name = "Encoding", required = true)
    protected String encoding;
    /**
     * List of supported bitrates in kbps for the specified Encoding.
     *
     */
    @XmlElement(name = "BitrateList", required = true)
    protected IntItems bitrateList;
    /**
     * List of supported Sample Rates in kHz for the specified Encoding
     *
     */
    @XmlElement(name = "SampleRateList", required = true)
    protected IntItems sampleRateList;
    /**
     * Optional element for specifying the RTP payload type,
     * 						particularly when it is fixed for a specific audio encoding as defined in
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iana.org/assignments/rtp-parameters/rtp-parameters.xhtml#rtp-parameters-1"&gt;IANA RTP Payload Types&lt;/a&gt;
     * </pre>
     * .
     *
     */
    @XmlElement(name = "RTPPayloadType")
    protected Integer rtpPayloadType;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Audio Media Subtype for the audio format. For definitions see tt:AudioEncodingMimeNames and
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iana.org/assignments/media-types/media-types.xhtml#audio"&gt; IANA Media Types&lt;/a&gt;
     * </pre>
     * .
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
     * List of supported bitrates in kbps for the specified Encoding.
     *
     * @return
     *     possible object is
     *     {@link IntItems }
     *
     */
    public IntItems getBitrateList() {
        return bitrateList;
    }

    /**
     * Sets the value of the bitrateList property.
     *
     * @param value
     *     allowed object is
     *     {@link IntItems }
     *
     * @see #getBitrateList()
     */
    public void setBitrateList(IntItems value) {
        this.bitrateList = value;
    }

    /**
     * List of supported Sample Rates in kHz for the specified Encoding
     *
     * @return
     *     possible object is
     *     {@link IntItems }
     *
     */
    public IntItems getSampleRateList() {
        return sampleRateList;
    }

    /**
     * Sets the value of the sampleRateList property.
     *
     * @param value
     *     allowed object is
     *     {@link IntItems }
     *
     * @see #getSampleRateList()
     */
    public void setSampleRateList(IntItems value) {
        this.sampleRateList = value;
    }

    /**
     * Optional element for specifying the RTP payload type,
     * 						particularly when it is fixed for a specific audio encoding as defined in
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iana.org/assignments/rtp-parameters/rtp-parameters.xhtml#rtp-parameters-1"&gt;IANA RTP Payload Types&lt;/a&gt;
     * </pre>
     * .
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getRTPPayloadType() {
        return rtpPayloadType;
    }

    /**
     * Sets the value of the rtpPayloadType property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getRTPPayloadType()
     */
    public void setRTPPayloadType(Integer value) {
        this.rtpPayloadType = value;
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
