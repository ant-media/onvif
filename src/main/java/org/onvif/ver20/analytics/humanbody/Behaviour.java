
package org.onvif.ver20.analytics.humanbody;

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
 * <p>Java class for Behaviour complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Behaviour">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Smoking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UsingMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Behaviour", propOrder = {
    "smoking",
    "usingMobile",
    "activity",
    "any"
})
public class Behaviour {

    /**
     * Acceptable values are defined in bd:Smoking.
     *
     */
    @XmlElement(name = "Smoking")
    protected String smoking;
    /**
     * Acceptable values are defined in bd:UsingMobile.
     *
     */
    @XmlElement(name = "UsingMobile")
    protected String usingMobile;
    /**
     * Describe the activity of the body, Acceptable values are defined in bd:HumanActivity.
     *
     */
    @XmlElement(name = "Activity")
    protected String activity;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Acceptable values are defined in bd:Smoking.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSmoking() {
        return smoking;
    }

    /**
     * Sets the value of the smoking property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getSmoking()
     */
    public void setSmoking(String value) {
        this.smoking = value;
    }

    /**
     * Acceptable values are defined in bd:UsingMobile.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsingMobile() {
        return usingMobile;
    }

    /**
     * Sets the value of the usingMobile property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getUsingMobile()
     */
    public void setUsingMobile(String value) {
        this.usingMobile = value;
    }

    /**
     * Describe the activity of the body, Acceptable values are defined in bd:HumanActivity.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getActivity()
     */
    public void setActivity(String value) {
        this.activity = value;
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
     * {@link Object }
     * {@link Element }
     * </p>
     *
     *
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
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
