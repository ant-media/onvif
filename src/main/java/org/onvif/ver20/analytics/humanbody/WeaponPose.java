
package org.onvif.ver20.analytics.humanbody;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for WeaponPose</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="WeaponPose">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="InHolster"/>
 *     <enumeration value="InHand"/>
 *     <enumeration value="Aiming"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "WeaponPose")
@XmlEnum
public enum WeaponPose {

    @XmlEnumValue("InHolster")
    IN_HOLSTER("InHolster"),
    @XmlEnumValue("InHand")
    IN_HAND("InHand"),
    @XmlEnumValue("Aiming")
    AIMING("Aiming");
    private final String value;

    WeaponPose(String v) {
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
    public static WeaponPose fromValue(String v) {
        for (WeaponPose c: WeaponPose.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
