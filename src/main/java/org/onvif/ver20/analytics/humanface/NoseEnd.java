
package org.onvif.ver20.analytics.humanface;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for NoseEnd</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NoseEnd">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Snub"/>
 *     <enumeration value="Turnedup"/>
 *     <enumeration value="Flat"/>
 *     <enumeration value="Hooked"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "NoseEnd")
@XmlEnum
public enum NoseEnd {

    @XmlEnumValue("Snub")
    SNUB("Snub"),
    @XmlEnumValue("Turnedup")
    TURNEDUP("Turnedup"),
    @XmlEnumValue("Flat")
    FLAT("Flat"),
    @XmlEnumValue("Hooked")
    HOOKED("Hooked"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    NoseEnd(String v) {
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
    public static NoseEnd fromValue(String v) {
        for (NoseEnd c: NoseEnd.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
