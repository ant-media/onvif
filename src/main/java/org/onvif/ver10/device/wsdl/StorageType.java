
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for StorageType</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="StorageType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NFS"/>
 *     <enumeration value="CIFS"/>
 *     <enumeration value="CDMI"/>
 *     <enumeration value="FTP"/>
 *     <enumeration value="ObjectStorageS3"/>
 *     <enumeration value="ObjectStorageAzure"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "StorageType")
@XmlEnum
public enum StorageType {


    /**
     * NFS protocol
     *
     */
    NFS("NFS"),

    /**
     * CIFS protocol
     *
     */
    CIFS("CIFS"),

    /**
     * CDMI protocol
     *
     */
    CDMI("CDMI"),

    /**
     * FTP protocol
     *
     */
    FTP("FTP"),

    /**
     * Amazon Simple Storage Service (S3) protocol (also used for S3 compatible object storages like MinIO)
     *
     */
    @XmlEnumValue("ObjectStorageS3")
    OBJECT_STORAGE_S_3("ObjectStorageS3"),

    /**
     * Microsoft Azure Blob Storage protocol
     *
     */
    @XmlEnumValue("ObjectStorageAzure")
    OBJECT_STORAGE_AZURE("ObjectStorageAzure");
    private final String value;

    StorageType(String v) {
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
    public static StorageType fromValue(String v) {
        for (StorageType c: StorageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
