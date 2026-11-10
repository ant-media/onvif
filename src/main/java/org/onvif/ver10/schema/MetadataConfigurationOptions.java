
package org.onvif.ver10.schema;

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
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for MetadataConfigurationOptions complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="MetadataConfigurationOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PTZStatusFilterOptions" type="{http://www.onvif.org/ver10/schema}PTZStatusFilterOptions"/>
 *         <element name="SensorDataFilterOptions" type="{http://www.onvif.org/ver10/schema}SensorDataFilterOptions" minOccurs="0"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}MetadataConfigurationOptionsExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="GeoLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MaxContentFilterSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="SecureStreamingProtocolAlgorithms" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataConfigurationOptions", propOrder = {
    "ptzStatusFilterOptions",
    "sensorDataFilterOptions",
    "any",
    "extension"
})
public class MetadataConfigurationOptions {

    @XmlElement(name = "PTZStatusFilterOptions", required = true)
    protected PTZStatusFilterOptions ptzStatusFilterOptions;
    /**
     * Optional element indicating the sensor data filtering capabilities of the device.
     *
     */
    @XmlElement(name = "SensorDataFilterOptions")
    protected SensorDataFilterOptions sensorDataFilterOptions;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "Extension")
    protected MetadataConfigurationOptionsExtension extension;
    /**
     * True if the device is able to stream the Geo Located positions of each target.
     *
     */
    @XmlAttribute(name = "GeoLocation")
    protected Boolean geoLocation;
    /**
     * A device signalling support for content filtering shall support expressions with the provided expression size.
     *
     */
    @XmlAttribute(name = "MaxContentFilterSize")
    protected Integer maxContentFilterSize;
    /**
     * If secure RTSP streaming is supported, this shall return the list of supported cryptographic algorithms as defined by tt:SrtpSecurityAlgorithms.
     *
     */
    @XmlAttribute(name = "SecureStreamingProtocolAlgorithms")
    protected List<String> secureStreamingProtocolAlgorithms;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the ptzStatusFilterOptions property.
     *
     * @return
     *     possible object is
     *     {@link PTZStatusFilterOptions }
     *
     */
    public PTZStatusFilterOptions getPTZStatusFilterOptions() {
        return ptzStatusFilterOptions;
    }

    /**
     * Sets the value of the ptzStatusFilterOptions property.
     *
     * @param value
     *     allowed object is
     *     {@link PTZStatusFilterOptions }
     *
     */
    public void setPTZStatusFilterOptions(PTZStatusFilterOptions value) {
        this.ptzStatusFilterOptions = value;
    }

    /**
     * Optional element indicating the sensor data filtering capabilities of the device.
     *
     * @return
     *     possible object is
     *     {@link SensorDataFilterOptions }
     *
     */
    public SensorDataFilterOptions getSensorDataFilterOptions() {
        return sensorDataFilterOptions;
    }

    /**
     * Sets the value of the sensorDataFilterOptions property.
     *
     * @param value
     *     allowed object is
     *     {@link SensorDataFilterOptions }
     *
     * @see #getSensorDataFilterOptions()
     */
    public void setSensorDataFilterOptions(SensorDataFilterOptions value) {
        this.sensorDataFilterOptions = value;
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

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link MetadataConfigurationOptionsExtension }
     *
     */
    public MetadataConfigurationOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link MetadataConfigurationOptionsExtension }
     *
     */
    public void setExtension(MetadataConfigurationOptionsExtension value) {
        this.extension = value;
    }

    /**
     * True if the device is able to stream the Geo Located positions of each target.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isGeoLocation()
     */
    public void setGeoLocation(Boolean value) {
        this.geoLocation = value;
    }

    /**
     * A device signalling support for content filtering shall support expressions with the provided expression size.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMaxContentFilterSize() {
        return maxContentFilterSize;
    }

    /**
     * Sets the value of the maxContentFilterSize property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getMaxContentFilterSize()
     */
    public void setMaxContentFilterSize(Integer value) {
        this.maxContentFilterSize = value;
    }

    /**
     * If secure RTSP streaming is supported, this shall return the list of supported cryptographic algorithms as defined by tt:SrtpSecurityAlgorithms.
     *
     * Gets the value of the secureStreamingProtocolAlgorithms property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secureStreamingProtocolAlgorithms property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSecureStreamingProtocolAlgorithms().add(newItem);
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
     *     The value of the secureStreamingProtocolAlgorithms property.
     */
    public List<String> getSecureStreamingProtocolAlgorithms() {
        if (secureStreamingProtocolAlgorithms == null) {
            secureStreamingProtocolAlgorithms = new ArrayList<>();
        }
        return this.secureStreamingProtocolAlgorithms;
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
