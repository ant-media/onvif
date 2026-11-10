
package org.onvif.ver20.analytics.humanface;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for Expression</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="Expression">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Natural"/>
 *     <enumeration value="Smile"/>
 *     <enumeration value="RaisedEyebrows"/>
 *     <enumeration value="Squint"/>
 *     <enumeration value="Frown"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "Expression")
@XmlEnum
public enum Expression {

    @XmlEnumValue("Natural")
    NATURAL("Natural"),
    @XmlEnumValue("Smile")
    SMILE("Smile"),
    @XmlEnumValue("RaisedEyebrows")
    RAISED_EYEBROWS("RaisedEyebrows"),
    @XmlEnumValue("Squint")
    SQUINT("Squint"),
    @XmlEnumValue("Frown")
    FROWN("Frown"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    Expression(String v) {
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
    public static Expression fromValue(String v) {
        for (Expression c: Expression.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
