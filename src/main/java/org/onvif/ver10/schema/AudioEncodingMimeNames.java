
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Audio Media Subtypes as referenced by IANA (without the leading "audio/" Audio Media Type and except for the audio types defined in the restriction).  See also
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iana.org/assignments/media-types/media-types.xhtml#audio"&gt; IANA Media Types&lt;/a&gt;
 * </pre>
 * .
 *
 * <p>Java class for AudioEncodingMimeNames</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AudioEncodingMimeNames">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PCMU"/>
 *     <enumeration value="G726"/>
 *     <enumeration value="MP4A-LATM"/>
 *     <enumeration value="mpeg4-generic"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "AudioEncodingMimeNames")
@XmlEnum
public enum AudioEncodingMimeNames {

    PCMU("PCMU"),

    /**
     * AudioEncodingMimeName G726 is used to represent G726-16,G726-24,G726-32 and G726-40 defined in the IANA Media Types
     *
     */
    @XmlEnumValue("G726")
    G_726("G726"),
    @XmlEnumValue("MP4A-LATM")
    MP_4_A_LATM("MP4A-LATM"),
    @XmlEnumValue("mpeg4-generic")
    MPEG_4_GENERIC("mpeg4-generic");
    private final String value;

    AudioEncodingMimeNames(String v) {
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
    public static AudioEncodingMimeNames fromValue(String v) {
        for (AudioEncodingMimeNames c: AudioEncodingMimeNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
