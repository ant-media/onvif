
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
 * <p>Java class for HumanBody complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="HumanBody">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BodyMetric" type="{http://www.onvif.org/ver20/analytics/humanbody}BodyMetric" minOccurs="0"/>
 *         <element name="Clothing" type="{http://www.onvif.org/ver20/analytics/humanbody}Clothing" minOccurs="0"/>
 *         <element name="Belonging" type="{http://www.onvif.org/ver20/analytics/humanbody}Belonging" minOccurs="0"/>
 *         <element name="Behaviour" type="{http://www.onvif.org/ver20/analytics/humanbody}Behaviour" minOccurs="0"/>
 *         <element name="Belongings" type="{http://www.onvif.org/ver20/analytics/humanbody}Belongings" minOccurs="0"/>
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
@XmlType(name = "HumanBody", propOrder = {
    "bodyMetric",
    "clothing",
    "belonging",
    "behaviour",
    "belongings",
    "any"
})
public class HumanBody {

    /**
     * Describe the body metric of the body.
     *
     */
    @XmlElement(name = "BodyMetric")
    protected BodyMetric bodyMetric;
    /**
     * Describe the Clothing of the body.
     *
     */
    @XmlElement(name = "Clothing")
    protected Clothing clothing;
    /**
     * Deprecated set of belongings. Use Belongings.
     *
     */
    @XmlElement(name = "Belonging")
    protected Belonging belonging;
    /**
     * Describe the Behaviour of the body.
     *
     */
    @XmlElement(name = "Behaviour")
    protected Behaviour behaviour;
    /**
     * Set of belongings.
     *
     */
    @XmlElement(name = "Belongings")
    protected Belongings belongings;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Describe the body metric of the body.
     *
     * @return
     *     possible object is
     *     {@link BodyMetric }
     *
     */
    public BodyMetric getBodyMetric() {
        return bodyMetric;
    }

    /**
     * Sets the value of the bodyMetric property.
     *
     * @param value
     *     allowed object is
     *     {@link BodyMetric }
     *
     * @see #getBodyMetric()
     */
    public void setBodyMetric(BodyMetric value) {
        this.bodyMetric = value;
    }

    /**
     * Describe the Clothing of the body.
     *
     * @return
     *     possible object is
     *     {@link Clothing }
     *
     */
    public Clothing getClothing() {
        return clothing;
    }

    /**
     * Sets the value of the clothing property.
     *
     * @param value
     *     allowed object is
     *     {@link Clothing }
     *
     * @see #getClothing()
     */
    public void setClothing(Clothing value) {
        this.clothing = value;
    }

    /**
     * Deprecated set of belongings. Use Belongings.
     *
     * @return
     *     possible object is
     *     {@link Belonging }
     *
     */
    public Belonging getBelonging() {
        return belonging;
    }

    /**
     * Sets the value of the belonging property.
     *
     * @param value
     *     allowed object is
     *     {@link Belonging }
     *
     * @see #getBelonging()
     */
    public void setBelonging(Belonging value) {
        this.belonging = value;
    }

    /**
     * Describe the Behaviour of the body.
     *
     * @return
     *     possible object is
     *     {@link Behaviour }
     *
     */
    public Behaviour getBehaviour() {
        return behaviour;
    }

    /**
     * Sets the value of the behaviour property.
     *
     * @param value
     *     allowed object is
     *     {@link Behaviour }
     *
     * @see #getBehaviour()
     */
    public void setBehaviour(Behaviour value) {
        this.behaviour = value;
    }

    /**
     * Set of belongings.
     *
     * @return
     *     possible object is
     *     {@link Belongings }
     *
     */
    public Belongings getBelongings() {
        return belongings;
    }

    /**
     * Sets the value of the belongings property.
     *
     * @param value
     *     allowed object is
     *     {@link Belongings }
     *
     * @see #getBelongings()
     */
    public void setBelongings(Belongings value) {
        this.belongings = value;
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
