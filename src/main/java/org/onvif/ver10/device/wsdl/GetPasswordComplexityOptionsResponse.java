
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.IntRange;


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
 *         <element name="MinLenRange" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/>
 *         <element name="UppercaseRange" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/>
 *         <element name="NumberRange" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/>
 *         <element name="SpecialCharsRange" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/>
 *         <element name="BlockUsernameOccurrenceSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PolicyConfigurationLockSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "minLenRange",
    "uppercaseRange",
    "numberRange",
    "specialCharsRange",
    "blockUsernameOccurrenceSupported",
    "policyConfigurationLockSupported"
})
@XmlRootElement(name = "GetPasswordComplexityOptionsResponse")
public class GetPasswordComplexityOptionsResponse {

    @XmlElement(name = "MinLenRange")
    protected IntRange minLenRange;
    @XmlElement(name = "UppercaseRange")
    protected IntRange uppercaseRange;
    @XmlElement(name = "NumberRange")
    protected IntRange numberRange;
    @XmlElement(name = "SpecialCharsRange")
    protected IntRange specialCharsRange;
    @XmlElement(name = "BlockUsernameOccurrenceSupported")
    protected Boolean blockUsernameOccurrenceSupported;
    @XmlElement(name = "PolicyConfigurationLockSupported")
    protected Boolean policyConfigurationLockSupported;

    /**
     * Gets the value of the minLenRange property.
     *
     * @return
     *     possible object is
     *     {@link IntRange }
     *
     */
    public IntRange getMinLenRange() {
        return minLenRange;
    }

    /**
     * Sets the value of the minLenRange property.
     *
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *
     */
    public void setMinLenRange(IntRange value) {
        this.minLenRange = value;
    }

    /**
     * Gets the value of the uppercaseRange property.
     *
     * @return
     *     possible object is
     *     {@link IntRange }
     *
     */
    public IntRange getUppercaseRange() {
        return uppercaseRange;
    }

    /**
     * Sets the value of the uppercaseRange property.
     *
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *
     */
    public void setUppercaseRange(IntRange value) {
        this.uppercaseRange = value;
    }

    /**
     * Gets the value of the numberRange property.
     *
     * @return
     *     possible object is
     *     {@link IntRange }
     *
     */
    public IntRange getNumberRange() {
        return numberRange;
    }

    /**
     * Sets the value of the numberRange property.
     *
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *
     */
    public void setNumberRange(IntRange value) {
        this.numberRange = value;
    }

    /**
     * Gets the value of the specialCharsRange property.
     *
     * @return
     *     possible object is
     *     {@link IntRange }
     *
     */
    public IntRange getSpecialCharsRange() {
        return specialCharsRange;
    }

    /**
     * Sets the value of the specialCharsRange property.
     *
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *
     */
    public void setSpecialCharsRange(IntRange value) {
        this.specialCharsRange = value;
    }

    /**
     * Gets the value of the blockUsernameOccurrenceSupported property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isBlockUsernameOccurrenceSupported() {
        return blockUsernameOccurrenceSupported;
    }

    /**
     * Sets the value of the blockUsernameOccurrenceSupported property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setBlockUsernameOccurrenceSupported(Boolean value) {
        this.blockUsernameOccurrenceSupported = value;
    }

    /**
     * Gets the value of the policyConfigurationLockSupported property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isPolicyConfigurationLockSupported() {
        return policyConfigurationLockSupported;
    }

    /**
     * Sets the value of the policyConfigurationLockSupported property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPolicyConfigurationLockSupported(Boolean value) {
        this.policyConfigurationLockSupported = value;
    }

}
