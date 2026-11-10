
package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.GeoLocation;
import org.onvif.ver10.schema.PTZSpeed;


/**
 * <p>Java class for anonymous complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Target" type="{http://www.onvif.org/ver10/schema}GeoLocation"/>
 *         <element name="Speed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/>
 *         <element name="AreaHeight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="AreaWidth" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "profileToken",
    "target",
    "speed",
    "areaHeight",
    "areaWidth"
})
@XmlRootElement(name = "GeoMove")
public class GeoMove {

    /**
     * A reference to the MediaProfile.
     *
     */
    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;
    /**
     * The geolocation of the target position.
     *
     */
    @XmlElement(name = "Target", required = true)
    protected GeoLocation target;
    /**
     * An optional Speed.
     *
     */
    @XmlElement(name = "Speed")
    protected PTZSpeed speed;
    /**
     * An optional indication of the height of the target/area.
     *
     */
    @XmlElement(name = "AreaHeight")
    protected Float areaHeight;
    /**
     * An optional indication of the width of the target/area.
     *
     */
    @XmlElement(name = "AreaWidth")
    protected Float areaWidth;

    /**
     * A reference to the MediaProfile.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProfileToken() {
        return profileToken;
    }

    /**
     * Sets the value of the profileToken property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getProfileToken()
     */
    public void setProfileToken(String value) {
        this.profileToken = value;
    }

    /**
     * The geolocation of the target position.
     *
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *
     */
    public GeoLocation getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     *
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *
     * @see #getTarget()
     */
    public void setTarget(GeoLocation value) {
        this.target = value;
    }

    /**
     * An optional Speed.
     *
     * @return
     *     possible object is
     *     {@link PTZSpeed }
     *
     */
    public PTZSpeed getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     *
     * @param value
     *     allowed object is
     *     {@link PTZSpeed }
     *
     * @see #getSpeed()
     */
    public void setSpeed(PTZSpeed value) {
        this.speed = value;
    }

    /**
     * An optional indication of the height of the target/area.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getAreaHeight() {
        return areaHeight;
    }

    /**
     * Sets the value of the areaHeight property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getAreaHeight()
     */
    public void setAreaHeight(Float value) {
        this.areaHeight = value;
    }

    /**
     * An optional indication of the width of the target/area.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getAreaWidth() {
        return areaWidth;
    }

    /**
     * Sets the value of the areaWidth property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getAreaWidth()
     */
    public void setAreaWidth(Float value) {
        this.areaWidth = value;
    }

}
