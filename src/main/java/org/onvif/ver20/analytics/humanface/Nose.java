
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
 * <p>Java class for Nose complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Nose">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NoseBridge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NoseWing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NoseEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Nose", propOrder = {
    "length",
    "noseBridge",
    "noseWing",
    "noseEnd",
    "any"
})
public class Nose {

    /**
     * Describe the length of the nose, acceptable values are defined in fc:NoseLength.
     * 				Long usually means that the length of the nose is longer than 1/3 of the length of the face.
     * 				short usually means that the length of the nose is shorter than 1/3 of the length of the face.
     *
     */
    @XmlElement(name = "Length")
    protected String length;
    /**
     * Describe the bridge of the nose, acceptable values are defined in fc:NoseBridge.
     *
     */
    @XmlElement(name = "NoseBridge")
    protected String noseBridge;
    /**
     * Describe the wing of the nose, acceptable values are defined in fc:NoseWing.
     *
     */
    @XmlElement(name = "NoseWing")
    protected String noseWing;
    /**
     * Describe the end of the nose, acceptable values are defined in fc:NoseEnd.
     *
     */
    @XmlElement(name = "NoseEnd")
    protected String noseEnd;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Describe the length of the nose, acceptable values are defined in fc:NoseLength.
     * 				Long usually means that the length of the nose is longer than 1/3 of the length of the face.
     * 				short usually means that the length of the nose is shorter than 1/3 of the length of the face.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getLength()
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Describe the bridge of the nose, acceptable values are defined in fc:NoseBridge.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoseBridge() {
        return noseBridge;
    }

    /**
     * Sets the value of the noseBridge property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getNoseBridge()
     */
    public void setNoseBridge(String value) {
        this.noseBridge = value;
    }

    /**
     * Describe the wing of the nose, acceptable values are defined in fc:NoseWing.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoseWing() {
        return noseWing;
    }

    /**
     * Sets the value of the noseWing property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getNoseWing()
     */
    public void setNoseWing(String value) {
        this.noseWing = value;
    }

    /**
     * Describe the end of the nose, acceptable values are defined in fc:NoseEnd.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoseEnd() {
        return noseEnd;
    }

    /**
     * Sets the value of the noseEnd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getNoseEnd()
     */
    public void setNoseEnd(String value) {
        this.noseEnd = value;
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
