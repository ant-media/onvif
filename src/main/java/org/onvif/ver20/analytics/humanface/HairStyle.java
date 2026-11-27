
package org.onvif.ver20.analytics.humanface;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for HairStyle</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HairStyle">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Straight"/>
 *     <enumeration value="Wave"/>
 *     <enumeration value="Curly"/>
 *     <enumeration value="CrewCut"/>
 *     <enumeration value="Bald"/>
 *     <enumeration value="Ponytail"/>
 *     <enumeration value="Pigtail"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "HairStyle")
@XmlEnum
public enum HairStyle {

    @XmlEnumValue("Straight")
    STRAIGHT("Straight"),
    @XmlEnumValue("Wave")
    WAVE("Wave"),
    @XmlEnumValue("Curly")
    CURLY("Curly"),
    @XmlEnumValue("CrewCut")
    CREW_CUT("CrewCut"),
    @XmlEnumValue("Bald")
    BALD("Bald"),
    @XmlEnumValue("Ponytail")
    PONYTAIL("Ponytail"),
    @XmlEnumValue("Pigtail")
    PIGTAIL("Pigtail"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    HairStyle(String v) {
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
    public static HairStyle fromValue(String v) {
        for (HairStyle c: HairStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
