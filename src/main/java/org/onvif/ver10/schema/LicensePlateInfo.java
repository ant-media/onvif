
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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LicensePlateInfo complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="LicensePlateInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PlateNumber" type="{http://www.onvif.org/ver10/schema}StringLikelihood"/>
 *         <element name="PlateType" type="{http://www.onvif.org/ver10/schema}StringLikelihood" minOccurs="0"/>
 *         <element name="CountryCode" type="{http://www.onvif.org/ver10/schema}StringLikelihood" minOccurs="0"/>
 *         <element name="IssuingEntity" type="{http://www.onvif.org/ver10/schema}StringLikelihood" minOccurs="0"/>
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
@XmlType(name = "LicensePlateInfo", propOrder = {
    "plateNumber",
    "plateType",
    "countryCode",
    "issuingEntity",
    "any"
})
public class LicensePlateInfo {

    /**
     * A string of vehicle license plate number.
     *
     */
    @XmlElement(name = "PlateNumber", required = true)
    protected StringLikelihood plateNumber;
    /**
     * A description of the vehicle license plate, e.g., "Normal", "Police", "Diplomat"
     *
     */
    @XmlElement(name = "PlateType")
    protected StringLikelihood plateType;
    /**
     * Describe the country of the license plate, in order to avoid the same license plate number.
     *
     */
    @XmlElement(name = "CountryCode")
    protected StringLikelihood countryCode;
    /**
     * State province or authority that issue the license plate.
     *
     */
    @XmlElement(name = "IssuingEntity")
    protected StringLikelihood issuingEntity;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * A string of vehicle license plate number.
     *
     * @return
     *     possible object is
     *     {@link StringLikelihood }
     *
     */
    public StringLikelihood getPlateNumber() {
        return plateNumber;
    }

    /**
     * Sets the value of the plateNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link StringLikelihood }
     *
     * @see #getPlateNumber()
     */
    public void setPlateNumber(StringLikelihood value) {
        this.plateNumber = value;
    }

    /**
     * A description of the vehicle license plate, e.g., "Normal", "Police", "Diplomat"
     *
     * @return
     *     possible object is
     *     {@link StringLikelihood }
     *
     */
    public StringLikelihood getPlateType() {
        return plateType;
    }

    /**
     * Sets the value of the plateType property.
     *
     * @param value
     *     allowed object is
     *     {@link StringLikelihood }
     *
     * @see #getPlateType()
     */
    public void setPlateType(StringLikelihood value) {
        this.plateType = value;
    }

    /**
     * Describe the country of the license plate, in order to avoid the same license plate number.
     *
     * @return
     *     possible object is
     *     {@link StringLikelihood }
     *
     */
    public StringLikelihood getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     *
     * @param value
     *     allowed object is
     *     {@link StringLikelihood }
     *
     * @see #getCountryCode()
     */
    public void setCountryCode(StringLikelihood value) {
        this.countryCode = value;
    }

    /**
     * State province or authority that issue the license plate.
     *
     * @return
     *     possible object is
     *     {@link StringLikelihood }
     *
     */
    public StringLikelihood getIssuingEntity() {
        return issuingEntity;
    }

    /**
     * Sets the value of the issuingEntity property.
     *
     * @param value
     *     allowed object is
     *     {@link StringLikelihood }
     *
     * @see #getIssuingEntity()
     */
    public void setIssuingEntity(StringLikelihood value) {
        this.issuingEntity = value;
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

}
