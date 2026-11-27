
package org.onvif.ver20.media.wsdl;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="AudioOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Play" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="RepeatCycles" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "audioOutputToken",
    "play",
    "repeatCycles"
})
@XmlRootElement(name = "PlayAudioClip")
public class PlayAudioClip {

    /**
     * Token of the audio clip to be played or stopped.
     *
     */
    @XmlElement(name = "Token", required = true)
    protected String token;
    /**
     * Optional token list of physical audio outputs. If the AudioOutputToken is not provided in the API request, the AudioOutputToken from the audio clip configuration will be used.
     *
     */
    @XmlElement(name = "AudioOutputToken")
    protected List<String> audioOutputToken;
    /**
     * If it is true, play the audio clip; if it is false, stop the ongoing audio clip.
     *
     */
    @XmlElement(name = "Play")
    protected boolean play;
    /**
     * Optional RepeatCycles to be used for the current play operation. If RepeatCycles is not provided in the API request, the RepeatCycles specified in the audio clip configuration will be used for the current play operation.
     *
     */
    @XmlElement(name = "RepeatCycles")
    protected Integer repeatCycles;

    /**
     * Token of the audio clip to be played or stopped.
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
     * Optional token list of physical audio outputs. If the AudioOutputToken is not provided in the API request, the AudioOutputToken from the audio clip configuration will be used.
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
     * If it is true, play the audio clip; if it is false, stop the ongoing audio clip.
     *
     */
    public boolean isPlay() {
        return play;
    }

    /**
     * Sets the value of the play property.
     *
     */
    public void setPlay(boolean value) {
        this.play = value;
    }

    /**
     * Optional RepeatCycles to be used for the current play operation. If RepeatCycles is not provided in the API request, the RepeatCycles specified in the audio clip configuration will be used for the current play operation.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getRepeatCycles() {
        return repeatCycles;
    }

    /**
     * Sets the value of the repeatCycles property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getRepeatCycles()
     */
    public void setRepeatCycles(Integer value) {
        this.repeatCycles = value;
    }

}
