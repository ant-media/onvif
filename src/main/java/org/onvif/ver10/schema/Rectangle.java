
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rectangle complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Rectangle">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="bottom" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="top" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="right" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="left" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rectangle")
public class Rectangle {

    @XmlAttribute(name = "bottom", required = true)
    protected float bottom;
    @XmlAttribute(name = "top", required = true)
    protected float top;
    @XmlAttribute(name = "right", required = true)
    protected float right;
    @XmlAttribute(name = "left", required = true)
    protected float left;

    /**
     * Gets the value of the bottom property.
     *
     */
    public float getBottom() {
        return bottom;
    }

    /**
     * Sets the value of the bottom property.
     *
     */
    public void setBottom(float value) {
        this.bottom = value;
    }

    /**
     * Gets the value of the top property.
     *
     */
    public float getTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     *
     */
    public void setTop(float value) {
        this.top = value;
    }

    /**
     * Gets the value of the right property.
     *
     */
    public float getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     *
     */
    public void setRight(float value) {
        this.right = value;
    }

    /**
     * Gets the value of the left property.
     *
     */
    public float getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     *
     */
    public void setLeft(float value) {
        this.left = value;
    }

}
