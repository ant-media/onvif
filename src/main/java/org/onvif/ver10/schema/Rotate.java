
package org.onvif.ver10.schema;

import java.util.HashMap;
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
 * <p>Java class for Rotate complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Rotate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}RotateMode"/>
 *         <element name="Degree" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}RotateExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Mirror" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rotate", propOrder = {
    "mode",
    "degree",
    "extension"
})
public class Rotate {

    /**
     * Parameter to enable/disable Rotation feature.
     *
     */
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected RotateMode mode;
    /**
     * Optional parameter to configure how much degree of clockwise rotation of image  for On mode. Omitting this parameter for On mode means 180 degree rotation.
     *
     */
    @XmlElement(name = "Degree")
    protected Integer degree;
    @XmlElement(name = "Extension")
    protected RotateExtension extension;
    /**
     * When enabled, the video will be flipped horizontally. If applied alongside rotation, the mirror effect shall be executed after the rotation. Additionally,
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     *
     * 				when Mirror is enabled and Reverse=Auto is set in PTControlDirection or if the device doesn't support Reverse in PTControlDirection, the device shall automatically adjust the pan direction.
     *
     */
    @XmlAttribute(name = "Mirror")
    protected Boolean mirror;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Parameter to enable/disable Rotation feature.
     *
     * @return
     *     possible object is
     *     {@link RotateMode }
     *
     */
    public RotateMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     *
     * @param value
     *     allowed object is
     *     {@link RotateMode }
     *
     * @see #getMode()
     */
    public void setMode(RotateMode value) {
        this.mode = value;
    }

    /**
     * Optional parameter to configure how much degree of clockwise rotation of image  for On mode. Omitting this parameter for On mode means 180 degree rotation.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getDegree() {
        return degree;
    }

    /**
     * Sets the value of the degree property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getDegree()
     */
    public void setDegree(Integer value) {
        this.degree = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link RotateExtension }
     *
     */
    public RotateExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link RotateExtension }
     *
     */
    public void setExtension(RotateExtension value) {
        this.extension = value;
    }

    /**
     * When enabled, the video will be flipped horizontally. If applied alongside rotation, the mirror effect shall be executed after the rotation. Additionally,
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     *
     * 				when Mirror is enabled and Reverse=Auto is set in PTControlDirection or if the device doesn't support Reverse in PTControlDirection, the device shall automatically adjust the pan direction.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMirror() {
        return mirror;
    }

    /**
     * Sets the value of the mirror property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isMirror()
     */
    public void setMirror(Boolean value) {
        this.mirror = value;
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
