
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for Frame complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Frame">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PTZStatus" type="{http://www.onvif.org/ver10/schema}PTZStatus" minOccurs="0"/>
 *         <element name="Transformation" type="{http://www.onvif.org/ver10/schema}Transformation" minOccurs="0"/>
 *         <element name="Object" type="{http://www.onvif.org/ver10/schema}Object" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ObjectTree" type="{http://www.onvif.org/ver10/schema}ObjectTree" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}FrameExtension" minOccurs="0"/>
 *         <element name="SceneImageRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="SceneImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="AspectRatioTransformation" type="{http://www.onvif.org/ver10/schema}AspectRatioTransformation" maxOccurs="unbounded" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="UtcTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="Colorspace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Frame", propOrder = {
    "ptzStatus",
    "transformation",
    "object",
    "objectTree",
    "extension",
    "sceneImageRef",
    "sceneImage",
    "aspectRatioTransformation",
    "any"
})
public class Frame {

    @XmlElement(name = "PTZStatus")
    protected PTZStatus ptzStatus;
    @XmlElement(name = "Transformation")
    protected Transformation transformation;
    @XmlElement(name = "Object")
    protected List<org.onvif.ver10.schema.Object> object;
    @XmlElement(name = "ObjectTree")
    protected ObjectTree objectTree;
    @XmlElement(name = "Extension")
    protected FrameExtension extension;
    @XmlElement(name = "SceneImageRef")
    @XmlSchemaType(name = "anyURI")
    protected String sceneImageRef;
    @XmlElement(name = "SceneImage")
    protected byte[] sceneImage;
    @XmlElement(name = "AspectRatioTransformation")
    protected List<AspectRatioTransformation> aspectRatioTransformation;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "UtcTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcTime;
    /**
     * Default color space of Color definitions in frame. Valid values are "RGB" and "YCbCr". Defaults to "YCbCr".
     *
     */
    @XmlAttribute(name = "Colorspace")
    protected String colorspace;
    /**
     * Optional name of the analytics module that generated this frame.
     *
     */
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the ptzStatus property.
     *
     * @return
     *     possible object is
     *     {@link PTZStatus }
     *
     */
    public PTZStatus getPTZStatus() {
        return ptzStatus;
    }

    /**
     * Sets the value of the ptzStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link PTZStatus }
     *
     */
    public void setPTZStatus(PTZStatus value) {
        this.ptzStatus = value;
    }

    /**
     * Gets the value of the transformation property.
     *
     * @return
     *     possible object is
     *     {@link Transformation }
     *
     */
    public Transformation getTransformation() {
        return transformation;
    }

    /**
     * Sets the value of the transformation property.
     *
     * @param value
     *     allowed object is
     *     {@link Transformation }
     *
     */
    public void setTransformation(Transformation value) {
        this.transformation = value;
    }

    /**
     * Gets the value of the object property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getObject().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.onvif.ver10.schema.Object }
     * </p>
     *
     *
     * @return
     *     The value of the object property.
     */
    public List<org.onvif.ver10.schema.Object> getObject() {
        if (object == null) {
            object = new ArrayList<>();
        }
        return this.object;
    }

    /**
     * Gets the value of the objectTree property.
     *
     * @return
     *     possible object is
     *     {@link ObjectTree }
     *
     */
    public ObjectTree getObjectTree() {
        return objectTree;
    }

    /**
     * Sets the value of the objectTree property.
     *
     * @param value
     *     allowed object is
     *     {@link ObjectTree }
     *
     */
    public void setObjectTree(ObjectTree value) {
        this.objectTree = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link FrameExtension }
     *
     */
    public FrameExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link FrameExtension }
     *
     */
    public void setExtension(FrameExtension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the sceneImageRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSceneImageRef() {
        return sceneImageRef;
    }

    /**
     * Sets the value of the sceneImageRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSceneImageRef(String value) {
        this.sceneImageRef = value;
    }

    /**
     * Gets the value of the sceneImage property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSceneImage() {
        return sceneImage;
    }

    /**
     * Sets the value of the sceneImage property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSceneImage(byte[] value) {
        this.sceneImage = value;
    }

    /**
     * Gets the value of the aspectRatioTransformation property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aspectRatioTransformation property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAspectRatioTransformation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AspectRatioTransformation }
     * </p>
     *
     *
     * @return
     *     The value of the aspectRatioTransformation property.
     */
    public List<AspectRatioTransformation> getAspectRatioTransformation() {
        if (aspectRatioTransformation == null) {
            aspectRatioTransformation = new ArrayList<>();
        }
        return this.aspectRatioTransformation;
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
     * Gets the value of the utcTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUtcTime() {
        return utcTime;
    }

    /**
     * Sets the value of the utcTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUtcTime(XMLGregorianCalendar value) {
        this.utcTime = value;
    }

    /**
     * Default color space of Color definitions in frame. Valid values are "RGB" and "YCbCr". Defaults to "YCbCr".
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColorspace() {
        return colorspace;
    }

    /**
     * Sets the value of the colorspace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getColorspace()
     */
    public void setColorspace(String value) {
        this.colorspace = value;
    }

    /**
     * Optional name of the analytics module that generated this frame.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getSource()
     */
    public void setSource(String value) {
        this.source = value;
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
