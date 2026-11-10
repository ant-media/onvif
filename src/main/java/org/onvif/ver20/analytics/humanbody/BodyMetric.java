
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
 * <p>Java class for BodyMetric complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="BodyMetric">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BodyShape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BodyMetric", propOrder = {
    "height",
    "bodyShape",
    "any"
})
public class BodyMetric {

    /**
     * Describe the Stature of the body, the unit is centimeter.
     *
     */
    @XmlElement(name = "Height")
    protected Integer height;
    /**
     * Describle the Shape of the body, acceptable values are defined in bd:BodyShape.
     *
     */
    @XmlElement(name = "BodyShape")
    protected String bodyShape;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Describe the Stature of the body, the unit is centimeter.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getHeight()
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Describle the Shape of the body, acceptable values are defined in bd:BodyShape.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBodyShape() {
        return bodyShape;
    }

    /**
     * Sets the value of the bodyShape property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getBodyShape()
     */
    public void setBodyShape(String value) {
        this.bodyShape = value;
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
