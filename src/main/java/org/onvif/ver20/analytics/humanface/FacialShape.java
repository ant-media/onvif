
package org.onvif.ver20.analytics.humanface;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for FacialShape</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FacialShape">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Long"/>
 *     <enumeration value="Round"/>
 *     <enumeration value="Square"/>
 *     <enumeration value="Oval"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "FacialShape")
@XmlEnum
public enum FacialShape {

    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("Round")
    ROUND("Round"),
    @XmlEnumValue("Square")
    SQUARE("Square"),
    @XmlEnumValue("Oval")
    OVAL("Oval"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FacialShape(String v) {
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
    public static FacialShape fromValue(String v) {
        for (FacialShape c: FacialShape.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
