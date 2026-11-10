
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for StorageConfigurationData complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="StorageConfigurationData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LocalPath" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="StorageUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="User" type="{http://www.onvif.org/ver10/device/wsdl}UserCredential" minOccurs="0"/>
 *         <element name="Extension" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CertPathValidationPolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ConfigurationRenewal" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="RenewalEndpoint" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   <element name="AuthorizationServer" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *                   <element name="CertPathValidationPolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Region" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageConfigurationData", propOrder = {
    "localPath",
    "storageUri",
    "user",
    "extension",
    "certPathValidationPolicyID",
    "configurationRenewal",
    "any"
})
public class StorageConfigurationData {

    /**
     * Local path
     *
     */
    @XmlElement(name = "LocalPath")
    @XmlSchemaType(name = "anyURI")
    protected String localPath;
    /**
     * Storage server address
     *
     */
    @XmlElement(name = "StorageUri")
    @XmlSchemaType(name = "anyURI")
    protected String storageUri;
    /**
     * User credential for the storage server
     *
     */
    @XmlElement(name = "User")
    protected UserCredential user;
    @XmlElement(name = "Extension")
    protected StorageConfigurationData.Extension extension;
    /**
     * If not configured, server certificate validation behavior is undefined and the device may either apply a vendor specific default validation policy or skip validation at all.
     *
     */
    @XmlElement(name = "CertPathValidationPolicyID")
    protected String certPathValidationPolicyID;
    @XmlElement(name = "ConfigurationRenewal")
    protected StorageConfigurationData.ConfigurationRenewal configurationRenewal;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * tds:StorageType lists the acceptable values for type attribute
     *
     */
    @XmlAttribute(name = "type", required = true)
    protected String type;
    /**
     * Optional region of the storage server
     *
     */
    @XmlAttribute(name = "Region")
    protected String region;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Local path
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * Sets the value of the localPath property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getLocalPath()
     */
    public void setLocalPath(String value) {
        this.localPath = value;
    }

    /**
     * Storage server address
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStorageUri() {
        return storageUri;
    }

    /**
     * Sets the value of the storageUri property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getStorageUri()
     */
    public void setStorageUri(String value) {
        this.storageUri = value;
    }

    /**
     * User credential for the storage server
     *
     * @return
     *     possible object is
     *     {@link UserCredential }
     *
     */
    public UserCredential getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value
     *     allowed object is
     *     {@link UserCredential }
     *
     * @see #getUser()
     */
    public void setUser(UserCredential value) {
        this.user = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link StorageConfigurationData.Extension }
     *
     */
    public StorageConfigurationData.Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link StorageConfigurationData.Extension }
     *
     */
    public void setExtension(StorageConfigurationData.Extension value) {
        this.extension = value;
    }

    /**
     * If not configured, server certificate validation behavior is undefined and the device may either apply a vendor specific default validation policy or skip validation at all.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCertPathValidationPolicyID() {
        return certPathValidationPolicyID;
    }

    /**
     * Sets the value of the certPathValidationPolicyID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getCertPathValidationPolicyID()
     */
    public void setCertPathValidationPolicyID(String value) {
        this.certPathValidationPolicyID = value;
    }

    /**
     * Gets the value of the configurationRenewal property.
     *
     * @return
     *     possible object is
     *     {@link StorageConfigurationData.ConfigurationRenewal }
     *
     */
    public StorageConfigurationData.ConfigurationRenewal getConfigurationRenewal() {
        return configurationRenewal;
    }

    /**
     * Sets the value of the configurationRenewal property.
     *
     * @param value
     *     allowed object is
     *     {@link StorageConfigurationData.ConfigurationRenewal }
     *
     */
    public void setConfigurationRenewal(StorageConfigurationData.ConfigurationRenewal value) {
        this.configurationRenewal = value;
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
     * {@link Object }
     * {@link Element }
     * </p>
     *
     *
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * tds:StorageType lists the acceptable values for type attribute
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Optional region of the storage server
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getRegion()
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     *
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     *
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     *
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="RenewalEndpoint" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         <element name="AuthorizationServer" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
     *         <element name="CertPathValidationPolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "renewalEndpoint",
        "authorizationServer",
        "certPathValidationPolicyID",
        "error"
    })
    public static class ConfigurationRenewal {

        /**
         * Remote URL to be queried by the device to renew the storage configuration.
         *
         */
        @XmlElement(name = "RenewalEndpoint", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String renewalEndpoint;
        /**
         * AuthorizationServer token referring to the server that provides access tokens to authorize with the the renewal endpoint.
         *
         */
        @XmlElement(name = "AuthorizationServer", required = true)
        protected String authorizationServer;
        /**
         * CertPathValidationPolicyID used to validate the renewal endpoint server certificate.
         * 											If not configured, server certificate validation behavior is undefined and the device may either apply
         * 											a vendor specific default validation policy or skip validation at all.
         *
         */
        @XmlElement(name = "CertPathValidationPolicyID")
        protected String certPathValidationPolicyID;
        /**
         * Optional user readable error information (readonly).
         *
         */
        @XmlElement(name = "Error")
        protected String error;

        /**
         * Remote URL to be queried by the device to renew the storage configuration.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRenewalEndpoint() {
            return renewalEndpoint;
        }

        /**
         * Sets the value of the renewalEndpoint property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         * @see #getRenewalEndpoint()
         */
        public void setRenewalEndpoint(String value) {
            this.renewalEndpoint = value;
        }

        /**
         * AuthorizationServer token referring to the server that provides access tokens to authorize with the the renewal endpoint.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAuthorizationServer() {
            return authorizationServer;
        }

        /**
         * Sets the value of the authorizationServer property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         * @see #getAuthorizationServer()
         */
        public void setAuthorizationServer(String value) {
            this.authorizationServer = value;
        }

        /**
         * CertPathValidationPolicyID used to validate the renewal endpoint server certificate.
         * 											If not configured, server certificate validation behavior is undefined and the device may either apply
         * 											a vendor specific default validation policy or skip validation at all.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCertPathValidationPolicyID() {
            return certPathValidationPolicyID;
        }

        /**
         * Sets the value of the certPathValidationPolicyID property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         * @see #getCertPathValidationPolicyID()
         */
        public void setCertPathValidationPolicyID(String value) {
            this.certPathValidationPolicyID = value;
        }

        /**
         * Optional user readable error information (readonly).
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getError() {
            return error;
        }

        /**
         * Sets the value of the error property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         * @see #getError()
         */
        public void setError(String value) {
            this.error = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     *
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
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
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Extension {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

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
         * {@link Object }
         * {@link Element }
         * </p>
         *
         *
         * @return
         *     The value of the any property.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }

    }

}
