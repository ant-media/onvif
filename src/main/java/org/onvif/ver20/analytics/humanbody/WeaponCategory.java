
package org.onvif.ver20.analytics.humanbody;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for WeaponCategory</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="WeaponCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Knife"/>
 *     <enumeration value="Rifle"/>
 *     <enumeration value="Pistol"/>
 *     <enumeration value="Revolver"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "WeaponCategory")
@XmlEnum
public enum WeaponCategory {

    @XmlEnumValue("Knife")
    KNIFE("Knife"),
    @XmlEnumValue("Rifle")
    RIFLE("Rifle"),
    @XmlEnumValue("Pistol")
    PISTOL("Pistol"),
    @XmlEnumValue("Revolver")
    REVOLVER("Revolver");
    private final String value;

    WeaponCategory(String v) {
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
    public static WeaponCategory fromValue(String v) {
        for (WeaponCategory c: WeaponCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
