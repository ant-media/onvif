
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OSDImgOptions complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="OSDImgOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ImagePath" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDImgOptionsExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="FormatsSupported" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       <attribute name="MaxSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="MaxWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="MaxHeight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSDImgOptions", propOrder = {
    "imagePath",
    "extension"
})
public class OSDImgOptions {

    /**
     * List of available image URIs.
     *
     */
    @XmlElement(name = "ImagePath", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> imagePath;
    @XmlElement(name = "Extension")
    protected OSDImgOptionsExtension extension;
    /**
     * List of supported image MIME types, such as "image/png".
     *
     */
    @XmlAttribute(name = "FormatsSupported")
    protected List<String> formatsSupported;
    /**
     * The maximum size (in bytes) of the image that can be uploaded.
     *
     */
    @XmlAttribute(name = "MaxSize")
    protected Integer maxSize;
    /**
     * The maximum width (in pixels) of the image that can be uploaded.
     *
     */
    @XmlAttribute(name = "MaxWidth")
    protected Integer maxWidth;
    /**
     * The maximum height (in pixels) of the image that can be uploaded.
     *
     */
    @XmlAttribute(name = "MaxHeight")
    protected Integer maxHeight;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * List of available image URIs.
     *
     * Gets the value of the imagePath property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagePath property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImagePath().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     *
     * @return
     *     The value of the imagePath property.
     */
    public List<String> getImagePath() {
        if (imagePath == null) {
            imagePath = new ArrayList<>();
        }
        return this.imagePath;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link OSDImgOptionsExtension }
     *
     */
    public OSDImgOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link OSDImgOptionsExtension }
     *
     */
    public void setExtension(OSDImgOptionsExtension value) {
        this.extension = value;
    }

    /**
     * List of supported image MIME types, such as "image/png".
     *
     * Gets the value of the formatsSupported property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatsSupported property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFormatsSupported().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     *
     * @return
     *     The value of the formatsSupported property.
     */
    public List<String> getFormatsSupported() {
        if (formatsSupported == null) {
            formatsSupported = new ArrayList<>();
        }
        return this.formatsSupported;
    }

    /**
     * The maximum size (in bytes) of the image that can be uploaded.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    /**
     * Sets the value of the maxSize property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getMaxSize()
     */
    public void setMaxSize(Integer value) {
        this.maxSize = value;
    }

    /**
     * The maximum width (in pixels) of the image that can be uploaded.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMaxWidth() {
        return maxWidth;
    }

    /**
     * Sets the value of the maxWidth property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getMaxWidth()
     */
    public void setMaxWidth(Integer value) {
        this.maxWidth = value;
    }

    /**
     * The maximum height (in pixels) of the image that can be uploaded.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getMaxHeight()
     */
    public void setMaxHeight(Integer value) {
        this.maxHeight = value;
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
