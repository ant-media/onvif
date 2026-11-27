
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for ObjectType</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ObjectType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Animal"/>
 *     <enumeration value="HumanFace"/>
 *     <enumeration value="Human"/>
 *     <enumeration value="Bicycle"/>
 *     <enumeration value="Vehicle"/>
 *     <enumeration value="LicensePlate"/>
 *     <enumeration value="Bike"/>
 *     <enumeration value="Barcode"/>
 *     <enumeration value="Fire"/>
 *     <enumeration value="Smoke"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "ObjectType")
@XmlEnum
public enum ObjectType {

    @XmlEnumValue("Animal")
    ANIMAL("Animal"),
    @XmlEnumValue("HumanFace")
    HUMAN_FACE("HumanFace"),
    @XmlEnumValue("Human")
    HUMAN("Human"),
    @XmlEnumValue("Bicycle")
    BICYCLE("Bicycle"),
    @XmlEnumValue("Vehicle")
    VEHICLE("Vehicle"),
    @XmlEnumValue("LicensePlate")
    LICENSE_PLATE("LicensePlate"),
    @XmlEnumValue("Bike")
    BIKE("Bike"),
    @XmlEnumValue("Barcode")
    BARCODE("Barcode"),
    @XmlEnumValue("Fire")
    FIRE("Fire"),
    @XmlEnumValue("Smoke")
    SMOKE("Smoke");
    private final String value;

    ObjectType(String v) {
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
    public static ObjectType fromValue(String v) {
        for (ObjectType c: ObjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
