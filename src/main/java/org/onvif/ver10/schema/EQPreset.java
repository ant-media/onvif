
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EQPreset complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="EQPreset">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ScheduleToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="isFrequencyDecibelEditable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="FrequencyDecibelPair" type="{http://www.onvif.org/ver10/schema}FrequencyDecibelPair" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "EQPreset", propOrder = {
    "token",
    "name",
    "isDefault",
    "scheduleToken",
    "isFrequencyDecibelEditable",
    "frequencyDecibelPair",
    "any"
})
public class EQPreset {

    /**
     * Unique identifier for the preset.
     *
     */
    @XmlElement(name = "Token", required = true)
    protected String token;
    /**
     * Preset name. (Readonly)
     *
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * This indicates whether the EQ preset is designated as the default. When the scheduler is inactive, this preset will be applied. Only one preset can be set as the default among the EQ presets linked to an audio output. If all presets have isDefault set to false, the device may automatically select one preset as the default.
     *
     */
    protected boolean isDefault;
    /**
     * Optional schedule token (if supported).
     *
     */
    @XmlElement(name = "ScheduleToken")
    protected String scheduleToken;
    /**
     * Indicates whether the device allows changing the decibel level for frequencies. (Readonly)
     *
     */
    protected boolean isFrequencyDecibelEditable;
    /**
     * List of frequency decibel pairs, each defined by a center frequency and its corresponding decibel value.
     *
     */
    @XmlElement(name = "FrequencyDecibelPair")
    protected List<FrequencyDecibelPair> frequencyDecibelPair;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    /**
     * Unique identifier for the preset.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getToken()
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Preset name. (Readonly)
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * This indicates whether the EQ preset is designated as the default. When the scheduler is inactive, this preset will be applied. Only one preset can be set as the default among the EQ presets linked to an audio output. If all presets have isDefault set to false, the device may automatically select one preset as the default.
     *
     */
    public boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     *
     */
    public void setIsDefault(boolean value) {
        this.isDefault = value;
    }

    /**
     * Optional schedule token (if supported).
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
     * Indicates whether the device allows changing the decibel level for frequencies. (Readonly)
     *
     */
    public boolean isIsFrequencyDecibelEditable() {
        return isFrequencyDecibelEditable;
    }

    /**
     * Sets the value of the isFrequencyDecibelEditable property.
     *
     */
    public void setIsFrequencyDecibelEditable(boolean value) {
        this.isFrequencyDecibelEditable = value;
    }

    /**
     * List of frequency decibel pairs, each defined by a center frequency and its corresponding decibel value.
     *
     * Gets the value of the frequencyDecibelPair property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequencyDecibelPair property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFrequencyDecibelPair().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequencyDecibelPair }
     * </p>
     *
     *
     * @return
     *     The value of the frequencyDecibelPair property.
     */
    public List<FrequencyDecibelPair> getFrequencyDecibelPair() {
        if (frequencyDecibelPair == null) {
            frequencyDecibelPair = new ArrayList<>();
        }
        return this.frequencyDecibelPair;
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
