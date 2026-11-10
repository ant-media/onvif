
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for AsymmetricEncryption complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AsymmetricEncryption">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="KeyRotationDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsymmetricEncryption", propOrder = {
    "certificateID",
    "keyRotationDuration",
    "additionalInfo",
    "any"
})
public class AsymmetricEncryption {

    /**
     * List of certificates used to encrypt the symmetric key for the PSSH box.
     *
     */
    @XmlElement(name = "CertificateID", required = true)
    protected List<String> certificateID;
    /**
     * Frequency at which the device shall generate a new key to encrypt a new segment.
     * 					If not specified, key rotation is disabled.
     * 					KeyRotationDuration must be a positive duration value.
     *
     */
    @XmlElement(name = "KeyRotationDuration")
    protected Duration keyRotationDuration;
    /**
     * Additional information related to the asymmetric encryption that will be used as
     * 						part of the key encryption. A device shall support at least 256 characters.
     *
     */
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    /**
     * List of certificates used to encrypt the symmetric key for the PSSH box.
     *
     * Gets the value of the certificateID property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificateID property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCertificateID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     *
     * @return
     *     The value of the certificateID property.
     */
    public List<String> getCertificateID() {
        if (certificateID == null) {
            certificateID = new ArrayList<>();
        }
        return this.certificateID;
    }

    /**
     * Frequency at which the device shall generate a new key to encrypt a new segment.
     * 					If not specified, key rotation is disabled.
     * 					KeyRotationDuration must be a positive duration value.
     *
     * @return
     *     possible object is
     *     {@link Duration }
     *
     */
    public Duration getKeyRotationDuration() {
        return keyRotationDuration;
    }

    /**
     * Sets the value of the keyRotationDuration property.
     *
     * @param value
     *     allowed object is
     *     {@link Duration }
     *
     * @see #getKeyRotationDuration()
     */
    public void setKeyRotationDuration(Duration value) {
        this.keyRotationDuration = value;
    }

    /**
     * Additional information related to the asymmetric encryption that will be used as
     * 						part of the key encryption. A device shall support at least 256 characters.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getAdditionalInfo()
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the any property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     *
     *
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

}
