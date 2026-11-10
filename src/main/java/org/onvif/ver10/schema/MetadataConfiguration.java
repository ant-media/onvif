
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.Duration;
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
 * <p>Java class for MetadataConfiguration complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="MetadataConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       <sequence>
 *         <element name="PTZStatus" type="{http://www.onvif.org/ver10/schema}PTZFilter" minOccurs="0"/>
 *         <element name="Events" type="{http://www.onvif.org/ver10/schema}EventSubscription" minOccurs="0"/>
 *         <element name="Analytics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration"/>
 *         <element name="SessionTimeout" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AnalyticsEngineConfiguration" type="{http://www.onvif.org/ver10/schema}AnalyticsEngineConfiguration" minOccurs="0"/>
 *         <element name="SensorData" type="{http://www.onvif.org/ver10/schema}SensorDataFilter" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}MetadataConfigurationExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="CompressionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="GeoLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ShapePolygon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SecureStreamingProtocolAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataConfiguration", propOrder = {
    "ptzStatus",
    "events",
    "analytics",
    "multicast",
    "sessionTimeout",
    "any",
    "analyticsEngineConfiguration",
    "sensorData",
    "extension"
})
public class MetadataConfiguration
    extends ConfigurationEntity
{

    /**
     * Optional element to configure which PTZ related data is to include in the metadata stream.
     *
     */
    @XmlElement(name = "PTZStatus")
    protected PTZFilter ptzStatus;
    /**
     * Optional element to configure the streaming of events. A client might be interested in receiving all,
     * 								none or some of the events produced by the device:
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
     * 									&lt;li&gt;To get all events: Include the Events element but do not include a filter.&lt;/li&gt;
     * 									&lt;li&gt;To get no events: Do not include the Events element.&lt;/li&gt;
     * 									&lt;li&gt;To get only some events: Include the Events element and include a filter in the element.&lt;/li&gt;
     * 								&lt;/ul&gt;
     * </pre>
     *
     */
    @XmlElement(name = "Events")
    protected EventSubscription events;
    /**
     * Defines whether the streamed metadata will include metadata from the analytics engines (video, cell motion, audio etc.)
     *
     */
    @XmlElement(name = "Analytics")
    protected Boolean analytics;
    /**
     * Defines the multicast settings that could be used for video streaming.
     *
     */
    @XmlElement(name = "Multicast", required = true)
    protected MulticastConfiguration multicast;
    /**
     * The rtsp session timeout for the related audio stream (when using Media2 Service, this value is deprecated and ignored)
     *
     */
    @XmlElement(name = "SessionTimeout", required = true)
    protected Duration sessionTimeout;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Indication which AnalyticsModules shall output metadata.
     * 							Note that the streaming behavior is undefined if the list includes items that are not part of the associated AnalyticsConfiguration.
     *
     */
    @XmlElement(name = "AnalyticsEngineConfiguration")
    protected AnalyticsEngineConfiguration analyticsEngineConfiguration;
    /**
     * Optional element to configure which sensor data is to include in the metadata stream. A client might be interested in receiving all,
     * 								none or some of the sensor data produced by the device:
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
     * 									&lt;li&gt;To get all sensor data: Include the SensorData element but do not include any filter criteria.&lt;/li&gt;
     * 									&lt;li&gt;To get no sensor data: Do not include the SensorData element.&lt;/li&gt;
     * 									&lt;li&gt;To get only some sensor data: Include the SensorData element and specify filter criteria (SensorID list, Type list, etc.).&lt;/li&gt;
     * 								&lt;/ul&gt;
     * </pre>
     *
     */
    @XmlElement(name = "SensorData")
    protected SensorDataFilter sensorData;
    @XmlElement(name = "Extension")
    protected MetadataConfigurationExtension extension;
    /**
     * Optional parameter to configure compression type of Metadata payload. Use values from enumeration MetadataCompressionType.
     *
     */
    @XmlAttribute(name = "CompressionType")
    protected String compressionType;
    /**
     * Optional parameter to configure if the metadata stream shall contain the Geo Location coordinates of each target.
     *
     */
    @XmlAttribute(name = "GeoLocation")
    protected Boolean geoLocation;
    /**
     * Optional parameter to configure if the generated metadata stream should contain shape information as polygon.
     *
     */
    @XmlAttribute(name = "ShapePolygon")
    protected Boolean shapePolygon;
    /**
     * The cryptographic algorithm used as defined by tt:SrtpSecurityAlgorithms
     *
     */
    @XmlAttribute(name = "SecureStreamingProtocolAlgorithm")
    protected String secureStreamingProtocolAlgorithm;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Optional element to configure which PTZ related data is to include in the metadata stream.
     *
     * @return
     *     possible object is
     *     {@link PTZFilter }
     *
     */
    public PTZFilter getPTZStatus() {
        return ptzStatus;
    }

    /**
     * Sets the value of the ptzStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link PTZFilter }
     *
     * @see #getPTZStatus()
     */
    public void setPTZStatus(PTZFilter value) {
        this.ptzStatus = value;
    }

    /**
     * Optional element to configure the streaming of events. A client might be interested in receiving all,
     * 								none or some of the events produced by the device:
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
     * 									&lt;li&gt;To get all events: Include the Events element but do not include a filter.&lt;/li&gt;
     * 									&lt;li&gt;To get no events: Do not include the Events element.&lt;/li&gt;
     * 									&lt;li&gt;To get only some events: Include the Events element and include a filter in the element.&lt;/li&gt;
     * 								&lt;/ul&gt;
     * </pre>
     *
     * @return
     *     possible object is
     *     {@link EventSubscription }
     *
     */
    public EventSubscription getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     *
     * @param value
     *     allowed object is
     *     {@link EventSubscription }
     *
     * @see #getEvents()
     */
    public void setEvents(EventSubscription value) {
        this.events = value;
    }

    /**
     * Defines whether the streamed metadata will include metadata from the analytics engines (video, cell motion, audio etc.)
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isAnalytics() {
        return analytics;
    }

    /**
     * Sets the value of the analytics property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isAnalytics()
     */
    public void setAnalytics(Boolean value) {
        this.analytics = value;
    }

    /**
     * Defines the multicast settings that could be used for video streaming.
     *
     * @return
     *     possible object is
     *     {@link MulticastConfiguration }
     *
     */
    public MulticastConfiguration getMulticast() {
        return multicast;
    }

    /**
     * Sets the value of the multicast property.
     *
     * @param value
     *     allowed object is
     *     {@link MulticastConfiguration }
     *
     * @see #getMulticast()
     */
    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }

    /**
     * The rtsp session timeout for the related audio stream (when using Media2 Service, this value is deprecated and ignored)
     *
     * @return
     *     possible object is
     *     {@link Duration }
     *
     */
    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * Sets the value of the sessionTimeout property.
     *
     * @param value
     *     allowed object is
     *     {@link Duration }
     *
     * @see #getSessionTimeout()
     */
    public void setSessionTimeout(Duration value) {
        this.sessionTimeout = value;
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
     * Indication which AnalyticsModules shall output metadata.
     * 							Note that the streaming behavior is undefined if the list includes items that are not part of the associated AnalyticsConfiguration.
     *
     * @return
     *     possible object is
     *     {@link AnalyticsEngineConfiguration }
     *
     */
    public AnalyticsEngineConfiguration getAnalyticsEngineConfiguration() {
        return analyticsEngineConfiguration;
    }

    /**
     * Sets the value of the analyticsEngineConfiguration property.
     *
     * @param value
     *     allowed object is
     *     {@link AnalyticsEngineConfiguration }
     *
     * @see #getAnalyticsEngineConfiguration()
     */
    public void setAnalyticsEngineConfiguration(AnalyticsEngineConfiguration value) {
        this.analyticsEngineConfiguration = value;
    }

    /**
     * Optional element to configure which sensor data is to include in the metadata stream. A client might be interested in receiving all,
     * 								none or some of the sensor data produced by the device:
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
     * 									&lt;li&gt;To get all sensor data: Include the SensorData element but do not include any filter criteria.&lt;/li&gt;
     * 									&lt;li&gt;To get no sensor data: Do not include the SensorData element.&lt;/li&gt;
     * 									&lt;li&gt;To get only some sensor data: Include the SensorData element and specify filter criteria (SensorID list, Type list, etc.).&lt;/li&gt;
     * 								&lt;/ul&gt;
     * </pre>
     *
     * @return
     *     possible object is
     *     {@link SensorDataFilter }
     *
     */
    public SensorDataFilter getSensorData() {
        return sensorData;
    }

    /**
     * Sets the value of the sensorData property.
     *
     * @param value
     *     allowed object is
     *     {@link SensorDataFilter }
     *
     * @see #getSensorData()
     */
    public void setSensorData(SensorDataFilter value) {
        this.sensorData = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link MetadataConfigurationExtension }
     *
     */
    public MetadataConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link MetadataConfigurationExtension }
     *
     */
    public void setExtension(MetadataConfigurationExtension value) {
        this.extension = value;
    }

    /**
     * Optional parameter to configure compression type of Metadata payload. Use values from enumeration MetadataCompressionType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompressionType() {
        return compressionType;
    }

    /**
     * Sets the value of the compressionType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getCompressionType()
     */
    public void setCompressionType(String value) {
        this.compressionType = value;
    }

    /**
     * Optional parameter to configure if the metadata stream shall contain the Geo Location coordinates of each target.
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
     * Optional parameter to configure if the generated metadata stream should contain shape information as polygon.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isShapePolygon() {
        return shapePolygon;
    }

    /**
     * Sets the value of the shapePolygon property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isShapePolygon()
     */
    public void setShapePolygon(Boolean value) {
        this.shapePolygon = value;
    }

    /**
     * The cryptographic algorithm used as defined by tt:SrtpSecurityAlgorithms
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSecureStreamingProtocolAlgorithm() {
        return secureStreamingProtocolAlgorithm;
    }

    /**
     * Sets the value of the secureStreamingProtocolAlgorithm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getSecureStreamingProtocolAlgorithm()
     */
    public void setSecureStreamingProtocolAlgorithm(String value) {
        this.secureStreamingProtocolAlgorithm = value;
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
