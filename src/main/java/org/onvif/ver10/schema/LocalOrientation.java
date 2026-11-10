
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
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LocalOrientation complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="LocalOrientation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="pan" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="tilt" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="roll" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <anyAttribute/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalOrientation", propOrder = {
    "any"
})
public class LocalOrientation {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Rotation around the y axis.
     *
     */
    @XmlAttribute(name = "pan")
    protected Float pan;
    /**
     * Rotation around the z axis.
     *
     */
    @XmlAttribute(name = "tilt")
    protected Float tilt;
    /**
     * Rotation around the x axis.
     *
     */
    @XmlAttribute(name = "roll")
    protected Float roll;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

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
     * Rotation around the y axis.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getPan()
     */
    public void setPan(Float value) {
        this.pan = value;
    }

    /**
     * Rotation around the z axis.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getTilt() {
        return tilt;
    }

    /**
     * Sets the value of the tilt property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getTilt()
     */
    public void setTilt(Float value) {
        this.tilt = value;
    }

    /**
     * Rotation around the x axis.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getRoll() {
        return roll;
    }

    /**
     * Sets the value of the roll property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getRoll()
     */
    public void setRoll(Float value) {
        this.roll = value;
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
