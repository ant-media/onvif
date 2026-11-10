
package org.onvif.ver20.analytics.humanbody;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for HumanActivity</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HumanActivity">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Walking"/>
 *     <enumeration value="Running"/>
 *     <enumeration value="Fallen"/>
 *     <enumeration value="Squatting"/>
 *     <enumeration value="Sitting"/>
 *     <enumeration value="Standing"/>
 *     <enumeration value="Driving"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "HumanActivity")
@XmlEnum
public enum HumanActivity {

    @XmlEnumValue("Walking")
    WALKING("Walking"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Fallen")
    FALLEN("Fallen"),
    @XmlEnumValue("Squatting")
    SQUATTING("Squatting"),
    @XmlEnumValue("Sitting")
    SITTING("Sitting"),
    @XmlEnumValue("Standing")
    STANDING("Standing"),
    @XmlEnumValue("Driving")
    DRIVING("Driving"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    HumanActivity(String v) {
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
    public static HumanActivity fromValue(String v) {
        for (HumanActivity c: HumanActivity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
