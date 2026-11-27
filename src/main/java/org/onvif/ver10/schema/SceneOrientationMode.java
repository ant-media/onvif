
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for SceneOrientationMode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SceneOrientationMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MANUAL"/>
 *     <enumeration value="AUTO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "SceneOrientationMode")
@XmlEnum
public enum SceneOrientationMode {

    MANUAL,
    AUTO;

    public String value() {
        return name();
    }

    public static SceneOrientationMode fromValue(String v) {
        return valueOf(v);
    }

}
