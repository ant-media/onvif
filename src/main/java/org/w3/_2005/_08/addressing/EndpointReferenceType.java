
package org.w3._2005._08.addressing;

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
 * <p>Java class for EndpointReferenceType complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="EndpointReferenceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Address" type="{http://www.w3.org/2005/08/addressing}AttributedURIType"/>
 *         <element name="ReferenceParameters" type="{http://www.w3.org/2005/08/addressing}ReferenceParametersType" minOccurs="0"/>
 *         <element ref="{http://www.w3.org/2005/08/addressing}Metadata" minOccurs="0"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax' namespace='##other'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointReferenceType", propOrder = {
    "address",
    "referenceParameters",
    "metadata",
    "any"
})
public class EndpointReferenceType {

    @XmlElement(name = "Address", required = true)
    protected AttributedURIType address;
    @XmlElement(name = "ReferenceParameters")
    protected ReferenceParametersType referenceParameters;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link AttributedURIType }
     *
     */
    public AttributedURIType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link AttributedURIType }
     *
     */
    public void setAddress(AttributedURIType value) {
        this.address = value;
    }

    /**
     * Gets the value of the referenceParameters property.
     *
     * @return
     *     possible object is
     *     {@link ReferenceParametersType }
     *
     */
    public ReferenceParametersType getReferenceParameters() {
        return referenceParameters;
    }

    /**
     * Sets the value of the referenceParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link ReferenceParametersType }
     *
     */
    public void setReferenceParameters(ReferenceParametersType value) {
        this.referenceParameters = value;
    }

    /**
     * Gets the value of the metadata property.
     *
     * @return
     *     possible object is
     *     {@link MetadataType }
     *
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     *
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
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
