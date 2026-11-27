
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for StorageStrategy</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="StorageStrategy">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="External"/>
 *     <enumeration value="Local"/>
 *     <enumeration value="Both"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "StorageStrategy")
@XmlEnum
public enum StorageStrategy {


    /**
     * Indicates that device must record to the storage defined by the StorageConfiguration token.
     *
     */
    @XmlEnumValue("External")
    EXTERNAL("External"),

    /**
     * Indicates that device must record on its local storage and can export recorded data to the external
     * 						storage using ExportRecordedSegments.
     *
     */
    @XmlEnumValue("Local")
    LOCAL("Local"),

    /**
     * Indicates that device must record on both local storage and external storage and locally recorded data can
     * 						be exported if connectivity issue prevented export to external storage during normal operation.
     *
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    StorageStrategy(String v) {
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
    public static StorageStrategy fromValue(String v) {
        for (StorageStrategy c: StorageStrategy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
