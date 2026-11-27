
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
 * <p>Java class for Clothing complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Clothing">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Scarf" type="{http://www.onvif.org/ver20/analytics/humanbody}Scarf" minOccurs="0"/>
 *         <element name="Gloves" type="{http://www.onvif.org/ver20/analytics/humanbody}Gloves" minOccurs="0"/>
 *         <element name="Tops" type="{http://www.onvif.org/ver20/analytics/humanbody}Tops" minOccurs="0"/>
 *         <element name="Bottoms" type="{http://www.onvif.org/ver20/analytics/humanbody}Bottoms" minOccurs="0"/>
 *         <element name="Shoes" type="{http://www.onvif.org/ver20/analytics/humanbody}Shoes" minOccurs="0"/>
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
@XmlType(name = "Clothing", propOrder = {
    "scarf",
    "gloves",
    "tops",
    "bottoms",
    "shoes",
    "any"
})
public class Clothing {

    /**
     * Describe the Scarf of the body,acceptable values are defined in bd:Scarf.
     *
     */
    @XmlElement(name = "Scarf")
    protected Scarf scarf;
    /**
     * Describe Gloves of the body,acceptable values are defined in bd:Gloves.
     *
     */
    @XmlElement(name = "Gloves")
    protected Gloves gloves;
    /**
     * Describe the Tops of the body,acceptable values are defined in bd:Tops.
     *
     */
    @XmlElement(name = "Tops")
    protected Tops tops;
    /**
     * Describe the Bottoms of the body,acceptable values are defined in bd:Bottoms.
     *
     */
    @XmlElement(name = "Bottoms")
    protected Bottoms bottoms;
    /**
     * Describe the Shoes of the body,acceptable values are defined in bd:Shoes.
     *
     */
    @XmlElement(name = "Shoes")
    protected Shoes shoes;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Describe the Scarf of the body,acceptable values are defined in bd:Scarf.
     *
     * @return
     *     possible object is
     *     {@link Scarf }
     *
     */
    public Scarf getScarf() {
        return scarf;
    }

    /**
     * Sets the value of the scarf property.
     *
     * @param value
     *     allowed object is
     *     {@link Scarf }
     *
     * @see #getScarf()
     */
    public void setScarf(Scarf value) {
        this.scarf = value;
    }

    /**
     * Describe Gloves of the body,acceptable values are defined in bd:Gloves.
     *
     * @return
     *     possible object is
     *     {@link Gloves }
     *
     */
    public Gloves getGloves() {
        return gloves;
    }

    /**
     * Sets the value of the gloves property.
     *
     * @param value
     *     allowed object is
     *     {@link Gloves }
     *
     * @see #getGloves()
     */
    public void setGloves(Gloves value) {
        this.gloves = value;
    }

    /**
     * Describe the Tops of the body,acceptable values are defined in bd:Tops.
     *
     * @return
     *     possible object is
     *     {@link Tops }
     *
     */
    public Tops getTops() {
        return tops;
    }

    /**
     * Sets the value of the tops property.
     *
     * @param value
     *     allowed object is
     *     {@link Tops }
     *
     * @see #getTops()
     */
    public void setTops(Tops value) {
        this.tops = value;
    }

    /**
     * Describe the Bottoms of the body,acceptable values are defined in bd:Bottoms.
     *
     * @return
     *     possible object is
     *     {@link Bottoms }
     *
     */
    public Bottoms getBottoms() {
        return bottoms;
    }

    /**
     * Sets the value of the bottoms property.
     *
     * @param value
     *     allowed object is
     *     {@link Bottoms }
     *
     * @see #getBottoms()
     */
    public void setBottoms(Bottoms value) {
        this.bottoms = value;
    }

    /**
     * Describe the Shoes of the body,acceptable values are defined in bd:Shoes.
     *
     * @return
     *     possible object is
     *     {@link Shoes }
     *
     */
    public Shoes getShoes() {
        return shoes;
    }

    /**
     * Sets the value of the shoes property.
     *
     * @param value
     *     allowed object is
     *     {@link Shoes }
     *
     * @see #getShoes()
     */
    public void setShoes(Shoes value) {
        this.shoes = value;
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
