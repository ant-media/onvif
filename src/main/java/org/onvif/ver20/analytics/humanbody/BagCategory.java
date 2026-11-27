
package org.onvif.ver20.analytics.humanbody;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for BagCategory</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BagCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ShoulderBag"/>
 *     <enumeration value="Backpack"/>
 *     <enumeration value="ToteBag"/>
 *     <enumeration value="Briefcase"/>
 *     <enumeration value="Suitcase"/>
 *     <enumeration value="SingleShoulderBag"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "BagCategory")
@XmlEnum
public enum BagCategory {

    @XmlEnumValue("ShoulderBag")
    SHOULDER_BAG("ShoulderBag"),
    @XmlEnumValue("Backpack")
    BACKPACK("Backpack"),
    @XmlEnumValue("ToteBag")
    TOTE_BAG("ToteBag"),
    @XmlEnumValue("Briefcase")
    BRIEFCASE("Briefcase"),
    @XmlEnumValue("Suitcase")
    SUITCASE("Suitcase"),
    @XmlEnumValue("SingleShoulderBag")
    SINGLE_SHOULDER_BAG("SingleShoulderBag"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BagCategory(String v) {
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
    public static BagCategory fromValue(String v) {
        for (BagCategory c: BagCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
