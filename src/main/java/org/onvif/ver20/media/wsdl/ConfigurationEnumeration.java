
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for ConfigurationEnumeration</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ConfigurationEnumeration">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="All"/>
 *     <enumeration value="VideoSource"/>
 *     <enumeration value="VideoEncoder"/>
 *     <enumeration value="AudioSource"/>
 *     <enumeration value="AudioEncoder"/>
 *     <enumeration value="AudioOutput"/>
 *     <enumeration value="AudioDecoder"/>
 *     <enumeration value="Metadata"/>
 *     <enumeration value="Analytics"/>
 *     <enumeration value="PTZ"/>
 *     <enumeration value="Receiver"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "ConfigurationEnumeration")
@XmlEnum
public enum ConfigurationEnumeration {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("VideoSource")
    VIDEO_SOURCE("VideoSource"),
    @XmlEnumValue("VideoEncoder")
    VIDEO_ENCODER("VideoEncoder"),
    @XmlEnumValue("AudioSource")
    AUDIO_SOURCE("AudioSource"),
    @XmlEnumValue("AudioEncoder")
    AUDIO_ENCODER("AudioEncoder"),
    @XmlEnumValue("AudioOutput")
    AUDIO_OUTPUT("AudioOutput"),
    @XmlEnumValue("AudioDecoder")
    AUDIO_DECODER("AudioDecoder"),
    @XmlEnumValue("Metadata")
    METADATA("Metadata"),
    @XmlEnumValue("Analytics")
    ANALYTICS("Analytics"),
    PTZ("PTZ"),
    @XmlEnumValue("Receiver")
    RECEIVER("Receiver");
    private final String value;

    ConfigurationEnumeration(String v) {
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
    public static ConfigurationEnumeration fromValue(String v) {
        for (ConfigurationEnumeration c: ConfigurationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
