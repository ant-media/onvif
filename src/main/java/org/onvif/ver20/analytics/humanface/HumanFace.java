
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
import org.onvif.ver10.schema.IntRange;
import org.w3c.dom.Element;


/**
 * <p>Java class for HumanFace complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="HumanFace">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Age" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/>
 *         <element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Temperature" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="Complexion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FacialShape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Hair" type="{http://www.onvif.org/ver20/analytics/humanface}Hair" minOccurs="0"/>
 *         <element name="Eyebrow" type="{http://www.onvif.org/ver20/analytics/humanface}Eyebrow" minOccurs="0"/>
 *         <element name="Eye" type="{http://www.onvif.org/ver20/analytics/humanface}Eye" minOccurs="0"/>
 *         <element name="Ear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Nose" type="{http://www.onvif.org/ver20/analytics/humanface}Nose" minOccurs="0"/>
 *         <element name="FacialHair" type="{http://www.onvif.org/ver20/analytics/humanface}FacialHair" minOccurs="0"/>
 *         <element name="Lip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Chin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Expression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PoseAngle" type="{http://www.onvif.org/ver20/analytics/humanface}PoseAngle" minOccurs="0"/>
 *         <element name="Accessory" type="{http://www.onvif.org/ver20/analytics/humanface}Accessory" minOccurs="0"/>
 *         <element name="AdditionalFeatures" type="{http://www.onvif.org/ver20/analytics/humanface}AdditionalFeatures" minOccurs="0"/>
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
@XmlType(name = "HumanFace", propOrder = {
    "age",
    "gender",
    "temperature",
    "complexion",
    "facialShape",
    "hair",
    "eyebrow",
    "eye",
    "ear",
    "nose",
    "facialHair",
    "lip",
    "chin",
    "expression",
    "poseAngle",
    "accessory",
    "additionalFeatures",
    "any"
})
public class HumanFace {

    /**
     * Describe the age of the face.
     *
     */
    @XmlElement(name = "Age")
    protected IntRange age;
    /**
     * Describe the gender of the face, acceptable values are defined in fc:Gender.
     *
     */
    @XmlElement(name = "Gender")
    protected String gender;
    /**
     * Describe the temperature of the face, in Kelvin.
     *
     */
    @XmlElement(name = "Temperature")
    protected Float temperature;
    /**
     * Describe the complexion of the face, acceptable values are defined in fc:Complexion.
     *
     */
    @XmlElement(name = "Complexion")
    protected String complexion;
    /**
     * Describe the FacialShape, acceptable values are defined fc:FacialShape.
     *
     */
    @XmlElement(name = "FacialShape")
    protected String facialShape;
    /**
     * Describe the hair of the face.
     *
     */
    @XmlElement(name = "Hair")
    protected Hair hair;
    /**
     * Describe the eyebrow of the face.
     *
     */
    @XmlElement(name = "Eyebrow")
    protected Eyebrow eyebrow;
    /**
     * Describe the eye of the face.
     *
     */
    @XmlElement(name = "Eye")
    protected Eye eye;
    /**
     * Describe the Ear of the face. For definitions see fc:EarShape.
     *
     */
    @XmlElement(name = "Ear")
    protected String ear;
    /**
     * Describe the nose of the face.
     *
     */
    @XmlElement(name = "Nose")
    protected Nose nose;
    /**
     * Describe the facial hair of the face.
     *
     */
    @XmlElement(name = "FacialHair")
    protected FacialHair facialHair;
    /**
     * Describe the lip of the face, acceptable values are defined in fc:Lip.
     *
     */
    @XmlElement(name = "Lip")
    protected String lip;
    /**
     * Describe the Chin of the face, acceptable values are defined in fc:Chin.
     *
     */
    @XmlElement(name = "Chin")
    protected String chin;
    /**
     * Describe the expression on the face, acceptable values are defined in fc:Expression.
     *
     */
    @XmlElement(name = "Expression")
    protected String expression;
    /**
     * Describe the pose angle of the face.
     *
     */
    @XmlElement(name = "PoseAngle")
    protected PoseAngle poseAngle;
    /**
     * Describe the Accessory of the face.
     *
     */
    @XmlElement(name = "Accessory")
    protected Accessory accessory;
    /**
     * Describe the other features, eg scar, mole etc of the face.
     *
     */
    @XmlElement(name = "AdditionalFeatures")
    protected AdditionalFeatures additionalFeatures;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Describe the age of the face.
     *
     * @return
     *     possible object is
     *     {@link IntRange }
     *
     */
    public IntRange getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     *
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *
     * @see #getAge()
     */
    public void setAge(IntRange value) {
        this.age = value;
    }

    /**
     * Describe the gender of the face, acceptable values are defined in fc:Gender.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getGender()
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Describe the temperature of the face, in Kelvin.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getTemperature()
     */
    public void setTemperature(Float value) {
        this.temperature = value;
    }

    /**
     * Describe the complexion of the face, acceptable values are defined in fc:Complexion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComplexion() {
        return complexion;
    }

    /**
     * Sets the value of the complexion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getComplexion()
     */
    public void setComplexion(String value) {
        this.complexion = value;
    }

    /**
     * Describe the FacialShape, acceptable values are defined fc:FacialShape.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFacialShape() {
        return facialShape;
    }

    /**
     * Sets the value of the facialShape property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getFacialShape()
     */
    public void setFacialShape(String value) {
        this.facialShape = value;
    }

    /**
     * Describe the hair of the face.
     *
     * @return
     *     possible object is
     *     {@link Hair }
     *
     */
    public Hair getHair() {
        return hair;
    }

    /**
     * Sets the value of the hair property.
     *
     * @param value
     *     allowed object is
     *     {@link Hair }
     *
     * @see #getHair()
     */
    public void setHair(Hair value) {
        this.hair = value;
    }

    /**
     * Describe the eyebrow of the face.
     *
     * @return
     *     possible object is
     *     {@link Eyebrow }
     *
     */
    public Eyebrow getEyebrow() {
        return eyebrow;
    }

    /**
     * Sets the value of the eyebrow property.
     *
     * @param value
     *     allowed object is
     *     {@link Eyebrow }
     *
     * @see #getEyebrow()
     */
    public void setEyebrow(Eyebrow value) {
        this.eyebrow = value;
    }

    /**
     * Describe the eye of the face.
     *
     * @return
     *     possible object is
     *     {@link Eye }
     *
     */
    public Eye getEye() {
        return eye;
    }

    /**
     * Sets the value of the eye property.
     *
     * @param value
     *     allowed object is
     *     {@link Eye }
     *
     * @see #getEye()
     */
    public void setEye(Eye value) {
        this.eye = value;
    }

    /**
     * Describe the Ear of the face. For definitions see fc:EarShape.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEar() {
        return ear;
    }

    /**
     * Sets the value of the ear property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getEar()
     */
    public void setEar(String value) {
        this.ear = value;
    }

    /**
     * Describe the nose of the face.
     *
     * @return
     *     possible object is
     *     {@link Nose }
     *
     */
    public Nose getNose() {
        return nose;
    }

    /**
     * Sets the value of the nose property.
     *
     * @param value
     *     allowed object is
     *     {@link Nose }
     *
     * @see #getNose()
     */
    public void setNose(Nose value) {
        this.nose = value;
    }

    /**
     * Describe the facial hair of the face.
     *
     * @return
     *     possible object is
     *     {@link FacialHair }
     *
     */
    public FacialHair getFacialHair() {
        return facialHair;
    }

    /**
     * Sets the value of the facialHair property.
     *
     * @param value
     *     allowed object is
     *     {@link FacialHair }
     *
     * @see #getFacialHair()
     */
    public void setFacialHair(FacialHair value) {
        this.facialHair = value;
    }

    /**
     * Describe the lip of the face, acceptable values are defined in fc:Lip.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLip() {
        return lip;
    }

    /**
     * Sets the value of the lip property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getLip()
     */
    public void setLip(String value) {
        this.lip = value;
    }

    /**
     * Describe the Chin of the face, acceptable values are defined in fc:Chin.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChin() {
        return chin;
    }

    /**
     * Sets the value of the chin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getChin()
     */
    public void setChin(String value) {
        this.chin = value;
    }

    /**
     * Describe the expression on the face, acceptable values are defined in fc:Expression.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getExpression()
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Describe the pose angle of the face.
     *
     * @return
     *     possible object is
     *     {@link PoseAngle }
     *
     */
    public PoseAngle getPoseAngle() {
        return poseAngle;
    }

    /**
     * Sets the value of the poseAngle property.
     *
     * @param value
     *     allowed object is
     *     {@link PoseAngle }
     *
     * @see #getPoseAngle()
     */
    public void setPoseAngle(PoseAngle value) {
        this.poseAngle = value;
    }

    /**
     * Describe the Accessory of the face.
     *
     * @return
     *     possible object is
     *     {@link Accessory }
     *
     */
    public Accessory getAccessory() {
        return accessory;
    }

    /**
     * Sets the value of the accessory property.
     *
     * @param value
     *     allowed object is
     *     {@link Accessory }
     *
     * @see #getAccessory()
     */
    public void setAccessory(Accessory value) {
        this.accessory = value;
    }

    /**
     * Describe the other features, eg scar, mole etc of the face.
     *
     * @return
     *     possible object is
     *     {@link AdditionalFeatures }
     *
     */
    public AdditionalFeatures getAdditionalFeatures() {
        return additionalFeatures;
    }

    /**
     * Sets the value of the additionalFeatures property.
     *
     * @param value
     *     allowed object is
     *     {@link AdditionalFeatures }
     *
     * @see #getAdditionalFeatures()
     */
    public void setAdditionalFeatures(AdditionalFeatures value) {
        this.additionalFeatures = value;
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
