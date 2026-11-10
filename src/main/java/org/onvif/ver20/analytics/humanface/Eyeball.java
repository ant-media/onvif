
package org.onvif.ver20.analytics.humanface;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for Eyeball</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Eyeball">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Black"/>
 *     <enumeration value="Blue"/>
 *     <enumeration value="Brown"/>
 *     <enumeration value="Gray"/>
 *     <enumeration value="Green"/>
 *     <enumeration value="Pink"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "Eyeball")
@XmlEnum
public enum Eyeball {

    @XmlEnumValue("Black")
    BLACK("Black"),
    @XmlEnumValue("Blue")
    BLUE("Blue"),
    @XmlEnumValue("Brown")
    BROWN("Brown"),
    @XmlEnumValue("Gray")
    GRAY("Gray"),
    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("Pink")
    PINK("Pink"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    Eyeball(String v) {
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
    public static Eyeball fromValue(String v) {
        for (Eyeball c: Eyeball.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
