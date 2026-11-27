
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
 * <p>Java class for GeoOrientation complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="GeoOrientation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="roll" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="pitch" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="yaw" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <anyAttribute/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoOrientation", propOrder = {
    "any"
})
public class GeoOrientation {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Rotation around the x axis.
     *
     */
    @XmlAttribute(name = "roll")
    protected Float roll;
    /**
     * Rotation around the y axis.
     *
     */
    @XmlAttribute(name = "pitch")
    protected Float pitch;
    /**
     * Rotation around the z axis.
     *
     */
    @XmlAttribute(name = "yaw")
    protected Float yaw;
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
     * Rotation around the y axis.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getPitch() {
        return pitch;
    }

    /**
     * Sets the value of the pitch property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getPitch()
     */
    public void setPitch(Float value) {
        this.pitch = value;
    }

    /**
     * Rotation around the z axis.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getYaw() {
        return yaw;
    }

    /**
     * Sets the value of the yaw property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getYaw()
     */
    public void setYaw(Float value) {
        this.yaw = value;
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
