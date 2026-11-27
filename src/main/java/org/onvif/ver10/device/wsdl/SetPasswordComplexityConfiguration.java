
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="MinLen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Uppercase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SpecialChars" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BlockUsernameOccurrence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PolicyConfigurationLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "minLen",
    "uppercase",
    "number",
    "specialChars",
    "blockUsernameOccurrence",
    "policyConfigurationLocked"
})
@XmlRootElement(name = "SetPasswordComplexityConfiguration")
public class SetPasswordComplexityConfiguration {

    @XmlElement(name = "MinLen")
    protected Integer minLen;
    @XmlElement(name = "Uppercase")
    protected Integer uppercase;
    @XmlElement(name = "Number")
    protected Integer number;
    @XmlElement(name = "SpecialChars")
    protected Integer specialChars;
    @XmlElement(name = "BlockUsernameOccurrence")
    protected Boolean blockUsernameOccurrence;
    @XmlElement(name = "PolicyConfigurationLocked")
    protected Boolean policyConfigurationLocked;

    /**
     * Gets the value of the minLen property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMinLen() {
        return minLen;
    }

    /**
     * Sets the value of the minLen property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMinLen(Integer value) {
        this.minLen = value;
    }

    /**
     * Gets the value of the uppercase property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getUppercase() {
        return uppercase;
    }

    /**
     * Sets the value of the uppercase property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setUppercase(Integer value) {
        this.uppercase = value;
    }

    /**
     * Gets the value of the number property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the specialChars property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSpecialChars() {
        return specialChars;
    }

    /**
     * Sets the value of the specialChars property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSpecialChars(Integer value) {
        this.specialChars = value;
    }

    /**
     * Gets the value of the blockUsernameOccurrence property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isBlockUsernameOccurrence() {
        return blockUsernameOccurrence;
    }

    /**
     * Sets the value of the blockUsernameOccurrence property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setBlockUsernameOccurrence(Boolean value) {
        this.blockUsernameOccurrence = value;
    }

    /**
     * Gets the value of the policyConfigurationLocked property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isPolicyConfigurationLocked() {
        return policyConfigurationLocked;
    }

    /**
     * Sets the value of the policyConfigurationLocked property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPolicyConfigurationLocked(Boolean value) {
        this.policyConfigurationLocked = value;
    }

}
