
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationEntity complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="LocationEntity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GeoLocation" type="{http://www.onvif.org/ver10/schema}GeoLocation" minOccurs="0"/>
 *         <element name="GeoOrientation" type="{http://www.onvif.org/ver10/schema}GeoOrientation" minOccurs="0"/>
 *         <element name="LocalLocation" type="{http://www.onvif.org/ver10/schema}LocalLocation" minOccurs="0"/>
 *         <element name="LocalOrientation" type="{http://www.onvif.org/ver10/schema}LocalOrientation" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       <attribute name="Fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="GeoSource" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="AutoGeo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationEntity", propOrder = {
    "geoLocation",
    "geoOrientation",
    "localLocation",
    "localOrientation"
})
public class LocationEntity {

    /**
     * Location on earth.
     *
     */
    @XmlElement(name = "GeoLocation")
    protected GeoLocation geoLocation;
    /**
     * Orientation relative to earth.
     *
     */
    @XmlElement(name = "GeoOrientation")
    protected GeoOrientation geoOrientation;
    /**
     * Indoor location offset.
     *
     */
    @XmlElement(name = "LocalLocation")
    protected LocalLocation localLocation;
    /**
     * Indoor orientation offset.
     *
     */
    @XmlElement(name = "LocalOrientation")
    protected LocalOrientation localOrientation;
    /**
     * Entity type the entry refers to, use a value from the tt:Entity enumeration.
     *
     */
    @XmlAttribute(name = "Entity")
    protected String entity;
    /**
     * Optional entity token.
     *
     */
    @XmlAttribute(name = "Token")
    protected String token;
    /**
     * If this value is true the entity cannot be deleted.
     *
     */
    @XmlAttribute(name = "Fixed")
    protected Boolean fixed;
    /**
     * Optional reference to the XAddr of another devices DeviceManagement service.
     *
     */
    @XmlAttribute(name = "GeoSource")
    @XmlSchemaType(name = "anyURI")
    protected String geoSource;
    /**
     * If set the geo location is obtained internally.
     *
     */
    @XmlAttribute(name = "AutoGeo")
    protected Boolean autoGeo;

    /**
     * Location on earth.
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
     * Orientation relative to earth.
     *
     * @return
     *     possible object is
     *     {@link GeoOrientation }
     *
     */
    public GeoOrientation getGeoOrientation() {
        return geoOrientation;
    }

    /**
     * Sets the value of the geoOrientation property.
     *
     * @param value
     *     allowed object is
     *     {@link GeoOrientation }
     *
     * @see #getGeoOrientation()
     */
    public void setGeoOrientation(GeoOrientation value) {
        this.geoOrientation = value;
    }

    /**
     * Indoor location offset.
     *
     * @return
     *     possible object is
     *     {@link LocalLocation }
     *
     */
    public LocalLocation getLocalLocation() {
        return localLocation;
    }

    /**
     * Sets the value of the localLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link LocalLocation }
     *
     * @see #getLocalLocation()
     */
    public void setLocalLocation(LocalLocation value) {
        this.localLocation = value;
    }

    /**
     * Indoor orientation offset.
     *
     * @return
     *     possible object is
     *     {@link LocalOrientation }
     *
     */
    public LocalOrientation getLocalOrientation() {
        return localOrientation;
    }

    /**
     * Sets the value of the localOrientation property.
     *
     * @param value
     *     allowed object is
     *     {@link LocalOrientation }
     *
     * @see #getLocalOrientation()
     */
    public void setLocalOrientation(LocalOrientation value) {
        this.localOrientation = value;
    }

    /**
     * Entity type the entry refers to, use a value from the tt:Entity enumeration.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getEntity()
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Optional entity token.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getToken()
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * If this value is true the entity cannot be deleted.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isFixed() {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isFixed()
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
    }

    /**
     * Optional reference to the XAddr of another devices DeviceManagement service.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGeoSource() {
        return geoSource;
    }

    /**
     * Sets the value of the geoSource property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getGeoSource()
     */
    public void setGeoSource(String value) {
        this.geoSource = value;
    }

    /**
     * If set the geo location is obtained internally.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isAutoGeo() {
        return autoGeo;
    }

    /**
     * Sets the value of the autoGeo property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isAutoGeo()
     */
    public void setAutoGeo(Boolean value) {
        this.autoGeo = value;
    }

}
