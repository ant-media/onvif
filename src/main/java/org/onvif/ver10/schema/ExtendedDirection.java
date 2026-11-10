
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Departing represents distance of object to camera sensor increasing over time.
 *
 * <p>Java class for ExtendedDirection</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ExtendedDirection">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Left"/>
 *     <enumeration value="Right"/>
 *     <enumeration value="Any"/>
 *     <enumeration value="Entering"/>
 *     <enumeration value="Exiting"/>
 *     <enumeration value="Approaching"/>
 *     <enumeration value="Departing"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "ExtendedDirection")
@XmlEnum
public enum ExtendedDirection {

    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Entering")
    ENTERING("Entering"),
    @XmlEnumValue("Exiting")
    EXITING("Exiting"),
    @XmlEnumValue("Approaching")
    APPROACHING("Approaching"),
    @XmlEnumValue("Departing")
    DEPARTING("Departing");
    private final String value;

    ExtendedDirection(String v) {
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
    public static ExtendedDirection fromValue(String v) {
        for (ExtendedDirection c: ExtendedDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
