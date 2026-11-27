
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for VideoAttributes complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="VideoAttributes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bitrate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Framerate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAttributes", propOrder = {
    "bitrate",
    "width",
    "height",
    "encoding",
    "framerate",
    "any"
})
public class VideoAttributes {

    /**
     * Average bitrate in kbps.
     *
     */
    @XmlElement(name = "Bitrate")
    protected Integer bitrate;
    /**
     * The width of the video in pixels.
     *
     */
    @XmlElement(name = "Width")
    protected int width;
    /**
     * The height of the video in pixels.
     *
     */
    @XmlElement(name = "Height")
    protected int height;
    /**
     * Video encoding of the track.  Use value from tt:VideoEncoding for MPEG4. Otherwise use values from tt:VideoEncodingMimeNames and
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iana.org/assignments/media-types/media-types.xhtml#video"&gt; IANA Media Types&lt;/a&gt;
     * </pre>
     * .
     *
     */
    @XmlElement(name = "Encoding", required = true)
    protected String encoding;
    /**
     * Average framerate in frames per second.
     *
     */
    @XmlElement(name = "Framerate")
    protected float framerate;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Average bitrate in kbps.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Sets the value of the bitrate property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     * @see #getBitrate()
     */
    public void setBitrate(Integer value) {
        this.bitrate = value;
    }

    /**
     * The width of the video in pixels.
     *
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     *
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * The height of the video in pixels.
     *
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     *
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Video encoding of the track.  Use value from tt:VideoEncoding for MPEG4. Otherwise use values from tt:VideoEncodingMimeNames and
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;a xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema" href="https://www.iana.org/assignments/media-types/media-types.xhtml#video"&gt; IANA Media Types&lt;/a&gt;
     * </pre>
     * .
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getEncoding()
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Average framerate in frames per second.
     *
     */
    public float getFramerate() {
        return framerate;
    }

    /**
     * Sets the value of the framerate property.
     *
     */
    public void setFramerate(float value) {
        this.framerate = value;
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
