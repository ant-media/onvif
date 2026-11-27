
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
import org.w3c.dom.Element;


/**
 * <p>Java class for TTSAudio complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="TTSAudio">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="VoiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "TTSAudio", propOrder = {
    "content",
    "language",
    "voiceType",
    "any"
})
public class TTSAudio {

    /**
     * Content of the audio clip.
     *
     */
    @XmlElement(name = "Content", required = true)
    protected String content;
    /**
     * The language that is supported by the device and used for TTS audio clip playback.
     *                              Uses ISO 639-1 alpha-2 language codes for definition, such as"en" for English. See
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.loc.gov/standards/iso639-2/php/English_list.php"&gt;Codes for the Representation of Names of Languages&lt;/a&gt;
     * </pre>
     * .
     *                              Optionally combined with ISO 3166-1 alpha-2 country codes using the "language-country" format to specify regional variations, such as"en-US" for American English. For country codes, see
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iso.org/obp/ui/#search/code/"&gt;ISO 3166-1 Country Codes&lt;/a&gt;
     * </pre>
     * .
     *
     */
    @XmlElement(name = "Language", required = true)
    protected String language;
    /**
     * The voice type that is supported by the device and used for TTS audio clip playback. See tr2: TTSVoiceType.
     *
     */
    @XmlElement(name = "VoiceType", required = true)
    protected String voiceType;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Content of the audio clip.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getContent()
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * The language that is supported by the device and used for TTS audio clip playback.
     *                              Uses ISO 639-1 alpha-2 language codes for definition, such as"en" for English. See
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.loc.gov/standards/iso639-2/php/English_list.php"&gt;Codes for the Representation of Names of Languages&lt;/a&gt;
     * </pre>
     * .
     *                              Optionally combined with ISO 3166-1 alpha-2 country codes using the "language-country" format to specify regional variations, such as"en-US" for American English. For country codes, see
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iso.org/obp/ui/#search/code/"&gt;ISO 3166-1 Country Codes&lt;/a&gt;
     * </pre>
     * .
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getLanguage()
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * The voice type that is supported by the device and used for TTS audio clip playback. See tr2: TTSVoiceType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVoiceType() {
        return voiceType;
    }

    /**
     * Sets the value of the voiceType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getVoiceType()
     */
    public void setVoiceType(String value) {
        this.voiceType = value;
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
