
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ClassDescriptor complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ClassDescriptor">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClassCandidate" type="{http://www.onvif.org/ver10/schema}ClassCandidate" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ClassDescriptorExtension" minOccurs="0"/>
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}StringLikelihood" maxOccurs="unbounded" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassDescriptor", propOrder = {
    "classCandidate",
    "extension",
    "type",
    "any"
})
public class ClassDescriptor {

    @XmlElement(name = "ClassCandidate")
    protected List<ClassCandidate> classCandidate;
    @XmlElement(name = "Extension")
    protected ClassDescriptorExtension extension;
    /**
     * For well-defined values see tt:ObjectType. Other type definitions like tt:VehicleType may be applied as well.
     *
     */
    @XmlElement(name = "Type")
    protected List<StringLikelihood> type;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    /**
     * Gets the value of the classCandidate property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCandidate property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClassCandidate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassCandidate }
     * </p>
     *
     *
     * @return
     *     The value of the classCandidate property.
     */
    public List<ClassCandidate> getClassCandidate() {
        if (classCandidate == null) {
            classCandidate = new ArrayList<>();
        }
        return this.classCandidate;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link ClassDescriptorExtension }
     *
     */
    public ClassDescriptorExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link ClassDescriptorExtension }
     *
     */
    public void setExtension(ClassDescriptorExtension value) {
        this.extension = value;
    }

    /**
     * For well-defined values see tt:ObjectType. Other type definitions like tt:VehicleType may be applied as well.
     *
     * Gets the value of the type property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringLikelihood }
     * </p>
     *
     *
     * @return
     *     The value of the type property.
     */
    public List<StringLikelihood> getType() {
        if (type == null) {
            type = new ArrayList<>();
        }
        return this.type;
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

}
