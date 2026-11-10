
package org.onvif.ver10.schema;

import java.math.BigInteger;
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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for Object complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Object">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ObjectId">
 *       <sequence>
 *         <element name="Appearance" type="{http://www.onvif.org/ver10/schema}Appearance" minOccurs="0"/>
 *         <element name="Behaviour" type="{http://www.onvif.org/ver10/schema}Behaviour" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ObjectExtension" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Parent" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="ParentUUID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Object", propOrder = {
    "appearance",
    "behaviour",
    "extension",
    "any"
})
@XmlSeeAlso({
    ObjectState.class
})
public class Object
    extends ObjectId
{

    @XmlElement(name = "Appearance")
    protected Appearance appearance;
    @XmlElement(name = "Behaviour")
    protected Behaviour behaviour;
    @XmlElement(name = "Extension")
    protected ObjectExtension extension;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Object ID of the parent object. eg: License plate object has Vehicle object as parent.
     *
     */
    @XmlAttribute(name = "Parent")
    protected BigInteger parent;
    /**
     * Object UUID of the parent object. eg: License plate object has Vehicle object as parent.
     *
     */
    @XmlAttribute(name = "ParentUUID")
    protected String parentUUID;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the appearance property.
     *
     * @return
     *     possible object is
     *     {@link Appearance }
     *
     */
    public Appearance getAppearance() {
        return appearance;
    }

    /**
     * Sets the value of the appearance property.
     *
     * @param value
     *     allowed object is
     *     {@link Appearance }
     *
     */
    public void setAppearance(Appearance value) {
        this.appearance = value;
    }

    /**
     * Gets the value of the behaviour property.
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
     */
    public void setBehaviour(Behaviour value) {
        this.behaviour = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link ObjectExtension }
     *
     */
    public ObjectExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link ObjectExtension }
     *
     */
    public void setExtension(ObjectExtension value) {
        this.extension = value;
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
     * Object ID of the parent object. eg: License plate object has Vehicle object as parent.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     * @see #getParent()
     */
    public void setParent(BigInteger value) {
        this.parent = value;
    }

    /**
     * Object UUID of the parent object. eg: License plate object has Vehicle object as parent.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParentUUID() {
        return parentUUID;
    }

    /**
     * Sets the value of the parentUUID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getParentUUID()
     */
    public void setParentUUID(String value) {
        this.parentUUID = value;
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
