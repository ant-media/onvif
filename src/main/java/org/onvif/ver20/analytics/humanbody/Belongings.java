
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
 * <p>Java class for Belongings complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Belongings">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bag" type="{http://www.onvif.org/ver20/analytics/humanbody}Bag" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Umbrella" type="{http://www.onvif.org/ver20/analytics/humanbody}Umbrella" minOccurs="0"/>
 *         <element name="Cart" type="{http://www.onvif.org/ver20/analytics/humanbody}Cart" minOccurs="0"/>
 *         <element name="Weapon" type="{http://www.onvif.org/ver20/analytics/humanbody}Weapon" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Belongings", propOrder = {
    "bag",
    "umbrella",
    "cart",
    "weapon",
    "any"
})
public class Belongings {

    /**
     * Describes a bag the body is wearing.
     *
     */
    @XmlElement(name = "Bag")
    protected List<Bag> bag;
    /**
     * Describes an umbrella carried by the body.
     *
     */
    @XmlElement(name = "Umbrella")
    protected Umbrella umbrella;
    /**
     * Describes a cart pushed by the body.
     *
     */
    @XmlElement(name = "Cart")
    protected Cart cart;
    /**
     * Describe a waepon the body carries.
     *
     */
    @XmlElement(name = "Weapon")
    protected List<Weapon> weapon;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Describes a bag the body is wearing.
     *
     * Gets the value of the bag property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bag property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBag().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bag }
     * </p>
     *
     *
     * @return
     *     The value of the bag property.
     */
    public List<Bag> getBag() {
        if (bag == null) {
            bag = new ArrayList<>();
        }
        return this.bag;
    }

    /**
     * Describes an umbrella carried by the body.
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
     * Describes a cart pushed by the body.
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
     * Describe a waepon the body carries.
     *
     * Gets the value of the weapon property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weapon property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWeapon().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Weapon }
     * </p>
     *
     *
     * @return
     *     The value of the weapon property.
     */
    public List<Weapon> getWeapon() {
        if (weapon == null) {
            weapon = new ArrayList<>();
        }
        return this.weapon;
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
