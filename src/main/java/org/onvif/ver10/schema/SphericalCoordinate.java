
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for SphericalCoordinate complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="SphericalCoordinate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="ElevationAngle" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="AzimuthAngle" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SphericalCoordinate", propOrder = {
    "any"
})
public class SphericalCoordinate {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Distance in meters to the object.
     *
     */
    @XmlAttribute(name = "Distance")
    protected Float distance;
    /**
     * Elevation angle in the range -90 to 90 degrees, where 0 is in level with the x-y plane.
     *
     */
    @XmlAttribute(name = "ElevationAngle")
    protected Float elevationAngle;
    /**
     * Azimuth angle in the range -180 to 180 degrees counter clockwise, where 0 is rightwards.
     *
     */
    @XmlAttribute(name = "AzimuthAngle")
    protected Float azimuthAngle;

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
     * Distance in meters to the object.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getDistance()
     */
    public void setDistance(Float value) {
        this.distance = value;
    }

    /**
     * Elevation angle in the range -90 to 90 degrees, where 0 is in level with the x-y plane.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getElevationAngle() {
        return elevationAngle;
    }

    /**
     * Sets the value of the elevationAngle property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getElevationAngle()
     */
    public void setElevationAngle(Float value) {
        this.elevationAngle = value;
    }

    /**
     * Azimuth angle in the range -180 to 180 degrees counter clockwise, where 0 is rightwards.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getAzimuthAngle() {
        return azimuthAngle;
    }

    /**
     * Sets the value of the azimuthAngle property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getAzimuthAngle()
     */
    public void setAzimuthAngle(Float value) {
        this.azimuthAngle = value;
    }

}
