
package org.onvif.ver20.analytics.humanbody;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for Smoking</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Smoking">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NoSmoking"/>
 *     <enumeration value="Cigar"/>
 *     <enumeration value="ElectronicCigarettes"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "Smoking")
@XmlEnum
public enum Smoking {

    @XmlEnumValue("NoSmoking")
    NO_SMOKING("NoSmoking"),
    @XmlEnumValue("Cigar")
    CIGAR("Cigar"),
    @XmlEnumValue("ElectronicCigarettes")
    ELECTRONIC_CIGARETTES("ElectronicCigarettes"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    Smoking(String v) {
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
    public static Smoking fromValue(String v) {
        for (Smoking c: Smoking.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
