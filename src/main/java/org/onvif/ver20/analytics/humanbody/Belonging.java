
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
 * <p>Java class for Belonging complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Belonging">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bag" type="{http://www.onvif.org/ver20/analytics/humanbody}Bag" minOccurs="0"/>
 *         <element name="Umbrella" type="{http://www.onvif.org/ver20/analytics/humanbody}Umbrella" minOccurs="0"/>
 *         <element name="LiftSomething" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Box" type="{http://www.onvif.org/ver20/analytics/humanbody}Box" minOccurs="0"/>
 *         <element name="Cart" type="{http://www.onvif.org/ver20/analytics/humanbody}Cart" minOccurs="0"/>
 *         <element name="Weapon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "Belonging", propOrder = {
    "bag",
    "umbrella",
    "liftSomething",
    "box",
    "cart",
    "weapon",
    "any"
})
public class Belonging {

    /**
     * Describe the Bag of the body,acceptable values are defined in bd:Bag
     *
     */
    @XmlElement(name = "Bag")
    protected Bag bag;
    /**
     * Describe the Umbrella carried by the body,acceptable values are defined in bd:Umbrella.
     *
     */
    @XmlElement(name = "Umbrella")
    protected Umbrella umbrella;
    /**
     * Describe if the body Lifts something.
     *
     */
    @XmlElement(name = "LiftSomething")
    protected Boolean liftSomething;
    /**
     * Describe the Box luffed by the body,acceptable values are defined in bd:Box.
     *
     */
    @XmlElement(name = "Box")
    protected Box box;
    /**
     * Describe the Cart pushed by the body,acceptable values are defined in bd:Cart.
     *
     */
    @XmlElement(name = "Cart")
    protected Cart cart;
    /**
     * Describe if the body carries the Weapon.
     *
     */
    @XmlElement(name = "Weapon")
    protected Boolean weapon;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Describe the Bag of the body,acceptable values are defined in bd:Bag
     *
     * @return
     *     possible object is
     *     {@link Bag }
     *
     */
    public Bag getBag() {
        return bag;
    }

    /**
     * Sets the value of the bag property.
     *
     * @param value
     *     allowed object is
     *     {@link Bag }
     *
     * @see #getBag()
     */
    public void setBag(Bag value) {
        this.bag = value;
    }

    /**
     * Describe the Umbrella carried by the body,acceptable values are defined in bd:Umbrella.
     *
     * @return
     *     possible object is
     *     {@link Umbrella }
     *
     */
    public Umbrella getUmbrella() {
        return umbrella;
    }

    /**
     * Sets the value of the umbrella property.
     *
     * @param value
     *     allowed object is
     *     {@link Umbrella }
     *
     * @see #getUmbrella()
     */
    public void setUmbrella(Umbrella value) {
        this.umbrella = value;
    }

    /**
     * Describe if the body Lifts something.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isLiftSomething() {
        return liftSomething;
    }

    /**
     * Sets the value of the liftSomething property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isLiftSomething()
     */
    public void setLiftSomething(Boolean value) {
        this.liftSomething = value;
    }

    /**
     * Describe the Box luffed by the body,acceptable values are defined in bd:Box.
     *
     * @return
     *     possible object is
     *     {@link Box }
     *
     */
    public Box getBox() {
        return box;
    }

    /**
     * Sets the value of the box property.
     *
     * @param value
     *     allowed object is
     *     {@link Box }
     *
     * @see #getBox()
     */
    public void setBox(Box value) {
        this.box = value;
    }

    /**
     * Describe the Cart pushed by the body,acceptable values are defined in bd:Cart.
     *
     * @return
     *     possible object is
     *     {@link Cart }
     *
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * Sets the value of the cart property.
     *
     * @param value
     *     allowed object is
     *     {@link Cart }
     *
     * @see #getCart()
     */
    public void setCart(Cart value) {
        this.cart = value;
    }

    /**
     * Describe if the body carries the Weapon.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isWeapon() {
        return weapon;
    }

    /**
     * Sets the value of the weapon property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isWeapon()
     */
    public void setWeapon(Boolean value) {
        this.weapon = value;
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
