
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * AudioClassType acceptable values are;
 * 		   gun_shot, scream, glass_breaking, tire_screech
 *
 * <p>Java class for AudioClassType</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AudioClassType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="gun_shot"/>
 *     <enumeration value="scream"/>
 *     <enumeration value="glass_breaking"/>
 *     <enumeration value="tire_screech"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "AudioClassType")
@XmlEnum
public enum AudioClassType {

    @XmlEnumValue("gun_shot")
    GUN_SHOT("gun_shot"),
    @XmlEnumValue("scream")
    SCREAM("scream"),
    @XmlEnumValue("glass_breaking")
    GLASS_BREAKING("glass_breaking"),
    @XmlEnumValue("tire_screech")
    TIRE_SCREECH("tire_screech");
    private final String value;

    AudioClassType(String v) {
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
    public static AudioClassType fromValue(String v) {
        for (AudioClassType c: AudioClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
