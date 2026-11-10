
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemCapabilities complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="SystemCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="DiscoveryResolve" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DiscoveryBye" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RemoteDiscovery" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="CloudFirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="HttpFirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="HttpSystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="HttpSystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="HttpSupportInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="StorageConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MaxStorageConfigurations" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="StorageConfigurationRenewal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="GeoLocationEntries" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="AutoGeo" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <attribute name="StorageTypesSupported" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <attribute name="DiscoveryNotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NetworkConfigNotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="UserConfigNotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Addons" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <attribute name="HardwareType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemCapabilities")
public class SystemCapabilities {

    /**
     * Indicates support for WS Discovery resolve requests.
     *
     */
    @XmlAttribute(name = "DiscoveryResolve")
    protected Boolean discoveryResolve;
    /**
     * Indicates support for WS-Discovery Bye.
     *
     */
    @XmlAttribute(name = "DiscoveryBye")
    protected Boolean discoveryBye;
    /**
     * Indicates support for remote discovery.
     *
     */
    @XmlAttribute(name = "RemoteDiscovery")
    protected Boolean remoteDiscovery;
    /**
     * Indicates support for system backup through MTOM.
     *
     */
    @XmlAttribute(name = "SystemBackup")
    protected Boolean systemBackup;
    /**
     * Indicates support for retrieval of system logging through MTOM.
     *
     */
    @XmlAttribute(name = "SystemLogging")
    protected Boolean systemLogging;
    /**
     * Indicates support for firmware upgrade through the cloud.
     *
     */
    @XmlAttribute(name = "CloudFirmwareUpgrade")
    protected Boolean cloudFirmwareUpgrade;
    /**
     * Indicates support for firmware upgrade through HTTP.
     *
     */
    @XmlAttribute(name = "HttpFirmwareUpgrade")
    protected Boolean httpFirmwareUpgrade;
    /**
     * Indicates support for system backup through HTTP.
     *
     */
    @XmlAttribute(name = "HttpSystemBackup")
    protected Boolean httpSystemBackup;
    /**
     * Indicates support for retrieval of system logging through HTTP.
     *
     */
    @XmlAttribute(name = "HttpSystemLogging")
    protected Boolean httpSystemLogging;
    /**
     * Indicates support for retrieving support information through HTTP.
     *
     */
    @XmlAttribute(name = "HttpSupportInformation")
    protected Boolean httpSupportInformation;
    /**
     * Indicates support for storage configuration interfaces.
     *
     */
    @XmlAttribute(name = "StorageConfiguration")
    protected Boolean storageConfiguration;
    /**
     * Indicates maximum number of storage configurations supported.
     *
     */
    @XmlAttribute(name = "MaxStorageConfigurations")
    protected Integer maxStorageConfigurations;
    /**
     * Indicates support for renewal of storage configuration.
     *
     */
    @XmlAttribute(name = "StorageConfigurationRenewal")
    protected Boolean storageConfigurationRenewal;
    /**
     * If present signals support for geo location. The value signals the supported number of entries.
     *
     */
    @XmlAttribute(name = "GeoLocationEntries")
    protected Integer geoLocationEntries;
    /**
     * List of supported automatic GeoLocation adjustment supported by the device. Valid items are defined by tds:AutoGeoMode.
     *
     */
    @XmlAttribute(name = "AutoGeo")
    protected List<String> autoGeo;
    /**
     * Enumerates the supported StorageTypes, see tds:StorageType.
     *
     */
    @XmlAttribute(name = "StorageTypesSupported")
    protected List<String> storageTypesSupported;
    /**
     * Indicates no support for network discovery.
     *
     */
    @XmlAttribute(name = "DiscoveryNotSupported")
    protected Boolean discoveryNotSupported;
    /**
     * Indicates no support for network configuration.
     *
     */
    @XmlAttribute(name = "NetworkConfigNotSupported")
    protected Boolean networkConfigNotSupported;
    /**
     * Indicates no support for user configuration.
     *
     */
    @XmlAttribute(name = "UserConfigNotSupported")
    protected Boolean userConfigNotSupported;
    /**
     * List of supported Addons by the device.
     *
     */
    @XmlAttribute(name = "Addons")
    protected List<String> addons;
    /**
     * Indicates what type of device this is. See tt:HardwareTypes for available options.
     *
     */
    @XmlAttribute(name = "HardwareType")
    protected String hardwareType;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates support for WS Discovery resolve requests.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDiscoveryResolve() {
        return discoveryResolve;
    }

    /**
     * Sets the value of the discoveryResolve property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isDiscoveryResolve()
     */
    public void setDiscoveryResolve(Boolean value) {
        this.discoveryResolve = value;
    }

    /**
     * Indicates support for WS-Discovery Bye.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDiscoveryBye() {
        return discoveryBye;
    }

    /**
     * Sets the value of the discoveryBye property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isDiscoveryBye()
     */
    public void setDiscoveryBye(Boolean value) {
        this.discoveryBye = value;
    }

    /**
     * Indicates support for remote discovery.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRemoteDiscovery() {
        return remoteDiscovery;
    }

    /**
     * Sets the value of the remoteDiscovery property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isRemoteDiscovery()
     */
    public void setRemoteDiscovery(Boolean value) {
        this.remoteDiscovery = value;
    }

    /**
     * Indicates support for system backup through MTOM.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSystemBackup() {
        return systemBackup;
    }

    /**
     * Sets the value of the systemBackup property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isSystemBackup()
     */
    public void setSystemBackup(Boolean value) {
        this.systemBackup = value;
    }

    /**
     * Indicates support for retrieval of system logging through MTOM.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSystemLogging() {
        return systemLogging;
    }

    /**
     * Sets the value of the systemLogging property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isSystemLogging()
     */
    public void setSystemLogging(Boolean value) {
        this.systemLogging = value;
    }

    /**
     * Indicates support for firmware upgrade through the cloud.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCloudFirmwareUpgrade() {
        return cloudFirmwareUpgrade;
    }

    /**
     * Sets the value of the cloudFirmwareUpgrade property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isCloudFirmwareUpgrade()
     */
    public void setCloudFirmwareUpgrade(Boolean value) {
        this.cloudFirmwareUpgrade = value;
    }

    /**
     * Indicates support for firmware upgrade through HTTP.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isHttpFirmwareUpgrade() {
        return httpFirmwareUpgrade;
    }

    /**
     * Sets the value of the httpFirmwareUpgrade property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isHttpFirmwareUpgrade()
     */
    public void setHttpFirmwareUpgrade(Boolean value) {
        this.httpFirmwareUpgrade = value;
    }

    /**
     * Indicates support for system backup through HTTP.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isHttpSystemBackup() {
        return httpSystemBackup;
    }

    /**
     * Sets the value of the httpSystemBackup property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isHttpSystemBackup()
     */
    public void setHttpSystemBackup(Boolean value) {
        this.httpSystemBackup = value;
    }

    /**
     * Indicates support for retrieval of system logging through HTTP.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isHttpSystemLogging() {
        return httpSystemLogging;
    }

    /**
     * Sets the value of the httpSystemLogging property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isHttpSystemLogging()
     */
    public void setHttpSystemLogging(Boolean value) {
        this.httpSystemLogging = value;
    }

    /**
     * Indicates support for retrieving support information through HTTP.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isHttpSupportInformation() {
        return httpSupportInformation;
    }

    /**
     * Sets the value of the httpSupportInformation property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isHttpSupportInformation()
     */
    public void setHttpSupportInformation(Boolean value) {
        this.httpSupportInformation = value;
    }

    /**
     * Indicates support for storage configuration interfaces.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isStorageConfiguration() {
        return storageConfiguration;
    }

    /**
     * Sets the value of the storageConfiguration property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isStorageConfiguration()
     */
    public void setStorageConfiguration(Boolean value) {
        this.storageConfiguration = value;
    }

    /**
     * Indicates maximum number of storage configurations supported.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMaxStorageConfigurations() {
        return maxStorageConfigurations;
    }

    /**
     * Sets the value of the maxStorageConfigurations property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getMaxStorageConfigurations()
     */
    public void setMaxStorageConfigurations(Integer value) {
        this.maxStorageConfigurations = value;
    }

    /**
     * Indicates support for renewal of storage configuration.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isStorageConfigurationRenewal() {
        return storageConfigurationRenewal;
    }

    /**
     * Sets the value of the storageConfigurationRenewal property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isStorageConfigurationRenewal()
     */
    public void setStorageConfigurationRenewal(Boolean value) {
        this.storageConfigurationRenewal = value;
    }

    /**
     * If present signals support for geo location. The value signals the supported number of entries.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getGeoLocationEntries() {
        return geoLocationEntries;
    }

    /**
     * Sets the value of the geoLocationEntries property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getGeoLocationEntries()
     */
    public void setGeoLocationEntries(Integer value) {
        this.geoLocationEntries = value;
    }

    /**
     * List of supported automatic GeoLocation adjustment supported by the device. Valid items are defined by tds:AutoGeoMode.
     *
     * Gets the value of the autoGeo property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoGeo property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAutoGeo().add(newItem);
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
     *     The value of the autoGeo property.
     */
    public List<String> getAutoGeo() {
        if (autoGeo == null) {
            autoGeo = new ArrayList<>();
        }
        return this.autoGeo;
    }

    /**
     * Enumerates the supported StorageTypes, see tds:StorageType.
     *
     * Gets the value of the storageTypesSupported property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageTypesSupported property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStorageTypesSupported().add(newItem);
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
     *     The value of the storageTypesSupported property.
     */
    public List<String> getStorageTypesSupported() {
        if (storageTypesSupported == null) {
            storageTypesSupported = new ArrayList<>();
        }
        return this.storageTypesSupported;
    }

    /**
     * Indicates no support for network discovery.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDiscoveryNotSupported() {
        return discoveryNotSupported;
    }

    /**
     * Sets the value of the discoveryNotSupported property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isDiscoveryNotSupported()
     */
    public void setDiscoveryNotSupported(Boolean value) {
        this.discoveryNotSupported = value;
    }

    /**
     * Indicates no support for network configuration.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isNetworkConfigNotSupported() {
        return networkConfigNotSupported;
    }

    /**
     * Sets the value of the networkConfigNotSupported property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isNetworkConfigNotSupported()
     */
    public void setNetworkConfigNotSupported(Boolean value) {
        this.networkConfigNotSupported = value;
    }

    /**
     * Indicates no support for user configuration.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isUserConfigNotSupported() {
        return userConfigNotSupported;
    }

    /**
     * Sets the value of the userConfigNotSupported property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isUserConfigNotSupported()
     */
    public void setUserConfigNotSupported(Boolean value) {
        this.userConfigNotSupported = value;
    }

    /**
     * List of supported Addons by the device.
     *
     * Gets the value of the addons property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addons property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddons().add(newItem);
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
     *     The value of the addons property.
     */
    public List<String> getAddons() {
        if (addons == null) {
            addons = new ArrayList<>();
        }
        return this.addons;
    }

    /**
     * Indicates what type of device this is. See tt:HardwareTypes for available options.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHardwareType() {
        return hardwareType;
    }

    /**
     * Sets the value of the hardwareType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getHardwareType()
     */
    public void setHardwareType(String value) {
        this.hardwareType = value;
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

}
