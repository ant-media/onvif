
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneOrientation complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="SceneOrientation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}SceneOrientationMode"/>
 *         <element name="Orientation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneOrientation", propOrder = {
    "mode",
    "orientation"
})
public class SceneOrientation {

    /**
     * Parameter to assign the way the camera determines the scene orientation.
     *
     */
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected SceneOrientationMode mode;
    /**
     * Assigned or determined scene orientation based on the Mode. When assigning the Mode to AUTO, this field
     * 						is optional and will be ignored by the device. When assigning the Mode to MANUAL, this field is required
     * 						and the device will return an InvalidArgs fault if missing.
     *
     */
    @XmlElement(name = "Orientation")
    protected String orientation;

    /**
     * Parameter to assign the way the camera determines the scene orientation.
     *
     * @return
     *     possible object is
     *     {@link SceneOrientationMode }
     *
     */
    public SceneOrientationMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     *
     * @param value
     *     allowed object is
     *     {@link SceneOrientationMode }
     *
     * @see #getMode()
     */
    public void setMode(SceneOrientationMode value) {
        this.mode = value;
    }

    /**
     * Assigned or determined scene orientation based on the Mode. When assigning the Mode to AUTO, this field
     * 						is optional and will be ignored by the device. When assigning the Mode to MANUAL, this field is required
     * 						and the device will return an InvalidArgs fault if missing.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getOrientation()
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

}
