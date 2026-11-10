
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
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for TTSCapabilities complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="TTSCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="MaxContentLength" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="TTSLanguage" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <attribute name="TTSVoiceType" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTSCapabilities", propOrder = {
    "any"
})
public class TTSCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indicates the maximum length of content of a text for device to convert to an audio clip.
     *
     */
    @XmlAttribute(name = "MaxContentLength")
    protected Integer maxContentLength;
    /**
     * List of supported languages. Uses ISO 639-1 alpha-2 language codes, such as"en" for English. See
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.loc.gov/standards/iso639-2/php/English_list.php"&gt;Codes for the Representation of Names of Languages&lt;/a&gt;
     * </pre>
     * .
     *                             Optionally combined with ISO 3166-1 alpha-2 country codes using the "language-country" format to specify regional variations, such as"en-US" for American English. For country codes, see
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iso.org/obp/ui/#search/code/"&gt;ISO 3166-1 Country Codes&lt;/a&gt;
     * </pre>
     * .
     *
     */
    @XmlAttribute(name = "TTSLanguage")
    protected List<String> ttsLanguage;
    /**
     * List of supported voice types. See tr2: TTSVoiceType.
     *
     */
    @XmlAttribute(name = "TTSVoiceType")
    protected List<String> ttsVoiceType;
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
     * Indicates the maximum length of content of a text for device to convert to an audio clip.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMaxContentLength() {
        return maxContentLength;
    }

    /**
     * Sets the value of the maxContentLength property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getMaxContentLength()
     */
    public void setMaxContentLength(Integer value) {
        this.maxContentLength = value;
    }

    /**
     * List of supported languages. Uses ISO 639-1 alpha-2 language codes, such as"en" for English. See
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.loc.gov/standards/iso639-2/php/English_list.php"&gt;Codes for the Representation of Names of Languages&lt;/a&gt;
     * </pre>
     * .
     *                             Optionally combined with ISO 3166-1 alpha-2 country codes using the "language-country" format to specify regional variations, such as"en-US" for American English. For country codes, see
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tr2="http://www.onvif.org/ver20/media/wsdl" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iso.org/obp/ui/#search/code/"&gt;ISO 3166-1 Country Codes&lt;/a&gt;
     * </pre>
     * .
     *
     * Gets the value of the ttsLanguage property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttsLanguage property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTTSLanguage().add(newItem);
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
     *     The value of the ttsLanguage property.
     */
    public List<String> getTTSLanguage() {
        if (ttsLanguage == null) {
            ttsLanguage = new ArrayList<>();
        }
        return this.ttsLanguage;
    }

    /**
     * List of supported voice types. See tr2: TTSVoiceType.
     *
     * Gets the value of the ttsVoiceType property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttsVoiceType property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTTSVoiceType().add(newItem);
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
     *     The value of the ttsVoiceType property.
     */
    public List<String> getTTSVoiceType() {
        if (ttsVoiceType == null) {
            ttsVoiceType = new ArrayList<>();
        }
        return this.ttsVoiceType;
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
