
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for AudioClassification</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AudioClassification">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GunShot"/>
 *     <enumeration value="Scream"/>
 *     <enumeration value="GlassBreaking"/>
 *     <enumeration value="TireScreech"/>
 *     <enumeration value="Alarm"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "AudioClassification")
@XmlEnum
public enum AudioClassification {

    @XmlEnumValue("GunShot")
    GUN_SHOT("GunShot"),
    @XmlEnumValue("Scream")
    SCREAM("Scream"),
    @XmlEnumValue("GlassBreaking")
    GLASS_BREAKING("GlassBreaking"),
    @XmlEnumValue("TireScreech")
    TIRE_SCREECH("TireScreech"),
    @XmlEnumValue("Alarm")
    ALARM("Alarm");
    private final String value;

    AudioClassification(String v) {
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
    public static AudioClassification fromValue(String v) {
        for (AudioClassification c: AudioClassification.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
