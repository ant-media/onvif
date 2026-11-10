
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for SupportedAudioClipFormat</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SupportedAudioClipFormat">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="audio/vnd.wave;codec=1"/>
 *     <enumeration value="audio/vnd.wave;codec=7"/>
 *     <enumeration value="audio/mpeg"/>
 *     <enumeration value="audio/ogg;codecs=opus"/>
 *     <enumeration value="audio/ogg;codecs=vorbis"/>
 *     <enumeration value="audio/ogg;codecs=flac"/>
 *     <enumeration value="audio/ogg;codecs=speex"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "SupportedAudioClipFormat")
@XmlEnum
public enum SupportedAudioClipFormat {

    @XmlEnumValue("audio/vnd.wave;codec=1")
    AUDIO_VND_WAVE_CODEC_1("audio/vnd.wave;codec=1"),
    @XmlEnumValue("audio/vnd.wave;codec=7")
    AUDIO_VND_WAVE_CODEC_7("audio/vnd.wave;codec=7"),
    @XmlEnumValue("audio/mpeg")
    AUDIO_MPEG("audio/mpeg"),
    @XmlEnumValue("audio/ogg;codecs=opus")
    AUDIO_OGG_CODECS_OPUS("audio/ogg;codecs=opus"),
    @XmlEnumValue("audio/ogg;codecs=vorbis")
    AUDIO_OGG_CODECS_VORBIS("audio/ogg;codecs=vorbis"),
    @XmlEnumValue("audio/ogg;codecs=flac")
    AUDIO_OGG_CODECS_FLAC("audio/ogg;codecs=flac"),
    @XmlEnumValue("audio/ogg;codecs=speex")
    AUDIO_OGG_CODECS_SPEEX("audio/ogg;codecs=speex");
    private final String value;

    SupportedAudioClipFormat(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     *
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     *
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static SupportedAudioClipFormat fromValue(String v) {
        for (SupportedAudioClipFormat c: SupportedAudioClipFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
