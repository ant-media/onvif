
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RecordingJobConfiguration complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RecordingJobConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}RecordingJobMode"/>
 *         <element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Source" type="{http://www.onvif.org/ver10/schema}RecordingJobSource" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}RecordingJobConfigurationExtension" minOccurs="0"/>
 *         <element name="EventFilter" type="{http://www.onvif.org/ver10/schema}RecordingEventFilter" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ScheduleToken" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordingJobConfiguration", propOrder = {
    "recordingToken",
    "mode",
    "priority",
    "source",
    "extension",
    "eventFilter",
    "any"
})
public class RecordingJobConfiguration {

    /**
     * Identifies the recording to which this job shall store the received data.
     *
     */
    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;
    /**
     * The mode of the job. If it is idle, nothing shall happen. If it is active, the device shall try
     * 				to obtain data from the receivers. A client shall use GetRecordingJobState to determine if data transfer is really taking place.
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     *
     * 				The only valid values for Mode shall be "Idle" and "Active".
     *
     */
    @XmlElement(name = "Mode", required = true)
    protected String mode;
    /**
     * This shall be a non-negative number. If there are multiple recording jobs that store data to
     * 				the same track, the device will only store the data for the recording job with the highest
     * 				priority. The priority is specified per recording job, but the device shall determine the priority
     * 				of each track individually. If there are two recording jobs with the same priority, the device
     * 				shall record the data corresponding to the recording job that was activated the latest.
     *
     */
    @XmlElement(name = "Priority")
    protected int priority;
    /**
     * Source of the recording.
     *
     */
    @XmlElement(name = "Source")
    protected List<RecordingJobSource> source;
    @XmlElement(name = "Extension")
    protected RecordingJobConfigurationExtension extension;
    /**
     * Optional filter defining on which event condition a recording job gets active.
     *
     */
    @XmlElement(name = "EventFilter")
    protected RecordingEventFilter eventFilter;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * This attribute adds an additional requirement for activating the recording job.
     * 				If this optional field is provided the job shall only record if the schedule exists and is active.
     *
     */
    @XmlAttribute(name = "ScheduleToken")
    @XmlSchemaType(name = "anySimpleType")
    protected String scheduleToken;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Identifies the recording to which this job shall store the received data.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRecordingToken() {
        return recordingToken;
    }

    /**
     * Sets the value of the recordingToken property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getRecordingToken()
     */
    public void setRecordingToken(String value) {
        this.recordingToken = value;
    }

    /**
     * The mode of the job. If it is idle, nothing shall happen. If it is active, the device shall try
     * 				to obtain data from the receivers. A client shall use GetRecordingJobState to determine if data transfer is really taking place.
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     *
     * 				The only valid values for Mode shall be "Idle" and "Active".
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getMode()
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * This shall be a non-negative number. If there are multiple recording jobs that store data to
     * 				the same track, the device will only store the data for the recording job with the highest
     * 				priority. The priority is specified per recording job, but the device shall determine the priority
     * 				of each track individually. If there are two recording jobs with the same priority, the device
     * 				shall record the data corresponding to the recording job that was activated the latest.
     *
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     *
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Source of the recording.
     *
     * Gets the value of the source property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSource().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordingJobSource }
     * </p>
     *
     *
     * @return
     *     The value of the source property.
     */
    public List<RecordingJobSource> getSource() {
        if (source == null) {
            source = new ArrayList<>();
        }
        return this.source;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link RecordingJobConfigurationExtension }
     *
     */
    public RecordingJobConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link RecordingJobConfigurationExtension }
     *
     */
    public void setExtension(RecordingJobConfigurationExtension value) {
        this.extension = value;
    }

    /**
     * Optional filter defining on which event condition a recording job gets active.
     *
     * @return
     *     possible object is
     *     {@link RecordingEventFilter }
     *
     */
    public RecordingEventFilter getEventFilter() {
        return eventFilter;
    }

    /**
     * Sets the value of the eventFilter property.
     *
     * @param value
     *     allowed object is
     *     {@link RecordingEventFilter }
     *
     * @see #getEventFilter()
     */
    public void setEventFilter(RecordingEventFilter value) {
        this.eventFilter = value;
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
     * This attribute adds an additional requirement for activating the recording job.
     * 				If this optional field is provided the job shall only record if the schedule exists and is active.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScheduleToken() {
        return scheduleToken;
    }

    /**
     * Sets the value of the scheduleToken property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getScheduleToken()
     */
    public void setScheduleToken(String value) {
        this.scheduleToken = value;
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
