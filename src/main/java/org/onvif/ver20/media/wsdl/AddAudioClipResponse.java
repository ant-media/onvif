
package org.onvif.ver20.media.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="UploadUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="ExpiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "uploadUri",
    "expiryTime"
})
@XmlRootElement(name = "AddAudioClipResponse")
public class AddAudioClipResponse {

    /**
     * Unique token of the audio clip to be uploaded.
     *
     */
    @XmlElement(name = "Token", required = true)
    protected String token;
    /**
     * A URL to which the audio clip can be uploaded.
     *
     */
    @XmlElement(name = "UploadUri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uploadUri;
    /**
     * Expiry time by which the client should upload the audio clip to the device.
     *
     */
    @XmlElement(name = "ExpiryTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryTime;

    /**
     * Unique token of the audio clip to be uploaded.
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
     * A URL to which the audio clip can be uploaded.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUploadUri() {
        return uploadUri;
    }

    /**
     * Sets the value of the uploadUri property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getUploadUri()
     */
    public void setUploadUri(String value) {
        this.uploadUri = value;
    }

    /**
     * Expiry time by which the client should upload the audio clip to the device.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     * @see #getExpiryTime()
     */
    public void setExpiryTime(XMLGregorianCalendar value) {
        this.expiryTime = value;
    }

}
