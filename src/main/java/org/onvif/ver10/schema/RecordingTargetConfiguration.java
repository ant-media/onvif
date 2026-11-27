
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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RecordingTargetConfiguration complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RecordingTargetConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Storage" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Postfix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SpanDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="SegmentDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         <element name="Encryption" type="{http://www.onvif.org/ver10/schema}RecordingEncryption" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SegmentDurationOverride" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   <element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="StorageStrategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordingTargetConfiguration", propOrder = {
    "storage",
    "format",
    "prefix",
    "postfix",
    "spanDuration",
    "segmentDuration",
    "encryption",
    "segmentDurationOverride",
    "storageStrategy",
    "any"
})
public class RecordingTargetConfiguration {

    /**
     * Token of a storage configuration.
     *
     */
    @XmlElement(name = "Storage", required = true)
    protected String storage;
    /**
     * Format of the recording.
     * 						See tt:TargetFormat for a list of definitions and capability trc:SupportedTargetFormats for the supported formats.
     *
     */
    @XmlElement(name = "Format", required = true)
    protected String format;
    /**
     * Path prefix to be inserted in the object key.
     *
     */
    @XmlElement(name = "Prefix")
    protected String prefix;
    /**
     * Path postfix to be inserted in the object key.
     *
     */
    @XmlElement(name = "Postfix")
    protected String postfix;
    /**
     * Maximum duration of a span.
     *
     */
    @XmlElement(name = "SpanDuration")
    protected Duration spanDuration;
    /**
     * Maximum duration of a segment.
     *
     */
    @XmlElement(name = "SegmentDuration", required = true)
    protected Duration segmentDuration;
    /**
     * Optional encryption configuration.
     * 						See capability trc:EncryptionEntryLimit for the number of supported entries.
     * 						By specifying multiple encryption entries per recording, different tracks can be encrypted with different configurations.
     * 						Each track shall only be contained in one encryption configuration.
     *
     */
    @XmlElement(name = "Encryption")
    protected List<RecordingEncryption> encryption;
    /**
     * Value of the active OverrideSegmentDuration parameters if one exists. (readonly)
     *
     */
    @XmlElement(name = "SegmentDurationOverride")
    protected RecordingTargetConfiguration.SegmentDurationOverride segmentDurationOverride;
    /**
     * Strategy to be used on how to store recordings, see tt:StorageStrategy for allowed values. If undefined, defaults to External.
     *
     */
    @XmlElement(name = "StorageStrategy")
    protected String storageStrategy;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Token of a storage configuration.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getStorage()
     */
    public void setStorage(String value) {
        this.storage = value;
    }

    /**
     * Format of the recording.
     * 						See tt:TargetFormat for a list of definitions and capability trc:SupportedTargetFormats for the supported formats.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getFormat()
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Path prefix to be inserted in the object key.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getPrefix()
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Path postfix to be inserted in the object key.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostfix() {
        return postfix;
    }

    /**
     * Sets the value of the postfix property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getPostfix()
     */
    public void setPostfix(String value) {
        this.postfix = value;
    }

    /**
     * Maximum duration of a span.
     *
     * @return
     *     possible object is
     *     {@link Duration }
     *
     */
    public Duration getSpanDuration() {
        return spanDuration;
    }

    /**
     * Sets the value of the spanDuration property.
     *
     * @param value
     *     allowed object is
     *     {@link Duration }
     *
     * @see #getSpanDuration()
     */
    public void setSpanDuration(Duration value) {
        this.spanDuration = value;
    }

    /**
     * Maximum duration of a segment.
     *
     * @return
     *     possible object is
     *     {@link Duration }
     *
     */
    public Duration getSegmentDuration() {
        return segmentDuration;
    }

    /**
     * Sets the value of the segmentDuration property.
     *
     * @param value
     *     allowed object is
     *     {@link Duration }
     *
     * @see #getSegmentDuration()
     */
    public void setSegmentDuration(Duration value) {
        this.segmentDuration = value;
    }

    /**
     * Optional encryption configuration.
     * 						See capability trc:EncryptionEntryLimit for the number of supported entries.
     * 						By specifying multiple encryption entries per recording, different tracks can be encrypted with different configurations.
     * 						Each track shall only be contained in one encryption configuration.
     *
     * Gets the value of the encryption property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryption property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEncryption().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordingEncryption }
     * </p>
     *
     *
     * @return
     *     The value of the encryption property.
     */
    public List<RecordingEncryption> getEncryption() {
        if (encryption == null) {
            encryption = new ArrayList<>();
        }
        return this.encryption;
    }

    /**
     * Value of the active OverrideSegmentDuration parameters if one exists. (readonly)
     *
     * @return
     *     possible object is
     *     {@link RecordingTargetConfiguration.SegmentDurationOverride }
     *
     */
    public RecordingTargetConfiguration.SegmentDurationOverride getSegmentDurationOverride() {
        return segmentDurationOverride;
    }

    /**
     * Sets the value of the segmentDurationOverride property.
     *
     * @param value
     *     allowed object is
     *     {@link RecordingTargetConfiguration.SegmentDurationOverride }
     *
     * @see #getSegmentDurationOverride()
     */
    public void setSegmentDurationOverride(RecordingTargetConfiguration.SegmentDurationOverride value) {
        this.segmentDurationOverride = value;
    }

    /**
     * Strategy to be used on how to store recordings, see tt:StorageStrategy for allowed values. If undefined, defaults to External.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStorageStrategy() {
        return storageStrategy;
    }

    /**
     * Sets the value of the storageStrategy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getStorageStrategy()
     */
    public void setStorageStrategy(String value) {
        this.storageStrategy = value;
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
     *         <element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
     *         <element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
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
        "duration",
        "expiration"
    })
    public static class SegmentDurationOverride {

        /**
         * Current value of the segment duration.
         *
         */
        @XmlElement(name = "Duration", required = true)
        protected Duration duration;
        /**
         * Time remaining until the override expires.
         *
         */
        @XmlElement(name = "Expiration", required = true)
        protected Duration expiration;

        /**
         * Current value of the segment duration.
         *
         * @return
         *     possible object is
         *     {@link Duration }
         *
         */
        public Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         *
         * @param value
         *     allowed object is
         *     {@link Duration }
         *
         * @see #getDuration()
         */
        public void setDuration(Duration value) {
            this.duration = value;
        }

        /**
         * Time remaining until the override expires.
         *
         * @return
         *     possible object is
         *     {@link Duration }
         *
         */
        public Duration getExpiration() {
            return expiration;
        }

        /**
         * Sets the value of the expiration property.
         *
         * @param value
         *     allowed object is
         *     {@link Duration }
         *
         * @see #getExpiration()
         */
        public void setExpiration(Duration value) {
            this.expiration = value;
        }

    }

}
