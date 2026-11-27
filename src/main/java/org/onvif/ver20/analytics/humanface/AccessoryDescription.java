
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
import org.onvif.ver10.schema.ColorDescriptor;
import org.w3c.dom.Element;


/**
 * <p>Java class for AccessoryDescription complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AccessoryDescription">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Wear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Color" type="{http://www.onvif.org/ver10/schema}ColorDescriptor" minOccurs="0"/>
 *         <element name="Subtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AccessoryDescription", propOrder = {
    "wear",
    "color",
    "subtype",
    "any"
})
public class AccessoryDescription {

    /**
     * Describe if the object wear a accessory .
     *
     */
    @XmlElement(name = "Wear")
    protected Boolean wear;
    /**
     * Describe the Color of the accessory.
     *
     */
    @XmlElement(name = "Color")
    protected ColorDescriptor color;
    /**
     * Optional subtype of the accessory. For definitions refer enumerations starting with
     * 						the accessory name followed by 'Type' like fc:HatType or fc:HelmetType.
     *
     */
    @XmlElement(name = "Subtype")
    protected String subtype;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Describe if the object wear a accessory .
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isWear() {
        return wear;
    }

    /**
     * Sets the value of the wear property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isWear()
     */
    public void setWear(Boolean value) {
        this.wear = value;
    }

    /**
     * Describe the Color of the accessory.
     *
     * @return
     *     possible object is
     *     {@link ColorDescriptor }
     *
     */
    public ColorDescriptor getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value
     *     allowed object is
     *     {@link ColorDescriptor }
     *
     * @see #getColor()
     */
    public void setColor(ColorDescriptor value) {
        this.color = value;
    }

    /**
     * Optional subtype of the accessory. For definitions refer enumerations starting with
     * 						the accessory name followed by 'Type' like fc:HatType or fc:HelmetType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getSubtype()
     */
    public void setSubtype(String value) {
        this.subtype = value;
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
