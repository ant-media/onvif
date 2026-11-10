
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
 *         <element name="Configuration" type="{http://www.onvif.org/ver20/media/wsdl}AudioClip"/>
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
    "configuration"
})
@XmlRootElement(name = "AddAudioClip")
public class AddAudioClip {

    /**
     * Optional token associated with the audio clip.
     *
     */
    @XmlElement(name = "Token")
    protected String token;
    /**
     * Audio clip configuration to add.
     *
     */
    @XmlElement(name = "Configuration", required = true)
    protected AudioClip configuration;

    /**
     * Optional token associated with the audio clip.
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
     * Audio clip configuration to add.
     *
     * @return
     *     possible object is
     *     {@link AudioClip }
     *
     */
    public AudioClip getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     *
     * @param value
     *     allowed object is
     *     {@link AudioClip }
     *
     * @see #getConfiguration()
     */
    public void setConfiguration(AudioClip value) {
        this.configuration = value;
    }

}
