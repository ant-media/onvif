
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Source view modes supported by device.
 *
 * <p>Java class for ViewModes</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ViewModes">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="tt:Fisheye"/>
 *     <enumeration value="tt:360Panorama"/>
 *     <enumeration value="tt:180Panorama"/>
 *     <enumeration value="tt:Quad"/>
 *     <enumeration value="tt:Original"/>
 *     <enumeration value="tt:LeftHalf"/>
 *     <enumeration value="tt:RightHalf"/>
 *     <enumeration value="tt:Dewarp"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "ViewModes")
@XmlEnum
public enum ViewModes {


    /**
     * Undewarped viewmode from device supporting fisheye lens.
     *
     */
    @XmlEnumValue("tt:Fisheye")
    TT_FISHEYE("tt:Fisheye"),

    /**
     *  360 degree panoramic view.
     *
     */
    @XmlEnumValue("tt:360Panorama")
    TT_360_PANORAMA("tt:360Panorama"),

    /**
     *  180 degree panoramic view.
     *
     */
    @XmlEnumValue("tt:180Panorama")
    TT_180_PANORAMA("tt:180Panorama"),

    /**
     * View mode combining four streams in single Quad, eg., applicable for devices supporting four heads.
     *
     */
    @XmlEnumValue("tt:Quad")
    TT_QUAD("tt:Quad"),

    /**
     * Unaltered view from the sensor.
     *
     */
    @XmlEnumValue("tt:Original")
    TT_ORIGINAL("tt:Original"),

    /**
     * Viewmode combining the left side sensors, applicable for devices supporting multiple sensors.
     *
     */
    @XmlEnumValue("tt:LeftHalf")
    TT_LEFT_HALF("tt:LeftHalf"),

    /**
     * Viewmode combining the right side sensors, applicable for devices supporting multiple sensors.
     *
     */
    @XmlEnumValue("tt:RightHalf")
    TT_RIGHT_HALF("tt:RightHalf"),

    /**
     * Dewarped view mode for device supporting fisheye lens.
     *
     */
    @XmlEnumValue("tt:Dewarp")
    TT_DEWARP("tt:Dewarp");
    private final String value;

    ViewModes(String v) {
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
    public static ViewModes fromValue(String v) {
        for (ViewModes c: ViewModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
