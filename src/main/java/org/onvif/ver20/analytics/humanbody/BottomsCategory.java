
package org.onvif.ver20.analytics.humanbody;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for BottomsCategory</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BottomsCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Trousers"/>
 *     <enumeration value="Shorts"/>
 *     <enumeration value="Skirt"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "BottomsCategory")
@XmlEnum
public enum BottomsCategory {

    @XmlEnumValue("Trousers")
    TROUSERS("Trousers"),
    @XmlEnumValue("Shorts")
    SHORTS("Shorts"),
    @XmlEnumValue("Skirt")
    SKIRT("Skirt"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BottomsCategory(String v) {
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
    public static BottomsCategory fromValue(String v) {
        for (BottomsCategory c: BottomsCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
