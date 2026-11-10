
package org.onvif.ver20.ptz.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.GeoLocation;
import org.onvif.ver10.schema.PTZSpeed;
import org.onvif.ver10.schema.PTZVector;
import org.w3c.dom.Element;


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
 *         <element name="PresetToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
 *         <element name="GeoLocation" type="{http://www.onvif.org/ver10/schema}GeoLocation" minOccurs="0"/>
 *         <element name="TargetPosition" type="{http://www.onvif.org/ver10/schema}PTZVector" minOccurs="0"/>
 *         <element name="Speed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/>
 *         <element name="ObjectID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
    "presetToken",
    "geoLocation",
    "targetPosition",
    "speed",
    "objectID",
    "any"
})
@XmlRootElement(name = "MoveAndStartTracking")
public class MoveAndStartTracking {

    /**
     * A reference to the MediaProfile where the operation should take place.
     *
     */
    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;
    /**
     * A preset token.
     *
     */
    @XmlElement(name = "PresetToken")
    protected String presetToken;
    /**
     * The geolocation of the target position.
     *
     */
    @XmlElement(name = "GeoLocation")
    protected GeoLocation geoLocation;
    /**
     * A Position vector specifying the absolute target position.
     *
     */
    @XmlElement(name = "TargetPosition")
    protected PTZVector targetPosition;
    /**
     * Speed vector specifying the velocity of pan, tilt and zoom.
     *
     */
    @XmlElement(name = "Speed")
    protected PTZSpeed speed;
    /**
     * Object ID of the object to track.
     *
     */
    @XmlElement(name = "ObjectID")
    protected BigInteger objectID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * A reference to the MediaProfile where the operation should take place.
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
     * A preset token.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPresetToken() {
        return presetToken;
    }

    /**
     * Sets the value of the presetToken property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getPresetToken()
     */
    public void setPresetToken(String value) {
        this.presetToken = value;
    }

    /**
     * The geolocation of the target position.
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
     * @see #getGeoLocation()
     */
    public void setGeoLocation(GeoLocation value) {
        this.geoLocation = value;
    }

    /**
     * A Position vector specifying the absolute target position.
     *
     * @return
     *     possible object is
     *     {@link PTZVector }
     *
     */
    public PTZVector getTargetPosition() {
        return targetPosition;
    }

    /**
     * Sets the value of the targetPosition property.
     *
     * @param value
     *     allowed object is
     *     {@link PTZVector }
     *
     * @see #getTargetPosition()
     */
    public void setTargetPosition(PTZVector value) {
        this.targetPosition = value;
    }

    /**
     * Speed vector specifying the velocity of pan, tilt and zoom.
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
     * Object ID of the object to track.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     * @see #getObjectID()
     */
    public void setObjectID(BigInteger value) {
        this.objectID = value;
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

}
