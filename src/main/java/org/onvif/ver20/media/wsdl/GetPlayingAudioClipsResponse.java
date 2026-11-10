
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
 *         <element name="PlayingAudioClips" type="{http://www.onvif.org/ver20/media/wsdl}PlayingAudioClips" maxOccurs="unbounded" minOccurs="0"/>
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
    "playingAudioClips"
})
@XmlRootElement(name = "GetPlayingAudioClipsResponse")
public class GetPlayingAudioClipsResponse {

    /**
     * List of audio clips currently playing in the device.
     *
     */
    @XmlElement(name = "PlayingAudioClips")
    protected List<PlayingAudioClips> playingAudioClips;

    /**
     * List of audio clips currently playing in the device.
     *
     * Gets the value of the playingAudioClips property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the playingAudioClips property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPlayingAudioClips().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlayingAudioClips }
     * </p>
     *
     *
     * @return
     *     The value of the playingAudioClips property.
     */
    public List<PlayingAudioClips> getPlayingAudioClips() {
        if (playingAudioClips == null) {
            playingAudioClips = new ArrayList<>();
        }
        return this.playingAudioClips;
    }

}
