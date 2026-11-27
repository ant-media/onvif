
package org.onvif.ver20.media.wsdl;

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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ColorOptions;
import org.w3c.dom.Element;


/**
 * <p>Java class for MaskOptions complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="MaskOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaxMasks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MaxPoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Types" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="Color" type="{http://www.onvif.org/ver10/schema}ColorOptions"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="RectangleOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SingleColorOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaskOptions", propOrder = {
    "maxMasks",
    "maxPoints",
    "types",
    "color",
    "any"
})
public class MaskOptions {

    /**
     * Maximum supported number of masks per VideoSourceConfiguration.
     *
     */
    @XmlElement(name = "MaxMasks")
    protected int maxMasks;
    /**
     * Maximum supported number of points per mask.
     *
     */
    @XmlElement(name = "MaxPoints")
    protected int maxPoints;
    /**
     * Information which types of tr2:MaskType are supported. Valid values are 'Color', 'Pixelated' and 'Blurred'.
     *
     */
    @XmlElement(name = "Types", required = true)
    protected List<String> types;
    /**
     * Colors supported.
     *
     */
    @XmlElement(name = "Color", required = true)
    protected ColorOptions color;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Information whether the polygon must have four points and a rectangular shape.
     *
     */
    @XmlAttribute(name = "RectangleOnly")
    protected Boolean rectangleOnly;
    /**
     * Indicates the device capability of change in color of privacy mask for one video source configuration will automatically be applied to all the privacy masks associated with the same video source configuration.
     *
     */
    @XmlAttribute(name = "SingleColorOnly")
    protected Boolean singleColorOnly;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Maximum supported number of masks per VideoSourceConfiguration.
     *
     */
    public int getMaxMasks() {
        return maxMasks;
    }

    /**
     * Sets the value of the maxMasks property.
     *
     */
    public void setMaxMasks(int value) {
        this.maxMasks = value;
    }

    /**
     * Maximum supported number of points per mask.
     *
     */
    public int getMaxPoints() {
        return maxPoints;
    }

    /**
     * Sets the value of the maxPoints property.
     *
     */
    public void setMaxPoints(int value) {
        this.maxPoints = value;
    }

    /**
     * Information which types of tr2:MaskType are supported. Valid values are 'Color', 'Pixelated' and 'Blurred'.
     *
     * Gets the value of the types property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTypes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     *
     * @return
     *     The value of the types property.
     */
    public List<String> getTypes() {
        if (types == null) {
            types = new ArrayList<>();
        }
        return this.types;
    }

    /**
     * Colors supported.
     *
     * @return
     *     possible object is
     *     {@link ColorOptions }
     *
     */
    public ColorOptions getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value
     *     allowed object is
     *     {@link ColorOptions }
     *
     * @see #getColor()
     */
    public void setColor(ColorOptions value) {
        this.color = value;
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
     * Information whether the polygon must have four points and a rectangular shape.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRectangleOnly() {
        return rectangleOnly;
    }

    /**
     * Sets the value of the rectangleOnly property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isRectangleOnly()
     */
    public void setRectangleOnly(Boolean value) {
        this.rectangleOnly = value;
    }

    /**
     * Indicates the device capability of change in color of privacy mask for one video source configuration will automatically be applied to all the privacy masks associated with the same video source configuration.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSingleColorOnly() {
        return singleColorOnly;
    }

    /**
     * Sets the value of the singleColorOnly property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isSingleColorOnly()
     */
    public void setSingleColorOnly(Boolean value) {
        this.singleColorOnly = value;
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
