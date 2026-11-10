
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vector complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Vector">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vector")
public class Vector {

    @XmlAttribute(name = "x", required = true)
    protected float x;
    @XmlAttribute(name = "y", required = true)
    protected float y;

    /**
     * Gets the value of the x property.
     *
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     *
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     *
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     *
     */
    public void setY(float value) {
        this.y = value;
    }

}
