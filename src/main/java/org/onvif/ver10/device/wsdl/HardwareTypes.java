
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * All hardware types specified are related to network devices supporting ONVIF specification.
 *
 * <p>Java class for HardwareTypes</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HardwareTypes">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Camera"/>
 *     <enumeration value="MultiSensorCamera"/>
 *     <enumeration value="Encoder"/>
 *     <enumeration value="Intercom"/>
 *     <enumeration value="AccessControl"/>
 *     <enumeration value="Speaker"/>
 *     <enumeration value="Recorder"/>
 *     <enumeration value="Microphone"/>
 *     <enumeration value="Display"/>
 *     <enumeration value="IO-Device"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "HardwareTypes")
@XmlEnum
public enum HardwareTypes {


    /**
     * Single sensor camera. Ex. bullet, PTZ or fisheye camera.
     *
     */
    @XmlEnumValue("Camera")
    CAMERA("Camera"),

    /**
     * Multiple sensors device.
     *
     */
    @XmlEnumValue("MultiSensorCamera")
    MULTI_SENSOR_CAMERA("MultiSensorCamera"),

    /**
     * Analog encoder. Can have 1 or more encoders.
     *
     */
    @XmlEnumValue("Encoder")
    ENCODER("Encoder"),

    /**
     * Intercom device, which has both a microphone and a speaker.
     *
     */
    @XmlEnumValue("Intercom")
    INTERCOM("Intercom"),

    /**
     * Access control device.
     *
     */
    @XmlEnumValue("AccessControl")
    ACCESS_CONTROL("AccessControl"),

    /**
     * A speaker which is not an intercom.
     *
     */
    @XmlEnumValue("Speaker")
    SPEAKER("Speaker"),

    /**
     * Network video recorder (NVR/DVR)
     *
     */
    @XmlEnumValue("Recorder")
    RECORDER("Recorder"),

    /**
     * A microphone which is not an intercom.
     *
     */
    @XmlEnumValue("Microphone")
    MICROPHONE("Microphone"),

    /**
     * A display for a device mainly supporting the Display service.
     *
     */
    @XmlEnumValue("Display")
    DISPLAY("Display"),

    /**
     * A device which only has DigitalInputs and RelayOutputs.
     *
     */
    @XmlEnumValue("IO-Device")
    IO_DEVICE("IO-Device");
    private final String value;

    HardwareTypes(String v) {
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
    public static HardwareTypes fromValue(String v) {
        for (HardwareTypes c: HardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
