
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for EncryptionMode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EncryptionMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CENC"/>
 *     <enumeration value="CBCS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "EncryptionMode")
@XmlEnum
public enum EncryptionMode {


    /**
     * AES-CTR mode full sample and video NAL Subsample encryption, defined in ISO/IEC 23001-7.
     *
     */
    CENC,

    /**
     * AES-CBC mode partial video NAL pattern encryption, defined in ISO/IEC 23001-7.
     *
     */
    CBCS;

    public String value() {
        return name();
    }

    public static EncryptionMode fromValue(String v) {
        return valueOf(v);
    }

}
