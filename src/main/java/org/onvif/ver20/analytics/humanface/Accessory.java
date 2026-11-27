
package org.onvif.ver20.analytics.humanface;

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
 * <p>Java class for Accessory complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Accessory">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Opticals" type="{http://www.onvif.org/ver20/analytics/humanface}AccessoryDescription" minOccurs="0"/>
 *         <element name="Hat" type="{http://www.onvif.org/ver20/analytics/humanface}AccessoryDescription" minOccurs="0"/>
 *         <element name="Mask" type="{http://www.onvif.org/ver20/analytics/humanface}AccessoryDescription" minOccurs="0"/>
 *         <element name="Hijab" type="{http://www.onvif.org/ver20/analytics/humanface}AccessoryDescription" minOccurs="0"/>
 *         <element name="Helmet" type="{http://www.onvif.org/ver20/analytics/humanface}AccessoryDescription" minOccurs="0"/>
 *         <element name="Kerchief" type="{http://www.onvif.org/ver20/analytics/humanface}AccessoryDescription" minOccurs="0"/>
 *         <element name="RightEyePatch" type="{http://www.onvif.org/ver20/analytics/humanface}AccessoryDescription" minOccurs="0"/>
 *         <element name="LeftEyePatch" type="{http://www.onvif.org/ver20/analytics/humanface}AccessoryDescription" minOccurs="0"/>
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
@XmlType(name = "Accessory", propOrder = {
    "opticals",
    "hat",
    "mask",
    "hijab",
    "helmet",
    "kerchief",
    "rightEyePatch",
    "leftEyePatch",
    "any"
})
public class Accessory {

    /**
     * Describe if the object wear opticals.
     *
     */
    @XmlElement(name = "Opticals")
    protected AccessoryDescription opticals;
    /**
     * Describe if the object wear hat.
     *
     */
    @XmlElement(name = "Hat")
    protected AccessoryDescription hat;
    /**
     * Describe if the object wear mask.
     *
     */
    @XmlElement(name = "Mask")
    protected AccessoryDescription mask;
    /**
     * Describe if the object wear hijab.
     *
     */
    @XmlElement(name = "Hijab")
    protected AccessoryDescription hijab;
    /**
     * Describe if the object wear Helmet.
     *
     */
    @XmlElement(name = "Helmet")
    protected AccessoryDescription helmet;
    /**
     * Describe if the object wear Kerchief.
     *
     */
    @XmlElement(name = "Kerchief")
    protected AccessoryDescription kerchief;
    /**
     * Describe if there is a patch on the right eye.
     *
     */
    @XmlElement(name = "RightEyePatch")
    protected AccessoryDescription rightEyePatch;
    /**
     * Describe if there is a patch on the left eye.
     *
     */
    @XmlElement(name = "LeftEyePatch")
    protected AccessoryDescription leftEyePatch;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Describe if the object wear opticals.
     *
     * @return
     *     possible object is
     *     {@link AccessoryDescription }
     *
     */
    public AccessoryDescription getOpticals() {
        return opticals;
    }

    /**
     * Sets the value of the opticals property.
     *
     * @param value
     *     allowed object is
     *     {@link AccessoryDescription }
     *
     * @see #getOpticals()
     */
    public void setOpticals(AccessoryDescription value) {
        this.opticals = value;
    }

    /**
     * Describe if the object wear hat.
     *
     * @return
     *     possible object is
     *     {@link AccessoryDescription }
     *
     */
    public AccessoryDescription getHat() {
        return hat;
    }

    /**
     * Sets the value of the hat property.
     *
     * @param value
     *     allowed object is
     *     {@link AccessoryDescription }
     *
     * @see #getHat()
     */
    public void setHat(AccessoryDescription value) {
        this.hat = value;
    }

    /**
     * Describe if the object wear mask.
     *
     * @return
     *     possible object is
     *     {@link AccessoryDescription }
     *
     */
    public AccessoryDescription getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     *
     * @param value
     *     allowed object is
     *     {@link AccessoryDescription }
     *
     * @see #getMask()
     */
    public void setMask(AccessoryDescription value) {
        this.mask = value;
    }

    /**
     * Describe if the object wear hijab.
     *
     * @return
     *     possible object is
     *     {@link AccessoryDescription }
     *
     */
    public AccessoryDescription getHijab() {
        return hijab;
    }

    /**
     * Sets the value of the hijab property.
     *
     * @param value
     *     allowed object is
     *     {@link AccessoryDescription }
     *
     * @see #getHijab()
     */
    public void setHijab(AccessoryDescription value) {
        this.hijab = value;
    }

    /**
     * Describe if the object wear Helmet.
     *
     * @return
     *     possible object is
     *     {@link AccessoryDescription }
     *
     */
    public AccessoryDescription getHelmet() {
        return helmet;
    }

    /**
     * Sets the value of the helmet property.
     *
     * @param value
     *     allowed object is
     *     {@link AccessoryDescription }
     *
     * @see #getHelmet()
     */
    public void setHelmet(AccessoryDescription value) {
        this.helmet = value;
    }

    /**
     * Describe if the object wear Kerchief.
     *
     * @return
     *     possible object is
     *     {@link AccessoryDescription }
     *
     */
    public AccessoryDescription getKerchief() {
        return kerchief;
    }

    /**
     * Sets the value of the kerchief property.
     *
     * @param value
     *     allowed object is
     *     {@link AccessoryDescription }
     *
     * @see #getKerchief()
     */
    public void setKerchief(AccessoryDescription value) {
        this.kerchief = value;
    }

    /**
     * Describe if there is a patch on the right eye.
     *
     * @return
     *     possible object is
     *     {@link AccessoryDescription }
     *
     */
    public AccessoryDescription getRightEyePatch() {
        return rightEyePatch;
    }

    /**
     * Sets the value of the rightEyePatch property.
     *
     * @param value
     *     allowed object is
     *     {@link AccessoryDescription }
     *
     * @see #getRightEyePatch()
     */
    public void setRightEyePatch(AccessoryDescription value) {
        this.rightEyePatch = value;
    }

    /**
     * Describe if there is a patch on the left eye.
     *
     * @return
     *     possible object is
     *     {@link AccessoryDescription }
     *
     */
    public AccessoryDescription getLeftEyePatch() {
        return leftEyePatch;
    }

    /**
     * Sets the value of the leftEyePatch property.
     *
     * @param value
     *     allowed object is
     *     {@link AccessoryDescription }
     *
     * @see #getLeftEyePatch()
     */
    public void setLeftEyePatch(AccessoryDescription value) {
        this.leftEyePatch = value;
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
