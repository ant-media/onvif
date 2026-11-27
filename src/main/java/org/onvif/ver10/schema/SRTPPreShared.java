
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
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for SRTPPreShared complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="SRTPPreShared">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SRTPPSK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ROCExtMapID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="SecureStreamingProtocolAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SRTPPreShared", propOrder = {
    "srtppsk",
    "rocExtMapID",
    "any"
})
public class SRTPPreShared {

    /**
     * SRTP Pre-Shared Key (PSK) represented as a hexadecimal string.
     * 				This includes both the SRTP master key, followed by the master salt.
     * 				The sizes of the key and salt depend on the specified SecureStreamingProtocolAlgorithm.
     * 				When this element contains a non-empty value, RTP packets shall be encrypted.
     * 				The SRTPPSK shall be returned as an empty string on a get method.
     *
     */
    @XmlElement(name = "SRTPPSK", required = true)
    protected String srtppsk;
    /**
     * The RTP header extension ID (ExtMapID) used to identify the ROC extension, as defined in RFC 8285.
     * 				Valid values are 1 to 14 for one-byte header extensions.
     *
     */
    @XmlElement(name = "ROCExtMapID")
    protected int rocExtMapID;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Specifies the cryptographic algorithm when using SRTP,
     * 				selecting from predefined values provided in the GetMulticastAudioDecoderConfigurationOptions response.
     *
     */
    @XmlAttribute(name = "SecureStreamingProtocolAlgorithm")
    protected String secureStreamingProtocolAlgorithm;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * SRTP Pre-Shared Key (PSK) represented as a hexadecimal string.
     * 				This includes both the SRTP master key, followed by the master salt.
     * 				The sizes of the key and salt depend on the specified SecureStreamingProtocolAlgorithm.
     * 				When this element contains a non-empty value, RTP packets shall be encrypted.
     * 				The SRTPPSK shall be returned as an empty string on a get method.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRTPPSK() {
        return srtppsk;
    }

    /**
     * Sets the value of the srtppsk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getSRTPPSK()
     */
    public void setSRTPPSK(String value) {
        this.srtppsk = value;
    }

    /**
     * The RTP header extension ID (ExtMapID) used to identify the ROC extension, as defined in RFC 8285.
     * 				Valid values are 1 to 14 for one-byte header extensions.
     *
     */
    public int getROCExtMapID() {
        return rocExtMapID;
    }

    /**
     * Sets the value of the rocExtMapID property.
     *
     */
    public void setROCExtMapID(int value) {
        this.rocExtMapID = value;
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
     * Specifies the cryptographic algorithm when using SRTP,
     * 				selecting from predefined values provided in the GetMulticastAudioDecoderConfigurationOptions response.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSecureStreamingProtocolAlgorithm() {
        return secureStreamingProtocolAlgorithm;
    }

    /**
     * Sets the value of the secureStreamingProtocolAlgorithm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getSecureStreamingProtocolAlgorithm()
     */
    public void setSecureStreamingProtocolAlgorithm(String value) {
        this.secureStreamingProtocolAlgorithm = value;
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
