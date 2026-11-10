
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for TTSVoiceType</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TTSVoiceType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="male"/>
 *     <enumeration value="female"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "TTSVoiceType")
@XmlEnum
public enum TTSVoiceType {

    @XmlEnumValue("male")
    MALE("male"),
    @XmlEnumValue("female")
    FEMALE("female");
    private final String value;

    TTSVoiceType(String v) {
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
    public static TTSVoiceType fromValue(String v) {
        for (TTSVoiceType c: TTSVoiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
