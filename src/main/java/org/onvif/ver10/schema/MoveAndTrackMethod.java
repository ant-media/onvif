
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for MoveAndTrackMethod</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MoveAndTrackMethod">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PresetToken"/>
 *     <enumeration value="GeoLocation"/>
 *     <enumeration value="PTZVector"/>
 *     <enumeration value="ObjectID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "MoveAndTrackMethod")
@XmlEnum
public enum MoveAndTrackMethod {

    @XmlEnumValue("PresetToken")
    PRESET_TOKEN("PresetToken"),
    @XmlEnumValue("GeoLocation")
    GEO_LOCATION("GeoLocation"),
    @XmlEnumValue("PTZVector")
    PTZ_VECTOR("PTZVector"),
    @XmlEnumValue("ObjectID")
    OBJECT_ID("ObjectID");
    private final String value;

    MoveAndTrackMethod(String v) {
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
    public static MoveAndTrackMethod fromValue(String v) {
        for (MoveAndTrackMethod c: MoveAndTrackMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
