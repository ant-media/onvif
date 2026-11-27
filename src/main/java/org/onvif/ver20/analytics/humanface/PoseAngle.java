
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
import org.onvif.ver10.schema.GeoOrientation;
import org.w3c.dom.Element;


/**
 * <p>Java class for PoseAngle complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="PoseAngle">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PoseAngles" type="{http://www.onvif.org/ver10/schema}GeoOrientation" minOccurs="0"/>
 *         <element name="Uncertainty" type="{http://www.onvif.org/ver10/schema}GeoOrientation" minOccurs="0"/>
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
@XmlType(name = "PoseAngle", propOrder = {
    "poseAngles",
    "uncertainty",
    "any"
})
public class PoseAngle {

    /**
     * Describe the pose angle of the face.
     *
     */
    @XmlElement(name = "PoseAngles")
    protected GeoOrientation poseAngles;
    /**
     * Describe the expected degree of uncertainty of the pose angle yaw, pitch, and roll.
     *
     */
    @XmlElement(name = "Uncertainty")
    protected GeoOrientation uncertainty;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Describe the pose angle of the face.
     *
     * @return
     *     possible object is
     *     {@link GeoOrientation }
     *
     */
    public GeoOrientation getPoseAngles() {
        return poseAngles;
    }

    /**
     * Sets the value of the poseAngles property.
     *
     * @param value
     *     allowed object is
     *     {@link GeoOrientation }
     *
     * @see #getPoseAngles()
     */
    public void setPoseAngles(GeoOrientation value) {
        this.poseAngles = value;
    }

    /**
     * Describe the expected degree of uncertainty of the pose angle yaw, pitch, and roll.
     *
     * @return
     *     possible object is
     *     {@link GeoOrientation }
     *
     */
    public GeoOrientation getUncertainty() {
        return uncertainty;
    }

    /**
     * Sets the value of the uncertainty property.
     *
     * @param value
     *     allowed object is
     *     {@link GeoOrientation }
     *
     * @see #getUncertainty()
     */
    public void setUncertainty(GeoOrientation value) {
        this.uncertainty = value;
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
