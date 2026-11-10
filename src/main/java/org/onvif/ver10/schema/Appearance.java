
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver20.analytics.humanbody.HumanBody;
import org.onvif.ver20.analytics.humanface.HumanFace;
import org.w3c.dom.Element;


/**
 * <p>Java class for Appearance complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Appearance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Transformation" type="{http://www.onvif.org/ver10/schema}Transformation" minOccurs="0"/>
 *         <element name="Shape" type="{http://www.onvif.org/ver10/schema}ShapeDescriptor" minOccurs="0"/>
 *         <element name="Color" type="{http://www.onvif.org/ver10/schema}ColorDescriptor" minOccurs="0"/>
 *         <element name="Class" type="{http://www.onvif.org/ver10/schema}ClassDescriptor" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}AppearanceExtension" minOccurs="0"/>
 *         <element name="GeoLocation" type="{http://www.onvif.org/ver10/schema}GeoLocation" minOccurs="0"/>
 *         <element name="VehicleInfo" type="{http://www.onvif.org/ver10/schema}VehicleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LicensePlateInfo" type="{http://www.onvif.org/ver10/schema}LicensePlateInfo" minOccurs="0"/>
 *         <element name="HumanFace" type="{http://www.onvif.org/ver20/analytics/humanface}HumanFace" minOccurs="0"/>
 *         <element name="HumanBody" type="{http://www.onvif.org/ver20/analytics/humanbody}HumanBody" minOccurs="0"/>
 *         <element name="ImageRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="Image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="BarcodeInfo" type="{http://www.onvif.org/ver10/schema}BarcodeInfo" minOccurs="0"/>
 *         <element name="SphericalCoordinate" type="{http://www.onvif.org/ver10/schema}SphericalCoordinate" minOccurs="0"/>
 *         <element name="Label" type="{http://www.onvif.org/ver10/schema}LabelInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Appearance", propOrder = {
    "transformation",
    "shape",
    "color",
    "clazz",
    "extension",
    "geoLocation",
    "vehicleInfo",
    "licensePlateInfo",
    "humanFace",
    "humanBody",
    "imageRef",
    "image",
    "barcodeInfo",
    "sphericalCoordinate",
    "label",
    "any"
})
public class Appearance {

    @XmlElement(name = "Transformation")
    protected Transformation transformation;
    @XmlElement(name = "Shape")
    protected ShapeDescriptor shape;
    @XmlElement(name = "Color")
    protected ColorDescriptor color;
    @XmlElement(name = "Class")
    protected ClassDescriptor clazz;
    @XmlElement(name = "Extension")
    protected AppearanceExtension extension;
    @XmlElement(name = "GeoLocation")
    protected GeoLocation geoLocation;
    @XmlElement(name = "VehicleInfo")
    protected List<VehicleInfo> vehicleInfo;
    @XmlElement(name = "LicensePlateInfo")
    protected LicensePlateInfo licensePlateInfo;
    @XmlElement(name = "HumanFace")
    protected HumanFace humanFace;
    @XmlElement(name = "HumanBody")
    protected HumanBody humanBody;
    @XmlElement(name = "ImageRef")
    @XmlSchemaType(name = "anyURI")
    protected String imageRef;
    @XmlElement(name = "Image")
    protected byte[] image;
    @XmlElement(name = "BarcodeInfo")
    protected BarcodeInfo barcodeInfo;
    @XmlElement(name = "SphericalCoordinate")
    protected SphericalCoordinate sphericalCoordinate;
    @XmlElement(name = "Label")
    protected List<LabelInfo> label;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

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
     * Gets the value of the shape property.
     *
     * @return
     *     possible object is
     *     {@link ShapeDescriptor }
     *
     */
    public ShapeDescriptor getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     *
     * @param value
     *     allowed object is
     *     {@link ShapeDescriptor }
     *
     */
    public void setShape(ShapeDescriptor value) {
        this.shape = value;
    }

    /**
     * Gets the value of the color property.
     *
     * @return
     *     possible object is
     *     {@link ColorDescriptor }
     *
     */
    public ColorDescriptor getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value
     *     allowed object is
     *     {@link ColorDescriptor }
     *
     */
    public void setColor(ColorDescriptor value) {
        this.color = value;
    }

    /**
     * Gets the value of the clazz property.
     *
     * @return
     *     possible object is
     *     {@link ClassDescriptor }
     *
     */
    public ClassDescriptor getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     *
     * @param value
     *     allowed object is
     *     {@link ClassDescriptor }
     *
     */
    public void setClazz(ClassDescriptor value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link AppearanceExtension }
     *
     */
    public AppearanceExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link AppearanceExtension }
     *
     */
    public void setExtension(AppearanceExtension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the geoLocation property.
     *
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *
     */
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *
     */
    public void setGeoLocation(GeoLocation value) {
        this.geoLocation = value;
    }

    /**
     * Gets the value of the vehicleInfo property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInfo property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVehicleInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleInfo }
     * </p>
     *
     *
     * @return
     *     The value of the vehicleInfo property.
     */
    public List<VehicleInfo> getVehicleInfo() {
        if (vehicleInfo == null) {
            vehicleInfo = new ArrayList<>();
        }
        return this.vehicleInfo;
    }

    /**
     * Gets the value of the licensePlateInfo property.
     *
     * @return
     *     possible object is
     *     {@link LicensePlateInfo }
     *
     */
    public LicensePlateInfo getLicensePlateInfo() {
        return licensePlateInfo;
    }

    /**
     * Sets the value of the licensePlateInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link LicensePlateInfo }
     *
     */
    public void setLicensePlateInfo(LicensePlateInfo value) {
        this.licensePlateInfo = value;
    }

    /**
     * Gets the value of the humanFace property.
     *
     * @return
     *     possible object is
     *     {@link HumanFace }
     *
     */
    public HumanFace getHumanFace() {
        return humanFace;
    }

    /**
     * Sets the value of the humanFace property.
     *
     * @param value
     *     allowed object is
     *     {@link HumanFace }
     *
     */
    public void setHumanFace(HumanFace value) {
        this.humanFace = value;
    }

    /**
     * Gets the value of the humanBody property.
     *
     * @return
     *     possible object is
     *     {@link HumanBody }
     *
     */
    public HumanBody getHumanBody() {
        return humanBody;
    }

    /**
     * Sets the value of the humanBody property.
     *
     * @param value
     *     allowed object is
     *     {@link HumanBody }
     *
     */
    public void setHumanBody(HumanBody value) {
        this.humanBody = value;
    }

    /**
     * Gets the value of the imageRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImageRef() {
        return imageRef;
    }

    /**
     * Sets the value of the imageRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImageRef(String value) {
        this.imageRef = value;
    }

    /**
     * Gets the value of the image property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

    /**
     * Gets the value of the barcodeInfo property.
     *
     * @return
     *     possible object is
     *     {@link BarcodeInfo }
     *
     */
    public BarcodeInfo getBarcodeInfo() {
        return barcodeInfo;
    }

    /**
     * Sets the value of the barcodeInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link BarcodeInfo }
     *
     */
    public void setBarcodeInfo(BarcodeInfo value) {
        this.barcodeInfo = value;
    }

    /**
     * Gets the value of the sphericalCoordinate property.
     *
     * @return
     *     possible object is
     *     {@link SphericalCoordinate }
     *
     */
    public SphericalCoordinate getSphericalCoordinate() {
        return sphericalCoordinate;
    }

    /**
     * Sets the value of the sphericalCoordinate property.
     *
     * @param value
     *     allowed object is
     *     {@link SphericalCoordinate }
     *
     */
    public void setSphericalCoordinate(SphericalCoordinate value) {
        this.sphericalCoordinate = value;
    }

    /**
     * Gets the value of the label property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLabel().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelInfo }
     * </p>
     *
     *
     * @return
     *     The value of the label property.
     */
    public List<LabelInfo> getLabel() {
        if (label == null) {
            label = new ArrayList<>();
        }
        return this.label;
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
