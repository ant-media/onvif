
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
 * <p>Java class for PlayingAudioClips complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="PlayingAudioClips">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="AudioOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded"/>
 *         <element name="AudioOutputLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="RepeatsLeft" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "PlayingAudioClips", propOrder = {
    "token",
    "name",
    "audioOutputToken",
    "audioOutputLevel",
    "repeatsLeft",
    "any"
})
public class PlayingAudioClips {

    /**
     * Unique token associated with the audio clip.
     *
     */
    @XmlElement(name = "Token", required = true)
    protected String token;
    /**
     * Name of the audio clip.
     *
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Token list of physical audio outputs.
     *
     */
    @XmlElement(name = "AudioOutputToken", required = true)
    protected List<String> audioOutputToken;
    /**
     * Output level to control the volume of the audio clip when it is played.
     *
     */
    @XmlElement(name = "AudioOutputLevel")
    protected int audioOutputLevel;
    /**
     * Number of repeat cycles left while playing the audio clip.
     *
     */
    @XmlElement(name = "RepeatsLeft")
    protected int repeatsLeft;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Unique token associated with the audio clip.
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
     * Name of the audio clip.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Token list of physical audio outputs.
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
     * Output level to control the volume of the audio clip when it is played.
     *
     */
    public int getAudioOutputLevel() {
        return audioOutputLevel;
    }

    /**
     * Sets the value of the audioOutputLevel property.
     *
     */
    public void setAudioOutputLevel(int value) {
        this.audioOutputLevel = value;
    }

    /**
     * Number of repeat cycles left while playing the audio clip.
     *
     */
    public int getRepeatsLeft() {
        return repeatsLeft;
    }

    /**
     * Sets the value of the repeatsLeft property.
     *
     */
    public void setRepeatsLeft(int value) {
        this.repeatsLeft = value;
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
