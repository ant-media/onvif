
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for LabelAuthority</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LabelAuthority">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ISO_3864"/>
 *     <enumeration value="ISO_7010"/>
 *     <enumeration value="UNECE_ADR"/>
 *     <enumeration value="UNECE_GHS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "LabelAuthority")
@XmlEnum
public enum LabelAuthority {

    ISO_3864,
    ISO_7010,
    UNECE_ADR,
    UNECE_GHS;

    public String value() {
        return name();
    }

    public static LabelAuthority fromValue(String v) {
        return valueOf(v);
    }

}
