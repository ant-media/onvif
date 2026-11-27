
package org.onvif.ver20.media.wsdl;

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
 * <p>Java class for EncoderInstanceInfo complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="EncoderInstanceInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Codec" type="{http://www.onvif.org/ver20/media/wsdl}EncoderInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "EncoderInstanceInfo", propOrder = {
    "codec",
    "total",
    "any"
})
public class EncoderInstanceInfo {

    /**
     * If a device limits the number of instances for respective Video Codecs the response contains the information how many streams can be set up at the same time per VideoSource.
     *
     */
    @XmlElement(name = "Codec")
    protected List<EncoderInstance> codec;
    /**
     * The minimum guaranteed total number of encoder instances (applications) per VideoSourceConfiguration. The device is able to deliver the Total number of streams
     *
     */
    @XmlElement(name = "Total")
    protected int total;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * If a device limits the number of instances for respective Video Codecs the response contains the information how many streams can be set up at the same time per VideoSource.
     *
     * Gets the value of the codec property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codec property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCodec().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncoderInstance }
     * </p>
     *
     *
     * @return
     *     The value of the codec property.
     */
    public List<EncoderInstance> getCodec() {
        if (codec == null) {
            codec = new ArrayList<>();
        }
        return this.codec;
    }

    /**
     * The minimum guaranteed total number of encoder instances (applications) per VideoSourceConfiguration. The device is able to deliver the Total number of streams
     *
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     *
     */
    public void setTotal(int value) {
        this.total = value;
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
