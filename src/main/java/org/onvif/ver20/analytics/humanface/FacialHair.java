
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
 * <p>Java class for FacialHair complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FacialHair">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mustache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Beard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Sideburn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "FacialHair", propOrder = {
    "mustache",
    "beard",
    "sideburn",
    "any"
})
public class FacialHair {

    /**
     * Describe if there is mustache on the face.
     *
     */
    @XmlElement(name = "Mustache")
    protected Boolean mustache;
    /**
     * Describe if there are Beard on the face.
     *
     */
    @XmlElement(name = "Beard")
    protected Boolean beard;
    /**
     * Describe if there are sideburns on the face.
     *
     */
    @XmlElement(name = "Sideburn")
    protected Boolean sideburn;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Describe if there is mustache on the face.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMustache() {
        return mustache;
    }

    /**
     * Sets the value of the mustache property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isMustache()
     */
    public void setMustache(Boolean value) {
        this.mustache = value;
    }

    /**
     * Describe if there are Beard on the face.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isBeard() {
        return beard;
    }

    /**
     * Sets the value of the beard property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isBeard()
     */
    public void setBeard(Boolean value) {
        this.beard = value;
    }

    /**
     * Describe if there are sideburns on the face.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSideburn() {
        return sideburn;
    }

    /**
     * Sets the value of the sideburn property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isSideburn()
     */
    public void setSideburn(Boolean value) {
        this.sideburn = value;
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
