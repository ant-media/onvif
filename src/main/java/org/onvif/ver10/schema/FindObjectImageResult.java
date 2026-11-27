
package org.onvif.ver10.schema;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindObjectImageResult complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FindObjectImageResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ObjectUUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TargetImageURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="Similarity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindObjectImageResult", propOrder = {
    "objectUUID",
    "targetImageURI",
    "time",
    "similarity",
    "recordingToken"
})
public class FindObjectImageResult {

    /**
     * Object unique identifier.
     *
     */
    @XmlElement(name = "ObjectUUID", required = true)
    protected String objectUUID;
    /**
     * The URI of the detected target object image stored in the Target Image repository (LocalStorage format).
     *
     */
    @XmlElement(name = "TargetImageURI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String targetImageURI;
    /**
     * The time when the target was found. Users can use this as a reference point to search records that occurred before and after this specific time point.
     *
     */
    @XmlElement(name = "Time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    /**
     * It represents the similarity between two vectors, which is used to measure the similarity of the directions of the vectors. The closer the value is to 1, the higher the similarity; the closer the value is to 0, the lower the similarity.
     *
     */
    @XmlElement(name = "Similarity")
    protected float similarity;
    /**
     * The recording where this result was found.
     *
     */
    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;

    /**
     * Object unique identifier.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getObjectUUID() {
        return objectUUID;
    }

    /**
     * Sets the value of the objectUUID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getObjectUUID()
     */
    public void setObjectUUID(String value) {
        this.objectUUID = value;
    }

    /**
     * The URI of the detected target object image stored in the Target Image repository (LocalStorage format).
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTargetImageURI() {
        return targetImageURI;
    }

    /**
     * Sets the value of the targetImageURI property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getTargetImageURI()
     */
    public void setTargetImageURI(String value) {
        this.targetImageURI = value;
    }

    /**
     * The time when the target was found. Users can use this as a reference point to search records that occurred before and after this specific time point.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     * @see #getTime()
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * It represents the similarity between two vectors, which is used to measure the similarity of the directions of the vectors. The closer the value is to 1, the higher the similarity; the closer the value is to 0, the lower the similarity.
     *
     */
    public float getSimilarity() {
        return similarity;
    }

    /**
     * Sets the value of the similarity property.
     *
     */
    public void setSimilarity(float value) {
        this.similarity = value;
    }

    /**
     * The recording where this result was found.
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

}
