
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for SrtpSecurityAlgorithms</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SrtpSecurityAlgorithms">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NONE"/>
 *     <enumeration value="AES_CM_128_HMAC_SHA1_80"/>
 *     <enumeration value="AEAD_AES_128_GCM"/>
 *     <enumeration value="AEAD_AES_256_GCM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "SrtpSecurityAlgorithms")
@XmlEnum
public enum SrtpSecurityAlgorithms {

    NONE("NONE"),
    @XmlEnumValue("AES_CM_128_HMAC_SHA1_80")
    AES_CM_128_HMAC_SHA_1_80("AES_CM_128_HMAC_SHA1_80"),
    AEAD_AES_128_GCM("AEAD_AES_128_GCM"),
    AEAD_AES_256_GCM("AEAD_AES_256_GCM");
    private final String value;

    SrtpSecurityAlgorithms(String v) {
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
    public static SrtpSecurityAlgorithms fromValue(String v) {
        for (SrtpSecurityAlgorithms c: SrtpSecurityAlgorithms.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
