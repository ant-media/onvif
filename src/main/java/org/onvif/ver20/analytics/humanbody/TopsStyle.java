
package org.onvif.ver20.analytics.humanbody;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for TopsStyle</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TopsStyle">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Tailor"/>
 *     <enumeration value="Jacket"/>
 *     <enumeration value="Shirt"/>
 *     <enumeration value="Sweater"/>
 *     <enumeration value="Overcoat"/>
 *     <enumeration value="Dress"/>
 *     <enumeration value="Vest"/>
 *     <enumeration value="SafetyVest"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "TopsStyle")
@XmlEnum
public enum TopsStyle {

    @XmlEnumValue("Tailor")
    TAILOR("Tailor"),
    @XmlEnumValue("Jacket")
    JACKET("Jacket"),
    @XmlEnumValue("Shirt")
    SHIRT("Shirt"),
    @XmlEnumValue("Sweater")
    SWEATER("Sweater"),
    @XmlEnumValue("Overcoat")
    OVERCOAT("Overcoat"),
    @XmlEnumValue("Dress")
    DRESS("Dress"),
    @XmlEnumValue("Vest")
    VEST("Vest"),
    @XmlEnumValue("SafetyVest")
    SAFETY_VEST("SafetyVest"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TopsStyle(String v) {
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
    public static TopsStyle fromValue(String v) {
        for (TopsStyle c: TopsStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
