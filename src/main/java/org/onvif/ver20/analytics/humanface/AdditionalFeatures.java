
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
import org.w3c.dom.Element;


/**
 * <p>Java class for AdditionalFeatures complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="AdditionalFeatures">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Scar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Mole" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Tattoo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Freckles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AdditionalFeatures", propOrder = {
    "scar",
    "mole",
    "tattoo",
    "freckles",
    "any"
})
public class AdditionalFeatures {

    /**
     * Is there scar on the face.
     *
     */
    @XmlElement(name = "Scar")
    protected Boolean scar;
    /**
     * Is there mole on the face.
     *
     */
    @XmlElement(name = "Mole")
    protected Boolean mole;
    /**
     * Is there Tattoo on the face.
     *
     */
    @XmlElement(name = "Tattoo")
    protected Boolean tattoo;
    /**
     * Describe freckles on the face, acceptable values are defined in fc:FrecklesType.
     *
     */
    @XmlElement(name = "Freckles")
    protected String freckles;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Is there scar on the face.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isScar() {
        return scar;
    }

    /**
     * Sets the value of the scar property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isScar()
     */
    public void setScar(Boolean value) {
        this.scar = value;
    }

    /**
     * Is there mole on the face.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMole() {
        return mole;
    }

    /**
     * Sets the value of the mole property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isMole()
     */
    public void setMole(Boolean value) {
        this.mole = value;
    }

    /**
     * Is there Tattoo on the face.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isTattoo() {
        return tattoo;
    }

    /**
     * Sets the value of the tattoo property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isTattoo()
     */
    public void setTattoo(Boolean value) {
        this.tattoo = value;
    }

    /**
     * Describe freckles on the face, acceptable values are defined in fc:FrecklesType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFreckles() {
        return freckles;
    }

    /**
     * Sets the value of the freckles property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getFreckles()
     */
    public void setFreckles(String value) {
        this.freckles = value;
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
