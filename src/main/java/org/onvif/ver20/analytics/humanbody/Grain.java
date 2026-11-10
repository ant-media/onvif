
package org.onvif.ver20.analytics.humanbody;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for Grain</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Grain">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Stria"/>
 *     <enumeration value="Plaid"/>
 *     <enumeration value="PureColour"/>
 *     <enumeration value="Decal"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "Grain")
@XmlEnum
public enum Grain {

    @XmlEnumValue("Stria")
    STRIA("Stria"),
    @XmlEnumValue("Plaid")
    PLAID("Plaid"),
    @XmlEnumValue("PureColour")
    PURE_COLOUR("PureColour"),
    @XmlEnumValue("Decal")
    DECAL("Decal"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    Grain(String v) {
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
    public static Grain fromValue(String v) {
        for (Grain c: Grain.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
