
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldOfView complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FieldOfView">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="hfov" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="vfov" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldOfView")
public class FieldOfView {

    /**
     * Horizontal field-of-view in degrees.
     *
     */
    @XmlAttribute(name = "hfov", required = true)
    protected float hfov;
    /**
     * Vertical field-of-view in degrees.
     *
     */
    @XmlAttribute(name = "vfov", required = true)
    protected float vfov;

    /**
     * Horizontal field-of-view in degrees.
     *
     */
    public float getHfov() {
        return hfov;
    }

    /**
     * Sets the value of the hfov property.
     *
     */
    public void setHfov(float value) {
        this.hfov = value;
    }

    /**
     * Vertical field-of-view in degrees.
     *
     */
    public float getVfov() {
        return vfov;
    }

    /**
     * Sets the value of the vfov property.
     *
     */
    public void setVfov(float value) {
        this.vfov = value;
    }

}
