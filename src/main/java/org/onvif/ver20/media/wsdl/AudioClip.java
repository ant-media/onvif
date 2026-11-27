
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
 * <p>Java class for AudioClip complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AudioClip">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="AudioOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="RepeatCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="RepeatInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="AudioOutputLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ScheduleToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
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
@XmlType(name = "AudioClip", propOrder = {
    "enabled",
    "name",
    "audioOutputToken",
    "type",
    "repeatCycles",
    "repeatInterval",
    "audioOutputLevel",
    "scheduleToken",
    "any"
})
public class AudioClip {

    /**
     * Enables/disables the audio clip.
     *
     */
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    /**
     * Name of the audio clip.
     *
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Optional token list of physical audio outputs.
     *
     */
    @XmlElement(name = "AudioOutputToken")
    protected List<String> audioOutputToken;
    /**
     * Format of the audio clip. For definitions see tr2:SupportedAudioClipFormat parameter.
     *
     */
    @XmlElement(name = "Type", required = true)
    protected String type;
    /**
     * The number of times the audio clip can be repeated when it is played. A value of 0 means no repeat (i.e., the audio clip plays once and does not repeat). A value of 1 means the audio clip plays once and repeats once after the first play. A value of -1 means the audio clip repeats infinitely after the first play until it is stopped by the user.
     *
     */
    @XmlElement(name = "RepeatCycles")
    protected int repeatCycles;
    /**
     * Optional time interval, in seconds, between audio clips when the audio clip is repeated.
     *
     */
    @XmlElement(name = "RepeatInterval")
    protected Integer repeatInterval;
    /**
     * Optional level to control the volume of the audio clip when it is played.
     *
     */
    @XmlElement(name = "AudioOutputLevel")
    protected Integer audioOutputLevel;
    /**
     * Optional schedule token associated with the audio clip configuration. The audio clip should be played when the configured schedule is triggered.
     *
     */
    @XmlElement(name = "ScheduleToken")
    protected String scheduleToken;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Enables/disables the audio clip.
     *
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     *
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
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
     * Optional token list of physical audio outputs.
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
     * Format of the audio clip. For definitions see tr2:SupportedAudioClipFormat parameter.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * The number of times the audio clip can be repeated when it is played. A value of 0 means no repeat (i.e., the audio clip plays once and does not repeat). A value of 1 means the audio clip plays once and repeats once after the first play. A value of -1 means the audio clip repeats infinitely after the first play until it is stopped by the user.
     *
     */
    public int getRepeatCycles() {
        return repeatCycles;
    }

    /**
     * Sets the value of the repeatCycles property.
     *
     */
    public void setRepeatCycles(int value) {
        this.repeatCycles = value;
    }

    /**
     * Optional time interval, in seconds, between audio clips when the audio clip is repeated.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getRepeatInterval() {
        return repeatInterval;
    }

    /**
     * Sets the value of the repeatInterval property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getRepeatInterval()
     */
    public void setRepeatInterval(Integer value) {
        this.repeatInterval = value;
    }

    /**
     * Optional level to control the volume of the audio clip when it is played.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getAudioOutputLevel() {
        return audioOutputLevel;
    }

    /**
     * Sets the value of the audioOutputLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getAudioOutputLevel()
     */
    public void setAudioOutputLevel(Integer value) {
        this.audioOutputLevel = value;
    }

    /**
     * Optional schedule token associated with the audio clip configuration. The audio clip should be played when the configured schedule is triggered.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScheduleToken() {
        return scheduleToken;
    }

    /**
     * Sets the value of the scheduleToken property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getScheduleToken()
     */
    public void setScheduleToken(String value) {
        this.scheduleToken = value;
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
