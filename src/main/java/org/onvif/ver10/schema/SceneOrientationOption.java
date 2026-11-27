
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the acceptable values for the Orientation element of the SceneOrientation type
 *
 * <p>Java class for SceneOrientationOption</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SceneOrientationOption">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Below"/>
 *     <enumeration value="Horizon"/>
 *     <enumeration value="Above"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "SceneOrientationOption")
@XmlEnum
public enum SceneOrientationOption {

    @XmlEnumValue("Below")
    BELOW("Below"),
    @XmlEnumValue("Horizon")
    HORIZON("Horizon"),
    @XmlEnumValue("Above")
    ABOVE("Above");
    private final String value;

    SceneOrientationOption(String v) {
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
    public static SceneOrientationOption fromValue(String v) {
        for (SceneOrientationOption c: SceneOrientationOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
