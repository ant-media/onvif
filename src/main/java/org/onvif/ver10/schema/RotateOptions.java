
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
 * <p>Java class for RotateOptions complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RotateOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}RotateMode" maxOccurs="unbounded"/>
 *         <element name="DegreeList" type="{http://www.onvif.org/ver10/schema}IntItems" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}RotateOptionsExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Reboot" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "RotateOptions", propOrder = {
    "mode",
    "degreeList",
    "extension"
})
public class RotateOptions {

    /**
     * Supported options of Rotate mode parameter.
     *
     */
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected List<RotateMode> mode;
    /**
     * List of supported degree value for rotation.
     *
     */
    @XmlElement(name = "DegreeList")
    protected IntItems degreeList;
    @XmlElement(name = "Extension")
    protected RotateOptionsExtension extension;
    /**
     * Signals if a device requires a reboot after changing the rotation or mirror.
     * 				If a device can handle rotation changes or mirror changes without rebooting this value shall be set to false.
     *
     */
    @XmlAttribute(name = "Reboot")
    protected Boolean reboot;
    /**
     * Signals if video source mirroring is supported.
     *
     */
    @XmlAttribute(name = "Mirror")
    protected Boolean mirror;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Supported options of Rotate mode parameter.
     *
     * Gets the value of the mode property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RotateMode }
     * </p>
     *
     *
     * @return
     *     The value of the mode property.
     */
    public List<RotateMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<>();
        }
        return this.mode;
    }

    /**
     * List of supported degree value for rotation.
     *
     * @return
     *     possible object is
     *     {@link IntItems }
     *
     */
    public IntItems getDegreeList() {
        return degreeList;
    }

    /**
     * Sets the value of the degreeList property.
     *
     * @param value
     *     allowed object is
     *     {@link IntItems }
     *
     * @see #getDegreeList()
     */
    public void setDegreeList(IntItems value) {
        this.degreeList = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link RotateOptionsExtension }
     *
     */
    public RotateOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link RotateOptionsExtension }
     *
     */
    public void setExtension(RotateOptionsExtension value) {
        this.extension = value;
    }

    /**
     * Signals if a device requires a reboot after changing the rotation or mirror.
     * 				If a device can handle rotation changes or mirror changes without rebooting this value shall be set to false.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isReboot() {
        return reboot;
    }

    /**
     * Sets the value of the reboot property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isReboot()
     */
    public void setReboot(Boolean value) {
        this.reboot = value;
    }

    /**
     * Signals if video source mirroring is supported.
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
