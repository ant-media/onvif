
package org.onvif.ver10.schema;

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
 * <p>Java class for BarcodeInfo complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="BarcodeInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Data" type="{http://www.onvif.org/ver10/schema}StringLikelihood"/>
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}StringLikelihood" minOccurs="0"/>
 *         <element name="PPM" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "BarcodeInfo", propOrder = {
    "data",
    "type",
    "ppm",
    "any"
})
public class BarcodeInfo {

    /**
     * Information encoded in barcode
     *
     */
    @XmlElement(name = "Data", required = true)
    protected StringLikelihood data;
    /**
     * Acceptable values are defined in tt:BarcodeType
     *
     */
    @XmlElement(name = "Type")
    protected StringLikelihood type;
    /**
     * Refers to the pixels per module
     *
     */
    @XmlElement(name = "PPM")
    protected Float ppm;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Information encoded in barcode
     *
     * @return
     *     possible object is
     *     {@link StringLikelihood }
     *
     */
    public StringLikelihood getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param value
     *     allowed object is
     *     {@link StringLikelihood }
     *
     * @see #getData()
     */
    public void setData(StringLikelihood value) {
        this.data = value;
    }

    /**
     * Acceptable values are defined in tt:BarcodeType
     *
     * @return
     *     possible object is
     *     {@link StringLikelihood }
     *
     */
    public StringLikelihood getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link StringLikelihood }
     *
     * @see #getType()
     */
    public void setType(StringLikelihood value) {
        this.type = value;
    }

    /**
     * Refers to the pixels per module
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getPPM() {
        return ppm;
    }

    /**
     * Sets the value of the ppm property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getPPM()
     */
    public void setPPM(Float value) {
        this.ppm = value;
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
