
package org.onvif.ver20.analytics.humanbody;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for ShoesCategory</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ShoesCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Boots"/>
 *     <enumeration value="LeatherShoes"/>
 *     <enumeration value="Sneakers"/>
 *     <enumeration value="Sandal"/>
 *     <enumeration value="Slipper"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "ShoesCategory")
@XmlEnum
public enum ShoesCategory {

    @XmlEnumValue("Boots")
    BOOTS("Boots"),
    @XmlEnumValue("LeatherShoes")
    LEATHER_SHOES("LeatherShoes"),
    @XmlEnumValue("Sneakers")
    SNEAKERS("Sneakers"),
    @XmlEnumValue("Sandal")
    SANDAL("Sandal"),
    @XmlEnumValue("Slipper")
    SLIPPER("Slipper"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ShoesCategory(String v) {
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
    public static ShoesCategory fromValue(String v) {
        for (ShoesCategory c: ShoesCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
